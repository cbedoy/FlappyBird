// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

final class au
    implements Runnable
{

    final Context a;

    au(Context context)
    {
        a = context;
        super();
    }

    public void run()
    {
        android.content.SharedPreferences.Editor editor = PreferenceManager.getDefaultSharedPreferences(a.getApplicationContext()).edit();
        editor.putString("drt", "");
        editor.putLong("drt_ts", 0L);
        editor.commit();
    }
}
