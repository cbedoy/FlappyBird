// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.a.w;
import com.google.ads.util.ad;
import com.google.ads.util.g;
import java.util.HashMap;

// Referenced classes of package com.google.ads:
//            bu, o, bt

public class ca
    implements bu
{

    public ca()
    {
    }

    public void a(w w1, HashMap hashmap, WebView webview)
    {
        String s = (String)hashmap.get("u");
        if (TextUtils.isEmpty(s))
        {
            g.e("Could not get URL from track gmsg.");
            return;
        } else
        {
            (new Thread(new o(s, (Context)w1.h().f.a()))).start();
            return;
        }
    }
}
