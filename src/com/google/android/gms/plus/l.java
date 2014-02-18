// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.plus:
//            a

public class l
    implements android.os.Parcelable.Creator
{

    public l()
    {
    }

    static void a(com.google.android.gms.plus.a a1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, a1.b(), false);
        c.a(parcel, 1000, a1.a());
        c.a(parcel, 2, a1.c(), false);
        c.a(parcel, 3, a1.d(), false);
        c.a(parcel, 4, a1.e(), false);
        c.a(parcel, 5, a1.f(), false);
        c.a(parcel, 6, a1.g(), false);
        c.a(parcel, 7, a1.h(), false);
        c.a(parcel, j);
    }

    public com.google.android.gms.plus.a a(Parcel parcel)
    {
        String s = null;
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int j = 0;
        String s1 = null;
        String s2 = null;
        String as[] = null;
        String as1[] = null;
        String as2[] = null;
        String s3 = null;
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
                    s3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    as2 = com.google.android.gms.common.internal.safeparcel.a.w(parcel, k);
                    break;

                case 3: // '\003'
                    as1 = com.google.android.gms.common.internal.safeparcel.a.w(parcel, k);
                    break;

                case 4: // '\004'
                    as = com.google.android.gms.common.internal.safeparcel.a.w(parcel, k);
                    break;

                case 5: // '\005'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 6: // '\006'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;

                case 7: // '\007'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != i)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
            } else
            {
                return new com.google.android.gms.plus.a(j, s3, as2, as1, as, s2, s1, s);
            }
        } while (true);
    }

    public com.google.android.gms.plus.a[] a(int i)
    {
        return new com.google.android.gms.plus.a[i];
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
