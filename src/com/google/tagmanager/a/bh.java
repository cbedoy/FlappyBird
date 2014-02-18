// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;

import java.util.ListIterator;

// Referenced classes of package com.google.tagmanager.a:
//            bg, ai

class bh
    implements ListIterator
{

    ListIterator a;
    final int b;
    final bg c;

    bh(bg bg1, int i)
    {
        c = bg1;
        b = i;
        super();
        a = bg.a(c).listIterator(b);
    }

    public String a()
    {
        return (String)a.next();
    }

    public void a(String s)
    {
        throw new UnsupportedOperationException();
    }

    public void add(Object obj)
    {
        b((String)obj);
    }

    public String b()
    {
        return (String)a.previous();
    }

    public void b(String s)
    {
        throw new UnsupportedOperationException();
    }

    public boolean hasNext()
    {
        return a.hasNext();
    }

    public boolean hasPrevious()
    {
        return a.hasPrevious();
    }

    public Object next()
    {
        return a();
    }

    public int nextIndex()
    {
        return a.nextIndex();
    }

    public Object previous()
    {
        return b();
    }

    public int previousIndex()
    {
        return a.previousIndex();
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }

    public void set(Object obj)
    {
        a((String)obj);
    }
}
