// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.a.a;
import com.google.ads.a.ac;
import com.google.ads.a.e;
import com.google.ads.a.w;
import com.google.ads.util.AdUtil;
import com.google.ads.util.ad;
import com.google.ads.util.ae;
import com.google.ads.util.g;
import com.google.ads.util.p;
import java.util.HashMap;

// Referenced classes of package com.google.ads:
//            bu, bt, br, bs, 
//            ak

public class cd
    implements bu
{

    public cd()
    {
    }

    private void a(HashMap hashmap, String s, ae ae1)
    {
        try
        {
            String s1 = (String)hashmap.get(s);
            if (!TextUtils.isEmpty(s1))
            {
                ae1.a(Integer.valueOf(s1));
            }
            return;
        }
        catch (NumberFormatException numberformatexception)
        {
            g.a((new StringBuilder()).append("Could not parse \"").append(s).append("\" constant.").toString());
        }
    }

    private void b(HashMap hashmap, String s, ae ae1)
    {
        try
        {
            String s1 = (String)hashmap.get(s);
            if (!TextUtils.isEmpty(s1))
            {
                ae1.a(Long.valueOf(s1));
            }
            return;
        }
        catch (NumberFormatException numberformatexception)
        {
            g.a((new StringBuilder()).append("Could not parse \"").append(s).append("\" constant.").toString());
        }
    }

    private void c(HashMap hashmap, String s, ae ae1)
    {
        String s1 = (String)hashmap.get(s);
        if (!TextUtils.isEmpty(s1))
        {
            ae1.a(s1);
        }
    }

    public void a(w w1, HashMap hashmap, WebView webview)
    {
        bt bt1 = w1.h();
        bs bs1 = (bs)((br)bt1.d.a()).b.a();
        c(hashmap, "as_domains", bs1.a);
        c(hashmap, "bad_ad_report_path", bs1.h);
        a(hashmap, "min_hwa_banner", bs1.b);
        a(hashmap, "min_hwa_activation_overlay", bs1.c);
        a(hashmap, "min_hwa_overlay", bs1.d);
        c(hashmap, "mraid_banner_path", bs1.e);
        c(hashmap, "mraid_expanded_banner_path", bs1.f);
        c(hashmap, "mraid_interstitial_path", bs1.g);
        b(hashmap, "ac_max_size", bs1.i);
        b(hashmap, "ac_padding", bs1.j);
        b(hashmap, "ac_total_quota", bs1.k);
        b(hashmap, "db_total_quota", bs1.l);
        b(hashmap, "db_quota_per_origin", bs1.m);
        b(hashmap, "db_quota_step_size", bs1.n);
        e e1 = w1.k();
        if (AdUtil.a >= 11)
        {
            p.a(e1.getSettings(), bt1);
            p.a(webview.getSettings(), bt1);
        }
        a a1;
        if (!((ac)bt1.g.a()).a())
        {
            boolean flag2 = e1.k();
            String s;
            ak ak1;
            boolean flag3;
            if (AdUtil.a < ((Integer)bs1.b.a()).intValue())
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            if (!flag3 && flag2)
            {
                g.a("Re-enabling hardware acceleration for a banner after reading constants.");
                e1.h();
            } else
            if (flag3 && !flag2)
            {
                g.a("Disabling hardware acceleration for a banner after reading constants.");
                e1.g();
            }
        }
        a1 = (a)bt1.e.a();
        if (!((ac)bt1.g.a()).b() && a1 != null)
        {
            boolean flag = a1.k();
            boolean flag1;
            if (AdUtil.a < ((Integer)bs1.c.a()).intValue())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (!flag1 && flag)
            {
                g.a("Re-enabling hardware acceleration for an activation overlay after reading constants.");
                a1.h();
            } else
            if (flag1 && !flag)
            {
                g.a("Disabling hardware acceleration for an activation overlay after reading constants.");
                a1.g();
            }
        }
        s = (String)bs1.a.a();
        ak1 = (ak)bt1.s.a();
        if (ak1 != null && !TextUtils.isEmpty(s))
        {
            ak1.a(s);
        }
        bs1.o.a(Boolean.valueOf(true));
    }
}
