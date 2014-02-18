// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.util;

import android.os.Build;

class m
{

    static final m d = new m();
    static final m e = new m("unknown", "generic", "generic");
    static final m f = new m("unknown", "generic_x86", "Android");
    public final String a;
    public final String b;
    public final String c;

    m()
    {
        a = Build.BOARD;
        b = Build.DEVICE;
        c = Build.BRAND;
    }

    m(String s, String s1, String s2)
    {
        a = s;
        b = s1;
        c = s2;
    }

    private static boolean a(String s, String s1)
    {
        if (s != null)
        {
            return s.equals(s1);
        }
        return s == s1;
    }

    public boolean equals(Object obj)
    {
        m m1;
        if (obj instanceof m)
        {
            if (a(a, (m1 = (m)obj).a) && a(b, m1.b) && a(c, m1.c))
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        String s = a;
        int i = 0;
        if (s != null)
        {
            i = 0 + a.hashCode();
        }
        if (b != null)
        {
            i += b.hashCode();
        }
        if (c != null)
        {
            i += c.hashCode();
        }
        return i;
    }

}
