// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;

import java.io.OutputStream;

// Referenced classes of package com.google.tagmanager.a:
//            n, h

public final class m
{

    private final byte a[];
    private final int b;
    private int c;
    private int d;
    private final OutputStream e;

    private m(OutputStream outputstream, byte abyte0[])
    {
        d = 0;
        e = outputstream;
        a = abyte0;
        c = 0;
        b = abyte0.length;
    }

    public static m a(OutputStream outputstream)
    {
        return a(outputstream, 4096);
    }

    public static m a(OutputStream outputstream, int i)
    {
        return new m(outputstream, new byte[i]);
    }

    private void b()
    {
        if (e == null)
        {
            throw new n();
        } else
        {
            e.write(a, 0, c);
            c = 0;
            return;
        }
    }

    public void a()
    {
        if (e != null)
        {
            b();
        }
    }

    public void a(byte byte0)
    {
        if (c == b)
        {
            b();
        }
        byte abyte0[] = a;
        int i = c;
        c = i + 1;
        abyte0[i] = byte0;
        d = 1 + d;
    }

    public void a(int i)
    {
        e(i);
    }

    public void a(long l)
    {
        c(l);
    }

    public void a(h h1)
    {
        d(h1.a());
        b(h1);
    }

    public void a(h h1, int i, int j)
    {
        if (b - c >= j)
        {
            h1.b(a, i, c, j);
            c = j + c;
            d = j + d;
            return;
        }
        int k = b - c;
        h1.b(a, i, c, k);
        int l = i + k;
        int i1 = j - k;
        c = b;
        d = k + d;
        b();
        if (i1 <= b)
        {
            h1.b(a, l, 0, i1);
            c = i1;
        } else
        {
            h1.a(e, l, i1);
        }
        d = i1 + d;
    }

    public void b(int i)
    {
        d(i);
    }

    public void b(long l)
    {
        d(l);
    }

    public void b(h h1)
    {
        a(h1, 0, h1.a());
    }

    public void c(int i)
    {
        a((byte)i);
    }

    public void c(long l)
    {
        do
        {
            if ((-128L & l) == 0L)
            {
                c((int)l);
                return;
            }
            c(0x80 | 0x7f & (int)l);
            l >>>= 7;
        } while (true);
    }

    public void d(int i)
    {
        do
        {
            if ((i & 0xffffff80) == 0)
            {
                c(i);
                return;
            }
            c(0x80 | i & 0x7f);
            i >>>= 7;
        } while (true);
    }

    public void d(long l)
    {
        c(0xff & (int)l);
        c(0xff & (int)(l >> 8));
        c(0xff & (int)(l >> 16));
        c(0xff & (int)(l >> 24));
        c(0xff & (int)(l >> 32));
        c(0xff & (int)(l >> 40));
        c(0xff & (int)(l >> 48));
        c(0xff & (int)(l >> 56));
    }

    public void e(int i)
    {
        c(i & 0xff);
        c(0xff & i >> 8);
        c(0xff & i >> 16);
        c(0xff & i >> 24);
    }
}
