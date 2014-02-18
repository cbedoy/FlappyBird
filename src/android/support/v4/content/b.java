// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

// Referenced classes of package android.support.v4.content:
//            a

class b
    implements a
{

    private final String a;
    private final HashMap b = new HashMap();

    public b(String s)
    {
        a = s;
    }

    public File a(Uri uri)
    {
        String s = uri.getEncodedPath();
        int i = s.indexOf('/', 1);
        String s1 = Uri.decode(s.substring(1, i));
        String s2 = Uri.decode(s.substring(i + 1));
        File file = (File)b.get(s1);
        if (file == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Unable to find configured root for ").append(uri).toString());
        }
        File file1 = new File(file, s2);
        File file2;
        try
        {
            file2 = file1.getCanonicalFile();
        }
        catch (IOException ioexception)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Failed to resolve canonical path for ").append(file1).toString());
        }
        if (!file2.getPath().startsWith(file.getPath()))
        {
            throw new SecurityException("Resolved path jumped beyond configured root");
        } else
        {
            return file2;
        }
    }

    public void a(String s, File file)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Name must not be empty");
        }
        File file1;
        try
        {
            file1 = file.getCanonicalFile();
        }
        catch (IOException ioexception)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Failed to resolve canonical path for ").append(file).toString(), ioexception);
        }
        b.put(s, file1);
    }
}
