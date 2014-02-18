// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package android.support.v4.content:
//            a, b

public class FileProvider extends ContentProvider
{

    private static final String a[] = {
        "_display_name", "_size"
    };
    private static final File b = new File("/");
    private static HashMap c = new HashMap();
    private a d;

    public FileProvider()
    {
    }

    private static int a(String s)
    {
        if ("r".equals(s))
        {
            return 0x10000000;
        }
        if ("w".equals(s) || "wt".equals(s))
        {
            return 0x2c000000;
        }
        if ("wa".equals(s))
        {
            return 0x2a000000;
        }
        if ("rw".equals(s))
        {
            return 0x38000000;
        }
        if ("rwt".equals(s))
        {
            return 0x3c000000;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid mode: ").append(s).toString());
        }
    }

    private static a a(Context context, String s)
    {
        HashMap hashmap = c;
        hashmap;
        JVM INSTR monitorenter ;
        a a1 = (a)c.get(s);
        if (a1 != null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        a a2 = b(context, s);
        a1 = a2;
        c.put(s, a1);
        hashmap;
        JVM INSTR monitorexit ;
        return a1;
        IOException ioexception;
        ioexception;
        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", ioexception);
        Exception exception;
        exception;
        hashmap;
        JVM INSTR monitorexit ;
        throw exception;
        XmlPullParserException xmlpullparserexception;
        xmlpullparserexception;
        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", xmlpullparserexception);
    }

    private static transient File a(File file, String as[])
    {
        int i = as.length;
        int j = 0;
        File file1 = file;
        while (j < i) 
        {
            String s = as[j];
            File file2;
            if (s != null)
            {
                file2 = new File(file1, s);
            } else
            {
                file2 = file1;
            }
            j++;
            file1 = file2;
        }
        return file1;
    }

    private static Object[] a(Object aobj[], int i)
    {
        Object aobj1[] = new Object[i];
        System.arraycopy(((Object) (aobj)), 0, ((Object) (aobj1)), 0, i);
        return aobj1;
    }

    private static String[] a(String as[], int i)
    {
        String as1[] = new String[i];
        System.arraycopy(as, 0, as1, 0, i);
        return as1;
    }

    private static a b(Context context, String s)
    {
        b b1 = new b(s);
        XmlResourceParser xmlresourceparser = context.getPackageManager().resolveContentProvider(s, 128).loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (xmlresourceparser == null)
        {
            throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
        }
        do
        {
            int i = xmlresourceparser.next();
            if (i != 1)
            {
                if (i == 2)
                {
                    String s1 = xmlresourceparser.getName();
                    String s2 = xmlresourceparser.getAttributeValue(null, "name");
                    String s3 = xmlresourceparser.getAttributeValue(null, "path");
                    File file;
                    if ("root-path".equals(s1))
                    {
                        file = a(b, new String[] {
                            s3
                        });
                    } else
                    if ("files-path".equals(s1))
                    {
                        file = a(context.getFilesDir(), new String[] {
                            s3
                        });
                    } else
                    if ("cache-path".equals(s1))
                    {
                        file = a(context.getCacheDir(), new String[] {
                            s3
                        });
                    } else
                    if ("external-path".equals(s1))
                    {
                        file = a(Environment.getExternalStorageDirectory(), new String[] {
                            s3
                        });
                    } else
                    {
                        file = null;
                    }
                    if (file != null)
                    {
                        b1.a(s2, file);
                    }
                }
            } else
            {
                return b1;
            }
        } while (true);
    }

    public void attachInfo(Context context, ProviderInfo providerinfo)
    {
        super.attachInfo(context, providerinfo);
        if (providerinfo.exported)
        {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerinfo.grantUriPermissions)
        {
            throw new SecurityException("Provider must grant uri permissions");
        } else
        {
            d = a(context, providerinfo.authority);
            return;
        }
    }

    public int delete(Uri uri, String s, String as[])
    {
        return !d.a(uri).delete() ? 0 : 1;
    }

    public String getType(Uri uri)
    {
        File file = d.a(uri);
        int i = file.getName().lastIndexOf('.');
        if (i >= 0)
        {
            String s = file.getName().substring(i + 1);
            String s1 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(s);
            if (s1 != null)
            {
                return s1;
            }
        }
        return "application/octet-stream";
    }

    public Uri insert(Uri uri, ContentValues contentvalues)
    {
        throw new UnsupportedOperationException("No external inserts");
    }

    public boolean onCreate()
    {
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String s)
    {
        return ParcelFileDescriptor.open(d.a(uri), a(s));
    }

    public Cursor query(Uri uri, String as[], String s, String as1[], String s1)
    {
        File file = d.a(uri);
        if (as == null)
        {
            as = a;
        }
        String as2[] = new String[as.length];
        Object aobj[] = new Object[as.length];
        int i = as.length;
        int j = 0;
        int k = 0;
        while (j < i) 
        {
            String s2 = as[j];
            String as3[];
            Object aobj1[];
            MatrixCursor matrixcursor;
            int l;
            if ("_display_name".equals(s2))
            {
                as2[k] = "_display_name";
                l = k + 1;
                aobj[k] = file.getName();
            } else
            if ("_size".equals(s2))
            {
                as2[k] = "_size";
                l = k + 1;
                aobj[k] = Long.valueOf(file.length());
            } else
            {
                l = k;
            }
            j++;
            k = l;
        }
        as3 = a(as2, k);
        aobj1 = a(aobj, k);
        matrixcursor = new MatrixCursor(as3, 1);
        matrixcursor.addRow(aobj1);
        return matrixcursor;
    }

    public int update(Uri uri, ContentValues contentvalues, String s, String as[])
    {
        throw new UnsupportedOperationException("No external updates");
    }

}
