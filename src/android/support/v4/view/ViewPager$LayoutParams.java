// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

// Referenced classes of package android.support.v4.view:
//            ViewPager

public class b extends android.view.youtParams
{

    public boolean a;
    public int b;
    float c;
    boolean d;
    int e;
    int f;

    public ()
    {
        super(-1, -1);
        c = 0.0F;
    }

    public c(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        c = 0.0F;
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, ViewPager.f());
        b = typedarray.getInteger(0, 48);
        typedarray.recycle();
    }
}
