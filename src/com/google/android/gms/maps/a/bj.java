// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.b.h;
import com.google.android.gms.common.e;
import com.google.android.gms.common.f;
import com.google.android.gms.internal.do;
import com.google.android.gms.maps.model.k;

// Referenced classes of package com.google.android.gms.maps.a:
//            aa, z

public class bj
{

    private static Context a;
    private static z b;

    public bj()
    {
    }

    public static z a(Context context)
    {
        com.google.android.gms.internal.do.a(context);
        b(context);
        if (b == null)
        {
            d(context);
        }
        if (b != null)
        {
            return b;
        } else
        {
            b = aa.a((IBinder)a(e(context).getClassLoader(), "com.google.android.gms.maps.internal.CreatorImpl"));
            c(context);
            return b;
        }
    }

    private static Class a()
    {
        Class class1;
        try
        {
            class1 = Class.forName("com.google.android.gms.maps.internal.CreatorImpl");
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            return null;
        }
        return class1;
    }

    private static Object a(Class class1)
    {
        Object obj;
        try
        {
            obj = class1.newInstance();
        }
        catch (InstantiationException instantiationexception)
        {
            throw new IllegalStateException((new StringBuilder()).append("Unable to instantiate the dynamic class ").append(class1.getName()).toString());
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new IllegalStateException((new StringBuilder()).append("Unable to call the default constructor of ").append(class1.getName()).toString());
        }
        return obj;
    }

    private static Object a(ClassLoader classloader, String s)
    {
        Object obj;
        try
        {
            obj = a(((ClassLoader)com.google.android.gms.internal.do.a(classloader)).loadClass(s));
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            throw new IllegalStateException((new StringBuilder()).append("Unable to find dynamic class ").append(s).toString());
        }
        return obj;
    }

    public static void b(Context context)
    {
        int i = f.a(context);
        if (i != 0)
        {
            throw new e(i);
        } else
        {
            return;
        }
    }

    private static void c(Context context)
    {
        try
        {
            b.a(h.a(e(context).getResources()), 0x31d24c);
            return;
        }
        catch (RemoteException remoteexception)
        {
            throw new k(remoteexception);
        }
    }

    private static void d(Context context)
    {
        Class class1 = a();
        if (class1 != null)
        {
            Log.i(com/google/android/gms/maps/a/bj.getSimpleName(), "Making Creator statically");
            b = (z)a(class1);
            c(context);
        }
    }

    private static Context e(Context context)
    {
        if (a == null)
        {
            if (a() != null)
            {
                a = context;
            } else
            {
                a = f.b(context);
            }
        }
        return a;
    }
}
