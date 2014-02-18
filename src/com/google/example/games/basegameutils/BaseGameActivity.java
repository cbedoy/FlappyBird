// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.example.games.basegameutils;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

// Referenced classes of package com.google.example.games.basegameutils:
//            b, a

public abstract class BaseGameActivity extends FragmentActivity
    implements b
{

    protected a n;
    protected int o;
    protected String p;
    protected boolean q;
    private String r[];

    protected BaseGameActivity()
    {
        o = 1;
        p = "BaseGameActivity";
        q = false;
        n = new a(this);
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        n.a(i, j, intent);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        n = new a(this);
        if (q)
        {
            n.a(q, p);
        }
        n.a(this, o, r);
    }

    protected void onStart()
    {
        super.onStart();
        n.a(this);
    }

    protected void onStop()
    {
        super.onStop();
        n.d();
    }
}
