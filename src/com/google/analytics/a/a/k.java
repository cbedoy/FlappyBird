// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.a.a;

import com.google.tagmanager.a.af;
import com.google.tagmanager.a.am;
import com.google.tagmanager.a.an;
import com.google.tagmanager.a.aq;
import com.google.tagmanager.a.b;
import com.google.tagmanager.a.h;
import com.google.tagmanager.a.o;
import com.google.tagmanager.a.t;
import com.google.tagmanager.a.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.analytics.a.a:
//            l, i

public final class k extends v
    implements l
{

    private int a;
    private List b;
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    private k()
    {
        b = Collections.emptyList();
        l();
    }

    static k k()
    {
        return m();
    }

    private void l()
    {
    }

    private static k m()
    {
        return new k();
    }

    private void n()
    {
        if ((1 & a) != 1)
        {
            b = new ArrayList(b);
            a = 1 | a;
        }
    }

    public k a()
    {
        return m().a(d());
    }

    public k a(int i1)
    {
        a = 2 | a;
        c = i1;
        return this;
    }

    public k a(i i1)
    {
        if (i1 == com.google.analytics.a.a.i.a())
        {
            return this;
        }
        if (!com.google.analytics.a.a.i.b(i1).isEmpty())
        {
            if (b.isEmpty())
            {
                b = com.google.analytics.a.a.i.b(i1);
                a = -2 & a;
            } else
            {
                n();
                b.addAll(com.google.analytics.a.a.i.b(i1));
            }
        }
        if (i1.f())
        {
            a(i1.g());
        }
        if (i1.h())
        {
            b(i1.i());
        }
        if (i1.k())
        {
            a(i1.l());
        }
        if (i1.m())
        {
            b(i1.q());
        }
        a(r().a(com.google.analytics.a.a.i.c(i1)));
        return this;
    }

    public k a(com.google.tagmanager.a.k k1, o o)
    {
        i l1 = (i)i.a.b(k1, o);
        if (l1 != null)
        {
            a(l1);
        }
        return this;
        af af1;
        af1;
        i j1 = (i)af1.a();
        throw af1;
        Exception exception1;
        exception1;
        Exception exception;
        i i1;
        i1 = j1;
        exception = exception1;
_L2:
        if (i1 != null)
        {
            a(i1);
        }
        throw exception;
        exception;
        i1 = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public k a(boolean flag)
    {
        a = 8 | a;
        e = flag;
        return this;
    }

    public volatile v a(t t)
    {
        return a((i)t);
    }

    public i b()
    {
        return com.google.analytics.a.a.i.a();
    }

    public k b(int i1)
    {
        a = 4 | a;
        d = i1;
        return this;
    }

    public k b(boolean flag)
    {
        a = 0x10 | a;
        f = flag;
        return this;
    }

    public b b(com.google.tagmanager.a.k k1, o o)
    {
        return a(k1, o);
    }

    public i c()
    {
        i i1 = d();
        if (!i1.j())
        {
            throw a(i1);
        } else
        {
            return i1;
        }
    }

    public an c(com.google.tagmanager.a.k k1, o o)
    {
        return a(k1, o);
    }

    public Object clone()
    {
        return a();
    }

    public i d()
    {
        int i1 = 1;
        i j1 = new i(this, null);
        int k1 = a;
        if ((1 & a) == i1)
        {
            b = Collections.unmodifiableList(b);
            a = -2 & a;
        }
        com.google.analytics.a.a.i.a(j1, b);
        if ((k1 & 2) != 2)
        {
            i1 = 0;
        }
        com.google.analytics.a.a.i.a(j1, c);
        if ((k1 & 4) == 4)
        {
            i1 |= 2;
        }
        com.google.analytics.a.a.i.b(j1, d);
        if ((k1 & 8) == 8)
        {
            i1 |= 4;
        }
        com.google.analytics.a.a.i.a(j1, e);
        if ((k1 & 0x10) == 16)
        {
            i1 |= 8;
        }
        com.google.analytics.a.a.i.b(j1, f);
        com.google.analytics.a.a.i.c(j1, i1);
        return j1;
    }

    public t e()
    {
        return b();
    }

    public v f()
    {
        return a();
    }

    public b g()
    {
        return a();
    }

    public am h()
    {
        return c();
    }

    public boolean i()
    {
        return (2 & a) == 2;
    }

    public final boolean j()
    {
        return i();
    }

    public am p()
    {
        return b();
    }
}
