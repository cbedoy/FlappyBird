// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.a;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.AdActivity;
import com.google.ads.ai;
import com.google.ads.bt;
import com.google.ads.util.AdUtil;
import com.google.ads.util.ad;
import com.google.ads.util.ae;
import com.google.ads.util.d;
import com.google.ads.util.g;
import com.google.ads.util.p;
import com.google.ads.util.r;
import com.google.ads.util.z;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.ads.a:
//            f, g

public class e extends WebView
{

    protected final bt a;
    private WeakReference b;
    private com.google.ads.g c;
    private boolean d;
    private boolean e;
    private boolean f;

    public e(bt bt1, com.google.ads.g g1)
    {
        WebSettings websettings;
        super((Context)bt1.f.a());
        a = bt1;
        c = g1;
        b = null;
        d = false;
        e = false;
        f = false;
        setBackgroundColor(0);
        AdUtil.a(this);
        websettings = getSettings();
        websettings.setSupportMultipleWindows(false);
        websettings.setJavaScriptEnabled(true);
        websettings.setSavePassword(false);
        setDownloadListener(new f(this));
        if (AdUtil.a < 17) goto _L2; else goto _L1
_L1:
        z.a(websettings, bt1);
_L8:
        setScrollBarStyle(0x2000000);
        if (AdUtil.a < 14) goto _L4; else goto _L3
_L3:
        setWebChromeClient(new d(bt1));
_L6:
        return;
_L2:
        if (AdUtil.a >= 11)
        {
            p.a(websettings, bt1);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (AdUtil.a < 11) goto _L6; else goto _L5
_L5:
        setWebChromeClient(new r(bt1));
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            setOnTouchListener(new com.google.ads.a.g(this));
            return;
        } else
        {
            setOnTouchListener(null);
            return;
        }
    }

    public void destroy()
    {
        try
        {
            super.destroy();
        }
        catch (Throwable throwable)
        {
            com.google.ads.util.g.d("An error occurred while destroying an AdWebView:", throwable);
        }
        try
        {
            setWebViewClient(new WebViewClient());
            return;
        }
        catch (Throwable throwable1)
        {
            return;
        }
    }

    public void f()
    {
        AdActivity adactivity = i();
        if (adactivity != null)
        {
            adactivity.finish();
        }
    }

    public void g()
    {
        if (AdUtil.a >= 11)
        {
            p.a(this);
        }
        e = true;
    }

    public void h()
    {
        if (e && AdUtil.a >= 11)
        {
            p.b(this);
        }
        e = false;
    }

    public AdActivity i()
    {
        if (b != null)
        {
            return (AdActivity)b.get();
        } else
        {
            return null;
        }
    }

    public boolean j()
    {
        return f;
    }

    public boolean k()
    {
        return e;
    }

    public void loadDataWithBaseURL(String s, String s1, String s2, String s3, String s4)
    {
        try
        {
            super.loadDataWithBaseURL(s, s1, s2, s3, s4);
            return;
        }
        catch (Throwable throwable)
        {
            com.google.ads.util.g.d("An error occurred while loading data in AdWebView:", throwable);
        }
    }

    public void loadUrl(String s)
    {
        try
        {
            super.loadUrl(s);
            return;
        }
        catch (Throwable throwable)
        {
            com.google.ads.util.g.d("An error occurred while loading a URL in AdWebView:", throwable);
        }
    }

    protected void onMeasure(int l, int i1)
    {
        int j1 = 0x7fffffff;
        this;
        JVM INSTR monitorenter ;
        if (!isInEditMode()) goto _L2; else goto _L1
_L1:
        super.onMeasure(l, i1);
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (c != null && !d)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        super.onMeasure(l, i1);
          goto _L3
        Exception exception;
        exception;
        throw exception;
        int k1;
        int l1;
        int i2;
        int j2;
        float f1;
        int k2;
        int l2;
        k1 = android.view.View.MeasureSpec.getMode(l);
        l1 = android.view.View.MeasureSpec.getSize(l);
        i2 = android.view.View.MeasureSpec.getMode(i1);
        j2 = android.view.View.MeasureSpec.getSize(i1);
        f1 = getContext().getResources().getDisplayMetrics().density;
        k2 = (int)(f1 * (float)c.a());
        l2 = (int)(f1 * (float)c.b());
        break MISSING_BLOCK_LABEL_118;
_L4:
        com.google.ads.util.g.b((new StringBuilder()).append("Not enough space to show ad! Wants: <").append(k2).append(", ").append(l2).append(">, Has: <").append(l1).append(", ").append(j2).append(">").toString());
        setVisibility(8);
        setMeasuredDimension(l1, j2);
          goto _L3
_L5:
        setMeasuredDimension(k2, l2);
          goto _L3
        int i3;
        if (k1 != 0x80000000 && k1 != 0x40000000)
        {
            i3 = j1;
        } else
        {
            i3 = l1;
        }
        if (i2 == 0x80000000 || i2 == 0x40000000)
        {
            j1 = j2;
        }
        if ((float)k2 - f1 * 6F <= (float)i3 && l2 <= j1) goto _L5; else goto _L4
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        ai ai1 = (ai)a.r.a();
        if (ai1 != null)
        {
            ai1.a(motionevent);
        }
        return super.onTouchEvent(motionevent);
    }

    public void setAdActivity(AdActivity adactivity)
    {
        b = new WeakReference(adactivity);
    }

    public void setAdSize(com.google.ads.g g1)
    {
        this;
        JVM INSTR monitorenter ;
        c = g1;
        requestLayout();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void setCustomClose(boolean flag)
    {
        f = flag;
        if (b != null)
        {
            AdActivity adactivity = (AdActivity)b.get();
            if (adactivity != null)
            {
                adactivity.a(flag);
            }
        }
    }

    public void setIsExpandedMraid(boolean flag)
    {
        d = flag;
    }

    public void stopLoading()
    {
        try
        {
            super.stopLoading();
            return;
        }
        catch (Throwable throwable)
        {
            com.google.ads.util.g.d("An error occurred while stopping loading in AdWebView:", throwable);
        }
    }
}
