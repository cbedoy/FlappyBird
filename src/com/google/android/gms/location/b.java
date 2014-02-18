// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.location:
//            DetectedActivity

public class b
    implements android.os.Parcelable.Creator
{

    public b()
    {
    }

    static void a(DetectedActivity detectedactivity, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, detectedactivity.a);
        c.a(parcel, 1000, detectedactivity.b());
        c.a(parcel, 2, detectedactivity.b);
        c.a(parcel, j);
    }

    public DetectedActivity a(Parcel parcel)
    {
        int i = 0;
        int j = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
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
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new com.google.android.gms.common.internal.safeparcel.b((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new DetectedActivity(l, k, i);
            }
        } while (true);
    }

    public DetectedActivity[] a(int i)
    {
        return new DetectedActivity[i];
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
