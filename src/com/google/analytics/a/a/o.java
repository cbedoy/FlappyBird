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
import com.google.tagmanager.a.k;
import com.google.tagmanager.a.t;
import com.google.tagmanager.a.v;

// Referenced classes of package com.google.analytics.a.a:
//            p, m

public final class o extends v
    implements p
{

    private int a;
    private int b;
    private int c;

    private o()
    {
        m();
    }

    static o l()
    {
        return n();
    }

    private void m()
    {
    }

    private static o n()
    {
        return new o();
    }

    public o a()
    {
        return n().a(d());
    }

    public o a(int i1)
    {
        a = 1 | a;
        b = i1;
        return this;
    }

    public o a(m m1)
    {
        if (m1 == com.google.analytics.a.a.m.a())
        {
            return this;
        }
        if (m1.d())
        {
            a(m1.e());
        }
        if (m1.f())
        {
            b(m1.g());
        }
        a(r().a(com.google.analytics.a.a.m.b(m1)));
        return this;
    }

    public o a(k k1, com.google.tagmanager.a.o o1)
    {
        m m3 = (m)m.a.b(k1, o1);
        if (m3 != null)
        {
            a(m3);
        }
        return this;
        af af1;
        af1;
        m m2 = (m)af1.a();
        throw af1;
        Exception exception1;
        exception1;
        Exception exception;
        m m1;
        m1 = m2;
        exception = exception1;
_L2:
        if (m1 != null)
        {
            a(m1);
        }
        throw exception;
        exception;
        m1 = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public volatile v a(t t)
    {
        return a((m)t);
    }

    public m b()
    {
        return com.google.analytics.a.a.m.a();
    }

    public o b(int i1)
    {
        a = 2 | a;
        c = i1;
        return this;
    }

    public b b(k k1, com.google.tagmanager.a.o o1)
    {
        return a(k1, o1);
    }

    public m c()
    {
        m m1 = d();
        if (!m1.j())
        {
            throw a(m1);
        } else
        {
            return m1;
        }
    }

    public an c(k k1, com.google.tagmanager.a.o o1)
    {
        return a(k1, o1);
    }

    public Object clone()
    {
        return a();
    }

    public m d()
    {
        int i1 = 1;
        m m1 = new m(this, null);
        int j1 = a;
        if ((j1 & 1) != i1)
        {
            i1 = 0;
        }
        com.google.analytics.a.a.m.a(m1, b);
        if ((j1 & 2) == 2)
        {
            i1 |= 2;
        }
        com.google.analytics.a.a.m.b(m1, c);
        com.google.analytics.a.a.m.c(m1, i1);
        return m1;
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
        return (1 & a) == 1;
    }

    public final boolean j()
    {
        while (!i() || !k()) 
        {
            return false;
        }
        return true;
    }

    public boolean k()
    {
        return (2 & a) == 2;
    }

    public am p()
    {
        return b();
    }
}
