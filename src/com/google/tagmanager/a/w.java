// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;


// Referenced classes of package com.google.tagmanager.a:
//            v, y, q, x, 
//            b

public abstract class w extends v
    implements y
{

    private q a;
    private boolean b;

    protected w()
    {
        a = q.b();
    }

    static q a(w w1)
    {
        return w1.b();
    }

    private void a()
    {
        if (!b)
        {
            a = a.d();
            b = true;
        }
    }

    private q b()
    {
        a.c();
        b = false;
        return a;
    }

    protected final void a(x x1)
    {
        a();
        a.a(x.a(x1));
    }

    public Object clone()
    {
        return o();
    }

    public v f()
    {
        return o();
    }

    public b g()
    {
        return o();
    }

    public w o()
    {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    protected boolean s()
    {
        return a.e();
    }
}
