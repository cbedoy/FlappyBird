// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.e;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.a.d;

// Referenced classes of package com.google.android.gms.maps.a:
//            z, b, n, k, 
//            a, m, j

class ab
    implements z
{

    private IBinder a;

    ab(IBinder ibinder)
    {
        a = ibinder;
    }

    public a a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        a a1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        a1 = com.google.android.gms.maps.a.b.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return a1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public m a(e e1, GoogleMapOptions googlemapoptions)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        if (e1 == null) goto _L2; else goto _L1
_L1:
        IBinder ibinder = e1.asBinder();
_L5:
        parcel.writeStrongBinder(ibinder);
        if (googlemapoptions == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        googlemapoptions.writeToParcel(parcel, 0);
_L6:
        m m;
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        m = n.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return m;
_L2:
        ibinder = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
          goto _L5
    }

    public void a(e e1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        IBinder ibinder = e1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void a(e e1, int i)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        IBinder ibinder = e1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeInt(i);
        a.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
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

    public j b(e e1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        IBinder ibinder = e1.asBinder();
_L1:
        j j;
        parcel.writeStrongBinder(ibinder);
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        j = k.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return j;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public d b()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        d d;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICreator");
        a.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        d = com.google.android.gms.maps.model.a.e.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return d;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }
}
