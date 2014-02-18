// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.maps.model:
//            PolygonOptions, LatLng

public class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    static void a(PolygonOptions polygonoptions, Parcel parcel, int j)
    {
        int k = c.a(parcel);
        c.a(parcel, 1, polygonoptions.a());
        c.b(parcel, 2, polygonoptions.c(), false);
        c.c(parcel, 3, polygonoptions.b(), false);
        c.a(parcel, 4, polygonoptions.d());
        c.a(parcel, 5, polygonoptions.e());
        c.a(parcel, 6, polygonoptions.f());
        c.a(parcel, 7, polygonoptions.g());
        c.a(parcel, 8, polygonoptions.h());
        c.a(parcel, 9, polygonoptions.i());
        c.a(parcel, k);
    }

    public PolygonOptions a(Parcel parcel)
    {
        float f = 0.0F;
        boolean flag = false;
        int j = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        ArrayList arraylist = null;
        ArrayList arraylist1 = new ArrayList();
        boolean flag1 = false;
        int k = 0;
        int l = 0;
        float f1 = 0.0F;
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
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1, LatLng.CREATOR);
                    break;

                case 3: // '\003'
                    com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, arraylist1, getClass().getClassLoader());
                    break;

                case 4: // '\004'
                    f1 = com.google.android.gms.common.internal.safeparcel.a.i(parcel, j1);
                    break;

                case 5: // '\005'
                    l = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 6: // '\006'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 7: // '\007'
                    f = com.google.android.gms.common.internal.safeparcel.a.i(parcel, j1);
                    break;

                case 8: // '\b'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 9: // '\t'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new PolygonOptions(i1, arraylist, arraylist1, f1, l, k, f, flag1, flag);
            }
        } while (true);
    }

    public PolygonOptions[] a(int j)
    {
        return new PolygonOptions[j];
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
