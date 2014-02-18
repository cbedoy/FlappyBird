// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.util;

import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.google.ads.util:
//            g, ac

public abstract class aa
{

    private static final Object a = new Object();
    private static int b = 0;
    private static HashMap c = new HashMap();
    private final ArrayList d;
    public final int u;

    public aa()
    {
        d = new ArrayList();
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        Integer integer;
        int i = b;
        b = i + 1;
        u = i;
        integer = (Integer)c.get(getClass());
        if (integer != null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        c.put(getClass(), Integer.valueOf(1));
_L1:
        obj;
        JVM INSTR monitorexit ;
        g.d((new StringBuilder()).append("State created: ").append(toString()).toString());
        return;
        c.put(getClass(), Integer.valueOf(1 + integer.intValue()));
          goto _L1
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static void a(aa aa1, ac ac)
    {
        aa1.a(ac);
    }

    private void a(ac ac)
    {
        d.add(ac);
    }

    protected void finalize()
    {
        synchronized (a)
        {
            c.put(getClass(), Integer.valueOf(-1 + ((Integer)c.get(getClass())).intValue()));
        }
        super.finalize();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append("[").append(u).append("]").toString();
    }

}
