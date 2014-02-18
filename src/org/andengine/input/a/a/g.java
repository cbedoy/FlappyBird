// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.input.a.a;

import android.view.MotionEvent;

// Referenced classes of package org.andengine.input.a.a:
//            a

public class g extends a
{

    public g()
    {
    }

    public void a(MotionEvent motionevent)
    {
        a(motionevent.getX(), motionevent.getY(), motionevent.getAction(), 0, motionevent);
    }
}
