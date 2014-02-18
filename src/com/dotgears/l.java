// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dotgears;


// Referenced classes of package com.dotgears:
//            g, i

public class l
{

    public int a;
    public int b;
    private i c[];

    public l(String s)
    {
        c = g.D.a(s);
        a = c[0].b;
        b = c[0].c;
    }

    public void a(g g1, int j, int k, int i1, boolean flag, int j1)
    {
        int k1 = k - a;
        boolean flag1 = true;
        int l1 = j;
        do
        {
            if (j1 <= 0)
            {
                return;
            }
            int k2;
            if (l1 > 0 || flag1)
            {
                int i2 = l1 % 10;
                g1.a(c[i2].i, k1, i1, 1.0F, 1.0F, 1.0F);
                int j2 = l1 / 10;
                k1 -= a;
                k2 = j2;
                flag1 = flag;
            } else
            {
                k2 = l1;
            }
            j1--;
            l1 = k2;
        } while (true);
    }
}
