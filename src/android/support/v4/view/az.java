// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

// Referenced classes of package android.support.v4.view:
//            ay, bh

class az extends ay
{

    az()
    {
    }

    public void a(View view, int i, int j, int k, int l)
    {
        bh.a(view, i, j, k, l);
    }

    public void a(View view, Runnable runnable)
    {
        bh.a(view, runnable);
    }

    public void b(View view)
    {
        bh.a(view);
    }

    public void b(View view, int i)
    {
        bh.a(view, i);
    }

    public int c(View view)
    {
        return bh.b(view);
    }

    public ViewParent f(View view)
    {
        return bh.c(view);
    }
}
