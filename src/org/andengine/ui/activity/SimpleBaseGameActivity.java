// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.ui.activity;

import org.andengine.c.b.e;
import org.andengine.ui.b;
import org.andengine.ui.c;
import org.andengine.ui.d;

// Referenced classes of package org.andengine.ui.activity:
//            BaseGameActivity

public abstract class SimpleBaseGameActivity extends BaseGameActivity
{

    public SimpleBaseGameActivity()
    {
    }

    public final void a(e e, d d1)
    {
        d1.a();
    }

    public final void a(b b1)
    {
        l();
        b1.a();
    }

    public final void a(c c1)
    {
        c1.a(m());
    }

    protected abstract void l();

    protected abstract e m();
}
