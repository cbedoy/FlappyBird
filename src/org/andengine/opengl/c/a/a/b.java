// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.c.a.a;

import android.content.Context;
import android.content.res.AssetManager;
import org.andengine.opengl.c.a.a.a.a;
import org.andengine.opengl.c.c.c;
import org.andengine.opengl.c.c.d;

// Referenced classes of package org.andengine.opengl.c.a.a:
//            a

public class b
{

    private static String a = "";

    public static c a(org.andengine.opengl.c.a.a.a a1, Context context, String s, int i, int j)
    {
        return a(a1, context.getAssets(), s, i, j);
    }

    public static c a(org.andengine.opengl.c.a.a.a a1, AssetManager assetmanager, String s, int i, int j)
    {
        return a(a1, ((org.andengine.opengl.c.a.a.a.b) (org.andengine.opengl.c.a.a.a.a.a(assetmanager, (new StringBuilder(String.valueOf(a))).append(s).toString()))), i, j);
    }

    public static c a(org.andengine.opengl.c.a.a.a a1, org.andengine.opengl.c.a.a.a.b b1, int i, int j)
    {
        return d.a(a1, b1, i, j);
    }

    public static void a()
    {
        a("");
    }

    public static void a(String s)
    {
        if (s.endsWith("/") || s.length() == 0)
        {
            a = s;
            return;
        } else
        {
            throw new IllegalArgumentException("pAssetBasePath must end with '/' or be lenght zero.");
        }
    }

}
