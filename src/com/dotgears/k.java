// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dotgears;


// Referenced classes of package com.dotgears:
//            m, g, j, i

public class k extends m
{

    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    private i g[];

    public k()
    {
        g = g.D.a("medals");
    }

    public void a(float f1)
    {
        if (F && f > 0)
        {
            f = -1 + f;
            if (f <= 0)
            {
                f = 30;
                g.D.b(-3 + a + j.a(0, 6 + c), -3 + b + j.a(0, 6 + d));
                return;
            }
        }
    }

    void a(int l)
    {
        a = 0;
        b = 0;
        c = 44;
        d = 44;
        e = l;
        f = 30;
        F = true;
        G = true;
    }

    public void a(g g1)
    {
        if (!G)
        {
            return;
        } else
        {
            g1.a(g[e].i, a, b, 1.0F, 1.0F, 1.0F);
            return;
        }
    }
}
