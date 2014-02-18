// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.util;


// Referenced classes of package com.google.ads.util:
//            l

public class j
{

    static final boolean a;

    private j()
    {
    }

    public static byte[] a(String s)
    {
        return a(s.getBytes(), 0);
    }

    public static byte[] a(byte abyte0[], int i)
    {
        return a(abyte0, 0, abyte0.length, i);
    }

    public static byte[] a(byte abyte0[], int i, int k, int i1)
    {
        l l1 = new l(i1, new byte[(k * 3) / 4]);
        if (!l1.a(abyte0, i, k, true))
        {
            throw new IllegalArgumentException("bad base-64");
        }
        if (l1.b == l1.a.length)
        {
            return l1.a;
        } else
        {
            byte abyte1[] = new byte[l1.b];
            System.arraycopy(l1.a, 0, abyte1, 0, l1.b);
            return abyte1;
        }
    }

    static 
    {
        boolean flag;
        if (!com/google/ads/util/j.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
