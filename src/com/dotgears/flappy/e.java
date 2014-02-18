// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dotgears.flappy;

import com.dotgears.g;
import com.dotgears.i;
import com.dotgears.m;
import com.dotgears.p;
import com.dotgears.r;

// Referenced classes of package com.dotgears.flappy:
//            c

public class e extends m
{

    public r a;
    public i b;
    public int c;
    public float d;
    public float e;
    public int f;

    public e()
    {
        b = g.D.b("text_game_over");
        a = new r();
    }

    public void a()
    {
        F = true;
        G = true;
        a.a(0.0F, 1.0F, 11, 1.0F);
        c = -1;
        d = -2F;
        e = 0.25F;
        f = 0;
        c.D.c(10, 0);
    }

    public void a(float f1)
    {
        a.a(f1);
        if (c < 0)
        {
            c = (int)((float)c + d);
            d = d + e;
        } else
        {
            c = 0;
        }
        f;
        JVM INSTR tableswitch 0 1: default 68
    //                   0 77
    //                   1 131;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        if (a.g)
        {
            f = 1;
            g.D.C.a(g.D.y, g.D.z, 10, 20, 30, 40);
            c.D.c(10, 0);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (g.D.C.k == 2)
        {
            f = 2;
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void a(g g1)
    {
        g1.a(b, 288 - b.b >> 1, 130 + c, a.a);
    }
}
