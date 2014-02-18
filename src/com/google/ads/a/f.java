// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.a;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;
import com.google.ads.util.AdUtil;
import com.google.ads.util.g;

// Referenced classes of package com.google.ads.a:
//            e

class f
    implements DownloadListener
{

    final e a;

    f(e e1)
    {
        a = e1;
        super();
    }

    public void onDownloadStart(String s, String s1, String s2, String s3, long l)
    {
        Intent intent;
        com.google.ads.AdActivity adactivity;
        try
        {
            intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(s), s3);
            adactivity = a.i();
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            g.a((new StringBuilder()).append("Couldn't find an Activity to view url/mimetype: ").append(s).append(" / ").append(s3).toString());
            return;
        }
        catch (Throwable throwable)
        {
            g.b((new StringBuilder()).append("Unknown error trying to start activity to view URL: ").append(s).toString(), throwable);
            return;
        }
        if (adactivity == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        if (AdUtil.a(intent, adactivity))
        {
            adactivity.startActivity(intent);
        }
    }
}
