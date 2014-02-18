// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;

// Referenced classes of package com.google.android.gms.internal:
//            cr, do, cf, df, 
//            ce, cu

public final class bj extends cr
{

    private final String f;

    public bj(Context context, c c1, d d1, String s, String as[])
    {
        super(context, c1, d1, as);
        f = (String)com.google.android.gms.internal.do.a(s);
    }

    protected ce a(IBinder ibinder)
    {
        return cf.a(ibinder);
    }

    protected void a(df df1, cu cu)
    {
        df1.a(cu, 0x31d24c, j().getPackageName(), f, k());
    }

    protected transient void a(String as[])
    {
        int i = 0;
        boolean flag = false;
        for (; i < as.length; i++)
        {
            if (as[i].equals("https://www.googleapis.com/auth/appstate"))
            {
                flag = true;
            }
        }

        com.google.android.gms.internal.do.a(flag, String.format("AppStateClient requires %s to function.", new Object[] {
            "https://www.googleapis.com/auth/appstate"
        }));
    }

    protected IInterface b(IBinder ibinder)
    {
        return a(ibinder);
    }

    protected String c()
    {
        return "com.google.android.gms.appstate.service.START";
    }

    protected String d()
    {
        return "com.google.android.gms.appstate.internal.IAppStateService";
    }
}
