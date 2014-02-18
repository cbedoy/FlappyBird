// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.maps.a:
//            bg, bi

public abstract class bh extends Binder
    implements bg
{

    public static bg a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
        if (iinterface != null && (iinterface instanceof bg))
        {
            return (bg)iinterface;
        } else
        {
            return new bi(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.ISnapshotReadyCallback");
            break;
        }
        Bitmap bitmap;
        if (parcel.readInt() != 0)
        {
            bitmap = (Bitmap)Bitmap.CREATOR.createFromParcel(parcel);
        } else
        {
            bitmap = null;
        }
        a(bitmap);
        parcel1.writeNoException();
        return true;
    }
}
