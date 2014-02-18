// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.a;

import android.os.Handler;
import com.google.ads.br;
import com.google.ads.bs;
import com.google.ads.bt;
import com.google.ads.util.AdUtil;
import com.google.ads.util.ad;
import com.google.ads.util.ae;
import com.google.ads.util.g;

// Referenced classes of package com.google.ads.a:
//            e, w, h, ad, 
//            b

public class a extends e
{

    private volatile boolean b;
    private boolean c;
    private int d;
    private int e;
    private final com.google.ads.a.ad f;

    public a(bt bt1)
    {
        super(bt1, null);
        b = true;
        c = true;
        d = 0;
        e = 0;
        bs bs1 = (bs)((br)bt1.d.a()).b.a();
        if (AdUtil.a < ((Integer)bs1.c.a()).intValue())
        {
            g.a("Disabling hardware acceleration for an activation overlay.");
            g();
        }
        f = ad.a((w)bt1.b.a(), h.c, true, true);
        setWebViewClient(f);
    }

    public boolean a()
    {
        return b;
    }

    public boolean b()
    {
        return c;
    }

    public int c()
    {
        return e;
    }

    public boolean canScrollHorizontally(int i)
    {
        return false;
    }

    public boolean canScrollVertically(int i)
    {
        return false;
    }

    public int d()
    {
        return d;
    }

    public com.google.ads.a.ad e()
    {
        return f;
    }

    public void setOverlayActivated(boolean flag)
    {
        c = flag;
    }

    public void setOverlayEnabled(boolean flag)
    {
        if (!flag)
        {
            ((Handler)br.a().c.a()).post(new b(this, this));
        }
        b = flag;
    }

    public void setXPosition(int i)
    {
        d = i;
    }

    public void setYPosition(int i)
    {
        e = i;
    }
}
