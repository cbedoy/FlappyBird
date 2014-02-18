// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.util;

import android.util.Log;

// Referenced classes of package com.google.ads.util:
//            i, h

public final class g
{

    public static i a = null;
    private static int b = 5;

    private static void a(h h1, String s)
    {
        a(h1, s, null);
    }

    private static void a(h h1, String s, Throwable throwable)
    {
        if (a != null)
        {
            a.a(h1, s, throwable);
        }
    }

    public static void a(String s)
    {
        if (a("Ads", 3))
        {
            Log.d("Ads", s);
        }
        a(h.b, s);
    }

    public static void a(String s, Throwable throwable)
    {
        if (a("Ads", 3))
        {
            Log.d("Ads", s, throwable);
        }
        a(h.b, s, throwable);
    }

    private static boolean a(int j)
    {
        return j >= b;
    }

    public static boolean a(String s, int j)
    {
        return a(j) || Log.isLoggable(s, j);
    }

    public static void b(String s)
    {
        if (a("Ads", 6))
        {
            Log.e("Ads", s);
        }
        a(h.e, s);
    }

    public static void b(String s, Throwable throwable)
    {
        if (a("Ads", 6))
        {
            Log.e("Ads", s);
            Log.i("Ads", "The following was caught and handled:", throwable);
        }
        a(h.e, s, throwable);
    }

    public static void c(String s)
    {
        if (a("Ads", 4))
        {
            Log.i("Ads", s);
        }
        a(h.c, s);
    }

    public static void c(String s, Throwable throwable)
    {
        if (a("Ads", 4))
        {
            Log.i("Ads", s, throwable);
        }
        a(h.c, s, throwable);
    }

    public static void d(String s)
    {
        if (a("Ads", 2))
        {
            Log.v("Ads", s);
        }
        a(h.a, s);
    }

    public static void d(String s, Throwable throwable)
    {
        if (a("Ads", 5))
        {
            Log.w("Ads", s);
            Log.i("Ads", "The following was caught and handled:", throwable);
        }
        a(h.d, s, throwable);
    }

    public static void e(String s)
    {
        if (a("Ads", 5))
        {
            Log.w("Ads", s);
        }
        a(h.d, s);
    }

}
