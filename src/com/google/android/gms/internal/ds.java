// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal:
//            x

public class ds
    implements android.os.Parcelable.Creator
{

    public ds()
    {
    }

    static void a(x x1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, x1.b());
        c.a(parcel, 1000, x1.a());
        c.a(parcel, 2, x1.c());
        c.a(parcel, 3, x1.d(), false);
        c.a(parcel, 4, x1.e(), false);
        c.a(parcel, 5, x1.f(), false);
        c.a(parcel, 6, x1.g(), false);
        c.a(parcel, j);
    }

    public x a(Parcel parcel)
    {
        int i = 0;
        String s = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        String s1 = null;
        String s2 = null;
        String s3 = null;
        int k = 0;
        int l = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 1000: 
                    l = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 2: // '\002'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 3: // '\003'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 4: // '\004'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 5: // '\005'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new x(l, k, i, s3, s2, s1, s);
            }
        } while (true);
    }

    public x[] a(int i)
    {
        return new x[i];
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
