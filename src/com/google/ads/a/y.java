// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.ads.bq;
import com.google.ads.bt;
import com.google.ads.e;
import com.google.ads.util.AdUtil;
import com.google.ads.util.ad;
import com.google.ads.util.ae;
import com.google.ads.util.g;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

// Referenced classes of package com.google.ads.a:
//            z, n, aa, w

public final class y
    implements Runnable
{

    private final bq a;
    private final aa b;
    private volatile boolean c;
    private boolean d;
    private String e;
    private Thread f;

    y(bq bq1)
    {
        this(bq1, ((aa) (new z())));
    }

    y(bq bq1, aa aa1)
    {
        f = null;
        a = bq1;
        b = aa1;
    }

    private void a(Context context, HttpURLConnection httpurlconnection)
    {
        String s;
label0:
        {
            s = PreferenceManager.getDefaultSharedPreferences(context).getString("drt", "");
            if (d && !TextUtils.isEmpty(s))
            {
                if (AdUtil.a != 8)
                {
                    break label0;
                }
                httpurlconnection.addRequestProperty("X-Afma-drt-Cookie", s);
            }
            return;
        }
        httpurlconnection.addRequestProperty("Cookie", s);
    }

    private void a(HttpURLConnection httpurlconnection)
    {
        b(httpurlconnection);
        f(httpurlconnection);
        g(httpurlconnection);
        h(httpurlconnection);
        i(httpurlconnection);
        e(httpurlconnection);
        j(httpurlconnection);
        k(httpurlconnection);
        l(httpurlconnection);
        d(httpurlconnection);
        c(httpurlconnection);
        m(httpurlconnection);
        n(httpurlconnection);
    }

    private void a(HttpURLConnection httpurlconnection, int i1)
    {
        if (300 <= i1 && i1 < 400)
        {
            String s1 = httpurlconnection.getHeaderField("Location");
            if (s1 == null)
            {
                com.google.ads.util.g.c((new StringBuilder()).append("Could not get redirect location from a ").append(i1).append(" redirect.").toString());
                ((n)a.b.a()).a(e.d);
                a();
                return;
            } else
            {
                a(httpurlconnection);
                e = s1;
                return;
            }
        }
        if (i1 == 200)
        {
            a(httpurlconnection);
            String s = AdUtil.a(new InputStreamReader(httpurlconnection.getInputStream())).trim();
            com.google.ads.util.g.a((new StringBuilder()).append("Response content is: ").append(s).toString());
            if (TextUtils.isEmpty(s))
            {
                com.google.ads.util.g.a((new StringBuilder()).append("Response message is null or zero length: ").append(s).toString());
                ((n)a.b.a()).a(e.b);
                a();
                return;
            } else
            {
                ((n)a.b.a()).a(s, e);
                a();
                return;
            }
        }
        if (i1 == 400)
        {
            com.google.ads.util.g.c("Bad request");
            ((n)a.b.a()).a(e.a);
            a();
            return;
        } else
        {
            com.google.ads.util.g.c((new StringBuilder()).append("Invalid response code: ").append(i1).toString());
            ((n)a.b.a()).a(e.d);
            a();
            return;
        }
    }

    private void b()
    {
_L2:
        HttpURLConnection httpurlconnection;
        if (c)
        {
            break; /* Loop/switch isn't completed */
        }
        URL url = new URL(e);
        httpurlconnection = b.a(url);
        a((Context)((bt)a.a.a()).f.a(), httpurlconnection);
        AdUtil.a(httpurlconnection, (Context)((bt)a.a.a()).f.a());
        httpurlconnection.setInstanceFollowRedirects(false);
        httpurlconnection.connect();
        a(httpurlconnection, httpurlconnection.getResponseCode());
        httpurlconnection.disconnect();
        if (true) goto _L2; else goto _L1
        Exception exception;
        exception;
        httpurlconnection.disconnect();
        throw exception;
_L1:
    }

    private void b(HttpURLConnection httpurlconnection)
    {
        String s = httpurlconnection.getHeaderField("X-Afma-Debug-Dialog");
        if (!TextUtils.isEmpty(s))
        {
            ((n)a.b.a()).f(s);
        }
    }

    private void c(HttpURLConnection httpurlconnection)
    {
        String s = httpurlconnection.getHeaderField("Content-Type");
        if (!TextUtils.isEmpty(s))
        {
            ((n)a.b.a()).b(s);
        }
    }

    private void d(HttpURLConnection httpurlconnection)
    {
        String s = httpurlconnection.getHeaderField("X-Afma-Mediation");
        if (!TextUtils.isEmpty(s))
        {
            ((n)a.b.a()).b(Boolean.valueOf(s).booleanValue());
        }
    }

    private void e(HttpURLConnection httpurlconnection)
    {
        String s;
        s = httpurlconnection.getHeaderField("X-Afma-Interstitial-Timeout");
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_53;
        }
        float f1 = Float.parseFloat(s);
        ((w)((bt)a.a.a()).b.a()).a((long)(f1 * 1000F));
        return;
        NumberFormatException numberformatexception;
        numberformatexception;
        com.google.ads.util.g.d((new StringBuilder()).append("Could not get timeout value: ").append(s).toString(), numberformatexception);
        return;
    }

    private void f(HttpURLConnection httpurlconnection)
    {
        String s = httpurlconnection.getHeaderField("X-Afma-Tracking-Urls");
        if (!TextUtils.isEmpty(s))
        {
            String as[] = s.trim().split("\\s+");
            int i1 = as.length;
            for (int j1 = 0; j1 < i1; j1++)
            {
                String s1 = as[j1];
                ((w)((bt)a.a.a()).b.a()).b(s1);
            }

        }
    }

    private void g(HttpURLConnection httpurlconnection)
    {
        String s = httpurlconnection.getHeaderField("X-Afma-Manual-Tracking-Urls");
        if (!TextUtils.isEmpty(s))
        {
            String as[] = s.trim().split("\\s+");
            int i1 = as.length;
            for (int j1 = 0; j1 < i1; j1++)
            {
                String s1 = as[j1];
                ((w)((bt)a.a.a()).b.a()).c(s1);
            }

        }
    }

    private void h(HttpURLConnection httpurlconnection)
    {
        String s = httpurlconnection.getHeaderField("X-Afma-Click-Tracking-Urls");
        if (!TextUtils.isEmpty(s))
        {
            String as[] = s.trim().split("\\s+");
            int i1 = as.length;
            for (int j1 = 0; j1 < i1; j1++)
            {
                String s1 = as[j1];
                ((n)a.b.a()).a(s1);
            }

        }
    }

    private void i(HttpURLConnection httpurlconnection)
    {
        String s = httpurlconnection.getHeaderField("X-Afma-Refresh-Rate");
        if (!TextUtils.isEmpty(s))
        {
            float f1;
            w w1;
            try
            {
                f1 = Float.parseFloat(s);
            }
            catch (NumberFormatException numberformatexception)
            {
                com.google.ads.util.g.d((new StringBuilder()).append("Could not get refresh value: ").append(s).toString(), numberformatexception);
                return;
            }
            w1 = (w)((bt)a.a.a()).b.a();
            if (f1 > 0.0F)
            {
                w1.a(f1);
                if (!w1.r())
                {
                    w1.f();
                }
            } else
            if (w1.r())
            {
                w1.e();
                return;
            }
        }
    }

    private void j(HttpURLConnection httpurlconnection)
    {
        String s = httpurlconnection.getHeaderField("X-Afma-Orientation");
        if (!TextUtils.isEmpty(s))
        {
            if (s.equals("portrait"))
            {
                ((n)a.b.a()).a(AdUtil.b());
            } else
            if (s.equals("landscape"))
            {
                ((n)a.b.a()).a(AdUtil.a());
                return;
            }
        }
    }

    private void k(HttpURLConnection httpurlconnection)
    {
        if (TextUtils.isEmpty(httpurlconnection.getHeaderField("X-Afma-Doritos-Cache-Life")))
        {
            break MISSING_BLOCK_LABEL_50;
        }
        long l1 = Long.parseLong(httpurlconnection.getHeaderField("X-Afma-Doritos-Cache-Life"));
        ((w)((bt)a.a.a()).b.a()).b(l1);
        return;
        NumberFormatException numberformatexception;
        numberformatexception;
        com.google.ads.util.g.e((new StringBuilder()).append("Got bad value of Doritos cookie cache life from header: ").append(httpurlconnection.getHeaderField("X-Afma-Doritos-Cache-Life")).append(". Using default value instead.").toString());
        return;
    }

    private void l(HttpURLConnection httpurlconnection)
    {
        String s = httpurlconnection.getHeaderField("Cache-Control");
        if (!TextUtils.isEmpty(s))
        {
            ((n)a.b.a()).c(s);
        }
    }

    private void m(HttpURLConnection httpurlconnection)
    {
        String s;
        s = httpurlconnection.getHeaderField("X-Afma-Ad-Size");
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_126;
        }
        String as[];
        as = s.split("x", 2);
        if (as.length != 2)
        {
            com.google.ads.util.g.e((new StringBuilder()).append("Could not parse size header: ").append(s).toString());
            return;
        }
        int i1;
        int j1;
        i1 = Integer.parseInt(as[0]);
        j1 = Integer.parseInt(as[1]);
        ((n)a.b.a()).a(new com.google.ads.g(i1, j1));
        return;
        NumberFormatException numberformatexception;
        numberformatexception;
        com.google.ads.util.g.e((new StringBuilder()).append("Could not parse size header: ").append(s).toString());
    }

    private void n(HttpURLConnection httpurlconnection)
    {
        String s = httpurlconnection.getHeaderField("X-Afma-Disable-Activation-And-Scroll");
        if (!TextUtils.isEmpty(s))
        {
            ((n)a.b.a()).a(s.equals("1"));
        }
    }

    void a()
    {
        c = true;
    }

    void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        if (f == null)
        {
            e = s;
            c = false;
            f = new Thread(this);
            f.start();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(boolean flag)
    {
        d = flag;
    }

    public void run()
    {
        try
        {
            b();
            return;
        }
        catch (MalformedURLException malformedurlexception)
        {
            com.google.ads.util.g.b("Received malformed ad url from javascript.", malformedurlexception);
            ((n)a.b.a()).a(e.d);
            return;
        }
        catch (IOException ioexception)
        {
            com.google.ads.util.g.b("IOException connecting to ad url.", ioexception);
            ((n)a.b.a()).a(e.c);
            return;
        }
        catch (Throwable throwable)
        {
            com.google.ads.util.g.b("An unknown error occurred in AdResponseLoader.", throwable);
        }
        ((n)a.b.a()).a(e.d);
    }
}
