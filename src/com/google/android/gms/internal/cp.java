// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;

public class cp
    implements android.content.DialogInterface.OnClickListener
{

    private final Activity a;
    private final Intent b;
    private final int c;

    public cp(Activity activity, Intent intent, int i)
    {
        a = activity;
        b = intent;
        c = i;
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        try
        {
            if (b != null)
            {
                a.startActivityForResult(b, c);
            }
            dialoginterface.dismiss();
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            Log.e("SettingsRedirect", "Can't redirect to app settings for Google Play services");
        }
    }
}
