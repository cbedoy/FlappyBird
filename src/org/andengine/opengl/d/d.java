// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.d;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.andengine.d.c;
import org.andengine.opengl.b.g;
import org.andengine.opengl.util.BufferUtils;
import org.andengine.opengl.util.e;

// Referenced classes of package org.andengine.opengl.d:
//            c, a, e

public abstract class d
    implements org.andengine.opengl.d.c
{

    protected final int c;
    protected final boolean d;
    protected final int e;
    protected final ByteBuffer f;
    protected int g;
    protected boolean h;
    protected boolean i;
    protected final org.andengine.opengl.d.e j;
    protected final org.andengine.opengl.d.a.c k;

    public d(org.andengine.opengl.d.e e1, int l, a a1, boolean flag, org.andengine.opengl.d.a.c c1)
    {
        g = -1;
        h = true;
        j = e1;
        c = l;
        e = a1.a();
        d = flag;
        k = c1;
        f = BufferUtils.a(l * 4);
        f.order(ByteOrder.nativeOrder());
    }

    private void c(e e1)
    {
        g = e1.h();
        h = true;
    }

    protected abstract void a();

    public void a(int l, int i1)
    {
        GLES20.glDrawArrays(l, 0, i1);
    }

    public void a(e e1)
    {
        e1.b(g);
        g = -1;
    }

    public void a(e e1, g g1)
    {
        b(e1);
        g1.a(e1, k);
    }

    public void b(e e1)
    {
        if (g == -1)
        {
            c(e1);
            if (j != null)
            {
                j.a(this);
            }
        }
        e1.a(g);
        if (h)
        {
            a();
            h = false;
        }
    }

    public void b(e e1, g g1)
    {
        g1.b(e1);
    }

    public boolean b()
    {
        return d;
    }

    public boolean c()
    {
        return i;
    }

    public boolean d()
    {
        return g != -1;
    }

    public void e()
    {
        g = -1;
        h = true;
    }

    public void f()
    {
        h = true;
    }

    protected void finalize()
    {
        super.finalize();
        if (!i)
        {
            n();
        }
    }

    public void n()
    {
        if (!i)
        {
            i = true;
            if (j != null)
            {
                j.b(this);
            }
            BufferUtils.a(f);
            return;
        } else
        {
            throw new c();
        }
    }
}
