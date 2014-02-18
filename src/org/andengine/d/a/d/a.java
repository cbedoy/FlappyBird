// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.d.a.d;

import android.util.FloatMath;

public class a
{

    private float a;
    private float b;
    private float c;
    private float d;
    private float e;
    private float f;

    public a()
    {
        a = 1.0F;
        b = 0.0F;
        c = 0.0F;
        d = 1.0F;
        e = 0.0F;
        f = 0.0F;
    }

    private void a(float f1, float f2, float f3, float f4, float f5, float f6)
    {
        float f7 = a;
        float f8 = b;
        float f9 = c;
        float f10 = d;
        float f11 = e;
        float f12 = f;
        a = f7 * f1 + f8 * f3;
        b = f7 * f2 + f8 * f4;
        c = f9 * f1 + f10 * f3;
        d = f9 * f2 + f10 * f4;
        e = f5 + (f11 * f1 + f12 * f3);
        f = f6 + (f11 * f2 + f12 * f4);
    }

    private void b(float f1, float f2, float f3, float f4, float f5, float f6)
    {
        float f7 = a;
        float f8 = b;
        float f9 = c;
        float f10 = d;
        float f11 = e;
        float f12 = f;
        a = f1 * f7 + f2 * f9;
        b = f1 * f8 + f2 * f10;
        c = f3 * f7 + f4 * f9;
        d = f3 * f8 + f4 * f10;
        e = f11 + (f7 * f5 + f9 * f6);
        f = f12 + (f5 * f8 + f6 * f10);
    }

    public final void a()
    {
        a = 1.0F;
        d = 1.0F;
        b = 0.0F;
        c = 0.0F;
        e = 0.0F;
        f = 0.0F;
    }

    public final void a(float f1)
    {
        float f2 = 0.01745329F * f1;
        float f3 = FloatMath.sin(f2);
        float f4 = FloatMath.cos(f2);
        float f5 = a;
        float f6 = b;
        float f7 = c;
        float f8 = d;
        float f9 = e;
        float f10 = f;
        a = f5 * f4 - f6 * f3;
        b = f5 * f3 + f6 * f4;
        c = f7 * f4 - f8 * f3;
        d = f7 * f3 + f8 * f4;
        e = f9 * f4 - f10 * f3;
        f = f3 * f9 + f4 * f10;
    }

    public final void a(float f1, float f2)
    {
        e = f1 + e;
        f = f2 + f;
    }

    public final void a(a a1)
    {
        a = a1.a;
        d = a1.d;
        b = a1.b;
        c = a1.c;
        e = a1.e;
        f = a1.f;
    }

    public final void a(float af[])
    {
        int i = 0;
        int j = af.length >> 1;
        int k = 0;
        do
        {
            if (--j < 0)
            {
                return;
            }
            int l = k + 1;
            float f1 = af[k];
            k = l + 1;
            float f2 = af[l];
            int i1 = i + 1;
            af[i] = f1 * a + f2 * c + e;
            i = i1 + 1;
            af[i1] = f1 * b + f2 * d + f;
        } while (true);
    }

    public final void b(float f1, float f2)
    {
        a = f1 * a;
        b = f2 * b;
        c = f1 * c;
        d = f2 * d;
        e = f1 * e;
        f = f2 * f;
    }

    public final void b(a a1)
    {
        a(a1.a, a1.b, a1.c, a1.d, a1.e, a1.f);
    }

    public final void c(float f1, float f2)
    {
        float f3 = (float)Math.tan(-0.01745329F * f1);
        float f4 = (float)Math.tan(-0.01745329F * f2);
        float f5 = a;
        float f6 = b;
        float f7 = c;
        float f8 = d;
        float f9 = e;
        float f10 = f;
        a = f5 + f6 * f3;
        b = f6 + f5 * f4;
        c = f7 + f8 * f3;
        d = f8 + f7 * f4;
        e = f9 + f3 * f10;
        f = f10 + f9 * f4;
    }

    public final void c(a a1)
    {
        b(a1.a, a1.b, a1.c, a1.d, a1.e, a1.f);
    }

    public String toString()
    {
        return (new StringBuilder("Transformation{[")).append(a).append(", ").append(c).append(", ").append(e).append("][").append(b).append(", ").append(d).append(", ").append(f).append("][0.0, 0.0, 1.0]}").toString();
    }
}
