// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.d.a.b;


// Referenced classes of package org.andengine.d.a.b:
//            a, c

public abstract class b extends a
{

    public b()
    {
    }

    protected c a()
    {
        c c1 = (c)super.c();
        c1.b = this;
        return c1;
    }

    protected void a(Object obj)
    {
        b((c)obj);
    }

    protected void a(c c1)
    {
        c1.c = false;
        c1.c();
    }

    protected void b(Object obj)
    {
        a((c)obj);
    }

    protected void b(c c1)
    {
        c1.a();
        c1.c = true;
    }

    protected Object c()
    {
        return a();
    }

    public volatile void c(Object obj)
    {
        c((c)obj);
    }

    public void c(c c1)
    {
        this;
        JVM INSTR monitorenter ;
        if (c1.b == null)
        {
            throw new IllegalArgumentException("PoolItem not assigned to a pool!");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (!c1.a(this))
        {
            throw new IllegalArgumentException("PoolItem from another pool!");
        }
        if (c1.b())
        {
            throw new IllegalArgumentException("PoolItem already recycled!");
        }
        super.c(c1);
        this;
        JVM INSTR monitorexit ;
    }

    public boolean d(c c1)
    {
        this;
        JVM INSTR monitorenter ;
        b b1 = c1.b;
        boolean flag;
        if (b1 == this)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }
}
