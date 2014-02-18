// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.internal.be;
import com.google.android.gms.internal.dq;

// Referenced classes of package com.google.android.gms.plus:
//            d, e

public final class PlusOneButton extends FrameLayout
{

    private View a;
    private int b;
    private int c;
    private String d;
    private int e;
    private e f;

    public PlusOneButton(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = a(context, attributeset);
        c = b(context, attributeset);
        e = -1;
        a(getContext());
        if (!isInEditMode());
    }

    protected static int a(Context context, AttributeSet attributeset)
    {
        String s = dq.a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "size", context, attributeset, true, false, "PlusOneButton");
        if ("SMALL".equalsIgnoreCase(s))
        {
            return 0;
        }
        if ("MEDIUM".equalsIgnoreCase(s))
        {
            return 1;
        }
        return !"TALL".equalsIgnoreCase(s) ? 3 : 2;
    }

    static View a(PlusOneButton plusonebutton)
    {
        return plusonebutton.a;
    }

    private void a(Context context)
    {
        if (a != null)
        {
            removeView(a);
        }
        a = be.a(context, b, c, d, e);
        setOnPlusOneClickListener(f);
        addView(a);
    }

    protected static int b(Context context, AttributeSet attributeset)
    {
        String s = dq.a("http://schemas.android.com/apk/lib/com.google.android.gms.plus", "annotation", context, attributeset, true, false, "PlusOneButton");
        byte byte0;
        if ("INLINE".equalsIgnoreCase(s))
        {
            byte0 = 2;
        } else
        {
            boolean flag = "NONE".equalsIgnoreCase(s);
            byte0 = 0;
            if (!flag)
            {
                return 1;
            }
        }
        return byte0;
    }

    static int b(PlusOneButton plusonebutton)
    {
        return plusonebutton.e;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        a.layout(0, 0, k - i, l - j);
    }

    protected void onMeasure(int i, int j)
    {
        View view = a;
        measureChild(view, i, j);
        setMeasuredDimension(view.getMeasuredWidth(), view.getMeasuredHeight());
    }

    public void setAnnotation(int i)
    {
        c = i;
        a(getContext());
    }

    public void setOnPlusOneClickListener(e e1)
    {
        f = e1;
        a.setOnClickListener(new d(this, e1));
    }

    public void setSize(int i)
    {
        b = i;
        a(getContext());
    }
}
