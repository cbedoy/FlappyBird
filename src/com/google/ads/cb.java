// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.webkit.WebView;
import com.google.ads.a.n;
import com.google.ads.a.w;
import com.google.ads.util.g;
import java.util.HashMap;

// Referenced classes of package com.google.ads:
//            bu, e

public class cb
    implements bu
{

    public cb()
    {
    }

    public void a(w w1, HashMap hashmap, WebView webview)
    {
        String s = (String)hashmap.get("type");
        String s1 = (String)hashmap.get("errors");
        g.e((new StringBuilder()).append("Invalid ").append(s).append(" request error: ").append(s1).toString());
        n n1 = w1.j();
        if (n1 != null)
        {
            n1.a(e.a);
        }
    }
}
