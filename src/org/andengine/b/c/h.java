// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.b.c;


public final class h extends Enum
{

    public static final h a;
    public static final h b;
    public static final h c;
    public static final h d;
    private static final h f[];
    private final int e;

    private h(String s, int i, int j)
    {
        super(s, i);
        e = j;
    }

    public static h valueOf(String s)
    {
        return (h)Enum.valueOf(org/andengine/b/c/h, s);
    }

    public static h[] values()
    {
        h ah[] = f;
        int i = ah.length;
        h ah1[] = new h[i];
        System.arraycopy(ah, 0, ah1, 0, i);
        return ah1;
    }

    public int a()
    {
        return e;
    }

    static 
    {
        a = new h("BRIGHT", 0, 26);
        b = new h("SCREEN_BRIGHT", 1, 10);
        c = new h("SCREEN_DIM", 2, 6);
        d = new h("SCREEN_ON", 3, -1);
        h ah[] = new h[4];
        ah[0] = a;
        ah[1] = b;
        ah[2] = c;
        ah[3] = d;
        f = ah;
    }
}
