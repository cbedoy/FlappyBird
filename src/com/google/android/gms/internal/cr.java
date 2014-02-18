// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.a;
import com.google.android.gms.common.b;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import com.google.android.gms.common.f;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            do, cs, cx, cv, 
//            cw, ct, dg, cu, 
//            df

public abstract class cr
    implements b
{

    public static final String e[] = {
        "service_esmobile", "service_googleme"
    };
    final Handler a;
    final ArrayList b = new ArrayList();
    boolean c;
    boolean d;
    private final Context f;
    private IInterface g;
    private ArrayList h;
    private boolean i;
    private ArrayList j;
    private boolean k;
    private final ArrayList l = new ArrayList();
    private cv m;
    private final String n[];
    private final Object o = new Object();

    protected transient cr(Context context, c c1, d d1, String as[])
    {
        i = false;
        k = false;
        c = false;
        d = false;
        f = (Context)com.google.android.gms.internal.do.a(context);
        h = new ArrayList();
        h.add(com.google.android.gms.internal.do.a(c1));
        j = new ArrayList();
        j.add(com.google.android.gms.internal.do.a(d1));
        a = new cs(this, context.getMainLooper());
        a(as);
        n = as;
    }

    static IInterface a(cr cr1, IInterface iinterface)
    {
        cr1.g = iinterface;
        return iinterface;
    }

    static cv a(cr cr1, cv cv1)
    {
        cr1.m = cv1;
        return cv1;
    }

    static Object a(cr cr1)
    {
        return cr1.o;
    }

    static ArrayList b(cr cr1)
    {
        return cr1.h;
    }

    static ArrayList c(cr cr1)
    {
        return cr1.l;
    }

    static IInterface d(cr cr1)
    {
        return cr1.g;
    }

    static cv e(cr cr1)
    {
        return cr1.m;
    }

    static Context f(cr cr1)
    {
        return cr1.f;
    }

    public void a()
    {
        c = true;
        synchronized (o)
        {
            d = true;
        }
        int i1 = com.google.android.gms.common.f.a(f);
        if (i1 != 0)
        {
            a.sendMessage(a.obtainMessage(3, Integer.valueOf(i1)));
        } else
        {
            if (m != null)
            {
                Log.e("GmsClient", "Calling connect() while still connected, missing disconnect().");
                g = null;
                com.google.android.gms.internal.cx.a(f).b(c(), m);
            }
            m = new cv(this);
            if (!com.google.android.gms.internal.cx.a(f).a(c(), m))
            {
                Log.e("GmsClient", (new StringBuilder()).append("unable to connect to service: ").append(c()).toString());
                a.sendMessage(a.obtainMessage(3, Integer.valueOf(9)));
                return;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void a(int i1, IBinder ibinder, Bundle bundle)
    {
        a.sendMessage(a.obtainMessage(1, new cw(this, i1, ibinder, bundle)));
    }

    protected void a(a a1)
    {
        a.removeMessages(4);
        ArrayList arraylist = j;
        arraylist;
        JVM INSTR monitorenter ;
        ArrayList arraylist1;
        int i1;
        k = true;
        arraylist1 = j;
        i1 = arraylist1.size();
        int j1 = 0;
_L2:
        if (j1 >= i1)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        if (c)
        {
            break MISSING_BLOCK_LABEL_53;
        }
        arraylist;
        JVM INSTR monitorexit ;
        return;
        if (j.contains(arraylist1.get(j1)))
        {
            ((d)arraylist1.get(j1)).a(a1);
        }
        break MISSING_BLOCK_LABEL_102;
        k = false;
        arraylist;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
        j1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a(ct ct1)
    {
        synchronized (l)
        {
            l.add(ct1);
        }
        a.sendMessage(a.obtainMessage(2, ct1));
        return;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected abstract void a(df df, cu cu1);

    protected transient void a(String as[])
    {
    }

    protected abstract IInterface b(IBinder ibinder);

    public void b()
    {
        c = false;
        synchronized (o)
        {
            d = false;
        }
        ArrayList arraylist = l;
        arraylist;
        JVM INSTR monitorenter ;
        int i1 = l.size();
        int j1 = 0;
_L2:
        if (j1 >= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        ((ct)l.get(j1)).d();
        j1++;
        if (true) goto _L2; else goto _L1
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L1:
        l.clear();
        arraylist;
        JVM INSTR monitorexit ;
        g = null;
        if (m != null)
        {
            com.google.android.gms.internal.cx.a(f).b(c(), m);
            m = null;
        }
        return;
        Exception exception1;
        exception1;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    protected abstract String c();

    protected final void c(IBinder ibinder)
    {
        try
        {
            a(com.google.android.gms.internal.dg.a(ibinder), new cu(this));
            return;
        }
        catch (RemoteException remoteexception)
        {
            Log.w("GmsClient", "service died");
        }
    }

    protected abstract String d();

    protected Bundle e()
    {
        return null;
    }

    protected void f()
    {
        boolean flag = true;
        ArrayList arraylist = h;
        arraylist;
        JVM INSTR monitorenter ;
        Exception exception;
        boolean flag1;
        Bundle bundle;
        ArrayList arraylist1;
        int i1;
        int j1;
        if (!i)
        {
            flag1 = flag;
        } else
        {
            flag1 = false;
        }
        com.google.android.gms.internal.do.a(flag1);
        a.removeMessages(4);
        i = true;
        if (b.size() != 0)
        {
            flag = false;
        }
        com.google.android.gms.internal.do.a(flag);
        bundle = e();
        arraylist1 = h;
        i1 = arraylist1.size();
        j1 = 0;
_L2:
        if (j1 >= i1)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        if (c && h())
        {
            break MISSING_BLOCK_LABEL_109;
        }
        b.clear();
        i = false;
        arraylist;
        JVM INSTR monitorexit ;
        return;
        b.size();
        if (!b.contains(arraylist1.get(j1)))
        {
            ((c)arraylist1.get(j1)).a(bundle);
        }
        break MISSING_BLOCK_LABEL_170;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
        j1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean h()
    {
        return g != null;
    }

    public boolean i()
    {
        boolean flag;
        synchronized (o)
        {
            flag = d;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Context j()
    {
        return f;
    }

    public final String[] k()
    {
        return n;
    }

    protected final void l()
    {
        a.removeMessages(4);
        ArrayList arraylist = h;
        arraylist;
        JVM INSTR monitorenter ;
        ArrayList arraylist1;
        int i1;
        i = true;
        arraylist1 = h;
        i1 = arraylist1.size();
        int j1 = 0;
_L2:
        if (j1 >= i1)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        if (c)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        i = false;
        arraylist;
        JVM INSTR monitorexit ;
        return;
        if (h.contains(arraylist1.get(j1)))
        {
            ((c)arraylist1.get(j1)).a();
        }
        break MISSING_BLOCK_LABEL_94;
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
        j1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected final void m()
    {
        if (!h())
        {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        } else
        {
            return;
        }
    }

    protected final IInterface n()
    {
        m();
        return g;
    }

}
