// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.d.g;

import android.util.FloatMath;
import java.util.Random;

public final class a
{

    public static final Random a = new Random(System.nanoTime());

    public static final float a(float f)
    {
        return 0.01745329F * f;
    }

    public static final boolean a(int i)
    {
        return i != 0 && (i & i - 1) == 0;
    }

    public static float[] a(float af[], float f, float f1, float f2)
    {
        if (f == 0.0F) goto _L2; else goto _L1
_L1:
        float f4;
        float f5;
        int i;
        float f3 = a(f);
        f4 = FloatMath.sin(f3);
        f5 = FloatMath.cos(f3);
        i = -2 + af.length;
_L5:
        if (i >= 0) goto _L3; else goto _L2
_L2:
        return af;
_L3:
        float f6 = af[i];
        float f7 = af[i + 1];
        af[i] = f1 + (f5 * (f6 - f1) - f4 * (f7 - f2));
        af[i + 1] = f2 + (f4 * (f6 - f1) + f5 * (f7 - f2));
        i -= 2;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static float[] b(float af[], float f, float f1, float f2)
    {
        return a(af, -f, f1, f2);
    }

}
