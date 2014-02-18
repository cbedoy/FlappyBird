// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dotgears.flappy;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;

// Referenced classes of package com.dotgears.flappy:
//            d

public class SplashScreen extends Activity
{

    private static int a = 2000;

    public SplashScreen()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030000);
        (new Handler()).postDelayed(new d(this), a);
    }

}
