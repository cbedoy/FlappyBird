// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import com.google.ads.a.w;

// Referenced classes of package com.google.ads:
//            bd, ba

class bf
    implements Runnable
{

    final ba a;
    final bd b;

    bf(bd bd1, ba ba)
    {
        b = bd1;
        a = ba;
        super();
    }

    public void run()
    {
        bd.b(b).b(a);
    }
}
