// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dotgears;

import com.google.ads.AdView;

// Referenced classes of package com.dotgears:
//            GameActivity

class b
    implements Runnable
{

    final GameActivity a;

    b(GameActivity gameactivity)
    {
        a = gameactivity;
        super();
    }

    public void run()
    {
        a.a.setVisibility(0);
    }
}
