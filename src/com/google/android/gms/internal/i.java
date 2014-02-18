// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal:
//            ak, ah

public class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    static void a(ak ak1, Parcel parcel, int j)
    {
        int k = c.a(parcel);
        c.a(parcel, 1, ak1.a());
        c.a(parcel, 2, ak1.e(), false);
        c.a(parcel, 3, ak1.f(), j, false);
        c.a(parcel, k);
    }

    public ak a(Parcel parcel)
    {
        ah ah1 = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int k = 0;
        Parcel parcel1 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    parcel1 = com.google.android.gms.common.internal.safeparcel.a.y(parcel, l);
                    break;

                case 3: // '\003'
                    ah1 = (ah)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, ah.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new ak(k, parcel1, ah1);
            }
        } while (true);
    }

    public ak[] a(int j)
    {
        return new ak[j];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int j)
    {
        return a(j);
    }
}
