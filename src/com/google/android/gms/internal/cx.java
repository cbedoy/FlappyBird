// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.internal:
//            cy, cv

public final class cx
    implements android.os.Handler.Callback
{

    private static final Object a = new Object();
    private static cx b;
    private final Context c;
    private final HashMap d = new HashMap();
    private final Handler e;

    private cx(Context context)
    {
        e = new Handler(context.getMainLooper(), this);
        c = context.getApplicationContext();
    }

    public static cx a(Context context)
    {
        synchronized (a)
        {
            if (b == null)
            {
                b = new cx(context.getApplicationContext());
            }
        }
        return b;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static HashMap a(cx cx1)
    {
        return cx1.d;
    }

    public boolean a(String s, cv cv1)
    {
        HashMap hashmap = d;
        hashmap;
        JVM INSTR monitorenter ;
        cy cy1 = (cy)d.get(s);
        if (cy1 != null) goto _L2; else goto _L1
_L1:
        cy1 = new cy(this, s);
        cy1.a(cv1);
        Intent intent = (new Intent(s)).setPackage("com.google.android.gms");
        cy1.a(c.bindService(intent, cy1.a(), 129));
        d.put(s, cy1);
_L7:
        boolean flag = cy1.c();
        hashmap;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        e.removeMessages(0, cy1);
        if (cy1.c(cv1))
        {
            throw new IllegalStateException((new StringBuilder()).append("Trying to bind a GmsServiceConnection that was already connected before.  startServiceAction=").append(s).toString());
        }
        break MISSING_BLOCK_LABEL_155;
        Exception exception;
        exception;
        hashmap;
        JVM INSTR monitorexit ;
        throw exception;
        cy1.a(cv1);
        cy1.d();
        JVM INSTR tableswitch 1 2: default 245
    //                   1 188
    //                   2 205;
           goto _L3 _L4 _L5
_L3:
        if (true) goto _L7; else goto _L6
_L6:
_L4:
        cv1.onServiceConnected(cy1.g(), cy1.f());
          goto _L7
_L5:
        Intent intent1 = (new Intent(s)).setPackage("com.google.android.gms");
        cy1.a(c.bindService(intent1, cy1.a(), 129));
          goto _L7
    }

    public void b(String s, cv cv1)
    {
        HashMap hashmap = d;
        hashmap;
        JVM INSTR monitorenter ;
        cy cy1 = (cy)d.get(s);
        if (cy1 != null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        throw new IllegalStateException((new StringBuilder()).append("Nonexistent connection status for service action: ").append(s).toString());
        Exception exception;
        exception;
        hashmap;
        JVM INSTR monitorexit ;
        throw exception;
        if (!cy1.c(cv1))
        {
            throw new IllegalStateException((new StringBuilder()).append("Trying to unbind a GmsServiceConnection  that was not bound before.  startServiceAction=").append(s).toString());
        }
        cy1.b(cv1);
        if (cy1.e())
        {
            Message message = e.obtainMessage(0, cy1);
            e.sendMessageDelayed(message, 5000L);
        }
        hashmap;
        JVM INSTR monitorexit ;
    }

    public boolean handleMessage(Message message)
    {
        cy cy1;
        switch (message.what)
        {
        default:
            return false;

        case 0: // '\0'
            cy1 = (cy)message.obj;
            break;
        }
        synchronized (d)
        {
            if (cy1.e())
            {
                c.unbindService(cy1.a());
                d.remove(cy1.b());
            }
        }
        return true;
        exception;
        hashmap;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
