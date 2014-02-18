// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;


// Referenced classes of package com.google.tagmanager.a:
//            t, y, q, w, 
//            k, m, o

public abstract class x extends t
    implements y
{

    private final q a;

    protected x()
    {
        a = q.a();
    }

    protected x(w w1)
    {
        a = w.a(w1);
    }

    static q a(x x1)
    {
        return x1.a;
    }

    protected boolean I()
    {
        return a.e();
    }

    protected void R()
    {
        a.c();
    }

    protected boolean a(k k, m m, o o, int i)
    {
        return t.a(a, p(), k, m, o, i);
    }
}
