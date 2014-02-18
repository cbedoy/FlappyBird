// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.util;

import android.webkit.WebSettings;
import com.google.ads.bt;

// Referenced classes of package com.google.ads.util:
//            p

public final class z
{

    public static void a(WebSettings websettings, bt bt)
    {
        p.a(websettings, bt);
        websettings.setMediaPlaybackRequiresUserGesture(false);
    }
}
