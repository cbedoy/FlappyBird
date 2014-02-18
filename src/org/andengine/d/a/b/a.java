// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.d.a.b;

import java.util.ArrayList;

public abstract class a
{

    private final ArrayList a;
    private final int b;
    private final int c;
    private int d;

    public a()
    {
        this(0);
    }

    public a(int i)
    {
        this(i, 1);
    }

    public a(int i, int j)
    {
        this(i, j, 0x7fffffff);
    }

    public a(int i, int j, int k)
    {
        if (j <= 0)
        {
            throw new IllegalArgumentException("pGrowth must be greater than 0!");
        }
        if (k < 0)
        {
            throw new IllegalArgumentException("pAvailableItemsMaximum must be at least 0!");
        }
        b = j;
        c = k;
        a = new ArrayList(i);
        if (i > 0)
        {
            a(i);
        }
    }

    public void a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        int j;
        int k;
        arraylist = a;
        j = c;
        k = arraylist.size();
        int l = j - k;
        Exception exception;
        int i1;
        if (i >= l)
        {
            i = l;
        }
        i1 = i - 1;
        if (i1 < 0)
        {
            return;
        }
        arraylist.add(c());
        i1--;
        if (false)
        {
        } else
        {
            break MISSING_BLOCK_LABEL_37;
        }
        exception;
        throw exception;
    }

    protected void a(Object obj)
    {
    }

    protected abstract Object b();

    protected void b(Object obj)
    {
    }

    protected Object c()
    {
        return b();
    }

    public void c(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new IllegalArgumentException("Cannot recycle null item!");
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        a(obj);
        if (a.size() < c)
        {
            a.add(obj);
        }
        d = -1 + d;
        if (d < 0)
        {
            org.andengine.d.e.a.d("More items recycled than obtained!");
        }
        this;
        JVM INSTR monitorexit ;
    }

    public Object d()
    {
        this;
        JVM INSTR monitorenter ;
        if (a.size() <= 0) goto _L2; else goto _L1
_L1:
        Object obj = a.remove(-1 + a.size());
_L5:
        b(obj);
        d = 1 + d;
        this;
        JVM INSTR monitorexit ;
        return obj;
_L2:
        if (b != 1 && c != 0) goto _L4; else goto _L3
_L3:
        obj = c();
_L6:
        org.andengine.d.e.a.a((new StringBuilder(String.valueOf(getClass().getName()))).append("<").append(obj.getClass().getSimpleName()).append("> was exhausted, with ").append(d).append(" item not yet recycled. Allocated ").append(b).append(" more.").toString());
          goto _L5
        Exception exception;
        exception;
        throw exception;
_L4:
        Object obj1;
        a(b);
        obj1 = a.remove(-1 + a.size());
        obj = obj1;
          goto _L6
    }
}
