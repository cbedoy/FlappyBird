// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.view.at;
import android.support.v4.view.bo;
import android.support.v4.view.n;
import android.support.v4.view.s;
import android.support.v4.view.z;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.v4.widget:
//            f, ac, c, d

public class DrawerLayout extends ViewGroup
{

    private static final int a[] = {
        0x10100b3
    };
    private int b;
    private int c;
    private float d;
    private Paint e;
    private final ac f;
    private final ac g;
    private final f h;
    private final f i;
    private int j;
    private boolean k;
    private boolean l;
    private int m;
    private int n;
    private boolean o;
    private boolean p;
    private d q;
    private float r;
    private float s;
    private Drawable t;
    private Drawable u;

    public DrawerLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public DrawerLayout(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        c = 0x99000000;
        e = new Paint();
        l = true;
        float f1 = getResources().getDisplayMetrics().density;
        b = (int)(0.5F + 64F * f1);
        float f2 = f1 * 400F;
        h = new f(this, 3);
        i = new f(this, 5);
        f = ac.a(this, 1.0F, h);
        f.a(1);
        f.a(f2);
        h.a(f);
        g = ac.a(this, 1.0F, i);
        g.a(2);
        g.a(f2);
        i.a(g);
        setFocusableInTouchMode(true);
        at.a(this, new c(this));
        bo.a(this, false);
    }

    static String b(int i1)
    {
        if ((i1 & 3) == 3)
        {
            return "LEFT";
        }
        if ((i1 & 5) == 5)
        {
            return "RIGHT";
        } else
        {
            return Integer.toHexString(i1);
        }
    }

    static int[] d()
    {
        return a;
    }

    private boolean e()
    {
        int i1 = getChildCount();
        for (int j1 = 0; j1 < i1; j1++)
        {
            if (((LayoutParams)getChildAt(j1).getLayoutParams()).c)
            {
                return true;
            }
        }

        return false;
    }

    private boolean f()
    {
        return g() != null;
    }

    private View g()
    {
        int i1 = getChildCount();
        for (int j1 = 0; j1 < i1; j1++)
        {
            View view = getChildAt(j1);
            if (g(view) && j(view))
            {
                return view;
            }
        }

        return null;
    }

    private static boolean k(View view)
    {
        Drawable drawable = view.getBackground();
        boolean flag = false;
        if (drawable != null)
        {
            int i1 = drawable.getOpacity();
            flag = false;
            if (i1 == -1)
            {
                flag = true;
            }
        }
        return flag;
    }

    public int a(View view)
    {
        int i1 = e(view);
        if (i1 == 3)
        {
            return m;
        }
        if (i1 == 5)
        {
            return n;
        } else
        {
            return 0;
        }
    }

    View a()
    {
        int i1 = getChildCount();
        for (int j1 = 0; j1 < i1; j1++)
        {
            View view = getChildAt(j1);
            if (((LayoutParams)view.getLayoutParams()).d)
            {
                return view;
            }
        }

        return null;
    }

    View a(int i1)
    {
        int j1 = 7 & android.support.v4.view.n.a(i1, at.e(this));
        int k1 = getChildCount();
        for (int l1 = 0; l1 < k1; l1++)
        {
            View view = getChildAt(l1);
            if ((7 & e(view)) == j1)
            {
                return view;
            }
        }

        return null;
    }

    public void a(int i1, int j1)
    {
        int k1;
        k1 = android.support.v4.view.n.a(j1, at.e(this));
        if (k1 == 3)
        {
            m = i1;
        } else
        if (k1 == 5)
        {
            n = i1;
        }
        if (i1 != 0)
        {
            ac ac1;
            if (k1 == 3)
            {
                ac1 = f;
            } else
            {
                ac1 = g;
            }
            ac1.e();
        }
        i1;
        JVM INSTR tableswitch 1 2: default 64
    //                   1 106
    //                   2 87;
           goto _L1 _L2 _L3
_L1:
        View view1;
        return;
_L3:
        View view;
        if ((view1 = a(k1)) != null)
        {
            h(view1);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if ((view = a(k1)) != null)
        {
            i(view);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    void a(int i1, int j1, View view)
    {
        LayoutParams layoutparams;
        int k1 = 1;
        int l1 = f.a();
        int i2 = g.a();
        if (l1 != k1 && i2 != k1)
        {
            if (l1 == 2 || i2 == 2)
            {
                k1 = 2;
            } else
            {
                k1 = 0;
            }
        }
        if (view == null || j1 != 0) goto _L2; else goto _L1
_L1:
        layoutparams = (LayoutParams)view.getLayoutParams();
        if (layoutparams.b != 0.0F) goto _L4; else goto _L3
_L3:
        b(view);
_L2:
        if (k1 != j)
        {
            j = k1;
            if (q != null)
            {
                q.a(k1);
            }
        }
        return;
_L4:
        if (layoutparams.b == 1.0F)
        {
            c(view);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    void a(View view, float f1)
    {
        if (q != null)
        {
            q.a(view, f1);
        }
    }

    void a(boolean flag)
    {
        int i1 = getChildCount();
        int j1 = 0;
        boolean flag1 = false;
        while (j1 < i1) 
        {
            View view = getChildAt(j1);
            LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
            if (g(view) && (!flag || layoutparams.c))
            {
                int k1 = view.getWidth();
                if (a(view, 3))
                {
                    flag1 |= f.a(view, -k1, view.getTop());
                } else
                {
                    flag1 |= g.a(view, getWidth(), view.getTop());
                }
                layoutparams.c = false;
            }
            j1++;
        }
        h.a();
        i.a();
        if (flag1)
        {
            invalidate();
        }
    }

    boolean a(View view, int i1)
    {
        return (i1 & e(view)) == i1;
    }

    public void b()
    {
        a(false);
    }

    void b(View view)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (layoutparams.d)
        {
            layoutparams.d = false;
            if (q != null)
            {
                q.b(view);
            }
            sendAccessibilityEvent(32);
        }
    }

    void b(View view, float f1)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (f1 == layoutparams.b)
        {
            return;
        } else
        {
            layoutparams.b = f1;
            a(view, f1);
            return;
        }
    }

    void c()
    {
        int i1 = 0;
        if (!p)
        {
            long l1 = SystemClock.uptimeMillis();
            MotionEvent motionevent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
            for (int j1 = getChildCount(); i1 < j1; i1++)
            {
                getChildAt(i1).dispatchTouchEvent(motionevent);
            }

            motionevent.recycle();
            p = true;
        }
    }

    void c(View view)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (!layoutparams.d)
        {
            layoutparams.d = true;
            if (q != null)
            {
                q.a(view);
            }
            view.sendAccessibilityEvent(32);
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
    }

    public void computeScroll()
    {
        int i1 = getChildCount();
        float f1 = 0.0F;
        for (int j1 = 0; j1 < i1; j1++)
        {
            f1 = Math.max(f1, ((LayoutParams)getChildAt(j1).getLayoutParams()).b);
        }

        d = f1;
        if (f.a(true) | g.a(true))
        {
            at.b(this);
        }
    }

    float d(View view)
    {
        return ((LayoutParams)view.getLayoutParams()).b;
    }

    protected boolean drawChild(Canvas canvas, View view, long l1)
    {
        int i1;
        boolean flag;
        int j1;
        int k1;
        int i2;
        int k4;
        int l4;
        i1 = getHeight();
        flag = f(view);
        j1 = getWidth();
        k1 = canvas.save();
        i2 = 0;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        k4 = getChildCount();
        l4 = 0;
_L2:
        if (l4 >= k4)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        View view1 = getChildAt(l4);
        if (view1 == view || view1.getVisibility() != 0 || !k(view1) || !g(view1))
        {
            break; /* Loop/switch isn't completed */
        }
        int i5;
        if (view1.getHeight() < i1)
        {
            i5 = j1;
        } else
        {
label0:
            {
                if (!a(view1, 3))
                {
                    break label0;
                }
                int j5 = view1.getRight();
                int j2;
                boolean flag1;
                int k2;
                int l2;
                int i3;
                int j3;
                float f1;
                int k3;
                int l3;
                int i4;
                float f2;
                int j4;
                if (j5 <= i2)
                {
                    j5 = i2;
                }
                i2 = j5;
                i5 = j1;
            }
        }
_L3:
        l4++;
        j1 = i5;
        if (true) goto _L2; else goto _L1
        i5 = view1.getLeft();
        if (i5 < j1) goto _L3; else goto _L1
_L1:
        i5 = j1;
          goto _L3
        canvas.clipRect(i2, 0, j1, getHeight());
        j2 = j1;
        flag1 = super.drawChild(canvas, view, l1);
        canvas.restoreToCount(k1);
        if (d > 0.0F && flag)
        {
            j4 = (int)((float)((0xff000000 & c) >>> 24) * d) << 24 | 0xffffff & c;
            e.setColor(j4);
            canvas.drawRect(i2, 0.0F, j2, getHeight(), e);
        } else
        {
            if (t != null && a(view, 3))
            {
                k3 = t.getIntrinsicWidth();
                l3 = view.getRight();
                i4 = f.b();
                f2 = Math.max(0.0F, Math.min((float)l3 / (float)i4, 1.0F));
                t.setBounds(l3, view.getTop(), k3 + l3, view.getBottom());
                t.setAlpha((int)(255F * f2));
                t.draw(canvas);
                return flag1;
            }
            if (u != null && a(view, 5))
            {
                k2 = u.getIntrinsicWidth();
                l2 = view.getLeft();
                i3 = getWidth() - l2;
                j3 = g.b();
                f1 = Math.max(0.0F, Math.min((float)i3 / (float)j3, 1.0F));
                u.setBounds(l2 - k2, view.getTop(), l2, view.getBottom());
                u.setAlpha((int)(255F * f1));
                u.draw(canvas);
                return flag1;
            }
        }
        return flag1;
    }

    int e(View view)
    {
        return android.support.v4.view.n.a(((LayoutParams)view.getLayoutParams()).a, at.e(this));
    }

    boolean f(View view)
    {
        return ((LayoutParams)view.getLayoutParams()).a == 0;
    }

    boolean g(View view)
    {
        return (7 & android.support.v4.view.n.a(((LayoutParams)view.getLayoutParams()).a, at.e(view))) != 0;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams(-1, -1);
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof LayoutParams)
        {
            return new LayoutParams((LayoutParams)layoutparams);
        }
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new LayoutParams(layoutparams);
        }
    }

    public void h(View view)
    {
        if (!g(view))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("View ").append(view).append(" is not a sliding drawer").toString());
        }
        if (l)
        {
            LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
            layoutparams.b = 1.0F;
            layoutparams.d = true;
        } else
        if (a(view, 3))
        {
            f.a(view, 0, view.getTop());
        } else
        {
            g.a(view, getWidth() - view.getWidth(), view.getTop());
        }
        invalidate();
    }

    public void i(View view)
    {
        if (!g(view))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("View ").append(view).append(" is not a sliding drawer").toString());
        }
        if (l)
        {
            LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
            layoutparams.b = 0.0F;
            layoutparams.d = false;
        } else
        if (a(view, 3))
        {
            f.a(view, -view.getWidth(), view.getTop());
        } else
        {
            g.a(view, getWidth(), view.getTop());
        }
        invalidate();
    }

    public boolean j(View view)
    {
        if (!g(view))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("View ").append(view).append(" is not a drawer").toString());
        }
        return ((LayoutParams)view.getLayoutParams()).b > 0.0F;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        l = true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        l = true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        boolean flag;
        i1 = z.a(motionevent);
        flag = f.a(motionevent) | g.a(motionevent);
        i1;
        JVM INSTR tableswitch 0 3: default 56
    //                   0 95
    //                   1 195
    //                   2 164
    //                   3 195;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        boolean flag1 = false;
_L8:
        if (flag || flag1 || e()) goto _L6; else goto _L5
_L5:
        boolean flag2;
        boolean flag3;
        flag3 = p;
        flag2 = false;
        if (!flag3) goto _L7; else goto _L6
_L6:
        flag2 = true;
_L7:
        return flag2;
_L2:
        float f1 = motionevent.getX();
        float f2 = motionevent.getY();
        r = f1;
        s = f2;
        if (d > 0.0F && f(f.d((int)f1, (int)f2)))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        o = false;
        p = false;
          goto _L8
_L4:
        if (!f.d(3))
        {
            continue; /* Loop/switch isn't completed */
        }
        h.a();
        i.a();
        flag1 = false;
          goto _L8
_L3:
        a(true);
        o = false;
        p = false;
        if (true) goto _L1; else goto _L9
_L9:
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4 && f())
        {
            android.support.v4.view.s.b(keyevent);
            return true;
        } else
        {
            return super.onKeyDown(i1, keyevent);
        }
    }

    public boolean onKeyUp(int i1, KeyEvent keyevent)
    {
        if (i1 == 4)
        {
            View view = g();
            if (view != null && a(view) == 0)
            {
                b();
            }
            return view != null;
        } else
        {
            return super.onKeyUp(i1, keyevent);
        }
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        int i2;
        int j2;
        int k2;
        k = true;
        i2 = k1 - i1;
        j2 = getChildCount();
        k2 = 0;
_L2:
        View view;
        if (k2 >= j2)
        {
            break MISSING_BLOCK_LABEL_454;
        }
        view = getChildAt(k2);
        if (view.getVisibility() != 8)
        {
            break; /* Loop/switch isn't completed */
        }
_L3:
        k2++;
        if (true) goto _L2; else goto _L1
_L1:
        LayoutParams layoutparams;
label0:
        {
            layoutparams = (LayoutParams)view.getLayoutParams();
            if (!f(view))
            {
                break label0;
            }
            view.layout(layoutparams.leftMargin, layoutparams.topMargin, layoutparams.leftMargin + view.getMeasuredWidth(), layoutparams.topMargin + view.getMeasuredHeight());
        }
          goto _L3
        int l2;
        int i3;
        int j3;
        l2 = view.getMeasuredWidth();
        i3 = view.getMeasuredHeight();
        float f1;
        boolean flag1;
        if (a(view, 3))
        {
            j3 = -l2 + (int)((float)l2 * layoutparams.b);
            f1 = (float)(l2 + j3) / (float)l2;
        } else
        {
            j3 = i2 - (int)((float)l2 * layoutparams.b);
            f1 = (float)(i2 - j3) / (float)l2;
        }
        if (f1 != layoutparams.b)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        0x70 & layoutparams.a;
        JVM INSTR lookupswitch 2: default 212
    //                   16: 362
    //                   80: 319;
           goto _L4 _L5 _L6
_L5:
        break MISSING_BLOCK_LABEL_362;
_L4:
        view.layout(j3, layoutparams.topMargin, l2 + j3, i3 + layoutparams.topMargin);
_L7:
        if (flag1)
        {
            b(view, f1);
        }
        int k3;
        int l3;
        int i4;
        int j4;
        if (layoutparams.b > 0.0F)
        {
            i4 = 0;
        } else
        {
            i4 = 4;
        }
        if (view.getVisibility() != i4)
        {
            view.setVisibility(i4);
        }
          goto _L3
_L6:
        j4 = l1 - j1;
        view.layout(j3, j4 - layoutparams.bottomMargin - view.getMeasuredHeight(), l2 + j3, j4 - layoutparams.bottomMargin);
          goto _L7
        k3 = l1 - j1;
        l3 = (k3 - i3) / 2;
        if (l3 < layoutparams.topMargin)
        {
            l3 = layoutparams.topMargin;
        } else
        if (l3 + i3 > k3 - layoutparams.bottomMargin)
        {
            l3 = k3 - layoutparams.bottomMargin - i3;
        }
        view.layout(j3, l3, l2 + j3, i3 + l3);
          goto _L7
        k = false;
        l = false;
        return;
          goto _L3
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        k1 = 300;
        l1 = android.view.View.MeasureSpec.getMode(i1);
        i2 = android.view.View.MeasureSpec.getMode(j1);
        j2 = android.view.View.MeasureSpec.getSize(i1);
        k2 = android.view.View.MeasureSpec.getSize(j1);
        if (l1 == 0x40000000 && i2 == 0x40000000) goto _L2; else goto _L1
_L1:
        if (!isInEditMode()) goto _L4; else goto _L3
_L7:
        if (i2 != 0x80000000) goto _L6; else goto _L5
_L5:
        k1 = k2;
_L8:
        setMeasuredDimension(j2, k1);
        int l2 = getChildCount();
        int i3 = 0;
        while (i3 < l2) 
        {
            View view = getChildAt(i3);
            if (view.getVisibility() != 8)
            {
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                if (f(view))
                {
                    view.measure(android.view.View.MeasureSpec.makeMeasureSpec(j2 - layoutparams.leftMargin - layoutparams.rightMargin, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(k1 - layoutparams.topMargin - layoutparams.bottomMargin, 0x40000000));
                } else
                if (g(view))
                {
                    int j3 = 7 & e(view);
                    if ((0 & j3) != 0)
                    {
                        throw new IllegalStateException((new StringBuilder()).append("Child drawer has absolute gravity ").append(b(j3)).append(" but this ").append("DrawerLayout").append(" already has a ").append("drawer view along that edge").toString());
                    }
                    view.measure(getChildMeasureSpec(i1, b + layoutparams.leftMargin + layoutparams.rightMargin, layoutparams.width), getChildMeasureSpec(j1, layoutparams.topMargin + layoutparams.bottomMargin, layoutparams.height));
                } else
                {
                    throw new IllegalStateException((new StringBuilder()).append("Child ").append(view).append(" at index ").append(i3).append(" does not have a valid layout_gravity - must be Gravity.LEFT, ").append("Gravity.RIGHT or Gravity.NO_GRAVITY").toString());
                }
            }
            i3++;
        }
        break MISSING_BLOCK_LABEL_404;
_L3:
        if (l1 != 0x80000000 && l1 == 0)
        {
            j2 = k1;
        }
          goto _L7
_L6:
        if (i2 == 0) goto _L8; else goto _L2
_L2:
        k1 = k2;
          goto _L8
_L4:
        throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
          goto _L8
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        SavedState savedstate = (SavedState)parcelable;
        super.onRestoreInstanceState(savedstate.getSuperState());
        if (savedstate.a != 0)
        {
            View view = a(savedstate.a);
            if (view != null)
            {
                h(view);
            }
        }
        a(savedstate.b, 3);
        a(savedstate.c, 5);
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate;
        int i1;
        int j1;
        savedstate = new SavedState(super.onSaveInstanceState());
        i1 = getChildCount();
        j1 = 0;
_L2:
        View view;
        if (j1 >= i1)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        view = getChildAt(j1);
        if (g(view))
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        j1++;
        LayoutParams layoutparams;
        if (true) goto _L2; else goto _L1
_L1:
        if (!(layoutparams = (LayoutParams)view.getLayoutParams()).d) goto _L4; else goto _L3
_L3:
        savedstate.a = layoutparams.a;
        savedstate.b = m;
        savedstate.c = n;
        return savedstate;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        f.b(motionevent);
        g.b(motionevent);
        0xff & motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 56
    //                   0 58
    //                   1 94
    //                   2 56
    //                   3 220;
           goto _L1 _L2 _L3 _L1 _L4
_L1:
        return true;
_L2:
        float f5 = motionevent.getX();
        float f6 = motionevent.getY();
        r = f5;
        s = f6;
        o = false;
        p = false;
        return true;
_L3:
        float f1;
        float f2;
        View view;
        f1 = motionevent.getX();
        f2 = motionevent.getY();
        view = f.d((int)f1, (int)f2);
        if (view == null || !f(view)) goto _L6; else goto _L5
_L5:
        float f3;
        float f4;
        int i1;
        f3 = f1 - r;
        f4 = f2 - s;
        i1 = f.d();
        if (f3 * f3 + f4 * f4 >= (float)(i1 * i1)) goto _L6; else goto _L7
_L7:
        View view1 = a();
        if (view1 == null) goto _L6; else goto _L8
_L8:
        boolean flag;
        if (a(view1) == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L10:
        a(flag);
        o = false;
        return true;
_L4:
        a(true);
        o = false;
        p = false;
        return true;
_L6:
        flag = true;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
        super.requestDisallowInterceptTouchEvent(flag);
        o = flag;
        if (flag)
        {
            a(true);
        }
    }

    public void requestLayout()
    {
        if (!k)
        {
            super.requestLayout();
        }
    }

    public void setDrawerListener(d d1)
    {
        q = d1;
    }

    public void setDrawerLockMode(int i1)
    {
        a(i1, 3);
        a(i1, 5);
    }

    public void setScrimColor(int i1)
    {
        c = i1;
        invalidate();
    }


    private class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
    {

        public int a;
        float b;
        boolean c;
        boolean d;

        public LayoutParams(int i1, int j1)
        {
            super(i1, j1);
            a = 0;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            a = 0;
            TypedArray typedarray = context.obtainStyledAttributes(attributeset, DrawerLayout.d());
            a = typedarray.getInt(0, 0);
            typedarray.recycle();
        }

        public LayoutParams(LayoutParams layoutparams)
        {
            super(layoutparams);
            a = 0;
            a = layoutparams.a;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            a = 0;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            a = 0;
        }
    }


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new e();
        int a;
        int b;
        int c;

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            parcel.writeInt(a);
        }


        public SavedState(Parcel parcel)
        {
            super(parcel);
            a = 0;
            b = 0;
            c = 0;
            a = parcel.readInt();
        }

        public SavedState(Parcelable parcelable)
        {
            super(parcelable);
            a = 0;
            b = 0;
            c = 0;
        }
    }

}
