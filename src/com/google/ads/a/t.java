// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.a;

import android.webkit.WebView;
import com.google.ads.bq;
import com.google.ads.bt;
import com.google.ads.util.ad;
import com.google.ads.util.ae;

// Referenced classes of package com.google.ads.a:
//            n, w, e, a

class t
    implements Runnable
{

    final n a;
    private final String b;
    private final String c;
    private final WebView d;

    public t(n n1, WebView webview, String s, String s1)
    {
        a = n1;
        super();
        d = webview;
        b = s;
        c = s1;
    }

    public void run()
    {
        n.b(a).c.a(Boolean.valueOf(n.a(a)));
        ((w)((bt)n.b(a).a.a()).b.a()).k().a(n.a(a));
        if (((bt)n.b(a).a.a()).e.a() != null)
        {
            a a1 = (a)((bt)n.b(a).a.a()).e.a();
            boolean flag;
            if (!n.a(a))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a1.setOverlayEnabled(flag);
        }
        if (c != null)
        {
            d.loadDataWithBaseURL(b, c, "text/html", "utf-8", null);
            return;
        } else
        {
            d.loadUrl(b);
            return;
        }
    }
}
