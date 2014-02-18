// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal:
//            ax, az

public abstract class ay extends Binder
    implements ax
{

    public static ax a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusOneDelegate");
        if (iinterface != null && (iinterface instanceof ax))
        {
            return (ax)iinterface;
        } else
        {
            return new az(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.plus.internal.IPlusOneDelegate");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusOneDelegate");
            PendingIntent pendingintent = a();
            parcel1.writeNoException();
            if (pendingintent != null)
            {
                parcel1.writeInt(1);
                pendingintent.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusOneDelegate");
            b();
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusOneDelegate");
            c();
            parcel1.writeNoException();
            return true;
        }
    }
}
