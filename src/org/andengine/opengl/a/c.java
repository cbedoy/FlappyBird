// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.a;

import java.util.ArrayList;
import org.andengine.opengl.util.e;

// Referenced classes of package org.andengine.opengl.a:
//            a

public class c
{

    private final ArrayList a = new ArrayList();

    public c()
    {
    }

    public void a()
    {
    }

    public void a(e e)
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        int i;
        arraylist = a;
        i = arraylist.size();
        if (i <= 0) goto _L2; else goto _L1
_L1:
        int j = i - 1;
_L5:
        if (j >= 0) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        ((a)arraylist.get(j)).a(e);
        j--;
        if (true) goto _L5; else goto _L4
_L4:
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
            break MISSING_BLOCK_LABEL_28;
        }
        a.clear();
        this;
        JVM INSTR monitorexit ;
        return;
        ((a)arraylist.get(i)).b();
        i--;
        if (true) goto _L2; else goto _L1
_L1:
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
        i = arraylist.size();
        int j = i - 1;
_L2:
        if (j < 0)
        {
            return;
        }
        ((a)arraylist.get(j)).b();
        j--;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        throw exception;
    }
}
