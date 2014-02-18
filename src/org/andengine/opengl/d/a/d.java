// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.d.a;

import org.andengine.d.i.a;

// Referenced classes of package org.andengine.opengl.d.a:
//            a, c, b

public class d
{

    private static final boolean a = org.andengine.d.i.a.a(8);
    private int b;
    private final org.andengine.opengl.d.a.a c[];
    private int d;

    public d(int i)
    {
        c = new org.andengine.opengl.d.a.a[i];
    }

    public c a()
    {
        if (b != c.length)
        {
            throw new org.andengine.d.f.a((new StringBuilder("Not enough ")).append(org/andengine/opengl/d/a/a.getSimpleName()).append("s added to this ").append(getClass().getSimpleName()).append(".").toString());
        } else
        {
            return new c(d, c);
        }
    }

    public d a(int i, String s, int j, int k, boolean flag)
    {
        if (a)
        {
            c[b] = new b(i, s, j, k, flag, d);
        } else
        {
            c[b] = new org.andengine.opengl.d.a.a(i, s, j, k, flag, d);
        }
        k;
        JVM INSTR lookupswitch 2: default 60
    //                   5121: 144
    //                   5126: 120;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException((new StringBuilder("Unexpected pType: '")).append(k).append("'.").toString());
_L3:
        d = d + j * 4;
_L5:
        b = 1 + b;
        return this;
_L2:
        d = d + j * 1;
        if (true) goto _L5; else goto _L4
_L4:
    }

}
