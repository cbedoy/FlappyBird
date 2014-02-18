// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dotgears.flappy;

import android.content.Intent;
import com.dotgears.GameActivity;

// Referenced classes of package com.dotgears.flappy:
//            SplashScreen

class d
    implements Runnable
{

    final SplashScreen a;

    d(SplashScreen splashscreen)
    {
        a = splashscreen;
        super();
    }

    public void run()
    {
        Intent intent = new Intent(a, com/dotgears/GameActivity);
        a.startActivity(intent);
        a.finish();
    }
}
