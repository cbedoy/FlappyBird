// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;


// Referenced classes of package com.google.tagmanager.a:
//            i, au, aj, ar, 
//            as

class av
    implements i
{

    int a;
    final ar b;
    private final au c;
    private i d;

    private av(ar ar1)
    {
        b = ar1;
        super();
        c = new au(ar1, null);
        d = c.a().c();
        a = ar1.a();
    }

    av(ar ar1, as as)
    {
        this(ar1);
    }

    public Byte a()
    {
        return Byte.valueOf(b());
    }

    public byte b()
    {
        if (!d.hasNext())
        {
            d = c.a().c();
        }
        a = -1 + a;
        return d.b();
    }

    public boolean hasNext()
    {
        return a > 0;
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
