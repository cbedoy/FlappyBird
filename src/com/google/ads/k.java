// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import com.google.ads.util.e;
import java.util.HashMap;
import java.util.List;

public class k
{

    private final String a;
    private final String b;
    private final List c;
    private final List d;
    private final HashMap e;

    public k(String s, String s1, List list, List list1, HashMap hashmap)
    {
        com.google.ads.util.e.a(s1);
        if (s != null)
        {
            com.google.ads.util.e.a(s);
        }
        a = s;
        b = s1;
        c = list;
        e = hashmap;
        d = list1;
    }

    public String a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public List c()
    {
        return c;
    }

    public List d()
    {
        return d;
    }

    public HashMap e()
    {
        return e;
    }
}
