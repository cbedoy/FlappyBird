// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.ads.util.aa;
import com.google.ads.util.ad;
import com.google.ads.util.ae;

// Referenced classes of package com.google.ads:
//            bs

public class br extends aa
{

    private static final br d = new br();
    public final ae a = new ae(this, "marketPackages", null);
    public final ad b = new ad(this, "constants", new bs());
    public final ad c = new ad(this, "uiHandler", new Handler(Looper.getMainLooper()));

    private br()
    {
    }

    public static br a()
    {
        return d;
    }

}
