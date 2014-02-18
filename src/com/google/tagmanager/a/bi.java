// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;

import java.util.Iterator;

// Referenced classes of package com.google.tagmanager.a:
//            bg, ai

class bi
    implements Iterator
{

    Iterator a;
    final bg b;

    bi(bg bg1)
    {
        b = bg1;
        super();
        a = bg.a(b).iterator();
    }

    public String a()
    {
        return (String)a.next();
    }

    public boolean hasNext()
    {
        return a.hasNext();
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
