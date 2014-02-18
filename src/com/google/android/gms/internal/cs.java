// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.a;
import com.google.android.gms.common.c;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            cr, ct

final class cs extends Handler
{

    final cr a;

    public cs(cr cr1, Looper looper)
    {
        a = cr1;
        super(looper);
    }

    public void handleMessage(Message message)
    {
        if (message.what == 1 && !a.i())
        {
            ct ct2 = (ct)message.obj;
            ct2.a();
            ct2.c();
            return;
        }
        synchronized (com.google.android.gms.internal.cr.a(a))
        {
            a.d = false;
        }
        if (message.what == 3)
        {
            a.a(new a(((Integer)message.obj).intValue(), null));
            return;
        }
        break MISSING_BLOCK_LABEL_97;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (message.what == 4)
        {
            synchronized (cr.b(a))
            {
                if (a.c && a.h() && cr.b(a).contains(message.obj))
                {
                    ((c)message.obj).a(a.e());
                }
            }
            return;
        } else
        {
            if (message.what == 2 && !a.h())
            {
                ct ct1 = (ct)message.obj;
                ct1.a();
                ct1.c();
                return;
            }
            if (message.what == 2 || message.what == 1)
            {
                ((ct)message.obj).b();
                return;
            } else
            {
                Log.wtf("GmsClient", "Don't know how to handle this message.");
                return;
            }
        }
        exception1;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception1;
    }
}
