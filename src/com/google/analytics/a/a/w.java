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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.analytics.a.a:
//            x, u

public final class w extends v
    implements x
{

    private int a;
    private List b;
    private List c;
    private List d;
    private List e;
    private List f;
    private List g;
    private List h;
    private List i;
    private List j;
    private List k;

    private w()
    {
        b = Collections.emptyList();
        c = Collections.emptyList();
        d = Collections.emptyList();
        e = Collections.emptyList();
        f = Collections.emptyList();
        g = Collections.emptyList();
        h = Collections.emptyList();
        i = Collections.emptyList();
        j = Collections.emptyList();
        k = Collections.emptyList();
        k();
    }

    static w i()
    {
        return l();
    }

    private void k()
    {
    }

    private static w l()
    {
        return new w();
    }

    private void m()
    {
        if ((1 & a) != 1)
        {
            b = new ArrayList(b);
            a = 1 | a;
        }
    }

    private void n()
    {
        if ((2 & a) != 2)
        {
            c = new ArrayList(c);
            a = 2 | a;
        }
    }

    private void o()
    {
        if ((4 & a) != 4)
        {
            d = new ArrayList(d);
            a = 4 | a;
        }
    }

    private void q()
    {
        if ((8 & a) != 8)
        {
            e = new ArrayList(e);
            a = 8 | a;
        }
    }

    private void s()
    {
        if ((0x10 & a) != 16)
        {
            f = new ArrayList(f);
            a = 0x10 | a;
        }
    }

    private void t()
    {
        if ((0x20 & a) != 32)
        {
            g = new ArrayList(g);
            a = 0x20 | a;
        }
    }

    private void u()
    {
        if ((0x40 & a) != 64)
        {
            h = new ArrayList(h);
            a = 0x40 | a;
        }
    }

    private void v()
    {
        if ((0x80 & a) != 128)
        {
            i = new ArrayList(i);
            a = 0x80 | a;
        }
    }

    private void w()
    {
        if ((0x100 & a) != 256)
        {
            j = new ArrayList(j);
            a = 0x100 | a;
        }
    }

    private void x()
    {
        if ((0x200 & a) != 512)
        {
            k = new ArrayList(k);
            a = 0x200 | a;
        }
    }

    public w a()
    {
        return l().a(d());
    }

    public w a(u u1)
    {
        if (u1 == com.google.analytics.a.a.u.a())
        {
            return this;
        }
        if (!com.google.analytics.a.a.u.b(u1).isEmpty())
        {
            if (b.isEmpty())
            {
                b = com.google.analytics.a.a.u.b(u1);
                a = -2 & a;
            } else
            {
                m();
                b.addAll(com.google.analytics.a.a.u.b(u1));
            }
        }
        if (!com.google.analytics.a.a.u.c(u1).isEmpty())
        {
            if (c.isEmpty())
            {
                c = com.google.analytics.a.a.u.c(u1);
                a = -3 & a;
            } else
            {
                n();
                c.addAll(com.google.analytics.a.a.u.c(u1));
            }
        }
        if (!com.google.analytics.a.a.u.d(u1).isEmpty())
        {
            if (d.isEmpty())
            {
                d = com.google.analytics.a.a.u.d(u1);
                a = -5 & a;
            } else
            {
                o();
                d.addAll(com.google.analytics.a.a.u.d(u1));
            }
        }
        if (!com.google.analytics.a.a.u.e(u1).isEmpty())
        {
            if (e.isEmpty())
            {
                e = com.google.analytics.a.a.u.e(u1);
                a = -9 & a;
            } else
            {
                q();
                e.addAll(com.google.analytics.a.a.u.e(u1));
            }
        }
        if (!com.google.analytics.a.a.u.f(u1).isEmpty())
        {
            if (f.isEmpty())
            {
                f = com.google.analytics.a.a.u.f(u1);
                a = 0xffffffef & a;
            } else
            {
                s();
                f.addAll(com.google.analytics.a.a.u.f(u1));
            }
        }
        if (!com.google.analytics.a.a.u.g(u1).isEmpty())
        {
            if (g.isEmpty())
            {
                g = com.google.analytics.a.a.u.g(u1);
                a = 0xffffffdf & a;
            } else
            {
                t();
                g.addAll(com.google.analytics.a.a.u.g(u1));
            }
        }
        if (!com.google.analytics.a.a.u.h(u1).isEmpty())
        {
            if (h.isEmpty())
            {
                h = com.google.analytics.a.a.u.h(u1);
                a = 0xffffffbf & a;
            } else
            {
                u();
                h.addAll(com.google.analytics.a.a.u.h(u1));
            }
        }
        if (!com.google.analytics.a.a.u.i(u1).isEmpty())
        {
            if (i.isEmpty())
            {
                i = com.google.analytics.a.a.u.i(u1);
                a = 0xffffff7f & a;
            } else
            {
                v();
                i.addAll(com.google.analytics.a.a.u.i(u1));
            }
        }
        if (!com.google.analytics.a.a.u.j(u1).isEmpty())
        {
            if (j.isEmpty())
            {
                j = com.google.analytics.a.a.u.j(u1);
                a = 0xfffffeff & a;
            } else
            {
                w();
                j.addAll(com.google.analytics.a.a.u.j(u1));
            }
        }
        if (!com.google.analytics.a.a.u.k(u1).isEmpty())
        {
            if (k.isEmpty())
            {
                k = com.google.analytics.a.a.u.k(u1);
                a = 0xfffffdff & a;
            } else
            {
                x();
                k.addAll(com.google.analytics.a.a.u.k(u1));
            }
        }
        a(r().a(com.google.analytics.a.a.u.l(u1)));
        return this;
    }

    public w a(k k1, o o1)
    {
        u u3 = (u)u.a.b(k1, o1);
        if (u3 != null)
        {
            a(u3);
        }
        return this;
        af af1;
        af1;
        u u2 = (u)af1.a();
        throw af1;
        Exception exception1;
        exception1;
        Exception exception;
        u u1;
        u1 = u2;
        exception = exception1;
_L2:
        if (u1 != null)
        {
            a(u1);
        }
        throw exception;
        exception;
        u1 = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public volatile v a(t t1)
    {
        return a((u)t1);
    }

    public u b()
    {
        return com.google.analytics.a.a.u.a();
    }

    public b b(k k1, o o1)
    {
        return a(k1, o1);
    }

    public u c()
    {
        u u1 = d();
        if (!u1.j())
        {
            throw a(u1);
        } else
        {
            return u1;
        }
    }

    public an c(k k1, o o1)
    {
        return a(k1, o1);
    }

    public Object clone()
    {
        return a();
    }

    public u d()
    {
        u u1 = new u(this, null);
        int _tmp = a;
        if ((1 & a) == 1)
        {
            b = Collections.unmodifiableList(b);
            a = -2 & a;
        }
        com.google.analytics.a.a.u.a(u1, b);
        if ((2 & a) == 2)
        {
            c = Collections.unmodifiableList(c);
            a = -3 & a;
        }
        com.google.analytics.a.a.u.b(u1, c);
        if ((4 & a) == 4)
        {
            d = Collections.unmodifiableList(d);
            a = -5 & a;
        }
        com.google.analytics.a.a.u.c(u1, d);
        if ((8 & a) == 8)
        {
            e = Collections.unmodifiableList(e);
            a = -9 & a;
        }
        com.google.analytics.a.a.u.d(u1, e);
        if ((0x10 & a) == 16)
        {
            f = Collections.unmodifiableList(f);
            a = 0xffffffef & a;
        }
        com.google.analytics.a.a.u.e(u1, f);
        if ((0x20 & a) == 32)
        {
            g = Collections.unmodifiableList(g);
            a = 0xffffffdf & a;
        }
        com.google.analytics.a.a.u.f(u1, g);
        if ((0x40 & a) == 64)
        {
            h = Collections.unmodifiableList(h);
            a = 0xffffffbf & a;
        }
        com.google.analytics.a.a.u.g(u1, h);
        if ((0x80 & a) == 128)
        {
            i = Collections.unmodifiableList(i);
            a = 0xffffff7f & a;
        }
        com.google.analytics.a.a.u.h(u1, i);
        if ((0x100 & a) == 256)
        {
            j = Collections.unmodifiableList(j);
            a = 0xfffffeff & a;
        }
        com.google.analytics.a.a.u.i(u1, j);
        if ((0x200 & a) == 512)
        {
            k = Collections.unmodifiableList(k);
            a = 0xfffffdff & a;
        }
        com.google.analytics.a.a.u.j(u1, k);
        return u1;
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
