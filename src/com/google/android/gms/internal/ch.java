// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.internal:
//            cj, cl, p

public final class ch extends Drawable
    implements android.graphics.drawable.Drawable.Callback
{

    private int a;
    private long b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private cl j;
    private Drawable k;
    private Drawable l;
    private boolean m;
    private boolean n;
    private boolean o;
    private int p;

    public ch(Drawable drawable, Drawable drawable1)
    {
        this(null);
        if (drawable == null)
        {
            drawable = cj.a();
        }
        k = drawable;
        drawable.setCallback(this);
        cl cl1 = j;
        cl1.b = cl1.b | drawable.getChangingConfigurations();
        if (drawable1 == null)
        {
            drawable1 = cj.a();
        }
        l = drawable1;
        drawable1.setCallback(this);
        cl cl2 = j;
        cl2.b = cl2.b | drawable1.getChangingConfigurations();
    }

    ch(cl cl1)
    {
        a = 0;
        e = 255;
        g = 0;
        h = true;
        j = new cl(cl1);
    }

    public void a(int i1)
    {
        c = 0;
        d = e;
        g = 0;
        f = i1;
        a = 1;
        invalidateSelf();
    }

    public boolean a()
    {
        if (!m)
        {
            boolean flag;
            if (k.getConstantState() != null && l.getConstantState() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            n = flag;
            m = true;
        }
        return n;
    }

    public Drawable b()
    {
        return l;
    }

    public void draw(Canvas canvas)
    {
        boolean flag = true;
        a;
        JVM INSTR tableswitch 1 2: default 28
    //                   1 101
    //                   2 119;
           goto _L1 _L2 _L3
_L1:
        boolean flag1 = flag;
_L5:
        int i1;
        boolean flag2;
        Drawable drawable;
        Drawable drawable1;
        i1 = g;
        flag2 = h;
        drawable = k;
        drawable1 = l;
        if (flag1)
        {
            if (!flag2 || i1 == 0)
            {
                drawable.draw(canvas);
            }
            if (i1 == e)
            {
                drawable1.setAlpha(e);
                drawable1.draw(canvas);
            }
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        b = SystemClock.uptimeMillis();
        a = 2;
        flag1 = false;
        if (true) goto _L5; else goto _L4
_L4:
        break; /* Loop/switch isn't completed */
_L3:
        if (b >= 0L)
        {
            float f1 = (float)(SystemClock.uptimeMillis() - b) / (float)f;
            float f2;
            if (f1 < 1.0F)
            {
                flag = false;
            }
            if (flag)
            {
                a = 0;
            }
            f2 = Math.min(f1, 1.0F);
            g = (int)((float)c + f2 * (float)(d - c));
        }
        if (true) goto _L1; else goto _L6
_L6:
        if (flag2)
        {
            drawable.setAlpha(e - i1);
        }
        drawable.draw(canvas);
        if (flag2)
        {
            drawable.setAlpha(e);
        }
        if (i1 > 0)
        {
            drawable1.setAlpha(i1);
            drawable1.draw(canvas);
            drawable1.setAlpha(e);
        }
        invalidateSelf();
        return;
    }

    public int getChangingConfigurations()
    {
        return super.getChangingConfigurations() | j.a | j.b;
    }

    public android.graphics.drawable.Drawable.ConstantState getConstantState()
    {
        if (a())
        {
            j.a = getChangingConfigurations();
            return j;
        } else
        {
            return null;
        }
    }

    public int getIntrinsicHeight()
    {
        return Math.max(k.getIntrinsicHeight(), l.getIntrinsicHeight());
    }

    public int getIntrinsicWidth()
    {
        return Math.max(k.getIntrinsicWidth(), l.getIntrinsicWidth());
    }

    public int getOpacity()
    {
        if (!o)
        {
            p = Drawable.resolveOpacity(k.getOpacity(), l.getOpacity());
            o = true;
        }
        return p;
    }

    public void invalidateDrawable(Drawable drawable)
    {
        if (com.google.android.gms.internal.p.a())
        {
            android.graphics.drawable.Drawable.Callback callback = getCallback();
            if (callback != null)
            {
                callback.invalidateDrawable(this);
            }
        }
    }

    public Drawable mutate()
    {
        if (!i && super.mutate() == this)
        {
            if (!a())
            {
                throw new IllegalStateException("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
            }
            k.mutate();
            l.mutate();
            i = true;
        }
        return this;
    }

    protected void onBoundsChange(Rect rect)
    {
        k.setBounds(rect);
        l.setBounds(rect);
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long l1)
    {
        if (com.google.android.gms.internal.p.a())
        {
            android.graphics.drawable.Drawable.Callback callback = getCallback();
            if (callback != null)
            {
                callback.scheduleDrawable(this, runnable, l1);
            }
        }
    }

    public void setAlpha(int i1)
    {
        if (g == e)
        {
            g = i1;
        }
        e = i1;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        k.setColorFilter(colorfilter);
        l.setColorFilter(colorfilter);
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable)
    {
        if (com.google.android.gms.internal.p.a())
        {
            android.graphics.drawable.Drawable.Callback callback = getCallback();
            if (callback != null)
            {
                callback.unscheduleDrawable(this, runnable);
            }
        }
    }
}
