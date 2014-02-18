// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.view.View;

// Referenced classes of package com.google.android.gms.internal:
//            p, am, al, r, 
//            aj

public class ai
{

    protected r a;
    protected al b;

    private ai(r r1, int i)
    {
        a = r1;
        a(i);
    }

    ai(r r1, int i, aj aj)
    {
        this(r1, i);
    }

    public static ai a(r r1, int i)
    {
        if (p.b())
        {
            return new am(r1, i);
        } else
        {
            return new ai(r1, i);
        }
    }

    public void a()
    {
        a.a(b.a, b.a());
    }

    protected void a(int i)
    {
        b = new al(i, new Binder(), null);
    }

    public void a(View view)
    {
    }

    public IBinder b()
    {
        return b.a;
    }
}
