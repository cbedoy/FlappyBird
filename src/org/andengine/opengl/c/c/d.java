// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.c.c;

import org.andengine.opengl.c.a.a;
import org.andengine.opengl.c.a.b.b;

// Referenced classes of package org.andengine.opengl.c.c:
//            c

public class d
{

    public static c a(a a1, b b1, int i, int j)
    {
        return a(a1, b1, i, j, false);
    }

    public static c a(a a1, b b1, int i, int j, boolean flag)
    {
        c c1 = new c(a1, i, j, b1.c(), b1.d(), flag);
        a1.a(b1, i, j);
        return c1;
    }
}
