// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.d;
import com.google.android.gms.common.data.f;

// Referenced classes of package com.google.android.gms.internal:
//            aq, as, ak, i, 
//            bv, bg, co, bw, 
//            cq, by, x

public abstract class ar extends Binder
    implements aq
{

    public static aq a(IBinder ibinder)
    {
        if (ibinder == null)
        {
            return null;
        }
        android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
        if (iinterface != null && (iinterface instanceof aq))
        {
            return (aq)iinterface;
        } else
        {
            return new as(ibinder);
        }
    }

    public IBinder asBinder()
    {
        return this;
    }

    public boolean onTransact(int j, Parcel parcel, Parcel parcel1, int k)
    {
        int l;
        switch (j)
        {
        default:
            return super.onTransact(j, parcel, parcel1, k);

        case 1598968902: 
            parcel1.writeString("com.google.android.gms.plus.internal.IPlusCallbacks");
            return true;

        case 1: // '\001'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
            int l5 = parcel.readInt();
            Bundle bundle13;
            Bundle bundle14;
            if (parcel.readInt() != 0)
            {
                bundle13 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                bundle13 = null;
            }
            if (parcel.readInt() != 0)
            {
                bundle14 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                bundle14 = null;
            }
            a(l5, bundle13, bundle14);
            parcel1.writeNoException();
            return true;

        case 2: // '\002'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
            int k5 = parcel.readInt();
            Bundle bundle12;
            ParcelFileDescriptor parcelfiledescriptor;
            if (parcel.readInt() != 0)
            {
                bundle12 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                bundle12 = null;
            }
            if (parcel.readInt() != 0)
            {
                parcelfiledescriptor = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(parcel);
            } else
            {
                parcelfiledescriptor = null;
            }
            a(k5, bundle12, parcelfiledescriptor);
            parcel1.writeNoException();
            return true;

        case 3: // '\003'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
            a(parcel.readString());
            parcel1.writeNoException();
            return true;

        case 4: // '\004'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
            int j5 = parcel.readInt();
            d d3 = null;
            if (j5 != 0)
            {
                d3 = d.CREATOR.a(parcel);
            }
            a(d3, parcel.readString());
            parcel1.writeNoException();
            return true;

        case 5: // '\005'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
            int l4 = parcel.readInt();
            Bundle bundle11;
            int i5;
            ak ak1;
            if (parcel.readInt() != 0)
            {
                bundle11 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                bundle11 = null;
            }
            i5 = parcel.readInt();
            ak1 = null;
            if (i5 != 0)
            {
                ak1 = ak.CREATOR.a(parcel);
            }
            a(l4, bundle11, ak1);
            parcel1.writeNoException();
            return true;

        case 6: // '\006'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
            int k4 = parcel.readInt();
            d d2 = null;
            if (k4 != 0)
            {
                d2 = d.CREATOR.a(parcel);
            }
            a(d2, parcel.readString(), parcel.readString());
            parcel1.writeNoException();
            return true;

        case 7: // '\007'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
            int j4 = parcel.readInt();
            Bundle bundle10;
            if (parcel.readInt() != 0)
            {
                bundle10 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                bundle10 = null;
            }
            a(j4, bundle10);
            parcel1.writeNoException();
            return true;

        case 8: // '\b'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
            int i4 = parcel.readInt();
            d d1 = null;
            if (i4 != 0)
            {
                d1 = d.CREATOR.a(parcel);
            }
            b(d1, parcel.readString());
            parcel1.writeNoException();
            return true;

        case 9: // '\t'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
            int l3 = parcel.readInt();
            Bundle bundle8;
            Bundle bundle9;
            if (parcel.readInt() != 0)
            {
                bundle8 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                bundle8 = null;
            }
            if (parcel.readInt() != 0)
            {
                bundle9 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                bundle9 = null;
            }
            b(l3, bundle8, bundle9);
            parcel1.writeNoException();
            return true;

        case 10: // '\n'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
            int j3 = parcel.readInt();
            int k3 = parcel.readInt();
            Bundle bundle7 = null;
            if (k3 != 0)
            {
                bundle7 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            }
            a(j3, bundle7, parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList());
            parcel1.writeNoException();
            return true;

        case 11: // '\013'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
            int l2 = parcel.readInt();
            Bundle bundle6;
            String s;
            int i3;
            bv bv1;
            if (parcel.readInt() != 0)
            {
                bundle6 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                bundle6 = null;
            }
            s = parcel.readString();
            i3 = parcel.readInt();
            bv1 = null;
            if (i3 != 0)
            {
                bv1 = bv.CREATOR.a(parcel);
            }
            a(l2, bundle6, s, bv1);
            parcel1.writeNoException();
            return true;

        case 12: // '\f'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
            int k2 = parcel.readInt();
            Bundle bundle5;
            if (parcel.readInt() != 0)
            {
                bundle5 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                bundle5 = null;
            }
            b(k2, bundle5);
            parcel1.writeNoException();
            return true;

        case 13: // '\r'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
            int i2 = parcel.readInt();
            Bundle bundle4;
            int j2;
            co co1;
            if (parcel.readInt() != 0)
            {
                bundle4 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                bundle4 = null;
            }
            j2 = parcel.readInt();
            co1 = null;
            if (j2 != 0)
            {
                co1 = co.CREATOR.a(parcel);
            }
            a(i2, bundle4, co1);
            parcel1.writeNoException();
            return true;

        case 14: // '\016'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
            int k1 = parcel.readInt();
            Bundle bundle3;
            int l1;
            cq cq1;
            if (parcel.readInt() != 0)
            {
                bundle3 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                bundle3 = null;
            }
            l1 = parcel.readInt();
            cq1 = null;
            if (l1 != 0)
            {
                cq1 = cq.CREATOR.a(parcel);
            }
            a(k1, bundle3, cq1);
            parcel1.writeNoException();
            return true;

        case 15: // '\017'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
            int j1 = parcel.readInt();
            Bundle bundle2;
            if (parcel.readInt() != 0)
            {
                bundle2 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                bundle2 = null;
            }
            a(j1, bundle2, parcel.readString());
            parcel1.writeNoException();
            return true;

        case 16: // '\020'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
            int i1 = parcel.readInt();
            Bundle bundle1;
            if (parcel.readInt() != 0)
            {
                bundle1 = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
            } else
            {
                bundle1 = null;
            }
            a(i1, bundle1, parcel.createTypedArrayList(x.CREATOR));
            parcel1.writeNoException();
            return true;

        case 17: // '\021'
            parcel.enforceInterface("com.google.android.gms.plus.internal.IPlusCallbacks");
            l = parcel.readInt();
            break;
        }
        Bundle bundle;
        if (parcel.readInt() != 0)
        {
            bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel);
        } else
        {
            bundle = null;
        }
        a(l, bundle, parcel.readInt());
        parcel1.writeNoException();
        return true;
    }
}
