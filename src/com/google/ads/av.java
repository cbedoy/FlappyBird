// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.google.ads.util.g;
import java.lang.ref.WeakReference;
import java.util.Date;

// Referenced classes of package com.google.ads:
//            as

class av
    implements Runnable
{

    private final WeakReference a;
    private final android.content.SharedPreferences.Editor b;

    public av(Activity activity)
    {
        this(activity, null);
    }

    av(Activity activity, android.content.SharedPreferences.Editor editor)
    {
        a = new WeakReference(activity);
        b = editor;
    }

    private android.content.SharedPreferences.Editor a(Context context)
    {
        if (b == null)
        {
            return PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext()).edit();
        } else
        {
            return b;
        }
    }

    public void run()
    {
        Activity activity = (Activity)a.get();
        String s;
        android.content.SharedPreferences.Editor editor;
        if (activity == null)
        {
            Cursor cursor;
            try
            {
                g.a("Activity was null while making a doritos cookie request.");
                return;
            }
            catch (Throwable throwable)
            {
                g.d("An unknown error occurred while sending a doritos request.", throwable);
            }
            return;
        }
        cursor = activity.getContentResolver().query(as.a, as.b, null, null, null);
        if (cursor == null) goto _L2; else goto _L1
_L1:
        if (!cursor.moveToFirst() || cursor.getColumnNames().length <= 0) goto _L2; else goto _L3
_L3:
        s = cursor.getString(cursor.getColumnIndex(cursor.getColumnName(0)));
_L4:
        editor = a(activity);
        if (TextUtils.isEmpty(s))
        {
            break MISSING_BLOCK_LABEL_157;
        }
        editor.putString("drt", s);
        editor.putLong("drt_ts", (new Date()).getTime());
_L5:
        editor.commit();
        return;
_L2:
        g.a("Google+ app not installed, not storing doritos cookie");
        s = null;
          goto _L4
        editor.putString("drt", "");
        editor.putLong("drt_ts", 0L);
          goto _L5
    }
}
