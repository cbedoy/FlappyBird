// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.d.h;

import java.util.Comparator;

// Referenced classes of package org.andengine.d.h:
//            a

class b
    implements Comparator
{

    b()
    {
    }

    public int a(a a1, a a2)
    {
        float f = a1.c();
        float f1 = a2.c();
        if (f < f1)
        {
            return 1;
        }
        return f <= f1 ? 0 : -1;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((a)obj, (a)obj1);
    }
}
