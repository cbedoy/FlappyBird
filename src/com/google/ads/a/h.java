// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.a;

import android.net.Uri;
import android.webkit.WebView;
import com.google.ads.bu;
import com.google.ads.util.AdUtil;
import com.google.ads.util.g;
import com.google.ads.util.o;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.google.ads.a:
//            j, k, l, i, 
//            w

public class h
{

    public static final o a = new j();
    public static final Map b = Collections.unmodifiableMap(new k());
    public static final Map c = Collections.unmodifiableMap(new l());
    public static final Map d = Collections.unmodifiableMap(new i());
    private static final h e = new h();

    public h()
    {
    }

    static h a()
    {
        return e;
    }

    public String a(Uri uri, HashMap hashmap)
    {
        if (c(uri))
        {
            String s = uri.getHost();
            if (s == null)
            {
                g.e("An error occurred while parsing the AMSG parameters.");
                return null;
            }
            if (s.equals("launch"))
            {
                hashmap.put("a", "intent");
                hashmap.put("u", hashmap.get("url"));
                hashmap.remove("url");
                return "/open";
            }
            if (s.equals("closecanvas"))
            {
                return "/close";
            }
            if (s.equals("log"))
            {
                return "/log";
            } else
            {
                g.e((new StringBuilder()).append("An error occurred while parsing the AMSG: ").append(uri.toString()).toString());
                return null;
            }
        }
        if (b(uri))
        {
            return uri.getPath();
        } else
        {
            g.e("Message was neither a GMSG nor an AMSG.");
            return null;
        }
    }

    public void a(WebView webview)
    {
        a(webview, "onshow", "{'version': 'afma-sdk-a-v6.4.1'}");
    }

    public void a(WebView webview, String s)
    {
        g.a((new StringBuilder()).append("Sending JS to a WebView: ").append(s).toString());
        webview.loadUrl((new StringBuilder()).append("javascript:").append(s).toString());
    }

    public void a(WebView webview, String s, String s1)
    {
        if (s1 != null)
        {
            a(webview, (new StringBuilder()).append("AFMA_ReceiveMessage").append("('").append(s).append("', ").append(s1).append(");").toString());
            return;
        } else
        {
            a(webview, (new StringBuilder()).append("AFMA_ReceiveMessage").append("('").append(s).append("');").toString());
            return;
        }
    }

    public void a(WebView webview, Map map)
    {
        a(webview, "openableURLs", (new JSONObject(map)).toString());
    }

    public void a(w w, Map map, Uri uri, WebView webview)
    {
        HashMap hashmap = AdUtil.b(uri);
        if (hashmap == null)
        {
            g.e("An error occurred while parsing the message parameters.");
            return;
        }
        String s = a(uri, hashmap);
        if (s == null)
        {
            g.e("An error occurred while parsing the message.");
            return;
        }
        bu bu1 = (bu)map.get(s);
        if (bu1 == null)
        {
            g.e((new StringBuilder()).append("No AdResponse found, <message: ").append(s).append(">").toString());
            return;
        } else
        {
            bu1.a(w, hashmap, webview);
            return;
        }
    }

    public boolean a(Uri uri)
    {
        while (uri == null || !uri.isHierarchical() || !b(uri) && !c(uri)) 
        {
            return false;
        }
        return true;
    }

    public void b(WebView webview)
    {
        a(webview, "onhide", null);
    }

    public boolean b(Uri uri)
    {
        String s = uri.getScheme();
        String s1;
        if (s != null && s.equals("gmsg"))
        {
            if ((s1 = uri.getAuthority()) != null && s1.equals("mobileads.google.com"))
            {
                return true;
            }
        }
        return false;
    }

    public boolean c(Uri uri)
    {
        String s = uri.getScheme();
        return s != null && s.equals("admob");
    }

}
