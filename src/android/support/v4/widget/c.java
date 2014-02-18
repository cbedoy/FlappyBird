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
//            DrawerLayout

class c extends a
{

    final DrawerLayout b;
    private final Rect c = new Rect();

    c(DrawerLayout drawerlayout)
    {
        b = drawerlayout;
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
    }

    private void a(android.support.v4.view.a.a a1, ViewGroup viewgroup)
    {
        int i;
        int j;
        i = viewgroup.getChildCount();
        j = 0;
_L5:
        if (j >= i) goto _L2; else goto _L1
_L1:
        View view = viewgroup.getChildAt(j);
        if (!b(view)) goto _L4; else goto _L3
_L3:
        j++;
          goto _L5
_L4:
        switch (at.c(view))
        {
        case 0: // '\0'
            at.b(view, 1);
            // fall through

        case 1: // '\001'
            a1.b(view);
            break;

        case 2: // '\002'
            if (view instanceof ViewGroup)
            {
                a(a1, (ViewGroup)view);
            }
            break;
        }
        if (true) goto _L3; else goto _L2
_L2:
    }

    public void a(View view, android.support.v4.view.a.a a1)
    {
        android.support.v4.view.a.a a2 = android.support.v4.view.a.a.a(a1);
        super.a(view, a2);
        a1.a(view);
        android.view.ViewParent viewparent = at.f(view);
        if (viewparent instanceof View)
        {
            a1.c((View)viewparent);
        }
        a(a1, a2);
        a2.t();
        a(a1, (ViewGroup)view);
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
        View view1 = b.a();
        return view1 != null && view1 != view;
    }
}
