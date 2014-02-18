// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.d.a.a;

import java.util.Arrays;

public class a
    implements org.andengine.d.a.c.a
{

    protected Object a[];
    protected int b;
    protected int c;

    public a()
    {
        this(1);
    }

    public a(int i)
    {
        a = new Object[i];
    }

    private void c()
    {
        int i;
label0:
        {
            i = a.length;
            if (c == i)
            {
                if (c - b == i)
                {
                    break label0;
                }
                b();
            }
            return;
        }
        Object aobj[] = new Object[1 + (i * 3 >> 1)];
        System.arraycopy(((Object) (a)), 0, ((Object) (aobj)), 0, i);
        a = aobj;
    }

    public Object a()
    {
        if (b == c)
        {
            return null;
        }
        Object obj = a[b];
        a[b] = null;
        b = 1 + b;
        if (b == c)
        {
            b = 0;
            c = 0;
        }
        return obj;
    }

    public void a(Object obj)
    {
        c();
        a[c] = obj;
        c = 1 + c;
    }

    public void b()
    {
        int i = c - b;
        if (i == 0)
        {
            b = 0;
            c = 0;
            return;
        }
        System.arraycopy(((Object) (a)), b, ((Object) (a)), 0, i);
        int j = Math.max(i, b);
        int k = Math.max(j, c);
        if (j < k)
        {
            Arrays.fill(a, j, k, null);
        }
        b = 0;
        c = i;
    }
}
