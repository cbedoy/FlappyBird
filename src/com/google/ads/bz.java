// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.webkit.WebView;
import com.google.ads.a.e;
import com.google.ads.a.w;
import com.google.ads.util.g;
import java.util.HashMap;

// Referenced classes of package com.google.ads:
//            bu

public class bz
    implements bu
{

    public bz()
    {
    }

    public void a(w w, HashMap hashmap, WebView webview)
    {
        if (webview instanceof e)
        {
            ((e)webview).setCustomClose("1".equals(hashmap.get("custom_close")));
            return;
        } else
        {
            g.b("Trying to set a custom close icon on a WebView that isn't an AdWebView");
            return;
        }
    }
}
