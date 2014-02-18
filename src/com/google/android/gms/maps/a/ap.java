// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.g;

// Referenced classes of package com.google.android.gms.maps.a:
//            ao, aq

public abstract class ap extends Binder
    implements ao
{

    public static ao a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapClickListener");
        if (iinterface != null && (iinterface instanceof ao))
        {
            return (ao)iinterface;
        } else
        {
            return new aq(ibinder);
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
            parcel1.writeString("com.google.android.gms.maps.internal.IOnMapClickListener");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMapClickListener");
            break;
        }
        LatLng latlng;
        if (parcel.readInt() != 0)
        {
            latlng = LatLng.CREATOR.a(parcel);
        } else
        {
            latlng = null;
        }
        a(latlng);
        parcel1.writeNoException();
        return true;
    }
}
