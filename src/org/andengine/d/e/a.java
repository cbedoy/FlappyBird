// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.d.e;

import android.util.Log;

// Referenced classes of package org.andengine.d.e:
//            b

public class a
{

    private static String a = "AndEngine";
    private static String b = "";
    private static b c;

    public static void a(String s)
    {
        a(a, s, null);
    }

    public static void a(String s, String s1, Throwable throwable)
    {
label0:
        {
            if (c.a(b.f))
            {
                if (throwable != null)
                {
                    break label0;
                }
                Log.v(s, s1);
            }
            return;
        }
        Log.v(s, s1, throwable);
    }

    public static void a(String s, Throwable throwable)
    {
        b(a, s, throwable);
    }

    public static void a(Throwable throwable)
    {
        b(a, throwable);
    }

    public static void b(String s)
    {
        b(a, s, null);
    }

    public static void b(String s, String s1, Throwable throwable)
    {
label0:
        {
            if (c.a(b.e))
            {
                if (throwable != null)
                {
                    break label0;
                }
                Log.d(s, s1);
            }
            return;
        }
        Log.d(s, s1, throwable);
    }

    public static void b(String s, Throwable throwable)
    {
        d(a, s, throwable);
    }

    public static void c(String s)
    {
        c(a, s, null);
    }

    public static void c(String s, String s1, Throwable throwable)
    {
label0:
        {
            if (c.a(b.c))
            {
                if (throwable != null)
                {
                    break label0;
                }
                Log.w(s, s1);
            }
            return;
        }
        Log.w(s, s1, throwable);
    }

    public static void d(String s)
    {
        d(a, s, null);
    }

    public static void d(String s, String s1, Throwable throwable)
    {
label0:
        {
            if (c.a(b.b))
            {
                if (throwable != null)
                {
                    break label0;
                }
                Log.e(s, s1);
            }
            return;
        }
        Log.e(s, s1, throwable);
    }

    static 
    {
        c = b.f;
    }
}
