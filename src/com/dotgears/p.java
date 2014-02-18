// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dotgears;


// Referenced classes of package com.dotgears:
//            m, g, i, r, 
//            k, l

public class p extends m
{

    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public int n;
    public k o;
    public r p;
    public i q;
    public i r;
    public l s;

    public p()
    {
        e = 0;
        f = 0;
        l = 0;
        r = g.D.b("score_panel");
        q = g.D.b("new");
        s = g.D.B;
        c = r.b;
        d = r.c;
        n = 512 - d >> 1;
        p = new r();
        o = new k();
    }

    public void a(float f1)
    {
        if (F) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!p.g)
        {
            p.a(f1);
        }
        switch (k)
        {
        default:
            return;

        case 0: // '\0'
            b = (int)p.a;
            if (p.g)
            {
                if (l > 0)
                {
                    k = 1;
                    p.a(0.0F, l, 0, 0.5F);
                    return;
                } else
                {
                    k = 2;
                    return;
                }
            }
            break;

        case 1: // '\001'
            e = (int)p.a;
            if (p.g)
            {
                k = 2;
                g.D.a(e);
                if (e > f)
                {
                    f = e;
                    m = true;
                }
                if (e >= j)
                {
                    o.a(0);
                } else
                if (e >= i)
                {
                    o.a(1);
                } else
                if (e >= h)
                {
                    o.a(2);
                } else
                if (e >= g)
                {
                    o.a(3);
                }
                o.a = 32 + a;
                o.b = 44 + b;
                return;
            }
            break;

        case 2: // '\002'
            o.a(f1);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void a(int i1, int j1, int k1, int l1, int i2, int j2)
    {
        l = i1;
        f = j1;
        e = 0;
        g = k1;
        h = l1;
        i = i2;
        j = j2;
        F = true;
        G = true;
        m = false;
        a = 288 - c >> 1;
        b = 504;
        p.a(b, n, 11, 0.5F);
        k = 0;
        o.F = false;
        o.G = false;
    }

    public void a(g g1)
    {
        if (!G)
        {
            return;
        }
        g1.a(r.i, a, b, 1.0F, 1.0F, 1.0F);
        s.a(g1, e, 210 + a, 36 + b, false, 10);
        s.a(g1, f, 210 + a, 78 + b, false, 10);
        if (m)
        {
            g1.a(q.i, 142 + a, 60 + b, 1.0F, 1.0F, 1.0F);
        }
        o.a(g1);
    }
}
