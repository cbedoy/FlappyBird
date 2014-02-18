// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

// Referenced classes of package com.google.tagmanager.a:
//            ai, bi, bh, h

public class bg extends AbstractList
    implements ai, RandomAccess
{

    private final ai a;

    public bg(ai ai1)
    {
        a = ai1;
    }

    static ai a(bg bg1)
    {
        return bg1.a;
    }

    public String a(int i)
    {
        return (String)a.get(i);
    }

    public List a()
    {
        return a.a();
    }

    public void a(h h)
    {
        throw new UnsupportedOperationException();
    }

    public Object get(int i)
    {
        return a(i);
    }

    public Iterator iterator()
    {
        return new bi(this);
    }

    public ListIterator listIterator(int i)
    {
        return new bh(this, i);
    }

    public int size()
    {
        return a.size();
    }
}
