// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;


// Referenced classes of package com.google.tagmanager.a:
//            an, bf, am, k, 
//            o

public abstract class b
    implements an
{

    public b()
    {
    }

    protected static bf a(am am)
    {
        return new bf(am);
    }

    public abstract b b(k k, o o);

    public an c(k k, o o)
    {
        return b(k, o);
    }

    public Object clone()
    {
        return g();
    }

    public abstract b g();
}
