// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.view.View;

// Referenced classes of package android.support.v4.app:
//            l, FragmentActivity

class i
    implements l
{

    final FragmentActivity a;

    i(FragmentActivity fragmentactivity)
    {
        a = fragmentactivity;
        super();
    }

    public View a(int j)
    {
        return a.findViewById(j);
    }
}
