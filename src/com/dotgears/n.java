// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dotgears;


// Referenced classes of package com.dotgears:
//            m, g

public class n extends m
{

    public m a[];
    int b;
    int c;

    public n()
    {
        a = new m[30];
    }

    public int a()
    {
        return c;
    }

    public void a(float f)
    {
        int i = 0;
        do
        {
            if (i >= a())
            {
                return;
            }
            a[i].a(f);
            i++;
        } while (true);
    }

    public void a(g g)
    {
        int i = 0;
        do
        {
            if (i >= a())
            {
                return;
            }
            a[i].a(g);
            i++;
        } while (true);
    }

    public void a(m m1)
    {
        a[c] = m1;
        b = 0;
        c = 1 + c;
    }

    public void b()
    {
        int i = 0;
        do
        {
            if (i >= a())
            {
                b = 0;
                return;
            }
            a[i].F = false;
            a[i].G = false;
            i++;
        } while (true);
    }

    m c()
    {
        m m1 = a[b];
        b = 1 + b;
        if (b == a())
        {
            b = 0;
        }
        return m1;
    }
}
