// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.a;
import android.support.v4.view.at;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v4.widget:
//            SlidingPaneLayout

class t extends a
{

    final SlidingPaneLayout b;
    private final Rect c = new Rect();

    t(SlidingPaneLayout slidingpanelayout)
    {
        b = slidingpanelayout;
        super();
    }

    private void a(android.support.v4.view.a.a a1, android.support.v4.view.a.a a2)
    {
        Rect rect = c;
        a2.a(rect);
        a1.b(rect);
        a2.c(rect);
        a1.d(rect);
        a1.c(a2.h());
        a1.a(a2.p());
        a1.b(a2.q());
        a1.c(a2.s());
        a1.h(a2.m());
        a1.f(a2.k());
        a1.a(a2.f());
        a1.b(a2.g());
        a1.d(a2.i());
        a1.e(a2.j());
        a1.g(a2.l());
        a1.a(a2.b());
        a1.b(a2.c());
    }

    public void a(View view, android.support.v4.view.a.a a1)
    {
        android.support.v4.view.a.a a2 = android.support.v4.view.a.a.a(a1);
        super.a(view, a2);
        a(a1, a2);
        a2.t();
        a1.b(android/support/v4/widget/SlidingPaneLayout.getName());
        a1.a(view);
        android.view.ViewParent viewparent = at.f(view);
        if (viewparent instanceof View)
        {
            a1.c((View)viewparent);
        }
        int i = b.getChildCount();
        for (int j = 0; j < i; j++)
        {
            View view1 = b.getChildAt(j);
            if (!b(view1) && view1.getVisibility() == 0)
            {
                at.b(view1, 1);
                a1.b(view1);
            }
        }

    }

    public boolean a(ViewGroup viewgroup, View view, AccessibilityEvent accessibilityevent)
    {
        if (!b(view))
        {
            return super.a(viewgroup, view, accessibilityevent);
        } else
        {
            return false;
        }
    }

    public boolean b(View view)
    {
        return b.e(view);
    }

    public void d(View view, AccessibilityEvent accessibilityevent)
    {
        super.d(view, accessibilityevent);
        accessibilityevent.setClassName(android/support/v4/widget/SlidingPaneLayout.getName());
    }
}
