// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.webkit.WebView;
import com.google.ads.a.w;
import com.google.ads.util.g;
import java.util.HashMap;

// Referenced classes of package com.google.ads:
//            bu

public class ce
    implements bu
{

    public ce()
    {
    }

    public void a(w w, HashMap hashmap, WebView webview)
    {
        String s = (String)hashmap.get("string");
        String s1 = (String)hashmap.get("afma_notify_dt");
        g.c((new StringBuilder()).append("Received log message: <\"string\": \"").append(s).append("\", \"afmaNotifyDt\": \"").append(s1).append("\">").toString());
    }
}
