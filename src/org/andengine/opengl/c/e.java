// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.c;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.andengine.d.e.a;

// Referenced classes of package org.andengine.opengl.c:
//            g, a

public class e
{

    private final HashSet a = new HashSet();
    private final HashMap b = new HashMap();
    private final ArrayList c = new ArrayList();
    private final ArrayList d = new ArrayList();
    private final ArrayList e = new ArrayList();
    private g f;

    public e()
    {
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        f = new g();
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
        HashSet hashset;
        ArrayList arraylist;
        ArrayList arraylist1;
        ArrayList arraylist2;
        int i;
        hashset = a;
        arraylist = c;
        arraylist1 = d;
        arraylist2 = e;
        i = -1 + arraylist.size();
_L9:
        if (i >= 0) goto _L2; else goto _L1
_L1:
        int j = arraylist1.size();
        if (j <= 0) goto _L4; else goto _L3
_L3:
        int i1 = j - 1;
          goto _L5
_L4:
        int k = arraylist2.size();
        if (k <= 0) goto _L7; else goto _L6
_L6:
        int l = k - 1;
          goto _L8
_L14:
        System.gc();
_L15:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        org.andengine.opengl.c.a a3;
        boolean flag1;
        a3 = (org.andengine.opengl.c.a)arraylist.get(i);
        flag1 = a3.e();
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        a3.c(e1);
_L10:
        i--;
          goto _L9
        IOException ioexception1;
        ioexception1;
        org.andengine.d.e.a.a(ioexception1);
          goto _L10
        Exception exception;
        exception;
        throw exception;
_L12:
        org.andengine.opengl.c.a a2;
        boolean flag;
        a2 = (org.andengine.opengl.c.a)arraylist1.remove(i1);
        flag = a2.c();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        a2.a(e1);
        f.a(e1, a2);
_L11:
        arraylist.add(a2);
        i1--;
        continue; /* Loop/switch isn't completed */
        IOException ioexception;
        ioexception;
        org.andengine.d.e.a.a(ioexception);
          goto _L11
_L13:
        org.andengine.opengl.c.a a1 = (org.andengine.opengl.c.a)arraylist2.remove(l);
        if (a1.c())
        {
            a1.b(e1);
        }
        arraylist.remove(a1);
        hashset.remove(a1);
        l--;
        continue; /* Loop/switch isn't completed */
_L5:
        if (i1 >= 0) goto _L12; else goto _L4
_L8:
        if (l >= 0) goto _L13; else goto _L7
_L7:
        if (j <= 0 && k <= 0) goto _L15; else goto _L14
    }

    public boolean a(org.andengine.opengl.c.a a1)
    {
        this;
        JVM INSTR monitorenter ;
        if (a1 != null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        throw new IllegalArgumentException("pTexture must not be null!");
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (!a.contains(a1)) goto _L2; else goto _L1
_L1:
        e.remove(a1);
        boolean flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        a.add(a1);
        d.add(a1);
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        HashSet hashset = a;
        if (hashset.isEmpty()) goto _L2; else goto _L1
_L1:
        Iterator iterator = hashset.iterator();
_L3:
        if (iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_98;
        }
_L2:
        if (!c.isEmpty())
        {
            d.addAll(c);
            c.clear();
        }
        if (!e.isEmpty())
        {
            a.removeAll(e);
            e.clear();
        }
        f.e();
        this;
        JVM INSTR monitorexit ;
        return;
        ((org.andengine.opengl.c.a)iterator.next()).d();
          goto _L3
        Exception exception;
        exception;
        throw exception;
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = a.iterator();
_L1:
        if (iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_62;
        }
        d.clear();
        c.clear();
        a.clear();
        b.clear();
        f.n();
        f = null;
        this;
        JVM INSTR monitorexit ;
        return;
        ((org.andengine.opengl.c.a)iterator.next()).d();
          goto _L1
        Exception exception;
        exception;
        throw exception;
    }
}
