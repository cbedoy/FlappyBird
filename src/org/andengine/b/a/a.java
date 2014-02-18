// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.b.a;

import org.andengine.b.b.c;
import org.andengine.b.b.d;
import org.andengine.opengl.util.e;

public class a
    implements c
{

    static final float a[] = new float[2];
    protected float b;
    protected float c;
    protected float d;
    protected float e;
    protected float f;
    protected float g;
    protected int h;
    protected int i;
    protected int j;
    protected int k;
    protected boolean l;
    protected d m;
    private float n;
    private float o;
    private org.andengine.b.a.a.a p;
    private org.andengine.c.c q;

    public a(float f1, float f2, float f3, float f4)
    {
        n = -1F;
        o = 1.0F;
        f = 0.0F;
        g = 0.0F;
        a(f1, f2, f1 + f3, f2 + f4);
    }

    private void a(org.andengine.input.a.a a1, float f1, float f2)
    {
        float f3 = a();
        float f4 = b();
        float f5 = c();
        float f6 = d();
        a1.a(f3 + f1 * (f4 - f3), f5 + f2 * (f6 - f5));
    }

    private static void a(e e1, float f1, float f2, float f3)
    {
        e1.b(f1, f2, 0.0F);
        e1.b(f3, 0.0F, 0.0F, 1.0F);
        e1.b(-f1, -f2, 0.0F);
    }

    private void e(org.andengine.input.a.a a1)
    {
        float f1 = f;
        if (f1 != 0.0F)
        {
            a[0] = a1.b();
            a[1] = a1.c();
            org.andengine.d.g.a.a(a, -f1, g(), h());
            a1.a(a[0], a[1]);
        }
    }

    private void f(org.andengine.input.a.a a1)
    {
        float f1 = f;
        if (f1 != 0.0F)
        {
            a[0] = a1.b();
            a[1] = a1.c();
            org.andengine.d.g.a.b(a, f1, g(), h());
            a1.a(a[0], a[1]);
        }
    }

    private void g(org.andengine.input.a.a a1)
    {
        float f1 = -g;
        if (f1 != 0.0F)
        {
            a[0] = a1.b();
            a[1] = a1.c();
            org.andengine.d.g.a.a(a, f1, 0.5F * (c - b), 0.5F * (e - d));
            a1.a(a[0], a[1]);
        }
    }

    private void h(org.andengine.input.a.a a1)
    {
        float f1 = -g;
        if (f1 != 0.0F)
        {
            a[0] = a1.b();
            a[1] = a1.c();
            org.andengine.d.g.a.b(a, f1, 0.5F * (c - b), 0.5F * (e - d));
            a1.a(a[0], a[1]);
        }
    }

    public float a()
    {
        return b;
    }

    public void a(float f1, float f2)
    {
        float f3 = f1 - g();
        float f4 = f2 - h();
        b = f3 + b;
        c = f3 + c;
        d = f4 + d;
        e = f4 + e;
    }

    public void a(float f1, float f2, float f3, float f4)
    {
        b = f1;
        c = f3;
        d = f2;
        e = f4;
    }

    public void a(int i1, int j1, int k1, int l1)
    {
        if (k == 0 && j == 0)
        {
            b(i1, j1, k1, l1);
        } else
        if (j != k1 || k != l1)
        {
            a(h, i, j, k, i1, j1, k1, l1);
            return;
        }
    }

    protected void a(int i1, int j1, int k1, int l1, int i2, int j2, int k2, 
            int l2)
    {
        if (l)
        {
            float f1 = (float)k2 / (float)k1;
            float f2 = (float)l2 / (float)l1;
            float f3 = g();
            float f4 = h();
            float f5 = f1 * e();
            float f6 = f2 * f();
            float f7 = f5 * 0.5F;
            float f8 = f6 * 0.5F;
            a(f3 - f7, f4 - f8, f7 + f3, f8 + f4);
        }
        h = i2;
        i = j2;
        j = k2;
        k = l2;
    }

    public void a(org.andengine.input.a.a a1)
    {
        f(a1);
        c(a1);
        g(a1);
    }

    public void a(org.andengine.input.a.a a1, int i1, int j1)
    {
        float f1 = a1.b();
        float f2 = a1.c();
        float f3 = f;
        float f4;
        float f5;
        if (f3 == 0.0F)
        {
            f4 = f1 / (float)i1;
            f5 = f2 / (float)j1;
        } else
        if (f3 == 180F)
        {
            f4 = 1.0F - f1 / (float)i1;
            f5 = 1.0F - f2 / (float)j1;
        } else
        {
            a[0] = f1;
            a[1] = f2;
            org.andengine.d.g.a.a(a, f3, i1 >> 1, j1 >> 1);
            f4 = a[0] / (float)i1;
            f5 = a[1] / (float)j1;
        }
        a(a1, f4, f5);
    }

    public void a(e e1)
    {
        if (p != null)
        {
            p.a(e1, this);
        }
    }

    public void a_(float f1)
    {
        if (m != null)
        {
            m.a_(f1);
        }
        if (p != null)
        {
            p.a_(f1);
        }
        l();
    }

    public float b()
    {
        return c;
    }

    protected void b(int i1, int j1, int k1, int l1)
    {
        h = i1;
        i = j1;
        j = k1;
        k = l1;
    }

    public void b(org.andengine.input.a.a a1)
    {
        h(a1);
        d(a1);
        e(a1);
    }

    public void b(e e1)
    {
        e1.a(a(), b(), d(), c(), n, o);
        float f1 = f;
        if (f1 != 0.0F)
        {
            a(e1, g(), h(), f1);
        }
    }

    public float c()
    {
        return d;
    }

    protected void c(org.andengine.input.a.a a1)
    {
        a1.b(-b, -d);
    }

    public void c(e e1)
    {
        float f1 = e();
        float f2 = f();
        e1.a(0.0F, f1, f2, 0.0F, n, o);
        float f3 = f;
        if (f3 != 0.0F)
        {
            a(e1, f1 * 0.5F, f2 * 0.5F, f3);
        }
    }

    public float d()
    {
        return e;
    }

    protected void d(org.andengine.input.a.a a1)
    {
        a1.b(b, d);
    }

    public void d(e e1)
    {
        float f1 = e();
        float f2 = f();
        e1.a(0.0F, f1, f2, 0.0F, n, o);
        float f3 = g;
        if (f3 != 0.0F)
        {
            a(e1, f1 * 0.5F, f2 * 0.5F, f3);
        }
    }

    public float e()
    {
        return c - b;
    }

    public float f()
    {
        return e - d;
    }

    public float g()
    {
        return 0.5F * (b + c);
    }

    public float h()
    {
        return 0.5F * (d + e);
    }

    public org.andengine.b.a.a.a i()
    {
        return p;
    }

    public boolean j()
    {
        return p != null;
    }

    public float k()
    {
        return f;
    }

    public void l()
    {
        if (q != null)
        {
            float af[] = q.h();
            a(af[0], af[1]);
        }
    }

}
