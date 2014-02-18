// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dotgears;


// Referenced classes of package com.dotgears:
//            j

public class r
{

    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public int f;
    public boolean g;
    private int h;
    private int i;
    private float j;

    public r()
    {
        g = true;
        a = 0.0F;
    }

    public void a(float f1)
    {
        if (!g) goto _L2; else goto _L1
_L1:
        return;
_L2:
        i = 1 + i;
        b = (float)i * j;
        f;
        JVM INSTR tableswitch 0 21: default 140
    //                   0 140
    //                   1 188
    //                   2 206
    //                   3 224
    //                   4 242
    //                   5 260
    //                   6 278
    //                   7 296
    //                   8 314
    //                   9 332
    //                   10 350
    //                   11 368
    //                   12 386
    //                   13 404
    //                   14 422
    //                   15 440
    //                   16 458
    //                   17 476
    //                   18 494
    //                   19 512
    //                   20 530
    //                   21 548;
           goto _L3 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24
_L24:
        break MISSING_BLOCK_LABEL_548;
_L3:
        break; /* Loop/switch isn't completed */
_L4:
        break; /* Loop/switch isn't completed */
_L26:
        a = b * e + c;
        if (i == h)
        {
            g = true;
            a = d;
            b = 1.0F;
            return;
        }
        if (true) goto _L1; else goto _L25
_L25:
        b = com.dotgears.j.b((int)(100F * b));
          goto _L26
_L5:
        b = com.dotgears.j.c((int)(100F * b));
          goto _L26
_L6:
        b = com.dotgears.j.d((int)(100F * b));
          goto _L26
_L7:
        b = com.dotgears.j.e((int)(100F * b));
          goto _L26
_L8:
        b = com.dotgears.j.f((int)(100F * b));
          goto _L26
_L9:
        b = com.dotgears.j.g((int)(100F * b));
          goto _L26
_L10:
        b = com.dotgears.j.h((int)(100F * b));
          goto _L26
_L11:
        b = com.dotgears.j.i((int)(100F * b));
          goto _L26
_L12:
        b = com.dotgears.j.j((int)(100F * b));
          goto _L26
_L13:
        b = com.dotgears.j.k((int)(100F * b));
          goto _L26
_L14:
        b = com.dotgears.j.l((int)(100F * b));
          goto _L26
_L15:
        b = com.dotgears.j.m((int)(100F * b));
          goto _L26
_L16:
        b = com.dotgears.j.n((int)(100F * b));
          goto _L26
_L17:
        b = com.dotgears.j.o((int)(100F * b));
          goto _L26
_L18:
        b = com.dotgears.j.p((int)(100F * b));
          goto _L26
_L19:
        b = com.dotgears.j.q((int)(100F * b));
          goto _L26
_L20:
        b = com.dotgears.j.r((int)(100F * b));
          goto _L26
_L21:
        b = com.dotgears.j.s((int)(100F * b));
          goto _L26
_L22:
        b = com.dotgears.j.t((int)(100F * b));
          goto _L26
_L23:
        b = com.dotgears.j.u((int)(100F * b));
          goto _L26
        b = com.dotgears.j.v((int)(100F * b));
          goto _L26
    }

    public void a(float f1, float f2, int k, float f3)
    {
        c = f1;
        d = f2;
        e = d - c;
        h = (int)(60F * f3);
        j = 1.0F / (float)h;
        i = 0;
        f = k;
        g = false;
        a = c;
    }
}
