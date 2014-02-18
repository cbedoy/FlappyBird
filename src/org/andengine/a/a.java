// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.a;


// Referenced classes of package org.andengine.a:
//            c, d

public abstract class a
    implements c
{

    protected float a;
    protected float b;
    private final d c;
    private boolean d;

    public a(d d1)
    {
        a = 1.0F;
        b = 1.0F;
        c = d1;
    }

    protected d a()
    {
        g();
        return c;
    }

    protected float b()
    {
        g();
        return c.a();
    }

    protected abstract void c();

    public void d()
    {
        g();
    }

    public void e()
    {
        g();
    }

    public void f()
    {
        g();
        d = true;
    }

    protected void g()
    {
        if (d)
        {
            c();
        }
    }
}
