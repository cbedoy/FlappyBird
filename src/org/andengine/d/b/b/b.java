// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.d.b.b;

import java.util.Comparator;
import java.util.List;

public abstract class b
{

    public b()
    {
    }

    public abstract void a(List list, int i, int j, Comparator comparator);

    public final void a(List list, Comparator comparator)
    {
        a(list, 0, list.size(), comparator);
    }
}
