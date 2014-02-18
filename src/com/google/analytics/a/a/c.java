// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.a.a;

import com.google.tagmanager.a.ac;
import com.google.tagmanager.a.af;
import com.google.tagmanager.a.am;
import com.google.tagmanager.a.an;
import com.google.tagmanager.a.ap;
import com.google.tagmanager.a.aq;
import com.google.tagmanager.a.h;
import com.google.tagmanager.a.j;
import com.google.tagmanager.a.k;
import com.google.tagmanager.a.m;
import com.google.tagmanager.a.o;
import com.google.tagmanager.a.t;
import com.google.tagmanager.a.v;
import java.io.IOException;

// Referenced classes of package com.google.analytics.a.a:
//            h, d, f, e, 
//            b

public final class c extends t
    implements com.google.analytics.a.a.h
{

    public static aq a = new d();
    private static final c c;
    private static volatile ap k = null;
    private final h d;
    private int e;
    private f f;
    private int g;
    private int h;
    private byte i;
    private int j;

    private c(k k1, o o1)
    {
        j j1;
        m m1;
        boolean flag;
        i = -1;
        j = -1;
        q();
        j1 = com.google.tagmanager.a.h.i();
        m1 = com.google.tagmanager.a.m.a(j1);
        flag = false;
_L15:
        if (flag) goto _L2; else goto _L1
_L1:
        int i1 = k1.a();
        i1;
        JVM INSTR lookupswitch 4: default 88
    //                   0: 323
    //                   8: 107
    //                   16: 211
    //                   24: 232;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        if (!a(k1, m1, o1, i1))
        {
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        int l1;
        f f1;
        l1 = k1.n();
        f1 = com.google.analytics.a.a.f.a(l1);
        if (f1 != null) goto _L9; else goto _L8
_L8:
        m1.d(i1);
        m1.d(l1);
        continue; /* Loop/switch isn't completed */
        af af1;
        af1;
        throw af1.a(this);
        Exception exception1;
        exception1;
        m1.a();
        d = j1.a();
_L13:
        R();
        throw exception1;
_L9:
        e = 1 | e;
        f = f1;
        continue; /* Loop/switch isn't completed */
        IOException ioexception1;
        ioexception1;
        throw (new af(ioexception1.getMessage())).a(this);
_L6:
        e = 2 | e;
        g = k1.f();
        continue; /* Loop/switch isn't completed */
_L7:
        e = 4 | e;
        h = k1.f();
        continue; /* Loop/switch isn't completed */
_L2:
        m1.a();
        d = j1.a();
_L11:
        R();
        return;
        IOException ioexception;
        ioexception;
        d = j1.a();
        if (true) goto _L11; else goto _L10
_L10:
        Exception exception;
        exception;
        d = j1.a();
        throw exception;
        IOException ioexception2;
        ioexception2;
        d = j1.a();
        if (true) goto _L13; else goto _L12
_L12:
        Exception exception2;
        exception2;
        d = j1.a();
        throw exception2;
_L4:
        flag = true;
        if (true) goto _L15; else goto _L14
_L14:
    }

    c(k k1, o o1, b b1)
    {
        this(k1, o1);
    }

    private c(v v1)
    {
        super(v1);
        i = -1;
        j = -1;
        d = v1.r();
    }

    c(v v1, b b1)
    {
        this(v1);
    }

    private c(boolean flag)
    {
        i = -1;
        j = -1;
        d = h.a;
    }

    static int a(c c1, int i1)
    {
        c1.g = i1;
        return i1;
    }

    public static c a()
    {
        return c;
    }

    public static e a(c c1)
    {
        return k().a(c1);
    }

    static f a(c c1, f f1)
    {
        c1.f = f1;
        return f1;
    }

    static int b(c c1, int i1)
    {
        c1.h = i1;
        return i1;
    }

    static h b(c c1)
    {
        return c1.d;
    }

    static int c(c c1, int i1)
    {
        c1.e = i1;
        return i1;
    }

    public static e k()
    {
        return com.google.analytics.a.a.e.i();
    }

    private void q()
    {
        f = f.a;
        g = 0;
        h = 0;
    }

    public c b()
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

    public f e()
    {
        return f;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof c))
            {
                return super.equals(obj);
            }
            c c1 = (c)obj;
            boolean flag;
            boolean flag1;
            boolean flag2;
            if (d() == c1.d())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (d())
            {
                if (flag && e() == c1.e())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            }
            if (flag && f() == c1.f())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (f())
            {
                if (flag1 && g() == c1.g())
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
            }
            if (flag1 && h() == c1.h())
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (h())
            {
                if (!flag2 || i() != c1.i())
                {
                    return false;
                }
            } else
            {
                return flag2;
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

    public boolean h()
    {
        return (4 & e) == 4;
    }

    public int hashCode()
    {
        if (b != 0)
        {
            return b;
        }
        int i1 = 779 + com/google/analytics/a/a/c.hashCode();
        if (d())
        {
            i1 = 53 * (1 + i1 * 37) + ac.a(e());
        }
        if (f())
        {
            i1 = 53 * (2 + i1 * 37) + g();
        }
        if (h())
        {
            i1 = 53 * (3 + i1 * 37) + i();
        }
        int j1 = i1 * 29 + d.hashCode();
        b = j1;
        return j1;
    }

    public int i()
    {
        return h;
    }

    public final boolean j()
    {
        byte byte0 = i;
        if (byte0 != -1)
        {
            return byte0 == 1;
        } else
        {
            i = 1;
            return true;
        }
    }

    public e l()
    {
        return k();
    }

    public e m()
    {
        return a(this);
    }

    public an n()
    {
        return m();
    }

    public an o()
    {
        return l();
    }

    public am p()
    {
        return b();
    }

    static 
    {
        c = new c(true);
        c.q();
    }
}
