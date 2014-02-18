// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;


final class p
{

    private final Object a;
    private final int b;

    p(Object obj, int i)
    {
        a = obj;
        b = i;
    }

    public boolean equals(Object obj)
    {
        p p1;
        if (obj instanceof p)
        {
            if (a == (p1 = (p)obj).a && b == p1.b)
            {
                return true;
            }
        }
        return false;
    }

    public int hashCode()
    {
        return 65535 * System.identityHashCode(a) + b;
    }
}
