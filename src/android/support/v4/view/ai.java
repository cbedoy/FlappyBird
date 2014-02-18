// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.database.DataSetObserver;

// Referenced classes of package android.support.v4.view:
//            cb, cc, PagerTitleStrip, ViewPager, 
//            ah, ae

class ai extends DataSetObserver
    implements cb, cc
{

    final PagerTitleStrip a;
    private int b;

    private ai(PagerTitleStrip pagertitlestrip)
    {
        a = pagertitlestrip;
        super();
    }

    ai(PagerTitleStrip pagertitlestrip, ah ah)
    {
        this(pagertitlestrip);
    }

    public void a(int i)
    {
        if (b == 0)
        {
            a.a(a.a.getCurrentItem(), a.a.getAdapter());
            int j = PagerTitleStrip.a(a) != 0.0F;
            float f = 0.0F;
            if (j >= 0)
            {
                f = PagerTitleStrip.a(a);
            }
            a.a(a.a.getCurrentItem(), f, true);
        }
    }

    public void a(int i, float f, int j)
    {
        if (f > 0.5F)
        {
            i++;
        }
        a.a(i, f, false);
    }

    public void a(ae ae, ae ae1)
    {
        a.a(ae, ae1);
    }

    public void b(int i)
    {
        b = i;
    }

    public void onChanged()
    {
        a.a(a.a.getCurrentItem(), a.a.getAdapter());
        int i = PagerTitleStrip.a(a) != 0.0F;
        float f = 0.0F;
        if (i >= 0)
        {
            f = PagerTitleStrip.a(a);
        }
        a.a(a.a.getCurrentItem(), f, true);
    }
}
