// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal:
//            bi

public class ap
    implements android.os.Parcelable.Creator
{

    public ap()
    {
    }

    static void a(bi bi1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, bi1.f(), false);
        c.a(parcel, 1000, bi1.a());
        c.a(parcel, 2, bi1.g());
        c.a(parcel, 3, bi1.b());
        c.a(parcel, 4, bi1.c());
        c.a(parcel, 5, bi1.d());
        c.a(parcel, 6, bi1.e());
        c.a(parcel, 7, bi1.h());
        c.a(parcel, j);
    }

    public bi a(Parcel parcel)
    {
        double d = 0.0D;
        short word0 = 0;
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        String s = null;
        float f = 0.0F;
        long l = 0L;
        double d1 = d;
        int j = 0;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < i)
            {
                int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(i1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, i1);
                    break;

                case 1: // '\001'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 2: // '\002'
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;

                case 3: // '\003'
                    word0 = com.google.android.gms.common.internal.safeparcel.a.e(parcel, i1);
                    break;

                case 4: // '\004'
                    d1 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, i1);
                    break;

                case 5: // '\005'
                    d = com.google.android.gms.common.internal.safeparcel.a.j(parcel, i1);
                    break;

                case 6: // '\006'
                    f = com.google.android.gms.common.internal.safeparcel.a.i(parcel, i1);
                    break;

                case 7: // '\007'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
            } else
            {
                return new bi(k, s, j, word0, d1, d, f, l);
            }
        } while (true);
    }

    public bi[] a(int i)
    {
        return new bi[i];
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
