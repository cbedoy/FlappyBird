// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.a.a;

import com.google.analytics.b.a.a.c;
import com.google.tagmanager.a.ac;
import com.google.tagmanager.a.af;
import com.google.tagmanager.a.ah;
import com.google.tagmanager.a.ai;
import com.google.tagmanager.a.am;
import com.google.tagmanager.a.an;
import com.google.tagmanager.a.ap;
import com.google.tagmanager.a.aq;
import com.google.tagmanager.a.bg;
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
//            t, r, m, i, 
//            u, c, e, s, 
//            b

public final class q extends t
    implements com.google.analytics.a.a.t
{

    public static aq a = new r();
    private static final q c;
    private static volatile ap x = null;
    private final h d;
    private int e;
    private ai f;
    private List g;
    private List h;
    private List i;
    private List j;
    private List k;
    private List l;
    private Object m;
    private Object n;
    private Object o;
    private Object p;
    private com.google.analytics.a.a.c q;
    private float r;
    private boolean s;
    private ai t;
    private int u;
    private byte v;
    private int w;

    private q(k k1, o o1)
    {
        int i1;
        j j1;
        m m1;
        boolean flag;
        v = -1;
        w = -1;
        S();
        i1 = 0;
        j1 = com.google.tagmanager.a.h.i();
        m1 = com.google.tagmanager.a.m.a(j1);
        flag = false;
_L66:
        if (flag) goto _L2; else goto _L1
_L1:
        int l1 = k1.a();
        l1;
        JVM INSTR lookupswitch 17: default 196
    //                   0: 1534
    //                   10: 218
    //                   18: 273
    //                   26: 329
    //                   34: 385
    //                   42: 444
    //                   50: 503
    //                   58: 562
    //                   74: 621
    //                   82: 653
    //                   98: 685
    //                   106: 717
    //                   114: 750
    //                   125: 831
    //                   130: 860
    //                   136: 921
    //                   144: 951;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20
_L3:
        if (a(k1, m1, o1, l1)) goto _L22; else goto _L21
_L21:
        boolean flag1;
        int i2;
        flag1 = true;
        i2 = i1;
          goto _L23
_L5:
        h h6 = k1.l();
        if ((i1 & 1) == 1) goto _L25; else goto _L24
_L24:
        f = new ah();
        int j2 = i1 | 1;
_L65:
        f.a(h6);
        boolean flag9 = flag;
        i2 = j2;
        flag1 = flag9;
        break; /* Loop/switch isn't completed */
_L6:
        if ((i1 & 2) == 2) goto _L27; else goto _L26
_L26:
        g = new ArrayList();
        j2 = i1 | 2;
_L64:
        g.add(k1.a(c.a, o1));
        boolean flag8 = flag;
        i2 = j2;
        flag1 = flag8;
        break; /* Loop/switch isn't completed */
_L7:
        if ((i1 & 4) == 4) goto _L29; else goto _L28
_L28:
        h = new ArrayList();
        j2 = i1 | 4;
_L62:
        h.add(k1.a(m.a, o1));
        boolean flag7 = flag;
        i2 = j2;
        flag1 = flag7;
        break; /* Loop/switch isn't completed */
_L8:
        if ((i1 & 8) == 8) goto _L31; else goto _L30
_L30:
        i = new ArrayList();
        j2 = i1 | 8;
_L60:
        i.add(k1.a(i.a, o1));
        boolean flag6 = flag;
        i2 = j2;
        flag1 = flag6;
        break; /* Loop/switch isn't completed */
_L9:
        if ((i1 & 0x10) == 16) goto _L33; else goto _L32
_L32:
        j = new ArrayList();
        j2 = i1 | 0x10;
_L58:
        j.add(k1.a(i.a, o1));
        boolean flag5 = flag;
        i2 = j2;
        flag1 = flag5;
        break; /* Loop/switch isn't completed */
_L10:
        if ((i1 & 0x20) == 32) goto _L35; else goto _L34
_L34:
        k = new ArrayList();
        j2 = i1 | 0x20;
_L56:
        k.add(k1.a(i.a, o1));
        boolean flag4 = flag;
        i2 = j2;
        flag1 = flag4;
        break; /* Loop/switch isn't completed */
_L11:
        if ((i1 & 0x40) == 64) goto _L37; else goto _L36
_L36:
        l = new ArrayList();
        j2 = i1 | 0x40;
_L54:
        l.add(k1.a(u.a, o1));
        boolean flag3 = flag;
        i2 = j2;
        flag1 = flag3;
        break; /* Loop/switch isn't completed */
_L12:
        h h5 = k1.l();
        e = 1 | e;
        m = h5;
        flag1 = flag;
        i2 = i1;
        break; /* Loop/switch isn't completed */
_L13:
        h h4 = k1.l();
        e = 2 | e;
        n = h4;
        flag1 = flag;
        i2 = i1;
        break; /* Loop/switch isn't completed */
_L14:
        h h3 = k1.l();
        e = 4 | e;
        o = h3;
        flag1 = flag;
        i2 = i1;
        break; /* Loop/switch isn't completed */
_L15:
        h h2 = k1.l();
        e = 8 | e;
        p = h2;
        flag1 = flag;
        i2 = i1;
        break; /* Loop/switch isn't completed */
_L16:
        if ((0x10 & e) != 16) goto _L39; else goto _L38
_L38:
        e e1 = q.m();
_L52:
        q = (com.google.analytics.a.a.c)k1.a(c.a, o1);
        if (e1 == null) goto _L41; else goto _L40
_L40:
        e1.a(q);
        q = e1.d();
_L41:
        e = 0x10 | e;
        flag1 = flag;
        i2 = i1;
        break; /* Loop/switch isn't completed */
_L17:
        e = 0x20 | e;
        r = k1.c();
        flag1 = flag;
        i2 = i1;
        break; /* Loop/switch isn't completed */
_L18:
        h h1 = k1.l();
        if ((i1 & 0x4000) == 16384) goto _L43; else goto _L42
_L42:
        t = new ah();
        j2 = i1 | 0x4000;
_L51:
        t.a(h1);
        boolean flag2 = flag;
        i2 = j2;
        flag1 = flag2;
        break; /* Loop/switch isn't completed */
_L19:
        e = 0x80 | e;
        u = k1.f();
        flag1 = flag;
        i2 = i1;
        break; /* Loop/switch isn't completed */
_L20:
        e = 0x40 | e;
        s = k1.i();
_L22:
        flag1 = flag;
        i2 = i1;
        break; /* Loop/switch isn't completed */
_L2:
        if ((i1 & 1) == 1)
        {
            f = new bg(f);
        }
        if ((i1 & 2) == 2)
        {
            g = Collections.unmodifiableList(g);
        }
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
        if ((i1 & 0x20) == 32)
        {
            k = Collections.unmodifiableList(k);
        }
        if ((i1 & 0x40) == 64)
        {
            l = Collections.unmodifiableList(l);
        }
        if ((i1 & 0x4000) == 16384)
        {
            t = new bg(t);
        }
        m1.a();
        d = j1.a();
_L45:
        R();
        return;
        IOException ioexception;
        ioexception;
        d = j1.a();
        if (true) goto _L45; else goto _L44
_L44:
        Exception exception;
        exception;
        d = j1.a();
        throw exception;
        af af1;
        af1;
_L49:
        throw af1.a(this);
        Exception exception1;
        exception1;
_L47:
        if ((i1 & 1) == 1)
        {
            f = new bg(f);
        }
        if ((i1 & 2) == 2)
        {
            g = Collections.unmodifiableList(g);
        }
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
        if ((i1 & 0x20) == 32)
        {
            k = Collections.unmodifiableList(k);
        }
        if ((i1 & 0x40) == 64)
        {
            l = Collections.unmodifiableList(l);
        }
        if ((i1 & 0x4000) == 16384)
        {
            t = new bg(t);
        }
        m1.a();
        d = j1.a();
_L46:
        R();
        throw exception1;
        IOException ioexception1;
        ioexception1;
_L48:
        throw (new af(ioexception1.getMessage())).a(this);
        IOException ioexception2;
        ioexception2;
        d = j1.a();
          goto _L46
        Exception exception2;
        exception2;
        d = j1.a();
        throw exception2;
        Exception exception3;
        exception3;
        i1 = j2;
        exception1 = exception3;
          goto _L47
        IOException ioexception3;
        ioexception3;
        i1 = j2;
        ioexception1 = ioexception3;
          goto _L48
        af af2;
        af2;
        i1 = j2;
        af1 = af2;
        if (true) goto _L49; else goto _L43
_L43:
        j2 = i1;
        if (true) goto _L51; else goto _L50
_L50:
        break; /* Loop/switch isn't completed */
_L39:
        e1 = null;
          goto _L52
_L37:
        j2 = i1;
        if (true) goto _L54; else goto _L53
_L53:
        break; /* Loop/switch isn't completed */
_L35:
        j2 = i1;
        if (true) goto _L56; else goto _L55
_L55:
        break; /* Loop/switch isn't completed */
_L33:
        j2 = i1;
        if (true) goto _L58; else goto _L57
_L57:
        break; /* Loop/switch isn't completed */
_L31:
        j2 = i1;
        if (true) goto _L60; else goto _L59
_L59:
        break; /* Loop/switch isn't completed */
_L29:
        j2 = i1;
        if (true) goto _L62; else goto _L61
_L61:
        break; /* Loop/switch isn't completed */
_L27:
        j2 = i1;
        if (true) goto _L64; else goto _L63
_L63:
        break; /* Loop/switch isn't completed */
_L25:
        j2 = i1;
        if (true) goto _L65; else goto _L23
_L23:
        i1 = i2;
        flag = flag1;
          goto _L66
_L4:
        flag1 = true;
        i2 = i1;
          goto _L23
    }

    q(k k1, o o1, b b1)
    {
        this(k1, o1);
    }

    private q(v v1)
    {
        super(v1);
        v = -1;
        w = -1;
        d = v1.r();
    }

    q(v v1, b b1)
    {
        this(v1);
    }

    private q(boolean flag)
    {
        v = -1;
        w = -1;
        d = h.a;
    }

    public static s N()
    {
        return com.google.analytics.a.a.s.o();
    }

    private void S()
    {
        f = ah.a;
        g = Collections.emptyList();
        h = Collections.emptyList();
        i = Collections.emptyList();
        j = Collections.emptyList();
        k = Collections.emptyList();
        l = Collections.emptyList();
        m = "";
        n = "";
        o = "0";
        p = "";
        q = com.google.analytics.a.a.c.a();
        r = 0.0F;
        s = false;
        t = ah.a;
        u = 0;
    }

    static float a(q q1, float f1)
    {
        q1.r = f1;
        return f1;
    }

    static int a(q q1, int i1)
    {
        q1.u = i1;
        return i1;
    }

    static com.google.analytics.a.a.c a(q q1, com.google.analytics.a.a.c c1)
    {
        q1.q = c1;
        return c1;
    }

    public static q a()
    {
        return c;
    }

    public static s a(q q1)
    {
        return N().a(q1);
    }

    static ai a(q q1, ai ai1)
    {
        q1.f = ai1;
        return ai1;
    }

    static Object a(q q1, Object obj)
    {
        q1.m = obj;
        return obj;
    }

    static List a(q q1, List list)
    {
        q1.g = list;
        return list;
    }

    static boolean a(q q1, boolean flag)
    {
        q1.s = flag;
        return flag;
    }

    static int b(q q1, int i1)
    {
        q1.e = i1;
        return i1;
    }

    static ai b(q q1)
    {
        return q1.f;
    }

    static ai b(q q1, ai ai1)
    {
        q1.t = ai1;
        return ai1;
    }

    static Object b(q q1, Object obj)
    {
        q1.n = obj;
        return obj;
    }

    static List b(q q1, List list)
    {
        q1.h = list;
        return list;
    }

    static Object c(q q1, Object obj)
    {
        q1.o = obj;
        return obj;
    }

    static List c(q q1)
    {
        return q1.g;
    }

    static List c(q q1, List list)
    {
        q1.i = list;
        return list;
    }

    static Object d(q q1, Object obj)
    {
        q1.p = obj;
        return obj;
    }

    static List d(q q1)
    {
        return q1.h;
    }

    static List d(q q1, List list)
    {
        q1.j = list;
        return list;
    }

    static List e(q q1)
    {
        return q1.i;
    }

    static List e(q q1, List list)
    {
        q1.k = list;
        return list;
    }

    static List f(q q1)
    {
        return q1.j;
    }

    static List f(q q1, List list)
    {
        q1.l = list;
        return list;
    }

    static List g(q q1)
    {
        return q1.k;
    }

    static List h(q q1)
    {
        return q1.l;
    }

    static Object i(q q1)
    {
        return q1.m;
    }

    static Object j(q q1)
    {
        return q1.n;
    }

    static Object k(q q1)
    {
        return q1.o;
    }

    static Object l(q q1)
    {
        return q1.p;
    }

    static ai m(q q1)
    {
        return q1.t;
    }

    static h n(q q1)
    {
        return q1.d;
    }

    public String A()
    {
        Object obj = o;
        if (obj instanceof String)
        {
            return (String)obj;
        }
        h h1 = (h)obj;
        String s1 = h1.f();
        if (h1.g())
        {
            o = s1;
        }
        return s1;
    }

    public boolean B()
    {
        return (8 & e) == 8;
    }

    public String C()
    {
        Object obj = p;
        if (obj instanceof String)
        {
            return (String)obj;
        }
        h h1 = (h)obj;
        String s1 = h1.f();
        if (h1.g())
        {
            p = s1;
        }
        return s1;
    }

    public boolean D()
    {
        return (0x10 & e) == 16;
    }

    public com.google.analytics.a.a.c E()
    {
        return q;
    }

    public boolean F()
    {
        return (0x20 & e) == 32;
    }

    public float G()
    {
        return r;
    }

    public boolean H()
    {
        return (0x40 & e) == 64;
    }

    public boolean I()
    {
        return s;
    }

    public List J()
    {
        return t;
    }

    public int K()
    {
        return t.size();
    }

    public boolean L()
    {
        return (0x80 & e) == 128;
    }

    public int M()
    {
        return u;
    }

    public s O()
    {
        return N();
    }

    public s P()
    {
        return a(this);
    }

    public c a(int i1)
    {
        return (c)g.get(i1);
    }

    public com.google.analytics.a.a.m b(int i1)
    {
        return (com.google.analytics.a.a.m)h.get(i1);
    }

    public q b()
    {
        return c;
    }

    public i c(int i1)
    {
        return (i)i.get(i1);
    }

    public aq c()
    {
        return a;
    }

    public i d(int i1)
    {
        return (i)j.get(i1);
    }

    public List d()
    {
        return f;
    }

    public int e()
    {
        return f.size();
    }

    public i e(int i1)
    {
        return (i)k.get(i1);
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof q))
            {
                return super.equals(obj);
            }
            q q1 = (q)obj;
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
            boolean flag12;
            boolean flag13;
            boolean flag14;
            boolean flag15;
            if (d().equals(q1.d()))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && f().equals(q1.f()))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1 && h().equals(q1.h()))
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (flag2 && k().equals(q1.k()))
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            if (flag3 && m().equals(q1.m()))
            {
                flag4 = true;
            } else
            {
                flag4 = false;
            }
            if (flag4 && r().equals(q1.r()))
            {
                flag5 = true;
            } else
            {
                flag5 = false;
            }
            if (flag5 && t().equals(q1.t()))
            {
                flag6 = true;
            } else
            {
                flag6 = false;
            }
            if (flag6 && v() == q1.v())
            {
                flag7 = true;
            } else
            {
                flag7 = false;
            }
            if (v())
            {
                if (flag7 && w().equals(q1.w()))
                {
                    flag7 = true;
                } else
                {
                    flag7 = false;
                }
            }
            if (flag7 && x() == q1.x())
            {
                flag8 = true;
            } else
            {
                flag8 = false;
            }
            if (x())
            {
                if (flag8 && y().equals(q1.y()))
                {
                    flag8 = true;
                } else
                {
                    flag8 = false;
                }
            }
            if (flag8 && z() == q1.z())
            {
                flag9 = true;
            } else
            {
                flag9 = false;
            }
            if (z())
            {
                if (flag9 && A().equals(q1.A()))
                {
                    flag9 = true;
                } else
                {
                    flag9 = false;
                }
            }
            if (flag9 && B() == q1.B())
            {
                flag10 = true;
            } else
            {
                flag10 = false;
            }
            if (B())
            {
                if (flag10 && C().equals(q1.C()))
                {
                    flag10 = true;
                } else
                {
                    flag10 = false;
                }
            }
            if (flag10 && D() == q1.D())
            {
                flag11 = true;
            } else
            {
                flag11 = false;
            }
            if (D())
            {
                if (flag11 && E().equals(q1.E()))
                {
                    flag11 = true;
                } else
                {
                    flag11 = false;
                }
            }
            if (flag11 && F() == q1.F())
            {
                flag12 = true;
            } else
            {
                flag12 = false;
            }
            if (F())
            {
                if (flag12 && Float.floatToIntBits(G()) == Float.floatToIntBits(q1.G()))
                {
                    flag12 = true;
                } else
                {
                    flag12 = false;
                }
            }
            if (flag12 && H() == q1.H())
            {
                flag13 = true;
            } else
            {
                flag13 = false;
            }
            if (H())
            {
                if (flag13 && I() == q1.I())
                {
                    flag13 = true;
                } else
                {
                    flag13 = false;
                }
            }
            if (flag13 && J().equals(q1.J()))
            {
                flag14 = true;
            } else
            {
                flag14 = false;
            }
            if (flag14 && L() == q1.L())
            {
                flag15 = true;
            } else
            {
                flag15 = false;
            }
            if (L())
            {
                if (!flag15 || M() != q1.M())
                {
                    return false;
                }
            } else
            {
                return flag15;
            }
        }
        return true;
    }

    public List f()
    {
        return g;
    }

    public int g()
    {
        return g.size();
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
        int i1 = 779 + com/google/analytics/a/a/q.hashCode();
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
        if (v())
        {
            i1 = 53 * (9 + i1 * 37) + w().hashCode();
        }
        if (x())
        {
            i1 = 53 * (10 + i1 * 37) + y().hashCode();
        }
        if (z())
        {
            i1 = 53 * (12 + i1 * 37) + A().hashCode();
        }
        if (B())
        {
            i1 = 53 * (13 + i1 * 37) + C().hashCode();
        }
        if (D())
        {
            i1 = 53 * (14 + i1 * 37) + E().hashCode();
        }
        if (F())
        {
            i1 = 53 * (15 + i1 * 37) + Float.floatToIntBits(G());
        }
        if (H())
        {
            i1 = 53 * (18 + i1 * 37) + ac.a(I());
        }
        if (K() > 0)
        {
            i1 = 53 * (16 + i1 * 37) + J().hashCode();
        }
        if (L())
        {
            i1 = 53 * (17 + i1 * 37) + M();
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
        byte byte0 = v;
        if (byte0 != -1)
        {
            if (byte0 != flag)
            {
                flag = false;
            }
            return flag;
        }
        for (int i1 = 0; i1 < g(); i1++)
        {
            if (!a(i1).j())
            {
                v = 0;
                return false;
            }
        }

        for (int j1 = 0; j1 < i(); j1++)
        {
            if (!b(j1).j())
            {
                v = 0;
                return false;
            }
        }

        for (int k1 = 0; k1 < l(); k1++)
        {
            if (!c(k1).j())
            {
                v = 0;
                return false;
            }
        }

        for (int l1 = 0; l1 < q(); l1++)
        {
            if (!d(l1).j())
            {
                v = 0;
                return false;
            }
        }

        for (int i2 = 0; i2 < s(); i2++)
        {
            if (!e(i2).j())
            {
                v = 0;
                return false;
            }
        }

        v = flag;
        return flag;
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
        return P();
    }

    public an o()
    {
        return O();
    }

    public am p()
    {
        return b();
    }

    public int q()
    {
        return j.size();
    }

    public List r()
    {
        return k;
    }

    public int s()
    {
        return k.size();
    }

    public List t()
    {
        return l;
    }

    public int u()
    {
        return l.size();
    }

    public boolean v()
    {
        return (1 & e) == 1;
    }

    public String w()
    {
        Object obj = m;
        if (obj instanceof String)
        {
            return (String)obj;
        }
        h h1 = (h)obj;
        String s1 = h1.f();
        if (h1.g())
        {
            m = s1;
        }
        return s1;
    }

    public boolean x()
    {
        return (2 & e) == 2;
    }

    public String y()
    {
        Object obj = n;
        if (obj instanceof String)
        {
            return (String)obj;
        }
        h h1 = (h)obj;
        String s1 = h1.f();
        if (h1.g())
        {
            n = s1;
        }
        return s1;
    }

    public boolean z()
    {
        return (4 & e) == 4;
    }

    static 
    {
        c = new q(true);
        c.S();
    }
}
