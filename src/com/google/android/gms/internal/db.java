// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.util.Log;

// Referenced classes of package com.google.android.gms.internal:
//            do

public final class db
{

    private final String a;

    public db(String s)
    {
        a = (String)com.google.android.gms.internal.do.a(s);
    }

    public void a(String s, String s1)
    {
        if (a(5))
        {
            Log.w(s, s1);
        }
    }

    public void a(String s, String s1, Throwable throwable)
    {
        if (a(6))
        {
            Log.e(s, s1, throwable);
        }
    }

    public boolean a(int i)
    {
        return Log.isLoggable(a, i);
    }

    public void b(String s, String s1)
    {
        if (a(6))
        {
            Log.e(s, s1);
        }
    }
}
