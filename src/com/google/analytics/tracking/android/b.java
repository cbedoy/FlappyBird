// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;


// Referenced classes of package com.google.analytics.tracking.android:
//            a, c

public class b
{

    private static a a;

    private static c a()
    {
        if (a == null)
        {
            a = com.google.analytics.tracking.android.a.a();
        }
        if (a != null)
        {
            return a.b();
        } else
        {
            return null;
        }
    }

    public static void a(String s)
    {
        c c1 = a();
        if (c1 != null)
        {
            c1.a(s);
        }
    }
}
