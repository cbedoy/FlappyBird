// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.c;

import java.util.Comparator;
import java.util.List;
import org.andengine.d.b.b.a;

// Referenced classes of package org.andengine.c:
//            e

public class d extends a
{

    private static d a;
    private final Comparator b = new e(this);

    private d()
    {
    }

    public static d a()
    {
        if (a == null)
        {
            a = new d();
        }
        return a;
    }

    public void a(List list)
    {
        a(list, b);
    }
}
