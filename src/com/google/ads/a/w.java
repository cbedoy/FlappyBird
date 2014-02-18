// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.a;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.google.ads.AdActivity;
import com.google.ads.AdView;
import com.google.ads.a;
import com.google.ads.at;
import com.google.ads.az;
import com.google.ads.ba;
import com.google.ads.bc;
import com.google.ads.bd;
import com.google.ads.bh;
import com.google.ads.bi;
import com.google.ads.bk;
import com.google.ads.bq;
import com.google.ads.br;
import com.google.ads.bs;
import com.google.ads.bt;
import com.google.ads.d;
import com.google.ads.doubleclick.SwipeableDfpAdView;
import com.google.ads.e;
import com.google.ads.h;
import com.google.ads.i;
import com.google.ads.j;
import com.google.ads.o;
import com.google.ads.p;
import com.google.ads.util.AdUtil;
import com.google.ads.util.ad;
import com.google.ads.util.ae;
import com.google.ads.util.af;
import com.google.ads.util.c;
import com.google.ads.util.g;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.ads.a:
//            ab, ac, e, h, 
//            ad, a, n

public class w
{

    private static final Object a = new Object();
    private String A;
    private String B;
    private final bt b;
    private n c;
    private d d;
    private ab e;
    private com.google.ads.a.e f;
    private com.google.ads.a.ad g;
    private boolean h;
    private long i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private SharedPreferences o;
    private long p;
    private p q;
    private boolean r;
    private LinkedList s;
    private LinkedList t;
    private LinkedList u;
    private int v;
    private Boolean w;
    private bc x;
    private bd y;
    private bh z;

    public w(a a1, Activity activity, com.google.ads.g g1, String s1, ViewGroup viewgroup, boolean flag)
    {
        ac ac1;
        h = false;
        v = -1;
        A = null;
        B = null;
        r = flag;
        e = new ab();
        c = null;
        d = null;
        k = false;
        p = 60000L;
        l = false;
        n = false;
        m = true;
        if (g1 == null)
        {
            ac1 = com.google.ads.a.ac.a;
        } else
        {
            ac1 = com.google.ads.a.ac.a(g1, activity.getApplicationContext());
        }
        if (a1 instanceof SwipeableDfpAdView)
        {
            ac1.a(true);
        }
        if (activity == null)
        {
            br br2 = br.a();
            AdView adview1;
            i j1;
            if (a1 instanceof AdView)
            {
                adview1 = (AdView)a1;
            } else
            {
                adview1 = null;
            }
            if (a1 instanceof i)
            {
                j1 = (i)a1;
            } else
            {
                j1 = null;
            }
            b = new bt(br2, a1, adview1, j1, s1, null, null, viewgroup, ac1, this);
            return;
        }
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        o = activity.getApplicationContext().getSharedPreferences("GoogleAdMobAdsPrefs", 0);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_443;
        }
        long l1 = o.getLong((new StringBuilder()).append("Timeout").append(s1).toString(), -1L);
        if (l1 >= 0L) goto _L2; else goto _L1
_L1:
        i = 5000L;
_L3:
        obj;
        JVM INSTR monitorexit ;
        br br1 = br.a();
        Exception exception;
        AdView adview;
        i i1;
        if (a1 instanceof AdView)
        {
            adview = (AdView)a1;
        } else
        {
            adview = null;
        }
        if (a1 instanceof i)
        {
            i1 = (i)a1;
        } else
        {
            i1 = null;
        }
        b = new bt(br1, a1, adview, i1, s1, activity, activity.getApplicationContext(), viewgroup, ac1, this);
        q = new p(this);
        s = new LinkedList();
        t = new LinkedList();
        u = new LinkedList();
        a();
        AdUtil.h((Context)b.f.a());
        x = new bc();
        y = new bd(this);
        w = null;
        z = null;
        return;
_L2:
        i = l1;
          goto _L3
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        i = 60000L;
          goto _L3
    }

    private void a(bh bh1, Boolean boolean1)
    {
        Object obj = bh1.d();
        if (obj == null)
        {
            obj = new ArrayList();
            ((List) (obj)).add("http://e.admob.com/imp?ad_loc=@gw_adlocid@&qdata=@gw_qdata@&ad_network_id=@gw_adnetid@&js=@gw_sdkver@&session_id=@gw_sessid@&seq_num=@gw_seqnum@&nr=@gw_adnetrefresh@&adt=@gw_adt@&aec=@gw_aec@");
        }
        String s1 = bh1.b();
        a(((List) (obj)), bh1.a(), s1, bh1.c(), boolean1, e.d(), e.e());
    }

    private void a(List list, String s1)
    {
        Object obj;
        if (list == null)
        {
            obj = new ArrayList();
            ((List) (obj)).add("http://e.admob.com/nofill?ad_loc=@gw_adlocid@&qdata=@gw_qdata@&js=@gw_sdkver@&session_id=@gw_sessid@&seq_num=@gw_seqnum@&adt=@gw_adt@&aec=@gw_aec@");
        } else
        {
            obj = list;
        }
        a(((List) (obj)), null, null, s1, null, e.d(), e.e());
    }

    private void a(List list, String s1, String s2, String s3, Boolean boolean1, String s4, String s5)
    {
        String s6 = AdUtil.a((Context)b.f.a());
        az az1 = az.a();
        String s7 = az1.b().toString();
        String s8 = az1.c().toString();
        for (Iterator iterator = list.iterator(); iterator.hasNext(); (new Thread(new o(bi.a((String)iterator.next(), (String)b.h.a(), boolean1, s6, s1, s2, s3, s7, s8, s4, s5), (Context)b.f.a()))).start()) { }
        e.b();
    }

    public LinkedList A()
    {
        return t;
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        com.google.ads.g g1;
        Object obj;
        g1 = ((ac)b.g.a()).c();
        if (AdUtil.a < 14)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        obj = new c(b, g1);
_L1:
        f = ((com.google.ads.a.e) (obj));
        f.setVisibility(8);
        g = com.google.ads.a.ad.a(this, com.google.ads.a.h.d, true, b.b());
        f.setWebViewClient(g);
        bs bs1 = (bs)((br)b.d.a()).b.a();
        if (AdUtil.a < ((Integer)bs1.b.a()).intValue() && !((ac)b.g.a()).a())
        {
            com.google.ads.util.g.a("Disabling hardware acceleration for a banner.");
            f.g();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        obj = new com.google.ads.a.e(b, g1);
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }

    public void a(float f1)
    {
        this;
        JVM INSTR monitorenter ;
        long l1 = p;
        p = (long)(1000F * f1);
        if (r() && p != l1)
        {
            e();
            f();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        v = i1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(int i1, int j1, int k1, int l1)
    {
        com.google.ads.a.a a1 = (com.google.ads.a.a)b.e.a();
        Context context = (Context)b.f.a();
        int i2;
        int j2;
        Context context1;
        android.widget.FrameLayout.LayoutParams layoutparams;
        int k2;
        int l2;
        int i3;
        if (k1 < 0)
        {
            i2 = ((ac)b.g.a()).c().a();
        } else
        {
            i2 = k1;
        }
        j2 = AdUtil.a(context, i2);
        context1 = (Context)b.f.a();
        if (l1 < 0)
        {
            l1 = ((ac)b.g.a()).c().b();
        }
        layoutparams = new android.widget.FrameLayout.LayoutParams(j2, AdUtil.a(context1, l1));
        if (k1 < 0)
        {
            k2 = 0;
            l2 = 0;
        } else
        {
            k2 = j1;
            l2 = i1;
        }
        if (l2 < 0)
        {
            i3 = ((com.google.ads.a.a)b.e.a()).d();
        } else
        {
            i3 = l2;
        }
        if (k2 < 0)
        {
            k2 = ((com.google.ads.a.a)b.e.a()).c();
        }
        ((com.google.ads.a.a)b.e.a()).setXPosition(i3);
        ((com.google.ads.a.a)b.e.a()).setYPosition(k2);
        layoutparams.setMargins(AdUtil.a((Context)b.f.a(), i3), AdUtil.a((Context)b.f.a(), k2), 0, 0);
        a1.setLayoutParams(layoutparams);
    }

    public void a(long l1)
    {
        synchronized (a)
        {
            android.content.SharedPreferences.Editor editor = o.edit();
            editor.putLong((new StringBuilder()).append("Timeout").append(b.h).toString(), l1);
            editor.commit();
            if (r)
            {
                i = l1;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(View view)
    {
        ((ViewGroup)b.i.a()).setVisibility(0);
        ((ViewGroup)b.i.a()).removeAllViews();
        ((ViewGroup)b.i.a()).addView(view);
        if (((ac)b.g.a()).b())
        {
            ((w)b.b.a()).a((bq)b.l.a(), false, -1, -1, -1, -1);
            if (((com.google.ads.a.a)b.e.a()).a())
            {
                ((ViewGroup)b.i.a()).addView((View)b.e.a(), AdUtil.a((Context)b.f.a(), ((ac)b.g.a()).c().a()), AdUtil.a((Context)b.f.a(), ((ac)b.g.a()).c().b()));
            }
        }
    }

    public void a(View view, bk bk, bh bh1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        com.google.ads.c c1;
        com.google.ads.util.g.a("AdManager.onReceiveGWhirlAd() called.");
        k = true;
        z = bh1;
        if (b.a())
        {
            a(view);
            a(bh1, Boolean.valueOf(flag));
        }
        y.a(bk);
        c1 = (com.google.ads.c)b.o.a();
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        c1.a((a)b.a.a());
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(ba ba1)
    {
        this;
        JVM INSTR monitorenter ;
        c = null;
        y.a(ba1, d);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(bq bq1, boolean flag, int i1, int j1, int k1, int l1)
    {
label0:
        {
            com.google.ads.a.a a1 = (com.google.ads.a.a)b.e.a();
            boolean flag1;
            if (!flag)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            a1.setOverlayActivated(flag1);
            a(i1, j1, k1, l1);
            if (b.q.a() != null)
            {
                if (!flag)
                {
                    break label0;
                }
                ((j)b.q.a()).a((a)b.a.a());
            }
            return;
        }
        ((j)b.q.a()).b((a)b.a.a());
    }

    public void a(d d1)
    {
        this;
        JVM INSTR monitorenter ;
        com.google.ads.util.g.d("v6.4.1 RC00");
        if (!h) goto _L2; else goto _L1
_L1:
        com.google.ads.util.g.e("loadAd called after ad was destroyed.");
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!p())
        {
            break MISSING_BLOCK_LABEL_45;
        }
        com.google.ads.util.g.e("loadAd called while the ad is already loading, so aborting.");
          goto _L3
        Exception exception;
        exception;
        throw exception;
        if (!AdActivity.b()) goto _L5; else goto _L4
_L4:
        com.google.ads.util.g.e("loadAd called while an interstitial or landing page is displayed, so aborting");
          goto _L3
_L5:
        if (!AdUtil.c((Context)b.f.a()) || !AdUtil.b((Context)b.f.a())) goto _L3; else goto _L6
_L6:
        long l1 = o.getLong("GoogleAdMobDoritosLife", 60000L);
        if (at.a((Context)b.f.a(), l1))
        {
            at.a((Activity)b.c.a());
        }
        k = false;
        s.clear();
        t.clear();
        d = d1;
        if (!x.a())
        {
            break MISSING_BLOCK_LABEL_202;
        }
        y.a(x.b(), d1);
          goto _L3
        bq bq1 = new bq(b);
        b.m.a(bq1);
        c = (n)bq1.b.a();
        c.a(d1);
          goto _L3
    }

    public void a(e e1)
    {
        this;
        JVM INSTR monitorenter ;
        c = null;
        if (e1 == e.c)
        {
            a(60F);
            if (!r())
            {
                g();
            }
        }
        if (!b.b()) goto _L2; else goto _L1
_L1:
        if (e1 != e.b) goto _L4; else goto _L3
_L3:
        e.B();
_L2:
        com.google.ads.c c1;
        com.google.ads.util.g.c((new StringBuilder()).append("onFailedToReceiveAd(").append(e1).append(")").toString());
        c1 = (com.google.ads.c)b.o.a();
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        c1.a((a)b.a.a(), e1);
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        if (e1 != e.c) goto _L2; else goto _L5
_L5:
        e.z();
          goto _L2
        Exception exception;
        exception;
        throw exception;
    }

    public void a(String s1)
    {
        B = s1;
        android.net.Uri uri = (new android.net.Uri.Builder()).encodedQuery(s1).build();
        StringBuilder stringbuilder = new StringBuilder();
        java.util.HashMap hashmap = AdUtil.b(uri);
        String s2;
        for (Iterator iterator = hashmap.keySet().iterator(); iterator.hasNext(); stringbuilder.append(s2).append(" = ").append((String)hashmap.get(s2)).append("\n"))
        {
            s2 = (String)iterator.next();
        }

        A = stringbuilder.toString().trim();
        if (TextUtils.isEmpty(A))
        {
            A = null;
        }
    }

    public void a(String s1, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        h h1 = (h)b.p.a();
        if (h1 == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        h1.a((a)b.a.a(), s1, s2);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void a(LinkedList linkedlist)
    {
        this;
        JVM INSTR monitorenter ;
        String s1;
        for (Iterator iterator = linkedlist.iterator(); iterator.hasNext(); com.google.ads.util.g.a((new StringBuilder()).append("Adding a click tracking URL: ").append(s1).toString()))
        {
            s1 = (String)iterator.next();
        }

        break MISSING_BLOCK_LABEL_59;
        Exception exception;
        exception;
        throw exception;
        u = linkedlist;
        this;
        JVM INSTR monitorexit ;
    }

    public void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        j = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public String b()
    {
        return A;
    }

    public void b(long l1)
    {
        this;
        JVM INSTR monitorenter ;
        if (l1 <= 0L)
        {
            break MISSING_BLOCK_LABEL_32;
        }
        o.edit().putLong("GoogleAdMobDoritosLife", l1).commit();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void b(ba ba1)
    {
        this;
        JVM INSTR monitorenter ;
        com.google.ads.c c1;
        com.google.ads.util.g.a("AdManager.onGWhirlNoFill() called.");
        a(ba1.i(), ba1.c());
        c1 = (com.google.ads.c)b.o.a();
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        c1.a((a)b.a.a(), e.b);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void b(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        com.google.ads.util.g.a((new StringBuilder()).append("Adding a tracking URL: ").append(s1).toString());
        s.add(s1);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void b(boolean flag)
    {
        w = Boolean.valueOf(flag);
    }

    public String c()
    {
        return B;
    }

    protected void c(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        com.google.ads.util.g.a((new StringBuilder()).append("Adding a manual tracking URL: ").append(s1).toString());
        A().add(s1);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void d()
    {
        this;
        JVM INSTR monitorenter ;
        m = false;
        com.google.ads.util.g.a("Refreshing is no longer allowed on this AdView.");
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void e()
    {
        this;
        JVM INSTR monitorenter ;
        if (!l) goto _L2; else goto _L1
_L1:
        com.google.ads.util.g.a("Disabling refreshing.");
        ((Handler)br.a().c.a()).removeCallbacks(q);
        l = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        com.google.ads.util.g.a("Refreshing is already disabled.");
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void f()
    {
        this;
        JVM INSTR monitorenter ;
        n = false;
        if (!b.a())
        {
            break MISSING_BLOCK_LABEL_118;
        }
        if (!m) goto _L2; else goto _L1
_L1:
        if (l) goto _L4; else goto _L3
_L3:
        com.google.ads.util.g.a((new StringBuilder()).append("Enabling refreshing every ").append(p).append(" milliseconds.").toString());
        ((Handler)br.a().c.a()).postDelayed(q, p);
        l = true;
_L5:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        com.google.ads.util.g.a("Refreshing is already enabled.");
          goto _L5
        Exception exception;
        exception;
        throw exception;
_L2:
        com.google.ads.util.g.a("Refreshing disabled on this AdView");
          goto _L5
        com.google.ads.util.g.a("Tried to enable refreshing on something other than an AdView.");
          goto _L5
    }

    public void g()
    {
        f();
        n = true;
    }

    public bt h()
    {
        return b;
    }

    public bc i()
    {
        this;
        JVM INSTR monitorenter ;
        bc bc1 = x;
        this;
        JVM INSTR monitorexit ;
        return bc1;
        Exception exception;
        exception;
        throw exception;
    }

    public n j()
    {
        this;
        JVM INSTR monitorenter ;
        n n1 = c;
        this;
        JVM INSTR monitorexit ;
        return n1;
        Exception exception;
        exception;
        throw exception;
    }

    public com.google.ads.a.e k()
    {
        this;
        JVM INSTR monitorenter ;
        com.google.ads.a.e e1 = f;
        this;
        JVM INSTR monitorexit ;
        return e1;
        Exception exception;
        exception;
        throw exception;
    }

    public com.google.ads.a.ad l()
    {
        this;
        JVM INSTR monitorenter ;
        com.google.ads.a.ad ad1 = g;
        this;
        JVM INSTR monitorexit ;
        return ad1;
        Exception exception;
        exception;
        throw exception;
    }

    public ab m()
    {
        return e;
    }

    public int n()
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = v;
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public long o()
    {
        return i;
    }

    public boolean p()
    {
        this;
        JVM INSTR monitorenter ;
        n n1 = c;
        boolean flag;
        if (n1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean q()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = j;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean r()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = l;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public void s()
    {
        this;
        JVM INSTR monitorenter ;
        com.google.ads.c c1;
        e.C();
        com.google.ads.util.g.c("onDismissScreen()");
        c1 = (com.google.ads.c)b.o.a();
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        c1.c((a)b.a.a());
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void t()
    {
        this;
        JVM INSTR monitorenter ;
        com.google.ads.c c1;
        com.google.ads.util.g.c("onPresentScreen()");
        c1 = (com.google.ads.c)b.o.a();
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        c1.b((a)b.a.a());
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void u()
    {
        this;
        JVM INSTR monitorenter ;
        com.google.ads.c c1;
        com.google.ads.util.g.c("onLeaveApplication()");
        c1 = (com.google.ads.c)b.o.a();
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        c1.d((a)b.a.a());
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void v()
    {
        e.f();
        y();
    }

    public void w()
    {
        this;
        JVM INSTR monitorenter ;
        Activity activity = (Activity)b.c.a();
        if (activity != null) goto _L2; else goto _L1
_L1:
        com.google.ads.util.g.e("activity was null while trying to ping tracking URLs.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Iterator iterator = s.iterator();
        while (iterator.hasNext()) 
        {
            (new Thread(new o((String)iterator.next(), activity.getApplicationContext()))).start();
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void x()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = h;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        if (!b.a())
        {
            break MISSING_BLOCK_LABEL_125;
        }
        if (!((AdView)b.j.a()).isShown() || !AdUtil.d())
        {
            break MISSING_BLOCK_LABEL_89;
        }
        com.google.ads.util.g.c("Refreshing ad.");
        a(d);
_L3:
        if (!n)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        e();
          goto _L1
        Exception exception;
        exception;
        throw exception;
        com.google.ads.util.g.a("Not refreshing because the ad is not visible.");
          goto _L3
        ((Handler)br.a().c.a()).postDelayed(q, p);
          goto _L1
        com.google.ads.util.g.a("Tried to refresh an ad that wasn't an AdView.");
          goto _L1
        com.google.ads.util.g.a("Tried to refresh before calling loadAd().");
          goto _L1
    }

    protected void y()
    {
        this;
        JVM INSTR monitorenter ;
        Activity activity = (Activity)b.c.a();
        if (activity != null) goto _L2; else goto _L1
_L1:
        com.google.ads.util.g.e("activity was null while trying to ping click tracking URLs.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Iterator iterator = u.iterator();
        while (iterator.hasNext()) 
        {
            (new Thread(new o((String)iterator.next(), activity.getApplicationContext()))).start();
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    protected void z()
    {
        this;
        JVM INSTR monitorenter ;
        com.google.ads.c c1;
        c = null;
        k = true;
        f.setVisibility(0);
        if (b.a())
        {
            a(f);
        }
        e.g();
        if (b.a())
        {
            w();
        }
        com.google.ads.util.g.c("onReceiveAd()");
        c1 = (com.google.ads.c)b.o.a();
        if (c1 == null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        c1.a((a)b.a.a());
        b.l.a(b.m.a());
        b.m.a(null);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
