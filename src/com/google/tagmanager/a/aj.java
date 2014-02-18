// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;

import java.io.OutputStream;
import java.util.Iterator;

// Referenced classes of package com.google.tagmanager.a:
//            h, bj, al, ar, 
//            k, i

class aj extends h
{

    protected final byte c[];
    private int d;

    aj(byte abyte0[])
    {
        d = 0;
        c = abyte0;
    }

    static int a(int i, byte abyte0[], int i1, int j1)
    {
        for (int k1 = i1; k1 < i1 + j1; k1++)
        {
            i = i * 31 + abyte0[k1];
        }

        return i;
    }

    public byte a(int i)
    {
        return c[i];
    }

    public int a()
    {
        return c.length;
    }

    protected int a(int i, int i1, int j1)
    {
        int k1 = i1 + b();
        return bj.a(i, c, k1, k1 + j1);
    }

    public String a(String s)
    {
        return new String(c, b(), a(), s);
    }

    protected void a(byte abyte0[], int i, int i1, int j1)
    {
        System.arraycopy(c, i, abyte0, i1, j1);
    }

    boolean a(aj aj1, int i, int i1)
    {
        if (i1 > aj1.a())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Length too large: ").append(i1).append(a()).toString());
        }
        if (i + i1 > aj1.a())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Ran off end of other: ").append(i).append(", ").append(i1).append(", ").append(aj1.a()).toString());
        }
        byte abyte0[] = c;
        byte abyte1[] = aj1.c;
        int j1 = i1 + b();
        int k1 = b();
        for (int l1 = i + aj1.b(); k1 < j1; l1++)
        {
            if (abyte0[k1] != abyte1[l1])
            {
                return false;
            }
            k1++;
        }

        return true;
    }

    protected int b()
    {
        return 0;
    }

    protected int b(int i, int i1, int j1)
    {
        return a(i, c, i1 + b(), j1);
    }

    void b(OutputStream outputstream, int i, int i1)
    {
        outputstream.write(c, i + b(), i1);
    }

    public i c()
    {
        return new al(this, null);
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (!(obj instanceof h))
        {
            return false;
        }
        if (a() != ((h)obj).a())
        {
            return false;
        }
        if (a() == 0)
        {
            return true;
        }
        if (obj instanceof aj)
        {
            return a((aj)obj, 0, a());
        }
        if (obj instanceof ar)
        {
            return obj.equals(this);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Has a new type of ByteString been created? Found ").append(obj.getClass()).toString());
        }
    }

    public boolean g()
    {
        int i = b();
        return bj.a(c, i, i + a());
    }

    public k h()
    {
        return com.google.tagmanager.a.k.a(this);
    }

    public int hashCode()
    {
        int i = d;
        if (i == 0)
        {
            int i1 = a();
            i = b(i1, 0, i1);
            if (i == 0)
            {
                i = 1;
            }
            d = i;
        }
        return i;
    }

    public Iterator iterator()
    {
        return c();
    }

    protected int j()
    {
        return 0;
    }

    protected boolean k()
    {
        return true;
    }

    protected int l()
    {
        return d;
    }
}
