// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.a.ac;
import com.google.ads.b.b;
import com.google.ads.util.ad;
import com.google.ads.util.e;
import java.util.HashMap;

// Referenced classes of package com.google.ads:
//            br, bl, bm, bj, 
//            bh, bd, d

public class bk
{

    final ac a;
    private final bh b;
    private boolean c;
    private boolean d;
    private bj e;
    private final bd f;
    private b g;
    private boolean h;
    private boolean i;
    private View j;
    private final String k;
    private final d l;
    private final HashMap m;

    public bk(bd bd, ac ac, bh bh, String s, d d1, HashMap hashmap)
    {
        com.google.ads.util.e.a(TextUtils.isEmpty(s));
        f = bd;
        a = ac;
        b = bh;
        k = s;
        l = d1;
        m = hashmap;
        c = false;
        d = false;
        e = null;
        g = null;
        h = false;
        i = false;
        j = null;
    }

    static b a(bk bk1)
    {
        return bk1.g;
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        com.google.ads.util.e.a(h, "destroy() called but startLoadAdTask has not been called.");
        ((Handler)br.a().c.a()).post(new bl(this));
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(Activity activity)
    {
        this;
        JVM INSTR monitorenter ;
        com.google.ads.util.e.b(h, "startLoadAdTask has already been called.");
        h = true;
        ((Handler)br.a().c.a()).post(new bm(this, activity, k, l, m));
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void a(b b1)
    {
        this;
        JVM INSTR monitorenter ;
        g = b1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void a(boolean flag, bj bj1)
    {
        this;
        JVM INSTR monitorenter ;
        d = flag;
        c = true;
        e = bj1;
        notify();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean b()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = c;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean c()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        com.google.ads.util.e.a(c, "isLoadAdTaskSuccessful() called when isLoadAdTaskDone() is false.");
        flag = d;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public bj d()
    {
        this;
        JVM INSTR monitorenter ;
        if (e != null) goto _L2; else goto _L1
_L1:
        bj bj1 = bj.d;
_L4:
        this;
        JVM INSTR monitorexit ;
        return bj1;
_L2:
        bj1 = e;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public View e()
    {
        this;
        JVM INSTR monitorenter ;
        View view;
        com.google.ads.util.e.a(c, "getAdView() called when isLoadAdTaskDone() is false.");
        view = j;
        this;
        JVM INSTR monitorexit ;
        return view;
        Exception exception;
        exception;
        throw exception;
    }

    public String f()
    {
        this;
        JVM INSTR monitorenter ;
        if (g == null) goto _L2; else goto _L1
_L1:
        String s1 = g.getClass().getName();
        String s = s1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        s = "\"adapter was not created.\"";
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    void g()
    {
        this;
        JVM INSTR monitorenter ;
        i = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    boolean h()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = i;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }
}
