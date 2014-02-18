// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.text.TextUtils;
import android.webkit.WebView;
import com.google.ads.a.a;
import com.google.ads.a.w;
import com.google.ads.util.g;
import java.util.HashMap;

// Referenced classes of package com.google.ads:
//            bu

public class l
    implements bu
{

    public l()
    {
    }

    public void a(w w1, HashMap hashmap, WebView webview)
    {
        int i = -1;
        if (!(webview instanceof a)) goto _L2; else goto _L1
_L1:
        int j;
        if (TextUtils.isEmpty((CharSequence)hashmap.get("w")))
        {
            break MISSING_BLOCK_LABEL_255;
        }
        j = Integer.parseInt((String)hashmap.get("w"));
_L11:
        if (TextUtils.isEmpty((CharSequence)hashmap.get("h"))) goto _L4; else goto _L3
_L3:
        int k = Integer.parseInt((String)hashmap.get("h"));
_L10:
        if (TextUtils.isEmpty((CharSequence)hashmap.get("x"))) goto _L6; else goto _L5
_L5:
        int i1 = Integer.parseInt((String)hashmap.get("x"));
_L9:
        if (TextUtils.isEmpty((CharSequence)hashmap.get("y"))) goto _L8; else goto _L7
_L7:
        int j1 = Integer.parseInt((String)hashmap.get("y"));
        i = j1;
_L8:
        if (hashmap.get("a") != null && ((String)hashmap.get("a")).equals("1"))
        {
            w1.a(null, true, i1, i, j, k);
            return;
        }
        break MISSING_BLOCK_LABEL_181;
        NumberFormatException numberformatexception;
        numberformatexception;
        g.d("Invalid number format in activation overlay response.", numberformatexception);
        return;
        if (hashmap.get("a") != null && ((String)hashmap.get("a")).equals("0"))
        {
            w1.a(null, false, i1, i, j, k);
            return;
        } else
        {
            w1.a(i1, i, j, k);
            return;
        }
_L2:
        g.b("Trying to activate an overlay when this is not an overlay.");
        return;
_L6:
        i1 = i;
          goto _L9
_L4:
        k = i;
          goto _L10
        j = i;
          goto _L11
    }
}
