// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.a;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Handler;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.webkit.WebView;
import com.google.ads.AdView;
import com.google.ads.ai;
import com.google.ads.ak;
import com.google.ads.az;
import com.google.ads.ba;
import com.google.ads.bc;
import com.google.ads.bq;
import com.google.ads.br;
import com.google.ads.bs;
import com.google.ads.bt;
import com.google.ads.c.a;
import com.google.ads.d;
import com.google.ads.e;
import com.google.ads.util.AdUtil;
import com.google.ads.util.ad;
import com.google.ads.util.ae;
import com.google.ads.util.af;
import com.google.ads.util.g;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;

// Referenced classes of package com.google.ads.a:
//            u, e, w, h, 
//            ad, y, t, ab, 
//            v, ac, s, p, 
//            r, q, a, o

public class n
    implements Runnable
{

    boolean a;
    private String b;
    private String c;
    private String d;
    private String e;
    private boolean f;
    private y g;
    private d h;
    private WebView i;
    private bq j;
    private String k;
    private String l;
    private LinkedList m;
    private String n;
    private com.google.ads.g o;
    private boolean p;
    private volatile boolean q;
    private boolean r;
    private e s;
    private boolean t;
    private int u;
    private Thread v;
    private boolean w;
    private u x;

    protected n()
    {
        p = false;
        x = u.b;
    }

    public n(bq bq1)
    {
        p = false;
        x = u.b;
        j = bq1;
        k = null;
        b = null;
        c = null;
        d = null;
        m = new LinkedList();
        s = null;
        t = false;
        u = -1;
        f = false;
        r = false;
        n = null;
        o = null;
        if ((Activity)((bt)bq1.a.a()).c.a() != null)
        {
            i = new com.google.ads.a.e((bt)bq1.a.a(), null);
            i.setWebViewClient(com.google.ads.a.ad.a((w)((bt)bq1.a.a()).b.a(), h.b, false, false));
            i.setVisibility(8);
            i.setWillNotDraw(true);
            g = new y(bq1);
            return;
        } else
        {
            i = null;
            g = null;
            com.google.ads.util.g.e("activity was null while trying to create an AdLoader.");
            return;
        }
    }

    static void a(String s1, ba ba1, bc bc1)
    {
        while (s1 == null || s1.contains("no-store") || s1.contains("no-cache")) 
        {
            return;
        }
        Matcher matcher = Pattern.compile("max-age\\s*=\\s*(\\d+)").matcher(s1);
        if (matcher.find())
        {
            try
            {
                int i1 = Integer.parseInt(matcher.group(1));
                bc1.a(ba1, i1);
                Locale locale = Locale.US;
                Object aobj[] = new Object[1];
                aobj[0] = Integer.valueOf(i1);
                com.google.ads.util.g.c(String.format(locale, "Caching gWhirl configuration for: %d seconds", aobj));
                return;
            }
            catch (NumberFormatException numberformatexception)
            {
                com.google.ads.util.g.b("Caught exception trying to parse cache control directive. Overflow?", numberformatexception);
            }
            return;
        } else
        {
            com.google.ads.util.g.c((new StringBuilder()).append("Unrecognized cacheControlDirective: '").append(s1).append("'. Not caching configuration.").toString());
            return;
        }
    }

    static boolean a(n n1)
    {
        return n1.p;
    }

    static bq b(n n1)
    {
        return n1.j;
    }

    private void b(String s1, String s2)
    {
        ((Handler)br.a().c.a()).post(new t(this, i, s2, s1));
    }

    private String c()
    {
        if (h instanceof a)
        {
            return "AFMA_buildAdURL";
        } else
        {
            return "AFMA_buildAdURL";
        }
    }

    static String c(n n1)
    {
        return n1.l;
    }

    static WebView d(n n1)
    {
        return n1.i;
    }

    private String d()
    {
        if (h instanceof a)
        {
            return "AFMA_getSdkConstants();";
        } else
        {
            return "AFMA_getSdkConstants();";
        }
    }

    private String e()
    {
        if (h instanceof a)
        {
            return "http://www.gstatic.com/safa/";
        } else
        {
            return "http://media.admob.com/";
        }
    }

    static String e(n n1)
    {
        return n1.n;
    }

    static com.google.ads.g f(n n1)
    {
        return n1.o;
    }

    private String f()
    {
        if (h instanceof a)
        {
            return "<html><head><script src=\"http://www.gstatic.com/safa/sdk-core-v40.js\"></script><script>";
        } else
        {
            return "<html><head><script src=\"http://media.admob.com/sdk-core-v40.js\"></script><script>";
        }
    }

    private String g()
    {
        if (h instanceof a)
        {
            return "</script></head><body></body></html>";
        } else
        {
            return "</script></head><body></body></html>";
        }
    }

    private void h()
    {
        com.google.ads.a.e e1 = ((w)((bt)j.a.a()).b.a()).k();
        ((w)((bt)j.a.a()).b.a()).l().c(true);
        ((w)((bt)j.a.a()).b.a()).m().h();
        ((Handler)br.a().c.a()).post(new t(this, e1, b, c));
    }

    private void i()
    {
        ((Handler)br.a().c.a()).post(new v(this, (w)((bt)j.a.a()).b.a(), i, m, u, r, n, o));
    }

    public String a(Map map, Activity activity)
    {
        int i1 = 0;
        Context context = activity.getApplicationContext();
        ab ab1 = ((w)((bt)j.a.a()).b.a()).m();
        long l1 = ab1.m();
        if (l1 > 0L)
        {
            map.put("prl", Long.valueOf(l1));
        }
        long l2 = ab1.n();
        if (l2 > 0L)
        {
            map.put("prnl", Long.valueOf(l2));
        }
        String s1 = ab1.l();
        if (s1 != null)
        {
            map.put("ppcl", s1);
        }
        String s2 = ab1.k();
        if (s2 != null)
        {
            map.put("pcl", s2);
        }
        long l3 = ab1.j();
        if (l3 > 0L)
        {
            map.put("pcc", Long.valueOf(l3));
        }
        map.put("preqs", Long.valueOf(ab1.o()));
        map.put("oar", Long.valueOf(ab1.p()));
        map.put("bas_on", Long.valueOf(ab1.s()));
        map.put("bas_off", Long.valueOf(ab1.v()));
        if (ab1.y())
        {
            map.put("aoi_timeout", "true");
        }
        if (ab1.A())
        {
            map.put("aoi_nofill", "true");
        }
        String s3 = ab1.D();
        if (s3 != null)
        {
            map.put("pit", s3);
        }
        map.put("ptime", Long.valueOf(ab.E()));
        ab1.a();
        ab1.i();
        String s4;
        PackageInfo packageinfo;
        int j1;
        String s5;
        String s6;
        String s7;
        String s8;
        DisplayMetrics displaymetrics;
        bt bt1;
        ai ai1;
        if (((bt)j.a.a()).b())
        {
            map.put("format", "interstitial_mb");
        } else
        {
            com.google.ads.g g1 = ((ac)((bt)j.a.a()).g.a()).c();
            if (g1.c())
            {
                map.put("smart_w", "full");
            }
            if (g1.d())
            {
                map.put("smart_h", "auto");
            }
            if (!g1.e())
            {
                map.put("format", g1.toString());
            } else
            {
                HashMap hashmap = new HashMap();
                hashmap.put("w", Integer.valueOf(g1.a()));
                hashmap.put("h", Integer.valueOf(g1.b()));
                map.put("ad_frame", hashmap);
            }
        }
        map.put("slotname", ((bt)j.a.a()).h.a());
        map.put("js", "afma-sdk-a-v6.4.1");
        s4 = context.getPackageName();
        try
        {
            packageinfo = context.getPackageManager().getPackageInfo(s4, 0);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            throw new s(this, "NameNotFoundException");
        }
        j1 = packageinfo.versionCode;
        s5 = AdUtil.f(context);
        if (!TextUtils.isEmpty(s5))
        {
            map.put("mv", s5);
        }
        s6 = (String)br.a().a.a();
        if (!TextUtils.isEmpty(s6))
        {
            map.put("imbf", s6);
        }
        map.put("msid", context.getPackageName());
        map.put("app_name", (new StringBuilder()).append(j1).append(".android.").append(context.getPackageName()).toString());
        map.put("isu", AdUtil.a(context));
        s7 = AdUtil.d(context);
        if (s7 == null)
        {
            s7 = "null";
        }
        map.put("net", s7);
        s8 = AdUtil.e(context);
        if (s8 != null && s8.length() != 0)
        {
            map.put("cap", s8);
        }
        map.put("u_audio", Integer.valueOf(AdUtil.g(context).ordinal()));
        displaymetrics = AdUtil.a(activity);
        map.put("u_sd", Float.valueOf(displaymetrics.density));
        map.put("u_h", Integer.valueOf(AdUtil.a(context, displaymetrics)));
        map.put("u_w", Integer.valueOf(AdUtil.b(context, displaymetrics)));
        map.put("hl", Locale.getDefault().getLanguage());
        bt1 = (bt)j.a.a();
        ai1 = (ai)bt1.r.a();
        if (ai1 == null)
        {
            ai1 = ai.a("afma-sdk-a-v6.4.1", activity);
            bt1.r.a(ai1);
            bt1.s.a(new ak(ai1));
        }
        map.put("ms", ai1.a(context));
        if (((bt)j.a.a()).j != null && ((bt)j.a.a()).j.a() != null)
        {
            AdView adview = (AdView)((bt)j.a.a()).j.a();
            if (adview.getParent() != null)
            {
                int ai2[] = new int[2];
                adview.getLocationOnScreen(ai2);
                int i2 = ai2[0];
                int j2 = ai2[1];
                DisplayMetrics displaymetrics1 = ((Context)((bt)j.a.a()).f.a()).getResources().getDisplayMetrics();
                int k2 = displaymetrics1.widthPixels;
                int i3 = displaymetrics1.heightPixels;
                StringBuilder stringbuilder;
                com.google.ads.g ag[];
                TelephonyManager telephonymanager;
                String s9;
                String s10;
                String s11;
                int k1;
                com.google.ads.g g2;
                int j3;
                HashMap hashmap1;
                if (adview.isShown() && i2 + adview.getWidth() > 0 && j2 + adview.getHeight() > 0 && i2 <= k2 && j2 <= i3)
                {
                    j3 = 1;
                } else
                {
                    j3 = 0;
                }
                hashmap1 = new HashMap();
                hashmap1.put("x", Integer.valueOf(i2));
                hashmap1.put("y", Integer.valueOf(j2));
                hashmap1.put("width", Integer.valueOf(adview.getWidth()));
                hashmap1.put("height", Integer.valueOf(adview.getHeight()));
                hashmap1.put("visible", Integer.valueOf(j3));
                map.put("ad_pos", hashmap1);
            }
        }
        stringbuilder = new StringBuilder();
        ag = (com.google.ads.g[])((bt)j.a.a()).n.a();
        if (ag != null)
        {
            for (k1 = ag.length; i1 < k1; i1++)
            {
                g2 = ag[i1];
                if (stringbuilder.length() != 0)
                {
                    stringbuilder.append("|");
                }
                stringbuilder.append((new StringBuilder()).append(g2.a()).append("x").append(g2.b()).toString());
            }

            map.put("sz", stringbuilder.toString());
        }
        telephonymanager = (TelephonyManager)context.getSystemService("phone");
        s9 = telephonymanager.getNetworkOperator();
        if (!TextUtils.isEmpty(s9))
        {
            map.put("carrier", s9);
        }
        map.put("pt", Integer.valueOf(telephonymanager.getPhoneType()));
        map.put("gnt", Integer.valueOf(telephonymanager.getNetworkType()));
        if (AdUtil.c())
        {
            map.put("simulator", Integer.valueOf(1));
        }
        map.put("session_id", az.a().b().toString());
        map.put("seq_num", az.a().c().toString());
        if (((ac)((bt)j.a.a()).g.a()).b())
        {
            map.put("swipeable", Integer.valueOf(1));
        }
        if (((Boolean)((bt)j.a.a()).t.a()).booleanValue())
        {
            map.put("d_imp_hdr", Integer.valueOf(1));
        }
        s10 = AdUtil.a(map);
        if (((Boolean)((bs)((br)((bt)j.a.a()).d.a()).b.a()).o.a()).booleanValue())
        {
            s11 = (new StringBuilder()).append(f()).append(c()).append("(").append(s10).append(");").append(g()).toString();
        } else
        {
            s11 = (new StringBuilder()).append(f()).append(d()).append(c()).append("(").append(s10).append(");").append(g()).toString();
        }
        com.google.ads.util.g.c((new StringBuilder()).append("adRequestUrlHtml: ").append(s11).toString());
        return s11;
    }

    protected void a()
    {
        try
        {
            if (TextUtils.isEmpty(e))
            {
                com.google.ads.util.g.b("Got a mediation response with no content type. Aborting mediation.");
                a(e.d, false);
                return;
            }
        }
        catch (JSONException jsonexception)
        {
            com.google.ads.util.g.b("AdLoader can't parse gWhirl server configuration.", jsonexception);
            a(e.d, false);
            return;
        }
        if (!e.startsWith("application/json"))
        {
            com.google.ads.util.g.b((new StringBuilder()).append("Got a mediation response with a content type: '").append(e).append("'. Expected something starting with 'application/json'. Aborting mediation.").toString());
            a(e.d, false);
            return;
        }
        ba ba1 = ba.a(c);
        a(d, ba1, ((w)((bt)j.a.a()).b.a()).i());
        ((Handler)br.a().c.a()).post(new p(this, ba1));
        return;
    }

    public void a(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        u = i1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(u u1)
    {
        this;
        JVM INSTR monitorenter ;
        x = u1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void a(d d1)
    {
        h = d1;
        q = false;
        v = new Thread(this);
        v.start();
    }

    public void a(e e1)
    {
        this;
        JVM INSTR monitorenter ;
        s = e1;
        notify();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void a(e e1, boolean flag)
    {
        ((Handler)br.a().c.a()).post(new r((w)((bt)j.a.a()).b.a(), i, g, e1, flag));
    }

    public void a(com.google.ads.g g1)
    {
        this;
        JVM INSTR monitorenter ;
        o = g1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void a(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        m.add(s1);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void a(String s1, String s2)
    {
        this;
        JVM INSTR monitorenter ;
        b = s2;
        c = s1;
        notify();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        p = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void b()
    {
        this;
        JVM INSTR monitorenter ;
        t = true;
        notify();
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
        e = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void b(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        f = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void c(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        d = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void c(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        r = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void d(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        k = s1;
        notify();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void d(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        w = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void e(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        l = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void e(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        a = flag;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void f(String s1)
    {
        this;
        JVM INSTR monitorenter ;
        n = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void run()
    {
        this;
        JVM INSTR monitorenter ;
        if (i != null && g != null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        com.google.ads.util.g.e("adRequestWebView was null while trying to load an ad.");
        a(e.d, false);
        this;
        JVM INSTR monitorexit ;
        return;
        Activity activity = (Activity)((bt)j.a.a()).c.a();
        if (activity != null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        com.google.ads.util.g.e("activity was null while forming an ad request.");
        a(e.d, false);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        long l1;
        long l2;
        Map map;
        Object obj;
        l1 = ((w)((bt)j.a.a()).b.a()).o();
        l2 = SystemClock.elapsedRealtime();
        map = h.a((Context)((bt)j.a.a()).f.a());
        obj = map.get("extras");
        if (!(obj instanceof Map)) goto _L2; else goto _L1
_L1:
        Map map1;
        Object obj4;
        map1 = (Map)obj;
        Object obj1 = map1.get("_adUrl");
        if (obj1 instanceof String)
        {
            b = (String)obj1;
        }
        Object obj2 = map1.get("_requestUrl");
        if (obj2 instanceof String)
        {
            k = (String)obj2;
        }
        Object obj3 = map1.get("_activationOverlayUrl");
        if (obj3 instanceof String)
        {
            l = (String)obj3;
        }
        obj4 = map1.get("_orientation");
        if (!(obj4 instanceof String)) goto _L4; else goto _L3
_L3:
        if (!obj4.equals("p")) goto _L6; else goto _L5
_L5:
        u = 1;
_L4:
        Object obj5 = map1.get("_norefresh");
        if ((obj5 instanceof String) && obj5.equals("t"))
        {
            ((w)((bt)j.a.a()).b.a()).d();
        }
_L2:
        if (b != null) goto _L8; else goto _L7
_L7:
        String s1 = k;
        if (s1 != null) goto _L10; else goto _L9
_L9:
        String s3 = a(map, activity);
        long l5;
        b(s3, e());
        l5 = SystemClock.elapsedRealtime();
        long l6;
        l6 = l1 - (l5 - l2);
        if (l6 <= 0L)
        {
            break MISSING_BLOCK_LABEL_416;
        }
        wait(l6);
        boolean flag1 = q;
        if (!flag1) goto _L12; else goto _L11
_L11:
        this;
        JVM INSTR monitorexit ;
        return;
_L6:
        if (!obj4.equals("l")) goto _L4; else goto _L13
_L13:
        u = 0;
          goto _L4
        Throwable throwable;
        throwable;
        com.google.ads.util.g.b("An unknown error occurred in AdLoader.", throwable);
        a(e.d, true);
_L45:
        this;
        JVM INSTR monitorexit ;
        return;
        s s2;
        s2;
        com.google.ads.util.g.c((new StringBuilder()).append("Caught internal exception: ").append(s2).toString());
        a(e.d, false);
        this;
        JVM INSTR monitorexit ;
        return;
        InterruptedException interruptedexception2;
        interruptedexception2;
        com.google.ads.util.g.a((new StringBuilder()).append("AdLoader InterruptedException while getting the URL: ").append(interruptedexception2).toString());
        this;
        JVM INSTR monitorexit ;
        return;
_L12:
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_553;
        }
        a(s, false);
        this;
        JVM INSTR monitorexit ;
        return;
        if (k != null)
        {
            break MISSING_BLOCK_LABEL_601;
        }
        com.google.ads.util.g.c((new StringBuilder()).append("AdLoader timed out after ").append(l1).append("ms while getting the URL.").toString());
        a(e.c, false);
        this;
        JVM INSTR monitorexit ;
        return;
        if (!((ac)((bt)j.a.a()).g.a()).b() || !TextUtils.isEmpty(l)) goto _L10; else goto _L14
_L14:
        com.google.ads.util.g.c("AdLoader doesn't have a URL for the activation overlay");
        a(e.d, false);
        this;
        JVM INSTR monitorexit ;
        return;
_L10:
        ab ab1 = ((w)((bt)j.a.a()).b.a()).m();
        com.google.ads.a.q.a[x.ordinal()];
        JVM INSTR tableswitch 1 4: default 724
    //                   1 925
    //                   2 949
    //                   3 963
    //                   4 982;
           goto _L15 _L16 _L17 _L18 _L19
_L15:
        if (a) goto _L21; else goto _L20
_L20:
        com.google.ads.util.g.a("Not using loadUrl().");
        g.a(w);
        if (!((ac)((bt)j.a.a()).g.a()).b()) goto _L23; else goto _L22
_L22:
        com.google.ads.a.ad ad3;
        ad3 = ((com.google.ads.a.a)((bt)j.a.a()).e.a()).e();
        ad3.c(true);
        ((Handler)br.a().c.a()).post(new o(this));
        com.google.ads.a.ad ad2 = ad3;
_L47:
        g.a(k);
_L27:
        if (q || s != null || c != null) goto _L25; else goto _L24
_L24:
        long l4 = l1 - (SystemClock.elapsedRealtime() - l2);
        if (l4 <= 0L) goto _L25; else goto _L26
_L26:
        wait(l4);
          goto _L27
        InterruptedException interruptedexception1;
        interruptedexception1;
        com.google.ads.util.g.a((new StringBuilder()).append("AdLoader InterruptedException while getting the ad server's response: ").append(interruptedexception1).toString());
        this;
        JVM INSTR monitorexit ;
        return;
_L16:
        ab1.r();
        ab1.u();
        ab1.x();
        com.google.ads.util.g.c("Request scenario: Online server request.");
          goto _L15
_L17:
        ab1.t();
        com.google.ads.util.g.c("Request scenario: Online using buffered ads.");
          goto _L15
_L18:
        ab1.w();
        ab1.q();
        com.google.ads.util.g.c("Request scenario: Offline using buffered ads.");
          goto _L15
_L19:
        ab1.q();
        com.google.ads.util.g.c("Request scenario: Offline with no buffered ads.");
        com.google.ads.util.g.c("Network is unavailable.  Aborting ad request.");
        a(e.c, false);
        this;
        JVM INSTR monitorexit ;
        return;
_L25:
        boolean flag = q;
        if (!flag) goto _L29; else goto _L28
_L28:
        this;
        JVM INSTR monitorexit ;
        return;
_L29:
        if (s == null) goto _L31; else goto _L30
_L30:
        a(s, false);
        this;
        JVM INSTR monitorexit ;
        return;
_L31:
        if (c != null) goto _L33; else goto _L32
_L32:
        com.google.ads.util.g.c((new StringBuilder()).append("AdLoader timed out after ").append(l1).append("ms while waiting for the ad server's response.").toString());
        a(e.c, false);
        this;
        JVM INSTR monitorexit ;
        return;
_L21:
        b = k;
        com.google.ads.util.g.a((new StringBuilder()).append("Using loadUrl.  adBaseUrl: ").append(b).toString());
          goto _L8
_L46:
        if (a)
        {
            break MISSING_BLOCK_LABEL_1389;
        }
        if (!f) goto _L35; else goto _L34
_L34:
        ((w)((bt)j.a.a()).b.a()).b(true);
        a();
        this;
        JVM INSTR monitorexit ;
        return;
_L35:
        if (e == null || !e.startsWith("application/json") && !e.startsWith("text/javascript")) goto _L37; else goto _L36
_L36:
        com.google.ads.util.g.b((new StringBuilder()).append("Expected HTML but received ").append(e).append(".").toString());
        a(e.d, false);
        this;
        JVM INSTR monitorexit ;
        return;
_L37:
        if (((bt)j.a.a()).n.a() == null) goto _L39; else goto _L38
_L38:
        if (o != null) goto _L41; else goto _L40
_L40:
        com.google.ads.util.g.b("Multiple supported ad sizes were specified, but the server did not respond with a size.");
        a(e.d, false);
        this;
        JVM INSTR monitorexit ;
        return;
_L41:
        if (Arrays.asList((Object[])((bt)j.a.a()).n.a()).contains(o))
        {
            break MISSING_BLOCK_LABEL_1389;
        }
        com.google.ads.util.g.b((new StringBuilder()).append("The ad server did not respond with a supported AdSize: ").append(o).toString());
        a(e.d, false);
        this;
        JVM INSTR monitorexit ;
        return;
_L39:
        if (o != null)
        {
            com.google.ads.util.g.e("adSize was expected to be null in AdLoader.");
            o = null;
        }
        ((w)((bt)j.a.a()).b.a()).b(false);
        h();
_L42:
        com.google.ads.a.ad ad1;
        long l3;
        if (q || t && (!((ac)((bt)j.a.a()).g.a()).b() || !ad1.a()))
        {
            break MISSING_BLOCK_LABEL_1525;
        }
        l3 = l1 - (SystemClock.elapsedRealtime() - l2);
        if (l3 <= 0L)
        {
            break MISSING_BLOCK_LABEL_1525;
        }
        wait(l3);
          goto _L42
        InterruptedException interruptedexception;
        interruptedexception;
        com.google.ads.util.g.a((new StringBuilder()).append("AdLoader InterruptedException while loading the HTML: ").append(interruptedexception).toString());
        this;
        JVM INSTR monitorexit ;
        return;
        if (!t) goto _L44; else goto _L43
_L43:
        i();
          goto _L45
_L44:
        com.google.ads.util.g.c((new StringBuilder()).append("AdLoader timed out after ").append(l1).append("ms while loading the HTML.").toString());
        a(e.c, true);
          goto _L45
_L33:
        ad1 = ad2;
          goto _L46
_L23:
        ad2 = null;
          goto _L47
_L8:
        ad1 = null;
          goto _L46
    }
}
