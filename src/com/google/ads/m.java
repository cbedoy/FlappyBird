// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.app.Activity;
import android.webkit.WebView;
import com.google.ads.a.w;
import com.google.ads.util.ae;
import com.google.ads.util.af;
import com.google.ads.util.g;
import java.util.HashMap;

// Referenced classes of package com.google.ads:
//            bu, bt, ai

public class m
    implements bu
{

    public m()
    {
    }

    public void a(w w1, HashMap hashmap, WebView webview)
    {
        if ((Activity)w1.h().c.a() != null) goto _L2; else goto _L1
_L1:
        g.e("Activity was null while responding to touch gmsg.");
_L4:
        return;
_L2:
        String s;
        String s1;
        String s2;
        s = (String)hashmap.get("tx");
        s1 = (String)hashmap.get("ty");
        s2 = (String)hashmap.get("td");
        int i;
        int j;
        int k;
        ai ai1;
        i = Integer.parseInt(s);
        j = Integer.parseInt(s1);
        k = Integer.parseInt(s2);
        ai1 = (ai)w1.h().r.a();
        if (ai1 != null)
        {
            try
            {
                ai1.a(i, j, k);
                return;
            }
            catch (NumberFormatException numberformatexception)
            {
                g.e("Could not parse touch parameters from gmsg.");
            }
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
