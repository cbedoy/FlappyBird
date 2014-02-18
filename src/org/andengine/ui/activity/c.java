// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.ui.activity;

import org.andengine.d.e.a;
import org.andengine.ui.b;

// Referenced classes of package org.andengine.ui.activity:
//            BaseGameActivity

class c
    implements b
{

    final BaseGameActivity a;
    private final org.andengine.ui.c b;

    c(BaseGameActivity basegameactivity, org.andengine.ui.c c1)
    {
        a = basegameactivity;
        b = c1;
        super();
    }

    public void a()
    {
        try
        {
            org.andengine.d.e.a.b((new StringBuilder(String.valueOf(a.getClass().getSimpleName()))).append(".onCreateScene").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
            a.a(b);
            return;
        }
        catch (Throwable throwable)
        {
            org.andengine.d.e.a.b((new StringBuilder(String.valueOf(a.getClass().getSimpleName()))).append(".onCreateScene failed.").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString(), throwable);
        }
    }
}
