// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal:
//            bv, x

public class bg
    implements android.os.Parcelable.Creator
{

    public bg()
    {
    }

    static void a(bv bv1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, bv1.b(), false);
        c.a(parcel, 1000, bv1.a());
        c.b(parcel, 2, bv1.c(), false);
        c.b(parcel, 3, bv1.d(), false);
        c.a(parcel, 4, bv1.e());
        c.a(parcel, j);
    }

    public bv a(Parcel parcel)
    {
        boolean flag = false;
        java.util.ArrayList arraylist = null;
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        java.util.ArrayList arraylist1 = null;
        String s = null;
        int j = 0;
        do
        {
            if (parcel.dataPosition() < i)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(k))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, x.CREATOR);
                    break;

                case 3: // '\003'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k, x.CREATOR);
                    break;

                case 4: // '\004'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != i)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
            } else
            {
                return new bv(j, s, arraylist1, arraylist, flag);
            }
        } while (true);
    }

    public bv[] a(int i)
    {
        return new bv[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
