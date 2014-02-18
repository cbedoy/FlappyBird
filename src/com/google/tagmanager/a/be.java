// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;

import java.util.AbstractSet;
import java.util.Iterator;

// Referenced classes of package com.google.tagmanager.a:
//            ax, bd, ay

class be extends AbstractSet
{

    final ax a;

    private be(ax ax1)
    {
        a = ax1;
        super();
    }

    be(ax ax1, ay ay)
    {
        this(ax1);
    }

    public boolean a(java.util.Map.Entry entry)
    {
        if (!contains(entry))
        {
            a.a((Comparable)entry.getKey(), entry.getValue());
            return true;
        } else
        {
            return false;
        }
    }

    public boolean add(Object obj)
    {
        return a((java.util.Map.Entry)obj);
    }

    public void clear()
    {
        a.clear();
    }

    public boolean contains(Object obj)
    {
        java.util.Map.Entry entry = (java.util.Map.Entry)obj;
        Object obj1 = a.get(entry.getKey());
        Object obj2 = entry.getValue();
        return obj1 == obj2 || obj1 != null && obj1.equals(obj2);
    }

    public Iterator iterator()
    {
        return new bd(a, null);
    }

    public boolean remove(Object obj)
    {
        java.util.Map.Entry entry = (java.util.Map.Entry)obj;
        if (contains(entry))
        {
            a.remove(entry.getKey());
            return true;
        } else
        {
            return false;
        }
    }

    public int size()
    {
        return a.size();
    }
}
