// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.f;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.a.a;
import com.google.android.gms.maps.model.a.g;
import com.google.android.gms.maps.model.a.m;
import com.google.android.gms.maps.model.a.p;
import com.google.android.gms.maps.model.a.s;
import com.google.android.gms.maps.model.d;
import com.google.android.gms.maps.model.h;
import com.google.android.gms.maps.model.i;
import com.google.android.gms.maps.model.j;
import com.google.android.gms.maps.model.n;

// Referenced classes of package com.google.android.gms.maps.a:
//            d, f, x, h, 
//            s, p, ag, ap, 
//            as, av, ay, aj, 
//            ad, be, bb, bh

public abstract class e extends Binder
    implements com.google.android.gms.maps.a.d
{

    public static com.google.android.gms.maps.a.d a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (iinterface != null && (iinterface instanceof com.google.android.gms.maps.a.d))
        {
            return (com.google.android.gms.maps.a.d)iinterface;
        } else
        {
            return new com.google.android.gms.maps.a.f(ibinder);
        }
    }

    public boolean onTransact(int k, Parcel parcel, Parcel parcel1, int l)
    {
        switch (k)
        {
        default:
            return super.onTransact(k, parcel, parcel1, l);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            CameraPosition cameraposition = a();
            parcel1.writeNoException();
            if (cameraposition != null)
            {
                parcel1.writeInt(1);
                cameraposition.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            float f2 = b();
            parcel1.writeNoException();
            parcel1.writeFloat(f2);
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            float f1 = c();
            parcel1.writeNoException();
            parcel1.writeFloat(f1);
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(f.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            b(f.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(f.a(parcel.readStrongBinder()), com.google.android.gms.maps.a.x.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(f.a(parcel.readStrongBinder()), parcel.readInt(), com.google.android.gms.maps.a.x.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            d();
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            PolylineOptions polylineoptions;
            a a1;
            IBinder ibinder8;
            if (parcel.readInt() != 0)
            {
                polylineoptions = PolylineOptions.CREATOR.a(parcel);
            } else
            {
                polylineoptions = null;
            }
            a1 = a(polylineoptions);
            parcel1.writeNoException();
            ibinder8 = null;
            if (a1 != null)
            {
                ibinder8 = a1.asBinder();
            }
            parcel1.writeStrongBinder(ibinder8);
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            PolygonOptions polygonoptions;
            p p2;
            IBinder ibinder7;
            if (parcel.readInt() != 0)
            {
                polygonoptions = PolygonOptions.CREATOR.a(parcel);
            } else
            {
                polygonoptions = null;
            }
            p2 = a(polygonoptions);
            parcel1.writeNoException();
            ibinder7 = null;
            if (p2 != null)
            {
                ibinder7 = p2.asBinder();
            }
            parcel1.writeStrongBinder(ibinder7);
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            MarkerOptions markeroptions;
            m m1;
            IBinder ibinder6;
            if (parcel.readInt() != 0)
            {
                markeroptions = MarkerOptions.CREATOR.a(parcel);
            } else
            {
                markeroptions = null;
            }
            m1 = a(markeroptions);
            parcel1.writeNoException();
            ibinder6 = null;
            if (m1 != null)
            {
                ibinder6 = m1.asBinder();
            }
            parcel1.writeStrongBinder(ibinder6);
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            GroundOverlayOptions groundoverlayoptions;
            com.google.android.gms.maps.model.a.j j3;
            IBinder ibinder5;
            if (parcel.readInt() != 0)
            {
                groundoverlayoptions = GroundOverlayOptions.CREATOR.a(parcel);
            } else
            {
                groundoverlayoptions = null;
            }
            j3 = a(groundoverlayoptions);
            parcel1.writeNoException();
            ibinder5 = null;
            if (j3 != null)
            {
                ibinder5 = j3.asBinder();
            }
            parcel1.writeStrongBinder(ibinder5);
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            TileOverlayOptions tileoverlayoptions;
            s s2;
            IBinder ibinder4;
            if (parcel.readInt() != 0)
            {
                tileoverlayoptions = TileOverlayOptions.CREATOR.a(parcel);
            } else
            {
                tileoverlayoptions = null;
            }
            s2 = a(tileoverlayoptions);
            parcel1.writeNoException();
            ibinder4 = null;
            if (s2 != null)
            {
                ibinder4 = s2.asBinder();
            }
            parcel1.writeStrongBinder(ibinder4);
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            e();
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            int k2 = f();
            parcel1.writeNoException();
            parcel1.writeInt(k2);
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            boolean flag6 = g();
            parcel1.writeNoException();
            int j2 = 0;
            if (flag6)
            {
                j2 = 1;
            }
            parcel1.writeInt(j2);
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            int i2 = parcel.readInt();
            boolean flag5 = false;
            if (i2 != 0)
            {
                flag5 = true;
            }
            a(flag5);
            parcel1.writeNoException();
            return true;

        case 19: // '\023'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            boolean flag4 = h();
            parcel1.writeNoException();
            int l1 = 0;
            if (flag4)
            {
                l1 = 1;
            }
            parcel1.writeInt(l1);
            return true;

        case 20: // '\024'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            boolean flag2;
            boolean flag3;
            int k1;
            if (parcel.readInt() != 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            flag3 = b(flag2);
            parcel1.writeNoException();
            k1 = 0;
            if (flag3)
            {
                k1 = 1;
            }
            parcel1.writeInt(k1);
            return true;

        case 21: // '\025'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            boolean flag1 = i();
            parcel1.writeNoException();
            int j1 = 0;
            if (flag1)
            {
                j1 = 1;
            }
            parcel1.writeInt(j1);
            return true;

        case 22: // '\026'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            int i1 = parcel.readInt();
            boolean flag = false;
            if (i1 != 0)
            {
                flag = true;
            }
            c(flag);
            parcel1.writeNoException();
            return true;

        case 23: // '\027'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            Location location = j();
            parcel1.writeNoException();
            if (location != null)
            {
                parcel1.writeInt(1);
                location.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }

        case 24: // '\030'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(com.google.android.gms.maps.a.h.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 25: // '\031'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            com.google.android.gms.maps.a.s s1 = k();
            parcel1.writeNoException();
            IBinder ibinder3 = null;
            if (s1 != null)
            {
                ibinder3 = s1.asBinder();
            }
            parcel1.writeStrongBinder(ibinder3);
            return true;

        case 26: // '\032'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            com.google.android.gms.maps.a.p p1 = l();
            parcel1.writeNoException();
            IBinder ibinder2 = null;
            if (p1 != null)
            {
                ibinder2 = p1.asBinder();
            }
            parcel1.writeStrongBinder(ibinder2);
            return true;

        case 27: // '\033'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(com.google.android.gms.maps.a.ag.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 28: // '\034'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(com.google.android.gms.maps.a.ap.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 29: // '\035'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(com.google.android.gms.maps.a.as.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 30: // '\036'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(com.google.android.gms.maps.a.av.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 31: // '\037'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(com.google.android.gms.maps.a.ay.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 32: // ' '
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(com.google.android.gms.maps.a.aj.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 33: // '!'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(com.google.android.gms.maps.a.ad.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 34: // '"'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            com.google.android.gms.b.e e1 = m();
            parcel1.writeNoException();
            IBinder ibinder1 = null;
            if (e1 != null)
            {
                ibinder1 = e1.asBinder();
            }
            parcel1.writeStrongBinder(ibinder1);
            return true;

        case 35: // '#'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            CircleOptions circleoptions;
            g g1;
            IBinder ibinder;
            if (parcel.readInt() != 0)
            {
                circleoptions = CircleOptions.CREATOR.a(parcel);
            } else
            {
                circleoptions = null;
            }
            g1 = a(circleoptions);
            parcel1.writeNoException();
            ibinder = null;
            if (g1 != null)
            {
                ibinder = g1.asBinder();
            }
            parcel1.writeStrongBinder(ibinder);
            return true;

        case 36: // '$'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(com.google.android.gms.maps.a.be.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 37: // '%'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(com.google.android.gms.maps.a.bb.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 38: // '&'
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(com.google.android.gms.maps.a.bh.a(parcel.readStrongBinder()), f.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 39: // '\''
            parcel.enforceInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            a(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;
        }
    }
}
