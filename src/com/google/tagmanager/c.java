// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager;

import com.google.analytics.a.a.q;

// Referenced classes of package com.google.tagmanager:
//            r, w, i, b, 
//            d, o

public class c
{

    private final r a;
    private d b;
    private o c;
    private b d;
    private volatile String e;
    private volatile q f;
    private volatile long g;
    private volatile int h;

    private boolean b(long l)
    {
        if (g == 0L)
        {
            h = -1 + h;
            return true;
        }
        long l1 = l - g;
        if (l1 < 5000L)
        {
            return false;
        }
        if (h < 30)
        {
            h = Math.min(30, (int)Math.floor(l1 / 0xdbba0L) + h);
        }
        if (h > 0)
        {
            h = -1 + h;
            return true;
        } else
        {
            return false;
        }
    }

    private o c()
    {
        this;
        JVM INSTR monitorenter ;
        o o = c;
        this;
        JVM INSTR monitorexit ;
        return o;
        Exception exception;
        exception;
        throw exception;
    }

    private boolean d()
    {
        return a.a() == w.b;
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (c() != null) goto _L2; else goto _L1
_L1:
        i.b("refresh called for closed container");
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!d())
        {
            break MISSING_BLOCK_LABEL_66;
        }
        i.b("Container is in DEFAULT_CONTAINER mode. Refresh request is ignored.");
          goto _L3
        Exception exception1;
        exception1;
        i.a((new StringBuilder()).append("Calling refresh() throws an exception: ").append(exception1.getMessage()).toString());
          goto _L3
        Exception exception;
        exception;
        throw exception;
label0:
        {
            long l = d.a();
            if (!b(l))
            {
                break label0;
            }
            i.d("Container refresh requested");
            a(0L);
            g = l;
        }
          goto _L3
        i.d("Container refresh was called too often. Ignored.");
          goto _L3
    }

    void a(long l)
    {
        this;
        JVM INSTR monitorenter ;
        if (b == null || d()) goto _L2; else goto _L1
_L1:
        if (f != null) goto _L4; else goto _L3
_L3:
        String s = null;
_L6:
        b.a(l, s);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        String s1 = f.C();
        s = s1;
        if (true) goto _L6; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        e = s;
        if (b != null)
        {
            b.a(s);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    String b()
    {
        return e;
    }
}
