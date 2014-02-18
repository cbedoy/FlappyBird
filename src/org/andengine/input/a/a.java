// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.input.a;

import android.view.MotionEvent;

// Referenced classes of package org.andengine.input.a:
//            b

public class a
{

    private static final b f = new b(null);
    protected int a;
    protected float b;
    protected float c;
    protected int d;
    protected MotionEvent e;

    public a()
    {
    }

    public static a a(float f1, float f2, int l, int i1, MotionEvent motionevent)
    {
        a a1 = (a)f.d();
        a1.b(f1, f2, l, i1, motionevent);
        return a1;
    }

    private void b(float f1, float f2, int l, int i1, MotionEvent motionevent)
    {
        b = f1;
        c = f2;
        d = l;
        a = i1;
        e = motionevent;
    }

    public void a()
    {
        f.c(this);
    }

    public void a(float f1, float f2)
    {
        b = f1;
        c = f2;
    }

    public float b()
    {
        return b;
    }

    public void b(float f1, float f2)
    {
        b = f1 + b;
        c = f2 + c;
    }

    public float c()
    {
        return c;
    }

    public int d()
    {
        return a;
    }

    public int e()
    {
        return d;
    }

    public boolean f()
    {
        return d == 0;
    }

    public boolean g()
    {
        return d == 1;
    }

    public boolean h()
    {
        return d == 2;
    }

    public boolean i()
    {
        return d == 3;
    }

    public boolean j()
    {
        return d == 4;
    }

    public MotionEvent k()
    {
        return e;
    }

}
