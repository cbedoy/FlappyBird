// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.c;

import java.util.Comparator;

// Referenced classes of package org.andengine.c:
//            c, d

class e
    implements Comparator
{

    final d a;

    e(d d)
    {
        a = d;
        super();
    }

    public int a(c c1, c c2)
    {
        return c1.f() - c2.f();
    }

    public int compare(Object obj, Object obj1)
    {
        return a((c)obj, (c)obj1);
    }
}
