// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.b;

import java.util.ArrayList;
import org.andengine.d.e.a;

// Referenced classes of package org.andengine.opengl.b:
//            b, d, f, a, 
//            e, c, g

public class h
{

    private final ArrayList a = new ArrayList();

    public h()
    {
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        a(((g) (org.andengine.opengl.b.b.a())));
        a(((g) (org.andengine.opengl.b.d.a())));
        a(((g) (org.andengine.opengl.b.f.a())));
        a(((g) (org.andengine.opengl.b.a.a())));
        a(((g) (org.andengine.opengl.b.e.a())));
        a(((g) (org.andengine.opengl.b.c.a())));
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(g g1)
    {
        this;
        JVM INSTR monitorenter ;
        if (g1 != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new IllegalArgumentException("pShaderProgram must not be null!");
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (g1.b())
        {
            org.andengine.d.e.a.c((new StringBuilder("Loading an already compiled ")).append(org/andengine/opengl/b/g.getSimpleName()).append(": '").append(g1.getClass().getSimpleName()).append("'. '").append(g1.getClass().getSimpleName()).append("' will be recompiled.").toString());
            g1.a(false);
        }
        if (!a.contains(g1))
        {
            break MISSING_BLOCK_LABEL_148;
        }
        org.andengine.d.e.a.c((new StringBuilder("Loading an already loaded ")).append(org/andengine/opengl/b/g.getSimpleName()).append(": '").append(g1.getClass().getSimpleName()).append("'.").toString());
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        a.add(g1);
          goto _L1
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
        ((g)arraylist.get(i)).a(false);
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
        ((g)arraylist.get(j)).a(false);
        j--;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        throw exception;
    }
}
