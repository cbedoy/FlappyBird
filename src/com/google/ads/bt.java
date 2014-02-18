// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.google.ads.a.a;
import com.google.ads.a.ac;
import com.google.ads.a.w;
import com.google.ads.util.aa;
import com.google.ads.util.ad;
import com.google.ads.util.ae;
import com.google.ads.util.af;

// Referenced classes of package com.google.ads:
//            br, a, AdView, i

public class bt extends aa
{

    public final ad a;
    public final ad b;
    public final af c;
    public final ad d;
    public final ad e;
    public final ad f;
    public final ad g;
    public final ad h;
    public final ad i;
    public final ad j;
    public final ad k;
    public final ae l = new ae(this, "currentAd", null);
    public final ae m = new ae(this, "nextAd", null);
    public final ae n = new ae(this, "adSizes", null);
    public final ae o = new ae(this, "adListener");
    public final ae p = new ae(this, "appEventListener");
    public final ae q = new ae(this, "swipeableEventListener");
    public final ae r = new ae(this, "spamSignals", null);
    public final ae s = new ae(this, "spamSignalsUtil", null);
    public final ae t = new ae(this, "usesManualImpressions", Boolean.valueOf(false));

    public bt(br br, com.google.ads.a a1, AdView adview, i i1, String s1, Activity activity, Context context, 
            ViewGroup viewgroup, ac ac1, w w)
    {
        d = new ad(this, "appState", br);
        a = new ad(this, "ad", a1);
        j = new ad(this, "adView", adview);
        g = new ad(this, "adType", ac1);
        h = new ad(this, "adUnitId", s1);
        c = new af(this, "activity", activity);
        k = new ad(this, "interstitialAd", i1);
        i = new ad(this, "bannerContainer", viewgroup);
        f = new ad(this, "applicationContext", context);
        b = new ad(this, "adManager", w);
        a a2 = null;
        if (ac1 != null)
        {
            boolean flag = ac1.b();
            a2 = null;
            if (flag)
            {
                a2 = new a(this);
            }
        }
        e = new ad(this, "activationOverlay", a2);
    }

    public boolean a()
    {
        return !b();
    }

    public boolean b()
    {
        return ((ac)g.a()).a();
    }
}
