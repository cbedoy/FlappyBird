// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal:
//            z

public class e
    implements android.os.Parcelable.Creator
{

    public e()
    {
    }

    static void a(ae.a a1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, a1.a());
        c.a(parcel, 2, a1.b());
        c.a(parcel, 3, a1.c());
        c.a(parcel, 4, a1.d());
        c.a(parcel, 5, a1.e());
        c.a(parcel, 6, a1.f(), false);
        c.a(parcel, 7, a1.g());
        c.a(parcel, 8, a1.i(), false);
        c.a(parcel, 9, a1.k(), i, false);
        c.a(parcel, j);
    }

    public ae.a a(Parcel parcel)
    {
        z z1 = null;
        int i = 0;
        int j = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        String s = null;
        String s1 = null;
        boolean flag = false;
        int k = 0;
        boolean flag1 = false;
        int l = 0;
        int i1 = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(j1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    i1 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 2: // '\002'
                    l = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 3: // '\003'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 4: // '\004'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 6: // '\006'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 7: // '\007'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 8: // '\b'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 9: // '\t'
                    z1 = (z)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, z.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new ae.a(i1, l, flag1, k, flag, s1, i, s, z1);
            }
        } while (true);
    }

    public ae.a[] a(int i)
    {
        return new ae.a[i];
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
