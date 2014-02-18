// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.b.a.a;

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
import com.google.tagmanager.a.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.analytics.b.a.a:
//            j, h, c

public final class e extends w
    implements j
{

    private int a;
    private com.google.analytics.b.a.a.h b;
    private Object c;
    private List d;
    private List e;
    private List f;
    private Object g;
    private Object h;
    private long i;
    private boolean j;
    private List k;
    private List l;
    private boolean m;

    private e()
    {
        b = h.a;
        c = "";
        d = Collections.emptyList();
        e = Collections.emptyList();
        f = Collections.emptyList();
        g = "";
        h = "";
        k = Collections.emptyList();
        l = Collections.emptyList();
        t();
    }

    static e q()
    {
        return u();
    }

    private void t()
    {
    }

    private static e u()
    {
        return new e();
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
        if ((0x200 & a) != 512)
        {
            k = new ArrayList(k);
            a = 0x200 | a;
        }
    }

    private void z()
    {
        if ((0x400 & a) != 1024)
        {
            l = new ArrayList(l);
            a = 0x400 | a;
        }
    }

    public c a(int i1)
    {
        return (c)d.get(i1);
    }

    public e a()
    {
        return u().a(d());
    }

    public e a(long l1)
    {
        a = 0x80 | a;
        i = l1;
        return this;
    }

    public e a(c c1)
    {
        if (c1 == com.google.analytics.b.a.a.c.a())
        {
            return this;
        }
        if (c1.d())
        {
            a(c1.e());
        }
        if (c1.f())
        {
            a = 2 | a;
            c = com.google.analytics.b.a.a.c.b(c1);
        }
        if (!com.google.analytics.b.a.a.c.c(c1).isEmpty())
        {
            if (d.isEmpty())
            {
                d = com.google.analytics.b.a.a.c.c(c1);
                a = -5 & a;
            } else
            {
                v();
                d.addAll(com.google.analytics.b.a.a.c.c(c1));
            }
        }
        if (!com.google.analytics.b.a.a.c.d(c1).isEmpty())
        {
            if (e.isEmpty())
            {
                e = com.google.analytics.b.a.a.c.d(c1);
                a = -9 & a;
            } else
            {
                w();
                e.addAll(com.google.analytics.b.a.a.c.d(c1));
            }
        }
        if (!com.google.analytics.b.a.a.c.e(c1).isEmpty())
        {
            if (f.isEmpty())
            {
                f = com.google.analytics.b.a.a.c.e(c1);
                a = 0xffffffef & a;
            } else
            {
                x();
                f.addAll(com.google.analytics.b.a.a.c.e(c1));
            }
        }
        if (c1.r())
        {
            a = 0x20 | a;
            g = com.google.analytics.b.a.a.c.f(c1);
        }
        if (c1.t())
        {
            a = 0x40 | a;
            h = com.google.analytics.b.a.a.c.g(c1);
        }
        if (c1.v())
        {
            a(c1.w());
        }
        if (c1.x())
        {
            a(c1.y());
        }
        if (!com.google.analytics.b.a.a.c.h(c1).isEmpty())
        {
            if (k.isEmpty())
            {
                k = com.google.analytics.b.a.a.c.h(c1);
                a = 0xfffffdff & a;
            } else
            {
                y();
                k.addAll(com.google.analytics.b.a.a.c.h(c1));
            }
        }
        if (!com.google.analytics.b.a.a.c.i(c1).isEmpty())
        {
            if (l.isEmpty())
            {
                l = com.google.analytics.b.a.a.c.i(c1);
                a = 0xfffffbff & a;
            } else
            {
                z();
                l.addAll(com.google.analytics.b.a.a.c.i(c1));
            }
        }
        if (c1.D())
        {
            b(c1.E());
        }
        a(((com.google.tagmanager.a.x) (c1)));
        a(r().a(com.google.analytics.b.a.a.c.j(c1)));
        return this;
    }

    public e a(com.google.analytics.b.a.a.h h1)
    {
        if (h1 == null)
        {
            throw new NullPointerException();
        } else
        {
            a = 1 | a;
            b = h1;
            return this;
        }
    }

    public e a(k k1, o o1)
    {
        c c3 = (c)c.a.b(k1, o1);
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

    public e a(String s)
    {
        if (s == null)
        {
            throw new NullPointerException();
        } else
        {
            a = 2 | a;
            c = s;
            return this;
        }
    }

    public e a(boolean flag)
    {
        a = 0x100 | a;
        j = flag;
        return this;
    }

    public volatile v a(t t1)
    {
        return a((c)t1);
    }

    public c b()
    {
        return com.google.analytics.b.a.a.c.a();
    }

    public c b(int i1)
    {
        return (c)e.get(i1);
    }

    public e b(c c1)
    {
        if (c1 == null)
        {
            throw new NullPointerException();
        } else
        {
            v();
            d.add(c1);
            return this;
        }
    }

    public e b(boolean flag)
    {
        a = 0x800 | a;
        m = flag;
        return this;
    }

    public b b(k k1, o o1)
    {
        return a(k1, o1);
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

    public c c(int i1)
    {
        return (c)f.get(i1);
    }

    public e c(c c1)
    {
        if (c1 == null)
        {
            throw new NullPointerException();
        } else
        {
            w();
            e.add(c1);
            return this;
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

    public c d()
    {
        int i1 = 1;
        c c1 = new c(this, null);
        int j1 = a;
        if ((j1 & 1) != i1)
        {
            i1 = 0;
        }
        com.google.analytics.b.a.a.c.a(c1, b);
        if ((j1 & 2) == 2)
        {
            i1 |= 2;
        }
        com.google.analytics.b.a.a.c.a(c1, c);
        if ((4 & a) == 4)
        {
            d = Collections.unmodifiableList(d);
            a = -5 & a;
        }
        com.google.analytics.b.a.a.c.a(c1, d);
        if ((8 & a) == 8)
        {
            e = Collections.unmodifiableList(e);
            a = -9 & a;
        }
        com.google.analytics.b.a.a.c.b(c1, e);
        if ((0x10 & a) == 16)
        {
            f = Collections.unmodifiableList(f);
            a = 0xffffffef & a;
        }
        com.google.analytics.b.a.a.c.c(c1, f);
        if ((j1 & 0x20) == 32)
        {
            i1 |= 4;
        }
        com.google.analytics.b.a.a.c.b(c1, g);
        if ((j1 & 0x40) == 64)
        {
            i1 |= 8;
        }
        com.google.analytics.b.a.a.c.c(c1, h);
        if ((j1 & 0x80) == 128)
        {
            i1 |= 0x10;
        }
        com.google.analytics.b.a.a.c.a(c1, i);
        if ((j1 & 0x100) == 256)
        {
            i1 |= 0x20;
        }
        com.google.analytics.b.a.a.c.a(c1, j);
        if ((0x200 & a) == 512)
        {
            k = Collections.unmodifiableList(k);
            a = 0xfffffdff & a;
        }
        com.google.analytics.b.a.a.c.d(c1, k);
        if ((0x400 & a) == 1024)
        {
            l = Collections.unmodifiableList(l);
            a = 0xfffffbff & a;
        }
        com.google.analytics.b.a.a.c.e(c1, l);
        if ((j1 & 0x800) == 2048)
        {
            i1 |= 0x40;
        }
        com.google.analytics.b.a.a.c.b(c1, m);
        com.google.analytics.b.a.a.c.a(c1, i1);
        return c1;
    }

    public c d(int i1)
    {
        return (c)k.get(i1);
    }

    public e d(c c1)
    {
        if (c1 == null)
        {
            throw new NullPointerException();
        } else
        {
            x();
            f.add(c1);
            return this;
        }
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
        if (i()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int i1 = 0;
_L4:
        if (i1 >= k())
        {
            break MISSING_BLOCK_LABEL_36;
        }
        if (!a(i1).j()) goto _L1; else goto _L3
_L3:
        i1++;
          goto _L4
        int j1 = 0;
_L6:
        if (j1 >= l())
        {
            break MISSING_BLOCK_LABEL_63;
        }
        if (!b(j1).j()) goto _L1; else goto _L5
_L5:
        j1++;
          goto _L6
        int k1 = 0;
_L8:
        if (k1 >= m())
        {
            break MISSING_BLOCK_LABEL_90;
        }
        if (!c(k1).j()) goto _L1; else goto _L7
_L7:
        k1++;
          goto _L8
        int l1 = 0;
_L10:
        if (l1 >= n())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!d(l1).j()) goto _L1; else goto _L9
_L9:
        l1++;
          goto _L10
        if (!s()) goto _L1; else goto _L11
_L11:
        return true;
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
        return k.size();
    }

    public w o()
    {
        return a();
    }

    public am p()
    {
        return b();
    }
}
