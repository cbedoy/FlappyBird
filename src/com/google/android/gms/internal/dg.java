// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal:
//            df, dh, dd

public abstract class dg extends Binder
    implements df
{

    public static df a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
        if (iinterface != null && (iinterface instanceof df))
        {
            return (df)iinterface;
        } else
        {
            return new dh(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        dc dc;
        int k;
        String s;
        int l;
        Bundle bundle;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.common.internal.IGmsServiceBroker");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            dc dc9 = dd.a(parcel.readStrongBinder());
            int l4 = parcel.readInt();
            String s12 = parcel.readString();
            String s13 = parcel.readString();
            String as1[] = parcel.createStringArray();
            String s14 = parcel.readString();
            Bundle bundle9;
            if (parcel.readInt() != 0)
            {
                bundle9 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                bundle9 = null;
            }
            a(dc9, l4, s12, s13, as1, s14, bundle9);
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            dc dc8 = dd.a(parcel.readStrongBinder());
            int j4 = parcel.readInt();
            String s11 = parcel.readString();
            int k4 = parcel.readInt();
            Bundle bundle8 = null;
            if (k4 != 0)
            {
                bundle8 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            a(dc8, j4, s11, bundle8);
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            a(dd.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            a(dd.a(parcel.readStrongBinder()), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            dc dc7 = dd.a(parcel.readStrongBinder());
            int l3 = parcel.readInt();
            String s10 = parcel.readString();
            int i4 = parcel.readInt();
            Bundle bundle7 = null;
            if (i4 != 0)
            {
                bundle7 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            b(dc7, l3, s10, bundle7);
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            dc dc6 = dd.a(parcel.readStrongBinder());
            int j3 = parcel.readInt();
            String s9 = parcel.readString();
            int k3 = parcel.readInt();
            Bundle bundle6 = null;
            if (k3 != 0)
            {
                bundle6 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            c(dc6, j3, s9, bundle6);
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            dc dc5 = dd.a(parcel.readStrongBinder());
            int l2 = parcel.readInt();
            String s8 = parcel.readString();
            int i3 = parcel.readInt();
            Bundle bundle5 = null;
            if (i3 != 0)
            {
                bundle5 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            d(dc5, l2, s8, bundle5);
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            dc dc4 = dd.a(parcel.readStrongBinder());
            int j2 = parcel.readInt();
            String s7 = parcel.readString();
            int k2 = parcel.readInt();
            Bundle bundle4 = null;
            if (k2 != 0)
            {
                bundle4 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            e(dc4, j2, s7, bundle4);
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            dc dc3 = dd.a(parcel.readStrongBinder());
            int i2 = parcel.readInt();
            String s3 = parcel.readString();
            String s4 = parcel.readString();
            String as[] = parcel.createStringArray();
            String s5 = parcel.readString();
            IBinder ibinder = parcel.readStrongBinder();
            String s6 = parcel.readString();
            Bundle bundle3;
            if (parcel.readInt() != 0)
            {
                bundle3 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                bundle3 = null;
            }
            a(dc3, i2, s3, s4, as, s5, ibinder, s6, bundle3);
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            a(dd.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.createStringArray());
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            dc dc2 = dd.a(parcel.readStrongBinder());
            int k1 = parcel.readInt();
            String s2 = parcel.readString();
            int l1 = parcel.readInt();
            Bundle bundle2 = null;
            if (l1 != 0)
            {
                bundle2 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            f(dc2, k1, s2, bundle2);
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            dc dc1 = dd.a(parcel.readStrongBinder());
            int i1 = parcel.readInt();
            String s1 = parcel.readString();
            int j1 = parcel.readInt();
            Bundle bundle1 = null;
            if (j1 != 0)
            {
                bundle1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            g(dc1, i1, s1, bundle1);
            parcel1.writeNoException();
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            dc = dd.a(parcel.readStrongBinder());
            k = parcel.readInt();
            s = parcel.readString();
            l = parcel.readInt();
            bundle = null;
            break;
        }
        if (l != 0)
        {
            bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
        }
        h(dc, k, s, bundle);
        parcel1.writeNoException();
        return true;
    }
}
