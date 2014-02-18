// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.d;

import android.app.Activity;
import android.view.Window;

public class a
{

    public static void a(Activity activity)
    {
        Window window = activity.getWindow();
        window.addFlags(1024);
        window.clearFlags(2048);
        window.requestFeature(1);
    }

    public static void b(Activity activity)
    {
        activity.getWindow().addFlags(128);
    }
}
