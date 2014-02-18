// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.data.d;
import com.google.android.gms.common.data.f;

// Referenced classes of package com.google.android.gms.internal:
//            ca, cd

public abstract class cb extends Binder
    implements ca
{

    public static ca a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
        if (iinterface != null && (iinterface instanceof ca))
        {
            return (ca)iinterface;
        } else
        {
            return new cd(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.appstate.internal.IAppStateCallbacks");
            return true;

        case 5001: 
            parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
            int l = parcel.readInt();
            int i1 = parcel.readInt();
            d d2 = null;
            if (i1 != 0)
            {
                d2 = d.CREATOR.a(parcel);
            }
            a(l, d2);
            parcel1.writeNoException();
            return true;

        case 5002: 
            parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
            int k = parcel.readInt();
            d d1 = null;
            if (k != 0)
            {
                d1 = d.CREATOR.a(parcel);
            }
            a(d1);
            parcel1.writeNoException();
            return true;

        case 5003: 
            parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
            a(parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 5004: 
            parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
            a();
            parcel1.writeNoException();
            return true;

        case 5005: 
            parcel.enforceInterface("com.google.android.gms.appstate.internal.IAppStateCallbacks");
            a(parcel.readInt());
            parcel1.writeNoException();
            return true;
        }
    }
}
