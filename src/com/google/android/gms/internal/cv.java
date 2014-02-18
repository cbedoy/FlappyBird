// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.internal:
//            cr

final class cv
    implements ServiceConnection
{

    final cr a;

    cv(cr cr1)
    {
        a = cr1;
        super();
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        a.c(ibinder);
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        cr.a(a, null);
        a.l();
    }
}
