// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;

import java.io.InputStream;

// Referenced classes of package com.google.tagmanager.a:
//            aj, au, ar

class aw extends InputStream
{

    final ar a;
    private au b;
    private aj c;
    private int d;
    private int e;
    private int f;
    private int g;

    public aw(ar ar1)
    {
        a = ar1;
        super();
        a();
    }

    private int a(byte abyte0[], int i, int j)
    {
        int k = j;
        int l = i;
        int i1;
        for (; k > 0; k -= i1)
        {
            b();
            if (c == null)
            {
                if (k == j)
                {
                    return -1;
                }
                break;
            }
            i1 = Math.min(d - e, k);
            if (abyte0 != null)
            {
                c.b(abyte0, e, l, i1);
                l += i1;
            }
            e = i1 + e;
        }

        return j - k;
    }

    private void a()
    {
        b = new au(a, null);
        c = b.a();
        d = c.a();
        e = 0;
        f = 0;
    }

    private void b()
    {
label0:
        {
            if (c != null && e == d)
            {
                f = f + d;
                e = 0;
                if (!b.hasNext())
                {
                    break label0;
                }
                c = b.a();
                d = c.a();
            }
            return;
        }
        c = null;
        d = 0;
    }

    public int available()
    {
        int i = f + e;
        return a.a() - i;
    }

    public void mark(int i)
    {
        g = f + e;
    }

    public boolean markSupported()
    {
        return true;
    }

    public int read()
    {
        b();
        if (c == null)
        {
            return -1;
        } else
        {
            aj aj1 = c;
            int i = e;
            e = i + 1;
            return 0xff & aj1.a(i);
        }
    }

    public int read(byte abyte0[], int i, int j)
    {
        if (abyte0 == null)
        {
            throw new NullPointerException();
        }
        if (i < 0 || j < 0 || j > abyte0.length - i)
        {
            throw new IndexOutOfBoundsException();
        } else
        {
            return a(abyte0, i, j);
        }
    }

    public void reset()
    {
        this;
        JVM INSTR monitorenter ;
        a();
        a(null, 0, g);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public long skip(long l)
    {
        if (l < 0L)
        {
            throw new IndexOutOfBoundsException();
        }
        if (l > 0x7fffffffL)
        {
            l = 0x7fffffffL;
        }
        return (long)a(null, 0, (int)l);
    }
}
