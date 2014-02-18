// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;

import java.io.Serializable;

// Referenced classes of package com.google.tagmanager.a:
//            c, h, aq, am

public abstract class ab extends c
    implements Serializable
{

    protected h b;

    public ab()
    {
        b = h.a;
    }

    public abstract ab a(ab ab1);

    public aq c()
    {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    public abstract ab d();

    public am p()
    {
        return d();
    }
}
