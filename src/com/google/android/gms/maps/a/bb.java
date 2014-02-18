// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.maps.a:
//            ba, bc

public abstract class bb extends Binder
    implements ba
{

    public static ba a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
        if (iinterface != null && (iinterface instanceof ba))
        {
            return (ba)iinterface;
        } else
        {
            return new bc(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        boolean flag;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener");
            flag = a();
            parcel1.writeNoException();
            break;
        }
        int k;
        if (flag)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        parcel1.writeInt(k);
        return true;
    }
}
