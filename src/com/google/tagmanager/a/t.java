// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;

import java.io.Serializable;

// Referenced classes of package com.google.tagmanager.a:
//            a, bk, o, k, 
//            aa, z, q, bm, 
//            ae, u, br, am, 
//            an, m, v, aq

public abstract class t extends a
    implements Serializable
{

    protected t()
    {
    }

    protected t(v v)
    {
    }

    static boolean a(q q1, am am1, k k1, m m1, o o1, int i)
    {
        return b(q1, am1, k1, m1, o1, i);
    }

    private static boolean b(q q1, am am1, k k1, m m1, o o1, int i)
    {
        aa aa1;
        boolean flag;
        int j = bk.a(i);
        aa1 = o1.a(am1, bk.b(i));
        boolean flag1;
        if (aa1 == null)
        {
            flag = false;
            flag1 = true;
        } else
        if (j == q.a(aa1.b.a(), false))
        {
            flag = false;
            flag1 = false;
        } else
        if (aa1.b.d && aa1.b.c.c() && j == q.a(aa1.b.a(), true))
        {
            flag = true;
            flag1 = false;
        } else
        {
            flag1 = true;
            flag = false;
        }
        if (flag1)
        {
            return k1.a(i, m1);
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        int i1 = k1.c(k1.s());
        if (aa1.b.a() == bm.n)
        {
            ad ad;
            for (; k1.w() > 0; q1.b(aa1.b, aa1.a(ad)))
            {
                int j1 = k1.n();
                ad = aa1.b.e().b(j1);
                if (ad == null)
                {
                    return true;
                }
            }

        } else
        {
            Object obj1;
            for (; k1.w() > 0; q1.b(aa1.b, obj1))
            {
                obj1 = q.a(k1, aa1.b.a(), false);
            }

        }
        k1.d(i1);
_L6:
        return true;
_L2:
        u.a[aa1.b.b().ordinal()];
        JVM INSTR tableswitch 1 2: default 296
    //                   1 341
    //                   2 447;
           goto _L3 _L4 _L5
_L3:
        Object obj = q.a(k1, aa1.b.a(), false);
_L7:
        an an1;
        if (aa1.b.c())
        {
            q1.b(aa1.b, aa1.a(obj));
        } else
        {
            q1.a(aa1.b, aa1.a(obj));
        }
        if (true) goto _L6; else goto _L4
_L4:
        if (aa1.b.c())
        {
            break MISSING_BLOCK_LABEL_508;
        }
        am am2 = (am)q1.a(aa1.b);
        if (am2 == null)
        {
            break MISSING_BLOCK_LABEL_508;
        }
        an1 = am2.n();
_L8:
        if (an1 == null)
        {
            an1 = aa1.b().o();
        }
        if (aa1.b.a() == bm.j)
        {
            k1.a(aa1.a(), an1, o1);
        } else
        {
            k1.a(an1, o1);
        }
        obj = an1.h();
          goto _L7
_L5:
        int l = k1.n();
        obj = aa1.b.e().b(l);
        if (obj == null)
        {
            m1.d(i);
            m1.b(l);
            return true;
        }
          goto _L7
        an1 = null;
          goto _L8
    }

    protected void R()
    {
    }

    protected boolean a(k k1, m m1, o o1, int i)
    {
        return k1.a(i, m1);
    }

    public aq c()
    {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }
}
