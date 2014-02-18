// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;

// Referenced classes of package com.google.android.gms.maps.model.a:
//            a, c

public abstract class b extends Binder
    implements a
{

    public static a a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
        if (iinterface != null && (iinterface instanceof a))
        {
            return (a)iinterface;
        } else
        {
            return new c(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            a();
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            String s = b();
            parcel1.writeNoException();
            parcel1.writeString(s);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            a(parcel.createTypedArrayList(LatLng.CREATOR));
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            java.util.List list = c();
            parcel1.writeNoException();
            parcel1.writeTypedList(list);
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            a(parcel.readFloat());
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            float f1 = d();
            parcel1.writeNoException();
            parcel1.writeFloat(f1);
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            a(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            int i2 = e();
            parcel1.writeNoException();
            parcel1.writeInt(i2);
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            b(parcel.readFloat());
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            float f = f();
            parcel1.writeNoException();
            parcel1.writeFloat(f);
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            int l1 = parcel.readInt();
            boolean flag4 = false;
            if (l1 != 0)
            {
                flag4 = true;
            }
            a(flag4);
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            boolean flag3 = g();
            parcel1.writeNoException();
            int k1 = 0;
            if (flag3)
            {
                k1 = 1;
            }
            parcel1.writeInt(k1);
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            int j1 = parcel.readInt();
            boolean flag2 = false;
            if (j1 != 0)
            {
                flag2 = true;
            }
            b(flag2);
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            boolean flag1 = h();
            parcel1.writeNoException();
            int i1 = 0;
            if (flag1)
            {
                i1 = 1;
            }
            parcel1.writeInt(i1);
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            boolean flag = a(a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            int l = 0;
            if (flag)
            {
                l = 1;
            }
            parcel1.writeInt(l);
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IPolylineDelegate");
            int k = i();
            parcel1.writeNoException();
            parcel1.writeInt(k);
            return true;
        }
    }
}
