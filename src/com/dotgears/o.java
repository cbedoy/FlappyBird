// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dotgears;


// Referenced classes of package com.dotgears:
//            m, g, i

public class o extends m
{

    public int a;
    public int b;
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    private i m[];

    public o()
    {
        a = 12;
        b = 14;
        m = g.D.a("number_context");
    }

    public void a(float f1)
    {
        if (F && d > 0)
        {
            d = -1 + d;
            if (g < 2)
            {
                k = k + g;
                i = 1 + i;
                if (i == 4)
                {
                    i = 0;
                    g = g + h;
                }
            }
            if (d <= 0)
            {
                F = false;
                G = false;
                return;
            }
        }
    }

    public void a(g g1)
    {
        if (!G)
        {
            return;
        }
        if (c)
        {
            g1.a(m[10].i, j, k, 1.0F, 1.0F, 1.0F);
        }
        a(g1, e, j + l, k, false, f);
    }

    public void a(g g1, int i1, int j1, int k1, boolean flag, int l1)
    {
        int i2 = j1 - a;
        boolean flag1 = true;
        int j2 = i1;
        do
        {
            if (l1 <= 0)
            {
                return;
            }
            int l2;
            if (j2 > 0 || flag1)
            {
                int k2 = j2 % 10;
                g1.a(m[k2].i, i2, k1, 1.0F, 1.0F, 1.0F);
                l2 = j2 / 10;
                int i3;
                if (k2 != 1)
                {
                    i3 = i2 - (-2 + a);
                } else
                {
                    i3 = i2 - 4;
                }
                i2 = i3;
                flag1 = flag;
            } else
            {
                l2 = j2;
            }
            l1--;
            j2 = l2;
        } while (true);
    }
}
