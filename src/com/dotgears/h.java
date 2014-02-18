// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dotgears;

import android.util.Log;

// Referenced classes of package com.dotgears:
//            i, g

public class h
{

    public static String l = "0123456789";
    public i a[];
    protected int b[];
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    protected int g;
    protected float h;
    public char i[];
    public char j[];
    public int k;

    public h(String s, int i1)
    {
        int j1 = 0;
        super();
        a = new i[256];
        b = new int[256];
        i = new char[256];
        j = new char[256];
        k = 0;
        i ai[] = g.D.a(s);
        do
        {
            if (j1 >= ai.length)
            {
                b[32] = b[48];
                d = i1;
                return;
            }
            int k1 = Integer.parseInt(ai[j1].a.split("_")[1]);
            a[k1] = ai[j1];
            b[k1] = ai[j1].b;
            int l1;
            if (c > ai[j1].c)
            {
                l1 = c;
            } else
            {
                l1 = ai[j1].c;
            }
            c = l1;
            Log.i("FlappyBird", (new StringBuilder("Number: ")).append(ai[j1].a).append(" ").append(k1).toString());
            j1++;
        } while (true);
    }

    public void a(int i1, int j1)
    {
        int k1;
        k = 0;
        k1 = i1;
_L3:
        if (j1 > 0) goto _L2; else goto _L1
_L1:
        int i2 = 0;
_L4:
        if (i2 >= k)
        {
            if (k == 0)
            {
                i[0] = '0';
                k = 1;
            }
            return;
        }
        break MISSING_BLOCK_LABEL_95;
_L2:
        if (k1 > 0)
        {
            int l1 = k1 % 10;
            k1 /= 10;
            j[k] = l.charAt(l1);
            k = 1 + k;
        }
        j1--;
          goto _L3
        i[i2] = j[-1 + (k - i2)];
        i2++;
          goto _L4
    }

    public void a(int i1, int j1, int k1, float f1)
    {
        f = i1;
        g = j1;
        e = k1;
        h = f1;
    }

    public void a(g g1)
    {
        int i1;
        int j1;
        int k1;
        int l1;
        i1 = 0;
        j1 = k;
        k1 = 0;
        l1 = 0;
_L3:
        if (k1 < j1) goto _L2; else goto _L1
_L1:
        int k2;
        int l2;
        int i2 = l1 + 2;
        int j2 = c;
        if ((2 & e) != 0)
        {
            f = f - i2 / 2;
        } else
        if ((1 & e) != 0)
        {
            f = f - i2;
        }
        if ((4 & e) != 0)
        {
            g = g - j2 / 2;
        } else
        if ((8 & e) != 0)
        {
            g = g - j2;
        }
        k2 = f;
        l2 = g;
_L4:
        if (i1 >= j1)
        {
            return;
        }
        break MISSING_BLOCK_LABEL_168;
_L2:
        l1 = (l1 + b[i[k1]]) - d;
        k1++;
          goto _L3
        if (a[i[i1]] != null)
        {
            g1.a(a[i[i1]], k2, l2, h);
        }
        k2 = (k2 + b[i[i1]]) - d;
        i1++;
          goto _L4
    }

}
