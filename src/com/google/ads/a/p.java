// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.a;

import android.webkit.WebView;
import com.google.ads.ba;
import com.google.ads.bq;
import com.google.ads.bt;
import com.google.ads.util.ad;

// Referenced classes of package com.google.ads.a:
//            n, w, ac

class p
    implements Runnable
{

    final ba a;
    final n b;

    p(n n1, ba ba)
    {
        b = n1;
        a = ba;
        super();
    }

    public void run()
    {
        if (n.d(b) != null)
        {
            n.d(b).stopLoading();
            n.d(b).destroy();
        }
        ((w)((bt)n.b(b).a.a()).b.a()).a(n.e(b));
        if (n.f(b) != null)
        {
            ((ac)((bt)n.b(b).a.a()).g.a()).b(n.f(b));
        }
        ((w)((bt)n.b(b).a.a()).b.a()).a(a);
    }
}
