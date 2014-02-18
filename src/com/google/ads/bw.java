// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.webkit.WebView;
import com.google.ads.a.h;
import com.google.ads.a.w;
import com.google.ads.util.g;
import com.google.ads.util.o;
import java.util.HashMap;

// Referenced classes of package com.google.ads:
//            bu

public class bw
    implements bu
{

    private static final h a;

    public bw()
    {
    }

    public void a(w w, HashMap hashmap, WebView webview)
    {
        String s = (String)hashmap.get("urls");
        if (s == null)
        {
            g.e("Could not get the urls param from canOpenURLs gmsg.");
            return;
        }
        String as[] = s.split(",");
        HashMap hashmap1 = new HashMap();
        PackageManager packagemanager = webview.getContext().getPackageManager();
        int i = as.length;
        int j = 0;
        while (j < i) 
        {
            String s1 = as[j];
            String as1[] = s1.split(";", 2);
            String s2 = as1[0];
            String s3;
            boolean flag;
            if (as1.length >= 2)
            {
                s3 = as1[1];
            } else
            {
                s3 = "android.intent.action.VIEW";
            }
            if (packagemanager.resolveActivity(new Intent(s3, Uri.parse(s2)), 0x10000) != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            hashmap1.put(s1, Boolean.valueOf(flag));
            j++;
        }
        a.a(webview, hashmap1);
    }

    static 
    {
        a = (h)h.a.b();
    }
}
