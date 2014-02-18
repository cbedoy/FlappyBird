// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

// Referenced classes of package com.google.tagmanager.a:
//            bc, ay, az, be

class ax extends AbstractMap
{

    private final int a;
    private List b;
    private Map c;
    private boolean d;
    private volatile be e;

    private ax(int i)
    {
        a = i;
        b = Collections.emptyList();
        c = Collections.emptyMap();
    }

    ax(int i, ay ay1)
    {
        this(i);
    }

    private int a(Comparable comparable)
    {
        int i = -1 + b.size();
        int j = 0;
        if (i >= 0)
        {
            int i2 = comparable.compareTo(((bc)b.get(i)).a());
            if (i2 > 0)
            {
                return -(i + 2);
            }
            j = 0;
            if (i2 == 0)
            {
                return i;
            }
        }
        while (j <= i) 
        {
            int k = (j + i) / 2;
            int l = comparable.compareTo(((bc)b.get(k)).a());
            int k1;
            int l1;
            if (l < 0)
            {
                l1 = k - 1;
                k1 = j;
            } else
            if (l > 0)
            {
                int i1 = k + 1;
                int j1 = i;
                k1 = i1;
                l1 = j1;
            } else
            {
                return k;
            }
            j = k1;
            i = l1;
        }
        return -(j + 1);
    }

    static ax a(int i)
    {
        return new ay(i);
    }

    static Object a(ax ax1, int i)
    {
        return ax1.c(i);
    }

    static void a(ax ax1)
    {
        ax1.e();
    }

    static List b(ax ax1)
    {
        return ax1.b;
    }

    private Object c(int i)
    {
        e();
        Object obj = ((bc)b.remove(i)).getValue();
        if (!c.isEmpty())
        {
            Iterator iterator = f().entrySet().iterator();
            b.add(new bc(this, (java.util.Map.Entry)iterator.next()));
            iterator.remove();
        }
        return obj;
    }

    static Map c(ax ax1)
    {
        return ax1.c;
    }

    private void e()
    {
        if (d)
        {
            throw new UnsupportedOperationException();
        } else
        {
            return;
        }
    }

    private SortedMap f()
    {
        e();
        if (c.isEmpty() && !(c instanceof TreeMap))
        {
            c = new TreeMap();
        }
        return (SortedMap)c;
    }

    private void g()
    {
        e();
        if (b.isEmpty() && !(b instanceof ArrayList))
        {
            b = new ArrayList(a);
        }
    }

    public Object a(Comparable comparable, Object obj)
    {
        e();
        int i = a(comparable);
        if (i >= 0)
        {
            return ((bc)b.get(i)).setValue(obj);
        }
        g();
        int j = -(i + 1);
        if (j >= a)
        {
            return f().put(comparable, obj);
        }
        if (b.size() == a)
        {
            bc bc1 = (bc)b.remove(-1 + a);
            f().put(bc1.a(), bc1.getValue());
        }
        b.add(j, new bc(this, comparable, obj));
        return null;
    }

    public void a()
    {
        if (!d)
        {
            Map map;
            if (c.isEmpty())
            {
                map = Collections.emptyMap();
            } else
            {
                map = Collections.unmodifiableMap(c);
            }
            c = map;
            d = true;
        }
    }

    public java.util.Map.Entry b(int i)
    {
        return (java.util.Map.Entry)b.get(i);
    }

    public boolean b()
    {
        return d;
    }

    public int c()
    {
        return b.size();
    }

    public void clear()
    {
        e();
        if (!b.isEmpty())
        {
            b.clear();
        }
        if (!c.isEmpty())
        {
            c.clear();
        }
    }

    public boolean containsKey(Object obj)
    {
        Comparable comparable = (Comparable)obj;
        return a(comparable) >= 0 || c.containsKey(comparable);
    }

    public Iterable d()
    {
        if (c.isEmpty())
        {
            return az.a();
        } else
        {
            return c.entrySet();
        }
    }

    public Set entrySet()
    {
        if (e == null)
        {
            e = new be(this, null);
        }
        return e;
    }

    public Object get(Object obj)
    {
        Comparable comparable = (Comparable)obj;
        int i = a(comparable);
        if (i >= 0)
        {
            return ((bc)b.get(i)).getValue();
        } else
        {
            return c.get(comparable);
        }
    }

    public Object put(Object obj, Object obj1)
    {
        return a((Comparable)obj, obj1);
    }

    public Object remove(Object obj)
    {
        e();
        Comparable comparable = (Comparable)obj;
        int i = a(comparable);
        if (i >= 0)
        {
            return c(i);
        }
        if (c.isEmpty())
        {
            return null;
        } else
        {
            return c.remove(comparable);
        }
    }

    public int size()
    {
        return b.size() + c.size();
    }
}
