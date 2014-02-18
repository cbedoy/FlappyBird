// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.a;

// Referenced classes of package com.google.android.gms.internal:
//            ct, cr, cx

public final class cw extends ct
{

    public final int a;
    public final Bundle c;
    public final IBinder d;
    final cr e;

    public cw(cr cr1, int i, IBinder ibinder, Bundle bundle)
    {
        e = cr1;
        super(cr1, Boolean.valueOf(true));
        a = i;
        d = ibinder;
        c = bundle;
    }

    protected void a()
    {
    }

    protected void a(Boolean boolean1)
    {
        if (boolean1 == null)
        {
            return;
        }
        switch (a)
        {
        default:
            RemoteException remoteexception;
            String s;
            PendingIntent pendingintent;
            if (c != null)
            {
                pendingintent = (PendingIntent)c.getParcelable("pendingIntent");
            } else
            {
                pendingintent = null;
            }
            if (cr.e(e) != null)
            {
                com.google.android.gms.internal.cx.a(cr.f(e)).b(e.c(), cr.e(e));
                com.google.android.gms.internal.cr.a(e, null);
            }
            com.google.android.gms.internal.cr.a(e, null);
            e.a(new a(a, pendingintent));
            return;

        case 0: // '\0'
            try
            {
                s = d.getInterfaceDescriptor();
                if (e.d().equals(s))
                {
                    com.google.android.gms.internal.cr.a(e, e.b(d));
                    if (cr.d(e) != null)
                    {
                        e.f();
                        return;
                    }
                }
            }
            // Misplaced declaration of an exception variable
            catch (RemoteException remoteexception) { }
            com.google.android.gms.internal.cx.a(cr.f(e)).b(e.c(), cr.e(e));
            com.google.android.gms.internal.cr.a(e, null);
            com.google.android.gms.internal.cr.a(e, null);
            e.a(new a(8, null));
            return;

        case 10: // '\n'
            throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
        }
    }

    protected volatile void a(Object obj)
    {
        a((Boolean)obj);
    }
}
