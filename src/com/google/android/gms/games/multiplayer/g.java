// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.games.PlayerEntity;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            ParticipantEntity

public class g
    implements android.os.Parcelable.Creator
{

    public g()
    {
    }

    static void a(ParticipantEntity participantentity, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, participantentity.i(), false);
        c.a(parcel, 1000, participantentity.k());
        c.a(parcel, 2, participantentity.f(), false);
        c.a(parcel, 3, participantentity.g(), i, false);
        c.a(parcel, 4, participantentity.h(), i, false);
        c.a(parcel, 5, participantentity.b());
        c.a(parcel, 6, participantentity.c(), false);
        c.a(parcel, 7, participantentity.e());
        c.a(parcel, 8, participantentity.j(), i, false);
        c.a(parcel, 9, participantentity.d());
        c.a(parcel, j);
    }

    public ParticipantEntity a(Parcel parcel)
    {
        int i = 0;
        PlayerEntity playerentity = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        boolean flag = false;
        String s = null;
        int k = 0;
        Uri uri = null;
        Uri uri1 = null;
        String s1 = null;
        String s2 = null;
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
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 1000: 
                    l = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 2: // '\002'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 3: // '\003'
                    uri1 = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, Uri.CREATOR);
                    break;

                case 4: // '\004'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, Uri.CREATOR);
                    break;

                case 5: // '\005'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;

                case 6: // '\006'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, i1);
                    break;

                case 7: // '\007'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, i1);
                    break;

                case 8: // '\b'
                    playerentity = (PlayerEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, i1, PlayerEntity.CREATOR);
                    break;

                case 9: // '\t'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, i1);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new ParticipantEntity(l, s2, s1, uri1, uri, k, s, flag, playerentity, i);
            }
        } while (true);
    }

    public ParticipantEntity[] a(int i)
    {
        return new ParticipantEntity[i];
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
