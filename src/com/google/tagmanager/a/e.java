// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;

import java.util.Iterator;

// Referenced classes of package com.google.tagmanager.a:
//            aj, g, i

class e extends aj
{

    private final int d;
    private final int e;

    e(byte abyte0[], int i, int j)
    {
        super(abyte0);
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Offset too small: ").append(i).toString());
        }
        if (j < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Length too small: ").append(i).toString());
        }
        if ((long)i + (long)j > (long)abyte0.length)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Offset+Length too large: ").append(i).append("+").append(j).toString());
        } else
        {
            d = i;
            e = j;
            return;
        }
    }

    public byte a(int i)
    {
        if (i < 0)
        {
            throw new ArrayIndexOutOfBoundsException((new StringBuilder()).append("Index too small: ").append(i).toString());
        }
        if (i >= a())
        {
            throw new ArrayIndexOutOfBoundsException((new StringBuilder()).append("Index too large: ").append(i).append(", ").append(a()).toString());
        } else
        {
            return c[i + d];
        }
    }

    public int a()
    {
        return e;
    }

    protected void a(byte abyte0[], int i, int j, int k)
    {
        System.arraycopy(c, i + b(), abyte0, j, k);
    }

    protected int b()
    {
        return d;
    }

    public i c()
    {
        return new g(this, null);
    }

    public Iterator iterator()
    {
        return c();
    }
}
