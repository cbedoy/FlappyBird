// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.a.a;

import com.google.analytics.b.a.a.c;
import com.google.tagmanager.a.af;
import com.google.tagmanager.a.ah;
import com.google.tagmanager.a.ai;
import com.google.tagmanager.a.am;
import com.google.tagmanager.a.an;
import com.google.tagmanager.a.aq;
import com.google.tagmanager.a.b;
import com.google.tagmanager.a.bg;
import com.google.tagmanager.a.h;
import com.google.tagmanager.a.k;
import com.google.tagmanager.a.o;
import com.google.tagmanager.a.t;
import com.google.tagmanager.a.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.analytics.a.a:
//            t, c, e, q, 
//            m, i

public final class s extends v
    implements com.google.analytics.a.a.t
{

    private int a;
    private ai b;
    private List c;
    private List d;
    private List e;
    private List f;
    private List g;
    private List h;
    private Object i;
    private Object j;
    private Object k;
    private Object l;
    private com.google.analytics.a.a.c m;
    private float n;
    private boolean o;
    private ai p;
    private int q;

    private s()
    {
        b = ah.a;
        c = Collections.emptyList();
        d = Collections.emptyList();
        e = Collections.emptyList();
        f = Collections.emptyList();
        g = Collections.emptyList();
        h = Collections.emptyList();
        i = "";
        j = "";
        k = "0";
        l = "";
        m = com.google.analytics.a.a.c.a();
        p = ah.a;
        q();
    }

    private void A()
    {
        if ((0x4000 & a) != 16384)
        {
            p = new ah(p);
            a = 0x4000 | a;
        }
    }

    static s o()
    {
        return s();
    }

    private void q()
    {
    }

    private static s s()
    {
        return new s();
    }

    private void t()
    {
        if ((1 & a) != 1)
        {
            b = new ah(b);
            a = 1 | a;
        }
    }

    private void u()
    {
        if ((2 & a) != 2)
        {
            c = new ArrayList(c);
            a = 2 | a;
        }
    }

    private void v()
    {
        if ((4 & a) != 4)
        {
            d = new ArrayList(d);
            a = 4 | a;
        }
    }

    private void w()
    {
        if ((8 & a) != 8)
        {
            e = new ArrayList(e);
            a = 8 | a;
        }
    }

    private void x()
    {
        if ((0x10 & a) != 16)
        {
            f = new ArrayList(f);
            a = 0x10 | a;
        }
    }

    private void y()
    {
        if ((0x20 & a) != 32)
        {
            g = new ArrayList(g);
            a = 0x20 | a;
        }
    }

    private void z()
    {
        if ((0x40 & a) != 64)
        {
            h = new ArrayList(h);
            a = 0x40 | a;
        }
    }

    public s a()
    {
        return s().a(d());
    }

    public s a(float f1)
    {
        a = 0x1000 | a;
        n = f1;
        return this;
    }

    public s a(com.google.analytics.a.a.c c1)
    {
        if ((0x800 & a) == 2048 && m != com.google.analytics.a.a.c.a())
        {
            m = com.google.analytics.a.a.c.a(m).a(c1).d();
        } else
        {
            m = c1;
        }
        a = 0x800 | a;
        return this;
    }

    public s a(q q1)
    {
        if (q1 == com.google.analytics.a.a.q.a())
        {
            return this;
        }
        if (!com.google.analytics.a.a.q.b(q1).isEmpty())
        {
            if (b.isEmpty())
            {
                b = com.google.analytics.a.a.q.b(q1);
                a = -2 & a;
            } else
            {
                t();
                b.addAll(com.google.analytics.a.a.q.b(q1));
            }
        }
        if (!com.google.analytics.a.a.q.c(q1).isEmpty())
        {
            if (c.isEmpty())
            {
                c = com.google.analytics.a.a.q.c(q1);
                a = -3 & a;
            } else
            {
                u();
                c.addAll(com.google.analytics.a.a.q.c(q1));
            }
        }
        if (!com.google.analytics.a.a.q.d(q1).isEmpty())
        {
            if (d.isEmpty())
            {
                d = com.google.analytics.a.a.q.d(q1);
                a = -5 & a;
            } else
            {
                v();
                d.addAll(com.google.analytics.a.a.q.d(q1));
            }
        }
        if (!com.google.analytics.a.a.q.e(q1).isEmpty())
        {
            if (e.isEmpty())
            {
                e = com.google.analytics.a.a.q.e(q1);
                a = -9 & a;
            } else
            {
                w();
                e.addAll(com.google.analytics.a.a.q.e(q1));
            }
        }
        if (!com.google.analytics.a.a.q.f(q1).isEmpty())
        {
            if (f.isEmpty())
            {
                f = com.google.analytics.a.a.q.f(q1);
                a = 0xffffffef & a;
            } else
            {
                x();
                f.addAll(com.google.analytics.a.a.q.f(q1));
            }
        }
        if (!com.google.analytics.a.a.q.g(q1).isEmpty())
        {
            if (g.isEmpty())
            {
                g = com.google.analytics.a.a.q.g(q1);
                a = 0xffffffdf & a;
            } else
            {
                y();
                g.addAll(com.google.analytics.a.a.q.g(q1));
            }
        }
        if (!com.google.analytics.a.a.q.h(q1).isEmpty())
        {
            if (h.isEmpty())
            {
                h = com.google.analytics.a.a.q.h(q1);
                a = 0xffffffbf & a;
            } else
            {
                z();
                h.addAll(com.google.analytics.a.a.q.h(q1));
            }
        }
        if (q1.v())
        {
            a = 0x80 | a;
            i = com.google.analytics.a.a.q.i(q1);
        }
        if (q1.x())
        {
            a = 0x100 | a;
            j = com.google.analytics.a.a.q.j(q1);
        }
        if (q1.z())
        {
            a = 0x200 | a;
            k = com.google.analytics.a.a.q.k(q1);
        }
        if (q1.B())
        {
            a = 0x400 | a;
            l = com.google.analytics.a.a.q.l(q1);
        }
        if (q1.D())
        {
            a(q1.E());
        }
        if (q1.F())
        {
            a(q1.G());
        }
        if (q1.H())
        {
            a(q1.I());
        }
        if (!com.google.analytics.a.a.q.m(q1).isEmpty())
        {
            if (p.isEmpty())
            {
                p = com.google.analytics.a.a.q.m(q1);
                a = 0xffffbfff & a;
            } else
            {
                A();
                p.addAll(com.google.analytics.a.a.q.m(q1));
            }
        }
        if (q1.L())
        {
            f(q1.M());
        }
        a(r().a(com.google.analytics.a.a.q.n(q1)));
        return this;
    }

    public s a(k k1, o o1)
    {
        q q3 = (q)q.a.b(k1, o1);
        if (q3 != null)
        {
            a(q3);
        }
        return this;
        af af1;
        af1;
        q q2 = (q)af1.a();
        throw af1;
        Exception exception1;
        exception1;
        Exception exception;
        q q1;
        q1 = q2;
        exception = exception1;
_L2:
        if (q1 != null)
        {
            a(q1);
        }
        throw exception;
        exception;
        q1 = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public s a(boolean flag)
    {
        a = 0x2000 | a;
        o = flag;
        return this;
    }

    public c a(int i1)
    {
        return (c)c.get(i1);
    }

    public volatile v a(t t1)
    {
        return a((q)t1);
    }

    public m b(int i1)
    {
        return (m)d.get(i1);
    }

    public q b()
    {
        return com.google.analytics.a.a.q.a();
    }

    public b b(k k1, o o1)
    {
        return a(k1, o1);
    }

    public i c(int i1)
    {
        return (i)e.get(i1);
    }

    public q c()
    {
        q q1 = d();
        if (!q1.j())
        {
            throw a(q1);
        } else
        {
            return q1;
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

    public i d(int i1)
    {
        return (i)f.get(i1);
    }

    public q d()
    {
        int i1 = 1;
        q q1 = new q(this, null);
        int j1 = a;
        if ((1 & a) == i1)
        {
            b = new bg(b);
            a = -2 & a;
        }
        com.google.analytics.a.a.q.a(q1, b);
        if ((2 & a) == 2)
        {
            c = Collections.unmodifiableList(c);
            a = -3 & a;
        }
        com.google.analytics.a.a.q.a(q1, c);
        if ((4 & a) == 4)
        {
            d = Collections.unmodifiableList(d);
            a = -5 & a;
        }
        com.google.analytics.a.a.q.b(q1, d);
        if ((8 & a) == 8)
        {
            e = Collections.unmodifiableList(e);
            a = -9 & a;
        }
        com.google.analytics.a.a.q.c(q1, e);
        if ((0x10 & a) == 16)
        {
            f = Collections.unmodifiableList(f);
            a = 0xffffffef & a;
        }
        com.google.analytics.a.a.q.d(q1, f);
        if ((0x20 & a) == 32)
        {
            g = Collections.unmodifiableList(g);
            a = 0xffffffdf & a;
        }
        com.google.analytics.a.a.q.e(q1, g);
        if ((0x40 & a) == 64)
        {
            h = Collections.unmodifiableList(h);
            a = 0xffffffbf & a;
        }
        com.google.analytics.a.a.q.f(q1, h);
        if ((j1 & 0x80) != 128)
        {
            i1 = 0;
        }
        com.google.analytics.a.a.q.a(q1, i);
        if ((j1 & 0x100) == 256)
        {
            i1 |= 2;
        }
        com.google.analytics.a.a.q.b(q1, j);
        if ((j1 & 0x200) == 512)
        {
            i1 |= 4;
        }
        com.google.analytics.a.a.q.c(q1, k);
        if ((j1 & 0x400) == 1024)
        {
            i1 |= 8;
        }
        com.google.analytics.a.a.q.d(q1, l);
        if ((j1 & 0x800) == 2048)
        {
            i1 |= 0x10;
        }
        com.google.analytics.a.a.q.a(q1, m);
        if ((j1 & 0x1000) == 4096)
        {
            i1 |= 0x20;
        }
        com.google.analytics.a.a.q.a(q1, n);
        if ((j1 & 0x2000) == 8192)
        {
            i1 |= 0x40;
        }
        com.google.analytics.a.a.q.a(q1, o);
        if ((0x4000 & a) == 16384)
        {
            p = new bg(p);
            a = 0xffffbfff & a;
        }
        com.google.analytics.a.a.q.b(q1, p);
        if ((j1 & 0x8000) == 32768)
        {
            i1 |= 0x80;
        }
        com.google.analytics.a.a.q.a(q1, q);
        com.google.analytics.a.a.q.b(q1, i1);
        return q1;
    }

    public i e(int i1)
    {
        return (i)g.get(i1);
    }

    public t e()
    {
        return b();
    }

    public s f(int i1)
    {
        a = 0x8000 | a;
        q = i1;
        return this;
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

    public int i()
    {
        return c.size();
    }

    public final boolean j()
    {
        int i1 = 0;
_L7:
        if (i1 >= i()) goto _L2; else goto _L1
_L1:
        if (a(i1).j()) goto _L4; else goto _L3
_L3:
        return false;
_L4:
        i1++;
        continue; /* Loop/switch isn't completed */
_L2:
        for (int j1 = 0; j1 < k(); j1++)
        {
            if (!b(j1).j())
            {
                continue; /* Loop/switch isn't completed */
            }
        }

        for (int k1 = 0; k1 < l(); k1++)
        {
            if (!c(k1).j())
            {
                continue; /* Loop/switch isn't completed */
            }
        }

        for (int l1 = 0; l1 < m(); l1++)
        {
            if (!d(l1).j())
            {
                continue; /* Loop/switch isn't completed */
            }
        }

        int i2 = 0;
label0:
        do
        {
label1:
            {
                if (i2 >= n())
                {
                    break label1;
                }
                if (!e(i2).j())
                {
                    break label0;
                }
                i2++;
            }
        } while (true);
        if (true) goto _L3; else goto _L5
_L5:
        return true;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public int k()
    {
        return d.size();
    }

    public int l()
    {
        return e.size();
    }

    public int m()
    {
        return f.size();
    }

    public int n()
    {
        return g.size();
    }

    public am p()
    {
        return b();
    }
}
