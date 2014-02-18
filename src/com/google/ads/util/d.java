// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.util;

import android.view.View;
import com.google.ads.bt;

// Referenced classes of package com.google.ads.util:
//            r

public class d extends r
{

    public d(bt bt)
    {
        super(bt);
    }

    public void onShowCustomView(View view, int i, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        customviewcallback.onCustomViewHidden();
    }
}
