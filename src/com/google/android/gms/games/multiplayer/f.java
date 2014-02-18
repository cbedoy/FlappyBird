// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.games.GameEntity;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            InvitationEntity, ParticipantEntity

public class f
    implements android.os.Parcelable.Creator
{

    public f()
    {
    }

    static void a(InvitationEntity invitationentity, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, invitationentity.b(), i, false);
        c.a(parcel, 1000, invitationentity.h());
        c.a(parcel, 2, invitationentity.c(), false);
        c.a(parcel, 3, invitationentity.e());
        c.a(parcel, 4, invitationentity.f());
        c.a(parcel, 5, invitationentity.d(), i, false);
        c.b(parcel, 6, invitationentity.i(), false);
        c.a(parcel, 7, invitationentity.g());
        c.a(parcel, j);
    }

    public InvitationEntity a(Parcel parcel)
    {
        int i = 0;
        java.util.ArrayList arraylist = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        long l = 0L;
        ParticipantEntity participantentity = null;
        int k = 0;
        String s = null;
        GameEntity gameentity = null;
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
                    gameentity = (GameEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, GameEntity.CREATOR);
                    break;

                case 1000: 
                    i1 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 3: // '\003'
                    l = com.google.android.gms.common.internal.safeparcel.a.g(parcel, j1);
                    break;

                case 4: // '\004'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 5: // '\005'
                    participantentity = (ParticipantEntity)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, ParticipantEntity.CREATOR);
                    break;

                case 6: // '\006'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1, ParticipantEntity.CREATOR);
                    break;

                case 7: // '\007'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new InvitationEntity(i1, gameentity, s, l, k, participantentity, arraylist, i);
            }
        } while (true);
    }

    public InvitationEntity[] a(int i)
    {
        return new InvitationEntity[i];
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
