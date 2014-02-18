// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.a.n;
import com.google.ads.a.u;
import com.google.ads.a.w;
import com.google.ads.util.AdUtil;
import com.google.ads.util.ae;
import com.google.ads.util.af;
import com.google.ads.util.g;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Locale;

// Referenced classes of package com.google.ads:
//            bu, bt, br

public class cc
    implements bu
{

    public cc()
    {
    }

    public void a(w w1, HashMap hashmap, WebView webview)
    {
        String s = (String)hashmap.get("url");
        String s1 = (String)hashmap.get("type");
        String s2 = (String)hashmap.get("afma_notify_dt");
        String s3 = (String)hashmap.get("activation_overlay_url");
        String s4 = (String)hashmap.get("check_packages");
        boolean flag = "1".equals(hashmap.get("drt_include"));
        String s5 = (String)hashmap.get("request_scenario");
        boolean flag1 = "1".equals(hashmap.get("use_webview_loadurl"));
        u u1;
        if (u.d.e.equals(s5))
        {
            u1 = u.d;
        } else
        if (u.c.e.equals(s5))
        {
            u1 = u.c;
        } else
        if (u.a.e.equals(s5))
        {
            u1 = u.a;
        } else
        {
            u1 = u.b;
        }
        g.c((new StringBuilder()).append("Received ad url: <url: \"").append(s).append("\" type: \"").append(s1).append("\" afmaNotifyDt: \"").append(s2).append("\" activationOverlayUrl: \"").append(s3).append("\" useWebViewLoadUrl: \"").append(flag1).append("\">").toString());
        if (!TextUtils.isEmpty(s4) && !TextUtils.isEmpty(s))
        {
            BigInteger biginteger = new BigInteger(new byte[1]);
            String as[] = s4.split(",");
            int i = 0;
            BigInteger biginteger1 = biginteger;
            for (; i < as.length; i++)
            {
                if (AdUtil.a((Context)w1.h().c.a(), as[i]))
                {
                    biginteger1 = biginteger1.setBit(i);
                }
            }

            String s6 = String.format(Locale.US, "%X", new Object[] {
                biginteger1
            });
            s = s.replaceAll("%40installed_markets%40", s6);
            br.a().a.a(s6);
            g.c((new StringBuilder()).append("Ad url modified to ").append(s).toString());
        }
        n n1 = w1.j();
        if (n1 != null)
        {
            n1.d(flag);
            n1.a(u1);
            n1.e(flag1);
            n1.e(s3);
            n1.d(s);
        }
    }
}
