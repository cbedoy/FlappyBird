// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;


// Referenced classes of package com.google.tagmanager.a:
//            ax

class bc
    implements Comparable, java.util.Map.Entry
{

    final ax a;
    private final Comparable b;
    private Object c;

    bc(ax ax1, Comparable comparable, Object obj)
    {
        a = ax1;
        super();
        b = comparable;
        c = obj;
    }

    bc(ax ax1, java.util.Map.Entry entry)
    {
        this(ax1, (Comparable)entry.getKey(), entry.getValue());
    }

    private boolean a(Object obj, Object obj1)
    {
        if (obj == null)
        {
            return obj1 == null;
        } else
        {
            return obj.equals(obj1);
        }
    }

    public int a(bc bc1)
    {
        return a().compareTo(bc1.a());
    }

    public Comparable a()
    {
        return b;
    }

    public int compareTo(Object obj)
    {
        return a((bc)obj);
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof java.util.Map.Entry))
            {
                return false;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)obj;
            if (!a(b, entry.getKey()) || !a(c, entry.getValue()))
            {
                return false;
            }
        }
        return true;
    }

    public Object getKey()
    {
        return a();
    }

    public Object getValue()
    {
        return c;
    }

    public int hashCode()
    {
        int i;
        Object obj;
        int j;
        if (b == null)
        {
            i = 0;
        } else
        {
            i = b.hashCode();
        }
        obj = c;
        j = 0;
        if (obj != null)
        {
            j = c.hashCode();
        }
        return i ^ j;
    }

    public Object setValue(Object obj)
    {
        ax.a(a);
        Object obj1 = c;
        c = obj;
        return obj1;
    }

    public String toString()
    {
        return (new StringBuilder()).append(b).append("=").append(c).toString();
    }
}
