// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;

import java.util.NoSuchElementException;

// Referenced classes of package com.google.tagmanager.a:
//            i, e, f

class g
    implements i
{

    final e a;
    private int b;
    private final int c;

    private g(e e1)
    {
        a = e1;
        super();
        b = e1.b();
        c = b + e1.a();
    }

    g(e e1, f f)
    {
        this(e1);
    }

    public Byte a()
    {
        return Byte.valueOf(b());
    }

    public byte b()
    {
        if (b >= c)
        {
            throw new NoSuchElementException();
        } else
        {
            byte abyte0[] = a.c;
            int j = b;
            b = j + 1;
            return abyte0[j];
        }
    }

    public boolean hasNext()
    {
        return b < c;
    }

    public Object next()
    {
        return a();
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
