// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal:
//            z, ab

public class a
    implements android.os.Parcelable.Creator
{

    public a()
    {
    }

    static void a(z z1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, z1.a());
        c.a(parcel, 2, z1.b(), i, false);
        c.a(parcel, j);
    }

    public z a(Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int j = 0;
        ab ab1 = null;
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
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, k);
                    break;

                case 2: // '\002'
                    ab1 = (ab)com.google.android.gms.common.internal.safeparcel.a.a(parcel, k, ab.CREATOR);
                    break;
                }
            } else
            if (parcel.dataPosition() != i)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
            } else
            {
                return new z(j, ab1);
            }
        } while (true);
    }

    public z[] a(int i)
    {
        return new z[i];
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
