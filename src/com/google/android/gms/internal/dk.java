// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.e;
import com.google.android.gms.b.f;

// Referenced classes of package com.google.android.gms.internal:
//            di

class dk
    implements di
{

    private IBinder a;

    dk(IBinder ibinder)
    {
        a = ibinder;
    }

    public e a(e e1, int i, int j)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.common.internal.ISignInButtonCreator");
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        IBinder ibinder = e1.asBinder();
_L1:
        e e2;
        parcel.writeStrongBinder(ibinder);
        parcel.writeInt(i);
        parcel.writeInt(j);
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        e2 = f.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return e2;
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
}
