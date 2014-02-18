// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.e;
import com.google.android.gms.b.f;

// Referenced classes of package com.google.android.gms.internal:
//            at, aw

public abstract class au extends Binder
    implements at
{

    public static at a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
        if (iinterface != null && (iinterface instanceof at))
        {
            return (at)iinterface;
        } else
        {
            return new aw(ibinder);
        }
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
            parcel1.writeString("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
            e e2 = a(f.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt());
            parcel1.writeNoException();
            IBinder ibinder1;
            if (e2 != null)
            {
                ibinder1 = e2.asBinder();
            } else
            {
                ibinder1 = null;
            }
            parcel1.writeStrongBinder(ibinder1);
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusOneButtonCreator");
            e1 = a(f.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
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
