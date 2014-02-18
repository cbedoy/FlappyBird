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
import com.google.tagmanager.a.o;
import com.google.tagmanager.a.t;
import com.google.tagmanager.a.v;

// Referenced classes of package com.google.analytics.a.a:
//            h, f, c

public final class e extends v
    implements com.google.analytics.a.a.h
{

    private int a;
    private f b;
    private int c;
    private int d;

    private e()
    {
        b = f.a;
        k();
    }

    static e i()
    {
        return l();
    }

    private void k()
    {
    }

    private static e l()
    {
        return new e();
    }

    public e a()
    {
        return l().a(d());
    }

    public e a(int i1)
    {
        a = 2 | a;
        c = i1;
        return this;
    }

    public e a(c c1)
    {
        if (c1 == com.google.analytics.a.a.c.a())
        {
            return this;
        }
        if (c1.d())
        {
            a(c1.e());
        }
        if (c1.f())
        {
            a(c1.g());
        }
        if (c1.h())
        {
            b(c1.i());
        }
        a(r().a(com.google.analytics.a.a.c.b(c1)));
        return this;
    }

    public e a(f f1)
    {
        if (f1 == null)
        {
            throw new NullPointerException();
        } else
        {
            a = 1 | a;
            b = f1;
            return this;
        }
    }

    public e a(k k1, o o)
    {
        c c3 = (c)c.a.b(k1, o);
        if (c3 != null)
        {
            a(c3);
        }
        return this;
        af af1;
        af1;
        c c2 = (c)af1.a();
        throw af1;
        Exception exception1;
        exception1;
        Exception exception;
        c c1;
        c1 = c2;
        exception = exception1;
_L2:
        if (c1 != null)
        {
            a(c1);
        }
        throw exception;
        exception;
        c1 = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public volatile v a(t t)
    {
        return a((c)t);
    }

    public c b()
    {
        return com.google.analytics.a.a.c.a();
    }

    public e b(int i1)
    {
        a = 4 | a;
        d = i1;
        return this;
    }

    public b b(k k1, o o)
    {
        return a(k1, o);
    }

    public c c()
    {
        c c1 = d();
        if (!c1.j())
        {
            throw a(c1);
        } else
        {
            return c1;
        }
    }

    public an c(k k1, o o)
    {
        return a(k1, o);
    }

    public Object clone()
    {
        return a();
    }

    public c d()
    {
        int i1 = 1;
        c c1 = new c(this, null);
        int j1 = a;
        if ((j1 & 1) != i1)
        {
            i1 = 0;
        }
        com.google.analytics.a.a.c.a(c1, b);
        if ((j1 & 2) == 2)
        {
            i1 |= 2;
        }
        com.google.analytics.a.a.c.a(c1, c);
        if ((j1 & 4) == 4)
        {
            i1 |= 4;
        }
        com.google.analytics.a.a.c.b(c1, d);
        com.google.analytics.a.a.c.c(c1, i1);
        return c1;
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

    public final boolean j()
    {
        return true;
    }

    public am p()
    {
        return b();
    }
}
