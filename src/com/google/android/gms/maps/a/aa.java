// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.f;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.b;
import com.google.android.gms.maps.model.a.d;

// Referenced classes of package com.google.android.gms.maps.a:
//            z, ab, j, m, 
//            a

public abstract class aa extends Binder
    implements z
{

    public static z a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
        if (iinterface != null && (iinterface instanceof z))
        {
            return (z)iinterface;
        } else
        {
            return new ab(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int k)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, k);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.ICreator");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
            a(f.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
            j j1 = b(f.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            IBinder ibinder3 = null;
            if (j1 != null)
            {
                ibinder3 = j1.asBinder();
            }
            parcel1.writeStrongBinder(ibinder3);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
            com.google.android.gms.b.e e = f.a(parcel.readStrongBinder());
            GoogleMapOptions googlemapoptions;
            m m1;
            IBinder ibinder2;
            if (parcel.readInt() != 0)
            {
                googlemapoptions = GoogleMapOptions.CREATOR.a(parcel);
            } else
            {
                googlemapoptions = null;
            }
            m1 = a(e, googlemapoptions);
            parcel1.writeNoException();
            ibinder2 = null;
            if (m1 != null)
            {
                ibinder2 = m1.asBinder();
            }
            parcel1.writeStrongBinder(ibinder2);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
            a a1 = a();
            parcel1.writeNoException();
            IBinder ibinder1 = null;
            if (a1 != null)
            {
                ibinder1 = a1.asBinder();
            }
            parcel1.writeStrongBinder(ibinder1);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
            d d1 = b();
            parcel1.writeNoException();
            IBinder ibinder = null;
            if (d1 != null)
            {
                ibinder = d1.asBinder();
            }
            parcel1.writeStrongBinder(ibinder);
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ICreator");
            a(f.a(parcel.readStrongBinder()), parcel.readInt());
            parcel1.writeNoException();
            return true;
        }
    }
}
