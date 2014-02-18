// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class ba
    implements Iterator
{

    ba()
    {
    }

    public boolean hasNext()
    {
        return false;
    }

    public Object next()
    {
        throw new NoSuchElementException();
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }
}
