// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.TabHost;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            v, m, w, Fragment

public class FragmentTabHost extends TabHost
    implements android.widget.TabHost.OnTabChangeListener
{

    private final ArrayList a = new ArrayList();
    private Context b;
    private m c;
    private int d;
    private android.widget.TabHost.OnTabChangeListener e;
    private v f;
    private boolean g;

    public FragmentTabHost(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context, attributeset);
    }

    private w a(String s, w w1)
    {
        v v1 = null;
        int i = 0;
        while (i < a.size()) 
        {
            v v2 = (v)a.get(i);
            if (!v.b(v2).equals(s))
            {
                v2 = v1;
            }
            i++;
            v1 = v2;
        }
        if (v1 == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("No tab known for tag ").append(s).toString());
        }
        if (f != v1)
        {
            if (w1 == null)
            {
                w1 = c.a();
            }
            if (f != null && v.a(f) != null)
            {
                w1.a(v.a(f));
            }
            if (v1 != null)
            {
                if (v.a(v1) == null)
                {
                    v.a(v1, Fragment.a(b, v.c(v1).getName(), v.d(v1)));
                    w1.a(d, v.a(v1), v.b(v1));
                } else
                {
                    w1.b(v.a(v1));
                }
            }
            f = v1;
        }
        return w1;
    }

    private void a(Context context, AttributeSet attributeset)
    {
        TypedArray typedarray = context.obtainStyledAttributes(attributeset, new int[] {
            0x10100f3
        }, 0, 0);
        d = typedarray.getResourceId(0, 0);
        typedarray.recycle();
        super.setOnTabChangedListener(this);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        String s = getCurrentTabTag();
        w w1 = null;
        int i = 0;
        while (i < a.size()) 
        {
            v v1 = (v)a.get(i);
            v.a(v1, c.a(v.b(v1)));
            if (v.a(v1) != null && !v.a(v1).d())
            {
                if (v.b(v1).equals(s))
                {
                    f = v1;
                } else
                {
                    if (w1 == null)
                    {
                        w1 = c.a();
                    }
                    w1.a(v.a(v1));
                }
            }
            i++;
        }
        g = true;
        w w2 = a(s, w1);
        if (w2 != null)
        {
            w2.a();
            c.b();
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        g = false;
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        SavedState savedstate = (SavedState)parcelable;
        super.onRestoreInstanceState(savedstate.getSuperState());
        setCurrentTabByTag(savedstate.a);
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        savedstate.a = getCurrentTabTag();
        return savedstate;
    }

    public void onTabChanged(String s)
    {
        if (g)
        {
            w w1 = a(s, ((w) (null)));
            if (w1 != null)
            {
                w1.a();
            }
        }
        if (e != null)
        {
            e.onTabChanged(s);
        }
    }

    public void setOnTabChangedListener(android.widget.TabHost.OnTabChangeListener ontabchangelistener)
    {
        e = ontabchangelistener;
    }

    public void setup()
    {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }

    private class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new u();
        String a;

        public String toString()
        {
            return (new StringBuilder()).append("FragmentTabHost.SavedState{").append(Integer.toHexString(System.identityHashCode(this))).append(" curTab=").append(a).append("}").toString();
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            super.writeToParcel(parcel, i);
            parcel.writeString(a);
        }


        private SavedState(Parcel parcel)
        {
            super(parcel);
            a = parcel.readString();
        }

        SavedState(Parcel parcel, t t)
        {
            this(parcel);
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

}
