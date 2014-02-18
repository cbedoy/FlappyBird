// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.drawable.Drawable;

// Referenced classes of package com.google.android.gms.internal:
//            ch

final class cl extends android.graphics.drawable.Drawable.ConstantState
{

    int a;
    int b;

    cl(cl cl1)
    {
        if (cl1 != null)
        {
            a = cl1.a;
            b = cl1.b;
        }
    }

    public int getChangingConfigurations()
    {
        return a;
    }

    public Drawable newDrawable()
    {
        return new ch(this);
    }
}
