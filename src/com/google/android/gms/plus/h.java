// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

// Referenced classes of package com.google.android.gms.plus:
//            k, g

class h
    implements k
{

    private Context a;

    private h(Context context)
    {
        a = context;
    }

    h(Context context, g g)
    {
        this(context);
    }

    public Drawable a(int i)
    {
        return a.getResources().getDrawable(0x1080004);
    }

    public boolean a()
    {
        return true;
    }
}
