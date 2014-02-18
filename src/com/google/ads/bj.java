// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;


public final class bj extends Enum
{

    public static final bj a;
    public static final bj b;
    public static final bj c;
    public static final bj d;
    public static final bj e;
    public static final bj f;
    private static final bj g[];

    private bj(String s, int i)
    {
        super(s, i);
    }

    public static bj valueOf(String s)
    {
        return (bj)Enum.valueOf(com/google/ads/bj, s);
    }

    public static bj[] values()
    {
        return (bj[])g.clone();
    }

    static 
    {
        a = new bj("AD", 0);
        b = new bj("NO_FILL", 1);
        c = new bj("ERROR", 2);
        d = new bj("TIMEOUT", 3);
        e = new bj("NOT_FOUND", 4);
        f = new bj("EXCEPTION", 5);
        bj abj[] = new bj[6];
        abj[0] = a;
        abj[1] = b;
        abj[2] = c;
        abj[3] = d;
        abj[4] = e;
        abj[5] = f;
        g = abj;
    }
}
