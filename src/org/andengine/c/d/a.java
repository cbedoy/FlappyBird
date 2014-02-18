// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.c.d;

import org.andengine.c.c.c;
import org.andengine.opengl.b.b;
import org.andengine.opengl.b.g;
import org.andengine.opengl.d.a.d;
import org.andengine.opengl.d.e;

public class a extends c
{

    public static final org.andengine.opengl.d.a.c g = (new d(3)).a(0, "a_position", 2, 5126, false).a(1, "a_color", 4, 5121, true).a(3, "a_textureCoordinates", 2, 5126, false).a();
    protected boolean I;
    public org.andengine.opengl.c.c.b h;
    protected final org.andengine.c.d.a.b i;
    protected boolean j;

    public a(float f, float f1, float f2, float f3, org.andengine.opengl.c.c.b b1, org.andengine.c.d.a.b b2, g g1)
    {
        super(f, f1, f2, f3, g1);
        h = b1;
        i = b2;
        b(true);
        a(b1);
        x();
        b();
        y();
    }

    public a(float f, float f1, float f2, float f3, org.andengine.opengl.c.c.b b1, e e, org.andengine.opengl.d.a a1)
    {
        this(f, f1, f2, f3, b1, e, a1, ((g) (org.andengine.opengl.b.b.a())));
    }

    public a(float f, float f1, float f2, float f3, org.andengine.opengl.c.c.b b1, e e, org.andengine.opengl.d.a a1, 
            g g1)
    {
        this(f, f1, f2, f3, b1, ((org.andengine.c.d.a.b) (new org.andengine.c.d.a.a(e, 20, a1, true, g))), g1);
    }

    public a(float f, float f1, org.andengine.opengl.c.c.b b1, e e)
    {
        this(f, f1, b1.b(), b1.c(), b1, e, org.andengine.opengl.d.a.a);
    }

    public org.andengine.opengl.d.c a()
    {
        return w();
    }

    protected void a(float f, float f1, float f2, float f3, float f4, float f5, float f6, 
            float f7)
    {
        i.a(this, f, f1, f2, f3, f4, f5, f6, f7);
    }

    public void a(float f, float f1, float f2, float f3, float f4, float f5, float f6, 
            float f7, float f8, float f9, float f10, float f11, float f12, float f13, 
            float f14, float f15)
    {
        v = f;
        w = f1;
        a = f2 - f;
        b = f3 - f1;
        a(f8, f9, f10, f11, f12, f13, f14, f15);
        h.a(f4, f5, f6, f7);
        y();
    }

    protected void b()
    {
        i.a(this);
    }

    public void b(float f, float f1, float f2, float f3, float f4, float f5, float f6, 
            float f7)
    {
        v = f;
        w = f1;
        a = f2 - f;
        b = f3 - f1;
        x();
        h.a(f4, f5, f6, f7);
        y();
    }

    protected void b(org.andengine.opengl.util.e e, org.andengine.b.a.a a1)
    {
        super.b(e, a1);
        t().a().d(e);
        i.a(e, f);
    }

    protected void c(org.andengine.opengl.util.e e, org.andengine.b.a.a a1)
    {
        i.a(5, 4);
    }

    protected void d(org.andengine.opengl.util.e e, org.andengine.b.a.a a1)
    {
        i.b(e, f);
        super.d(e, a1);
    }

    public org.andengine.opengl.c.c.b t()
    {
        return h;
    }

    public boolean u()
    {
        return I;
    }

    public boolean v()
    {
        return j;
    }

    public org.andengine.c.d.a.b w()
    {
        return i;
    }

    protected void x()
    {
        i.b(this);
    }

    protected void y()
    {
        i.c(this);
    }

}
