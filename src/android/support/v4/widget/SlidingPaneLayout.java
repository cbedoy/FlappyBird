// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.view.at;
import android.support.v4.view.z;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.widget:
//            ab, aa, z, t, 
//            v, ac, u, y, 
//            w

public class SlidingPaneLayout extends ViewGroup
{

    static final y a;
    private int b;
    private int c;
    private Drawable d;
    private final int e;
    private boolean f;
    private View g;
    private float h;
    private float i;
    private int j;
    private boolean k;
    private int l;
    private float m;
    private float n;
    private w o;
    private final ac p;
    private boolean q;
    private boolean r;
    private final Rect s;
    private final ArrayList t;

    public SlidingPaneLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        b = 0xcccccccc;
        r = true;
        s = new Rect();
        t = new ArrayList();
        float f1 = context.getResources().getDisplayMetrics().density;
        e = (int)(0.5F + 32F * f1);
        ViewConfiguration.get(context);
        setWillNotDraw(false);
        at.a(this, new t(this));
        at.b(this, 1);
        p = ac.a(this, 0.5F, new v(this, null));
        p.a(1);
        p.a(f1 * 400F);
    }

    private void a(float f1)
    {
        int i1 = 0;
        LayoutParams layoutparams = (LayoutParams)g.getLayoutParams();
        boolean flag;
        int j1;
        if (layoutparams.c && layoutparams.leftMargin <= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j1 = getChildCount();
        while (i1 < j1) 
        {
            View view = getChildAt(i1);
            if (view != g)
            {
                int k1 = (int)((1.0F - i) * (float)l);
                i = f1;
                view.offsetLeftAndRight(k1 - (int)((1.0F - f1) * (float)l));
                if (flag)
                {
                    a(view, 1.0F - i, c);
                }
            }
            i1++;
        }
    }

    private void a(int i1)
    {
        LayoutParams layoutparams = (LayoutParams)g.getLayoutParams();
        h = (float)(i1 - (getPaddingLeft() + layoutparams.leftMargin)) / (float)j;
        if (l != 0)
        {
            a(h);
        }
        if (layoutparams.c)
        {
            a(g, h, b);
        }
        a(g);
    }

    static void a(SlidingPaneLayout slidingpanelayout, int i1)
    {
        slidingpanelayout.a(i1);
    }

    static void a(SlidingPaneLayout slidingpanelayout, View view)
    {
        slidingpanelayout.g(view);
    }

    private void a(View view, float f1, int i1)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (f1 > 0.0F && i1 != 0)
        {
            int j1 = (int)(f1 * (float)((0xff000000 & i1) >>> 24)) << 24 | 0xffffff & i1;
            if (layoutparams.d == null)
            {
                layoutparams.d = new Paint();
            }
            layoutparams.d.setColorFilter(new PorterDuffColorFilter(j1, android.graphics.PorterDuff.Mode.SRC_OVER));
            if (at.d(view) != 2)
            {
                at.a(view, 2, layoutparams.d);
            }
            g(view);
        } else
        if (at.d(view) != 0)
        {
            if (layoutparams.d != null)
            {
                layoutparams.d.setColorFilter(null);
            }
            u u1 = new u(this, view);
            t.add(u1);
            at.a(this, u1);
            return;
        }
    }

    static boolean a(SlidingPaneLayout slidingpanelayout)
    {
        return slidingpanelayout.k;
    }

    static boolean a(SlidingPaneLayout slidingpanelayout, boolean flag)
    {
        slidingpanelayout.q = flag;
        return flag;
    }

    private boolean a(View view, int i1)
    {
        boolean flag;
label0:
        {
            if (!r)
            {
                boolean flag1 = a(0.0F, i1);
                flag = false;
                if (!flag1)
                {
                    break label0;
                }
            }
            q = false;
            flag = true;
        }
        return flag;
    }

    static ac b(SlidingPaneLayout slidingpanelayout)
    {
        return slidingpanelayout.p;
    }

    private boolean b(View view, int i1)
    {
        if (r || a(1.0F, i1))
        {
            q = true;
            return true;
        } else
        {
            return false;
        }
    }

    static float c(SlidingPaneLayout slidingpanelayout)
    {
        return slidingpanelayout.h;
    }

    static View d(SlidingPaneLayout slidingpanelayout)
    {
        return slidingpanelayout.g;
    }

    static int e(SlidingPaneLayout slidingpanelayout)
    {
        return slidingpanelayout.j;
    }

    static ArrayList f(SlidingPaneLayout slidingpanelayout)
    {
        return slidingpanelayout.t;
    }

    private static boolean f(View view)
    {
        if (!at.g(view))
        {
            if (android.os.Build.VERSION.SDK_INT >= 18)
            {
                return false;
            }
            Drawable drawable = view.getBackground();
            if (drawable != null)
            {
                if (drawable.getOpacity() != -1)
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    private void g(View view)
    {
        a.a(this, view);
    }

    void a()
    {
        int i1 = getChildCount();
        for (int j1 = 0; j1 < i1; j1++)
        {
            View view = getChildAt(j1);
            if (view.getVisibility() == 4)
            {
                view.setVisibility(0);
            }
        }

    }

    void a(View view)
    {
        if (o != null)
        {
            o.a(view, h);
        }
    }

    boolean a(float f1, int i1)
    {
        if (!f)
        {
            return false;
        }
        LayoutParams layoutparams = (LayoutParams)g.getLayoutParams();
        int j1 = (int)((float)(getPaddingLeft() + layoutparams.leftMargin) + f1 * (float)j);
        if (p.a(g, j1, g.getTop()))
        {
            a();
            at.b(this);
            return true;
        } else
        {
            return false;
        }
    }

    void b(View view)
    {
        if (o != null)
        {
            o.a(view);
        }
        sendAccessibilityEvent(32);
    }

    public boolean b()
    {
        return b(g, 0);
    }

    void c(View view)
    {
        if (o != null)
        {
            o.b(view);
        }
        sendAccessibilityEvent(32);
    }

    public boolean c()
    {
        return a(g, 0);
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof LayoutParams) && super.checkLayoutParams(layoutparams);
    }

    public void computeScroll()
    {
label0:
        {
            if (p.a(true))
            {
                if (f)
                {
                    break label0;
                }
                p.f();
            }
            return;
        }
        at.b(this);
    }

    void d(View view)
    {
        int i1 = getPaddingLeft();
        int j1 = getWidth() - getPaddingRight();
        int k1 = getPaddingTop();
        int l1 = getHeight() - getPaddingBottom();
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        if (view != null && f(view))
        {
            l2 = view.getLeft();
            k2 = view.getRight();
            j2 = view.getTop();
            i2 = view.getBottom();
        } else
        {
            i2 = 0;
            j2 = 0;
            k2 = 0;
            l2 = 0;
        }
        i3 = getChildCount();
        j3 = 0;
        do
        {
            View view1;
label0:
            {
                if (j3 < i3)
                {
                    view1 = getChildAt(j3);
                    if (view1 != view)
                    {
                        break label0;
                    }
                }
                return;
            }
            int k3 = Math.max(i1, view1.getLeft());
            int l3 = Math.max(k1, view1.getTop());
            int i4 = Math.min(j1, view1.getRight());
            int j4 = Math.min(l1, view1.getBottom());
            byte byte0;
            if (k3 >= l2 && l3 >= j2 && i4 <= k2 && j4 <= i2)
            {
                byte0 = 4;
            } else
            {
                byte0 = 0;
            }
            view1.setVisibility(byte0);
            j3++;
        } while (true);
    }

    public boolean d()
    {
        return !f || h == 1.0F;
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        View view;
        if (getChildCount() > 1)
        {
            view = getChildAt(1);
        } else
        {
            view = null;
        }
        if (view == null || d == null)
        {
            return;
        } else
        {
            int i1 = d.getIntrinsicWidth();
            int j1 = view.getLeft();
            int k1 = view.getTop();
            int l1 = view.getBottom();
            int i2 = j1 - i1;
            d.setBounds(i2, k1, j1, l1);
            d.draw(canvas);
            return;
        }
    }

    protected boolean drawChild(Canvas canvas, View view, long l1)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        int i1 = canvas.save(2);
        if (f && !layoutparams.b && g != null)
        {
            canvas.getClipBounds(s);
            s.right = Math.min(s.right, g.getLeft());
            canvas.clipRect(s);
        }
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            flag = super.drawChild(canvas, view, l1);
        } else
        if (layoutparams.c && h > 0.0F)
        {
            if (!view.isDrawingCacheEnabled())
            {
                view.setDrawingCacheEnabled(true);
            }
            android.graphics.Bitmap bitmap = view.getDrawingCache();
            if (bitmap != null)
            {
                canvas.drawBitmap(bitmap, view.getLeft(), view.getTop(), layoutparams.d);
                flag = false;
            } else
            {
                Log.e("SlidingPaneLayout", (new StringBuilder()).append("drawChild: child view ").append(view).append(" returned null drawing cache").toString());
                flag = super.drawChild(canvas, view, l1);
            }
        } else
        {
            if (view.isDrawingCacheEnabled())
            {
                view.setDrawingCacheEnabled(false);
            }
            flag = super.drawChild(canvas, view, l1);
        }
        canvas.restoreToCount(i1);
        return flag;
    }

    public boolean e()
    {
        return f;
    }

    boolean e(View view)
    {
        if (view == null)
        {
            return false;
        }
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        boolean flag;
        if (f && layoutparams.c && h > 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return flag;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new LayoutParams(layoutparams);
        }
    }

    public int getCoveredFadeColor()
    {
        return c;
    }

    public int getParallaxDistance()
    {
        return l;
    }

    public int getSliderFadeColor()
    {
        return b;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        r = true;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        r = true;
        int i1 = t.size();
        for (int j1 = 0; j1 < i1; j1++)
        {
            ((u)t.get(j1)).run();
        }

        t.clear();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        boolean flag;
        i1 = z.a(motionevent);
        if (!f && i1 == 0 && getChildCount() > 1)
        {
            View view = getChildAt(1);
            if (view != null)
            {
                boolean flag2;
                if (!p.b(view, (int)motionevent.getX(), (int)motionevent.getY()))
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                q = flag2;
            }
        }
        if (f && (!k || i1 == 0)) goto _L2; else goto _L1
_L1:
        p.e();
        flag = super.onInterceptTouchEvent(motionevent);
_L7:
        return flag;
_L2:
        if (i1 == 3 || i1 == 1)
        {
            p.e();
            return false;
        }
        i1;
        JVM INSTR tableswitch 0 2: default 152
    //                   0 175
    //                   1 152
    //                   2 241;
           goto _L3 _L4 _L3 _L5
_L3:
        boolean flag1 = false;
_L9:
        if (p.a(motionevent))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = false;
        if (!flag1) goto _L7; else goto _L6
_L6:
        return true;
_L4:
        float f5;
        float f6;
        k = false;
        f5 = motionevent.getX();
        f6 = motionevent.getY();
        m = f5;
        n = f6;
        if (!p.b(g, (int)f5, (int)f6) || !e(g)) goto _L3; else goto _L8
_L8:
        flag1 = true;
          goto _L9
_L5:
        float f1 = motionevent.getX();
        float f2 = motionevent.getY();
        float f3 = Math.abs(f1 - m);
        float f4 = Math.abs(f2 - n);
        if (f3 > (float)p.d() && f4 > f3)
        {
            p.e();
            k = true;
            return false;
        }
          goto _L3
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        int i2 = k1 - i1;
        int j2 = getPaddingLeft();
        int k2 = getPaddingRight();
        int l2 = getPaddingTop();
        int i3 = getChildCount();
        int k3;
        if (r)
        {
            int j3;
            float f1;
            if (f && q)
            {
                f1 = 1.0F;
            } else
            {
                f1 = 0.0F;
            }
            h = f1;
        }
        j3 = 0;
        k3 = j2;
        while (j3 < i3) 
        {
            View view = getChildAt(j3);
            int j4;
            if (view.getVisibility() == 8)
            {
                j4 = k3;
            } else
            {
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                int i4 = view.getMeasuredWidth();
                int k4;
                if (layoutparams.b)
                {
                    int i5 = layoutparams.leftMargin + layoutparams.rightMargin;
                    int j5 = Math.min(j2, i2 - k2 - e) - k3 - i5;
                    j = j5;
                    int l4;
                    boolean flag1;
                    if (j5 + (k3 + layoutparams.leftMargin) + i4 / 2 > i2 - k2)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    layoutparams.c = flag1;
                    j4 = k3 + ((int)((float)j5 * h) + layoutparams.leftMargin);
                    k4 = 0;
                } else
                if (f && l != 0)
                {
                    k4 = (int)((1.0F - h) * (float)l);
                    j4 = j2;
                } else
                {
                    j4 = j2;
                    k4 = 0;
                }
                l4 = j4 - k4;
                view.layout(l4, l2, l4 + i4, l2 + view.getMeasuredHeight());
                j2 += view.getWidth();
            }
            j3++;
            k3 = j4;
        }
        if (r)
        {
            if (f)
            {
                if (l != 0)
                {
                    a(h);
                }
                if (((LayoutParams)g.getLayoutParams()).c)
                {
                    a(g, h, b);
                }
            } else
            {
                int l3 = 0;
                while (l3 < i3) 
                {
                    a(getChildAt(l3), 0.0F, b);
                    l3++;
                }
            }
            d(g);
        }
        r = false;
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1;
        int l1;
        int i2;
        int j2;
        k1 = android.view.View.MeasureSpec.getMode(i1);
        l1 = android.view.View.MeasureSpec.getSize(i1);
        i2 = android.view.View.MeasureSpec.getMode(j1);
        j2 = android.view.View.MeasureSpec.getSize(j1);
        if (k1 == 0x40000000) goto _L2; else goto _L1
_L1:
        if (!isInEditMode()) goto _L4; else goto _L3
_L3:
        if (k1 != 0x80000000) goto _L6; else goto _L5
_L5:
        int k2;
        int l2;
        int i3;
        k2 = i2;
        l2 = l1;
        i3 = j2;
_L16:
        k2;
        JVM INSTR lookupswitch 2: default 84
    //                   -2147483648: 320
    //                   1073741824: 299;
           goto _L7 _L8 _L9
_L7:
        int j3;
        int k3;
        k3 = 0;
        j3 = -1;
_L13:
        boolean flag;
        int l3;
        int i4;
        int j4;
        int k4;
        float f1;
        flag = false;
        l3 = l2 - getPaddingLeft() - getPaddingRight();
        i4 = getChildCount();
        if (i4 > 2)
        {
            Log.e("SlidingPaneLayout", "onMeasure: More than two child views are not supported.");
        }
        g = null;
        j4 = 0;
        k4 = k3;
        f1 = 0.0F;
_L11:
        View view1;
        LayoutParams layoutparams1;
        int j8;
        int k8;
        boolean flag4;
        float f3;
        if (j4 >= i4)
        {
            break; /* Loop/switch isn't completed */
        }
        view1 = getChildAt(j4);
        layoutparams1 = (LayoutParams)view1.getLayoutParams();
        if (view1.getVisibility() == 8)
        {
            layoutparams1.c = false;
            j8 = l3;
            f3 = f1;
            k8 = k4;
            flag4 = flag;
        } else
        {
label0:
            {
                if (layoutparams1.a <= 0.0F)
                {
                    break label0;
                }
                f1 += layoutparams1.a;
                if (layoutparams1.width != 0)
                {
                    break label0;
                }
                j8 = l3;
                f3 = f1;
                k8 = k4;
                flag4 = flag;
            }
        }
_L14:
        j4++;
        flag = flag4;
        k4 = k8;
        f1 = f3;
        l3 = j8;
        if (true) goto _L11; else goto _L10
_L6:
        if (k1 == 0)
        {
            k2 = i2;
            l2 = 300;
            i3 = j2;
            continue; /* Loop/switch isn't completed */
        }
          goto _L12
_L4:
        throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
_L2:
        if (i2 == 0)
        {
            if (isInEditMode())
            {
                if (i2 == 0)
                {
                    k2 = 0x80000000;
                    l2 = l1;
                    i3 = 300;
                    continue; /* Loop/switch isn't completed */
                }
            } else
            {
                throw new IllegalStateException("Height must not be UNSPECIFIED");
            }
        }
          goto _L12
_L9:
        k3 = i3 - getPaddingTop() - getPaddingBottom();
        j3 = k3;
          goto _L13
_L8:
        j3 = i3 - getPaddingTop() - getPaddingBottom();
        k3 = 0;
          goto _L13
        int l6 = layoutparams1.leftMargin + layoutparams1.rightMargin;
        int i7;
        int j7;
        int k7;
        int l7;
        int i8;
        boolean flag2;
        boolean flag3;
        float f2;
        if (layoutparams1.width == -2)
        {
            i7 = android.view.View.MeasureSpec.makeMeasureSpec(l2 - l6, 0x80000000);
        } else
        if (layoutparams1.width == -1)
        {
            i7 = android.view.View.MeasureSpec.makeMeasureSpec(l2 - l6, 0x40000000);
        } else
        {
            i7 = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams1.width, 0x40000000);
        }
        if (layoutparams1.height == -2)
        {
            j7 = android.view.View.MeasureSpec.makeMeasureSpec(j3, 0x80000000);
        } else
        if (layoutparams1.height == -1)
        {
            j7 = android.view.View.MeasureSpec.makeMeasureSpec(j3, 0x40000000);
        } else
        {
            j7 = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams1.height, 0x40000000);
        }
        view1.measure(i7, j7);
        k7 = view1.getMeasuredWidth();
        l7 = view1.getMeasuredHeight();
        if (k2 == 0x80000000 && l7 > k4)
        {
            k4 = Math.min(l7, j3);
        }
        i8 = l3 - k7;
        if (i8 < 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        layoutparams1.b = flag2;
        flag3 = flag2 | flag;
        if (layoutparams1.b)
        {
            g = view1;
        }
        j8 = i8;
        k8 = k4;
        f2 = f1;
        flag4 = flag3;
        f3 = f2;
          goto _L14
_L10:
        if (flag || f1 > 0.0F)
        {
            int l4 = l2 - e;
            int i5 = 0;
            while (i5 < i4) 
            {
                View view = getChildAt(i5);
                if (view.getVisibility() != 8)
                {
                    LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                    if (view.getVisibility() != 8)
                    {
                        boolean flag1;
                        int j5;
                        if (layoutparams.width == 0 && layoutparams.a > 0.0F)
                        {
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                        if (flag1)
                        {
                            j5 = 0;
                        } else
                        {
                            j5 = view.getMeasuredWidth();
                        }
                        if (flag && view != g)
                        {
                            if (layoutparams.width < 0 && (j5 > l4 || layoutparams.a > 0.0F))
                            {
                                int k6;
                                if (flag1)
                                {
                                    if (layoutparams.height == -2)
                                    {
                                        k6 = android.view.View.MeasureSpec.makeMeasureSpec(j3, 0x80000000);
                                    } else
                                    if (layoutparams.height == -1)
                                    {
                                        k6 = android.view.View.MeasureSpec.makeMeasureSpec(j3, 0x40000000);
                                    } else
                                    {
                                        k6 = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000);
                                    }
                                } else
                                {
                                    k6 = android.view.View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0x40000000);
                                }
                                view.measure(android.view.View.MeasureSpec.makeMeasureSpec(l4, 0x40000000), k6);
                            }
                        } else
                        if (layoutparams.a > 0.0F)
                        {
                            int k5;
                            if (layoutparams.width == 0)
                            {
                                if (layoutparams.height == -2)
                                {
                                    k5 = android.view.View.MeasureSpec.makeMeasureSpec(j3, 0x80000000);
                                } else
                                if (layoutparams.height == -1)
                                {
                                    k5 = android.view.View.MeasureSpec.makeMeasureSpec(j3, 0x40000000);
                                } else
                                {
                                    k5 = android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000);
                                }
                            } else
                            {
                                k5 = android.view.View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0x40000000);
                            }
                            if (flag)
                            {
                                int i6 = l2 - (layoutparams.leftMargin + layoutparams.rightMargin);
                                int j6 = android.view.View.MeasureSpec.makeMeasureSpec(i6, 0x40000000);
                                if (j5 != i6)
                                {
                                    view.measure(j6, k5);
                                }
                            } else
                            {
                                int l5 = Math.max(0, l3);
                                view.measure(android.view.View.MeasureSpec.makeMeasureSpec(j5 + (int)((layoutparams.a * (float)l5) / f1), 0x40000000), k5);
                            }
                        }
                    }
                }
                i5++;
            }
        }
        setMeasuredDimension(l2, k4);
        f = flag;
        if (p.a() != 0 && !flag)
        {
            p.f();
        }
        return;
_L12:
        k2 = i2;
        l2 = l1;
        i3 = j2;
        if (true) goto _L16; else goto _L15
_L15:
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        SavedState savedstate = (SavedState)parcelable;
        super.onRestoreInstanceState(savedstate.getSuperState());
        if (savedstate.a)
        {
            b();
        } else
        {
            c();
        }
        q = savedstate.a;
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        boolean flag;
        if (e())
        {
            flag = d();
        } else
        {
            flag = q;
        }
        savedstate.a = flag;
        return savedstate;
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        if (i1 != k1)
        {
            r = true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        if (!f)
        {
            flag = super.onTouchEvent(motionevent);
        } else
        {
            p.b(motionevent);
            int i1 = motionevent.getAction();
            flag = true;
            switch (i1 & 0xff)
            {
            default:
                return flag;

            case 0: // '\0'
                float f5 = motionevent.getX();
                float f6 = motionevent.getY();
                m = f5;
                n = f6;
                return flag;

            case 1: // '\001'
                break;
            }
            if (e(g))
            {
                float f1 = motionevent.getX();
                float f2 = motionevent.getY();
                float f3 = f1 - m;
                float f4 = f2 - n;
                int j1 = p.d();
                if (f3 * f3 + f4 * f4 < (float)(j1 * j1) && p.b(g, (int)f1, (int)f2))
                {
                    a(g, 0);
                    return flag;
                }
            }
        }
        return flag;
    }

    public void requestChildFocus(View view, View view1)
    {
        super.requestChildFocus(view, view1);
        if (!isInTouchMode() && !f)
        {
            boolean flag;
            if (view == g)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            q = flag;
        }
    }

    public void setCoveredFadeColor(int i1)
    {
        c = i1;
    }

    public void setPanelSlideListener(w w1)
    {
        o = w1;
    }

    public void setParallaxDistance(int i1)
    {
        l = i1;
        requestLayout();
    }

    public void setShadowDrawable(Drawable drawable)
    {
        d = drawable;
    }

    public void setShadowResource(int i1)
    {
        setShadowDrawable(getResources().getDrawable(i1));
    }

    public void setSliderFadeColor(int i1)
    {
        b = i1;
    }

    static 
    {
        int i1 = android.os.Build.VERSION.SDK_INT;
        if (i1 >= 17)
        {
            a = new ab();
        } else
        if (i1 >= 16)
        {
            a = new aa();
        } else
        {
            a = new android.support.v4.widget.z();
        }
    }

    private class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
    {

        private static final int e[] = {
            0x1010181
        };
        public float a;
        boolean b;
        boolean c;
        Paint d;


        public LayoutParams()
        {
            super(-1, -1);
            a = 0.0F;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            a = 0.0F;
            TypedArray typedarray = context.obtainStyledAttributes(attributeset, e);
            a = typedarray.getFloat(0, 0.0F);
            typedarray.recycle();
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            a = 0.0F;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            a = 0.0F;
        }
    }


    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new x();
        boolean a;

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            int j1;
            if (a)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            parcel.writeInt(j1);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a = flag;
        }

        SavedState(Parcel parcel, s s1)
        {
            this(parcel);
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

}
