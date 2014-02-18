// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.c;


public final class c extends Enum
{

    public static final c a;
    public static final c b;
    public static final c c;
    public static final c d;
    public static final c e;
    public static final c f;
    public static final c g;
    public static final c h;
    private static final c m[];
    private final int i;
    private final int j;
    private final int k;
    private final int l;

    private c(String s, int i1, int j1, int k1, int l1, int i2)
    {
        super(s, i1);
        i = j1;
        j = k1;
        k = l1;
        l = i2;
    }

    public static c valueOf(String s)
    {
        return (c)Enum.valueOf(org/andengine/opengl/c/c, s);
    }

    public static c[] values()
    {
        c ac[] = m;
        int i1 = ac.length;
        c ac1[] = new c[i1];
        System.arraycopy(ac, 0, ac1, 0, i1);
        return ac1;
    }

    public int a()
    {
        return i;
    }

    public int b()
    {
        return j;
    }

    public int c()
    {
        return k;
    }

    static 
    {
        a = new c("UNDEFINED", 0, -1, -1, -1, -1);
        b = new c("RGBA_4444", 1, 6408, 6408, 32819, 16);
        c = new c("RGBA_5551", 2, 6407, 6408, 32820, 16);
        d = new c("RGBA_8888", 3, 6408, 6408, 5121, 32);
        e = new c("RGB_565", 4, 6407, 6407, 33635, 16);
        f = new c("A_8", 5, 6406, 6406, 5121, 8);
        g = new c("I_8", 6, 6409, 6409, 5121, 8);
        h = new c("AI_88", 7, 6410, 6410, 5121, 16);
        c ac[] = new c[8];
        ac[0] = a;
        ac[1] = b;
        ac[2] = c;
        ac[3] = d;
        ac[4] = e;
        ac[5] = f;
        ac[6] = g;
        ac[7] = h;
        m = ac;
    }
}
