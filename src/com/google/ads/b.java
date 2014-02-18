// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import com.google.ads.a.w;
import com.google.ads.a.x;
import com.google.ads.util.af;
import com.google.ads.util.g;

// Referenced classes of package com.google.ads:
//            AdActivity, bt

public class b
{

    public b()
    {
    }

    public void a(w w1, x x1)
    {
        Object obj = AdActivity.d();
        obj;
        JVM INSTR monitorenter ;
        if (com.google.ads.AdActivity.g() != null) goto _L2; else goto _L1
_L1:
        AdActivity.b(w1);
_L4:
        Activity activity;
        activity = (Activity)w1.h().c.a();
        if (activity == null)
        {
            g.e("activity was null while launching an AdActivity.");
            return;
        }
        break MISSING_BLOCK_LABEL_67;
_L2:
        if (com.google.ads.AdActivity.g() == w1) goto _L4; else goto _L3
_L3:
        g.b("Tried to launch a new AdActivity with a different AdManager.");
        obj;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        Intent intent = new Intent(activity.getApplicationContext(), com/google/ads/AdActivity);
        intent.putExtra("com.google.ads.AdOpener", x1.a());
        try
        {
            g.a("Launching AdActivity.");
            activity.startActivity(intent);
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            g.b("Activity not found.", activitynotfoundexception);
        }
        return;
    }

    public boolean a()
    {
        Object obj = AdActivity.d();
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (AdActivity.e() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean b()
    {
        Object obj = AdActivity.d();
        obj;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag;
        if (AdActivity.f() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj;
        JVM INSTR monitorexit ;
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
