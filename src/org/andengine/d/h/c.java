// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.d.h;

import org.andengine.d.a.a.b;

// Referenced classes of package org.andengine.d.h:
//            a

public class c extends b
    implements org.andengine.b.b.c
{

    private final Object a;

    public boolean a(a a1)
    {
        if (a1 == null)
        {
            throw new IllegalArgumentException((new StringBuilder("Supplied ")).append(org/andengine/d/h/a.getSimpleName()).append(" must not be null.").toString());
        } else
        {
            return super.add(a1);
        }
    }

    public void a_(float f)
    {
        int i = size();
        if (i <= 0) goto _L2; else goto _L1
_L1:
        int j = i - 1;
_L5:
        if (j >= 0) goto _L3; else goto _L2
_L2:
        return;
_L3:
        a a1 = (a)get(j);
        a1.a(f, a);
        if (a1.a() && a1.b())
        {
            remove(j);
        }
        j--;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public boolean add(Object obj)
    {
        return a((a)obj);
    }
}
