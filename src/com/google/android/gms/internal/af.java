// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.d;

// Referenced classes of package com.google.android.gms.internal:
//            ad, ag, aa

public abstract class af extends Binder
    implements ad
{

    public static ad a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesService");
        if (iinterface != null && (iinterface instanceof ad))
        {
            return (ad)iinterface;
        } else
        {
            return new ag(ibinder);
        }
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
    {
        int k;
        Uri uri;
        switch (i)
        {
        default:
            return super.onTransact(i, parcel, parcel1, j);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.games.internal.IGamesService");
            return true;

        case 5001: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            a(parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 5002: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            a(aa.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 5003: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            String s26 = a();
            parcel1.writeNoException();
            parcel1.writeString(s26);
            return true;

        case 5004: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            Bundle bundle6 = b();
            parcel1.writeNoException();
            if (bundle6 != null)
            {
                parcel1.writeInt(1);
                bundle6.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }

        case 5005: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            IBinder ibinder5 = parcel.readStrongBinder();
            int j13 = parcel.readInt();
            Bundle bundle5 = null;
            if (j13 != 0)
            {
                bundle5 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            a(ibinder5, bundle5);
            parcel1.writeNoException();
            return true;

        case 5006: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            c();
            parcel1.writeNoException();
            return true;

        case 5007: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            String s25 = d();
            parcel1.writeNoException();
            parcel1.writeString(s25);
            return true;

        case 5064: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            String s24 = a(parcel.readString());
            parcel1.writeNoException();
            parcel1.writeString(s24);
            return true;

        case 5065: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            a(parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 5008: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            a(aa.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 5009: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            a(aa.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 5010: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            b(aa.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 5011: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            y y28 = aa.a(parcel.readStrongBinder());
            String s23 = parcel.readString();
            boolean flag37;
            if (parcel.readInt() != 0)
            {
                flag37 = true;
            } else
            {
                flag37 = false;
            }
            a(y28, s23, flag37, parcel.createLongArray());
            parcel1.writeNoException();
            return true;

        case 5012: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            String s22 = e();
            parcel1.writeNoException();
            parcel1.writeString(s22);
            return true;

        case 5013: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            d d2 = f();
            parcel1.writeNoException();
            if (d2 != null)
            {
                parcel1.writeInt(1);
                d2.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }

        case 5014: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            c(aa.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 5015: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            y y27 = aa.a(parcel.readStrongBinder());
            int l12 = parcel.readInt();
            boolean flag35;
            int i13;
            boolean flag36;
            if (parcel.readInt() != 0)
            {
                flag35 = true;
            } else
            {
                flag35 = false;
            }
            i13 = parcel.readInt();
            flag36 = false;
            if (i13 != 0)
            {
                flag36 = true;
            }
            a(y27, l12, flag35, flag36);
            parcel1.writeNoException();
            return true;

        case 5016: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            a(aa.a(parcel.readStrongBinder()), parcel.readString(), parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 5017: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            b(aa.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 5018: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            d(aa.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 5019: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            y y26 = aa.a(parcel.readStrongBinder());
            String s21 = parcel.readString();
            int i12 = parcel.readInt();
            int j12 = parcel.readInt();
            int k12 = parcel.readInt();
            boolean flag34;
            if (parcel.readInt() != 0)
            {
                flag34 = true;
            } else
            {
                flag34 = false;
            }
            a(y26, s21, i12, j12, k12, flag34);
            parcel1.writeNoException();
            return true;

        case 5020: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            y y25 = aa.a(parcel.readStrongBinder());
            String s20 = parcel.readString();
            int j11 = parcel.readInt();
            int k11 = parcel.readInt();
            int l11 = parcel.readInt();
            boolean flag33;
            if (parcel.readInt() != 0)
            {
                flag33 = true;
            } else
            {
                flag33 = false;
            }
            b(y25, s20, j11, k11, l11, flag33);
            parcel1.writeNoException();
            return true;

        case 5021: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            y y24 = aa.a(parcel.readStrongBinder());
            int i11 = parcel.readInt();
            Bundle bundle4 = null;
            if (i11 != 0)
            {
                bundle4 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            a(y24, bundle4, parcel.readInt(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 5022: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            c(aa.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 5023: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            y y23 = aa.a(parcel.readStrongBinder());
            String s19 = parcel.readString();
            IBinder ibinder4 = parcel.readStrongBinder();
            int l10 = parcel.readInt();
            Bundle bundle3 = null;
            if (l10 != 0)
            {
                bundle3 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            a(y23, s19, ibinder4, bundle3);
            parcel1.writeNoException();
            return true;

        case 5024: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            y y22 = aa.a(parcel.readStrongBinder());
            String s18 = parcel.readString();
            IBinder ibinder3 = parcel.readStrongBinder();
            int k10 = parcel.readInt();
            Bundle bundle2 = null;
            if (k10 != 0)
            {
                bundle2 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            b(y22, s18, ibinder3, bundle2);
            parcel1.writeNoException();
            return true;

        case 5025: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            y y21 = aa.a(parcel.readStrongBinder());
            String s17 = parcel.readString();
            int j10 = parcel.readInt();
            IBinder ibinder2 = parcel.readStrongBinder();
            Bundle bundle1;
            if (parcel.readInt() != 0)
            {
                bundle1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                bundle1 = null;
            }
            a(y21, s17, j10, ibinder2, bundle1);
            parcel1.writeNoException();
            return true;

        case 5026: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            d(aa.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 5027: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            e(aa.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 5028: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            a(parcel.readString(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 5029: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            b(parcel.readString(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 5058: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            a(aa.a(parcel.readStrongBinder()), parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 5059: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            b(parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 5030: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            y y20 = aa.a(parcel.readStrongBinder());
            IBinder ibinder1 = parcel.readStrongBinder();
            int i10 = parcel.readInt();
            String as[] = parcel.createStringArray();
            Bundle bundle;
            boolean flag32;
            if (parcel.readInt() != 0)
            {
                bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                bundle = null;
            }
            if (parcel.readInt() != 0)
            {
                flag32 = true;
            } else
            {
                flag32 = false;
            }
            a(y20, ibinder1, i10, as, bundle, flag32, parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 5031: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            y y19 = aa.a(parcel.readStrongBinder());
            IBinder ibinder = parcel.readStrongBinder();
            String s16 = parcel.readString();
            boolean flag31;
            if (parcel.readInt() != 0)
            {
                flag31 = true;
            } else
            {
                flag31 = false;
            }
            a(y19, ibinder, s16, flag31, parcel.readLong());
            parcel1.writeNoException();
            return true;

        case 5032: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            e(aa.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 5033: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            int l9 = a(aa.a(parcel.readStrongBinder()), parcel.createByteArray(), parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            parcel1.writeInt(l9);
            return true;

        case 5034: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            int k9 = a(parcel.createByteArray(), parcel.readString(), parcel.createStringArray());
            parcel1.writeNoException();
            parcel1.writeInt(k9);
            return true;

        case 5035: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            String s15 = b(parcel.readString());
            parcel1.writeNoException();
            parcel1.writeString(s15);
            return true;

        case 5036: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            a(parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 5037: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            f(aa.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 5038: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            b(aa.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 5039: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            y y18 = aa.a(parcel.readStrongBinder());
            String s13 = parcel.readString();
            String s14 = parcel.readString();
            int k8 = parcel.readInt();
            int l8 = parcel.readInt();
            int i9 = parcel.readInt();
            int j9 = parcel.readInt();
            boolean flag30 = false;
            if (j9 != 0)
            {
                flag30 = true;
            }
            a(y18, s13, s14, k8, l8, i9, flag30);
            parcel1.writeNoException();
            return true;

        case 5040: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            y y17 = aa.a(parcel.readStrongBinder());
            String s11 = parcel.readString();
            String s12 = parcel.readString();
            int k7 = parcel.readInt();
            int l7 = parcel.readInt();
            int i8 = parcel.readInt();
            int j8 = parcel.readInt();
            boolean flag29 = false;
            if (j8 != 0)
            {
                flag29 = true;
            }
            b(y17, s11, s12, k7, l7, i8, flag29);
            parcel1.writeNoException();
            return true;

        case 5041: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            c(aa.a(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 5042: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            g(aa.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 5043: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            h(aa.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 5044: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            y y16 = aa.a(parcel.readStrongBinder());
            int i7 = parcel.readInt();
            int j7 = parcel.readInt();
            boolean flag27;
            boolean flag28;
            if (parcel.readInt() != 0)
            {
                flag27 = true;
            } else
            {
                flag27 = false;
            }
            if (parcel.readInt() != 0)
            {
                flag28 = true;
            } else
            {
                flag28 = false;
            }
            a(y16, i7, j7, flag27, flag28);
            parcel1.writeNoException();
            return true;

        case 5045: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            y y15 = aa.a(parcel.readStrongBinder());
            String s10 = parcel.readString();
            int l6 = parcel.readInt();
            boolean flag25;
            boolean flag26;
            if (parcel.readInt() != 0)
            {
                flag25 = true;
            } else
            {
                flag25 = false;
            }
            if (parcel.readInt() != 0)
            {
                flag26 = true;
            } else
            {
                flag26 = false;
            }
            a(y15, s10, l6, flag25, flag26);
            parcel1.writeNoException();
            return true;

        case 5046: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            y y14 = aa.a(parcel.readStrongBinder());
            int j6 = parcel.readInt();
            boolean flag23;
            int k6;
            boolean flag24;
            if (parcel.readInt() != 0)
            {
                flag23 = true;
            } else
            {
                flag23 = false;
            }
            k6 = parcel.readInt();
            flag24 = false;
            if (k6 != 0)
            {
                flag24 = true;
            }
            b(y14, j6, flag23, flag24);
            parcel1.writeNoException();
            return true;

        case 5047: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            f(aa.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 5048: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            y y13 = aa.a(parcel.readStrongBinder());
            int l5 = parcel.readInt();
            boolean flag21;
            int i6;
            boolean flag22;
            if (parcel.readInt() != 0)
            {
                flag21 = true;
            } else
            {
                flag21 = false;
            }
            i6 = parcel.readInt();
            flag22 = false;
            if (i6 != 0)
            {
                flag22 = true;
            }
            c(y13, l5, flag21, flag22);
            parcel1.writeNoException();
            return true;

        case 5049: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            g(aa.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 5050: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            c(parcel.readString());
            parcel1.writeNoException();
            return true;

        case 5051: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            a(parcel.readString(), parcel.readString(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 5052: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            i(aa.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 5053: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            int k5 = j(aa.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            parcel1.writeInt(k5);
            return true;

        case 5060: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            int j5 = d(parcel.readString());
            parcel1.writeNoException();
            parcel1.writeInt(j5);
            return true;

        case 5054: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            y y12 = aa.a(parcel.readStrongBinder());
            String s9 = parcel.readString();
            int i5 = parcel.readInt();
            boolean flag20 = false;
            if (i5 != 0)
            {
                flag20 = true;
            }
            a(y12, s9, flag20);
            parcel1.writeNoException();
            return true;

        case 5061: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            k(aa.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 5055: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            c(parcel.readString(), parcel.readInt());
            parcel1.writeNoException();
            return true;

        case 5067: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            boolean flag19 = g();
            parcel1.writeNoException();
            int l4 = 0;
            if (flag19)
            {
                l4 = 1;
            }
            parcel1.writeInt(l4);
            return true;

        case 5068: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            int k4 = parcel.readInt();
            boolean flag18 = false;
            if (k4 != 0)
            {
                flag18 = true;
            }
            a(flag18);
            parcel1.writeNoException();
            return true;

        case 5056: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            h(aa.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 5057: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            l(aa.a(parcel.readStrongBinder()), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 5062: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            i(aa.a(parcel.readStrongBinder()));
            parcel1.writeNoException();
            return true;

        case 5063: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            y y11 = aa.a(parcel.readStrongBinder());
            int j4 = parcel.readInt();
            boolean flag17 = false;
            if (j4 != 0)
            {
                flag17 = true;
            }
            a(y11, flag17);
            parcel1.writeNoException();
            return true;

        case 5066: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            Uri uri1 = e(parcel.readString());
            parcel1.writeNoException();
            if (uri1 != null)
            {
                parcel1.writeInt(1);
                uri1.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }

        case 5501: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            y y10 = aa.a(parcel.readStrongBinder());
            String s8 = parcel.readString();
            int i4 = parcel.readInt();
            boolean flag15;
            boolean flag16;
            if (parcel.readInt() != 0)
            {
                flag15 = true;
            } else
            {
                flag15 = false;
            }
            if (parcel.readInt() != 0)
            {
                flag16 = true;
            } else
            {
                flag16 = false;
            }
            b(y10, s8, i4, flag15, flag16);
            parcel1.writeNoException();
            return true;

        case 5502: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            d d1 = h();
            parcel1.writeNoException();
            if (d1 != null)
            {
                parcel1.writeInt(1);
                d1.writeToParcel(parcel1, 1);
                return true;
            } else
            {
                parcel1.writeInt(0);
                return true;
            }

        case 6001: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            y y9 = aa.a(parcel.readStrongBinder());
            int l3 = parcel.readInt();
            boolean flag14 = false;
            if (l3 != 0)
            {
                flag14 = true;
            }
            b(y9, flag14);
            parcel1.writeNoException();
            return true;

        case 6002: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            y y8 = aa.a(parcel.readStrongBinder());
            String s6 = parcel.readString();
            String s7 = parcel.readString();
            int k3 = parcel.readInt();
            boolean flag13 = false;
            if (k3 != 0)
            {
                flag13 = true;
            }
            a(y8, s6, s7, flag13);
            parcel1.writeNoException();
            return true;

        case 6003: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            y y7 = aa.a(parcel.readStrongBinder());
            int i3 = parcel.readInt();
            boolean flag11;
            int j3;
            boolean flag12;
            if (parcel.readInt() != 0)
            {
                flag11 = true;
            } else
            {
                flag11 = false;
            }
            j3 = parcel.readInt();
            flag12 = false;
            if (j3 != 0)
            {
                flag12 = true;
            }
            d(y7, i3, flag11, flag12);
            parcel1.writeNoException();
            return true;

        case 6004: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            y y6 = aa.a(parcel.readStrongBinder());
            int k2 = parcel.readInt();
            boolean flag9;
            int l2;
            boolean flag10;
            if (parcel.readInt() != 0)
            {
                flag9 = true;
            } else
            {
                flag9 = false;
            }
            l2 = parcel.readInt();
            flag10 = false;
            if (l2 != 0)
            {
                flag10 = true;
            }
            e(y6, k2, flag9, flag10);
            parcel1.writeNoException();
            return true;

        case 6501: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            y y5 = aa.a(parcel.readStrongBinder());
            String s5 = parcel.readString();
            int i2 = parcel.readInt();
            boolean flag5;
            boolean flag6;
            boolean flag7;
            int j2;
            boolean flag8;
            if (parcel.readInt() != 0)
            {
                flag5 = true;
            } else
            {
                flag5 = false;
            }
            if (parcel.readInt() != 0)
            {
                flag6 = true;
            } else
            {
                flag6 = false;
            }
            if (parcel.readInt() != 0)
            {
                flag7 = true;
            } else
            {
                flag7 = false;
            }
            j2 = parcel.readInt();
            flag8 = false;
            if (j2 != 0)
            {
                flag8 = true;
            }
            a(y5, s5, i2, flag5, flag6, flag7, flag8);
            parcel1.writeNoException();
            return true;

        case 6502: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            y y4 = aa.a(parcel.readStrongBinder());
            String s4 = parcel.readString();
            int l1 = parcel.readInt();
            boolean flag4 = false;
            if (l1 != 0)
            {
                flag4 = true;
            }
            b(y4, s4, flag4);
            parcel1.writeNoException();
            return true;

        case 6503: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            y y3 = aa.a(parcel.readStrongBinder());
            int k1 = parcel.readInt();
            boolean flag3 = false;
            if (k1 != 0)
            {
                flag3 = true;
            }
            c(y3, flag3);
            parcel1.writeNoException();
            return true;

        case 6504: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            y y2 = aa.a(parcel.readStrongBinder());
            String s3 = parcel.readString();
            int j1 = parcel.readInt();
            boolean flag2 = false;
            if (j1 != 0)
            {
                flag2 = true;
            }
            c(y2, s3, flag2);
            parcel1.writeNoException();
            return true;

        case 6505: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            y y1 = aa.a(parcel.readStrongBinder());
            String s2 = parcel.readString();
            int i1 = parcel.readInt();
            boolean flag1 = false;
            if (i1 != 0)
            {
                flag1 = true;
            }
            d(y1, s2, flag1);
            parcel1.writeNoException();
            return true;

        case 6506: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            y y = aa.a(parcel.readStrongBinder());
            String s = parcel.readString();
            String s1 = parcel.readString();
            int l = parcel.readInt();
            boolean flag = false;
            if (l != 0)
            {
                flag = true;
            }
            b(y, s, s1, flag);
            parcel1.writeNoException();
            return true;

        case 6507: 
            parcel.enforceInterface("com.google.android.gms.games.internal.IGamesService");
            k = parcel.readInt();
            uri = null;
            break;
        }
        if (k != 0)
        {
            uri = (Uri)Uri.CREATOR.createFromParcel(parcel);
        }
        ParcelFileDescriptor parcelfiledescriptor = a(uri);
        parcel1.writeNoException();
        if (parcelfiledescriptor != null)
        {
            parcel1.writeInt(1);
            parcelfiledescriptor.writeToParcel(parcel1, 1);
            return true;
        } else
        {
            parcel1.writeInt(0);
            return true;
        }
    }
}
