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
import com.google.tagmanager.a.m;
import com.google.tagmanager.a.o;
import com.google.tagmanager.a.t;
import com.google.tagmanager.a.v;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.analytics.a.a:
//            x, v, w, b

public final class u extends t
    implements x
{

    public static aq a = new com.google.analytics.a.a.v();
    private static final u c;
    private static volatile ap q = null;
    private final h d;
    private List e;
    private List f;
    private List g;
    private List h;
    private List i;
    private List j;
    private List k;
    private List l;
    private List m;
    private List n;
    private byte o;
    private int p;

    private u(k k1, o o1)
    {
        int i1;
        j j1;
        m m1;
        boolean flag;
        o = -1;
        p = -1;
        E();
        i1 = 0;
        j1 = com.google.tagmanager.a.h.i();
        m1 = com.google.tagmanager.a.m.a(j1);
        flag = false;
_L31:
        if (flag) goto _L2; else goto _L1
_L1:
        int l1 = k1.a();
        l1;
        JVM INSTR lookupswitch 21: default 228
    //                   0: 2003
    //                   8: 247
    //                   10: 521
    //                   16: 615
    //                   18: 657
    //                   24: 732
    //                   26: 774
    //                   32: 849
    //                   34: 894
    //                   40: 972
    //                   42: 1017
    //                   48: 1095
    //                   50: 1140
    //                   56: 1218
    //                   58: 1263
    //                   64: 1341
    //                   66: 1389
    //                   72: 1470
    //                   74: 1518
    //                   80: 1599
    //                   82: 1647;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24
_L3:
        if (!a(k1, m1, o1, l1))
        {
            flag = true;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if ((i1 & 1) == 1)
        {
            break MISSING_BLOCK_LABEL_269;
        }
        e = new ArrayList();
        i1 |= 1;
        e.add(Integer.valueOf(k1.f()));
        continue; /* Loop/switch isn't completed */
        af af1;
        af1;
        throw af1.a(this);
        Exception exception1;
        exception1;
        if ((i1 & 1) == 1)
        {
            e = Collections.unmodifiableList(e);
        }
        if ((i1 & 2) == 2)
        {
            f = Collections.unmodifiableList(f);
        }
        if ((i1 & 4) == 4)
        {
            g = Collections.unmodifiableList(g);
        }
        if ((i1 & 8) == 8)
        {
            h = Collections.unmodifiableList(h);
        }
        if ((i1 & 0x10) == 16)
        {
            i = Collections.unmodifiableList(i);
        }
        if ((i1 & 0x20) == 32)
        {
            j = Collections.unmodifiableList(j);
        }
        if ((i1 & 0x40) == 64)
        {
            k = Collections.unmodifiableList(k);
        }
        if ((i1 & 0x80) == 128)
        {
            l = Collections.unmodifiableList(l);
        }
        if ((i1 & 0x100) == 256)
        {
            m = Collections.unmodifiableList(m);
        }
        if ((i1 & 0x200) == 512)
        {
            n = Collections.unmodifiableList(n);
        }
        m1.a();
        d = j1.a();
_L29:
        R();
        throw exception1;
_L6:
        int j4 = k1.c(k1.s());
        if ((i1 & 1) == 1)
        {
            break MISSING_BLOCK_LABEL_560;
        }
        if (k1.w() <= 0)
        {
            break MISSING_BLOCK_LABEL_560;
        }
        e = new ArrayList();
        i1 |= 1;
        for (; k1.w() > 0; e.add(Integer.valueOf(k1.f()))) { }
          goto _L25
        IOException ioexception1;
        ioexception1;
        throw (new af(ioexception1.getMessage())).a(this);
_L25:
        k1.d(j4);
        continue; /* Loop/switch isn't completed */
_L7:
        if ((i1 & 2) == 2)
        {
            break MISSING_BLOCK_LABEL_637;
        }
        f = new ArrayList();
        i1 |= 2;
        f.add(Integer.valueOf(k1.f()));
        continue; /* Loop/switch isn't completed */
_L8:
        int i4 = k1.c(k1.s());
        if ((i1 & 2) == 2)
        {
            break MISSING_BLOCK_LABEL_696;
        }
        if (k1.w() <= 0)
        {
            break MISSING_BLOCK_LABEL_696;
        }
        f = new ArrayList();
        i1 |= 2;
        for (; k1.w() > 0; f.add(Integer.valueOf(k1.f()))) { }
        k1.d(i4);
        continue; /* Loop/switch isn't completed */
_L9:
        if ((i1 & 4) == 4)
        {
            break MISSING_BLOCK_LABEL_754;
        }
        g = new ArrayList();
        i1 |= 4;
        g.add(Integer.valueOf(k1.f()));
        continue; /* Loop/switch isn't completed */
_L10:
        int l3 = k1.c(k1.s());
        if ((i1 & 4) == 4)
        {
            break MISSING_BLOCK_LABEL_813;
        }
        if (k1.w() <= 0)
        {
            break MISSING_BLOCK_LABEL_813;
        }
        g = new ArrayList();
        i1 |= 4;
        for (; k1.w() > 0; g.add(Integer.valueOf(k1.f()))) { }
        k1.d(l3);
        continue; /* Loop/switch isn't completed */
_L11:
        if ((i1 & 8) == 8)
        {
            break MISSING_BLOCK_LABEL_874;
        }
        h = new ArrayList();
        i1 |= 8;
        h.add(Integer.valueOf(k1.f()));
        continue; /* Loop/switch isn't completed */
_L12:
        int k3 = k1.c(k1.s());
        if ((i1 & 8) == 8)
        {
            break MISSING_BLOCK_LABEL_936;
        }
        if (k1.w() <= 0)
        {
            break MISSING_BLOCK_LABEL_936;
        }
        h = new ArrayList();
        i1 |= 8;
        for (; k1.w() > 0; h.add(Integer.valueOf(k1.f()))) { }
        k1.d(k3);
        continue; /* Loop/switch isn't completed */
_L13:
        if ((i1 & 0x10) == 16)
        {
            break MISSING_BLOCK_LABEL_997;
        }
        i = new ArrayList();
        i1 |= 0x10;
        i.add(Integer.valueOf(k1.f()));
        continue; /* Loop/switch isn't completed */
_L14:
        int j3 = k1.c(k1.s());
        if ((i1 & 0x10) == 16)
        {
            break MISSING_BLOCK_LABEL_1059;
        }
        if (k1.w() <= 0)
        {
            break MISSING_BLOCK_LABEL_1059;
        }
        i = new ArrayList();
        i1 |= 0x10;
        for (; k1.w() > 0; i.add(Integer.valueOf(k1.f()))) { }
        k1.d(j3);
        continue; /* Loop/switch isn't completed */
_L15:
        if ((i1 & 0x20) == 32)
        {
            break MISSING_BLOCK_LABEL_1120;
        }
        j = new ArrayList();
        i1 |= 0x20;
        j.add(Integer.valueOf(k1.f()));
        continue; /* Loop/switch isn't completed */
_L16:
        int i3 = k1.c(k1.s());
        if ((i1 & 0x20) == 32)
        {
            break MISSING_BLOCK_LABEL_1182;
        }
        if (k1.w() <= 0)
        {
            break MISSING_BLOCK_LABEL_1182;
        }
        j = new ArrayList();
        i1 |= 0x20;
        for (; k1.w() > 0; j.add(Integer.valueOf(k1.f()))) { }
        k1.d(i3);
        continue; /* Loop/switch isn't completed */
_L17:
        if ((i1 & 0x40) == 64)
        {
            break MISSING_BLOCK_LABEL_1243;
        }
        k = new ArrayList();
        i1 |= 0x40;
        k.add(Integer.valueOf(k1.f()));
        continue; /* Loop/switch isn't completed */
_L18:
        int l2 = k1.c(k1.s());
        if ((i1 & 0x40) == 64)
        {
            break MISSING_BLOCK_LABEL_1305;
        }
        if (k1.w() <= 0)
        {
            break MISSING_BLOCK_LABEL_1305;
        }
        k = new ArrayList();
        i1 |= 0x40;
        for (; k1.w() > 0; k.add(Integer.valueOf(k1.f()))) { }
        k1.d(l2);
        continue; /* Loop/switch isn't completed */
_L19:
        if ((i1 & 0x80) == 128)
        {
            break MISSING_BLOCK_LABEL_1369;
        }
        l = new ArrayList();
        i1 |= 0x80;
        l.add(Integer.valueOf(k1.f()));
        continue; /* Loop/switch isn't completed */
_L20:
        int k2 = k1.c(k1.s());
        if ((i1 & 0x80) == 128)
        {
            break MISSING_BLOCK_LABEL_1434;
        }
        if (k1.w() <= 0)
        {
            break MISSING_BLOCK_LABEL_1434;
        }
        l = new ArrayList();
        i1 |= 0x80;
        for (; k1.w() > 0; l.add(Integer.valueOf(k1.f()))) { }
        k1.d(k2);
        continue; /* Loop/switch isn't completed */
_L21:
        if ((i1 & 0x100) == 256)
        {
            break MISSING_BLOCK_LABEL_1498;
        }
        m = new ArrayList();
        i1 |= 0x100;
        m.add(Integer.valueOf(k1.f()));
        continue; /* Loop/switch isn't completed */
_L22:
        int j2 = k1.c(k1.s());
        if ((i1 & 0x100) == 256)
        {
            break MISSING_BLOCK_LABEL_1563;
        }
        if (k1.w() <= 0)
        {
            break MISSING_BLOCK_LABEL_1563;
        }
        m = new ArrayList();
        i1 |= 0x100;
        for (; k1.w() > 0; m.add(Integer.valueOf(k1.f()))) { }
        k1.d(j2);
        continue; /* Loop/switch isn't completed */
_L23:
        if ((i1 & 0x200) == 512)
        {
            break MISSING_BLOCK_LABEL_1627;
        }
        n = new ArrayList();
        i1 |= 0x200;
        n.add(Integer.valueOf(k1.f()));
        continue; /* Loop/switch isn't completed */
_L24:
        int i2 = k1.c(k1.s());
        if ((i1 & 0x200) == 512)
        {
            break MISSING_BLOCK_LABEL_1692;
        }
        if (k1.w() <= 0)
        {
            break MISSING_BLOCK_LABEL_1692;
        }
        n = new ArrayList();
        i1 |= 0x200;
        for (; k1.w() > 0; n.add(Integer.valueOf(k1.f()))) { }
        k1.d(i2);
        continue; /* Loop/switch isn't completed */
_L2:
        if ((i1 & 1) == 1)
        {
            e = Collections.unmodifiableList(e);
        }
        if ((i1 & 2) == 2)
        {
            f = Collections.unmodifiableList(f);
        }
        if ((i1 & 4) == 4)
        {
            g = Collections.unmodifiableList(g);
        }
        if ((i1 & 8) == 8)
        {
            h = Collections.unmodifiableList(h);
        }
        if ((i1 & 0x10) == 16)
        {
            i = Collections.unmodifiableList(i);
        }
        if ((i1 & 0x20) == 32)
        {
            j = Collections.unmodifiableList(j);
        }
        if ((i1 & 0x40) == 64)
        {
            k = Collections.unmodifiableList(k);
        }
        if ((i1 & 0x80) == 128)
        {
            l = Collections.unmodifiableList(l);
        }
        if ((i1 & 0x100) == 256)
        {
            m = Collections.unmodifiableList(m);
        }
        if ((i1 & 0x200) == 512)
        {
            n = Collections.unmodifiableList(n);
        }
        m1.a();
        d = j1.a();
_L27:
        R();
        return;
        IOException ioexception;
        ioexception;
        d = j1.a();
        if (true) goto _L27; else goto _L26
_L26:
        Exception exception;
        exception;
        d = j1.a();
        throw exception;
        IOException ioexception2;
        ioexception2;
        d = j1.a();
        if (true) goto _L29; else goto _L28
_L28:
        Exception exception2;
        exception2;
        d = j1.a();
        throw exception2;
_L4:
        flag = true;
        if (true) goto _L31; else goto _L30
_L30:
    }

    u(k k1, o o1, b b1)
    {
        this(k1, o1);
    }

    private u(v v1)
    {
        super(v1);
        o = -1;
        p = -1;
        d = v1.r();
    }

    u(v v1, b b1)
    {
        this(v1);
    }

    private u(boolean flag)
    {
        o = -1;
        p = -1;
        d = h.a;
    }

    public static w B()
    {
        return com.google.analytics.a.a.w.i();
    }

    private void E()
    {
        e = Collections.emptyList();
        f = Collections.emptyList();
        g = Collections.emptyList();
        h = Collections.emptyList();
        i = Collections.emptyList();
        j = Collections.emptyList();
        k = Collections.emptyList();
        l = Collections.emptyList();
        m = Collections.emptyList();
        n = Collections.emptyList();
    }

    public static u a()
    {
        return c;
    }

    public static w a(u u1)
    {
        return B().a(u1);
    }

    static List a(u u1, List list)
    {
        u1.e = list;
        return list;
    }

    static List b(u u1)
    {
        return u1.e;
    }

    static List b(u u1, List list)
    {
        u1.f = list;
        return list;
    }

    static List c(u u1)
    {
        return u1.f;
    }

    static List c(u u1, List list)
    {
        u1.g = list;
        return list;
    }

    static List d(u u1)
    {
        return u1.g;
    }

    static List d(u u1, List list)
    {
        u1.h = list;
        return list;
    }

    static List e(u u1)
    {
        return u1.h;
    }

    static List e(u u1, List list)
    {
        u1.i = list;
        return list;
    }

    static List f(u u1)
    {
        return u1.i;
    }

    static List f(u u1, List list)
    {
        u1.j = list;
        return list;
    }

    static List g(u u1)
    {
        return u1.j;
    }

    static List g(u u1, List list)
    {
        u1.k = list;
        return list;
    }

    static List h(u u1)
    {
        return u1.k;
    }

    static List h(u u1, List list)
    {
        u1.l = list;
        return list;
    }

    static List i(u u1)
    {
        return u1.l;
    }

    static List i(u u1, List list)
    {
        u1.m = list;
        return list;
    }

    static List j(u u1)
    {
        return u1.m;
    }

    static List j(u u1, List list)
    {
        u1.n = list;
        return list;
    }

    static List k(u u1)
    {
        return u1.n;
    }

    static h l(u u1)
    {
        return u1.d;
    }

    public int A()
    {
        return n.size();
    }

    public w C()
    {
        return B();
    }

    public w D()
    {
        return a(this);
    }

    public u b()
    {
        return c;
    }

    public aq c()
    {
        return a;
    }

    public List d()
    {
        return e;
    }

    public int e()
    {
        return e.size();
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof u))
            {
                return super.equals(obj);
            }
            u u1 = (u)obj;
            boolean flag;
            boolean flag1;
            boolean flag2;
            boolean flag3;
            boolean flag4;
            boolean flag5;
            boolean flag6;
            boolean flag7;
            boolean flag8;
            if (d().equals(u1.d()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && f().equals(u1.f()))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1 && h().equals(u1.h()))
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (flag2 && k().equals(u1.k()))
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            if (flag3 && m().equals(u1.m()))
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            if (flag4 && r().equals(u1.r()))
            {
                flag5 = true;
            } else
            {
                flag5 = false;
            }
            if (flag5 && t().equals(u1.t()))
            {
                flag6 = true;
            } else
            {
                flag6 = false;
            }
            if (flag6 && v().equals(u1.v()))
            {
                flag7 = true;
            } else
            {
                flag7 = false;
            }
            if (flag7 && x().equals(u1.x()))
            {
                flag8 = true;
            } else
            {
                flag8 = false;
            }
            if (!flag8 || !z().equals(u1.z()))
            {
                return false;
            }
        }
        return true;
    }

    public List f()
    {
        return f;
    }

    public int g()
    {
        return f.size();
    }

    public List h()
    {
        return g;
    }

    public int hashCode()
    {
        if (b != 0)
        {
            return b;
        }
        int i1 = 779 + com/google/analytics/a/a/u.hashCode();
        if (e() > 0)
        {
            i1 = 53 * (1 + i1 * 37) + d().hashCode();
        }
        if (g() > 0)
        {
            i1 = 53 * (2 + i1 * 37) + f().hashCode();
        }
        if (i() > 0)
        {
            i1 = 53 * (3 + i1 * 37) + h().hashCode();
        }
        if (l() > 0)
        {
            i1 = 53 * (4 + i1 * 37) + k().hashCode();
        }
        if (q() > 0)
        {
            i1 = 53 * (5 + i1 * 37) + m().hashCode();
        }
        if (s() > 0)
        {
            i1 = 53 * (6 + i1 * 37) + r().hashCode();
        }
        if (u() > 0)
        {
            i1 = 53 * (7 + i1 * 37) + t().hashCode();
        }
        if (w() > 0)
        {
            i1 = 53 * (8 + i1 * 37) + v().hashCode();
        }
        if (y() > 0)
        {
            i1 = 53 * (9 + i1 * 37) + x().hashCode();
        }
        if (A() > 0)
        {
            i1 = 53 * (10 + i1 * 37) + z().hashCode();
        }
        int j1 = i1 * 29 + d.hashCode();
        b = j1;
        return j1;
    }

    public int i()
    {
        return g.size();
    }

    public final boolean j()
    {
        byte byte0 = o;
        if (byte0 != -1)
        {
            return byte0 == 1;
        } else
        {
            o = 1;
            return true;
        }
    }

    public List k()
    {
        return h;
    }

    public int l()
    {
        return h.size();
    }

    public List m()
    {
        return i;
    }

    public an n()
    {
        return D();
    }

    public an o()
    {
        return C();
    }

    public am p()
    {
        return b();
    }

    public int q()
    {
        return i.size();
    }

    public List r()
    {
        return j;
    }

    public int s()
    {
        return j.size();
    }

    public List t()
    {
        return k;
    }

    public int u()
    {
        return k.size();
    }

    public List v()
    {
        return l;
    }

    public int w()
    {
        return l.size();
    }

    public List x()
    {
        return m;
    }

    public int y()
    {
        return m.size();
    }

    public List z()
    {
        return n;
    }

    static 
    {
        c = new u(true);
        c.E();
    }
}
