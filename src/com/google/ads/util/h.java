// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.util;


public final class h extends Enum
{

    public static final h a;
    public static final h b;
    public static final h c;
    public static final h d;
    public static final h e;
    private static final h g[];
    public final int f;

    private h(String s, int i, int j)
    {
        super(s, i);
        f = j;
    }

    public static h valueOf(String s)
    {
        return (h)Enum.valueOf(com/google/ads/util/h, s);
    }

    public static h[] values()
    {
        return (h[])g.clone();
    }

    static 
    {
        a = new h("VERBOSE", 0, 2);
        b = new h("DEBUG", 1, 3);
        c = new h("INFO", 2, 4);
        d = new h("WARN", 3, 5);
        e = new h("ERROR", 4, 6);
        h ah[] = new h[5];
        ah[0] = a;
        ah[1] = b;
        ah[2] = c;
        ah[3] = d;
        ah[4] = e;
        g = ah;
    }
}
