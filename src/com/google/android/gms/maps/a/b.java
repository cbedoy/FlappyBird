// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.e;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.c;
import com.google.android.gms.maps.model.f;
import com.google.android.gms.maps.model.g;

// Referenced classes of package com.google.android.gms.maps.a:
//            a, c

public abstract class b extends Binder
    implements a
{

    public static a a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        if (iinterface != null && (iinterface instanceof a))
        {
            return (a)iinterface;
        } else
        {
            return new com.google.android.gms.maps.a.c(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            e e11 = a();
            parcel1.writeNoException();
            IBinder ibinder10 = null;
            if (e11 != null)
            {
                ibinder10 = e11.asBinder();
            }
            parcel1.writeStrongBinder(ibinder10);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            e e10 = b();
            parcel1.writeNoException();
            IBinder ibinder9 = null;
            if (e10 != null)
            {
                ibinder9 = e10.asBinder();
            }
            parcel1.writeStrongBinder(ibinder9);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            e e9 = a(parcel.readFloat(), parcel.readFloat());
            parcel1.writeNoException();
            IBinder ibinder8 = null;
            if (e9 != null)
            {
                ibinder8 = e9.asBinder();
            }
            parcel1.writeStrongBinder(ibinder8);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            e e8 = a(parcel.readFloat());
            parcel1.writeNoException();
            IBinder ibinder7 = null;
            if (e8 != null)
            {
                ibinder7 = e8.asBinder();
            }
            parcel1.writeStrongBinder(ibinder7);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            e e7 = b(parcel.readFloat());
            parcel1.writeNoException();
            IBinder ibinder6 = null;
            if (e7 != null)
            {
                ibinder6 = e7.asBinder();
            }
            parcel1.writeStrongBinder(ibinder6);
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            e e6 = a(parcel.readFloat(), parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            IBinder ibinder5 = null;
            if (e6 != null)
            {
                ibinder5 = e6.asBinder();
            }
            parcel1.writeStrongBinder(ibinder5);
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            CameraPosition cameraposition;
            e e5;
            IBinder ibinder4;
            if (parcel.readInt() != 0)
            {
                cameraposition = CameraPosition.CREATOR.a(parcel);
            } else
            {
                cameraposition = null;
            }
            e5 = a(cameraposition);
            parcel1.writeNoException();
            ibinder4 = null;
            if (e5 != null)
            {
                ibinder4 = e5.asBinder();
            }
            parcel1.writeStrongBinder(ibinder4);
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            LatLng latlng1;
            e e4;
            IBinder ibinder3;
            if (parcel.readInt() != 0)
            {
                latlng1 = LatLng.CREATOR.a(parcel);
            } else
            {
                latlng1 = null;
            }
            e4 = a(latlng1);
            parcel1.writeNoException();
            ibinder3 = null;
            if (e4 != null)
            {
                ibinder3 = e4.asBinder();
            }
            parcel1.writeStrongBinder(ibinder3);
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            LatLng latlng;
            e e3;
            IBinder ibinder2;
            if (parcel.readInt() != 0)
            {
                latlng = LatLng.CREATOR.a(parcel);
            } else
            {
                latlng = null;
            }
            e3 = a(latlng, parcel.readFloat());
            parcel1.writeNoException();
            ibinder2 = null;
            if (e3 != null)
            {
                ibinder2 = e3.asBinder();
            }
            parcel1.writeStrongBinder(ibinder2);
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            LatLngBounds latlngbounds1;
            e e2;
            IBinder ibinder1;
            if (parcel.readInt() != 0)
            {
                latlngbounds1 = LatLngBounds.CREATOR.a(parcel);
            } else
            {
                latlngbounds1 = null;
            }
            e2 = a(latlngbounds1, parcel.readInt());
            parcel1.writeNoException();
            ibinder1 = null;
            if (e2 != null)
            {
                ibinder1 = e2.asBinder();
            }
            parcel1.writeStrongBinder(ibinder1);
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            break;
        }
        LatLngBounds latlngbounds;
        e e1;
        IBinder ibinder;
        if (parcel.readInt() != 0)
        {
            latlngbounds = LatLngBounds.CREATOR.a(parcel);
        } else
        {
            latlngbounds = null;
        }
        e1 = a(latlngbounds, parcel.readInt(), parcel.readInt(), parcel.readInt());
        parcel1.writeNoException();
        ibinder = null;
        if (e1 != null)
        {
            ibinder = e1.asBinder();
        }
        parcel1.writeStrongBinder(ibinder);
        return true;
    }
}
