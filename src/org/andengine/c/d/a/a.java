// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.c.d.a;

import org.andengine.opengl.d.a.c;
import org.andengine.opengl.d.b;
import org.andengine.opengl.d.e;

// Referenced classes of package org.andengine.c.d.a:
//            b

public class a extends b
    implements org.andengine.c.d.a.b
{

    public a(e e, int i, org.andengine.opengl.d.a a1, boolean flag, c c1)
    {
        super(e, i, a1, flag, c1);
    }

    public void a(org.andengine.c.d.a a1)
    {
        float af[] = a;
        float f = a1.g().f();
        af[2] = f;
        af[7] = f;
        af[12] = f;
        af[17] = f;
        f();
    }

    public void a(org.andengine.c.d.a a1, float f, float f1, float f2, float f3, float f4, float f5, 
            float f6, float f7)
    {
        float af[] = a;
        af[0] = f;
        af[1] = f1;
        af[5] = f2;
        af[6] = f3;
        af[10] = f4;
        af[11] = f5;
        af[15] = f6;
        af[16] = f7;
        f();
    }

    public void b(org.andengine.c.d.a a1)
    {
        float af[] = a;
        float f = a1.o();
        float f1 = a1.p();
        af[0] = 0.0F;
        af[1] = 0.0F;
        af[5] = 0.0F;
        af[6] = f1;
        af[10] = f;
        af[11] = 0.0F;
        af[15] = f;
        af[16] = f1;
        f();
    }

    public void c(org.andengine.c.d.a a1)
    {
        float af[] = a;
        org.andengine.opengl.c.c.b b1 = a1.t();
        float f;
        float f1;
        float f2;
        float f3;
        if (a1.v())
        {
            if (a1.u())
            {
                f = b1.e();
                f1 = b1.d();
                f2 = b1.g();
                f3 = b1.f();
            } else
            {
                f = b1.d();
                f1 = b1.e();
                f2 = b1.g();
                f3 = b1.f();
            }
        } else
        if (a1.u())
        {
            f = b1.e();
            f1 = b1.d();
            f2 = b1.f();
            f3 = b1.g();
        } else
        {
            f = b1.d();
            f1 = b1.e();
            f2 = b1.f();
            f3 = b1.g();
        }
        if (b1.h())
        {
            af[3] = f1;
            af[4] = f2;
            af[8] = f;
            af[9] = f2;
            af[13] = f1;
            af[14] = f3;
            af[18] = f;
            af[19] = f3;
        } else
        {
            af[3] = f;
            af[4] = f2;
            af[8] = f;
            af[9] = f3;
            af[13] = f1;
            af[14] = f2;
            af[18] = f1;
            af[19] = f3;
        }
        f();
    }
}
