// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.tagmanager.a:
//            aj, af, l, bk, 
//            aq, am, an, m, 
//            h, e, o

public final class k
{

    private final byte a[];
    private final boolean b;
    private int c;
    private int d;
    private int e;
    private final InputStream f;
    private int g;
    private boolean h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private l n;

    private k(aj aj1)
    {
        h = false;
        j = 0x7fffffff;
        l = 64;
        m = 0x4000000;
        n = null;
        a = aj1.c;
        e = aj1.b();
        c = aj1.b() + aj1.a();
        i = -e;
        f = null;
        b = true;
    }

    private k(InputStream inputstream)
    {
        h = false;
        j = 0x7fffffff;
        l = 64;
        m = 0x4000000;
        n = null;
        a = new byte[4096];
        c = 0;
        e = 0;
        i = 0;
        f = inputstream;
        b = false;
    }

    public static long a(long l1)
    {
        return l1 >>> 1 ^ -(1L & l1);
    }

    static k a(aj aj1)
    {
        k k1 = new k(aj1);
        try
        {
            k1.c(aj1.a());
        }
        catch (af af1)
        {
            throw new IllegalArgumentException(af1);
        }
        return k1;
    }

    public static k a(InputStream inputstream)
    {
        return new k(inputstream);
    }

    private boolean a(boolean flag)
    {
        if (e < c)
        {
            throw new IllegalStateException("refillBuffer() called when buffer wasn't empty.");
        }
        if (i + c == j)
        {
            if (flag)
            {
                throw af.b();
            } else
            {
                return false;
            }
        }
        if (n != null)
        {
            n.a();
        }
        i = i + c;
        e = 0;
        int i1;
        if (f == null)
        {
            i1 = -1;
        } else
        {
            i1 = f.read(a);
        }
        c = i1;
        if (c == 0 || c < -1)
        {
            throw new IllegalStateException((new StringBuilder()).append("InputStream#read(byte[]) returned invalid result: ").append(c).append("\nThe InputStream implementation is buggy.").toString());
        }
        if (c == -1)
        {
            c = 0;
            if (flag)
            {
                throw af.b();
            } else
            {
                return false;
            }
        }
        z();
        int j1 = i + c + d;
        if (j1 > m || j1 < 0)
        {
            throw af.i();
        } else
        {
            return true;
        }
    }

    public static int b(int i1)
    {
        return i1 >>> 1 ^ -(i1 & 1);
    }

    private void z()
    {
        c = c + d;
        int i1 = i + c;
        if (i1 > j)
        {
            d = i1 - j;
            c = c - d;
            return;
        } else
        {
            d = 0;
            return;
        }
    }

    public int a()
    {
        if (x())
        {
            g = 0;
            return 0;
        }
        g = s();
        if (bk.b(g) == 0)
        {
            throw af.e();
        } else
        {
            return g;
        }
    }

    public am a(aq aq1, o o1)
    {
        int i1 = s();
        if (k >= l)
        {
            throw af.h();
        } else
        {
            int j1 = c(i1);
            k = 1 + k;
            am am1 = (am)aq1.b(this, o1);
            a(0);
            k = -1 + k;
            d(j1);
            return am1;
        }
    }

    public void a(int i1)
    {
        if (g != i1)
        {
            throw af.f();
        } else
        {
            return;
        }
    }

    public void a(int i1, an an1, o o1)
    {
        if (k >= l)
        {
            throw af.h();
        } else
        {
            k = 1 + k;
            an1.c(this, o1);
            a(bk.a(i1, 4));
            k = -1 + k;
            return;
        }
    }

    public void a(an an1, o o1)
    {
        int i1 = s();
        if (k >= l)
        {
            throw af.h();
        } else
        {
            int j1 = c(i1);
            k = 1 + k;
            an1.c(this, o1);
            a(0);
            k = -1 + k;
            d(j1);
            return;
        }
    }

    public void a(m m1)
    {
        int i1;
        do
        {
            i1 = a();
        } while (i1 != 0 && a(i1, m1));
    }

    public boolean a(int i1, m m1)
    {
        int j1;
        switch (bk.a(i1))
        {
        default:
            throw af.g();

        case 0: // '\0'
            long l2 = e();
            m1.d(i1);
            m1.a(l2);
            return true;

        case 1: // '\001'
            long l1 = v();
            m1.d(i1);
            m1.b(l1);
            return true;

        case 2: // '\002'
            h h1 = l();
            m1.d(i1);
            m1.a(h1);
            return true;

        case 3: // '\003'
            m1.d(i1);
            a(m1);
            int k1 = bk.a(bk.b(i1), 4);
            a(k1);
            m1.d(k1);
            return true;

        case 4: // '\004'
            return false;

        case 5: // '\005'
            j1 = u();
            break;
        }
        m1.d(i1);
        m1.a(j1);
        return true;
    }

    public double b()
    {
        return Double.longBitsToDouble(v());
    }

    public float c()
    {
        return Float.intBitsToFloat(u());
    }

    public int c(int i1)
    {
        if (i1 < 0)
        {
            throw af.c();
        }
        int j1 = i1 + (i + e);
        int k1 = j;
        if (j1 > k1)
        {
            throw af.b();
        } else
        {
            j = j1;
            z();
            return k1;
        }
    }

    public long d()
    {
        return t();
    }

    public void d(int i1)
    {
        j = i1;
        z();
    }

    public long e()
    {
        return t();
    }

    public byte[] e(int i1)
    {
        if (i1 < 0)
        {
            throw af.c();
        }
        if (i1 + (i + e) > j)
        {
            f(j - i - e);
            throw af.b();
        }
        if (i1 <= c - e)
        {
            byte abyte4[] = new byte[i1];
            System.arraycopy(a, e, abyte4, 0, i1);
            e = i1 + e;
            return abyte4;
        }
        if (i1 < 4096)
        {
            byte abyte3[] = new byte[i1];
            int k3 = c - e;
            System.arraycopy(a, e, abyte3, 0, k3);
            e = c;
            a(true);
            while (i1 - k3 > c) 
            {
                System.arraycopy(a, 0, abyte3, k3, c);
                k3 += c;
                e = c;
                a(true);
            }
            System.arraycopy(a, 0, abyte3, k3, i1 - k3);
            e = i1 - k3;
            return abyte3;
        }
        int j1 = e;
        int k1 = c;
        i = i + c;
        e = 0;
        c = 0;
        int l1 = i1 - (k1 - j1);
        ArrayList arraylist = new ArrayList();
        int i3;
        for (int i2 = l1; i2 > 0; i2 = i3)
        {
            byte abyte2[] = new byte[Math.min(i2, 4096)];
            int j3;
            for (int l2 = 0; l2 < abyte2.length; l2 += j3)
            {
                if (f == null)
                {
                    j3 = -1;
                } else
                {
                    j3 = f.read(abyte2, l2, abyte2.length - l2);
                }
                if (j3 == -1)
                {
                    throw af.b();
                }
                i = j3 + i;
            }

            i3 = i2 - abyte2.length;
            arraylist.add(abyte2);
        }

        byte abyte0[] = new byte[i1];
        int j2 = k1 - j1;
        System.arraycopy(a, j1, abyte0, 0, j2);
        Iterator iterator = arraylist.iterator();
        byte abyte1[];
        for (int k2 = j2; iterator.hasNext(); k2 += abyte1.length)
        {
            abyte1 = (byte[])iterator.next();
            System.arraycopy(abyte1, 0, abyte0, k2, abyte1.length);
        }

        return abyte0;
    }

    public int f()
    {
        return s();
    }

    public void f(int i1)
    {
        if (i1 < 0)
        {
            throw af.c();
        }
        if (i1 + (i + e) > j)
        {
            f(j - i - e);
            throw af.b();
        }
        if (i1 <= c - e)
        {
            e = i1 + e;
            return;
        }
        int j1 = c - e;
        e = c;
        a(true);
        while (i1 - j1 > c) 
        {
            j1 += c;
            e = c;
            a(true);
        }
        e = i1 - j1;
    }

    public long g()
    {
        return v();
    }

    public int h()
    {
        return u();
    }

    public boolean i()
    {
        return s() != 0;
    }

    public String j()
    {
        int i1 = s();
        if (i1 <= c - e && i1 > 0)
        {
            String s1 = new String(a, e, i1, "UTF-8");
            e = i1 + e;
            return s1;
        } else
        {
            return new String(e(i1), "UTF-8");
        }
    }

    public String k()
    {
        int i1 = s();
        Object obj;
        if (i1 <= c - e && i1 > 0)
        {
            obj = com.google.tagmanager.a.h.a(a, e, i1);
            e = i1 + e;
        } else
        {
            obj = new aj(e(i1));
        }
        if (!((h) (obj)).g())
        {
            throw af.j();
        } else
        {
            return ((h) (obj)).f();
        }
    }

    public h l()
    {
        int i1 = s();
        if (i1 == 0)
        {
            return h.a;
        }
        if (i1 <= c - e && i1 > 0)
        {
            Object obj;
            if (b && h)
            {
                obj = new e(a, e, i1);
            } else
            {
                obj = com.google.tagmanager.a.h.a(a, e, i1);
            }
            e = i1 + e;
            return ((h) (obj));
        } else
        {
            return new aj(e(i1));
        }
    }

    public int m()
    {
        return s();
    }

    public int n()
    {
        return s();
    }

    public int o()
    {
        return u();
    }

    public long p()
    {
        return v();
    }

    public int q()
    {
        return b(s());
    }

    public long r()
    {
        return a(t());
    }

    public int s()
    {
        int i1 = y();
        if (i1 < 0) goto _L2; else goto _L1
_L1:
        return i1;
_L2:
        int j1 = i1 & 0x7f;
        byte byte0 = y();
        if (byte0 >= 0)
        {
            return j1 | byte0 << 7;
        }
        int k1 = j1 | (byte0 & 0x7f) << 7;
        byte byte1 = y();
        if (byte1 >= 0)
        {
            return k1 | byte1 << 14;
        }
        int l1 = k1 | (byte1 & 0x7f) << 14;
        byte byte2 = y();
        if (byte2 >= 0)
        {
            return l1 | byte2 << 21;
        }
        int i2 = l1 | (byte2 & 0x7f) << 21;
        byte byte3 = y();
        i1 = i2 | byte3 << 28;
        if (byte3 < 0)
        {
            int j2 = 0;
label0:
            do
            {
label1:
                {
                    if (j2 >= 5)
                    {
                        break label1;
                    }
                    if (y() >= 0)
                    {
                        break label0;
                    }
                    j2++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        throw af.d();
    }

    public long t()
    {
        int i1 = 0;
        long l1 = 0L;
        for (; i1 < 64; i1 += 7)
        {
            byte byte0 = y();
            l1 |= (long)(byte0 & 0x7f) << i1;
            if ((byte0 & 0x80) == 0)
            {
                return l1;
            }
        }

        throw af.d();
    }

    public int u()
    {
        byte byte0 = y();
        byte byte1 = y();
        byte byte2 = y();
        byte byte3 = y();
        return byte0 & 0xff | (byte1 & 0xff) << 8 | (byte2 & 0xff) << 16 | (byte3 & 0xff) << 24;
    }

    public long v()
    {
        int i1 = y();
        int j1 = y();
        int k1 = y();
        int l1 = y();
        int i2 = y();
        int j2 = y();
        int k2 = y();
        int l2 = y();
        return 255L & (long)i1 | (255L & (long)j1) << 8 | (255L & (long)k1) << 16 | (255L & (long)l1) << 24 | (255L & (long)i2) << 32 | (255L & (long)j2) << 40 | (255L & (long)k2) << 48 | (255L & (long)l2) << 56;
    }

    public int w()
    {
        if (j == 0x7fffffff)
        {
            return -1;
        } else
        {
            int i1 = i + e;
            return j - i1;
        }
    }

    public boolean x()
    {
        int i1 = e;
        int j1 = c;
        boolean flag = false;
        if (i1 == j1)
        {
            boolean flag1 = a(false);
            flag = false;
            if (!flag1)
            {
                flag = true;
            }
        }
        return flag;
    }

    public byte y()
    {
        if (e == c)
        {
            a(true);
        }
        byte abyte0[] = a;
        int i1 = e;
        e = i1 + 1;
        return abyte0[i1];
    }
}
