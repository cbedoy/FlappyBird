// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.google.ads.a.h;
import com.google.ads.util.o;
import java.util.Date;

// Referenced classes of package com.google.ads:
//            av, au

public final class at
{

    private static final h a;

    public static void a(Activity activity)
    {
        (new Thread(new av(activity))).start();
    }

    public static boolean a(Context context, long l)
    {
        if (!a(context, l, PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext())))
        {
            return false;
        } else
        {
            (new Thread(new au(context))).start();
            return true;
        }
    }

    static boolean a(Context context, long l, SharedPreferences sharedpreferences)
    {
        return !sharedpreferences.contains("drt") || !sharedpreferences.contains("drt_ts") || sharedpreferences.getLong("drt_ts", 0L) < (new Date()).getTime() - l;
    }

    static 
    {
        a = (h)h.a.b();
    }
}
