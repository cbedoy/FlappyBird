// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.c.a;

import java.util.ArrayList;
import org.andengine.opengl.c.a.b.b;
import org.andengine.opengl.c.d;
import org.andengine.opengl.c.e;
import org.andengine.opengl.c.f;

// Referenced classes of package org.andengine.opengl.c.a:
//            a, b

public abstract class c extends d
    implements a
{

    protected final int g;
    protected final int h;
    protected final ArrayList i = new ArrayList();

    public c(e e, int l, int i1, org.andengine.opengl.c.c c1, f f, org.andengine.opengl.c.a.b b1)
    {
        super(e, c1, f, b1);
        g = l;
        h = i1;
    }

    private void b(b b1, int l, int i1)
    {
        if (l < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Illegal negative pTextureX supplied: '")).append(l).append("'").toString());
        }
        if (i1 < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Illegal negative pTextureY supplied: '")).append(i1).append("'").toString());
        }
        if (l + b1.c() > a() || i1 + b1.d() > b())
        {
            throw new IllegalArgumentException("Supplied pTextureAtlasSource must not exceed bounds of Texture.");
        } else
        {
            return;
        }
    }

    public int a()
    {
        return g;
    }

    public void a(b b1, int l, int i1)
    {
        b(b1, l, i1);
        b1.a(l);
        b1.b(i1);
        i.add(b1);
        e = true;
    }

    public int b()
    {
        return h;
    }

    public org.andengine.opengl.c.b h()
    {
        return j();
    }

    public org.andengine.opengl.c.a.b j()
    {
        return k();
    }

    public org.andengine.opengl.c.a.b k()
    {
        return (org.andengine.opengl.c.a.b)super.h();
    }
}
