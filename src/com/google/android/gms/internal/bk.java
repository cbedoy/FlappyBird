// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            bz, bx

public class bk
    implements android.os.Parcelable.Creator
{

    public bk()
    {
    }

    static void a(bz bz1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        Set set = bz1.e();
        if (set.contains(Integer.valueOf(1)))
        {
            c.a(parcel, 1, bz1.f());
        }
        if (set.contains(Integer.valueOf(2)))
        {
            c.a(parcel, 2, bz1.g(), true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            c.a(parcel, 4, bz1.h(), i, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            c.a(parcel, 5, bz1.i(), true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            c.a(parcel, 6, bz1.j(), i, true);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            c.a(parcel, 7, bz1.k(), true);
        }
        c.a(parcel, j);
    }

    public bz a(Parcel parcel)
    {
        String s = null;
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        HashSet hashset = new HashSet();
        int j = 0;
        bx bx1 = null;
        String s1 = null;
        bx bx2 = null;
        String s2 = null;
        do
        {
            if (parcel.dataPosition() < i)
            {
                int k = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(k))
                {
                case 3: // '\003'
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, k);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 4: // '\004'
                    bx bx4 = (bx)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, bx.CREATOR);
                    hashset.add(Integer.valueOf(4));
                    bx2 = bx4;
                    break;

                case 5: // '\005'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    bx bx3 = (bx)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, bx.CREATOR);
                    hashset.add(Integer.valueOf(6));
                    bx1 = bx3;
                    break;

                case 7: // '\007'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    hashset.add(Integer.valueOf(7));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != i)
                {
                    throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
                }
                return new bz(hashset, j, s2, bx2, s1, bx1, s);
            }
        } while (true);
    }

    public bz[] a(int i)
    {
        return new bz[i];
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
