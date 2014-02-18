// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.input.a.a;

import android.view.MotionEvent;
import org.andengine.d.a.b.g;

// Referenced classes of package org.andengine.input.a.a:
//            d, b, c, e

public abstract class a
    implements d
{

    private e a;
    private final g b = new b(this);

    public a()
    {
    }

    static e a(a a1)
    {
        return a1.a;
    }

    protected void a(float f, float f1, int i, int j, MotionEvent motionevent)
    {
        org.andengine.input.a.a a1 = org.andengine.input.a.a.a(f, f1, i, j, MotionEvent.obtain(motionevent));
        c c1 = (c)b.d();
        c1.a(a1);
        b.b(c1);
    }

    public void a(e e)
    {
        a = e;
    }

    public void a_(float f)
    {
        b.a_(f);
    }
}
