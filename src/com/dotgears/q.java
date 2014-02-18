// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dotgears;


// Referenced classes of package com.dotgears:
//            m, d, i, g

public class q extends m
{

    d a[];
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public float i;
    public d j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public i p[];

    public q()
    {
        a = new d[10];
        i = 1.0F;
        j = null;
        m = false;
        n = false;
    }

    public void a(float f1)
    {
        while (!m || j == null) 
        {
            return;
        }
        j.a(f1);
    }

    public void a(int i1, int j1)
    {
        b = i1;
        c = j1;
        d = 0;
        m = true;
        n = true;
        k = false;
        l = false;
        i = 1.0F;
    }

    public void a(int i1, String s, int ai[], int j1, int k1, boolean flag)
    {
        d d1 = new d(i1, s, ai, j1, k1, flag);
        a[i1] = d1;
    }

    public void a(int i1, boolean flag)
    {
        if (flag)
        {
            a[i1].a();
        }
        a[i1].b();
        j = a[i1];
    }

    public void a(g g1)
    {
        if (!n)
        {
            return;
        }
        i i1 = p[0];
        if (j != null)
        {
            i1 = p[j.j];
        }
        g1.a(i1.i, b - g, c - h, 1.0F, 1.0F, i);
    }

    public void a(String s, int i1, int j1, int k1, int l1)
    {
        p = g.D.a(s);
        o = p.length;
        if (i1 != 0 && j1 != 0)
        {
            e = i1;
            f = j1;
        } else
        {
            e = p[0].b;
            f = p[0].c;
        }
        if (k1 != 0 && l1 != 0)
        {
            g = k1;
            h = l1;
            return;
        } else
        {
            g = p[0].b - e >> 1;
            h = p[0].c - f >> 1;
            return;
        }
    }
}
