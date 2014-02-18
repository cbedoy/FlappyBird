// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.c;

import org.andengine.b.b.d;
import org.andengine.d.a.a.b;
import org.andengine.d.c;
import org.andengine.opengl.util.e;

// Referenced classes of package org.andengine.c:
//            c, b, d

public class a
    implements org.andengine.c.c
{

    private static final float a[] = new float[2];
    private static final float b[] = new float[2];
    private static final org.andengine.d.c.a c = new org.andengine.c.b();
    protected float A;
    protected float B;
    protected float C;
    protected float D;
    protected float E;
    protected float F;
    protected float G;
    protected float H;
    private org.andengine.d.a.d.a I;
    private org.andengine.d.a.d.a J;
    private org.andengine.c.c d;
    private org.andengine.c.a.a e;
    private d f;
    private boolean g;
    private boolean h;
    private org.andengine.d.a.d.a i;
    private org.andengine.d.a.d.a j;
    protected boolean k;
    protected boolean l;
    protected boolean m;
    protected boolean n;
    protected boolean o;
    protected boolean p;
    protected boolean q;
    protected int r;
    protected int s;
    protected b t;
    protected org.andengine.d.d.a u;
    protected float v;
    protected float w;
    protected float x;
    protected float y;
    protected float z;

    public a()
    {
        this(0.0F, 0.0F);
    }

    public a(float f1, float f2)
    {
        l = true;
        o = true;
        r = 0x80000000;
        s = 0;
        u = new org.andengine.d.d.a(1.0F, 1.0F, 1.0F, 1.0F);
        x = 0.0F;
        y = 0.0F;
        z = 0.0F;
        A = 1.0F;
        B = 1.0F;
        C = 0.0F;
        D = 0.0F;
        E = 0.0F;
        F = 0.0F;
        G = 0.0F;
        H = 0.0F;
        g = true;
        h = true;
        v = f1;
        w = f2;
    }

    private void a()
    {
        t = new b(4);
    }

    private void c(org.andengine.c.c c1)
    {
        if (c1.d())
        {
            String s1 = c1.getClass().getSimpleName();
            String s2 = c1.e().getClass().getSimpleName();
            String s3 = getClass().getSimpleName();
            throw new IllegalStateException((new StringBuilder("pEntity '")).append(s1).append("' already has a parent: '").append(s2).append("'. New parent: '").append(s3).append("'!").toString());
        } else
        {
            return;
        }
    }

    protected void a(float f1)
    {
        if (e != null)
        {
            e.a_(f1);
        }
        if (f != null)
        {
            f.a_(f1);
        }
        if (t == null || p) goto _L2; else goto _L1
_L1:
        b b1;
        int i1;
        int j1;
        b1 = t;
        i1 = b1.size();
        j1 = 0;
_L5:
        if (j1 < i1) goto _L3; else goto _L2
_L2:
        return;
_L3:
        ((org.andengine.c.c)b1.get(j1)).a_(f1);
        j1++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void a(StringBuilder stringbuilder)
    {
        stringbuilder.append(getClass().getSimpleName());
        if (t == null || t.size() <= 0) goto _L2; else goto _L1
_L1:
        b b1;
        int i1;
        stringbuilder.append(" [");
        b1 = t;
        i1 = 0;
_L6:
        if (i1 < b1.size()) goto _L4; else goto _L3
_L3:
        stringbuilder.append("]");
_L2:
        return;
_L4:
        ((org.andengine.c.c)b1.get(i1)).a(stringbuilder);
        if (i1 < -1 + b1.size())
        {
            stringbuilder.append(", ");
        }
        i1++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void a(org.andengine.c.c c1)
    {
        d = c1;
    }

    protected void a(e e1)
    {
        b(e1);
        c(e1);
        d(e1);
        e(e1);
    }

    public final void a(e e1, org.andengine.b.a.a a1)
    {
        if (l && (!m || !a(a1)))
        {
            e(e1, a1);
        }
    }

    public void a(boolean flag)
    {
        l = flag;
    }

    public boolean a(org.andengine.b.a.a a1)
    {
        return false;
    }

    public float[] a(float f1, float f2, float af[])
    {
        org.andengine.d.a.d.a a1 = k();
        af[0] = f1;
        af[1] = f2;
        a1.a(af);
        return af;
    }

    public final void a_(float f1)
    {
        if (!n)
        {
            a(f1);
        }
    }

    public float[] a_(float f1, float f2)
    {
        return a(f1, f2, b);
    }

    protected void b()
    {
    }

    public void b(float f1)
    {
        if (u.a(f1))
        {
            b();
        }
    }

    public void b(org.andengine.c.c c1)
    {
        c(c1);
        if (t == null)
        {
            a();
        }
        t.add(c1);
        c1.a(this);
        c1.m();
    }

    protected void b(e e1)
    {
        e1.a(v, w, 0.0F);
    }

    protected void b(e e1, org.andengine.b.a.a a1)
    {
    }

    public float[] b(float f1, float f2)
    {
        return b(f1, f2, a);
    }

    public float[] b(float f1, float f2, float af[])
    {
        af[0] = f1;
        af[1] = f2;
        l().a(af);
        return af;
    }

    protected void c(e e1)
    {
        float f1 = x;
        if (f1 != 0.0F)
        {
            float f2 = y;
            float f3 = z;
            e1.a(f2, f3, 0.0F);
            e1.a(f1, 0.0F, 0.0F, 1.0F);
            e1.a(-f2, -f3, 0.0F);
        }
    }

    protected void c(e e1, org.andengine.b.a.a a1)
    {
    }

    public boolean c()
    {
        return k;
    }

    protected void d(e e1)
    {
        float f1 = E;
        float f2 = F;
        if (f1 != 0.0F || f2 != 0.0F)
        {
            float f3 = G;
            float f4 = H;
            e1.a(f3, f4, 0.0F);
            e1.a(f1, f2);
            e1.a(-f3, -f4, 0.0F);
        }
    }

    protected void d(e e1, org.andengine.b.a.a a1)
    {
    }

    public boolean d()
    {
        return d != null;
    }

    public org.andengine.c.c e()
    {
        return d;
    }

    protected void e(e e1)
    {
        float f1 = A;
        float f2 = B;
        if (f1 != 1.0F || f2 != 1.0F)
        {
            float f3 = C;
            float f4 = D;
            e1.a(f3, f4, 0.0F);
            e1.a(f1, f2, 1);
            e1.a(-f3, -f4, 0.0F);
        }
    }

    protected void e(e e1, org.andengine.b.a.a a1)
    {
        int i1;
        b b1;
        i1 = 0;
        e1.j();
        a(e1);
        b1 = t;
        if (b1 != null && o) goto _L2; else goto _L1
_L1:
        b(e1, a1);
        c(e1, a1);
        d(e1, a1);
_L5:
        e1.k();
        return;
_L2:
        int j1;
        if (q)
        {
            org.andengine.c.d.a().a(t);
            q = false;
        }
        j1 = b1.size();
_L7:
        if (i1 < j1) goto _L4; else goto _L3
_L3:
        org.andengine.c.c c1;
        b(e1, a1);
        c(e1, a1);
        d(e1, a1);
        while (i1 < j1) 
        {
            ((org.andengine.c.c)b1.get(i1)).a(e1, a1);
            i1++;
        }
          goto _L5
_L4:
        if ((c1 = (org.andengine.c.c)b1.get(i1)).f() >= 0) goto _L3; else goto _L6
_L6:
        c1.a(e1, a1);
        i1++;
          goto _L7
    }

    public int f()
    {
        return s;
    }

    protected void finalize()
    {
        super.finalize();
        if (!k)
        {
            n();
        }
    }

    public org.andengine.d.d.a g()
    {
        return u;
    }

    public float[] h()
    {
        return a_(0.0F, 0.0F);
    }

    public org.andengine.d.a.d.a i()
    {
        if (i == null)
        {
            i = new org.andengine.d.a.d.a();
        }
        org.andengine.d.a.d.a a1 = i;
        if (g)
        {
            a1.a();
            float f1 = A;
            float f2 = B;
            if (f1 != 1.0F || f2 != 1.0F)
            {
                float f3 = C;
                float f4 = D;
                a1.a(-f3, -f4);
                a1.b(f1, f2);
                a1.a(f3, f4);
            }
            float f5 = E;
            float f6 = F;
            if (f5 != 0.0F || f6 != 0.0F)
            {
                float f7 = G;
                float f8 = H;
                a1.a(-f7, -f8);
                a1.c(f5, f6);
                a1.a(f7, f8);
            }
            float f9 = x;
            if (f9 != 0.0F)
            {
                float f10 = y;
                float f11 = z;
                a1.a(-f10, -f11);
                a1.a(f9);
                a1.a(f10, f11);
            }
            a1.a(v, w);
            g = false;
        }
        return a1;
    }

    public org.andengine.d.a.d.a j()
    {
        if (j == null)
        {
            j = new org.andengine.d.a.d.a();
        }
        org.andengine.d.a.d.a a1 = j;
        if (h)
        {
            a1.a();
            a1.a(-v, -w);
            float f1 = x;
            if (f1 != 0.0F)
            {
                float f10 = y;
                float f11 = z;
                a1.a(-f10, -f11);
                a1.a(-f1);
                a1.a(f10, f11);
            }
            float f2 = E;
            float f3 = F;
            if (f2 != 0.0F || f3 != 0.0F)
            {
                float f4 = G;
                float f5 = H;
                a1.a(-f4, -f5);
                a1.c(-f2, -f3);
                a1.a(f4, f5);
            }
            float f6 = A;
            float f7 = B;
            if (f6 != 1.0F || f7 != 1.0F)
            {
                float f8 = C;
                float f9 = D;
                a1.a(-f8, -f9);
                a1.b(1.0F / f6, 1.0F / f7);
                a1.a(f8, f9);
            }
            h = false;
        }
        return a1;
    }

    public org.andengine.d.a.d.a k()
    {
        if (I == null)
        {
            I = new org.andengine.d.a.d.a();
        }
        org.andengine.d.a.d.a a1 = I;
        a1.a(i());
        org.andengine.c.c c1 = d;
        if (c1 != null)
        {
            a1.b(c1.k());
        }
        return a1;
    }

    public org.andengine.d.a.d.a l()
    {
        if (J == null)
        {
            J = new org.andengine.d.a.d.a();
        }
        org.andengine.d.a.d.a a1 = J;
        a1.a(j());
        org.andengine.c.c c1 = d;
        if (c1 != null)
        {
            a1.c(c1.l());
        }
        return a1;
    }

    public void m()
    {
    }

    public void n()
    {
        if (!k)
        {
            k = true;
            return;
        } else
        {
            throw new c();
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        a(stringbuilder);
        return stringbuilder.toString();
    }

}
