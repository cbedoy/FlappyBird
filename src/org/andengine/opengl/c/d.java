// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.c;

import org.andengine.opengl.util.e;

// Referenced classes of package org.andengine.opengl.c:
//            a, f, b, e, 
//            c

public abstract class d
    implements a
{

    protected final org.andengine.opengl.c.e a;
    protected final c b;
    protected final f c;
    protected int d;
    protected boolean e;
    protected b f;

    public d(org.andengine.opengl.c.e e1, c c1, f f1, b b1)
    {
        d = -1;
        e = false;
        a = e1;
        b = c1;
        c = f1;
        f = b1;
    }

    public void a(e e1)
    {
        d = e1.i();
        e1.d(d);
        e(e1);
        c.a();
        e = false;
        if (f != null)
        {
            f.a(this);
        }
    }

    public void b(e e1)
    {
        e1.e(d);
        d = -1;
        if (f != null)
        {
            f.b(this);
        }
    }

    public void c(e e1)
    {
        b(e1);
        a(e1);
    }

    public boolean c()
    {
        return d != -1;
    }

    public void d()
    {
        d = -1;
    }

    public void d(e e1)
    {
        e1.d(d);
    }

    protected abstract void e(e e1);

    public boolean e()
    {
        return e;
    }

    public c f()
    {
        return b;
    }

    public f g()
    {
        return c;
    }

    public b h()
    {
        return f;
    }

    public void i()
    {
        a.a(this);
    }
}
