// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import java.util.Comparator;

class cg
    implements Comparator
{

    cg()
    {
    }

    public int a(View view, View view1)
    {
        ViewPager.LayoutParams layoutparams = (ViewPager.LayoutParams)view.getLayoutParams();
        ViewPager.LayoutParams layoutparams1 = (ViewPager.LayoutParams)view1.getLayoutParams();
        if (layoutparams.a != layoutparams1.a)
        {
            return !layoutparams.a ? -1 : 1;
        } else
        {
            return layoutparams.e - layoutparams1.e;
        }
    }

    public int compare(Object obj, Object obj1)
    {
        return a((View)obj, (View)obj1);
    }
}
