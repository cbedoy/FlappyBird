// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.internal:
//            dd, do, cr

public final class cu extends dd
{

    private cr a;

    public cu(cr cr1)
    {
        a = cr1;
    }

    public void a(int i, IBinder ibinder, Bundle bundle)
    {
        com.google.android.gms.internal.do.a("onPostInitComplete can be called only once per call to getServiceFromBroker", a);
        a.a(i, ibinder, bundle);
        a = null;
    }
}
