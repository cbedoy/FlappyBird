// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.util;

import com.google.ads.a.a;
import com.google.ads.a.e;
import com.google.ads.bt;
import com.google.ads.g;

// Referenced classes of package com.google.ads.util:
//            ad

public class c extends e
{

    public c(bt bt1, g g)
    {
        super(bt1, g);
    }

    public boolean canScrollHorizontally(int i)
    {
        if (a.e.a() != null)
        {
            return !((a)a.e.a()).b();
        } else
        {
            return super.canScrollHorizontally(i);
        }
    }

    public boolean canScrollVertically(int i)
    {
        if (a.e.a() != null)
        {
            return !((a)a.e.a()).b();
        } else
        {
            return super.canScrollVertically(i);
        }
    }
}
