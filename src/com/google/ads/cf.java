// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.webkit.WebView;
import com.google.ads.a.w;
import com.google.ads.a.x;
import com.google.ads.util.g;
import java.util.HashMap;

// Referenced classes of package com.google.ads:
//            bu, b

public class cf
    implements bu
{

    private b a;

    public cf()
    {
        this(new b());
    }

    public cf(b b1)
    {
        a = b1;
    }

    public void a(w w, HashMap hashmap, WebView webview)
    {
        String s = (String)hashmap.get("a");
        if (s == null)
        {
            g.a("Could not get the action parameter for open GMSG.");
            return;
        }
        if (s.equals("webapp"))
        {
            a.a(w, new x("webapp", hashmap));
            return;
        }
        if (s.equals("expand"))
        {
            a.a(w, new x("expand", hashmap));
            return;
        } else
        {
            a.a(w, new x("intent", hashmap));
            return;
        }
    }
}
