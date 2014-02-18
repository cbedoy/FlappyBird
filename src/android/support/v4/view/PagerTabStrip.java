// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.TextView;

// Referenced classes of package android.support.v4.view:
//            PagerTitleStrip, af, ag, ViewPager

public class PagerTabStrip extends PagerTitleStrip
{

    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private final Paint l = new Paint();
    private final Rect m = new Rect();
    private int n;
    private boolean o;
    private boolean p;
    private int q;
    private boolean r;
    private float s;
    private float t;
    private int u;

    public PagerTabStrip(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        n = 255;
        o = false;
        p = false;
        f = e;
        l.setColor(f);
        float f1 = context.getResources().getDisplayMetrics().density;
        g = (int)(0.5F + 3F * f1);
        h = (int)(0.5F + 6F * f1);
        i = (int)(64F * f1);
        k = (int)(0.5F + 16F * f1);
        q = (int)(0.5F + 1.0F * f1);
        j = (int)(0.5F + f1 * 32F);
        u = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        b.setFocusable(true);
        b.setOnClickListener(new af(this));
        d.setFocusable(true);
        d.setOnClickListener(new ag(this));
        if (getBackground() == null)
        {
            o = true;
        }
    }

    void a(int i1, float f1, boolean flag)
    {
        Rect rect = m;
        int j1 = getHeight();
        int k1 = c.getLeft() - k;
        int l1 = c.getRight() + k;
        int i2 = j1 - g;
        rect.set(k1, i2, l1, j1);
        super.a(i1, f1, flag);
        n = (int)(255F * (2.0F * Math.abs(f1 - 0.5F)));
        rect.union(c.getLeft() - k, i2, c.getRight() + k, j1);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline()
    {
        return o;
    }

    int getMinHeight()
    {
        return Math.max(super.getMinHeight(), j);
    }

    public int getTabIndicatorColor()
    {
        return f;
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int i1 = getHeight();
        int j1 = c.getLeft() - k;
        int k1 = c.getRight() + k;
        int l1 = i1 - g;
        l.setColor(n << 24 | 0xffffff & f);
        canvas.drawRect(j1, l1, k1, i1, l);
        if (o)
        {
            l.setColor(0xff000000 | 0xffffff & f);
            canvas.drawRect(getPaddingLeft(), i1 - q, getWidth() - getPaddingRight(), i1, l);
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1;
        float f1;
        float f2;
        i1 = motionevent.getAction();
        if (i1 != 0 && r)
        {
            return false;
        }
        f1 = motionevent.getX();
        f2 = motionevent.getY();
        i1;
        JVM INSTR tableswitch 0 2: default 56
    //                   0 58
    //                   1 122
    //                   2 77;
           goto _L1 _L2 _L3 _L4
_L1:
        return true;
_L2:
        s = f1;
        t = f2;
        r = false;
        continue; /* Loop/switch isn't completed */
_L4:
        if (Math.abs(f1 - s) > (float)u || Math.abs(f2 - t) > (float)u)
        {
            r = true;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (f1 < (float)(c.getLeft() - k))
        {
            a.setCurrentItem(-1 + a.getCurrentItem());
        } else
        if (f1 > (float)(c.getRight() + k))
        {
            a.setCurrentItem(1 + a.getCurrentItem());
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void setBackgroundColor(int i1)
    {
        super.setBackgroundColor(i1);
        if (!p)
        {
            boolean flag;
            if ((0xff000000 & i1) == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o = flag;
        }
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        super.setBackgroundDrawable(drawable);
        if (!p)
        {
            boolean flag;
            if (drawable == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o = flag;
        }
    }

    public void setBackgroundResource(int i1)
    {
        super.setBackgroundResource(i1);
        if (!p)
        {
            boolean flag;
            if (i1 == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o = flag;
        }
    }

    public void setDrawFullUnderline(boolean flag)
    {
        o = flag;
        p = true;
        invalidate();
    }

    public void setPadding(int i1, int j1, int k1, int l1)
    {
        if (l1 < h)
        {
            l1 = h;
        }
        super.setPadding(i1, j1, k1, l1);
    }

    public void setTabIndicatorColor(int i1)
    {
        f = i1;
        l.setColor(f);
        invalidate();
    }

    public void setTabIndicatorColorResource(int i1)
    {
        setTabIndicatorColor(getContext().getResources().getColor(i1));
    }

    public void setTextSpacing(int i1)
    {
        if (i1 < i)
        {
            i1 = i;
        }
        super.setTextSpacing(i1);
    }
}
