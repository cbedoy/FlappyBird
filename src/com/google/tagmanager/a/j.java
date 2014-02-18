// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;

import java.io.OutputStream;
import java.util.ArrayList;

// Referenced classes of package com.google.tagmanager.a:
//            aj, h

public final class j extends OutputStream
{

    private static final byte a[] = new byte[0];
    private final int b;
    private final ArrayList c;
    private int d;
    private byte e[];
    private int f;

    j(int i)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException("Buffer size < 0");
        } else
        {
            b = i;
            c = new ArrayList();
            e = new byte[i];
            return;
        }
    }

    private void a(int i)
    {
        c.add(new aj(e));
        d = d + e.length;
        e = new byte[Math.max(b, Math.max(i, d >>> 1))];
        f = 0;
    }

    private void c()
    {
        if (f < e.length)
        {
            if (f > 0)
            {
                byte abyte0[] = new byte[f];
                System.arraycopy(e, 0, abyte0, 0, f);
                c.add(new aj(abyte0));
            }
        } else
        {
            c.add(new aj(e));
            e = a;
        }
        d = d + f;
        f = 0;
    }

    public h a()
    {
        this;
        JVM INSTR monitorenter ;
        h h1;
        c();
        h1 = h.a(c);
        this;
        JVM INSTR monitorexit ;
        return h1;
        Exception exception;
        exception;
        throw exception;
    }

    public int b()
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        int k;
        i = d;
        k = f;
        int l = i + k;
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    public String toString()
    {
        Object aobj[] = new Object[2];
        aobj[0] = Integer.toHexString(System.identityHashCode(this));
        aobj[1] = Integer.valueOf(b());
        return String.format("<ByteString.Output@%s size=%d>", aobj);
    }

    public void write(int i)
    {
        this;
        JVM INSTR monitorenter ;
        if (f == e.length)
        {
            a(1);
        }
        byte abyte0[] = e;
        int k = f;
        f = k + 1;
        abyte0[k] = (byte)i;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void write(byte abyte0[], int i, int k)
    {
        this;
        JVM INSTR monitorenter ;
        if (k > e.length - f) goto _L2; else goto _L1
_L1:
        System.arraycopy(abyte0, i, e, f, k);
        f = k + f;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        int l;
        l = e.length - f;
        System.arraycopy(abyte0, i, e, f, l);
        int i1;
        int j1;
        i1 = i + l;
        j1 = k - l;
        a(j1);
        System.arraycopy(abyte0, i1, e, 0, j1);
        f = j1;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

}
