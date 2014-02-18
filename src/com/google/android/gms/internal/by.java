// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal:
//            cq, x

public class by
    implements android.os.Parcelable.Creator
{

    public by()
    {
    }

    static void a(cq cq1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1000, cq1.f());
        c.b(parcel, 2, cq1.a(), false);
        c.b(parcel, 3, cq1.b(), false);
        c.a(parcel, 4, cq1.c(), false);
        c.a(parcel, 5, cq1.d());
        c.a(parcel, 6, cq1.e());
        c.a(parcel, j);
    }

    public cq a(Parcel parcel)
    {
        android.os.Bundle bundle = null;
        int i = 0;
        int j = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        boolean flag = false;
        java.util.ArrayList arraylist = null;
        java.util.ArrayList arraylist1 = null;
        int k = 0;
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

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, x.CREATOR);
                    break;

                case 3: // '\003'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, x.CREATOR);
                    break;

                case 4: // '\004'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.n(parcel, l);
                    break;

                case 5: // '\005'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l);
                    break;

                case 6: // '\006'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new cq(k, arraylist1, arraylist, bundle, flag, i);
            }
        } while (true);
    }

    public cq[] a(int i)
    {
        return new cq[i];
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
