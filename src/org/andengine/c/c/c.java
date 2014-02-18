// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.c.c;

import org.andengine.b.a.a;
import org.andengine.opengl.b.g;

// Referenced classes of package org.andengine.c.c:
//            d, a

public abstract class c extends d
    implements org.andengine.c.c.a
{

    protected float a;
    protected float b;

    public c(float f, float f1, float f2, float f3, g g)
    {
        super(f, f1, g);
        a = f2;
        b = f3;
        q();
        r();
        s();
    }

    public boolean a(float f, float f1)
    {
        return org.andengine.d.b.a.c.a(this, f, f1);
    }

    public boolean a(a a1)
    {
        return !org.andengine.d.b.a.c.a(a1, this);
    }

    public float[] h()
    {
        return a_(0.5F * a, 0.5F * b);
    }

    public float o()
    {
        return a;
    }

    public float p()
    {
        return b;
    }

    public void q()
    {
        y = 0.5F * a;
        z = 0.5F * b;
    }

    public void r()
    {
        C = 0.5F * a;
        D = 0.5F * b;
    }

    public void s()
    {
        G = 0.5F * a;
        H = 0.5F * b;
    }
}
