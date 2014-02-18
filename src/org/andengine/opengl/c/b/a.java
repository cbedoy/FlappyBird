// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.c.b;

import org.andengine.opengl.c.c;

public final class a extends Enum
{

    public static final a a;
    public static final a b;
    public static final a c;
    public static final a d;
    private static final a g[];
    private final android.graphics.Bitmap.Config e;
    private final c f;

    private a(String s, int i, android.graphics.Bitmap.Config config, c c1)
    {
        super(s, i);
        e = config;
        f = c1;
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(org/andengine/opengl/c/b/a, s);
    }

    public static a[] values()
    {
        a aa[] = g;
        int i = aa.length;
        a aa1[] = new a[i];
        System.arraycopy(aa, 0, aa1, 0, i);
        return aa1;
    }

    public android.graphics.Bitmap.Config a()
    {
        return e;
    }

    public c b()
    {
        return f;
    }

    static 
    {
        a = new a("RGBA_8888", 0, android.graphics.Bitmap.Config.ARGB_8888, c.d);
        b = new a("RGB_565", 1, android.graphics.Bitmap.Config.RGB_565, c.e);
        c = new a("RGBA_4444", 2, android.graphics.Bitmap.Config.ARGB_4444, c.b);
        d = new a("A_8", 3, android.graphics.Bitmap.Config.ALPHA_8, c.f);
        a aa[] = new a[4];
        aa[0] = a;
        aa[1] = b;
        aa[2] = c;
        aa[3] = d;
        g = aa;
    }
}
