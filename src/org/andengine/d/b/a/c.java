// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.d.b.a;

import org.andengine.d.a.d.a;

// Referenced classes of package org.andengine.d.b.a:
//            d

public class c extends d
{

    private static final float a[] = new float[8];
    private static final float b[] = new float[8];
    private static final float c[] = new float[8];

    public static void a(float f, float f1, float f2, float f3, a a1, float af[])
    {
        float f4 = f + f2;
        float f5 = f1 + f3;
        af[0] = f;
        af[1] = f1;
        af[2] = f4;
        af[3] = f1;
        af[4] = f4;
        af[5] = f5;
        af[6] = f;
        af[7] = f5;
        a1.a(af);
    }

    private static void a(org.andengine.b.a.a a1, float af[])
    {
        af[0] = a1.a();
        af[1] = a1.c();
        af[2] = a1.b();
        af[3] = a1.c();
        af[4] = a1.b();
        af[5] = a1.d();
        af[6] = a1.a();
        af[7] = a1.d();
        org.andengine.d.g.a.a(af, a1.k(), a1.g(), a1.h());
    }

    public static void a(org.andengine.c.c.c c1, float af[])
    {
        a(0.0F, 0.0F, c1.o(), c1.p(), c1.k(), af);
    }

    public static boolean a(org.andengine.b.a.a a1, org.andengine.c.c.c c1)
    {
        a(a1, b);
        a(c1, c);
        return org.andengine.d.b.a.d.a(b, 4, c, 4);
    }

    public static boolean a(org.andengine.c.c.c c1, float f, float f1)
    {
        a(c1, a);
        return org.andengine.d.b.a.d.a(a, 4, f, f1);
    }

}
