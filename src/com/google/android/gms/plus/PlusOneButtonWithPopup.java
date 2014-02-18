// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.app.PendingIntent;
import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ax;
import com.google.android.gms.internal.ay;
import com.google.android.gms.internal.be;

// Referenced classes of package com.google.android.gms.plus:
//            PlusOneButton, f

public final class PlusOneButtonWithPopup extends ViewGroup
{

    private View a;
    private int b;
    private int c;
    private android.view.View.OnClickListener d;
    private String e;
    private String f;

    public PlusOneButtonWithPopup(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = PlusOneButton.a(context, attributeset);
        c = PlusOneButton.b(context, attributeset);
        a = new f(context, b);
        addView(a);
    }

    private int a(int i, int j)
    {
        int k = android.view.View.MeasureSpec.getMode(i);
        switch (k)
        {
        default:
            return i;

        case -2147483648: 
        case 1073741824: 
            return android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(i) - j, k);
        }
    }

    private void a()
    {
        if (a != null)
        {
            removeView(a);
        }
        a = be.a(getContext(), b, c, e, f);
        if (d != null)
        {
            setOnClickListener(d);
        }
        addView(a);
    }

    private ax b()
    {
        ax ax1 = ay.a((IBinder)a.getTag());
        if (ax1 == null)
        {
            if (Log.isLoggable("PlusOneButtonWithPopup", 5))
            {
                Log.w("PlusOneButtonWithPopup", "Failed to get PlusOneDelegate");
            }
            throw new RemoteException();
        } else
        {
            return ax1;
        }
    }

    public PendingIntent getResolution()
    {
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_20;
        }
        PendingIntent pendingintent = b().a();
        return pendingintent;
        RemoteException remoteexception;
        remoteexception;
        return null;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        a.layout(getPaddingLeft(), getPaddingTop(), k - i - getPaddingRight(), l - j - getPaddingBottom());
    }

    protected void onMeasure(int i, int j)
    {
        int k = getPaddingLeft() + getPaddingRight();
        int l = getPaddingTop() + getPaddingBottom();
        a.measure(a(i, k), a(j, l));
        setMeasuredDimension(k + a.getMeasuredWidth(), l + a.getMeasuredHeight());
    }

    public void setAnnotation(int i)
    {
        c = i;
        a();
    }

    public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        d = onclicklistener;
        a.setOnClickListener(onclicklistener);
    }

    public void setSize(int i)
    {
        b = i;
        a();
    }
}
