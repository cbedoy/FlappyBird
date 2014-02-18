// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;


// Referenced classes of package com.google.tagmanager.a:
//            ap, bf, an

public abstract class c
    implements ap
{

    protected int a;
    private boolean b;

    public c()
    {
        b = true;
        a = -1;
    }

    public ap a()
    {
        throw new UnsupportedOperationException("clone() should be implemented by subclasses.");
    }

    bf b()
    {
        return new bf(this);
    }

    public Object clone()
    {
        return a();
    }

    public an n()
    {
        throw new UnsupportedOperationException("toBuilder() is not supported in mutable messages.");
    }

    public an o()
    {
        throw new UnsupportedOperationException("newBuilderForType() is not supported in mutable messages.");
    }
}
