// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.input.a.a;

import android.view.MotionEvent;

// Referenced classes of package org.andengine.input.a.a:
//            a

public class f extends a
{

    public f()
    {
    }

    private void a(int i, MotionEvent motionevent)
    {
        int j = c(motionevent);
        int k = motionevent.getPointerId(j);
        a(motionevent.getX(j), motionevent.getY(j), i, k, motionevent);
    }

    private void b(MotionEvent motionevent)
    {
        int i = -1 + motionevent.getPointerCount();
        do
        {
            if (i < 0)
            {
                return;
            }
            int j = motionevent.getPointerId(i);
            a(motionevent.getX(i), motionevent.getY(i), 2, j, motionevent);
            i--;
        } while (true);
    }

    private static int c(MotionEvent motionevent)
    {
        return (0xff00 & motionevent.getAction()) >> 8;
    }

    public void a(MotionEvent motionevent)
    {
        int i = 0xff & motionevent.getAction();
        switch (i)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder("Invalid Action detected: ")).append(i).toString());

        case 0: // '\0'
        case 5: // '\005'
            a(0, motionevent);
            return;

        case 1: // '\001'
        case 6: // '\006'
            a(1, motionevent);
            return;

        case 3: // '\003'
        case 4: // '\004'
            a(i, motionevent);
            return;

        case 2: // '\002'
            b(motionevent);
            return;
        }
    }
}
