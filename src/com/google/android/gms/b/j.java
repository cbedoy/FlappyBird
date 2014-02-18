// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.f;
import com.google.android.gms.internal.do;

// Referenced classes of package com.google.android.gms.b:
//            k

public abstract class j
{

    private final String a;
    private Object b;

    protected j(String s)
    {
        a = s;
    }

    protected final Object a(Context context)
    {
        if (b == null)
        {
            com.google.android.gms.internal.do.a(context);
            Context context1 = f.b(context);
            if (context1 == null)
            {
                throw new k("Could not get remote context.");
            }
            ClassLoader classloader = context1.getClassLoader();
            try
            {
                b = a((IBinder)classloader.loadClass(a).newInstance());
            }
            catch (ClassNotFoundException classnotfoundexception)
            {
                throw new k("Could not load creator class.");
            }
            catch (InstantiationException instantiationexception)
            {
                throw new k("Could not instantiate creator.");
            }
            catch (IllegalAccessException illegalaccessexception)
            {
                throw new k("Could not access creator.");
            }
        }
        return b;
    }

    protected abstract Object a(IBinder ibinder);
}
