// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.c.b.a;

import android.opengl.GLES20;
import org.andengine.d.h.c;
import org.andengine.opengl.util.e;

// Referenced classes of package org.andengine.c.b.a:
//            b

public class a
    implements b
{

    private c a;
    private final org.andengine.d.d.a b;
    private boolean c;

    protected a()
    {
        a = null;
        b = new org.andengine.d.d.a(0.0F, 0.0F, 0.0F, 1.0F);
        c = true;
    }

    public a(org.andengine.d.d.a a1)
    {
        a = null;
        b = new org.andengine.d.d.a(0.0F, 0.0F, 0.0F, 1.0F);
        c = true;
        b.a(a1);
    }

    public void a(e e, org.andengine.b.a.a a1)
    {
        if (c)
        {
            GLES20.glClearColor(b.a(), b.b(), b.c(), b.d());
            GLES20.glClear(16384);
        }
    }

    public void a_(float f)
    {
        if (a != null)
        {
            a.a_(f);
        }
    }
}
