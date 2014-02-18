// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.input.a.a;

import android.view.MotionEvent;
import org.andengine.d.a.b.f;
import org.andengine.input.a.a;

// Referenced classes of package org.andengine.input.a.a:
//            a, e

class c extends f
{

    final org.andengine.input.a.a.a a;
    private a d;

    c(org.andengine.input.a.a.a a1)
    {
        a = a1;
        super();
    }

    protected void a()
    {
        super.a();
        a a1 = d;
        a1.k().recycle();
        a1.a();
    }

    public void a(a a1)
    {
        d = a1;
    }

    public void run()
    {
        org.andengine.input.a.a.a.a(a).a(d);
    }
}
