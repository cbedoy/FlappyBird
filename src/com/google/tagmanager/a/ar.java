// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.tagmanager.a:
//            h, at, aj, au, 
//            av, aw, k, as, 
//            i

class ar extends h
{

    private static final int c[];
    private final int d;
    private final h e;
    private final h f;
    private final int g;
    private final int h;
    private int i;

    private ar(h h1, h h2)
    {
        i = 0;
        e = h1;
        f = h2;
        g = h1.a();
        d = g + h2.a();
        h = 1 + Math.max(h1.j(), h2.j());
    }

    ar(h h1, h h2, as as)
    {
        this(h1, h2);
    }

    static h a(ar ar1)
    {
        return ar1.e;
    }

    static h a(h h1, h h2)
    {
        ar ar1;
        if (h1 instanceof ar)
        {
            ar1 = (ar)h1;
        } else
        {
            ar1 = null;
        }
        if (h2.a() == 0)
        {
            return h1;
        }
        if (h1.a() == 0)
        {
            return h2;
        }
        int i1 = h1.a() + h2.a();
        if (i1 < 128)
        {
            return b(h1, h2);
        }
        if (ar1 != null && ar1.f.a() + h2.a() < 128)
        {
            aj aj1 = b(ar1.f, h2);
            return new ar(ar1.e, aj1);
        }
        if (ar1 != null && ar1.e.j() > ar1.f.j() && ar1.j() > h2.j())
        {
            ar ar2 = new ar(ar1.f, h2);
            return new ar(ar1.e, ar2);
        }
        int j1 = 1 + Math.max(h1.j(), h2.j());
        if (i1 >= c[j1])
        {
            return new ar(h1, h2);
        } else
        {
            return at.a(new at(null), h1, h2);
        }
    }

    private static aj b(h h1, h h2)
    {
        int i1 = h1.a();
        int j1 = h2.a();
        byte abyte0[] = new byte[i1 + j1];
        h1.b(abyte0, 0, 0, i1);
        h2.b(abyte0, 0, i1, j1);
        return new aj(abyte0);
    }

    static h b(ar ar1)
    {
        return ar1.f;
    }

    private boolean b(h h1)
    {
        au au1 = new au(this, null);
        aj aj1 = (aj)au1.next();
        au au2 = new au(h1, null);
        aj aj2 = (aj)au2.next();
        int i1 = 0;
        aj aj3 = aj1;
        int j1 = 0;
        int k1 = 0;
        do
        {
            int l1 = aj3.a() - j1;
            int i2 = aj2.a() - i1;
            int j2 = Math.min(l1, i2);
            boolean flag;
            if (j1 == 0)
            {
                flag = aj3.a(aj2, i1, j2);
            } else
            {
                flag = aj2.a(aj3, j1, j2);
            }
            if (!flag)
            {
                return false;
            }
            int k2 = k1 + j2;
            if (k2 >= d)
            {
                if (k2 == d)
                {
                    return true;
                } else
                {
                    throw new IllegalStateException();
                }
            }
            int i3;
            aj aj5;
            if (j2 == l1)
            {
                aj3 = (aj)au1.next();
                j1 = 0;
            } else
            {
                j1 += j2;
            }
            if (j2 == i2)
            {
                aj5 = (aj)au2.next();
                i3 = 0;
            } else
            {
                int l2 = i1 + j2;
                aj aj4 = aj2;
                i3 = l2;
                aj5 = aj4;
            }
            i1 = i3;
            aj2 = aj5;
            k1 = k2;
        } while (true);
    }

    static int[] b()
    {
        return c;
    }

    public int a()
    {
        return d;
    }

    protected int a(int i1, int j1, int k1)
    {
        if (j1 + k1 <= g)
        {
            return e.a(i1, j1, k1);
        }
        if (j1 >= g)
        {
            return f.a(i1, j1 - g, k1);
        } else
        {
            int l1 = g - j1;
            int i2 = e.a(i1, j1, l1);
            return f.a(i2, 0, k1 - l1);
        }
    }

    public String a(String s)
    {
        return new String(e(), s);
    }

    protected void a(byte abyte0[], int i1, int j1, int k1)
    {
        if (i1 + k1 <= g)
        {
            e.a(abyte0, i1, j1, k1);
            return;
        }
        if (i1 >= g)
        {
            f.a(abyte0, i1 - g, j1, k1);
            return;
        } else
        {
            int l1 = g - i1;
            e.a(abyte0, i1, j1, l1);
            f.a(abyte0, 0, j1 + l1, k1 - l1);
            return;
        }
    }

    protected int b(int i1, int j1, int k1)
    {
        if (j1 + k1 <= g)
        {
            return e.b(i1, j1, k1);
        }
        if (j1 >= g)
        {
            return f.b(i1, j1 - g, k1);
        } else
        {
            int l1 = g - j1;
            int i2 = e.b(i1, j1, l1);
            return f.b(i2, 0, k1 - l1);
        }
    }

    void b(OutputStream outputstream, int i1, int j1)
    {
        if (i1 + j1 <= g)
        {
            e.b(outputstream, i1, j1);
            return;
        }
        if (i1 >= g)
        {
            f.b(outputstream, i1 - g, j1);
            return;
        } else
        {
            int k1 = g - i1;
            e.b(outputstream, i1, k1);
            f.b(outputstream, 0, j1 - k1);
            return;
        }
    }

    public i c()
    {
        return new av(this, null);
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof h))
            {
                return false;
            }
            h h1 = (h)obj;
            if (d != h1.a())
            {
                return false;
            }
            if (d != 0)
            {
                if (i != 0)
                {
                    int i1 = h1.l();
                    if (i1 != 0 && i != i1)
                    {
                        return false;
                    }
                }
                return b(h1);
            }
        }
        return true;
    }

    public boolean g()
    {
        int i1 = e.a(0, 0, g);
        int j1 = f.a(i1, 0, f.a());
        boolean flag = false;
        if (j1 == 0)
        {
            flag = true;
        }
        return flag;
    }

    public k h()
    {
        return com.google.tagmanager.a.k.a(new aw(this));
    }

    public int hashCode()
    {
        int i1 = i;
        if (i1 == 0)
        {
            i1 = b(d, 0, d);
            if (i1 == 0)
            {
                i1 = 1;
            }
            i = i1;
        }
        return i1;
    }

    public Iterator iterator()
    {
        return c();
    }

    protected int j()
    {
        return h;
    }

    protected boolean k()
    {
        return d >= c[h];
    }

    protected int l()
    {
        return i;
    }

    static 
    {
        int i1 = 1;
        ArrayList arraylist = new ArrayList();
        int j1 = i1;
        int l1;
        for (; i1 > 0; i1 = l1)
        {
            arraylist.add(Integer.valueOf(i1));
            l1 = j1 + i1;
            j1 = i1;
        }

        arraylist.add(Integer.valueOf(0x7fffffff));
        c = new int[arraylist.size()];
        for (int k1 = 0; k1 < c.length; k1++)
        {
            c[k1] = ((Integer)arraylist.get(k1)).intValue();
        }

    }
}
