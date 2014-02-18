// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.view.View;
import com.google.android.gms.b.h;
import com.google.android.gms.plus.f;

// Referenced classes of package com.google.android.gms.internal:
//            at, do, bf, au

public final class be
{

    private static Context a;
    private static at b;

    public static View a(Context context, int i, int j, String s, int k)
    {
        if (s == null)
        {
            try
            {
                throw new NullPointerException();
            }
            catch (Exception exception)
            {
                return new f(context, i);
            }
        }
        View view = (View)h.a(a(context).a(h.a(context), i, j, s, k));
        return view;
    }

    public static View a(Context context, int i, int j, String s, String s1)
    {
        if (s == null)
        {
            try
            {
                throw new NullPointerException();
            }
            catch (Exception exception)
            {
                return new f(context, i);
            }
        }
        View view = (View)h.a(a(context).a(h.a(context), i, j, s, s1));
        return view;
    }

    private static at a(Context context)
    {
        com.google.android.gms.internal.do.a(context);
        if (b == null)
        {
            if (a == null)
            {
                a = com.google.android.gms.common.f.b(context);
                if (a == null)
                {
                    throw new bf("Could not get remote context.");
                }
            }
            ClassLoader classloader = a.getClassLoader();
            try
            {
                b = au.a((IBinder)classloader.loadClass("com.google.android.gms.plus.plusone.PlusOneButtonCreatorImpl").newInstance());
            }
            catch (ClassNotFoundException classnotfoundexception)
            {
                throw new bf("Could not load creator class.");
            }
            catch (InstantiationException instantiationexception)
            {
                throw new bf("Could not instantiate creator.");
            }
            catch (IllegalAccessException illegalaccessexception)
            {
                throw new bf("Could not access creator.");
            }
        }
        return b;
    }
}
