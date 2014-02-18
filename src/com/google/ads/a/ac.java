// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.a;

import android.content.Context;
import com.google.ads.g;

public class ac
{

    public static final ac a = new ac(null, true);
    private g b;
    private boolean c;
    private final boolean d;

    private ac(g g1, boolean flag)
    {
        b = g1;
        d = flag;
    }

    public static ac a(g g1)
    {
        return a(g1, null);
    }

    public static ac a(g g1, Context context)
    {
        return new ac(g.a(g1, context), false);
    }

    public void a(boolean flag)
    {
        c = flag;
    }

    public boolean a()
    {
        return d;
    }

    public void b(g g1)
    {
        if (!d)
        {
            b = g1;
        }
    }

    public boolean b()
    {
        return c;
    }

    public g c()
    {
        return b;
    }

}
