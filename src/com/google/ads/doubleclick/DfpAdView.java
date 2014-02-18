// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.doubleclick;

import android.content.Context;
import android.util.AttributeSet;
import com.google.ads.AdView;
import com.google.ads.g;
import com.google.ads.h;

public class DfpAdView extends AdView
{

    public DfpAdView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public DfpAdView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public void setAppEventListener(h h)
    {
        super.setAppEventListener(h);
    }

    public transient void setSupportedAdSizes(g ag[])
    {
        super.setSupportedAdSizes(ag);
    }
}
