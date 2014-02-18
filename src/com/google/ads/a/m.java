// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.a;

import com.google.ads.util.g;

public final class m extends Exception
{

    public final boolean a;

    public m(String s, boolean flag)
    {
        super(s);
        a = flag;
    }

    public m(String s, boolean flag, Throwable throwable)
    {
        super(s, throwable);
        a = flag;
    }

    public void a(String s)
    {
        g.b(c(s));
        g.a(null, this);
    }

    public void b(String s)
    {
        String s1 = c(s);
        if (!a)
        {
            this = null;
        }
        throw new RuntimeException(s1, this);
    }

    public String c(String s)
    {
        if (a)
        {
            s = (new StringBuilder()).append(s).append(": ").append(getMessage()).toString();
        }
        return s;
    }
}
