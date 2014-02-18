// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.e;

// Referenced classes of package com.google.android.gms.maps.a:
//            m, o, d

public abstract class n extends Binder
    implements m
{

    public static m a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
        if (iinterface != null && (iinterface instanceof m))
        {
            return (m)iinterface;
        } else
        {
            return new o(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        e e1;
        IBinder ibinder;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.IMapViewDelegate");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            d d1 = a();
            parcel1.writeNoException();
            IBinder ibinder1 = null;
            if (d1 != null)
            {
                ibinder1 = d1.asBinder();
            }
            parcel1.writeStrongBinder(ibinder1);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            int l = parcel.readInt();
            Bundle bundle1 = null;
            if (l != 0)
            {
                bundle1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            a(bundle1);
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            b();
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            c();
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            d();
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            e();
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            int k = parcel.readInt();
            Bundle bundle = null;
            if (k != 0)
            {
                bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            b(bundle);
            parcel1.writeNoException();
            if (bundle != null)
            {
                parcel1.writeInt(1);
                bundle.writeToParcel(parcel1, 1);
            } else
            {
                parcel1.writeInt(0);
            }
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            e1 = f();
            parcel1.writeNoException();
            ibinder = null;
            break;
        }
        if (e1 != null)
        {
            ibinder = e1.asBinder();
        }
        parcel1.writeStrongBinder(ibinder);
        return true;
    }
}
