// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.c.a.a.a;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import org.andengine.d.d;

// Referenced classes of package org.andengine.opengl.c.a.a.a:
//            b

public class a extends org.andengine.opengl.c.a.b.a
    implements b
{

    private final AssetManager e;
    private final String f;

    a(AssetManager assetmanager, String s, int i, int j, int k, int l)
    {
        super(i, j, k, l);
        e = assetmanager;
        f = s;
    }

    public static a a(AssetManager assetmanager, String s)
    {
        return a(assetmanager, s, 0, 0);
    }

    public static a a(AssetManager assetmanager, String s, int i, int j)
    {
        java.io.InputStream inputstream;
        android.graphics.BitmapFactory.Options options;
        inputstream = null;
        options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        inputstream = assetmanager.open(s);
        BitmapFactory.decodeStream(inputstream, null, options);
        d.a(inputstream);
_L2:
        return new a(assetmanager, s, i, j, options.outWidth, options.outHeight);
        IOException ioexception;
        ioexception;
        org.andengine.d.e.a.b((new StringBuilder("Failed loading Bitmap in AssetBitmapTextureAtlasSource. AssetPath: ")).append(s).toString(), ioexception);
        d.a(inputstream);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        d.a(inputstream);
        throw exception;
    }

    public Bitmap a(android.graphics.Bitmap.Config config)
    {
        android.graphics.BitmapFactory.Options options;
        java.io.InputStream inputstream1;
        options = new android.graphics.BitmapFactory.Options();
        options.inPreferredConfig = config;
        inputstream1 = e.open(f);
        java.io.InputStream inputstream = inputstream1;
        Bitmap bitmap = BitmapFactory.decodeStream(inputstream, null, options);
        d.a(inputstream);
        return bitmap;
        IOException ioexception;
        ioexception;
        inputstream = null;
_L4:
        org.andengine.d.e.a.b((new StringBuilder("Failed loading Bitmap in ")).append(getClass().getSimpleName()).append(". AssetPath: ").append(f).toString(), ioexception);
        d.a(inputstream);
        return null;
        Exception exception;
        exception;
        Exception exception1;
        inputstream = null;
        exception1 = exception;
_L2:
        d.a(inputstream);
        throw exception1;
        exception1;
        if (true) goto _L2; else goto _L1
_L1:
        ioexception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String toString()
    {
        return (new StringBuilder(String.valueOf(getClass().getSimpleName()))).append("(").append(f).append(")").toString();
    }
}
