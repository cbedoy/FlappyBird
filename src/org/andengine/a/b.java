// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.a;

import java.util.ArrayList;

// Referenced classes of package org.andengine.a:
//            d, c

public abstract class b
    implements d
{

    protected final ArrayList a = new ArrayList();
    protected float b;

    public b()
    {
        b = 1.0F;
    }

    public float a()
    {
        return b;
    }

    public void a(c c1)
    {
        a.add(c1);
    }

    public void b()
    {
        ArrayList arraylist = a;
        int i = -1 + arraylist.size();
        do
        {
            if (i < 0)
            {
                return;
            }
            c c1 = (c)arraylist.get(i);
            c1.e();
            c1.f();
            i--;
        } while (true);
    }

    public boolean b(c c1)
    {
        return a.remove(c1);
    }
}
