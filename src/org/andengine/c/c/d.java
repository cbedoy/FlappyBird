// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.c.c;

import org.andengine.c.a;
import org.andengine.opengl.b.g;
import org.andengine.opengl.c.c.b;
import org.andengine.opengl.c.f;
import org.andengine.opengl.d.c;
import org.andengine.opengl.util.e;

// Referenced classes of package org.andengine.c.c:
//            b

public abstract class d extends a
    implements org.andengine.c.c.b
{

    protected int c;
    protected int d;
    protected boolean e;
    protected g f;

    public d(float f1, float f2, g g)
    {
        super(f1, f2);
        c = 770;
        d = 771;
        e = false;
        f = g;
    }

    public void a(int i, int j)
    {
        c = i;
        d = j;
    }

    protected void a(org.andengine.opengl.c.a a1)
    {
        a(a1.g());
    }

    protected void a(b b1)
    {
        a(b1.a());
    }

    protected void a(f f1)
    {
        if (f1.n)
        {
            a(1, 771);
        }
    }

    public boolean a(org.andengine.input.a.a a1, float f1, float f2)
    {
        return false;
    }

    protected void b(e e1, org.andengine.b.a.a a1)
    {
        if (e)
        {
            e1.a();
            e1.a(c, d);
        }
    }

    public void b(boolean flag)
    {
        e = flag;
    }

    protected void d(e e1, org.andengine.b.a.a a1)
    {
        if (e)
        {
            e1.b();
        }
    }

    public void n()
    {
        super.n();
        c c1 = a();
        if (c1 != null && c1.b() && !c1.c())
        {
            c1.n();
        }
    }
}
