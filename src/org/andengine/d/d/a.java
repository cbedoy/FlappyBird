// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.d.d;


// Referenced classes of package org.andengine.d.d:
//            b

public class a
{

    public static final float A;
    public static final int B;
    public static final int C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final int G;
    public static final int H;
    public static final int I;
    public static final int J;
    public static final a a;
    public static final a b;
    public static final a c;
    public static final a d;
    public static final a e;
    public static final a f;
    public static final a g;
    public static final a h;
    public static final a i;
    public static final int j;
    public static final int k;
    public static final int l;
    public static final int m;
    public static final int n;
    public static final int o;
    public static final int p;
    public static final int q;
    public static final int r;
    public static final float s;
    public static final float t;
    public static final float u;
    public static final float v;
    public static final float w;
    public static final float x;
    public static final float y;
    public static final float z;
    private float K;
    private float L;
    private float M;
    private float N;
    private int O;
    private float P;

    public a(float f1, float f2, float f3, float f4)
    {
        a(f1, f2, f3, f4);
    }

    private final void h()
    {
        O = 0xffffff & O | (int)(255F * N) << 24;
        P = org.andengine.d.d.b.a(O);
    }

    private final void i()
    {
        O = org.andengine.d.d.b.b(K, L, M, N);
        P = org.andengine.d.d.b.a(O);
    }

    public final float a()
    {
        return K;
    }

    public final void a(float f1, float f2, float f3, float f4)
    {
        K = f1;
        L = f2;
        M = f3;
        N = f4;
        i();
    }

    public final void a(a a1)
    {
        K = a1.K;
        L = a1.L;
        M = a1.M;
        N = a1.N;
        O = a1.O;
        P = a1.P;
    }

    public final boolean a(float f1)
    {
        if (N != f1)
        {
            N = f1;
            h();
            return true;
        } else
        {
            return false;
        }
    }

    public final float b()
    {
        return L;
    }

    public boolean b(a a1)
    {
        return O == a1.O;
    }

    public final float c()
    {
        return M;
    }

    public final float d()
    {
        return N;
    }

    public final int e()
    {
        return O;
    }

    public boolean equals(Object obj)
    {
        boolean flag;
        if (this == obj)
        {
            flag = true;
        } else
        {
            flag = false;
            if (obj != null)
            {
                Class class1 = getClass();
                Class class2 = obj.getClass();
                flag = false;
                if (class1 == class2)
                {
                    return b((a)obj);
                }
            }
        }
        return flag;
    }

    public final float f()
    {
        return P;
    }

    public final int g()
    {
        return org.andengine.d.d.b.a(K, L, M, N);
    }

    public int hashCode()
    {
        return O;
    }

    public String toString()
    {
        return (new StringBuilder()).append("[Red: ").append(K).append(", Green: ").append(L).append(", Blue: ").append(M).append(", Alpha: ").append(N).append("]").toString();
    }

    static 
    {
        a = new a(1.0F, 1.0F, 1.0F, 1.0F);
        b = new a(0.0F, 0.0F, 0.0F, 1.0F);
        c = new a(1.0F, 0.0F, 0.0F, 1.0F);
        d = new a(1.0F, 1.0F, 0.0F, 1.0F);
        e = new a(0.0F, 1.0F, 0.0F, 1.0F);
        f = new a(0.0F, 1.0F, 1.0F, 1.0F);
        g = new a(0.0F, 0.0F, 1.0F, 1.0F);
        h = new a(1.0F, 0.0F, 1.0F, 1.0F);
        i = new a(0.0F, 0.0F, 0.0F, 0.0F);
        j = a.e();
        k = b.e();
        l = c.e();
        m = d.e();
        n = e.e();
        o = f.e();
        p = g.e();
        q = h.e();
        r = i.e();
        s = a.f();
        t = b.f();
        u = c.f();
        v = d.f();
        w = e.f();
        x = f.f();
        y = g.f();
        z = h.f();
        A = i.f();
        B = a.g();
        C = b.g();
        D = c.g();
        E = d.g();
        F = e.g();
        G = f.g();
        H = g.g();
        I = h.g();
        J = i.g();
    }
}
