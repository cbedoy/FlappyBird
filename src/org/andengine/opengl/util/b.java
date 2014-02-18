// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.util;

import android.opengl.Matrix;

// Referenced classes of package org.andengine.opengl.util:
//            c, d

public class b
{

    final float a[] = new float[512];
    int b;
    private final float c[] = new float[32];

    public b()
    {
        a();
    }

    private static void a(float af[], int i, float f, float f1)
    {
        af[i + 0] = 1.0F;
        af[i + 1] = (float)Math.tan(-0.01745329F * f1);
        af[i + 2] = 0.0F;
        af[i + 3] = 0.0F;
        af[i + 4] = (float)Math.tan(-0.01745329F * f);
        af[i + 5] = 1.0F;
        af[i + 6] = 0.0F;
        af[i + 7] = 0.0F;
        af[i + 8] = 0.0F;
        af[i + 9] = 0.0F;
        af[i + 10] = 1.0F;
        af[i + 11] = 0.0F;
        af[i + 12] = 0.0F;
        af[i + 13] = 0.0F;
        af[i + 14] = 0.0F;
        af[i + 15] = 1.0F;
    }

    public void a()
    {
        Matrix.setIdentityM(a, b);
    }

    public void a(float f, float f1)
    {
        a(c, 0, f, f1);
        System.arraycopy(a, b, c, 16, 16);
        Matrix.multiplyMM(a, b, c, 16, c, 0);
    }

    public void a(float f, float f1, float f2)
    {
        Matrix.translateM(a, b, f, f1, f2);
    }

    public void a(float f, float f1, float f2, float f3)
    {
        Matrix.setRotateM(c, 0, f, f1, f2, f3);
        System.arraycopy(a, b, c, 16, 16);
        Matrix.multiplyMM(a, b, c, 16, c, 0);
    }

    public void a(float f, float f1, float f2, float f3, float f4, float f5)
    {
        Matrix.orthoM(a, b, f, f1, f2, f3, f4, f5);
    }

    public void b()
    {
        if (16 + b >= 512)
        {
            throw new c();
        } else
        {
            System.arraycopy(a, b, a, 16 + b, 16);
            b = 16 + b;
            return;
        }
    }

    public void b(float f, float f1, float f2)
    {
        Matrix.scaleM(a, b, f, f1, f2);
    }

    public void c()
    {
        if (-16 + b <= -16)
        {
            throw new d();
        } else
        {
            b = -16 + b;
            return;
        }
    }

    public void d()
    {
        b = 0;
        a();
    }
}
