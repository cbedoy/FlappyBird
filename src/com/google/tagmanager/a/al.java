// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;

import java.util.NoSuchElementException;

// Referenced classes of package com.google.tagmanager.a:
//            i, aj, ak

class al
    implements i
{

    final aj a;
    private int b;
    private final int c;

    private al(aj aj1)
    {
        a = aj1;
        super();
        b = 0;
        c = aj1.a();
    }

    al(aj aj1, ak ak)
    {
        this(aj1);
    }

    public Byte a()
    {
        return Byte.valueOf(b());
    }

    public byte b()
    {
        byte byte0;
        try
        {
            byte abyte0[] = a.c;
            int j = b;
            b = j + 1;
            byte0 = abyte0[j];
        }
        catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
        {
            throw new NoSuchElementException(arrayindexoutofboundsexception.getMessage());
        }
        return byte0;
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
