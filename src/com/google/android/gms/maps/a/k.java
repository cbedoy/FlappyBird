// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.e;
import com.google.android.gms.b.f;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.b;

// Referenced classes of package com.google.android.gms.maps.a:
//            j, l, d

public abstract class k extends Binder
    implements j
{

    public static j a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
        if (iinterface != null && (iinterface instanceof j))
        {
            return (j)iinterface;
        } else
        {
            return new l(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int i1)
    {
        boolean flag;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, i1);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            d d1 = a();
            parcel1.writeNoException();
            IBinder ibinder1;
            if (d1 != null)
            {
                ibinder1 = d1.asBinder();
            } else
            {
                ibinder1 = null;
            }
            parcel1.writeStrongBinder(ibinder1);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            e e4 = f.a(parcel.readStrongBinder());
            GoogleMapOptions googlemapoptions;
            Bundle bundle3;
            if (parcel.readInt() != 0)
            {
                googlemapoptions = GoogleMapOptions.CREATOR.a(parcel);
            } else
            {
                googlemapoptions = null;
            }
            if (parcel.readInt() != 0)
            {
                bundle3 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                bundle3 = null;
            }
            a(e4, googlemapoptions, bundle3);
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            Bundle bundle2;
            if (parcel.readInt() != 0)
            {
                bundle2 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                bundle2 = null;
            }
            a(bundle2);
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            e e1 = f.a(parcel.readStrongBinder());
            e e2 = f.a(parcel.readStrongBinder());
            Bundle bundle1;
            e e3;
            IBinder ibinder;
            if (parcel.readInt() != 0)
            {
                bundle1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                bundle1 = null;
            }
            e3 = a(e1, e2, bundle1);
            parcel1.writeNoException();
            ibinder = null;
            if (e3 != null)
            {
                ibinder = e3.asBinder();
            }
            parcel1.writeStrongBinder(ibinder);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            b();
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            c();
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            d();
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            e();
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            f();
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            Bundle bundle;
            if (parcel.readInt() != 0)
            {
                bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                bundle = null;
            }
            b(bundle);
            parcel1.writeNoException();
            if (bundle != null)
            {
                parcel1.writeInt(1);
                bundle.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            flag = g();
            parcel1.writeNoException();
            break;
        }
        int j1;
        if (flag)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        parcel1.writeInt(j1);
        return true;
    }
}
