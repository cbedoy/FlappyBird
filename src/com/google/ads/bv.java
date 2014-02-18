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

public class bv
    implements bu
{

    public bv()
    {
    }

    public void a(w w1, HashMap hashmap, WebView webview)
    {
        String s = (String)hashmap.get("name");
        if (s == null)
        {
            g.b("Error: App event with no name parameter.");
            return;
        } else
        {
            w1.a(s, (String)hashmap.get("info"));
            return;
        }
    }
}
