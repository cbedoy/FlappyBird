// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.a.a;

import com.google.tagmanager.a.af;
import com.google.tagmanager.a.am;
import com.google.tagmanager.a.an;
import com.google.tagmanager.a.ap;
import com.google.tagmanager.a.aq;
import com.google.tagmanager.a.h;
import com.google.tagmanager.a.j;
import com.google.tagmanager.a.k;
import com.google.tagmanager.a.o;
import com.google.tagmanager.a.t;
import com.google.tagmanager.a.v;
import java.io.IOException;

// Referenced classes of package com.google.analytics.a.a:
//            p, n, o, b

public final class m extends t
    implements p
{

    public static aq a = new n();
    private static final m c;
    private static volatile ap j = null;
    private final h d;
    private int e;
    private int f;
    private int g;
    private byte h;
    private int i;

    private m(k k1, o o1)
    {
        j j1;
        com.google.tagmanager.a.m m1;
        boolean flag;
        h = -1;
        i = -1;
        l();
        j1 = com.google.tagmanager.a.h.i();
        m1 = com.google.tagmanager.a.m.a(j1);
        flag = false;
_L12:
        if (flag) goto _L2; else goto _L1
_L1:
        int i1 = k1.a();
        i1;
        JVM INSTR lookupswitch 3: default 80
    //                   0: 261
    //                   8: 99
    //                   16: 151;
           goto _L3 _L4 _L5 _L6
_L3:
        if (!a(k1, m1, o1, i1))
        {
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        e = 1 | e;
        f = k1.f();
        continue; /* Loop/switch isn't completed */
        af af1;
        af1;
        throw af1.a(this);
        Exception exception1;
        exception1;
        m1.a();
        d = j1.a();
_L10:
        R();
        throw exception1;
_L6:
        e = 2 | e;
        g = k1.f();
        continue; /* Loop/switch isn't completed */
        IOException ioexception1;
        ioexception1;
        throw (new af(ioexception1.getMessage())).a(this);
_L2:
        m1.a();
        d = j1.a();
_L8:
        R();
        return;
        IOException ioexception;
        ioexception;
        d = j1.a();
        if (true) goto _L8; else goto _L7
_L7:
        Exception exception;
        exception;
        d = j1.a();
        throw exception;
        IOException ioexception2;
        ioexception2;
        d = j1.a();
        if (true) goto _L10; else goto _L9
_L9:
        Exception exception2;
        exception2;
        d = j1.a();
        throw exception2;
_L4:
        flag = true;
        if (true) goto _L12; else goto _L11
_L11:
    }

    m(k k1, o o1, b b1)
    {
        this(k1, o1);
    }

    private m(v v1)
    {
        super(v1);
        h = -1;
        i = -1;
        d = v1.r();
    }

    m(v v1, b b1)
    {
        this(v1);
    }

    private m(boolean flag)
    {
        h = -1;
        i = -1;
        d = h.a;
    }

    static int a(m m1, int i1)
    {
        m1.f = i1;
        return i1;
    }

    public static m a()
    {
        return c;
    }

    public static com.google.analytics.a.a.o a(m m1)
    {
        return h().a(m1);
    }

    static int b(m m1, int i1)
    {
        m1.g = i1;
        return i1;
    }

    static h b(m m1)
    {
        return m1.d;
    }

    static int c(m m1, int i1)
    {
        m1.e = i1;
        return i1;
    }

    public static com.google.analytics.a.a.o h()
    {
        return com.google.analytics.a.a.o.l();
    }

    private void l()
    {
        f = 0;
        g = 0;
    }

    public m b()
    {
        return c;
    }

    public aq c()
    {
        return a;
    }

    public boolean d()
    {
        return (1 & e) == 1;
    }

    public int e()
    {
        return f;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof m))
            {
                return super.equals(obj);
            }
            m m1 = (m)obj;
            boolean flag;
            boolean flag1;
            if (d() == m1.d())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (d())
            {
                if (flag && e() == m1.e())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            }
            if (flag && f() == m1.f())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (f())
            {
                if (!flag1 || g() != m1.g())
                {
                    return false;
                }
            } else
            {
                return flag1;
            }
        }
        return true;
    }

    public boolean f()
    {
        return (2 & e) == 2;
    }

    public int g()
    {
        return g;
    }

    public int hashCode()
    {
        if (b != 0)
        {
            return b;
        }
        int i1 = 779 + com/google/analytics/a/a/m.hashCode();
        if (d())
        {
            i1 = 53 * (1 + i1 * 37) + e();
        }
        if (f())
        {
            i1 = 53 * (2 + i1 * 37) + g();
        }
        int j1 = i1 * 29 + d.hashCode();
        b = j1;
        return j1;
    }

    public com.google.analytics.a.a.o i()
    {
        return h();
    }

    public final boolean j()
    {
        byte byte0 = h;
        if (byte0 != -1)
        {
            return byte0 == 1;
        }
        if (!d())
        {
            h = 0;
            return false;
        }
        if (!f())
        {
            h = 0;
            return false;
        } else
        {
            h = 1;
            return true;
        }
    }

    public com.google.analytics.a.a.o k()
    {
        return a(this);
    }

    public an n()
    {
        return k();
    }

    public an o()
    {
        return i();
    }

    public am p()
    {
        return b();
    }

    static 
    {
        c = new m(true);
        c.l();
    }
}
