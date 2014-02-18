// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.b.b;

import org.andengine.d.a.a.b;

// Referenced classes of package org.andengine.b.b:
//            c

public class d extends b
    implements c
{

    public d()
    {
    }

    public d(int i)
    {
        super(i);
    }

    public void a_(float f)
    {
        int i = -1 + size();
        do
        {
            if (i < 0)
            {
                return;
            }
            ((c)get(i)).a_(f);
            i--;
        } while (true);
    }
}
