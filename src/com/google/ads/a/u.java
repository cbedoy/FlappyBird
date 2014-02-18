// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.a;


public final class u extends Enum
{

    public static final u a;
    public static final u b;
    public static final u c;
    public static final u d;
    private static final u f[];
    public String e;

    private u(String s, int i, String s1)
    {
        super(s, i);
        e = s1;
    }

    public static u valueOf(String s)
    {
        return (u)Enum.valueOf(com/google/ads/a/u, s);
    }

    public static u[] values()
    {
        return (u[])f.clone();
    }

    static 
    {
        a = new u("ONLINE_USING_BUFFERED_ADS", 0, "online_buffered");
        b = new u("ONLINE_SERVER_REQUEST", 1, "online_request");
        c = new u("OFFLINE_USING_BUFFERED_ADS", 2, "offline_buffered");
        d = new u("OFFLINE_EMPTY", 3, "offline_empty");
        u au[] = new u[4];
        au[0] = a;
        au[1] = b;
        au[2] = c;
        au[3] = d;
        f = au;
    }
}
