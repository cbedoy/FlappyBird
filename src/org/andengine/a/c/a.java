// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.a.c;

import android.media.SoundPool;
import org.andengine.a.c.a.b;
import org.andengine.a.d;

// Referenced classes of package org.andengine.a.c:
//            c

public class a extends org.andengine.a.a
{

    private int c;
    private int d;
    private boolean e;
    private int f;
    private float g;

    a(c c1, int k)
    {
        super(c1);
        g = 1.0F;
        c = k;
    }

    private SoundPool j()
    {
        return i().c();
    }

    protected d a()
    {
        return i();
    }

    public void a(boolean flag)
    {
        e = flag;
    }

    protected void c()
    {
        throw new b();
    }

    public void d()
    {
        super.d();
        float f1 = b();
        float f2 = f1 * a;
        float f3 = f1 * b;
        d = j().play(c, f2, f3, 1, f, g);
    }

    public void e()
    {
        super.e();
        if (d != 0)
        {
            j().stop(d);
        }
    }

    public void f()
    {
        g();
        j().unload(c);
        c = 0;
        e = false;
        i().b(this);
        super.f();
    }

    public int h()
    {
        return c;
    }

    protected c i()
    {
        return (c)super.a();
    }
}
