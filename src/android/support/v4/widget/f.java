// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.View;

// Referenced classes of package android.support.v4.widget:
//            af, g, DrawerLayout, ac

class f extends af
{

    final DrawerLayout a;
    private final int b;
    private ac c;
    private final Runnable d = new g(this);

    public f(DrawerLayout drawerlayout, int i)
    {
        a = drawerlayout;
        super();
        b = i;
    }

    static void a(f f1)
    {
        f1.c();
    }

    private void b()
    {
        byte byte0 = 3;
        if (b == byte0)
        {
            byte0 = 5;
        }
        View view = a.a(byte0);
        if (view != null)
        {
            a.i(view);
        }
    }

    private void c()
    {
        int i = c.b();
        boolean flag;
        View view1;
        int k;
        if (b == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            View view2 = a.a(3);
            int l = 0;
            if (view2 != null)
            {
                l = -view2.getWidth();
            }
            int i1 = l + i;
            view1 = view2;
            k = i1;
        } else
        {
            View view = a.a(5);
            int j = a.getWidth() - i;
            view1 = view;
            k = j;
        }
        if (view1 != null && (flag && view1.getLeft() < k || !flag && view1.getLeft() > k) && a.a(view1) == 0)
        {
            DrawerLayout.LayoutParams layoutparams = (DrawerLayout.LayoutParams)view1.getLayoutParams();
            c.a(view1, k, view1.getTop());
            layoutparams.c = true;
            a.invalidate();
            b();
            a.c();
        }
    }

    public int a(View view)
    {
        return view.getWidth();
    }

    public int a(View view, int i, int j)
    {
        if (a.a(view, 3))
        {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        } else
        {
            int k = a.getWidth();
            return Math.max(k - view.getWidth(), Math.min(i, k));
        }
    }

    public void a()
    {
        a.removeCallbacks(d);
    }

    public void a(int i)
    {
        a.a(b, i, c.c());
    }

    public void a(int i, int j)
    {
        a.postDelayed(d, 160L);
    }

    public void a(ac ac1)
    {
        c = ac1;
    }

    public void a(View view, float f1, float f2)
    {
        float f3;
        int i;
        f3 = a.d(view);
        i = view.getWidth();
        if (!a.a(view, 3)) goto _L2; else goto _L1
_L1:
        int j;
        if (f1 > 0.0F || f1 == 0.0F && f3 > 0.5F)
        {
            j = 0;
        } else
        {
            j = -i;
        }
_L4:
        c.a(j, view.getTop());
        a.invalidate();
        return;
_L2:
        j = a.getWidth();
        if (f1 < 0.0F || f1 == 0.0F && f3 > 0.5F)
        {
            j -= i;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(View view, int i, int j, int k, int l)
    {
        int i1 = view.getWidth();
        float f1;
        byte byte0;
        if (a.a(view, 3))
        {
            f1 = (float)(i1 + i) / (float)i1;
        } else
        {
            f1 = (float)(a.getWidth() - i) / (float)i1;
        }
        a.b(view, f1);
        if (f1 == 0.0F)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        view.setVisibility(byte0);
        a.invalidate();
    }

    public boolean a(View view, int i)
    {
        return a.g(view) && a.a(view, b) && a.a(view) == 0;
    }

    public int b(View view, int i, int j)
    {
        return view.getTop();
    }

    public void b(int i, int j)
    {
        View view;
        if ((i & 1) == 1)
        {
            view = a.a(3);
        } else
        {
            view = a.a(5);
        }
        if (view != null && a.a(view) == 0)
        {
            c.a(view, j);
        }
    }

    public void b(View view, int i)
    {
        ((DrawerLayout.LayoutParams)view.getLayoutParams()).c = false;
        b();
    }

    public boolean b(int i)
    {
        return false;
    }
}
