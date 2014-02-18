// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.AdActivity;
import com.google.ads.ak;
import com.google.ads.al;
import com.google.ads.bt;
import com.google.ads.e;
import com.google.ads.util.AdUtil;
import com.google.ads.util.ae;
import com.google.ads.util.g;
import com.google.ads.util.o;
import com.google.ads.util.y;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.ads.a:
//            h, w, n, x

public class ad extends WebViewClient
{

    private static final h c;
    protected w a;
    protected boolean b;
    private final Map d;
    private final boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;

    public ad(w w1, Map map, boolean flag, boolean flag1)
    {
        a = w1;
        d = map;
        e = flag;
        g = flag1;
        b = false;
        h = false;
        i = false;
    }

    public static ad a(w w1, Map map, boolean flag, boolean flag1)
    {
        if (AdUtil.a >= 11)
        {
            return new y(w1, map, flag, flag1);
        } else
        {
            return new ad(w1, map, flag, flag1);
        }
    }

    public void a(boolean flag)
    {
        b = flag;
    }

    public boolean a()
    {
        return f;
    }

    public void b(boolean flag)
    {
        g = flag;
    }

    public void c(boolean flag)
    {
        h = flag;
    }

    public void d(boolean flag)
    {
        i = flag;
    }

    public void onPageFinished(WebView webview, String s)
    {
        f = false;
        if (h)
        {
            n n1 = a.j();
            if (n1 != null)
            {
                n1.b();
            } else
            {
                com.google.ads.util.g.a("adLoader was null while trying to setFinishedLoadingHtml().");
            }
            h = false;
        }
        if (i)
        {
            c.a(webview);
            i = false;
        }
    }

    public void onPageStarted(WebView webview, String s, Bitmap bitmap)
    {
        f = true;
    }

    public void onReceivedError(WebView webview, int j, String s, String s1)
    {
        f = false;
        n n1 = a.j();
        if (n1 != null)
        {
            n1.a(e.c);
        }
    }

    public boolean shouldOverrideUrlLoading(WebView webview, String s)
    {
        Uri uri;
        com.google.ads.util.g.a((new StringBuilder()).append("shouldOverrideUrlLoading(\"").append(s).append("\")").toString());
        uri = Uri.parse(s);
        if (!c.a(uri))
        {
            break MISSING_BLOCK_LABEL_63;
        }
        c.a(a, d, uri, webview);
        return true;
        if (!g)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        if (AdUtil.a(uri))
        {
            return super.shouldOverrideUrlLoading(webview, s);
        }
        HashMap hashmap1 = new HashMap();
        hashmap1.put("u", s);
        AdActivity.a(a, new x("intent", hashmap1));
        return true;
        boolean flag = e;
        if (!flag) goto _L2; else goto _L1
_L1:
        Context context;
        ak ak1;
        bt bt1 = a.h();
        context = (Context)bt1.f.a();
        ak1 = (ak)bt1.s.a();
        if (ak1 == null) goto _L4; else goto _L3
_L3:
        if (!ak1.a(uri)) goto _L4; else goto _L5
_L5:
        Uri uri2 = ak1.a(uri, context);
        Uri uri1 = uri2;
_L7:
        HashMap hashmap = new HashMap();
        hashmap.put("u", uri1.toString());
        AdActivity.a(a, new x("intent", hashmap));
        return true;
        al al1;
        al1;
        com.google.ads.util.g.e((new StringBuilder()).append("Unable to append parameter to URL: ").append(s).toString());
          goto _L4
_L2:
        try
        {
            com.google.ads.util.g.e((new StringBuilder()).append("URL is not a GMSG and can't handle URL: ").append(s).toString());
        }
        catch (Throwable throwable)
        {
            com.google.ads.util.g.d("An unknown error occurred in shouldOverrideUrlLoading.", throwable);
        }
        return true;
_L4:
        uri1 = uri;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static 
    {
        c = (h)h.a.b();
    }
}
