// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.g;

// Referenced classes of package com.google.android.gms.maps.model.a:
//            g, i

public abstract class h extends Binder
    implements com.google.android.gms.maps.model.a.g
{

    public static com.google.android.gms.maps.model.a.g a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
        if (iinterface != null && (iinterface instanceof com.google.android.gms.maps.model.a.g))
        {
            return (com.google.android.gms.maps.model.a.g)iinterface;
        } else
        {
            return new i(ibinder);
        }
    }

    public boolean onTransact(int j, Parcel parcel, Parcel parcel1, int k)
    {
        switch (j)
        {
        default:
            return super.onTransact(j, parcel, parcel1, k);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.model.internal.ICircleDelegate");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
            a();
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
            String s = b();
            parcel1.writeNoException();
            parcel1.writeString(s);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
            LatLng latlng1;
            if (parcel.readInt() != 0)
            {
                latlng1 = LatLng.CREATOR.a(parcel);
            } else
            {
                latlng1 = null;
            }
            a(latlng1);
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
            LatLng latlng = c();
            parcel1.writeNoException();
            if (latlng != null)
            {
                parcel1.writeInt(1);
                latlng.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
            a(parcel.readDouble());
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
            double d = d();
            parcel1.writeNoException();
            parcel1.writeDouble(d);
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
            a(parcel.readFloat());
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
            float f1 = e();
            parcel1.writeNoException();
            parcel1.writeFloat(f1);
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
            a(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
            int i2 = f();
            parcel1.writeNoException();
            parcel1.writeInt(i2);
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
            b(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
            int l1 = g();
            parcel1.writeNoException();
            parcel1.writeInt(l1);
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
            b(parcel.readFloat());
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
            float f = h();
            parcel1.writeNoException();
            parcel1.writeFloat(f);
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
            int k1 = parcel.readInt();
            boolean flag2 = false;
            if (k1 != 0)
            {
                flag2 = true;
            }
            a(flag2);
            parcel1.writeNoException();
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
            boolean flag1 = i();
            parcel1.writeNoException();
            int j1 = 0;
            if (flag1)
            {
                j1 = 1;
            }
            parcel1.writeInt(j1);
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
            boolean flag = a(a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            int i1 = 0;
            if (flag)
            {
                i1 = 1;
            }
            parcel1.writeInt(i1);
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.ICircleDelegate");
            int l = j();
            parcel1.writeNoException();
            parcel1.writeInt(l);
            return true;
        }
    }
}
