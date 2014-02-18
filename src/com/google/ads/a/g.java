// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.a;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.google.ads.a:
//            e

class g
    implements android.view.View.OnTouchListener
{

    final e a;

    g(e e)
    {
        a = e;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        return motionevent.getAction() == 2;
    }
}
