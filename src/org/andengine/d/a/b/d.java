// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.d.a.b;

import org.andengine.b.b.c;
import org.andengine.d.a.c.a.a;

// Referenced classes of package org.andengine.d.a.b:
//            e, c, b

public abstract class d
    implements c
{

    private final b a = new e(this);
    private final org.andengine.d.a.c.a b = new a(new org.andengine.d.a.a.a());

    public d()
    {
    }

    protected abstract void a(org.andengine.d.a.b.c c1);

    public void a_(float f)
    {
        org.andengine.d.a.c.a a1 = b;
        b b1 = a;
        do
        {
            org.andengine.d.a.b.c c1 = (org.andengine.d.a.b.c)a1.();
            if (c1 == null)
            {
                return;
            }
            a(c1);
            b1.c(c1);
        } while (true);
    }

    public void b(org.andengine.d.a.b.c c1)
    {
        if (c1 == null)
        {
            throw new IllegalArgumentException("PoolItem already recycled!");
        }
        if (!a.d(c1))
        {
            throw new IllegalArgumentException("PoolItem from another pool!");
        } else
        {
            b.(c1);
            return;
        }
    }

    protected abstract org.andengine.d.a.b.c c();

    public org.andengine.d.a.b.c d()
    {
        return (org.andengine.d.a.b.c)a.d();
    }
}
