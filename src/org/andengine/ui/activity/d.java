// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.ui.activity;


// Referenced classes of package org.andengine.ui.activity:
//            BaseGameActivity

class d
    implements Runnable
{

    final BaseGameActivity a;

    d(BaseGameActivity basegameactivity)
    {
        a = basegameactivity;
        super();
    }

    public void run()
    {
        a.s();
    }
}
