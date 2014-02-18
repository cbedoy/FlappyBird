// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.data.d;
import com.google.android.gms.common.data.f;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;

// Referenced classes of package com.google.android.gms.internal:
//            y, ac

public abstract class aa extends Binder
    implements y
{

    public aa()
    {
        attachInterface(this, "com.google.android.gms.games.internal.IGamesCallbacks");
    }

    public static y a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesCallbacks");
        if (iinterface != null && (iinterface instanceof y))
        {
            return (y)iinterface;
        } else
        {
            return new ac(ibinder);
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
            parcel1.writeString("com.google.android.gms.games.internal.IGamesCallbacks");
            return true;

        case 5001: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            a(parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 5002: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            int i8 = parcel.readInt();
            d d30 = null;
            if (i8 != 0)
            {
                d30 = d.CREATOR.a(parcel);
            }
            a(d30);
            parcel1.writeNoException();
            return true;

        case 5003: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            b(parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 5004: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            int l7 = parcel.readInt();
            d d29 = null;
            if (l7 != 0)
            {
                d29 = d.CREATOR.a(parcel);
            }
            b(d29);
            parcel1.writeNoException();
            return true;

        case 5005: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            d d27;
            int k7;
            d d28;
            if (parcel.readInt() != 0)
            {
                d27 = d.CREATOR.a(parcel);
            } else
            {
                d27 = null;
            }
            k7 = parcel.readInt();
            d28 = null;
            if (k7 != 0)
            {
                d28 = d.CREATOR.a(parcel);
            }
            a(d27, d28);
            parcel1.writeNoException();
            return true;

        case 5006: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            int j7 = parcel.readInt();
            d d26 = null;
            if (j7 != 0)
            {
                d26 = d.CREATOR.a(parcel);
            }
            c(d26);
            parcel1.writeNoException();
            return true;

        case 5007: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            int i7 = parcel.readInt();
            d d25 = null;
            if (i7 != 0)
            {
                d25 = d.CREATOR.a(parcel);
            }
            d(d25);
            parcel1.writeNoException();
            return true;

        case 5008: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            int l6 = parcel.readInt();
            d d24 = null;
            if (l6 != 0)
            {
                d24 = d.CREATOR.a(parcel);
            }
            e(d24);
            parcel1.writeNoException();
            return true;

        case 5009: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            int k6 = parcel.readInt();
            d d23 = null;
            if (k6 != 0)
            {
                d23 = d.CREATOR.a(parcel);
            }
            f(d23);
            parcel1.writeNoException();
            return true;

        case 5010: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            int j6 = parcel.readInt();
            d d22 = null;
            if (j6 != 0)
            {
                d22 = d.CREATOR.a(parcel);
            }
            g(d22);
            parcel1.writeNoException();
            return true;

        case 5011: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            int i6 = parcel.readInt();
            d d21 = null;
            if (i6 != 0)
            {
                d21 = d.CREATOR.a(parcel);
            }
            h(d21);
            parcel1.writeNoException();
            return true;

        case 5012: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            int l5 = parcel.readInt();
            d d20 = null;
            if (l5 != 0)
            {
                d20 = d.CREATOR.a(parcel);
            }
            k(d20);
            parcel1.writeNoException();
            return true;

        case 5013: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            a(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 5014: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            int k5 = parcel.readInt();
            d d19 = null;
            if (k5 != 0)
            {
                d19 = d.CREATOR.a(parcel);
            }
            l(d19);
            parcel1.writeNoException();
            return true;

        case 5015: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            b(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 5016: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            a();
            parcel1.writeNoException();
            return true;

        case 5017: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            int j5 = parcel.readInt();
            d d18 = null;
            if (j5 != 0)
            {
                d18 = d.CREATOR.a(parcel);
            }
            i(d18);
            parcel1.writeNoException();
            return true;

        case 5037: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            int i5 = parcel.readInt();
            d d17 = null;
            if (i5 != 0)
            {
                d17 = d.CREATOR.a(parcel);
            }
            j(d17);
            parcel1.writeNoException();
            return true;

        case 5018: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            int l4 = parcel.readInt();
            d d16 = null;
            if (l4 != 0)
            {
                d16 = d.CREATOR.a(parcel);
            }
            m(d16);
            parcel1.writeNoException();
            return true;

        case 5019: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            int k4 = parcel.readInt();
            d d15 = null;
            if (k4 != 0)
            {
                d15 = d.CREATOR.a(parcel);
            }
            n(d15);
            parcel1.writeNoException();
            return true;

        case 5020: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            c(parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 5021: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            int j4 = parcel.readInt();
            d d14 = null;
            if (j4 != 0)
            {
                d14 = d.CREATOR.a(parcel);
            }
            o(d14);
            parcel1.writeNoException();
            return true;

        case 5022: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            int i4 = parcel.readInt();
            d d13 = null;
            if (i4 != 0)
            {
                d13 = d.CREATOR.a(parcel);
            }
            p(d13);
            parcel1.writeNoException();
            return true;

        case 5023: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            int l3 = parcel.readInt();
            d d12 = null;
            if (l3 != 0)
            {
                d12 = d.CREATOR.a(parcel);
            }
            q(d12);
            parcel1.writeNoException();
            return true;

        case 5024: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            int k3 = parcel.readInt();
            d d11 = null;
            if (k3 != 0)
            {
                d11 = d.CREATOR.a(parcel);
            }
            r(d11);
            parcel1.writeNoException();
            return true;

        case 5025: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            int j3 = parcel.readInt();
            d d10 = null;
            if (j3 != 0)
            {
                d10 = d.CREATOR.a(parcel);
            }
            s(d10);
            parcel1.writeNoException();
            return true;

        case 5026: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            int i3 = parcel.readInt();
            d d9 = null;
            if (i3 != 0)
            {
                d9 = d.CREATOR.a(parcel);
            }
            a(d9, parcel.createStringArray());
            parcel1.writeNoException();
            return true;

        case 5027: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            int l2 = parcel.readInt();
            d d8 = null;
            if (l2 != 0)
            {
                d8 = d.CREATOR.a(parcel);
            }
            b(d8, parcel.createStringArray());
            parcel1.writeNoException();
            return true;

        case 5028: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            int k2 = parcel.readInt();
            d d7 = null;
            if (k2 != 0)
            {
                d7 = d.CREATOR.a(parcel);
            }
            c(d7, parcel.createStringArray());
            parcel1.writeNoException();
            return true;

        case 5029: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            int j2 = parcel.readInt();
            d d6 = null;
            if (j2 != 0)
            {
                d6 = d.CREATOR.a(parcel);
            }
            d(d6, parcel.createStringArray());
            parcel1.writeNoException();
            return true;

        case 5030: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            int i2 = parcel.readInt();
            d d5 = null;
            if (i2 != 0)
            {
                d5 = d.CREATOR.a(parcel);
            }
            e(d5, parcel.createStringArray());
            parcel1.writeNoException();
            return true;

        case 5031: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            int l1 = parcel.readInt();
            d d4 = null;
            if (l1 != 0)
            {
                d4 = d.CREATOR.a(parcel);
            }
            f(d4, parcel.createStringArray());
            parcel1.writeNoException();
            return true;

        case 5032: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            int k1 = parcel.readInt();
            RealTimeMessage realtimemessage = null;
            if (k1 != 0)
            {
                realtimemessage = (RealTimeMessage)RealTimeMessage.CREATOR.createFromParcel(parcel);
            }
            a(realtimemessage);
            parcel1.writeNoException();
            return true;

        case 5033: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            a(parcel.readInt(), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 5034: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            int j1 = parcel.readInt();
            String s = parcel.readString();
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(j1, s, flag);
            parcel1.writeNoException();
            return true;

        case 5038: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            int i1 = parcel.readInt();
            d d3 = null;
            if (i1 != 0)
            {
                d3 = d.CREATOR.a(parcel);
            }
            t(d3);
            parcel1.writeNoException();
            return true;

        case 5035: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            int l = parcel.readInt();
            d d2 = null;
            if (l != 0)
            {
                d2 = d.CREATOR.a(parcel);
            }
            u(d2);
            parcel1.writeNoException();
            return true;

        case 5036: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            c(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 5039: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            int k = parcel.readInt();
            d d1 = null;
            if (k != 0)
            {
                d1 = d.CREATOR.a(parcel);
            }
            v(d1);
            parcel1.writeNoException();
            return true;

        case 5040: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            d(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 6001: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            a(parcel.readString());
            parcel1.writeNoException();
            return true;

        case 6002: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesCallbacks");
            b(parcel.readString());
            parcel1.writeNoException();
            return true;
        }
    }
}
