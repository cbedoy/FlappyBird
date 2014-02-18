// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

// Referenced classes of package com.google.tagmanager.a:
//            ai, bg, h, ac

public class ah extends AbstractList
    implements ai, RandomAccess
{

    public static final ai a = new bg(new ah());
    private final List b;

    public ah()
    {
        b = new ArrayList();
    }

    public ah(ai ai1)
    {
        b = new ArrayList(ai1.size());
        addAll(ai1);
    }

    private static String a(Object obj)
    {
        if (obj instanceof String)
        {
            return (String)obj;
        }
        if (obj instanceof h)
        {
            return ((h)obj).f();
        } else
        {
            return ac.b((byte[])(byte[])obj);
        }
    }

    public String a(int i)
    {
        Object obj = b.get(i);
        if (obj instanceof String)
        {
            return (String)obj;
        }
        if (obj instanceof h)
        {
            h h1 = (h)obj;
            String s1 = h1.f();
            if (h1.g())
            {
                b.set(i, s1);
            }
            return s1;
        }
        byte abyte0[] = (byte[])(byte[])obj;
        String s = ac.b(abyte0);
        if (ac.a(abyte0))
        {
            b.set(i, s);
        }
        return s;
    }

    public String a(int i, String s)
    {
        return a(b.set(i, s));
    }

    public List a()
    {
        return Collections.unmodifiableList(b);
    }

    public void a(h h1)
    {
        b.add(h1);
        modCount = 1 + modCount;
    }

    public void add(int i, Object obj)
    {
        b(i, (String)obj);
    }

    public boolean addAll(int i, Collection collection)
    {
        if (collection instanceof ai)
        {
            collection = ((ai)collection).a();
        }
        boolean flag = b.addAll(i, collection);
        modCount = 1 + modCount;
        return flag;
    }

    public boolean addAll(Collection collection)
    {
        return addAll(size(), collection);
    }

    public String b(int i)
    {
        Object obj = b.remove(i);
        modCount = 1 + modCount;
        return a(obj);
    }

    public void b(int i, String s)
    {
        b.add(i, s);
        modCount = 1 + modCount;
    }

    public void clear()
    {
        b.clear();
        modCount = 1 + modCount;
    }

    public Object get(int i)
    {
        return a(i);
    }

    public Object remove(int i)
    {
        return b(i);
    }

    public Object set(int i, Object obj)
    {
        return a(i, (String)obj);
    }

    public int size()
    {
        return b.size();
    }

}
