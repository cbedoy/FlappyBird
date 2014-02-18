// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.e;
import com.google.android.gms.b.f;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

// Referenced classes of package com.google.android.gms.maps.a:
//            a

class c
    implements a
{

    private IBinder a;

    c(IBinder ibinder)
    {
        a = ibinder;
    }

    public e a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        e e;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        e = f.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return e;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public e a(float f1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        e e;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        parcel.writeFloat(f1);
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        e = f.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return e;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public e a(float f1, float f2)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        e e;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        parcel.writeFloat(f1);
        parcel.writeFloat(f2);
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        e = f.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return e;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public e a(float f1, int i, int j)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        e e;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        parcel.writeFloat(f1);
        parcel.writeInt(i);
        parcel.writeInt(j);
        a.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        e = f.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return e;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public e a(CameraPosition cameraposition)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        if (cameraposition == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        parcel.writeInt(1);
        cameraposition.writeToParcel(parcel, 0);
_L1:
        e e;
        a.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        e = f.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return e;
        parcel.writeInt(0);
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public e a(LatLng latlng)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        if (latlng == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        parcel.writeInt(1);
        latlng.writeToParcel(parcel, 0);
_L1:
        e e;
        a.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        e = f.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return e;
        parcel.writeInt(0);
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public e a(LatLng latlng, float f1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        if (latlng == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        parcel.writeInt(1);
        latlng.writeToParcel(parcel, 0);
_L1:
        e e;
        parcel.writeFloat(f1);
        a.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        e = f.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return e;
        parcel.writeInt(0);
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public e a(LatLngBounds latlngbounds, int i)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        if (latlngbounds == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        parcel.writeInt(1);
        latlngbounds.writeToParcel(parcel, 0);
_L1:
        e e;
        parcel.writeInt(i);
        a.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        e = f.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return e;
        parcel.writeInt(0);
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public e a(LatLngBounds latlngbounds, int i, int j, int k)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        if (latlngbounds == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        parcel.writeInt(1);
        latlngbounds.writeToParcel(parcel, 0);
_L1:
        e e;
        parcel.writeInt(i);
        parcel.writeInt(j);
        parcel.writeInt(k);
        a.transact(11, parcel, parcel1, 0);
        parcel1.readException();
        e = f.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return e;
        parcel.writeInt(0);
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

    public e b()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        e e;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        e = f.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return e;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public e b(float f1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        e e;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
        parcel.writeFloat(f1);
        a.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        e = f.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return e;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }
}
