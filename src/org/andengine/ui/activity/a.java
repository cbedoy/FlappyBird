// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.ui.activity;

import org.andengine.ui.d;

// Referenced classes of package org.andengine.ui.activity:
//            BaseGameActivity

class a
    implements d
{

    final BaseGameActivity a;

    a(BaseGameActivity basegameactivity)
    {
        a = basegameactivity;
        super();
    }

    public void a()
    {
        try
        {
            org.andengine.d.e.a.b((new StringBuilder(String.valueOf(a.getClass().getSimpleName()))).append(".onGameCreated").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
            a.r();
        }
        catch (Throwable throwable)
        {
            org.andengine.d.e.a.b((new StringBuilder(String.valueOf(a.getClass().getSimpleName()))).append(".onGameCreated failed.").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString(), throwable);
        }
        BaseGameActivity.a(a);
    }
}
