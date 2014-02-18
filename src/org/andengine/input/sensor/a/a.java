// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.input.sensor.a;

import java.util.Arrays;

// Referenced classes of package org.andengine.input.sensor.a:
//            f, b, c, d, 
//            e

public class a extends org.andengine.input.sensor.a
{

    private static final f d[];

    public void a(float af[])
    {
        super.a(af);
        d[c].a(a);
    }

    public String toString()
    {
        return (new StringBuilder("Acceleration: ")).append(Arrays.toString(a)).toString();
    }

    static 
    {
        d = new f[4];
        d[0] = new b();
        d[1] = new c();
        d[2] = new d();
        d[3] = new e();
    }
}
