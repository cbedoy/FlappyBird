// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.e;
import com.google.android.gms.maps.model.a.n;

// Referenced classes of package com.google.android.gms.maps.a:
//            ac, ae

public abstract class ad extends Binder
    implements ac
{

    public static ac a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        if (iinterface != null && (iinterface instanceof ac))
        {
            return (ac)iinterface;
        } else
        {
            return new ae(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
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
            parcel1.writeString("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            e e2 = a(n.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            IBinder ibinder1 = null;
            if (e2 != null)
            {
                ibinder1 = e2.asBinder();
            }
            parcel1.writeStrongBinder(ibinder1);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IInfoWindowAdapter");
            e1 = b(n.a(parcel.readStrongBinder()));
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
