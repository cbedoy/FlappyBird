// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.app.Activity;
import android.os.Handler;
import android.os.SystemClock;
import com.google.ads.a.ab;
import com.google.ads.a.ac;
import com.google.ads.a.w;
import com.google.ads.util.ad;
import com.google.ads.util.af;
import com.google.ads.util.e;
import com.google.ads.util.g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.ads:
//            ba, bt, bk, br, 
//            bg, k, bh, bf, 
//            be, d

public class bd
{

    private final w a;
    private bk b;
    private final Object c;
    private Thread d;
    private final Object e;
    private boolean f;
    private final Object g;

    protected bd()
    {
        b = null;
        c = new Object();
        d = null;
        e = new Object();
        f = false;
        g = new Object();
        a = null;
    }

    public bd(w w1)
    {
        b = null;
        c = new Object();
        d = null;
        e = new Object();
        f = false;
        g = new Object();
        com.google.ads.util.e.a(w1);
        a = w1;
    }

    static Object a(bd bd1)
    {
        return bd1.e;
    }

    static Thread a(bd bd1, Thread thread)
    {
        bd1.d = thread;
        return thread;
    }

    static void a(bd bd1, ba ba1, d d1)
    {
        bd1.b(ba1, d1);
    }

    public static boolean a(ba ba1, w w1)
    {
        if (ba1.j() == null)
        {
            return true;
        }
        if (w1.h().b())
        {
            if (!ba1.j().a())
            {
                com.google.ads.util.g.e("InterstitialAd received a mediation response corresponding to a non-interstitial ad. Make sure you specify 'interstitial' as the ad-type in the mediation UI.");
                return false;
            } else
            {
                return true;
            }
        }
        com.google.ads.g g1 = ((ac)w1.h().g.a()).c();
        if (ba1.j().a())
        {
            com.google.ads.util.g.e((new StringBuilder()).append("AdView received a mediation response corresponding to an interstitial ad. Make sure you specify the banner ad size corresponding to the AdSize you used in your AdView  (").append(g1).append(") in the ad-type field in the mediation UI.").toString());
            return false;
        }
        com.google.ads.g g2 = ba1.j().c();
        if (g2 != g1)
        {
            com.google.ads.util.g.e((new StringBuilder()).append("Mediation server returned ad size: '").append(g2).append("', while the AdView was created with ad size: '").append(g1).append("'. Using the ad-size passed to the AdView on creation.").toString());
            return false;
        } else
        {
            return true;
        }
    }

    static boolean a(bd bd1, bk bk1)
    {
        return bd1.b(bk1);
    }

    private boolean a(String s, Activity activity, d d1, bh bh1, HashMap hashmap, long l)
    {
        bk bk1 = new bk(this, (ac)a.h().g.a(), bh1, s, d1, hashmap);
        bk1;
        JVM INSTR monitorenter ;
        bk1.a(activity);
_L1:
        if (bk1.b() || l <= 0L)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        long l1;
        long l2;
        l1 = SystemClock.elapsedRealtime();
        bk1.wait(l);
        l2 = SystemClock.elapsedRealtime();
        l -= l2 - l1;
          goto _L1
        InterruptedException interruptedexception;
        interruptedexception;
        com.google.ads.util.g.a((new StringBuilder()).append("Interrupted while waiting for ad network to load ad using adapter class: ").append(s).toString());
        a.m().a(bk1.d());
        if (!bk1.b() || !bk1.c())
        {
            break MISSING_BLOCK_LABEL_202;
        }
        if (!a.h().b())
        {
            break MISSING_BLOCK_LABEL_192;
        }
        android.view.View view = null;
_L2:
        ((Handler)br.a().c.a()).post(new bg(this, bk1, view, bh1));
        bk1;
        JVM INSTR monitorexit ;
        return true;
        view = bk1.e();
          goto _L2
        if (!bk1.b())
        {
            com.google.ads.util.g.a((new StringBuilder()).append("Timeout occurred in adapter class: ").append(bk1.f()).toString());
        }
        bk1.a();
        bk1;
        JVM INSTR monitorexit ;
        return false;
        Exception exception;
        exception;
        bk1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static w b(bd bd1)
    {
        return bd1.a;
    }

    private void b(ba ba1, d d1)
    {
        long l;
        HashMap hashmap;
        List list2;
        bh bh1;
        String s3;
        Activity activity;
        synchronized (e)
        {
            com.google.ads.util.e.a(Thread.currentThread(), d);
        }
        List list = ba1.f();
        Iterator iterator;
        k k1;
        List list1;
        String s;
        String s1;
        String s2;
        Iterator iterator1;
        if (ba1.a())
        {
            l = ba1.b();
        } else
        {
            l = 10000L;
        }
        iterator = list.iterator();
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_293;
        }
        k1 = (k)iterator.next();
        com.google.ads.util.g.a((new StringBuilder()).append("Looking to fetch ads from network: ").append(k1.b()).toString());
        list1 = k1.c();
        hashmap = k1.e();
        list2 = k1.d();
        s = k1.a();
        s1 = k1.b();
        s2 = ba1.c();
        if (list2 == null)
        {
            list2 = ba1.g();
        }
        bh1 = new bh(s, s1, s2, list2, ba1.h(), ba1.i());
        iterator1 = list1.iterator();
_L6:
        if (!iterator1.hasNext())
        {
            break MISSING_BLOCK_LABEL_48;
        }
        s3 = (String)iterator1.next();
        activity = (Activity)a.h().c.a();
        if (activity != null) goto _L2; else goto _L1
_L1:
        com.google.ads.util.g.a("Activity is null while mediating.  Terminating mediation thread.");
_L4:
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        a.m().c();
        if (a(s3, activity, d1, bh1, hashmap, l)) goto _L4; else goto _L3
_L3:
        if (!b()) goto _L6; else goto _L5
_L5:
        com.google.ads.util.g.a("GWController.destroy() called. Terminating mediation thread.");
        return;
        ((Handler)br.a().c.a()).post(new bf(this, ba1));
        return;
    }

    private boolean b()
    {
        boolean flag;
        synchronized (g)
        {
            flag = f;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private boolean b(bk bk1)
    {
        Object obj = g;
        obj;
        JVM INSTR monitorenter ;
        if (!b())
        {
            break MISSING_BLOCK_LABEL_22;
        }
        bk1.a();
        return true;
        obj;
        JVM INSTR monitorexit ;
        return false;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(ba ba1, d d1)
    {
label0:
        {
            synchronized (e)
            {
                if (!a())
                {
                    break label0;
                }
                com.google.ads.util.g.c("Mediation thread is not done executing previous mediation  request. Ignoring new mediation request");
            }
            return;
        }
        if (!ba1.d()) goto _L2; else goto _L1
_L1:
        a.a(ba1.e());
        if (!a.r())
        {
            a.f();
        }
_L4:
        a(ba1, a);
        d = new Thread(new be(this, ba1, d1));
        d.start();
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        if (!a.r()) goto _L4; else goto _L3
_L3:
        a.e();
          goto _L4
    }

    public void a(bk bk1)
    {
        synchronized (c)
        {
            if (b != bk1)
            {
                if (b != null)
                {
                    b.a();
                }
                b = bk1;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean a()
    {
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (d != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
