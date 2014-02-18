// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            do, dm

public final class dn
{

    private final List a;
    private final Object b;

    private dn(Object obj)
    {
        b = com.google.android.gms.internal.do.a(obj);
        a = new ArrayList();
    }

    dn(Object obj, dm dm)
    {
        this(obj);
    }

    public dn a(String s, Object obj)
    {
        a.add((new StringBuilder()).append((String)com.google.android.gms.internal.do.a(s)).append("=").append(String.valueOf(obj)).toString());
        return this;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder(100)).append(b.getClass().getSimpleName()).append('{');
        int i = a.size();
        for (int j = 0; j < i; j++)
        {
            stringbuilder.append((String)a.get(j));
            if (j < i - 1)
            {
                stringbuilder.append(", ");
            }
        }

        return stringbuilder.append('}').toString();
    }
}
