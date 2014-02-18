// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.d;

import java.util.ArrayList;

// Referenced classes of package org.andengine.opengl.d:
//            c

public class e
{

    private final ArrayList a = new ArrayList();
    private final ArrayList b = new ArrayList();

    public e()
    {
    }

    public void a()
    {
    }

    public void a(c c1)
    {
        this;
        JVM INSTR monitorenter ;
        a.add(c1);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(org.andengine.opengl.util.e e1)
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        ArrayList arraylist1;
        int i;
        arraylist = a;
        arraylist1 = b;
        i = arraylist1.size();
        int j = i - 1;
_L2:
        if (j < 0)
        {
            return;
        }
        c c1 = (c)arraylist1.remove(j);
        if (c1.d())
        {
            c1.a(e1);
        }
        arraylist.remove(c1);
        j--;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        throw exception;
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        int i;
        arraylist = a;
        i = -1 + arraylist.size();
_L2:
        if (i >= 0)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        arraylist.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        ((c)arraylist.get(i)).e();
        i--;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        throw exception;
    }

    public void b(c c1)
    {
        this;
        JVM INSTR monitorenter ;
        if (a.remove(c1))
        {
            b.add(c1);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        int i;
        arraylist = a;
        i = -1 + arraylist.size();
_L2:
        if (i >= 0)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        arraylist.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        ((c)arraylist.get(i)).e();
        i--;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        throw exception;
    }
}
