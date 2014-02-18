// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager;


class x extends Number
    implements Comparable
{

    private double a;
    private long b;
    private boolean c;

    private x(long l)
    {
        b = l;
        c = true;
    }

    public static x a(long l)
    {
        return new x(l);
    }

    public int a(x x1)
    {
        if (b() && x1.b())
        {
            return (new Long(b)).compareTo(Long.valueOf(x1.b));
        } else
        {
            return Double.compare(doubleValue(), x1.doubleValue());
        }
    }

    public boolean a()
    {
        return !b();
    }

    public boolean b()
    {
        return c;
    }

    public byte byteValue()
    {
        return (byte)(int)longValue();
    }

    public long c()
    {
        if (b())
        {
            return b;
        } else
        {
            return (long)a;
        }
    }

    public int compareTo(Object obj)
    {
        return a((x)obj);
    }

    public int d()
    {
        return (int)longValue();
    }

    public double doubleValue()
    {
        if (b())
        {
            return (double)b;
        } else
        {
            return a;
        }
    }

    public short e()
    {
        return (short)(int)longValue();
    }

    public boolean equals(Object obj)
    {
        return (obj instanceof x) && a((x)obj) == 0;
    }

    public float floatValue()
    {
        return (float)doubleValue();
    }

    public int hashCode()
    {
        return (new Long(longValue())).hashCode();
    }

    public int intValue()
    {
        return d();
    }

    public long longValue()
    {
        return c();
    }

    public short shortValue()
    {
        return e();
    }

    public String toString()
    {
        if (b())
        {
            return Long.toString(b);
        } else
        {
            return Double.toString(a);
        }
    }
}
