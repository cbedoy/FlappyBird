// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import com.google.ads.util.e;
import java.util.List;

public class bh
{

    private final String a;
    private final String b;
    private final String c;
    private final List d;
    private final List e;
    private final List f;

    public bh(String s, String s1, String s2, List list, List list1, List list2)
    {
        com.google.ads.util.e.a(s1);
        if (s != null)
        {
            com.google.ads.util.e.a(s);
        }
        com.google.ads.util.e.a(s2);
        a = s;
        b = s1;
        c = s2;
        d = list;
        e = list1;
        f = list2;
    }

    public String a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public List d()
    {
        return d;
    }
}
