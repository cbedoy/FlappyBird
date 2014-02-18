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
//            ar, at

public abstract class as extends Binder
    implements ar
{

    public static ar a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMapLongClickListener");
        if (iinterface != null && (iinterface instanceof ar))
        {
            return (ar)iinterface;
        } else
        {
            return new at(ibinder);
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
            parcel1.writeString("com.google.android.gms.maps.internal.IOnMapLongClickListener");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMapLongClickListener");
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
