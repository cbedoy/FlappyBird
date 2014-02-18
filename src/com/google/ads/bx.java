// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebView;
import com.google.ads.a.ab;
import com.google.ads.a.w;
import com.google.ads.util.ad;
import com.google.ads.util.ae;
import com.google.ads.util.g;
import java.util.HashMap;
import java.util.Locale;

// Referenced classes of package com.google.ads:
//            bu, al, bt, ak, 
//            o

public class bx
    implements bu
{

    public bx()
    {
    }

    public void a(w w1, HashMap hashmap, WebView webview)
    {
        String s;
        bt bt1;
        Context context;
        Uri uri;
        s = (String)hashmap.get("u");
        if (s == null)
        {
            g.e("Could not get URL from click gmsg.");
            return;
        }
        ab ab1 = w1.m();
        if (ab1 != null)
        {
            Uri uri3 = Uri.parse(s);
            String s1 = uri3.getHost();
            if (s1 != null && s1.toLowerCase(Locale.US).endsWith(".admob.com"))
            {
                String s2 = uri3.getPath();
                String s3 = null;
                if (s2 != null)
                {
                    String as[] = s2.split("/");
                    int i = as.length;
                    s3 = null;
                    if (i >= 4)
                    {
                        s3 = (new StringBuilder()).append(as[2]).append("/").append(as[3]).toString();
                    }
                }
                ab1.a(s3);
            }
        }
        bt1 = w1.h();
        context = (Context)bt1.f.a();
        uri = Uri.parse(s);
        ak ak1 = (ak)bt1.s.a();
        if (ak1 == null) goto _L2; else goto _L1
_L1:
        if (!ak1.a(uri)) goto _L2; else goto _L3
_L3:
        Uri uri2 = ak1.a(uri, context);
        Uri uri1 = uri2;
_L5:
        (new Thread(new o(uri1.toString(), context))).start();
        return;
        al al1;
        al1;
        g.e((new StringBuilder()).append("Unable to append parameter to URL: ").append(s).toString());
_L2:
        uri1 = uri;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
