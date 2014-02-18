// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.c.a.b;


// Referenced classes of package org.andengine.opengl.c.a.b:
//            b

public abstract class a
    implements b
{

    protected int a;
    protected int b;
    protected int c;
    protected int d;

    public a(int i, int j, int k, int l)
    {
        a = i;
        b = j;
        c = k;
        d = l;
    }

    public int a()
    {
        return a;
    }

    public void a(int i)
    {
        a = i;
    }

    public int b()
    {
        return b;
    }

    public void b(int i)
    {
        b = i;
    }

    public int c()
    {
        return c;
    }

    public int d()
    {
        return d;
    }

    public String toString()
    {
        return (new StringBuilder(String.valueOf(getClass().getSimpleName()))).append("( ").append(c()).append("x").append(d()).append(" @ ").append(a).append("/").append(b).append(" )").toString();
    }
}
