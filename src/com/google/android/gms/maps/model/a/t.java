// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.maps.model.a:
//            s, u

public abstract class t extends Binder
    implements s
{

    public static s a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
        if (iinterface != null && (iinterface instanceof s))
        {
            return (s)iinterface;
        } else
        {
            return new u(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
            a();
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
            b();
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
            String s1 = c();
            parcel1.writeNoException();
            parcel1.writeString(s1);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
            a(parcel.readFloat());
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
            float f = d();
            parcel1.writeNoException();
            parcel1.writeFloat(f);
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
            int j1 = parcel.readInt();
            boolean flag2 = false;
            if (j1 != 0)
            {
                flag2 = true;
            }
            a(flag2);
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
            boolean flag1 = e();
            parcel1.writeNoException();
            int i1 = 0;
            if (flag1)
            {
                i1 = 1;
            }
            parcel1.writeInt(i1);
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
            boolean flag = a(a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            int l = 0;
            if (flag)
            {
                l = 1;
            }
            parcel1.writeInt(l);
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
            int k = f();
            parcel1.writeNoException();
            parcel1.writeInt(k);
            return true;
        }
    }
}
