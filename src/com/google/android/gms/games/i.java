// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.games:
//            PlayerEntity

public class i
    implements android.os.Parcelable.Creator
{

    public i()
    {
    }

    static void a(PlayerEntity playerentity, Parcel parcel, int j)
    {
        int k = c.a(parcel);
        c.a(parcel, 1, playerentity.b(), false);
        c.a(parcel, 1000, playerentity.g());
        c.a(parcel, 2, playerentity.c(), false);
        c.a(parcel, 3, playerentity.d(), j, false);
        c.a(parcel, 4, playerentity.e(), j, false);
        c.a(parcel, 5, playerentity.f());
        c.a(parcel, k);
    }

    public PlayerEntity a(Parcel parcel)
    {
        Uri uri = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int k = 0;
        long l = 0L;
        Uri uri1 = null;
        String s = null;
        String s1 = null;
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
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 3: // '\003'
                    uri1 = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, Uri.CREATOR);
                    break;

                case 4: // '\004'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, Uri.CREATOR);
                    break;

                case 5: // '\005'
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new PlayerEntity(k, s1, s, uri1, uri, l);
            }
        } while (true);
    }

    public PlayerEntity[] a(int j)
    {
        return new PlayerEntity[j];
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
