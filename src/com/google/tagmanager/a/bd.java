// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.tagmanager.a:
//            ax, ay

class bd
    implements Iterator
{

    final ax a;
    private int b;
    private boolean c;
    private Iterator d;

    private bd(ax ax1)
    {
        a = ax1;
        super();
        b = -1;
    }

    bd(ax ax1, ay ay)
    {
        this(ax1);
    }

    private Iterator b()
    {
        if (d == null)
        {
            d = ax.c(a).entrySet().iterator();
        }
        return d;
    }

    public java.util.Map.Entry a()
    {
        c = true;
        int i = 1 + b;
        b = i;
        if (i < ax.b(a).size())
        {
            return (java.util.Map.Entry)ax.b(a).get(b);
        } else
        {
            return (java.util.Map.Entry)b().next();
        }
    }

    public boolean hasNext()
    {
        return 1 + b < ax.b(a).size() || b().hasNext();
    }

    public Object next()
    {
        return a();
    }

    public void remove()
    {
        if (!c)
        {
            throw new IllegalStateException("remove() was called before next()");
        }
        c = false;
        ax.a(a);
        if (b < ax.b(a).size())
        {
            ax ax1 = a;
            int i = b;
            b = i - 1;
            ax.a(ax1, i);
            return;
        } else
        {
            b().remove();
            return;
        }
    }
}
