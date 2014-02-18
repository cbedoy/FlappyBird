// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.net.Uri;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.do;

// Referenced classes of package com.google.android.gms.common.data:
//            d

public abstract class b
{

    protected final d a;
    protected final int b;
    private final int c;

    public b(d d1, int i)
    {
        a = (d)com.google.android.gms.internal.do.a(d1);
        boolean flag;
        if (i >= 0 && i < d1.g())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.gms.internal.do.a(flag);
        b = i;
        c = d1.a(b);
    }

    protected long a(String s)
    {
        return a.a(s, b, c);
    }

    protected int b(String s)
    {
        return a.b(s, b, c);
    }

    protected boolean c(String s)
    {
        return a.d(s, b, c);
    }

    protected String d(String s)
    {
        return a.c(s, b, c);
    }

    protected Uri e(String s)
    {
        return a.e(s, b, c);
    }

    public boolean equals(Object obj)
    {
        boolean flag = obj instanceof b;
        boolean flag1 = false;
        if (flag)
        {
            b b1 = (b)obj;
            boolean flag2 = dl.a(Integer.valueOf(b1.b), Integer.valueOf(b));
            flag1 = false;
            if (flag2)
            {
                boolean flag3 = dl.a(Integer.valueOf(b1.c), Integer.valueOf(c));
                flag1 = false;
                if (flag3)
                {
                    d d1 = b1.a;
                    d d2 = a;
                    flag1 = false;
                    if (d1 == d2)
                    {
                        flag1 = true;
                    }
                }
            }
        }
        return flag1;
    }

    protected boolean f(String s)
    {
        return a.f(s, b, c);
    }

    public int hashCode()
    {
        Object aobj[] = new Object[3];
        aobj[0] = Integer.valueOf(b);
        aobj[1] = Integer.valueOf(c);
        aobj[2] = a;
        return dl.a(aobj);
    }
}
