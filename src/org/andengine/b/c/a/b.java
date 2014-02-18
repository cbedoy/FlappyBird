// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.b.c.a;

import org.andengine.opengl.view.RenderSurfaceView;

// Referenced classes of package org.andengine.b.c.a:
//            a

public class b extends a
{

    private final float a;
    private final float b;
    private float c;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;

    public b(float f1, float f2)
    {
        a = f1;
        b = f2;
    }

    public void a(RenderSurfaceView rendersurfaceview, int i, int j)
    {
        org.andengine.b.c.a.a.a(i, j);
        int k = android.view.View.MeasureSpec.getSize(i);
        int l = android.view.View.MeasureSpec.getSize(j);
        float f1 = a / b;
        float f2;
        float f3;
        float f4;
        if ((float)k / (float)l < f1)
        {
            f3 = f1 * (float)l;
            f2 = l;
            f4 = b / f2;
        } else
        {
            f2 = (float)k / f1;
            f3 = k;
            f4 = a / f3;
        }
        c = f4 * (float)k;
        d = f4 * (float)l;
        e = (a - c) / 2.0F;
        f = c + e;
        h = (b - d) / 2.0F;
        g = d + h;
        rendersurfaceview.a((int)f3, (int)f2);
    }
}
