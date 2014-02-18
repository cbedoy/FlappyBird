// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.e;
import com.google.android.gms.b.f;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.android.gms.maps.model.g;

// Referenced classes of package com.google.android.gms.maps.a:
//            p, r

public abstract class q extends Binder
    implements p
{

    public static p a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
        if (iinterface != null && (iinterface instanceof p))
        {
            return (p)iinterface;
        } else
        {
            return new r(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        VisibleRegion visibleregion;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.IProjectionDelegate");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            LatLng latlng1 = a(f.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            if (latlng1 != null)
            {
                parcel1.writeInt(1);
                latlng1.writeToParcel(parcel1, 1);
            } else
            {
                parcel1.writeInt(0);
            }
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            LatLng latlng;
            e e1;
            IBinder ibinder;
            if (parcel.readInt() != 0)
            {
                latlng = LatLng.CREATOR.a(parcel);
            } else
            {
                latlng = null;
            }
            e1 = a(latlng);
            parcel1.writeNoException();
            ibinder = null;
            if (e1 != null)
            {
                ibinder = e1.asBinder();
            }
            parcel1.writeStrongBinder(ibinder);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            visibleregion = a();
            parcel1.writeNoException();
            break;
        }
        if (visibleregion != null)
        {
            parcel1.writeInt(1);
            visibleregion.writeToParcel(parcel1, 1);
        } else
        {
            parcel1.writeInt(0);
        }
        return true;
    }
}
