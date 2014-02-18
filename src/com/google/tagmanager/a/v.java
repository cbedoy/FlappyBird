// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;


// Referenced classes of package com.google.tagmanager.a:
//            b, h, t, am

public abstract class v extends b
{

    private h a;

    protected v()
    {
        a = h.a;
    }

    public final v a(h h1)
    {
        a = h1;
        return this;
    }

    public abstract v a(t t);

    public Object clone()
    {
        return f();
    }

    public abstract t e();

    public v f()
    {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    public b g()
    {
        return f();
    }

    public am p()
    {
        return e();
    }

    public final h r()
    {
        return a;
    }
}
