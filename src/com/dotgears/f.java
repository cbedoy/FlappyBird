// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dotgears;


// Referenced classes of package com.dotgears:
//            m, g, i

public class f extends m
{

    public i a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;

    public f()
    {
    }

    public void a(float f1)
    {
        int j;
        int ai[];
        int ai1[];
        int k;
        j = g.D.u;
        ai = g.D.s;
        ai1 = g.D.t;
        i = false;
        k = 0;
_L5:
        if (k < j) goto _L2; else goto _L1
_L1:
        g = false;
        h = false;
        if (i != f)
        {
            if (!f)
            {
                break; /* Loop/switch isn't completed */
            }
            h = true;
            f = false;
        }
        return;
_L2:
        if (ai[k] <= b || ai[k] >= b + d || ai1[k] <= c || ai1[k] >= c + e)
        {
            break; /* Loop/switch isn't completed */
        }
        i = true;
        if (true) goto _L1; else goto _L3
_L3:
        k++;
        if (true) goto _L5; else goto _L4
_L4:
        g = true;
        f = true;
        return;
    }

    public void a(int j, int k)
    {
        b = j;
        c = k;
        F = true;
        G = true;
        i = false;
        g = false;
        h = false;
        f = false;
    }

    public void a(g g1)
    {
        if (f)
        {
            g1.a(a.i, b, 2 + c, 1.0F, 1.0F, 1.0F);
            return;
        } else
        {
            g1.a(a.i, b, c, 1.0F, 1.0F, 1.0F);
            return;
        }
    }

    public void a(String s)
    {
        a = g.D.b(s);
        d = a.b;
        e = a.c;
    }
}
