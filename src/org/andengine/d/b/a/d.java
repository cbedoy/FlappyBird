// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.d.b.a;

import org.andengine.opengl.util.f;

// Referenced classes of package org.andengine.d.b.a:
//            a, b

public class d extends a
{

    public static boolean a(float af[], int i, float f1, float f2)
    {
        return a(af, i, 0, 1, 2, f1, f2);
    }

    public static boolean a(float af[], int i, int j, int k, int l, float f1, float f2)
    {
        int i1 = i - 1;
        boolean flag = false;
        int j1 = 0;
        do
        {
            if (j1 >= i)
            {
                return flag;
            }
            float f3 = f.a(af, j, l, j1);
            float f4 = f.a(af, k, l, j1);
            float f5 = f.a(af, j, l, i1);
            float f6 = f.a(af, k, l, i1);
            boolean flag1;
            if ((f4 < f2 && f6 >= f2 || f6 < f2 && f4 >= f2) && (f3 <= f1 || f5 <= f1))
            {
                int k1;
                boolean flag2;
                if (f3 + ((f2 - f4) / (f6 - f4)) * (f5 - f3) < f1)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                flag1 = flag2 ^ flag;
            } else
            {
                flag1 = flag;
            }
            k1 = j1 + 1;
            flag = flag1;
            i1 = j1;
            j1 = k1;
        } while (true);
    }

    private static boolean a(float af[], int i, int j, int k, int l, int i1, float af1[], int j1, 
            int k1, int l1, int i2)
    {
        float f1 = f.a(af, i, k, l);
        float f2 = f.a(af, j, k, l);
        float f3 = f.a(af, i, k, i1);
        float f4 = f.a(af, j, k, i1);
        int j2 = j1 - 2;
        do
        {
            if (j2 < 0)
            {
                return b.a(f1, f2, f3, f4, f.a(af1, k1, i2, j1 - 1), f.a(af1, l1, i2, j1 - 1), f.a(af1, k1, i2, 0), f.a(af1, l1, i2, 0));
            }
            if (b.a(f1, f2, f3, f4, f.a(af1, k1, i2, j2), f.a(af1, l1, i2, j2), f.a(af1, k1, i2, j2 + 1), f.a(af1, l1, i2, j2 + 1)))
            {
                return true;
            }
            j2--;
        } while (true);
    }

    public static boolean a(float af[], int i, int j, int k, int l, float af1[], int i1, int j1, 
            int k1, int l1)
    {
        int i2 = i - 2;
        do
        {
            if (i2 < 0)
            {
                if (a(af, j, k, l, i - 1, 0, af1, i1, j1, k1, l1))
                {
                    return true;
                }
                break;
            }
            if (a(af, j, k, l, i2, i2 + 1, af1, i1, j1, k1, l1))
            {
                return true;
            }
            i2--;
        } while (true);
        if (a(af, i, f.a(af1, j1, l1, 0), f.a(af1, k1, l1, 0)))
        {
            return true;
        }
        return a(af1, i1, f.a(af, j, l, 0), f.a(af, k, l, 0));
    }

    public static boolean a(float af[], int i, float af1[], int j)
    {
        return a(af, i, 0, 1, 2, af1, j, 0, 1, 2);
    }
}
