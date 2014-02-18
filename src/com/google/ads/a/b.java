// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.a;

import com.google.ads.AdView;
import com.google.ads.bt;
import com.google.ads.util.ad;

// Referenced classes of package com.google.ads.a:
//            a

class b
    implements Runnable
{

    final a a;
    final a b;

    b(a a1, a a2)
    {
        b = a1;
        a = a2;
        super();
    }

    public void run()
    {
        ((AdView)b.a.j.a()).removeView(a);
    }
}
