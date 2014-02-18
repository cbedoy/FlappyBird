// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.tagmanager.a:
//            ar, aj, h, as

class au
    implements Iterator
{

    private final Deque a;
    private aj b;

    private au(h h)
    {
        a = new ArrayDeque(ar.b().length);
        b = a(h);
    }

    au(h h, as as)
    {
        this(h);
    }

    private aj a(h h)
    {
        h h1;
        ar ar1;
        for (h1 = h; h1 instanceof ar; h1 = ar.a(ar1))
        {
            ar1 = (ar)h1;
            a.push(ar1);
        }

        return (aj)h1;
    }

    private aj b()
    {
        aj aj1;
        do
        {
            if (a.isEmpty())
            {
                return null;
            }
            aj1 = a(ar.b((ar)a.pop()));
        } while (aj1.d());
        return aj1;
    }

    public aj a()
    {
        if (b == null)
        {
            throw new NoSuchElementException();
        } else
        {
            aj aj1 = b;
            b = b();
            return aj1;
        }
    }

    public boolean hasNext()
    {
        return b != null;
    }

    public Object next()
    {
        return a();
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
