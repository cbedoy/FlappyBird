// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.google.android.gms.internal:
//            ck

final class cj extends Drawable
{

    private static final cj a = new cj();
    private static final ck b = new ck(null);

    private cj()
    {
    }

    static cj a()
    {
        return a;
    }

    public void draw(Canvas canvas)
    {
    }

    public android.graphics.drawable.Drawable.ConstantState getConstantState()
    {
        return b;
    }

    public int getOpacity()
    {
        return -2;
    }

    public void setAlpha(int i)
    {
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
    }

}
