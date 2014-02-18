// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.view.View;
import com.google.ads.a.w;
import com.google.ads.util.g;

// Referenced classes of package com.google.ads:
//            bd, bk, bh

class bg
    implements Runnable
{

    final bk a;
    final View b;
    final bh c;
    final bd d;

    bg(bd bd1, bk bk, View view, bh bh)
    {
        d = bd1;
        a = bk;
        b = view;
        c = bh;
        super();
    }

    public void run()
    {
        if (bd.a(d, a))
        {
            g.a("Trying to switch GWAdNetworkAmbassadors, but GWController().destroy() has been called. Destroying the new ambassador and terminating mediation.");
            return;
        } else
        {
            bd.b(d).a(b, a, c, false);
            return;
        }
    }
}
