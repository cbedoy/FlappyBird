// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dotgears;


public class d
{

    public boolean a;
    public String b;
    public int c;
    public int d[];
    public float e;
    public boolean f;
    public int g;
    public int h;
    public int i;
    public int j;

    public d(int k, String s, int ai[], int l, int i1, boolean flag)
    {
        b = s;
        c = l;
        d = new int[c];
        System.arraycopy(ai, 0, d, 0, c);
        e = 1000 / i1;
        f = flag;
        g = k;
    }

    public void a()
    {
        h = 0;
        i = 0;
        j = d[0];
    }

    public void a(float f1)
    {
        if (!a)
        {
            h = 15 + h;
            if ((float)h >= e)
            {
                h = 0;
                i = 1 + i;
                if (i >= c)
                {
                    if (f)
                    {
                        i = 0;
                    } else
                    {
                        a = true;
                    }
                    i = 0;
                }
                j = d[i];
                return;
            }
        }
    }

    void b()
    {
        if (!f && a)
        {
            a();
        }
        a = false;
    }
}
