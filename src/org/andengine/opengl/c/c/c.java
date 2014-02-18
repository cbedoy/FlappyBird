// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.c.c;

import org.andengine.opengl.c.a;

// Referenced classes of package org.andengine.opengl.c.c:
//            a

public class c extends org.andengine.opengl.c.c.a
{

    protected float b;
    protected float c;
    protected float d;
    protected float e;
    protected float f;
    protected float g;
    protected float h;
    protected float i;
    protected final float j;
    protected final boolean k;

    public c(a a1, float f1, float f2, float f3, float f4, float f5, boolean flag)
    {
        super(a1);
        b = f1;
        c = f2;
        if (flag)
        {
            k = true;
            d = f4;
            e = f3;
        } else
        {
            k = false;
            d = f3;
            e = f4;
        }
        j = f5;
        l();
    }

    public c(a a1, float f1, float f2, float f3, float f4, boolean flag)
    {
        this(a1, f1, f2, f3, f4, 1.0F, flag);
    }

    public void a(float f1, float f2, float f3, float f4)
    {
        f = f1;
        h = f2;
        g = f3;
        i = f4;
    }

    public float b()
    {
        if (k)
        {
            return e * j;
        } else
        {
            return d * j;
        }
    }

    public float c()
    {
        if (k)
        {
            return d * j;
        } else
        {
            return e * j;
        }
    }

    public float d()
    {
        return f;
    }

    public float e()
    {
        return g;
    }

    public float f()
    {
        return h;
    }

    public float g()
    {
        return i;
    }

    public boolean h()
    {
        return k;
    }

    public c i()
    {
        if (k)
        {
            return new c(a, b, c, e, d, j, k);
        } else
        {
            return new c(a, b, c, d, e, j, k);
        }
    }

    public float j()
    {
        return b;
    }

    public float k()
    {
        return c;
    }

    public void l()
    {
        a a1 = a;
        float f1 = a1.a();
        float f2 = a1.b();
        float f3 = j();
        float f4 = k();
        f = f3 / f1;
        g = (f3 + d) / f1;
        h = f4 / f2;
        i = (f4 + e) / f2;
    }
}
