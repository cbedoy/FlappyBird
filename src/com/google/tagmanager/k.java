// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager;


public final class k extends Enum
{

    public static final k a;
    public static final k b;
    public static final k c;
    public static final k d;
    public static final k e;
    public static final k f;
    private static final k g[];

    private k(String s, int i)
    {
        super(s, i);
    }

    public static k valueOf(String s)
    {
        return (k)Enum.valueOf(com/google/tagmanager/k, s);
    }

    public static k[] values()
    {
        return (k[])g.clone();
    }

    static 
    {
        a = new k("VERBOSE", 0);
        b = new k("DEBUG", 1);
        c = new k("INFO", 2);
        d = new k("WARNING", 3);
        e = new k("ERROR", 4);
        f = new k("NONE", 5);
        k ak[] = new k[6];
        ak[0] = a;
        ak[1] = b;
        ak[2] = c;
        ak[3] = d;
        ak[4] = e;
        ak[5] = f;
        g = ak;
    }
}
