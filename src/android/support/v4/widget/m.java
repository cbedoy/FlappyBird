// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.v4.widget:
//            q, p, o, n

public class m
{

    static final n b;
    Object a;

    m(Context context, Interpolator interpolator)
    {
        a = b.a(context, interpolator);
    }

    public static m a(Context context, Interpolator interpolator)
    {
        return new m(context, interpolator);
    }

    public void a(int i, int j, int k, int l, int i1)
    {
        b.a(a, i, j, k, l, i1);
    }

    public boolean a()
    {
        return b.a(a);
    }

    public int b()
    {
        return b.b(a);
    }

    public int c()
    {
        return b.c(a);
    }

    public int d()
    {
        return b.f(a);
    }

    public int e()
    {
        return b.g(a);
    }

    public boolean f()
    {
        return b.d(a);
    }

    public void g()
    {
        b.e(a);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 14)
        {
            b = new q();
        } else
        if (i >= 9)
        {
            b = new p();
        } else
        {
            b = new o();
        }
    }
}
