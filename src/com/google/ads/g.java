// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

public class g
{

    public static final g a = new g(-1, -2, "mb");
    public static final g b = new g(320, 50, "mb");
    public static final g c = new g(300, 250, "as");
    public static final g d = new g(468, 60, "as");
    public static final g e = new g(728, 90, "as");
    public static final g f = new g(160, 600, "as");
    private final int g;
    private final int h;
    private boolean i;
    private boolean j;
    private boolean k;
    private String l;

    public g(int i1, int j1)
    {
        this(i1, j1, null);
        if (f())
        {
            k = false;
            l = "mb";
            return;
        } else
        {
            k = true;
            return;
        }
    }

    private g(int i1, int j1, String s)
    {
        boolean flag = true;
        super();
        g = i1;
        h = j1;
        l = s;
        boolean flag1;
        if (i1 == -1)
        {
            flag1 = flag;
        } else
        {
            flag1 = false;
        }
        i = flag1;
        if (j1 != -2)
        {
            flag = false;
        }
        j = flag;
        k = false;
    }

    private static int a(Context context)
    {
        DisplayMetrics displaymetrics = context.getResources().getDisplayMetrics();
        return (int)((float)displaymetrics.widthPixels / displaymetrics.density);
    }

    public static g a(g g1, Context context)
    {
        if (context == null || !g1.f())
        {
            if (g1.f())
            {
                g1 = b;
            }
            return g1;
        }
        int i1;
        int j1;
        g g2;
        if (g1.i)
        {
            i1 = a(context);
        } else
        {
            i1 = g1.a();
        }
        if (g1.j)
        {
            j1 = b(context);
        } else
        {
            j1 = g1.b();
        }
        g2 = new g(i1, j1, g1.l);
        g2.j = g1.j;
        g2.i = g1.i;
        g2.k = g1.k;
        return g2;
    }

    private static int b(Context context)
    {
        DisplayMetrics displaymetrics = context.getResources().getDisplayMetrics();
        int i1 = (int)((float)displaymetrics.heightPixels / displaymetrics.density);
        if (i1 <= 400)
        {
            return 32;
        }
        return i1 > 720 ? 90 : 50;
    }

    private boolean f()
    {
        return g < 0 || h < 0;
    }

    public int a()
    {
        if (g < 0)
        {
            throw new UnsupportedOperationException("Ad size was not set before getWidth() was called.");
        } else
        {
            return g;
        }
    }

    public int b()
    {
        if (h < 0)
        {
            throw new UnsupportedOperationException("Ad size was not set before getHeight() was called.");
        } else
        {
            return h;
        }
    }

    public boolean c()
    {
        return i;
    }

    public boolean d()
    {
        return j;
    }

    public boolean e()
    {
        return k;
    }

    public boolean equals(Object obj)
    {
        g g1;
        if (obj instanceof g)
        {
            if (g == (g1 = (g)obj).g && h == g1.h)
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return Integer.valueOf(g).hashCode() << 16 | 0xffff & Integer.valueOf(h).hashCode();
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(a()).append("x").append(b());
        String s;
        if (l == null)
        {
            s = "";
        } else
        {
            s = (new StringBuilder()).append("_").append(l).toString();
        }
        return stringbuilder.append(s).toString();
    }

}
