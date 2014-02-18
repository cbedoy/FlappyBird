// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;

import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.tagmanager.a:
//            aj, j, ar, ac, 
//            i, k

public abstract class h
    implements Iterable
{

    public static final h a = new aj(new byte[0]);
    static final boolean b;

    h()
    {
    }

    public static h a(Iterable iterable)
    {
        Object obj;
        if (!(iterable instanceof Collection))
        {
            ArrayList arraylist = new ArrayList();
            for (Iterator iterator1 = iterable.iterator(); iterator1.hasNext(); arraylist.add((h)iterator1.next())) { }
            obj = arraylist;
        } else
        {
            obj = (Collection)iterable;
        }
        if (((Collection) (obj)).isEmpty())
        {
            return a;
        } else
        {
            return a(((Collection) (obj)).iterator(), ((Collection) (obj)).size());
        }
    }

    private static h a(Iterator iterator1, int i1)
    {
        if (!b && i1 < 1)
        {
            throw new AssertionError();
        }
        if (i1 == 1)
        {
            return (h)iterator1.next();
        } else
        {
            int j1 = i1 >>> 1;
            return a(iterator1, j1).a(a(iterator1, i1 - j1));
        }
    }

    public static h a(byte abyte0[], int i1, int j1)
    {
        byte abyte1[] = new byte[j1];
        System.arraycopy(abyte0, i1, abyte1, 0, j1);
        return new aj(abyte1);
    }

    public static j i()
    {
        return new j(128);
    }

    public abstract int a();

    protected abstract int a(int i1, int j1, int k1);

    public h a(h h1)
    {
        int i1 = a();
        int j1 = h1.a();
        if ((long)i1 + (long)j1 >= 0x7fffffffL)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("ByteString would be too long: ").append(i1).append("+").append(j1).toString());
        } else
        {
            return ar.a(this, h1);
        }
    }

    public abstract String a(String s);

    void a(OutputStream outputstream, int i1, int j1)
    {
        if (i1 < 0)
        {
            throw new IndexOutOfBoundsException((new StringBuilder()).append("Source offset < 0: ").append(i1).toString());
        }
        if (j1 < 0)
        {
            throw new IndexOutOfBoundsException((new StringBuilder()).append("Length < 0: ").append(j1).toString());
        }
        if (i1 + j1 > a())
        {
            throw new IndexOutOfBoundsException((new StringBuilder()).append("Source end offset exceeded: ").append(i1 + j1).toString());
        }
        if (j1 > 0)
        {
            b(outputstream, i1, j1);
        }
    }

    protected abstract void a(byte abyte0[], int i1, int j1, int k1);

    protected abstract int b(int i1, int j1, int k1);

    abstract void b(OutputStream outputstream, int i1, int j1);

    public void b(byte abyte0[], int i1, int j1, int k1)
    {
        if (i1 < 0)
        {
            throw new IndexOutOfBoundsException((new StringBuilder()).append("Source offset < 0: ").append(i1).toString());
        }
        if (j1 < 0)
        {
            throw new IndexOutOfBoundsException((new StringBuilder()).append("Target offset < 0: ").append(j1).toString());
        }
        if (k1 < 0)
        {
            throw new IndexOutOfBoundsException((new StringBuilder()).append("Length < 0: ").append(k1).toString());
        }
        if (i1 + k1 > a())
        {
            throw new IndexOutOfBoundsException((new StringBuilder()).append("Source end offset < 0: ").append(i1 + k1).toString());
        }
        if (j1 + k1 > abyte0.length)
        {
            throw new IndexOutOfBoundsException((new StringBuilder()).append("Target end offset < 0: ").append(j1 + k1).toString());
        }
        if (k1 > 0)
        {
            a(abyte0, i1, j1, k1);
        }
    }

    public abstract i c();

    public boolean d()
    {
        return a() == 0;
    }

    public byte[] e()
    {
        int i1 = a();
        if (i1 == 0)
        {
            return ac.a;
        } else
        {
            byte abyte0[] = new byte[i1];
            a(abyte0, 0, 0, i1);
            return abyte0;
        }
    }

    public String f()
    {
        String s;
        try
        {
            s = a("UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            throw new RuntimeException("UTF-8 not supported?", unsupportedencodingexception);
        }
        return s;
    }

    public abstract boolean g();

    public abstract k h();

    public abstract int hashCode();

    public Iterator iterator()
    {
        return c();
    }

    protected abstract int j();

    protected abstract boolean k();

    protected abstract int l();

    public String toString()
    {
        Object aobj[] = new Object[2];
        aobj[0] = Integer.toHexString(System.identityHashCode(this));
        aobj[1] = Integer.valueOf(a());
        return String.format("<ByteString@%s size=%d>", aobj);
    }

    static 
    {
        boolean flag;
        if (!com/google/tagmanager/a/h.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
    }
}
