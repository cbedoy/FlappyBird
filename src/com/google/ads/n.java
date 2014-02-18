// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.google.ads.a.c;
import com.google.ads.a.e;
import com.google.ads.a.h;
import com.google.ads.a.w;
import com.google.ads.util.AdUtil;
import com.google.ads.util.g;
import com.google.ads.util.o;
import java.util.HashMap;

// Referenced classes of package com.google.ads:
//            bu, AdActivity

public class n
    implements bu
{

    private static final h a;

    public n()
    {
    }

    protected int a(HashMap hashmap, String s, int i, DisplayMetrics displaymetrics)
    {
        String s1 = (String)hashmap.get(s);
        if (s1 != null)
        {
            float f;
            try
            {
                f = TypedValue.applyDimension(1, Integer.parseInt(s1), displaymetrics);
            }
            catch (NumberFormatException numberformatexception)
            {
                g.a((new StringBuilder()).append("Could not parse \"").append(s).append("\" in a video gmsg: ").append(s1).toString());
                return i;
            }
            i = (int)f;
        }
        return i;
    }

    public void a(w w, HashMap hashmap, WebView webview)
    {
        String s = (String)hashmap.get("action");
        if (s == null)
        {
            g.a("No \"action\" parameter in a video gmsg.");
            return;
        }
        e e1;
        AdActivity adactivity;
        if (webview instanceof e)
        {
            e1 = (e)webview;
            adactivity = e1.i();
            if (adactivity == null)
            {
                g.a("Could not get adActivity for a video gmsg.");
                return;
            }
        } else
        {
            g.a("Could not get adWebView for a video gmsg.");
            return;
        }
        boolean flag = s.equals("new");
        boolean flag1 = s.equals("position");
        if (flag || flag1)
        {
            DisplayMetrics displaymetrics = AdUtil.a(adactivity);
            int i = a(hashmap, "x", 0, displaymetrics);
            int j = a(hashmap, "y", 0, displaymetrics);
            int k = a(hashmap, "w", -1, displaymetrics);
            int l = a(hashmap, "h", -1, displaymetrics);
            if (flag && adactivity.a() == null)
            {
                adactivity.b(i, j, k, l);
                return;
            } else
            {
                adactivity.a(i, j, k, l);
                return;
            }
        }
        c c1 = adactivity.a();
        if (c1 == null)
        {
            a.a(e1, "onVideoEvent", "{'event': 'error', 'what': 'no_video_view'}");
            return;
        }
        if (s.equals("click"))
        {
            DisplayMetrics displaymetrics1 = AdUtil.a(adactivity);
            int i1 = a(hashmap, "x", 0, displaymetrics1);
            int j1 = a(hashmap, "y", 0, displaymetrics1);
            long l1 = SystemClock.uptimeMillis();
            c1.a(MotionEvent.obtain(l1, l1, 0, i1, j1, 0));
            return;
        }
        if (s.equals("controls"))
        {
            String s2 = (String)hashmap.get("enabled");
            if (s2 == null)
            {
                g.a("No \"enabled\" parameter in a controls video gmsg.");
                return;
            }
            if (s2.equals("true"))
            {
                c1.setMediaControllerEnabled(true);
                return;
            } else
            {
                c1.setMediaControllerEnabled(false);
                return;
            }
        }
        if (s.equals("currentTime"))
        {
            String s1 = (String)hashmap.get("time");
            if (s1 == null)
            {
                g.a("No \"time\" parameter in a currentTime video gmsg.");
                return;
            }
            try
            {
                c1.a((int)(1000F * Float.parseFloat(s1)));
                return;
            }
            catch (NumberFormatException numberformatexception)
            {
                g.a((new StringBuilder()).append("Could not parse \"time\" parameter: ").append(s1).toString());
            }
            return;
        }
        if (s.equals("hide"))
        {
            c1.setVisibility(4);
            return;
        }
        if (s.equals("load"))
        {
            c1.b();
            return;
        }
        if (s.equals("pause"))
        {
            c1.c();
            return;
        }
        if (s.equals("play"))
        {
            c1.d();
            return;
        }
        if (s.equals("show"))
        {
            c1.setVisibility(0);
            return;
        }
        if (s.equals("src"))
        {
            c1.setSrc((String)hashmap.get("src"));
            return;
        } else
        {
            g.a((new StringBuilder()).append("Unknown video action: ").append(s).toString());
            return;
        }
    }

    static 
    {
        a = (h)h.a.b();
    }
}
