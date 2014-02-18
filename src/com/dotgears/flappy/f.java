// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dotgears.flappy;

import com.dotgears.g;
import com.dotgears.i;
import com.dotgears.m;
import com.dotgears.r;

public class f extends m
{

    public r a;
    public i b;
    public i c;
    int d;

    public f()
    {
        b = g.D.b("text_ready");
        c = g.D.b("tutorial");
        a = new r();
    }

    public void a()
    {
        F = true;
        G = true;
        a.a(0.0F, 1.0F, 0, 0.5F);
        d = 0;
    }

    public void a(float f1)
    {
        a.a(f1);
        d;
        JVM INSTR tableswitch 0 2: default 40
    //                   0 41
    //                   1 40
    //                   2 57;
           goto _L1 _L2 _L1 _L3
_L1:
        return;
_L2:
        if (a.g)
        {
            d = 1;
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (a.g)
        {
            F = true;
            G = false;
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void a(g g1)
    {
        g1.a(b, 288 - b.b >> 1, 146, a.a);
        g1.a(c, 288 - c.b >> 1, 220, a.a);
    }
}
