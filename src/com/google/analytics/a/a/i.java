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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.analytics.a.a:
//            l, j, k, b

public final class i extends t
    implements l
{

    public static aq a = new com.google.analytics.a.a.j();
    private static final i c;
    private static volatile ap m = null;
    private final h d;
    private int e;
    private List f;
    private int g;
    private int h;
    private boolean i;
    private boolean j;
    private byte k;
    private int l;

    private i(k k1, o o1)
    {
        boolean flag;
        j j1;
        m m1;
        boolean flag1;
        flag = false;
        super();
        k = -1;
        l = -1;
        u();
        j1 = com.google.tagmanager.a.h.i();
        m1 = com.google.tagmanager.a.m.a(j1);
        flag1 = false;
_L16:
        if (flag) goto _L2; else goto _L1
_L1:
        int i1 = k1.a();
        i1;
        JVM INSTR lookupswitch 7: default 112
    //                   0: 502
    //                   8: 130
    //                   16: 203
    //                   24: 243
    //                   26: 288
    //                   32: 366
    //                   48: 387;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L3:
        if (!a(k1, m1, o1, i1))
        {
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        e = 8 | e;
        j = k1.i();
        continue; /* Loop/switch isn't completed */
        af af1;
        af1;
        throw af1.a(this);
        Exception exception1;
        exception1;
        if ((flag1 & true))
        {
            f = Collections.unmodifiableList(f);
        }
        m1.a();
        d = j1.a();
_L14:
        R();
        throw exception1;
_L6:
        e = 1 | e;
        g = k1.f();
        continue; /* Loop/switch isn't completed */
        IOException ioexception1;
        ioexception1;
        throw (new af(ioexception1.getMessage())).a(this);
_L7:
        if ((flag1 & true))
        {
            break MISSING_BLOCK_LABEL_268;
        }
        f = new ArrayList();
        flag1 |= true;
        f.add(Integer.valueOf(k1.f()));
        continue; /* Loop/switch isn't completed */
_L8:
        int l1 = k1.c(k1.s());
        if ((flag1 & true))
        {
            break MISSING_BLOCK_LABEL_330;
        }
        if (k1.w() <= 0)
        {
            break MISSING_BLOCK_LABEL_330;
        }
        f = new ArrayList();
        flag1 |= true;
        for (; k1.w() > 0; f.add(Integer.valueOf(k1.f()))) { }
        k1.d(l1);
        continue; /* Loop/switch isn't completed */
_L9:
        e = 2 | e;
        h = k1.f();
        continue; /* Loop/switch isn't completed */
_L10:
        e = 4 | e;
        i = k1.i();
        continue; /* Loop/switch isn't completed */
_L2:
        if ((flag1 & true))
        {
            f = Collections.unmodifiableList(f);
        }
        m1.a();
        d = j1.a();
_L12:
        R();
        return;
        IOException ioexception;
        ioexception;
        d = j1.a();
        if (true) goto _L12; else goto _L11
_L11:
        Exception exception;
        exception;
        d = j1.a();
        throw exception;
        IOException ioexception2;
        ioexception2;
        d = j1.a();
        if (true) goto _L14; else goto _L13
_L13:
        Exception exception2;
        exception2;
        d = j1.a();
        throw exception2;
_L4:
        flag = true;
        if (true) goto _L16; else goto _L15
_L15:
    }

    i(k k1, o o1, b b1)
    {
        this(k1, o1);
    }

    private i(v v1)
    {
        super(v1);
        k = -1;
        l = -1;
        d = v1.r();
    }

    i(v v1, b b1)
    {
        this(v1);
    }

    private i(boolean flag)
    {
        k = -1;
        l = -1;
        d = h.a;
    }

    static int a(i i1, int j1)
    {
        i1.g = j1;
        return j1;
    }

    public static i a()
    {
        return c;
    }

    public static com.google.analytics.a.a.k a(i i1)
    {
        return r().a(i1);
    }

    static List a(i i1, List list)
    {
        i1.f = list;
        return list;
    }

    static boolean a(i i1, boolean flag)
    {
        i1.i = flag;
        return flag;
    }

    static int b(i i1, int j1)
    {
        i1.h = j1;
        return j1;
    }

    static List b(i i1)
    {
        return i1.f;
    }

    static boolean b(i i1, boolean flag)
    {
        i1.j = flag;
        return flag;
    }

    static int c(i i1, int j1)
    {
        i1.e = j1;
        return j1;
    }

    static h c(i i1)
    {
        return i1.d;
    }

    public static com.google.analytics.a.a.k r()
    {
        return com.google.analytics.a.a.k.k();
    }

    private void u()
    {
        f = Collections.emptyList();
        g = 0;
        h = 0;
        i = false;
        j = false;
    }

    public i b()
    {
        return c;
    }

    public aq c()
    {
        return a;
    }

    public List d()
    {
        return f;
    }

    public int e()
    {
        return f.size();
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof i))
            {
                return super.equals(obj);
            }
            i i1 = (i)obj;
            boolean flag;
            boolean flag1;
            boolean flag2;
            boolean flag3;
            boolean flag4;
            if (d().equals(i1.d()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && f() == i1.f())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (f())
            {
                if (flag1 && g() == i1.g())
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
            }
            if (flag1 && h() == i1.h())
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (h())
            {
                if (flag2 && i() == i1.i())
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
            }
            if (flag2 && k() == i1.k())
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            if (k())
            {
                if (flag3 && l() == i1.l())
                {
                    flag3 = true;
                } else
                {
                    flag3 = false;
                }
            }
            if (flag3 && m() == i1.m())
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            if (m())
            {
                if (!flag4 || q() != i1.q())
                {
                    return false;
                }
            } else
            {
                return flag4;
            }
        }
        return true;
    }

    public boolean f()
    {
        return (1 & e) == 1;
    }

    public int g()
    {
        return g;
    }

    public boolean h()
    {
        return (2 & e) == 2;
    }

    public int hashCode()
    {
        if (b != 0)
        {
            return b;
        }
        int i1 = 779 + com/google/analytics/a/a/i.hashCode();
        if (e() > 0)
        {
            i1 = 53 * (3 + i1 * 37) + d().hashCode();
        }
        if (f())
        {
            i1 = 53 * (2 + i1 * 37) + g();
        }
        if (h())
        {
            i1 = 53 * (4 + i1 * 37) + i();
        }
        if (k())
        {
            i1 = 53 * (6 + i1 * 37) + ac.a(l());
        }
        if (m())
        {
            i1 = 53 * (1 + i1 * 37) + ac.a(q());
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
        byte byte0 = k;
        if (byte0 != -1)
        {
            return byte0 == 1;
        }
        if (!f())
        {
            k = 0;
            return false;
        } else
        {
            k = 1;
            return true;
        }
    }

    public boolean k()
    {
        return (4 & e) == 4;
    }

    public boolean l()
    {
        return i;
    }

    public boolean m()
    {
        return (8 & e) == 8;
    }

    public an n()
    {
        return t();
    }

    public an o()
    {
        return s();
    }

    public am p()
    {
        return b();
    }

    public boolean q()
    {
        return j;
    }

    public com.google.analytics.a.a.k s()
    {
        return r();
    }

    public com.google.analytics.a.a.k t()
    {
        return a(this);
    }

    static 
    {
        c = new i(true);
        c.u();
    }
}
