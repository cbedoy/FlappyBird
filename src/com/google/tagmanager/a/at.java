// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

// Referenced classes of package com.google.tagmanager.a:
//            ar, h, as

class at
{

    private final Deque a;

    private at()
    {
        a = new ArrayDeque(ar.b().length);
    }

    at(as as)
    {
        this();
    }

    private int a(int i)
    {
        int j = Arrays.binarySearch(ar.b(), i);
        if (j < 0)
        {
            j = -1 + -(j + 1);
        }
        return j;
    }

    static h a(at at1, h h1, h h2)
    {
        return at1.a(h1, h2);
    }

    private h a(h h1, h h2)
    {
        a(h1);
        a(h2);
        Object obj;
        for (obj = (h)a.pop(); !a.isEmpty(); obj = new ar((h)a.pop(), ((h) (obj)), null)) { }
        return ((h) (obj));
    }

    private void a(h h1)
    {
        if (h1.k())
        {
            b(h1);
            return;
        }
        if (h1 instanceof ar)
        {
            ar ar1 = (ar)h1;
            a(ar.a(ar1));
            a(ar.b(ar1));
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Has a new type of ByteString been created? Found ").append(h1.getClass()).toString());
        }
    }

    private void b(h h1)
    {
        int i = a(h1.a());
        int j = ar.b()[i + 1];
        if (a.isEmpty() || ((h)a.peek()).a() >= j)
        {
            a.push(h1);
            return;
        }
        int k = ar.b()[i];
        Object obj;
        for (obj = (h)a.pop(); !a.isEmpty() && ((h)a.peek()).a() < k; obj = new ar((h)a.pop(), ((h) (obj)), null)) { }
        ar ar1 = new ar(((h) (obj)), h1, null);
        do
        {
            if (a.isEmpty())
            {
                break;
            }
            int l = a(ar1.a());
            int i1 = ar.b()[l + 1];
            if (((h)a.peek()).a() >= i1)
            {
                break;
            }
            ar1 = new ar((h)a.pop(), ar1, null);
        } while (true);
        a.push(ar1);
    }
}
