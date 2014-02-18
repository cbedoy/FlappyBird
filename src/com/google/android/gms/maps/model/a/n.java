// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.a;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.f;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.g;

// Referenced classes of package com.google.android.gms.maps.model.a:
//            m, o

public abstract class n extends Binder
    implements m
{

    public static m a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        if (iinterface != null && (iinterface instanceof m))
        {
            return (m)iinterface;
        } else
        {
            return new o(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            a();
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            String s2 = b();
            parcel1.writeNoException();
            parcel1.writeString(s2);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
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
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
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
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            a(parcel.readString());
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            String s1 = d();
            parcel1.writeNoException();
            parcel1.writeString(s1);
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            b(parcel.readString());
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            String s = e();
            parcel1.writeNoException();
            parcel1.writeString(s);
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            int k2 = parcel.readInt();
            boolean flag7 = false;
            if (k2 != 0)
            {
                flag7 = true;
            }
            a(flag7);
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            boolean flag6 = f();
            parcel1.writeNoException();
            int j2 = 0;
            if (flag6)
            {
                j2 = 1;
            }
            parcel1.writeInt(j2);
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            g();
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            h();
            parcel1.writeNoException();
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            boolean flag5 = i();
            parcel1.writeNoException();
            int i2 = 0;
            if (flag5)
            {
                i2 = 1;
            }
            parcel1.writeInt(i2);
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            int l1 = parcel.readInt();
            boolean flag4 = false;
            if (l1 != 0)
            {
                flag4 = true;
            }
            b(flag4);
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            boolean flag3 = j();
            parcel1.writeNoException();
            int k1 = 0;
            if (flag3)
            {
                k1 = 1;
            }
            parcel1.writeInt(k1);
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            boolean flag2 = a(a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            int j1 = 0;
            if (flag2)
            {
                j1 = 1;
            }
            parcel1.writeInt(j1);
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            int i1 = k();
            parcel1.writeNoException();
            parcel1.writeInt(i1);
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            a(f.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 19: // '\023'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            a(parcel.readFloat(), parcel.readFloat());
            parcel1.writeNoException();
            return true;

        case 20: // '\024'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            int l = parcel.readInt();
            boolean flag1 = false;
            if (l != 0)
            {
                flag1 = true;
            }
            c(flag1);
            parcel1.writeNoException();
            return true;

        case 21: // '\025'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            boolean flag = l();
            parcel1.writeNoException();
            int k = 0;
            if (flag)
            {
                k = 1;
            }
            parcel1.writeInt(k);
            return true;

        case 22: // '\026'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            a(parcel.readFloat());
            parcel1.writeNoException();
            return true;

        case 23: // '\027'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            float f1 = m();
            parcel1.writeNoException();
            parcel1.writeFloat(f1);
            return true;

        case 24: // '\030'
            parcel.enforceInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
            b(parcel.readFloat(), parcel.readFloat());
            parcel1.writeNoException();
            return true;
        }
    }
}
