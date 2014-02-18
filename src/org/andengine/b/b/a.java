// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.b.b;

import org.andengine.d.a.a.b;
import org.andengine.opengl.util.e;

// Referenced classes of package org.andengine.b.b:
//            b

public class a extends b
    implements org.andengine.b.b.b
{

    public a()
    {
    }

    public a(int i)
    {
        super(i);
    }

    public void a(e e, org.andengine.b.a.a a1)
    {
        int i = -1 + size();
        do
        {
            if (i < 0)
            {
                return;
            }
            ((org.andengine.b.b.b)get(i)).a(e, a1);
            i--;
        } while (true);
    }
}
