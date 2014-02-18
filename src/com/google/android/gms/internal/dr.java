// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class dr
{

    private final LinkedHashMap a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;

    private int c(Object obj, Object obj1)
    {
        int i = a(obj, obj1);
        if (i < 0)
        {
            throw new IllegalStateException((new StringBuilder()).append("Negative size: ").append(obj).append("=").append(obj1).toString());
        } else
        {
            return i;
        }
    }

    protected int a(Object obj, Object obj1)
    {
        return 1;
    }

    public final void a()
    {
        a(-1);
    }

    public void a(int i)
    {
_L2:
        this;
        JVM INSTR monitorenter ;
        if (b < 0 || a.isEmpty() && b != 0)
        {
            throw new IllegalStateException((new StringBuilder()).append(getClass().getName()).append(".sizeOf() is reporting inconsistent results!").toString());
        }
        break MISSING_BLOCK_LABEL_64;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (b > i && !a.isEmpty())
        {
            break MISSING_BLOCK_LABEL_85;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        Object obj1;
        java.util.Map.Entry entry = (java.util.Map.Entry)a.entrySet().iterator().next();
        obj = entry.getKey();
        obj1 = entry.getValue();
        a.remove(obj);
        b = b - c(obj, obj1);
        e = 1 + e;
        this;
        JVM INSTR monitorexit ;
        a(true, obj, obj1, null);
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected void a(boolean flag, Object obj, Object obj1, Object obj2)
    {
    }

    public final Object b(Object obj, Object obj1)
    {
        if (obj == null || obj1 == null)
        {
            throw new NullPointerException("key == null || value == null");
        }
        this;
        JVM INSTR monitorenter ;
        Object obj2;
        d = 1 + d;
        b = b + c(obj, obj1);
        obj2 = a.put(obj, obj1);
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        b = b - c(obj, obj2);
        this;
        JVM INSTR monitorexit ;
        if (obj2 != null)
        {
            a(false, obj, obj2, obj1);
        }
        a(c);
        return obj2;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final String toString()
    {
        this;
        JVM INSTR monitorenter ;
        int i = f + g;
        int j;
        j = 0;
        if (i == 0)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        j = (100 * f) / i;
        String s;
        Object aobj[] = new Object[4];
        aobj[0] = Integer.valueOf(c);
        aobj[1] = Integer.valueOf(f);
        aobj[2] = Integer.valueOf(g);
        aobj[3] = Integer.valueOf(j);
        s = String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", aobj);
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }
}
