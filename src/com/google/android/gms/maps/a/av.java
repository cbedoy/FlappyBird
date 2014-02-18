// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.a.n;

// Referenced classes of package com.google.android.gms.maps.a:
//            au, aw

public abstract class av extends Binder
    implements au
{

    public static au a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IOnMarkerClickListener");
        if (iinterface != null && (iinterface instanceof au))
        {
            return (au)iinterface;
        } else
        {
            return new aw(ibinder);
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
            parcel1.writeString("com.google.android.gms.maps.internal.IOnMarkerClickListener");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IOnMarkerClickListener");
            flag = a(n.a(parcel.readStrongBinder()));
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
