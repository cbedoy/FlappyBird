// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.internal:
//            ba, bc, ar, ak, 
//            i, bv, bg, x, 
//            co, bw

public abstract class bb extends Binder
    implements ba
{

    public static ba a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusService");
        if (iinterface != null && (iinterface instanceof ba))
        {
            return (ba)iinterface;
        } else
        {
            return new bc(ibinder);
        }
    }

    public boolean onTransact(int j, Parcel parcel, Parcel parcel1, int k)
    {
        switch (j)
        {
        default:
            return super.onTransact(j, parcel, parcel1, k);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.plus.internal.IPlusService");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            a(ar.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            a(ar.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            b(ar.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            ak ak1;
            if (parcel.readInt() != 0)
            {
                ak1 = ak.CREATOR.a(parcel);
            } else
            {
                ak1 = null;
            }
            a(ak1);
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            String s9 = a();
            parcel1.writeNoException();
            parcel1.writeString(s9);
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            b();
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            c(ar.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            a(ar.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            aq aq10 = ar.a(parcel.readStrongBinder());
            Uri uri2;
            Bundle bundle1;
            if (parcel.readInt() != 0)
            {
                uri2 = (Uri)Uri.CREATOR.createFromParcel(parcel);
            } else
            {
                uri2 = null;
            }
            if (parcel.readInt() != 0)
            {
                bundle1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                bundle1 = null;
            }
            a(aq10, uri2, bundle1);
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            d(ar.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            a(parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            a(ar.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            b(ar.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            aq aq9 = ar.a(parcel.readStrongBinder());
            int l2 = parcel.readInt();
            String s8 = parcel.readString();
            int i3 = parcel.readInt();
            Uri uri1 = null;
            if (i3 != 0)
            {
                uri1 = (Uri)Uri.CREATOR.createFromParcel(parcel);
            }
            a(aq9, l2, s8, uri1, parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            a(ar.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            a(parcel.readString());
            parcel1.writeNoException();
            return true;

        case 18: // '\022'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            e(ar.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 19: // '\023'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            c(ar.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 20: // '\024'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            a(ar.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 21: // '\025'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            aq aq8 = ar.a(parcel.readStrongBinder());
            String s7 = parcel.readString();
            int k2 = parcel.readInt();
            boolean flag5 = false;
            if (k2 != 0)
            {
                flag5 = true;
            }
            a(aq8, s7, flag5);
            parcel1.writeNoException();
            return true;

        case 22: // '\026'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            aq aq7 = ar.a(parcel.readStrongBinder());
            boolean flag3;
            int j2;
            boolean flag4;
            if (parcel.readInt() != 0)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            j2 = parcel.readInt();
            flag4 = false;
            if (j2 != 0)
            {
                flag4 = true;
            }
            a(aq7, flag3, flag4);
            parcel1.writeNoException();
            return true;

        case 23: // '\027'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            a(ar.a(parcel.readStrongBinder()), parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList());
            parcel1.writeNoException();
            return true;

        case 24: // '\030'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            f(ar.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 25: // '\031'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            aq aq6 = ar.a(parcel.readStrongBinder());
            String s6 = parcel.readString();
            int i2 = parcel.readInt();
            bv bv1 = null;
            if (i2 != 0)
            {
                bv1 = bv.CREATOR.a(parcel);
            }
            a(aq6, s6, bv1);
            parcel1.writeNoException();
            return true;

        case 26: // '\032'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            g(ar.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 27: // '\033'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            aq aq5 = ar.a(parcel.readStrongBinder());
            String s5 = parcel.readString();
            int l1 = parcel.readInt();
            boolean flag2 = false;
            if (l1 != 0)
            {
                flag2 = true;
            }
            a(aq5, s5, flag2, parcel.readString());
            parcel1.writeNoException();
            return true;

        case 28: // '\034'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            a(ar.a(parcel.readStrongBinder()), parcel.readString(), parcel.createTypedArrayList(x.CREATOR));
            parcel1.writeNoException();
            return true;

        case 29: // '\035'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            aq aq4 = ar.a(parcel.readStrongBinder());
            String s4 = parcel.readString();
            java.util.ArrayList arraylist1 = parcel.createTypedArrayList(x.CREATOR);
            int k1 = parcel.readInt();
            boolean flag1 = false;
            if (k1 != 0)
            {
                flag1 = true;
            }
            a(aq4, s4, arraylist1, flag1);
            parcel1.writeNoException();
            return true;

        case 30: // '\036'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            aq aq3 = ar.a(parcel.readStrongBinder());
            int j1 = parcel.readInt();
            co co1 = null;
            if (j1 != 0)
            {
                co1 = co.CREATOR.a(parcel);
            }
            a(aq3, co1);
            parcel1.writeNoException();
            return true;

        case 31: // '\037'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            aq aq2 = ar.a(parcel.readStrongBinder());
            String s3 = parcel.readString();
            java.util.ArrayList arraylist = parcel.createTypedArrayList(x.CREATOR);
            Bundle bundle;
            if (parcel.readInt() != 0)
            {
                bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                bundle = null;
            }
            a(aq2, s3, arraylist, bundle);
            parcel1.writeNoException();
            return true;

        case 32: // ' '
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            aq aq1 = ar.a(parcel.readStrongBinder());
            int l = parcel.readInt();
            String s2 = parcel.readString();
            int i1 = parcel.readInt();
            Uri uri = null;
            if (i1 != 0)
            {
                uri = (Uri)Uri.CREATOR.createFromParcel(parcel);
            }
            a(aq1, l, s2, uri, parcel.readString());
            parcel1.writeNoException();
            return true;

        case 33: // '!'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            h(ar.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 34: // '"'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            a(ar.a(parcel.readStrongBinder()), parcel.createStringArrayList());
            parcel1.writeNoException();
            return true;

        case 35: // '#'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            i(ar.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 36: // '$'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            a(ar.a(parcel.readStrongBinder()), parcel.readString(), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 37: // '%'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            aq aq = ar.a(parcel.readStrongBinder());
            String s = parcel.readString();
            String s1 = parcel.readString();
            boolean flag;
            if (parcel.readInt() != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(aq, s, s1, flag, parcel.readString());
            parcel1.writeNoException();
            return true;

        case 38: // '&'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            d(ar.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 39: // '\''
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusService");
            a(ar.a(parcel.readStrongBinder()), parcel.readInt(), parcel.readInt(), parcel.readString());
            parcel1.writeNoException();
            return true;
        }
    }
}
