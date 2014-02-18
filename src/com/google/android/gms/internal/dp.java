// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.b.h;
import com.google.android.gms.b.j;
import com.google.android.gms.b.k;

// Referenced classes of package com.google.android.gms.internal:
//            di, dj

public final class dp extends j
{

    private static final dp a = new dp();

    private dp()
    {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    public static View a(Context context, int i, int l)
    {
        return a.b(context, i, l);
    }

    private View b(Context context, int i, int l)
    {
        View view;
        try
        {
            com.google.android.gms.b.e e = h.a(context);
            view = (View)h.a(((di)a(context)).a(e, i, l));
        }
        catch (Exception exception)
        {
            throw new k((new StringBuilder()).append("Could not get button with size ").append(i).append(" and color ").append(l).toString(), exception);
        }
        return view;
    }

    public Object a(IBinder ibinder)
    {
        return b(ibinder);
    }

    public di b(IBinder ibinder)
    {
        return dj.a(ibinder);
    }

}
