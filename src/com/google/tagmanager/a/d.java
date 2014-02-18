// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;

import java.io.IOException;

// Referenced classes of package com.google.tagmanager.a:
//            aq, o, a, c, 
//            bf, am, af, h, 
//            k

public abstract class d
    implements aq
{

    private static final o a = o.a();

    public d()
    {
    }

    private bf a(am am1)
    {
        if (am1 instanceof a)
        {
            return ((a)am1).Q();
        }
        if (am1 instanceof c)
        {
            return ((c)am1).b();
        } else
        {
            return new bf(am1);
        }
    }

    private am b(am am1)
    {
        if (am1 != null && !am1.j())
        {
            throw a(am1).a().a(am1);
        } else
        {
            return am1;
        }
    }

    public am a(h h1, o o1)
    {
        k k1;
        am am1;
        af af2;
        try
        {
            k1 = h1.h();
            am1 = (am)b(k1, o1);
        }
        catch (af af1)
        {
            throw af1;
        }
        k1.a(0);
        return am1;
        af2;
        throw af2.a(am1);
        IOException ioexception;
        ioexception;
        throw new RuntimeException("Reading from a ByteString threw an IOException (should never happen).", ioexception);
    }

    public am b(h h1, o o1)
    {
        return b(a(h1, o1));
    }

    public Object c(h h1, o o1)
    {
        return b(h1, o1);
    }

}
