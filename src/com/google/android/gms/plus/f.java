// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.FrameLayout;

// Referenced classes of package com.google.android.gms.plus:
//            k, i, j, h

public class f extends FrameLayout
{

    public f(Context context, int l)
    {
        super(context);
        Button button = new Button(context);
        button.setEnabled(false);
        button.setBackgroundDrawable(a().a(l));
        Point point = a(l);
        addView(button, new android.widget.FrameLayout.LayoutParams(point.x, point.y, 17));
    }

    private Point a(int l)
    {
        int i1;
        int j1;
        Point point;
        i1 = 24;
        j1 = 20;
        point = new Point();
        l;
        JVM INSTR tableswitch 0 2: default 44
    //                   0 117
    //                   1 111
    //                   2 123;
           goto _L1 _L2 _L3 _L4
_L1:
        int k1 = i1;
        i1 = 38;
        j1 = k1;
_L6:
        android.util.DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
        float f1 = TypedValue.applyDimension(1, i1, displaymetrics);
        float f2 = TypedValue.applyDimension(1, j1, displaymetrics);
        point.x = (int)(0.5D + (double)f1);
        point.y = (int)(0.5D + (double)f2);
        return point;
_L3:
        i1 = 32;
        continue; /* Loop/switch isn't completed */
_L2:
        j1 = 14;
        continue; /* Loop/switch isn't completed */
_L4:
        i1 = 50;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private k a()
    {
        Object obj = new i(getContext(), null);
        if (!((k) (obj)).a())
        {
            obj = new j(getContext(), null);
        }
        if (!((k) (obj)).a())
        {
            obj = new h(getContext(), null);
        }
        return ((k) (obj));
    }
}
