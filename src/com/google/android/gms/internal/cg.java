// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal:
//            ce, ca

class cg
    implements ce
{

    private IBinder a;

    cg(IBinder ibinder)
    {
        a = ibinder;
    }

    public int a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        a.transact(5001, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void a(ca ca1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (ca1 == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        IBinder ibinder = ca1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        a.transact(5005, parcel, parcel1, 0);
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

    public void a(ca ca1, int i)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (ca1 == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        IBinder ibinder = ca1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeInt(i);
        a.transact(5004, parcel, parcel1, 0);
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

    public void a(ca ca1, int i, String s, byte abyte0[])
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (ca1 == null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        IBinder ibinder = ca1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeInt(i);
        parcel.writeString(s);
        parcel.writeByteArray(abyte0);
        a.transact(5006, parcel, parcel1, 0);
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

    public void a(ca ca1, int i, byte abyte0[])
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (ca1 == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        IBinder ibinder = ca1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeInt(i);
        parcel.writeByteArray(abyte0);
        a.transact(5003, parcel, parcel1, 0);
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

    public int b()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i;
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        a.transact(5002, parcel, parcel1, 0);
        parcel1.readException();
        i = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void b(ca ca1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (ca1 == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        IBinder ibinder = ca1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        a.transact(5008, parcel, parcel1, 0);
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

    public void b(ca ca1, int i)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (ca1 == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        IBinder ibinder = ca1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeInt(i);
        a.transact(5007, parcel, parcel1, 0);
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

    public void c(ca ca1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.appstate.internal.IAppStateService");
        if (ca1 == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        IBinder ibinder = ca1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        a.transact(5009, parcel, parcel1, 0);
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
}
