// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import java.lang.reflect.Field;

// Referenced classes of package com.google.android.gms.b:
//            f, e

public final class h extends f
{

    private final Object a;

    private h(Object obj)
    {
        a = obj;
    }

    public static e a(Object obj)
    {
        return new h(obj);
    }

    public static Object a(e e1)
    {
        if (e1 instanceof h)
        {
            return ((h)e1).a;
        }
        android.os.IBinder ibinder = e1.asBinder();
        Field afield[] = ibinder.getClass().getDeclaredFields();
        if (afield.length == 1)
        {
            Field field = afield[0];
            if (!field.isAccessible())
            {
                field.setAccessible(true);
                Object obj;
                try
                {
                    obj = field.get(ibinder);
                }
                catch (NullPointerException nullpointerexception)
                {
                    throw new IllegalArgumentException("Binder object is null.", nullpointerexception);
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    throw new IllegalArgumentException("remoteBinder is the wrong class.", illegalargumentexception);
                }
                catch (IllegalAccessException illegalaccessexception)
                {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", illegalaccessexception);
                }
                return obj;
            } else
            {
                throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly one declared *private* field for the wrapped object. Preferably, this is an instance of the ObjectWrapper<T> class.");
            }
        } else
        {
            throw new IllegalArgumentException("The concrete class implementing IObjectWrapper must have exactly *one* declared private field for the wrapped object.  Preferably, this is an instance of the ObjectWrapper<T> class.");
        }
    }
}
