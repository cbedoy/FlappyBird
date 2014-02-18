// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.b.a.a;

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
import com.google.tagmanager.a.w;
import com.google.tagmanager.a.x;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.analytics.b.a.a:
//            j, d, h, f, 
//            e, b

public final class c extends x
    implements com.google.analytics.b.a.a.j
{

    public static aq a = new d();
    private static final c c;
    private static volatile ap t = null;
    private final h d;
    private int e;
    private com.google.analytics.b.a.a.h f;
    private Object g;
    private List h;
    private List i;
    private List j;
    private Object k;
    private Object l;
    private long m;
    private boolean n;
    private List o;
    private List p;
    private boolean q;
    private byte r;
    private int s;

    private c(k k1, o o1)
    {
        int i1;
        j j1;
        m m1;
        boolean flag;
        r = -1;
        s = -1;
        J();
        i1 = 0;
        j1 = com.google.tagmanager.a.h.i();
        m1 = com.google.tagmanager.a.m.a(j1);
        flag = false;
_L54:
        if (flag) goto _L2; else goto _L1
_L1:
        int l1 = k1.a();
        l1;
        JVM INSTR lookupswitch 14: default 172
    //                   0: 1308
    //                   8: 194
    //                   18: 262
    //                   26: 294
    //                   34: 350
    //                   42: 409
    //                   50: 468
    //                   58: 500
    //                   64: 533
    //                   72: 562
    //                   80: 591
    //                   82: 689
    //                   90: 978
    //                   96: 1040;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17
_L3:
        if (a(k1, m1, o1, l1)) goto _L19; else goto _L18
_L18:
        boolean flag1;
        int i2;
        flag1 = true;
        i2 = i1;
          goto _L20
_L5:
        int j3;
        com.google.analytics.b.a.a.h h4;
        j3 = k1.n();
        h4 = com.google.analytics.b.a.a.h.a(j3);
        if (h4 != null) goto _L22; else goto _L21
_L21:
        m1.d(l1);
        m1.d(j3);
        flag1 = flag;
        i2 = i1;
          goto _L20
_L22:
        e = 1 | e;
        f = h4;
        flag1 = flag;
        i2 = i1;
          goto _L20
_L6:
        h h3 = k1.l();
        e = 2 | e;
        g = h3;
        flag1 = flag;
        i2 = i1;
          goto _L20
_L7:
        if ((i1 & 4) == 4) goto _L24; else goto _L23
_L23:
        h = new ArrayList();
        int j2 = i1 | 4;
_L53:
        h.add(k1.a(a, o1));
        boolean flag7 = flag;
        i2 = j2;
        flag1 = flag7;
        break; /* Loop/switch isn't completed */
_L8:
        if ((i1 & 8) == 8) goto _L26; else goto _L25
_L25:
        i = new ArrayList();
        j2 = i1 | 8;
_L52:
        i.add(k1.a(a, o1));
        boolean flag6 = flag;
        i2 = j2;
        flag1 = flag6;
        break; /* Loop/switch isn't completed */
_L9:
        if ((i1 & 0x10) == 16) goto _L28; else goto _L27
_L27:
        j = new ArrayList();
        j2 = i1 | 0x10;
_L50:
        j.add(k1.a(a, o1));
        boolean flag5 = flag;
        i2 = j2;
        flag1 = flag5;
        break; /* Loop/switch isn't completed */
_L10:
        h h2 = k1.l();
        e = 4 | e;
        k = h2;
        flag1 = flag;
        i2 = i1;
        break; /* Loop/switch isn't completed */
_L11:
        h h1 = k1.l();
        e = 8 | e;
        l = h1;
        flag1 = flag;
        i2 = i1;
        break; /* Loop/switch isn't completed */
_L12:
        e = 0x10 | e;
        m = k1.e();
        flag1 = flag;
        i2 = i1;
        break; /* Loop/switch isn't completed */
_L13:
        e = 0x40 | e;
        q = k1.i();
        flag1 = flag;
        i2 = i1;
        break; /* Loop/switch isn't completed */
_L14:
        int i3;
        f f2;
        i3 = k1.n();
        f2 = com.google.analytics.b.a.a.f.a(i3);
        if (f2 != null) goto _L30; else goto _L29
_L29:
        m1.d(l1);
        m1.d(i3);
        flag1 = flag;
        i2 = i1;
        break; /* Loop/switch isn't completed */
_L30:
        if ((i1 & 0x400) == 1024) goto _L32; else goto _L31
_L31:
        p = new ArrayList();
        j2 = i1 | 0x400;
_L48:
        p.add(f2);
        boolean flag4 = flag;
        i2 = j2;
        flag1 = flag4;
        break; /* Loop/switch isn't completed */
_L15:
        int k2 = k1.c(k1.s());
        j2 = i1;
_L37:
        if (k1.w() <= 0) goto _L34; else goto _L33
_L33:
        int l2;
        f f1;
        l2 = k1.n();
        f1 = com.google.analytics.b.a.a.f.a(l2);
        if (f1 != null) goto _L36; else goto _L35
_L35:
        m1.d(l1);
        m1.d(l2);
          goto _L37
        af af2;
        af2;
        af af1;
        i1 = j2;
        af1 = af2;
_L45:
        throw af1.a(this);
        Exception exception1;
        exception1;
_L43:
        if ((i1 & 4) == 4)
        {
            h = Collections.unmodifiableList(h);
        }
        if ((i1 & 8) == 8)
        {
            i = Collections.unmodifiableList(i);
        }
        if ((i1 & 0x10) == 16)
        {
            j = Collections.unmodifiableList(j);
        }
        if ((i1 & 0x400) == 1024)
        {
            p = Collections.unmodifiableList(p);
        }
        if ((i1 & 0x200) == 512)
        {
            o = Collections.unmodifiableList(o);
        }
        m1.a();
        d = j1.a();
_L42:
        R();
        throw exception1;
_L36:
        if ((j2 & 0x400) == 1024)
        {
            break MISSING_BLOCK_LABEL_916;
        }
        p = new ArrayList();
        j2 |= 0x400;
        p.add(f1);
          goto _L37
        IOException ioexception3;
        ioexception3;
        IOException ioexception2;
        i1 = j2;
        ioexception2 = ioexception3;
_L44:
        throw (new af(ioexception2.getMessage())).a(this);
_L34:
        k1.d(k2);
        boolean flag3 = flag;
        i2 = j2;
        flag1 = flag3;
        break; /* Loop/switch isn't completed */
_L16:
        if ((i1 & 0x200) == 512) goto _L39; else goto _L38
_L38:
        o = new ArrayList();
        j2 = i1 | 0x200;
_L46:
        o.add(k1.a(a, o1));
        boolean flag2 = flag;
        i2 = j2;
        flag1 = flag2;
        break; /* Loop/switch isn't completed */
_L17:
        e = 0x20 | e;
        n = k1.i();
_L19:
        flag1 = flag;
        i2 = i1;
        break; /* Loop/switch isn't completed */
_L2:
        if ((i1 & 4) == 4)
        {
            h = Collections.unmodifiableList(h);
        }
        if ((i1 & 8) == 8)
        {
            i = Collections.unmodifiableList(i);
        }
        if ((i1 & 0x10) == 16)
        {
            j = Collections.unmodifiableList(j);
        }
        if ((i1 & 0x400) == 1024)
        {
            p = Collections.unmodifiableList(p);
        }
        if ((i1 & 0x200) == 512)
        {
            o = Collections.unmodifiableList(o);
        }
        m1.a();
        d = j1.a();
_L41:
        R();
        return;
        IOException ioexception;
        ioexception;
        d = j1.a();
        if (true) goto _L41; else goto _L40
_L40:
        Exception exception;
        exception;
        d = j1.a();
        throw exception;
        IOException ioexception1;
        ioexception1;
        d = j1.a();
          goto _L42
        Exception exception2;
        exception2;
        d = j1.a();
        throw exception2;
        Exception exception3;
        exception3;
        i1 = j2;
        exception1 = exception3;
          goto _L43
        ioexception2;
          goto _L44
        af1;
          goto _L45
_L39:
        j2 = i1;
          goto _L46
_L32:
        j2 = i1;
        if (true) goto _L48; else goto _L47
_L47:
        break; /* Loop/switch isn't completed */
_L28:
        j2 = i1;
        if (true) goto _L50; else goto _L49
_L49:
        break; /* Loop/switch isn't completed */
_L26:
        j2 = i1;
        if (true) goto _L52; else goto _L51
_L51:
        break; /* Loop/switch isn't completed */
_L24:
        j2 = i1;
        if (true) goto _L53; else goto _L20
_L20:
        i1 = i2;
        flag = flag1;
          goto _L54
_L4:
        flag1 = true;
        i2 = i1;
          goto _L20
    }

    c(k k1, o o1, b b1)
    {
        this(k1, o1);
    }

    private c(w w1)
    {
        super(w1);
        r = -1;
        s = -1;
        d = w1.r();
    }

    c(w w1, b b1)
    {
        this(w1);
    }

    private c(boolean flag)
    {
        r = -1;
        s = -1;
        d = h.a;
    }

    public static e F()
    {
        return com.google.analytics.b.a.a.e.q();
    }

    private void J()
    {
        f = h.a;
        g = "";
        h = Collections.emptyList();
        i = Collections.emptyList();
        j = Collections.emptyList();
        k = "";
        l = "";
        m = 0L;
        n = false;
        o = Collections.emptyList();
        p = Collections.emptyList();
        q = false;
    }

    static int a(c c1, int i1)
    {
        c1.e = i1;
        return i1;
    }

    static long a(c c1, long l1)
    {
        c1.m = l1;
        return l1;
    }

    public static c a()
    {
        return c;
    }

    public static e a(c c1)
    {
        return F().a(c1);
    }

    static com.google.analytics.b.a.a.h a(c c1, com.google.analytics.b.a.a.h h1)
    {
        c1.f = h1;
        return h1;
    }

    static Object a(c c1, Object obj)
    {
        c1.g = obj;
        return obj;
    }

    static List a(c c1, List list)
    {
        c1.h = list;
        return list;
    }

    static boolean a(c c1, boolean flag)
    {
        c1.n = flag;
        return flag;
    }

    static Object b(c c1)
    {
        return c1.g;
    }

    static Object b(c c1, Object obj)
    {
        c1.k = obj;
        return obj;
    }

    static List b(c c1, List list)
    {
        c1.i = list;
        return list;
    }

    static boolean b(c c1, boolean flag)
    {
        c1.q = flag;
        return flag;
    }

    static Object c(c c1, Object obj)
    {
        c1.l = obj;
        return obj;
    }

    static List c(c c1)
    {
        return c1.h;
    }

    static List c(c c1, List list)
    {
        c1.j = list;
        return list;
    }

    static List d(c c1)
    {
        return c1.i;
    }

    static List d(c c1, List list)
    {
        c1.o = list;
        return list;
    }

    static List e(c c1)
    {
        return c1.j;
    }

    static List e(c c1, List list)
    {
        c1.p = list;
        return list;
    }

    static Object f(c c1)
    {
        return c1.k;
    }

    static Object g(c c1)
    {
        return c1.l;
    }

    static List h(c c1)
    {
        return c1.o;
    }

    static List i(c c1)
    {
        return c1.p;
    }

    static h j(c c1)
    {
        return c1.d;
    }

    public int A()
    {
        return o.size();
    }

    public List B()
    {
        return p;
    }

    public int C()
    {
        return p.size();
    }

    public boolean D()
    {
        return (0x40 & e) == 64;
    }

    public boolean E()
    {
        return q;
    }

    public e G()
    {
        return F();
    }

    public e H()
    {
        return a(this);
    }

    public c a(int i1)
    {
        return (c)h.get(i1);
    }

    public c b()
    {
        return c;
    }

    public c b(int i1)
    {
        return (c)i.get(i1);
    }

    public c c(int i1)
    {
        return (c)j.get(i1);
    }

    public aq c()
    {
        return a;
    }

    public c d(int i1)
    {
        return (c)o.get(i1);
    }

    public boolean d()
    {
        return (1 & e) == 1;
    }

    public com.google.analytics.b.a.a.h e()
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
            boolean flag3;
            boolean flag4;
            boolean flag5;
            boolean flag6;
            boolean flag7;
            boolean flag8;
            boolean flag9;
            boolean flag10;
            boolean flag11;
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
                if (flag1 && g().equals(c1.g()))
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
            }
            if (flag1 && h().equals(c1.h()))
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (flag2 && k().equals(c1.k()))
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            if (flag3 && m().equals(c1.m()))
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            if (flag4 && r() == c1.r())
            {
                flag5 = true;
            } else
            {
                flag5 = false;
            }
            if (r())
            {
                if (flag5 && s().equals(c1.s()))
                {
                    flag5 = true;
                } else
                {
                    flag5 = false;
                }
            }
            if (flag5 && t() == c1.t())
            {
                flag6 = true;
            } else
            {
                flag6 = false;
            }
            if (t())
            {
                if (flag6 && u().equals(c1.u()))
                {
                    flag6 = true;
                } else
                {
                    flag6 = false;
                }
            }
            if (flag6 && v() == c1.v())
            {
                flag7 = true;
            } else
            {
                flag7 = false;
            }
            if (v())
            {
                if (flag7 && w() == c1.w())
                {
                    flag7 = true;
                } else
                {
                    flag7 = false;
                }
            }
            if (flag7 && x() == c1.x())
            {
                flag8 = true;
            } else
            {
                flag8 = false;
            }
            if (x())
            {
                if (flag8 && y() == c1.y())
                {
                    flag8 = true;
                } else
                {
                    flag8 = false;
                }
            }
            if (flag8 && z().equals(c1.z()))
            {
                flag9 = true;
            } else
            {
                flag9 = false;
            }
            if (flag9 && B().equals(c1.B()))
            {
                flag10 = true;
            } else
            {
                flag10 = false;
            }
            if (flag10 && D() == c1.D())
            {
                flag11 = true;
            } else
            {
                flag11 = false;
            }
            if (D())
            {
                if (!flag11 || E() != c1.E())
                {
                    return false;
                }
            } else
            {
                return flag11;
            }
        }
        return true;
    }

    public boolean f()
    {
        return (2 & e) == 2;
    }

    public String g()
    {
        Object obj = g;
        if (obj instanceof String)
        {
            return (String)obj;
        }
        h h1 = (h)obj;
        String s1 = h1.f();
        if (h1.g())
        {
            g = s1;
        }
        return s1;
    }

    public List h()
    {
        return h;
    }

    public int hashCode()
    {
        if (b != 0)
        {
            return b;
        }
        int i1 = 779 + com/google/analytics/b/a/a/c.hashCode();
        if (d())
        {
            i1 = 53 * (1 + i1 * 37) + ac.a(e());
        }
        if (f())
        {
            i1 = 53 * (2 + i1 * 37) + g().hashCode();
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
        if (r())
        {
            i1 = 53 * (6 + i1 * 37) + s().hashCode();
        }
        if (t())
        {
            i1 = 53 * (7 + i1 * 37) + u().hashCode();
        }
        if (v())
        {
            i1 = 53 * (8 + i1 * 37) + ac.a(w());
        }
        if (x())
        {
            i1 = 53 * (12 + i1 * 37) + ac.a(y());
        }
        if (A() > 0)
        {
            i1 = 53 * (11 + i1 * 37) + z().hashCode();
        }
        if (C() > 0)
        {
            i1 = 53 * (10 + i1 * 37) + ac.a(B());
        }
        if (D())
        {
            i1 = 53 * (9 + i1 * 37) + ac.a(E());
        }
        int j1 = i1 * 29 + d.hashCode();
        b = j1;
        return j1;
    }

    public int i()
    {
        return h.size();
    }

    public final boolean j()
    {
        boolean flag = true;
        byte byte0 = r;
        if (byte0 != -1)
        {
            if (byte0 != flag)
            {
                flag = false;
            }
            return flag;
        }
        if (!d())
        {
            r = 0;
            return false;
        }
        for (int i1 = 0; i1 < i(); i1++)
        {
            if (!a(i1).j())
            {
                r = 0;
                return false;
            }
        }

        for (int j1 = 0; j1 < l(); j1++)
        {
            if (!b(j1).j())
            {
                r = 0;
                return false;
            }
        }

        for (int k1 = 0; k1 < q(); k1++)
        {
            if (!c(k1).j())
            {
                r = 0;
                return false;
            }
        }

        for (int l1 = 0; l1 < A(); l1++)
        {
            if (!d(l1).j())
            {
                r = 0;
                return false;
            }
        }

        if (!I())
        {
            r = 0;
            return false;
        } else
        {
            r = flag;
            return flag;
        }
    }

    public List k()
    {
        return i;
    }

    public int l()
    {
        return i.size();
    }

    public List m()
    {
        return j;
    }

    public an n()
    {
        return H();
    }

    public an o()
    {
        return G();
    }

    public am p()
    {
        return b();
    }

    public int q()
    {
        return j.size();
    }

    public boolean r()
    {
        return (4 & e) == 4;
    }

    public String s()
    {
        Object obj = k;
        if (obj instanceof String)
        {
            return (String)obj;
        }
        h h1 = (h)obj;
        String s1 = h1.f();
        if (h1.g())
        {
            k = s1;
        }
        return s1;
    }

    public boolean t()
    {
        return (8 & e) == 8;
    }

    public String u()
    {
        Object obj = l;
        if (obj instanceof String)
        {
            return (String)obj;
        }
        h h1 = (h)obj;
        String s1 = h1.f();
        if (h1.g())
        {
            l = s1;
        }
        return s1;
    }

    public boolean v()
    {
        return (0x10 & e) == 16;
    }

    public long w()
    {
        return m;
    }

    public boolean x()
    {
        return (0x20 & e) == 32;
    }

    public boolean y()
    {
        return n;
    }

    public List z()
    {
        return o;
    }

    static 
    {
        c = new c(true);
        c.J();
    }
}
