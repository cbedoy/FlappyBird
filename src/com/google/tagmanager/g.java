// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager;

import android.util.Log;

// Referenced classes of package com.google.tagmanager:
//            j, k

class g
    implements j
{

    private k a;

    g()
    {
        a = k.d;
    }

    public void a(String s)
    {
        if (a.ordinal() <= k.e.ordinal())
        {
            Log.e("GoogleTagManager", s);
        }
    }

    public void b(String s)
    {
        if (a.ordinal() <= k.d.ordinal())
        {
            Log.w("GoogleTagManager", s);
        }
    }

    public void c(String s)
    {
        if (a.ordinal() <= k.c.ordinal())
        {
            Log.i("GoogleTagManager", s);
        }
    }

    public void d(String s)
    {
        if (a.ordinal() <= k.a.ordinal())
        {
            Log.v("GoogleTagManager", s);
        }
    }
}
