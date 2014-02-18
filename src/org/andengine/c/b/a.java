// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.c.b;

import org.andengine.opengl.util.e;

// Referenced classes of package org.andengine.c.b:
//            e

public class a extends org.andengine.c.b.e
{

    protected org.andengine.b.a.a a;

    public a()
    {
        this(null);
    }

    public a(org.andengine.b.a.a a1)
    {
        a = a1;
    }

    public boolean a(org.andengine.input.a.a a1)
    {
        if (a == null)
        {
            return false;
        }
        a.a(a1);
        if (super.a(a1))
        {
            return true;
        } else
        {
            a.b(a1);
            return false;
        }
    }

    protected boolean b(org.andengine.input.a.a a1)
    {
        if (I instanceof a)
        {
            a.b(a1);
            boolean flag = super.b(a1);
            a.a(a1);
            return flag;
        } else
        {
            return super.b(a1);
        }
    }

    protected void f(e e1, org.andengine.b.a.a a1)
    {
        a.d(e1);
    }
}
