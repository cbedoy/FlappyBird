// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import com.google.ads.a.w;
import com.google.ads.util.g;
import java.lang.ref.WeakReference;

public class p
    implements Runnable
{

    private WeakReference a;

    public p(w w1)
    {
        a = new WeakReference(w1);
    }

    public void run()
    {
        w w1 = (w)a.get();
        if (w1 == null)
        {
            g.a("The ad must be gone, so cancelling the refresh timer.");
            return;
        } else
        {
            w1.x();
            return;
        }
    }
}
