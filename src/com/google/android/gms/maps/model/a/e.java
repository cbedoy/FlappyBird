// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.a;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.maps.model.a:
//            d, f

public abstract class e extends Binder
    implements d
{

    public static d a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        if (iinterface != null && (iinterface instanceof d))
        {
            return (d)iinterface;
        } else
        {
            return new f(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        com.google.android.gms.b.e e1;
        IBinder ibinder;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            com.google.android.gms.b.e e7 = a(parcel.readInt());
            parcel1.writeNoException();
            IBinder ibinder6;
            if (e7 != null)
            {
                ibinder6 = e7.asBinder();
            } else
            {
                ibinder6 = null;
            }
            parcel1.writeStrongBinder(ibinder6);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            com.google.android.gms.b.e e6 = a(parcel.readString());
            parcel1.writeNoException();
            IBinder ibinder5 = null;
            if (e6 != null)
            {
                ibinder5 = e6.asBinder();
            }
            parcel1.writeStrongBinder(ibinder5);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            com.google.android.gms.b.e e5 = b(parcel.readString());
            parcel1.writeNoException();
            IBinder ibinder4 = null;
            if (e5 != null)
            {
                ibinder4 = e5.asBinder();
            }
            parcel1.writeStrongBinder(ibinder4);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            com.google.android.gms.b.e e4 = a();
            parcel1.writeNoException();
            IBinder ibinder3 = null;
            if (e4 != null)
            {
                ibinder3 = e4.asBinder();
            }
            parcel1.writeStrongBinder(ibinder3);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            com.google.android.gms.b.e e3 = a(parcel.readFloat());
            parcel1.writeNoException();
            IBinder ibinder2 = null;
            if (e3 != null)
            {
                ibinder2 = e3.asBinder();
            }
            parcel1.writeStrongBinder(ibinder2);
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            Bitmap bitmap;
            com.google.android.gms.b.e e2;
            IBinder ibinder1;
            if (parcel.readInt() != 0)
            {
                bitmap = (Bitmap)Bitmap.CREATOR.createFromParcel(parcel);
            } else
            {
                bitmap = null;
            }
            e2 = a(bitmap);
            parcel1.writeNoException();
            ibinder1 = null;
            if (e2 != null)
            {
                ibinder1 = e2.asBinder();
            }
            parcel1.writeStrongBinder(ibinder1);
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
            e1 = c(parcel.readString());
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
