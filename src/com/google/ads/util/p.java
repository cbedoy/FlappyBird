// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.util;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.webkit.WebSettings;
import com.google.ads.br;
import com.google.ads.bs;
import com.google.ads.bt;
import java.io.File;

// Referenced classes of package com.google.ads.util:
//            ad, ae

public class p
{

    public static void a(View view)
    {
        view.setLayerType(1, null);
    }

    public static void a(Window window)
    {
        window.setFlags(0x1000000, 0x1000000);
    }

    public static void a(WebSettings websettings, bt bt1)
    {
        Context context = (Context)bt1.f.a();
        bs bs1 = (bs)((br)bt1.d.a()).b.a();
        websettings.setAppCacheEnabled(true);
        websettings.setAppCacheMaxSize(((Long)bs1.i.a()).longValue());
        websettings.setAppCachePath((new File(context.getCacheDir(), "admob")).getAbsolutePath());
        websettings.setDatabaseEnabled(true);
        websettings.setDatabasePath(context.getDatabasePath("admob").getAbsolutePath());
        websettings.setDomStorageEnabled(true);
        websettings.setSupportZoom(true);
        websettings.setBuiltInZoomControls(true);
        websettings.setDisplayZoomControls(false);
    }

    public static void b(View view)
    {
        view.setLayerType(0, null);
    }
}
