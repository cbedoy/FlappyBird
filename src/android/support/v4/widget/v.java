// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.view.View;

// Referenced classes of package android.support.v4.widget:
//            af, SlidingPaneLayout, ac, s

class v extends af
{

    final SlidingPaneLayout a;

    private v(SlidingPaneLayout slidingpanelayout)
    {
        a = slidingpanelayout;
        super();
    }

    v(SlidingPaneLayout slidingpanelayout, s s)
    {
        this(slidingpanelayout);
    }

    public int a(View view)
    {
        return SlidingPaneLayout.e(a);
    }

    public int a(View view, int i, int j)
    {
        SlidingPaneLayout.LayoutParams layoutparams = (SlidingPaneLayout.LayoutParams)SlidingPaneLayout.d(a).getLayoutParams();
        int k = a.getPaddingLeft() + layoutparams.leftMargin;
        int l = k + SlidingPaneLayout.e(a);
        return Math.min(Math.max(i, k), l);
    }

    public void a(int i)
    {
label0:
        {
            if (SlidingPaneLayout.b(a).a() == 0)
            {
                if (SlidingPaneLayout.c(a) != 0.0F)
                {
                    break label0;
                }
                a.d(SlidingPaneLayout.d(a));
                a.c(SlidingPaneLayout.d(a));
                SlidingPaneLayout.a(a, false);
            }
            return;
        }
        a.b(SlidingPaneLayout.d(a));
        SlidingPaneLayout.a(a, true);
    }

    public void a(View view, float f, float f1)
    {
        SlidingPaneLayout.LayoutParams layoutparams = (SlidingPaneLayout.LayoutParams)view.getLayoutParams();
        int i = a.getPaddingLeft() + layoutparams.leftMargin;
        if (f > 0.0F || f == 0.0F && SlidingPaneLayout.c(a) > 0.5F)
        {
            i += SlidingPaneLayout.e(a);
        }
        SlidingPaneLayout.b(a).a(i, view.getTop());
        a.invalidate();
    }

    public void a(View view, int i, int j, int k, int l)
    {
        SlidingPaneLayout.a(a, i);
        a.invalidate();
    }

    public boolean a(View view, int i)
    {
        if (SlidingPaneLayout.a(a))
        {
            return false;
        } else
        {
            return ((SlidingPaneLayout.LayoutParams)view.getLayoutParams()).b;
        }
    }

    public void b(int i, int j)
    {
        SlidingPaneLayout.b(a).a(SlidingPaneLayout.d(a), j);
    }

    public void b(View view, int i)
    {
        a.a();
    }
}
