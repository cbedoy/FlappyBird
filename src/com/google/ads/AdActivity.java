// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import com.google.ads.a.ad;
import com.google.ads.a.c;
import com.google.ads.a.e;
import com.google.ads.a.h;
import com.google.ads.a.w;
import com.google.ads.a.x;
import com.google.ads.util.AdUtil;
import com.google.ads.util.ae;
import com.google.ads.util.g;
import com.google.ads.util.n;
import com.google.ads.util.o;
import com.google.ads.util.p;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.ads:
//            b, bt, br, bs

public class AdActivity extends Activity
    implements android.view.View.OnClickListener
{

    private static final h a;
    private static final Object b = new Object();
    private static AdActivity c = null;
    private static w d = null;
    private static AdActivity e = null;
    private static AdActivity f = null;
    private static final b g = new b();
    private e h;
    private FrameLayout i;
    private int j;
    private ViewGroup k;
    private boolean l;
    private long m;
    private RelativeLayout n;
    private AdActivity o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private c t;

    public AdActivity()
    {
        k = null;
        o = null;
    }

    public static void a(w w1, x x1)
    {
        g.a(w1, x1);
    }

    private void a(String s1)
    {
        com.google.ads.util.g.b(s1);
        finish();
    }

    private void a(String s1, Throwable throwable)
    {
        com.google.ads.util.g.b(s1, throwable);
        finish();
    }

    static w b(w w1)
    {
        d = w1;
        return w1;
    }

    public static boolean b()
    {
        return g.a();
    }

    private android.widget.RelativeLayout.LayoutParams c(int i1, int j1, int k1, int l1)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = new android.widget.RelativeLayout.LayoutParams(k1, l1);
        layoutparams.setMargins(i1, j1, 0, 0);
        layoutparams.addRule(10);
        layoutparams.addRule(9);
        return layoutparams;
    }

    public static boolean c()
    {
        return g.b();
    }

    static Object d()
    {
        return b;
    }

    static AdActivity e()
    {
        return e;
    }

    static AdActivity f()
    {
        return c;
    }

    static w g()
    {
        return d;
    }

    private void h()
    {
        if (l) goto _L2; else goto _L1
_L1:
        if (h == null) goto _L4; else goto _L3
_L3:
        a.b(h);
        h.setAdActivity(null);
        h.setIsExpandedMraid(false);
        if (q || n == null || k == null) goto _L4; else goto _L5
_L5:
        if (!r || s) goto _L7; else goto _L6
_L6:
        com.google.ads.util.g.a("Disabling hardware acceleration on collapsing MRAID WebView.");
        h.g();
_L13:
        n.removeView(h);
        k.addView(h);
_L4:
        if (t != null)
        {
            t.e();
            t = null;
        }
        if (this == c)
        {
            c = null;
        }
        f = o;
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        if (d != null && q && h != null)
        {
            if (h == d.k())
            {
                d.a();
            }
            h.stopLoading();
        }
        if (this != e) goto _L9; else goto _L8
_L8:
        e = null;
        if (d == null) goto _L11; else goto _L10
_L10:
        d.s();
        d = null;
_L9:
        l = true;
        com.google.ads.util.g.a("AdActivity is closing.");
_L2:
        return;
_L7:
        if (!r && s)
        {
            com.google.ads.util.g.a("Re-enabling hardware acceleration on collapsing MRAID WebView.");
            h.h();
        }
        continue; /* Loop/switch isn't completed */
_L11:
        com.google.ads.util.g.e("currentAdManager is null while trying to destroy AdActivity.");
          goto _L9
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (true) goto _L13; else goto _L12
_L12:
    }

    protected View a(int i1, boolean flag)
    {
        j = (int)TypedValue.applyDimension(1, i1, getResources().getDisplayMetrics());
        i = new FrameLayout(getApplicationContext());
        i.setMinimumWidth(j);
        i.setMinimumHeight(j);
        i.setOnClickListener(this);
        a(flag);
        return i;
    }

    public c a()
    {
        return t;
    }

    protected c a(Activity activity)
    {
        return new c(activity, h);
    }

    public void a(int i1, int j1, int k1, int l1)
    {
        if (t != null)
        {
            t.setLayoutParams(c(i1, j1, k1, l1));
            t.requestLayout();
        }
    }

    protected void a(e e1, boolean flag, int i1, boolean flag1, boolean flag2)
    {
label0:
        {
label1:
            {
                requestWindowFeature(1);
                Window window = getWindow();
                window.setFlags(1024, 1024);
                android.view.ViewParent viewparent;
                if (AdUtil.a >= 11)
                {
                    if (r)
                    {
                        com.google.ads.util.g.a("Enabling hardware acceleration on the AdActivity window.");
                        com.google.ads.util.p.a(window);
                    } else
                    {
                        com.google.ads.util.g.a("Disabling hardware acceleration on the AdActivity WebView.");
                        e1.g();
                    }
                }
                viewparent = e1.getParent();
                if (viewparent != null)
                {
                    if (!flag1)
                    {
                        break label0;
                    }
                    if (!(viewparent instanceof ViewGroup))
                    {
                        break label1;
                    }
                    k = (ViewGroup)viewparent;
                    k.removeView(e1);
                }
                if (e1.i() != null)
                {
                    a("Interstitial created with an AdWebView that is already in use by another AdActivity.");
                } else
                {
                    setRequestedOrientation(i1);
                    e1.setAdActivity(this);
                    byte byte0;
                    View view;
                    android.widget.RelativeLayout.LayoutParams layoutparams;
                    if (flag1)
                    {
                        byte0 = 50;
                    } else
                    {
                        byte0 = 32;
                    }
                    view = a(byte0, flag2);
                    n.addView(e1, -1, -1);
                    layoutparams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
                    if (flag1)
                    {
                        layoutparams.addRule(10);
                        layoutparams.addRule(11);
                    } else
                    {
                        layoutparams.addRule(10);
                        layoutparams.addRule(9);
                    }
                    n.addView(view, layoutparams);
                    n.setKeepScreenOn(true);
                    setContentView(n);
                    n.getRootView().setBackgroundColor(0xff000000);
                    if (flag)
                    {
                        a.a(e1);
                        return;
                    }
                }
                return;
            }
            a("MRAID banner was not a child of a ViewGroup.");
            return;
        }
        a("Interstitial created with an AdWebView that has a parent.");
    }

    protected void a(w w1)
    {
        h = null;
        m = SystemClock.elapsedRealtime();
        p = true;
        synchronized (b)
        {
            if (c == null)
            {
                c = this;
                w1.u();
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void a(HashMap hashmap, w w1)
    {
        Intent intent;
        String s1;
        String s2;
        String s6;
        String s7;
        boolean flag;
        boolean flag1;
        String s8;
        JSONObject jsonobject1;
        int k1;
        int i1 = 0;
        if (hashmap == null)
        {
            a("Could not get the paramMap in launchIntent()");
            return;
        }
        intent = new Intent();
        s1 = (String)hashmap.get("u");
        s2 = (String)hashmap.get("m");
        String s3 = (String)hashmap.get("i");
        String s4 = (String)hashmap.get("p");
        String s5 = (String)hashmap.get("c");
        s6 = (String)hashmap.get("f");
        s7 = (String)hashmap.get("e");
        JSONObject jsonobject;
        JSONArray jsonarray;
        int j1;
        int l1;
        String as[];
        if (!TextUtils.isEmpty(s1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!TextUtils.isEmpty(s2))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag || !flag1) goto _L2; else goto _L1
_L1:
        intent.setDataAndType(Uri.parse(s1), s2);
_L18:
        if (!TextUtils.isEmpty(s3))
        {
            intent.setAction(s3);
        } else
        if (flag)
        {
            intent.setAction("android.intent.action.VIEW");
        }
        if (!TextUtils.isEmpty(s4) && AdUtil.a >= 4)
        {
            com.google.ads.util.n.a(intent, s4);
        }
        if (!TextUtils.isEmpty(s5))
        {
            as = s5.split("/");
            if (as.length < 2)
            {
                com.google.ads.util.g.e((new StringBuilder()).append("Warning: Could not parse component name from open GMSG: ").append(s5).toString());
            }
            intent.setClassName(as[0], as[1]);
        }
        if (TextUtils.isEmpty(s6)) goto _L4; else goto _L3
_L3:
        l1 = Integer.parseInt(s6);
        k1 = l1;
_L15:
        intent.addFlags(k1);
_L4:
        if (TextUtils.isEmpty(s7)) goto _L6; else goto _L5
_L5:
        jsonobject = new JSONObject(s7);
        jsonarray = jsonobject.names();
_L14:
        if (i1 >= jsonarray.length()) goto _L6; else goto _L7
_L7:
        s8 = jsonarray.getString(i1);
        jsonobject1 = jsonobject.getJSONObject(s8);
        j1 = jsonobject1.getInt("t");
        j1;
        JVM INSTR tableswitch 1 5: default 380
    //                   1 523
    //                   2 591
    //                   3 610
    //                   4 629
    //                   5 648;
           goto _L8 _L9 _L10 _L11 _L12 _L13
_L8:
        com.google.ads.util.g.e((new StringBuilder()).append("Warning: Unknown type in extras from open GMSG: ").append(s8).append(" (type: ").append(j1).append(")").toString());
_L16:
        i1++;
          goto _L14
_L2:
        if (flag)
        {
            intent.setData(Uri.parse(s1));
        } else
        if (flag1)
        {
            intent.setType(s2);
        }
        continue; /* Loop/switch isn't completed */
        NumberFormatException numberformatexception;
        numberformatexception;
        com.google.ads.util.g.e((new StringBuilder()).append("Warning: Could not parse flags from open GMSG: ").append(s6).toString());
        k1 = 0;
          goto _L15
_L9:
        intent.putExtra(s8, jsonobject1.getBoolean("v"));
          goto _L16
        JSONException jsonexception;
        jsonexception;
        com.google.ads.util.g.e((new StringBuilder()).append("Warning: Could not parse extras from open GMSG: ").append(s7).toString());
          goto _L6
_L10:
        intent.putExtra(s8, jsonobject1.getDouble("v"));
          goto _L16
_L11:
        intent.putExtra(s8, jsonobject1.getInt("v"));
          goto _L16
_L12:
        intent.putExtra(s8, jsonobject1.getLong("v"));
          goto _L16
_L13:
        intent.putExtra(s8, jsonobject1.getString("v"));
          goto _L16
_L6:
        if (intent.filterEquals(new Intent()))
        {
            a("Tried to launch empty intent.");
            return;
        }
        try
        {
            com.google.ads.util.g.a((new StringBuilder()).append("Launching an intent from AdActivity: ").append(intent).toString());
            startActivity(intent);
            a(w1);
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            a(activitynotfoundexception.getMessage(), ((Throwable) (activitynotfoundexception)));
        }
        return;
        if (true) goto _L18; else goto _L17
_L17:
    }

    public void a(boolean flag)
    {
        if (i != null)
        {
            i.removeAllViews();
            if (!flag)
            {
                ImageButton imagebutton = new ImageButton(this);
                imagebutton.setImageResource(0x1080017);
                imagebutton.setBackgroundColor(0);
                imagebutton.setOnClickListener(this);
                imagebutton.setPadding(0, 0, 0, 0);
                android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(j, j, 17);
                i.addView(imagebutton, layoutparams);
            }
        }
    }

    public void b(int i1, int j1, int k1, int l1)
    {
label0:
        {
            if (t != null)
            {
                break MISSING_BLOCK_LABEL_83;
            }
            t = a(this);
            n.addView(t, 0, c(i1, j1, k1, l1));
            synchronized (b)
            {
                if (d != null)
                {
                    break label0;
                }
                com.google.ads.util.g.e("currentAdManager was null while trying to get the opening AdWebView.");
            }
            return;
        }
        d.l().b(false);
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onClick(View view)
    {
        finish();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        l = false;
        Object obj = b;
        obj;
        JVM INSTR monitorenter ;
        w w1;
        boolean flag;
        bs bs1;
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_247;
        }
        w1 = d;
        if (e == null)
        {
            e = this;
            w1.t();
        }
        if (o == null && f != null)
        {
            o = f;
        }
        f = this;
        if (w1.h().a() && e == this || w1.h().b() && o == e)
        {
            w1.v();
        }
        flag = w1.q();
        bs1 = (bs)((br)w1.h().d.a()).b.a();
        Exception exception;
        boolean flag1;
        boolean flag2;
        Bundle bundle1;
        if (AdUtil.a >= ((Integer)bs1.b.a()).intValue())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        s = flag1;
        if (AdUtil.a >= ((Integer)bs1.d.a()).intValue())
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        r = flag2;
        obj;
        JVM INSTR monitorexit ;
        n = null;
        p = false;
        q = true;
        t = null;
        bundle1 = getIntent().getBundleExtra("com.google.ads.AdOpener");
        if (bundle1 == null)
        {
            a("Could not get the Bundle used to create AdActivity.");
            return;
        }
        break MISSING_BLOCK_LABEL_274;
        a("Could not get currentAdManager.");
        obj;
        JVM INSTR monitorexit ;
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        x x1 = new x(bundle1);
        String s1 = x1.b();
        HashMap hashmap = x1.c();
        if (s1.equals("intent"))
        {
            a(hashmap, w1);
            return;
        }
        n = new RelativeLayout(getApplicationContext());
        if (s1.equals("webapp"))
        {
            h = new e(w1.h(), null);
            java.util.Map map = h.d;
            boolean flag6;
            ad ad1;
            String s2;
            String s3;
            String s4;
            String s5;
            int j1;
            e e1;
            boolean flag7;
            if (!flag)
            {
                flag6 = true;
            } else
            {
                flag6 = false;
            }
            ad1 = ad.a(w1, map, true, flag6);
            ad1.d(true);
            if (flag)
            {
                ad1.a(true);
            }
            h.setWebViewClient(ad1);
            s2 = (String)hashmap.get("u");
            s3 = (String)hashmap.get("baseurl");
            s4 = (String)hashmap.get("html");
            if (s2 != null)
            {
                h.loadUrl(s2);
            } else
            if (s4 != null)
            {
                h.loadDataWithBaseURL(s3, s4, "text/html", "utf-8", null);
            } else
            {
                a("Could not get the URL or HTML parameter to show a web app.");
                return;
            }
            s5 = (String)hashmap.get("o");
            if ("p".equals(s5))
            {
                j1 = AdUtil.b();
            } else
            if ("l".equals(s5))
            {
                j1 = AdUtil.a();
            } else
            if (this == e)
            {
                j1 = w1.n();
            } else
            {
                j1 = -1;
            }
            e1 = h;
            if (hashmap != null && "1".equals(hashmap.get("custom_close")))
            {
                flag7 = true;
            } else
            {
                flag7 = false;
            }
            a(e1, false, j1, flag, flag7);
            return;
        }
        if (s1.equals("interstitial") || s1.equals("expand"))
        {
            h = w1.k();
            int i1 = w1.n();
            if (s1.equals("expand"))
            {
                h.setIsExpandedMraid(true);
                q = false;
                boolean flag4 = false;
                if (hashmap != null)
                {
                    boolean flag5 = "1".equals(hashmap.get("custom_close"));
                    flag4 = false;
                    if (flag5)
                    {
                        flag4 = true;
                    }
                }
                boolean flag3;
                if (r && !s)
                {
                    com.google.ads.util.g.a("Re-enabling hardware acceleration on expanding MRAID WebView.");
                    h.h();
                    flag3 = flag4;
                } else
                {
                    flag3 = flag4;
                }
            } else
            {
                flag3 = h.j();
            }
            a(h, true, i1, flag, flag3);
            return;
        } else
        {
            a((new StringBuilder()).append("Unknown AdOpener, <action: ").append(s1).append(">").toString());
            return;
        }
    }

    public void onDestroy()
    {
        if (n != null)
        {
            n.removeAllViews();
        }
        if (isFinishing())
        {
            h();
            if (q && h != null)
            {
                h.stopLoading();
                h.destroy();
                h = null;
            }
        }
        super.onDestroy();
    }

    public void onPause()
    {
        if (isFinishing())
        {
            h();
        }
        super.onPause();
    }

    public void onWindowFocusChanged(boolean flag)
    {
        if (p && flag && SystemClock.elapsedRealtime() - m > 250L)
        {
            com.google.ads.util.g.d("Launcher AdActivity got focus and is closing.");
            finish();
        }
        super.onWindowFocusChanged(flag);
    }

    static 
    {
        a = (h)h.a.b();
    }
}
