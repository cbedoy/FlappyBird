// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.input.sensor.b;

import android.hardware.SensorManager;
import java.util.Arrays;
import org.andengine.input.sensor.a;

public class b extends a
{

    private final float d[];
    private final float e[];
    private final float f[];
    private int g;

    private void a()
    {
        SensorManager.getRotationMatrix(f, null, d, e);
        c;
        JVM INSTR tableswitch 0 1: default 44
    //                   0 44
    //                   1 70;
           goto _L1 _L1 _L2
_L2:
        SensorManager.remapCoordinateSystem(f, 2, 129, f);
_L1:
        float af[] = a;
        SensorManager.getOrientation(f, af);
        int i = -1 + af.length;
        do
        {
            if (i < 0)
            {
                return;
            }
            af[i] = 57.29578F * af[i];
            i--;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void a(int i)
    {
        super.a(i);
    }

    public void a(float af[])
    {
        super.a(af);
    }

    public void b(int i)
    {
        super.a(i);
    }

    public void b(float af[])
    {
        System.arraycopy(af, 0, d, 0, af.length);
        a();
    }

    public void c(int i)
    {
        g = i;
    }

    public void c(float af[])
    {
        System.arraycopy(af, 0, e, 0, af.length);
        a();
    }

    public String toString()
    {
        return (new StringBuilder("Orientation: ")).append(Arrays.toString(a)).toString();
    }
}
