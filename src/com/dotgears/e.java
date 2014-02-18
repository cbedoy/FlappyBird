// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dotgears;


// Referenced classes of package com.dotgears:
//            q, d, g

public class e extends q
{

    public e()
    {
        a("blink", 10, 10, 4, 4);
        int ai[] = new int[5];
        ai[1] = 1;
        ai[2] = 2;
        ai[3] = 1;
        a(0, "blink", ai, 5, 10, false);
        m = false;
        n = false;
        a(0, true);
    }

    public void a(float f)
    {
        if (m)
        {
            super.a(f);
            if (j != null && j.a)
            {
                m = false;
                n = false;
                return;
            }
        }
    }

    public void a(int i, int j)
    {
        super.a(i, j);
        a(0, true);
    }

    public void a(g g)
    {
        if (!n)
        {
            return;
        } else
        {
            super.a(g);
            return;
        }
    }
}
