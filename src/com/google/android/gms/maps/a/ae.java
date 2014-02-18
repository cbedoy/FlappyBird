// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.e;
import com.google.android.gms.b.f;
import com.google.android.gms.maps.model.a.m;

// Referenced classes of package com.google.android.gms.maps.a:
//            ac

class ae
    implements ac
{

    private IBinder a;

    ae(IBinder ibinder)
    {
        a = ibinder;
    }

    public e a(m m1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        if (m1 == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        IBinder ibinder = m1.asBinder();
_L1:
        e e;
        parcel.writeStrongBinder(ibinder);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        e = f.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return e;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public IBinder asBinder()
    {
        return a;
    }

    public e b(m m1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IInfoWindowAdapter");
        if (m1 == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        IBinder ibinder = m1.asBinder();
_L1:
        e e;
        parcel.writeStrongBinder(ibinder);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        e = f.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return e;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }
}
