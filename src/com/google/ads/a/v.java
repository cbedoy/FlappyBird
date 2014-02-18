// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.a;

import android.webkit.WebView;
import com.google.ads.bq;
import com.google.ads.bt;
import com.google.ads.g;
import com.google.ads.util.ad;
import java.util.LinkedList;

// Referenced classes of package com.google.ads.a:
//            w, n, ac, e

class v
    implements Runnable
{

    final n a;
    private final w b;
    private final WebView c;
    private final LinkedList d;
    private final int e;
    private final boolean f;
    private final String g;
    private final g h;

    public v(n n1, w w1, WebView webview, LinkedList linkedlist, int i, boolean flag, String s, 
            g g1)
    {
        a = n1;
        super();
        b = w1;
        c = webview;
        d = linkedlist;
        e = i;
        f = flag;
        g = s;
        h = g1;
    }

    public void run()
    {
        if (c != null)
        {
            c.stopLoading();
            c.destroy();
        }
        b.a(d);
        b.a(e);
        b.a(f);
        b.a(g);
        if (h != null)
        {
            ((ac)((bt)n.b(a).a.a()).g.a()).b(h);
            b.k().setAdSize(h);
        }
        b.z();
    }
}
