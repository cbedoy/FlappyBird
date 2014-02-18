// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.internal:
//            ai, p, al, r, 
//            w

final class am extends ai
    implements android.view.View.OnAttachStateChangeListener, android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    private WeakReference c;
    private boolean d;

    protected am(r r1, int i)
    {
        super(r1, i, null);
        d = false;
    }

    private void b(View view)
    {
        int i = -1;
        if (p.e())
        {
            Display display = view.getDisplay();
            if (display != null)
            {
                i = display.getDisplayId();
            }
        }
        android.os.IBinder ibinder = view.getWindowToken();
        int ai1[] = new int[2];
        view.getLocationInWindow(ai1);
        int j = view.getWidth();
        int k = view.getHeight();
        b.c = i;
        b.a = ibinder;
        b.d = ai1[0];
        b.e = ai1[1];
        b.f = j + ai1[0];
        b.g = k + ai1[1];
        if (d)
        {
            a();
            d = false;
        }
    }

    public void a()
    {
        if (b.a != null)
        {
            super.a();
            return;
        }
        boolean flag;
        if (c != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
    }

    protected void a(int i)
    {
        b = new al(i, null, null);
    }

    public void a(View view)
    {
        a.g();
        if (c != null)
        {
            View view2 = (View)c.get();
            android.content.Context context1 = a.j();
            if (view2 == null && (context1 instanceof Activity))
            {
                view2 = ((Activity)context1).getWindow().getDecorView();
            }
            if (view2 != null)
            {
                view2.removeOnAttachStateChangeListener(this);
                ViewTreeObserver viewtreeobserver = view2.getViewTreeObserver();
                android.content.Context context;
                View view1;
                if (p.d())
                {
                    viewtreeobserver.removeOnGlobalLayoutListener(this);
                } else
                {
                    viewtreeobserver.removeGlobalOnLayoutListener(this);
                }
            }
        }
        c = null;
        context = a.j();
        if (view == null && (context instanceof Activity))
        {
            view1 = ((Activity)context).findViewById(0x1020002);
            if (view1 == null)
            {
                view1 = ((Activity)context).getWindow().getDecorView();
            }
            w.a("PopupManager", "You have not specified a View to use as content view for popups. Falling back to the Activity content view which may not work properly in future versions of the API. Use setViewForPopups() to set your content view.");
            view = view1;
        }
        if (view != null)
        {
            b(view);
            c = new WeakReference(view);
            view.addOnAttachStateChangeListener(this);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            return;
        } else
        {
            w.b("PopupManager", "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.");
            return;
        }
    }

    public void onGlobalLayout()
    {
        View view;
        if (c != null)
        {
            if ((view = (View)c.get()) != null)
            {
                b(view);
                return;
            }
        }
    }

    public void onViewAttachedToWindow(View view)
    {
        b(view);
    }

    public void onViewDetachedFromWindow(View view)
    {
        a.g();
        view.removeOnAttachStateChangeListener(this);
    }
}
