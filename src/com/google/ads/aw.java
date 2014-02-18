// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import java.io.OutputStream;

// Referenced classes of package com.google.ads:
//            ax, ay

public final class aw
{

    private final byte a[];
    private final int b;
    private int c;
    private int d;
    private final OutputStream e;

    private aw(OutputStream outputstream, byte abyte0[])
    {
        d = 0;
        e = outputstream;
        a = abyte0;
        c = 0;
        b = abyte0.length;
    }

    public static aw a(OutputStream outputstream)
    {
        return a(outputstream, 4096);
    }

    public static aw a(OutputStream outputstream, int i)
    {
        return new aw(outputstream, new byte[i]);
    }

    private void b()
    {
        if (e == null)
        {
            throw new ax();
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
        a((byte)i);
    }

    public void a(int i, int j)
    {
        b(ay.a(i, j));
    }

    public void a(int i, long l)
    {
        a(i, 0);
        a(l);
    }

    public void a(int i, String s)
    {
        a(i, 2);
        a(s);
    }

    public void a(long l)
    {
        b(l);
    }

    public void a(String s)
    {
        byte abyte0[] = s.getBytes("UTF-8");
        b(abyte0.length);
        a(abyte0);
    }

    public void a(byte abyte0[])
    {
        a(abyte0, 0, abyte0.length);
    }

    public void a(byte abyte0[], int i, int j)
    {
        if (b - c >= j)
        {
            System.arraycopy(abyte0, i, a, c, j);
            c = j + c;
            d = j + d;
            return;
        }
        int k = b - c;
        System.arraycopy(abyte0, i, a, c, k);
        int l = i + k;
        int i1 = j - k;
        c = b;
        d = k + d;
        b();
        if (i1 <= b)
        {
            System.arraycopy(abyte0, l, a, 0, i1);
            c = i1;
        } else
        {
            e.write(abyte0, l, i1);
        }
        d = i1 + d;
    }

    public void b(int i)
    {
        do
        {
            if ((i & 0xffffff80) == 0)
            {
                a(i);
                return;
            }
            a(0x80 | i & 0x7f);
            i >>>= 7;
        } while (true);
    }

    public void b(long l)
    {
        do
        {
            if ((-128L & l) == 0L)
            {
                a((int)l);
                return;
            }
            a(0x80 | 0x7f & (int)l);
            l >>>= 7;
        } while (true);
    }
}
