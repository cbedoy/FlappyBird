// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.c.b;

import android.util.SparseArray;
import org.andengine.c.a;
import org.andengine.c.c;
import org.andengine.d.a.a.b;

// Referenced classes of package org.andengine.c.b:
//            d, b, c

public class e extends a
{

    protected e I;
    protected b J;
    private boolean K;
    private boolean L;
    private final SparseArray M = new SparseArray();
    private boolean N;
    private final SparseArray O = new SparseArray();
    private float a;
    private boolean b;
    private boolean c;
    private boolean d;
    private final org.andengine.b.b.a.a e = new org.andengine.b.b.a.a();
    private org.andengine.c.b.c f;
    private org.andengine.c.b.b g;
    private org.andengine.c.b.a.b h;
    private boolean i;
    private boolean j;

    public e()
    {
        J = new b(4);
        h = new org.andengine.c.b.a.a(org.andengine.d.d.a.b);
        i = true;
        j = true;
        K = false;
        L = false;
        N = false;
    }

    private Boolean a(org.andengine.input.a.a a1, float f1, float f2, d d1)
    {
        float af[] = d1.b(f1, f2);
        float f3 = af[0];
        float f4 = af[1];
        if (d1.a(a1, f3, f4))
        {
            return Boolean.TRUE;
        }
        if (g != null)
        {
            return Boolean.valueOf(g.a(a1, d1, f3, f4));
        } else
        {
            return null;
        }
    }

    protected void a(float f1)
    {
        a = f1 + a;
        e.a_(f1);
        e e1 = I;
        if (e1 == null || !c)
        {
            h.a_(f1);
            super.a(f1);
        }
        if (e1 != null)
        {
            e1.a_(f1);
        }
    }

    public void a(org.andengine.c.b.c c1)
    {
        f = c1;
    }

    public void a(c c1)
    {
    }

    public boolean a(org.andengine.input.a.a a1)
    {
        int k;
        boolean flag;
        boolean flag1;
        k = a1.e();
        flag = a1.f();
        flag1 = a1.h();
        if (flag) goto _L2; else goto _L1
_L1:
        if (!N || (org.andengine.c.b.c)O.get(a1.d()) == null) goto _L4; else goto _L3
_L3:
        k;
        JVM INSTR tableswitch 1 3: default 72
    //                   1 103
    //                   2 72
    //                   3 103;
           goto _L5 _L6 _L5 _L6
_L5:
        Boolean boolean5 = Boolean.valueOf(f.a(this, a1));
        if (boolean5 != null && boolean5.booleanValue())
        {
            return true;
        }
        break; /* Loop/switch isn't completed */
_L6:
        O.remove(a1.d());
        if (true) goto _L5; else goto _L4
_L4:
        if (!K) goto _L2; else goto _L7
_L7:
        SparseArray sparsearray;
        d d3;
        sparsearray = M;
        d3 = (d)sparsearray.get(a1.d());
        if (d3 == null) goto _L2; else goto _L8
_L8:
        float f3;
        float f4;
        f3 = a1.b();
        f4 = a1.c();
        k;
        JVM INSTR tableswitch 1 3: default 188
    //                   1 216
    //                   2 188
    //                   3 216;
           goto _L9 _L10 _L9 _L10
_L9:
        Boolean boolean4 = a(a1, f3, f4, d3);
        if (boolean4 != null && boolean4.booleanValue())
        {
            return true;
        }
        break; /* Loop/switch isn't completed */
_L10:
        sparsearray.remove(a1.d());
        if (true) goto _L9; else goto _L2
_L2:
        float f1;
        float f2;
        b b1;
        if (I != null)
        {
            if (b(a1))
            {
                return true;
            }
            if (d)
            {
                return false;
            }
        }
        f1 = a1.b();
        f2 = a1.c();
        b1 = J;
        if (b1 == null) goto _L12; else goto _L11
_L11:
        int l = b1.size();
        if (l <= 0) goto _L12; else goto _L13
_L13:
        int j1;
        if (!j)
        {
            break MISSING_BLOCK_LABEL_466;
        }
        j1 = 0;
_L15:
        if (j1 < l) goto _L14; else goto _L12
_L12:
        if (f != null)
        {
            Boolean boolean1 = Boolean.valueOf(f.a(this, a1));
            int i1;
            d d1;
            Boolean boolean2;
            d d2;
            Boolean boolean3;
            if (boolean1 != null && boolean1.booleanValue())
            {
                if (N && flag)
                {
                    O.put(a1.d(), f);
                }
                return true;
            } else
            {
                return false;
            }
        } else
        {
            return false;
        }
_L14:
        d2 = (d)b1.get(j1);
        if (d2.a(f1, f2))
        {
            boolean3 = a(a1, f1, f2, d2);
            if (boolean3 != null && boolean3.booleanValue())
            {
                if (K && flag || L && flag1)
                {
                    M.put(a1.d(), d2);
                }
                return true;
            }
        }
        j1++;
          goto _L15
        i1 = l - 1;
        while (i1 >= 0) 
        {
            d1 = (d)b1.get(i1);
            if (d1.a(f1, f2))
            {
                boolean2 = a(a1, f1, f2, d1);
                if (boolean2 != null && boolean2.booleanValue())
                {
                    if (K && flag || L && flag1)
                    {
                        M.put(a1.d(), d1);
                    }
                    return true;
                }
            }
            i1--;
        }
          goto _L12
    }

    protected boolean b(org.andengine.input.a.a a1)
    {
        return I.a(a1);
    }

    protected void e(org.andengine.opengl.util.e e1, org.andengine.b.a.a a1)
    {
        e e2 = I;
        if (e2 == null || !b)
        {
            if (i)
            {
                e1.m();
                a1.c(e1);
                e1.l();
                h.a(e1, a1);
                e1.n();
            }
            e1.m();
            f(e1, a1);
            e1.l();
            super.e(e1, a1);
            e1.n();
        }
        if (e2 != null)
        {
            e2.a(e1, a1);
        }
    }

    protected void f(org.andengine.opengl.util.e e1, org.andengine.b.a.a a1)
    {
        a1.b(e1);
    }
}
