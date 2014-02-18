// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.a;

import android.view.ViewGroup;
import android.webkit.WebView;
import com.google.ads.bt;
import com.google.ads.e;
import com.google.ads.util.ad;

// Referenced classes of package com.google.ads.a:
//            y, w, e

class r
    implements Runnable
{

    private final w a;
    private final WebView b;
    private final y c;
    private final e d;
    private final boolean e;

    public r(w w1, WebView webview, y y1, e e1, boolean flag)
    {
        a = w1;
        b = webview;
        c = y1;
        d = e1;
        e = flag;
    }

    public void run()
    {
        if (b != null)
        {
            b.stopLoading();
            b.destroy();
        }
        if (c != null)
        {
            c.a();
        }
        if (e)
        {
            a.k().stopLoading();
            if (a.h().i.a() != null)
            {
                ((ViewGroup)a.h().i.a()).setVisibility(8);
            }
        }
        a.a(d);
    }
}
