// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;

import java.io.IOException;

// Referenced classes of package com.google.tagmanager.a:
//            am, aq, o, h

class ag
{

    private final am a;
    private final o b;
    private h c;
    private volatile am d;

    private void b()
    {
        if (d != null)
        {
            return;
        }
        this;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        try
        {
            if (c != null)
            {
                d = (am)a.c().c(c, b);
            }
        }
        catch (IOException ioexception) { }
        this;
        JVM INSTR monitorexit ;
    }

    public am a()
    {
        b();
        return d;
    }

    public boolean equals(Object obj)
    {
        b();
        return d.equals(obj);
    }

    public int hashCode()
    {
        b();
        return d.hashCode();
    }

    public String toString()
    {
        b();
        return d.toString();
    }
}
