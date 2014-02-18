// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dotgears;

import android.util.Log;

public class j
{

    public static float A;
    public static float B;
    public static float a[];
    public static float b[];
    public static float c[];
    public static float d[];
    public static float e[];
    public static float f[];
    public static float g[];
    public static float h[];
    public static float i[];
    public static float j[];
    public static float k[];
    public static float l[];
    public static float m[];
    public static float n[];
    public static float o[];
    public static float p[];
    public static float q[];
    public static float r[];
    public static float s[];
    public static float t[];
    public static float u[];
    public static float v[];
    public static float w[];
    public static j x;
    public static int y;
    public static int z;

    j()
    {
        int i1;
        int j1;
        i1 = 0;
        super();
        a = new float[360];
        b = new float[360];
        j1 = 0;
_L3:
        if (j1 < 360) goto _L2; else goto _L1
_L1:
        c = new float[101];
        d = new float[101];
        e = new float[101];
        f = new float[101];
        g = new float[101];
        h = new float[101];
        i = new float[101];
        j = new float[101];
        k = new float[101];
        l = new float[101];
        m = new float[101];
        n = new float[101];
        o = new float[101];
        p = new float[101];
        q = new float[101];
        r = new float[101];
        s = new float[101];
        t = new float[101];
        u = new float[101];
        v = new float[101];
        w = new float[101];
_L4:
        if (i1 > 100)
        {
            return;
        }
        break MISSING_BLOCK_LABEL_222;
_L2:
        float f1 = (3.141593F * (float)j1) / 180F;
        a[j1] = (float)Math.sin(f1);
        b[j1] = (float)Math.cos(f1);
        j1++;
          goto _L3
        double d1 = (double)i1 / 100D;
        c[i1] = (float)a(d1);
        d[i1] = (float)b(d1);
        e[i1] = (float)c(d1);
        f[i1] = (float)d(d1);
        g[i1] = (float)e(d1);
        h[i1] = (float)f(d1);
        i[i1] = (float)g(d1);
        j[i1] = (float)h(d1);
        k[i1] = (float)i(d1);
        l[i1] = (float)j(d1);
        m[i1] = (float)k(d1);
        n[i1] = (float)l(d1);
        o[i1] = (float)m(d1);
        p[i1] = (float)n(d1);
        q[i1] = (float)o(d1);
        r[i1] = (float)p(d1);
        s[i1] = (float)q(d1);
        t[i1] = (float)r(d1);
        u[i1] = (float)s(d1);
        v[i1] = (float)t(d1);
        w[i1] = (float)u(d1);
        i1++;
          goto _L4
    }

    public static float a(float f1)
    {
        float f2 = f1;
_L3:
        if (f2 > 360F) goto _L2; else goto _L1
_L1:
        if (f2 >= 0.0F)
        {
            return f2;
        }
        break MISSING_BLOCK_LABEL_25;
_L2:
        f2 -= 360F;
          goto _L3
        f2 += 360F;
          goto _L1
    }

    public static int a()
    {
        z = 36969 * (0xffff & z) + (z >> 16);
        y = 18000 * (0xffff & y) + (y >> 16);
        return Math.abs((z << 16) + y);
    }

    public static int a(int i1, int j1)
    {
        return i1 + a() % (j1 - i1);
    }

    public static void a(float f1, float f2, float f3, float f4, float f5)
    {
        float f6 = f1 - f3;
        float f7 = f2 - f4;
        float f8 = a(f5);
        A = f3 + (f6 * c(f8) - f7 * b(f8));
        B = f4 + (f6 * b(f8) + f7 * c(f8));
    }

    public static void a(int i1)
    {
        Log.i("FlappyBird", (new StringBuilder("Engine: Randomize ")).append(i1).toString());
        y = i1 % 32000;
        z = i1 % 65535;
    }

    public static float b(float f1)
    {
        return a[(int)f1];
    }

    public static float b(int i1)
    {
        return i[i1];
    }

    static double c(double d1)
    {
        if (d1 < 0.5D)
        {
            return d1 * (2D * d1);
        } else
        {
            return (d1 * (-2D * d1) + 4D * d1) - 1.0D;
        }
    }

    public static float c(float f1)
    {
        return b[(int)f1];
    }

    public static float c(int i1)
    {
        return d[i1];
    }

    static double d(double d1)
    {
        return d1 * (d1 * d1);
    }

    public static float d(int i1)
    {
        return e[i1];
    }

    static double e(double d1)
    {
        double d2 = d1 - 1.0D;
        return 1.0D + d2 * (d2 * d2);
    }

    public static float e(int i1)
    {
        return f[i1];
    }

    static double f(double d1)
    {
        if (d1 < 0.5D)
        {
            return d1 * (d1 * (4D * d1));
        } else
        {
            double d2 = 2D * d1 - 2D;
            return 1.0D + d2 * (d2 * (0.5D * d2));
        }
    }

    public static float f(int i1)
    {
        return g[i1];
    }

    static double g(double d1)
    {
        return d1 * (d1 * (d1 * d1));
    }

    public static float g(int i1)
    {
        return h[i1];
    }

    static double h(double d1)
    {
        double d2 = d1 - 1.0D;
        return 1.0D + d2 * (d2 * d2) * (1.0D - d1);
    }

    public static float h(int i1)
    {
        return i[i1];
    }

    static double i(double d1)
    {
        if (d1 < 0.5D)
        {
            return d1 * (d1 * (d1 * (8D * d1)));
        } else
        {
            double d2 = d1 - 1.0D;
            return 1.0D + d2 * (d2 * (d2 * (-8D * d2)));
        }
    }

    public static float i(int i1)
    {
        return j[i1];
    }

    static double j(double d1)
    {
        return d1 * (d1 * (d1 * (d1 * d1)));
    }

    public static float j(int i1)
    {
        return k[i1];
    }

    static double k(double d1)
    {
        double d2 = d1 - 1.0D;
        return 1.0D + d2 * (d2 * (d2 * (d2 * d2)));
    }

    public static float k(int i1)
    {
        return l[i1];
    }

    static double l(double d1)
    {
        if (d1 < 0.5D)
        {
            return d1 * (d1 * (d1 * (d1 * (16D * d1))));
        } else
        {
            double d2 = 2D * d1 - 2D;
            return 1.0D + d2 * (d2 * (d2 * (d2 * (0.5D * d2))));
        }
    }

    public static float l(int i1)
    {
        return m[i1];
    }

    public static float m(int i1)
    {
        return n[i1];
    }

    public static float n(int i1)
    {
        return o[i1];
    }

    public static float o(int i1)
    {
        return p[i1];
    }

    public static float p(int i1)
    {
        return q[i1];
    }

    public static float q(int i1)
    {
        return o[i1];
    }

    public static float r(int i1)
    {
        return p[i1];
    }

    public static float s(int i1)
    {
        return q[i1];
    }

    public static float t(int i1)
    {
        return u[i1];
    }

    public static float u(int i1)
    {
        return v[i1];
    }

    public static float v(int i1)
    {
        return w[i1];
    }

    double a(double d1)
    {
        return d1 * d1;
    }

    double b(double d1)
    {
        return -(d1 * (d1 - 2D));
    }

    double m(double d1)
    {
        return Math.sin(20.420352248333657D * d1) * Math.pow(2D, 10D * (d1 - 1.0D));
    }

    double n(double d1)
    {
        return 1.0D + Math.sin(-20.420352248333657D * (d1 + 1.0D)) * Math.pow(2D, -10D * d1);
    }

    double o(double d1)
    {
        if (d1 < 0.5D)
        {
            return 0.5D * Math.sin(20.420352248333657D * (2D * d1)) * Math.pow(2D, 10D * (2D * d1 - 1.0D));
        } else
        {
            return 0.5D * (2D + Math.sin(-20.420352248333657D * (1.0D + (2D * d1 - 1.0D))) * Math.pow(2D, -10D * (2D * d1 - 1.0D)));
        }
    }

    double p(double d1)
    {
        return d1 * (d1 * d1) - d1 * Math.sin(3.1415926535897931D * d1);
    }

    double q(double d1)
    {
        double d2 = 1.0D - d1;
        return 1.0D - (d2 * (d2 * d2) - d2 * Math.sin(3.1415926535897931D * d2));
    }

    double r(double d1)
    {
        if (d1 < 0.5D)
        {
            double d3 = 2D * d1;
            return 0.5D * (d3 * (d3 * d3) - d3 * Math.sin(3.1415926535897931D * d3));
        } else
        {
            double d2 = 1.0D - (2D * d1 - 1.0D);
            return 0.5D + 0.5D * (1.0D - (d2 * (d2 * d2) - d2 * Math.sin(3.1415926535897931D * d2)));
        }
    }

    double s(double d1)
    {
        return 1.0D - t(1.0D - d1);
    }

    double t(double d1)
    {
        if (d1 < 0.36363636363636365D)
        {
            return (d1 * (121D * d1)) / 16D;
        }
        if (d1 < 0.72727272727272729D)
        {
            return 3.3999999999999999D + (d1 * (9.0749999999999993D * d1) - 9.9000000000000004D * d1);
        }
        if (d1 < 0.90000000000000002D)
        {
            return 8.8980609418282555D + (d1 * (12.066481994459833D * d1) - 19.635457063711911D * d1);
        } else
        {
            return 10.720000000000001D + (d1 * (10.800000000000001D * d1) - 20.52D * d1);
        }
    }

    double u(double d1)
    {
        if (d1 < 0.5D)
        {
            return 0.5D * s(d1 * 2D);
        } else
        {
            return 0.5D + 0.5D * t(d1 * 2D - 1.0D);
        }
    }
}
