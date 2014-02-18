// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.ui.activity;

import org.andengine.b.a;
import org.andengine.c.b.e;
import org.andengine.ui.c;
import org.andengine.ui.d;

// Referenced classes of package org.andengine.ui.activity:
//            BaseGameActivity

class b
    implements c
{

    final BaseGameActivity a;
    private final d b;

    b(BaseGameActivity basegameactivity, d d)
    {
        a = basegameactivity;
        b = d;
        super();
    }

    public void a(e e)
    {
        a.k.a(e);
        try
        {
            org.andengine.d.e.a.b((new StringBuilder(String.valueOf(a.getClass().getSimpleName()))).append(".onPopulateScene").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
            a.a(e, b);
            return;
        }
        catch (Throwable throwable)
        {
            org.andengine.d.e.a.b((new StringBuilder(String.valueOf(a.getClass().getSimpleName()))).append(".onPopulateScene failed.").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString(), throwable);
        }
    }
}
