// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.app.Activity;
import com.google.ads.a.ac;
import com.google.ads.b.a;
import com.google.ads.b.b;
import com.google.ads.b.c;
import com.google.ads.b.e;
import com.google.ads.b.g;
import com.google.ads.b.j;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.ads:
//            bn, bk, d, bp, 
//            bo, bi, bj

class bm
    implements Runnable
{

    private final bk a;
    private final String b;
    private final d c;
    private final HashMap d;
    private final boolean e;
    private final WeakReference f;

    public bm(bk bk1, Activity activity, String s, d d1, HashMap hashmap)
    {
        a = bk1;
        b = s;
        f = new WeakReference(activity);
        c = d1;
        d = new HashMap(hashmap);
        e = a(d);
    }

    private void a(b b1)
    {
        Activity activity = (Activity)f.get();
        if (activity == null)
        {
            throw new bn("Activity became null while trying to instantiate adapter.");
        }
        a.a(b1);
        Class class1 = b1.c();
        g g1;
        Class class2;
        j j1;
        a a1;
        if (class1 != null)
        {
            g g3 = (g)class1.newInstance();
            g3.a(d);
            g1 = g3;
        } else
        {
            g1 = null;
        }
        class2 = b1.b();
        if (class2 != null)
        {
            j1 = (j)c.a(class2);
        } else
        {
            j1 = null;
        }
        a1 = new a(c, activity, e);
        if (a.a.a())
        {
            if (!(b1 instanceof e))
            {
                throw new bn((new StringBuilder()).append("Adapter ").append(b).append(" doesn't support the MediationInterstitialAdapter").append(" interface.").toString());
            }
            ((e)b1).a(new bp(a), activity, g1, a1, j1);
        } else
        {
            if (!(b1 instanceof c))
            {
                throw new bn((new StringBuilder()).append("Adapter ").append(b).append(" doesn't support the MediationBannerAdapter interface").toString());
            }
            c c1 = (c)b1;
            bo bo1 = new bo(a);
            com.google.ads.g g2 = a.a.c();
            c1.a(bo1, activity, g1, g2, a1, j1);
        }
        a.g();
    }

    private void a(String s, Throwable throwable, bj bj1)
    {
        com.google.ads.util.g.b(s, throwable);
        a.a(false, bj1);
    }

    private static boolean a(Map map)
    {
        String s = (String)map.remove("gwhirl_share_location");
        if ("1".equals(s))
        {
            return true;
        }
        if (s != null && !"0".equals(s))
        {
            com.google.ads.util.g.b((new StringBuilder()).append("Received an illegal value, '").append(s).append("', for the special share location parameter from mediation server").append(" (expected '0' or '1'). Will not share the location.").toString());
        }
        return false;
    }

    public void run()
    {
        try
        {
            com.google.ads.util.g.a((new StringBuilder()).append("Trying to instantiate: ").append(b).toString());
            a((b)com.google.ads.bi.a(b, com/google/ads/b/b));
            return;
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            a((new StringBuilder()).append("Cannot find adapter class '").append(b).append("'. Did you link the ad network's mediation adapter? Skipping ad network.").toString(), classnotfoundexception, com.google.ads.bj.e);
            return;
        }
        catch (Throwable throwable)
        {
            a("Error while creating adapter and loading ad from ad network. Skipping ad network.", throwable, bj.f);
        }
    }
}
