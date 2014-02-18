// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dotgears;

import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

// Referenced classes of package com.dotgears:
//            m, i, j, r, 
//            n, l, p, o, 
//            e, c

public class g extends m
{

    public static g D;
    public int A;
    public l B;
    public p C;
    public final float E;
    public i a[];
    public int b[];
    public int c[];
    public m d[];
    public int e;
    public r f;
    public int g;
    public r h;
    public int i;
    public int j;
    public int k;
    public int l;
    public n m;
    public n n;
    protected i o;
    protected i p;
    public int q;
    public boolean r;
    protected int s[];
    protected int t[];
    protected int u;
    int v;
    int w[];
    double x[];
    public int y;
    public int z;

    public g(int i1, int j1, InputStream inputstream)
    {
        b = new int[50];
        c = new int[50];
        d = new m[50];
        q = 1;
        s = new int[10];
        t = new int[10];
        w = new int[50];
        x = new double[50];
        E = 0.015F;
        z = i1;
        A = j1;
        a = new i[512];
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(inputstream));
_L2:
        String s1 = bufferedreader.readLine();
        if (s1 == null)
        {
            return;
        }
        if (s1.length() <= 1) goto _L2; else goto _L1
_L1:
        String as[] = s1.split("\\s+");
        i k1 = new i(as[0], Integer.parseInt(as[1]), Integer.parseInt(as[2]), Float.parseFloat(as[3]), Float.parseFloat(as[4]), Float.parseFloat(as[5]), Float.parseFloat(as[6]));
        k1.f = k1.d + k1.f;
        k1.g = k1.e + k1.g;
        a[k1.i] = k1;
        Log.i("FlappyBird", (new StringBuilder()).append(k1.a).append(" ").append(k1.b).append(" ").append(k1.c).append(" ").append(k1.d).append(" ").append(k1.e).append(" ").append(k1.f).append(" ").append(k1.g).toString());
          goto _L2
        Exception exception;
        exception;
        exception.printStackTrace();
        return;
    }

    public void a()
    {
        int i1;
        j.x = new j();
        f = new r();
        h = new r();
        o = b("black");
        p = b("white");
        u = 0;
        m = new n();
        i1 = 0;
_L3:
        if (i1 < 20) goto _L2; else goto _L1
_L1:
        int j1;
        n = new n();
        j1 = 0;
_L4:
        if (j1 >= 10)
        {
            B = new l("number_score");
            C = new p();
            l = 0;
            r = false;
            v = 0;
            d();
            c();
            a(false, 0, 0.5F);
            return;
        }
        break MISSING_BLOCK_LABEL_171;
_L2:
        m.a(new o());
        i1++;
          goto _L3
        n.a(new e());
        j1++;
          goto _L4
    }

    public void a(int i1)
    {
        c(0, i1);
        if (i1 > z)
        {
            z = i1;
        }
    }

    public void a(int i1, float f1)
    {
    }

    public void a(int i1, int j1)
    {
    }

    public void a(int i1, int j1, int k1, float f1, float f2, float f3)
    {
        i l1 = a[i1];
        a(j1, k1, (int)((float)j1 + f1 * (float)l1.b), (int)((float)k1 + f2 * (float)l1.c), l1.d, l1.e, l1.f, l1.g, f3);
    }

    public void a(int i1, int j1, int k1, int l1)
    {
    }

    public void a(int i1, int j1, int k1, int l1, float f1, float f2, float f3, 
            float f4, float f5)
    {
        com.dotgears.c.a(i1, j1, k1, l1, f1, f2, f3, f4, f5);
    }

    public void a(int i1, int j1, int k1, int l1, float f1, float f2, float f3, 
            float f4, float f5, int i2)
    {
        com.dotgears.c.a(i1, j1, k1, l1, f1, f2, f3, f4, f5, i2);
    }

    public void a(int i1, int j1, int k1, int l1, int i2, float f1)
    {
        i j2 = a[i1];
        a(j1, k1, j1 + l1, k1 + i2, j2.d, j2.e, j2.f, j2.g, f1);
    }

    public void a(int i1, m m1)
    {
    }

    public void a(int i1, m m1, int j1)
    {
        c[e] = i1;
        d[e] = m1;
        b[e] = j1;
        e = 1 + e;
        if (e >= 50)
        {
            e = 0;
        }
    }

    public void a(i i1, int j1, int k1, float f1)
    {
        a(j1, k1, j1 + i1.b, k1 + i1.c, i1.d, i1.e, i1.f, i1.g, f1);
    }

    public void a(i i1, int j1, int k1, float f1, int l1)
    {
        a(j1, k1, j1 + i1.b, k1 + i1.c, i1.d, i1.e, i1.f, i1.g, f1, l1);
    }

    public void a(boolean flag, int i1, float f1)
    {
        if (f.g)
        {
            if (flag)
            {
                f.a(0.0F, 1.0F, 5, f1);
            } else
            {
                f.a(1.0F, 0.0F, 5, f1);
            }
            f.a(0.0F);
            g = i1;
        }
    }

    public void a(float af[], float af1[])
    {
        int i1 = 0;
        do
        {
            if (i1 >= 10)
            {
                u = 10;
                return;
            }
            s[i1] = (int)af[i1];
            t[i1] = (int)af1[i1];
            i1++;
        } while (true);
    }

    public i[] a(String s1)
    {
        int i1;
        int j1;
        int k1;
        i1 = 0;
        j1 = 0;
        k1 = 0;
_L7:
        if (j1 < 512) goto _L2; else goto _L1
_L1:
        if (k1 <= 0) goto _L4; else goto _L3
_L3:
        i ai[];
        int l1;
        ai = new i[k1];
        l1 = 0;
_L5:
        if (i1 >= 512)
        {
            return ai;
        }
        if (a[i1] != null && a[i1].a.startsWith(s1))
        {
            ai[l1] = a[i1];
            l1++;
        }
        i1++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (a[j1] != null && a[j1].a.startsWith(s1))
        {
            k1++;
        }
        j1++;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L5; else goto _L4
_L4:
        return null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public i b(String s1)
    {
        int i1 = 0;
        do
        {
            if (i1 >= 512)
            {
                return null;
            }
            if (a[i1] != null && a[i1].a.startsWith(s1))
            {
                return a[i1];
            }
            i1++;
        } while (true);
    }

    public void b()
    {
        v = 0;
        if (r) goto _L2; else goto _L1
_L1:
        int i1 = 0;
_L5:
        if (i1 < 50) goto _L3; else goto _L2
_L2:
        b(0.015F);
        if (!r)
        {
            C.a(0.015F);
            n.a(0.015F);
            if (!f.g || f.a != 0.0F)
            {
                f.a(0.015F);
                if (f.g)
                {
                    a(g, this);
                }
            }
            if (!h.g || h.a != 0.0F)
            {
                h.a(0.015F);
            }
            int ai[];
            if (l > 0)
            {
                l = -1 + l;
                i = com.dotgears.j.a(-k, k);
                j = com.dotgears.j.a(-k, k);
            } else
            {
                i = 0;
                j = 0;
            }
        }
        C.a(this);
        n.a(this);
        if (!f.g || f.a != 0.0F)
        {
            a(o.i, -144, -256, 864, 1536, f.a);
        }
        if (!h.g || h.a != 0.0F)
        {
            a(p.i, -144, -256, 864, 1536, h.a);
        }
        return;
_L3:
        if (b[i1] > 0)
        {
            ai = b;
            ai[i1] = -30 + ai[i1];
            if (b[i1] <= 0)
            {
                a(c[i1], d[i1]);
            }
        }
        i1++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void b(float f1)
    {
    }

    public void b(int i1, int j1)
    {
        ((e)n.c()).a(i1, j1);
    }

    public void c()
    {
    }

    public void c(float f1)
    {
        if (h.g)
        {
            h.a(1.0F, 0.0F, 11, f1);
            h.a(0.0F);
        }
    }

    public void c(int i1, int j1)
    {
        w[v] = i1;
        x[v] = j1;
        v = 1 + v;
    }

    public void d()
    {
        e = 0;
        int i1 = 0;
        do
        {
            if (i1 >= 50)
            {
                return;
            }
            b[i1] = 0;
            i1++;
        } while (true);
    }
}
