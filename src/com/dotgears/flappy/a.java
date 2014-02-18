// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dotgears.flappy;

import com.dotgears.d;
import com.dotgears.e;
import com.dotgears.g;
import com.dotgears.j;
import com.dotgears.q;

// Referenced classes of package com.dotgears.flappy:
//            c

public class a extends q
{

    private e A;
    private int B;
    float q;
    float r;
    float s;
    float t;
    float u;
    boolean v;
    boolean w;
    int x;
    float y;
    int z;

    public a()
    {
        B = 30;
        a("bird", 20, 20, 14, 14);
        int ai[] = new int[12];
        ai[1] = 1;
        ai[2] = 2;
        ai[3] = 1;
        ai[5] = 1;
        ai[6] = 2;
        ai[7] = 1;
        ai[9] = 1;
        ai[10] = 2;
        ai[11] = 1;
        a(0, "flap", ai, 12, 30, false);
        a(1, "auto", ai, 12, 10, true);
        w = true;
        z = j.a() % 3;
        A = new e();
    }

    public void a()
    {
        super.a(80, 246);
        q = 0.0F;
        t = 0.0F;
        u = 1.0F;
        s = 0.4F;
        v = false;
        w = true;
        x = 0;
        a(1, true);
        z = j.a() % 3;
    }

    public void a(float f)
    {
        super.a(f);
        if (!w)
        {
            y = 0.0F;
            t = t + u;
            if (t > 8F)
            {
                t = 8F;
            }
            c = (int)((float)c + t);
            if (c > 400 - this.f)
            {
                c = 400 - this.f;
                u = 0.0F;
                t = 0.0F;
            }
            q = q + r;
            r = r + s;
            if (q < -20F)
            {
                q = -20F;
            }
            if (q > 90F)
            {
                q = 90F;
            }
            B = -1 + B;
            if (B == 0)
            {
                B = 30;
            }
            if (A.m)
            {
                A.a(f);
            }
            return;
        }
        x = 8 + x;
        if (x == 360)
        {
            x = 0;
        }
        y = 4F * j.b(x);
    }

    public void a(g g1)
    {
        if (!n)
        {
            return;
        }
        com.dotgears.i i = p[1 + 3 * z];
        if (j != null && !j.a)
        {
            i = p[j.j + 3 * z];
        }
        g1.a(i, b - g, (c - h) + (int)y, 1.0F, (int)q);
    }

    public void b()
    {
        if (w)
        {
            w = false;
        }
        while (c < 0 || v) 
        {
            return;
        }
        a(0, true);
        t = -5F;
        u = 0.3F;
        r = -10F;
        s = 0.4F;
        c.D.a(4, null, 5);
    }
}
