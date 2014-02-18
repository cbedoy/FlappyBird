// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.b.k;
import com.google.android.gms.internal.do;
import com.google.android.gms.internal.dp;
import com.google.android.gms.internal.u;

public final class SignInButton extends FrameLayout
    implements android.view.View.OnClickListener
{

    private int a;
    private int b;
    private View c;
    private android.view.View.OnClickListener d;

    public SignInButton(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SignInButton(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        d = null;
        a(0, 0);
    }

    private static Button a(Context context, int i, int j)
    {
        u u1 = new u(context);
        u1.a(context.getResources(), i, j);
        return u1;
    }

    private void a(Context context)
    {
        if (c != null)
        {
            removeView(c);
        }
        try
        {
            c = dp.a(context, a, b);
        }
        catch (k k1)
        {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            c = a(context, a, b);
        }
        addView(c);
        c.setEnabled(isEnabled());
        c.setOnClickListener(this);
    }

    public void a(int i, int j)
    {
        boolean flag = true;
        boolean flag1;
        if (i >= 0 && i < 3)
        {
            flag1 = flag;
        } else
        {
            flag1 = false;
        }
        com.google.android.gms.internal.do.a(flag1, (new StringBuilder()).append("Unknown button size ").append(i).toString());
        if (j < 0 || j >= 2)
        {
            flag = false;
        }
        com.google.android.gms.internal.do.a(flag, (new StringBuilder()).append("Unknown color scheme ").append(j).toString());
        a = i;
        b = j;
        a(getContext());
    }

    public void onClick(View view)
    {
        if (d != null && view == c)
        {
            d.onClick(this);
        }
    }

    public void setColorScheme(int i)
    {
        a(a, i);
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        c.setEnabled(flag);
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        d = onclicklistener;
        if (c != null)
        {
            c.setOnClickListener(this);
        }
    }

    public void setSize(int i)
    {
        a(i, b);
    }
}
