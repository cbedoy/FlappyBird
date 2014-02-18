// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.b;
import com.google.android.gms.games.multiplayer.d;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            Room, RoomEntity, b

public final class c extends b
    implements Room
{

    private final int c;

    public Object a()
    {
        return k();
    }

    public String b()
    {
        return d("external_match_id");
    }

    public String c()
    {
        return d("creator_external");
    }

    public long d()
    {
        return a("creation_timestamp");
    }

    public int describeContents()
    {
        return 0;
    }

    public int e()
    {
        return b("status");
    }

    public boolean equals(Object obj)
    {
        return RoomEntity.a(this, obj);
    }

    public String f()
    {
        return d("description");
    }

    public int g()
    {
        return b("variant");
    }

    public Bundle h()
    {
        if (!c("has_automatch_criteria"))
        {
            return null;
        } else
        {
            return com.google.android.gms.games.multiplayer.realtime.b.a(b("automatch_min_players"), b("automatch_max_players"), a("automatch_bit_mask"));
        }
    }

    public int hashCode()
    {
        return RoomEntity.a(this);
    }

    public ArrayList i()
    {
        ArrayList arraylist = new ArrayList(c);
        for (int l = 0; l < c; l++)
        {
            arraylist.add(new d(a, l + b));
        }

        return arraylist;
    }

    public int j()
    {
        return b("automatch_wait_estimate_sec");
    }

    public Room k()
    {
        return new RoomEntity(this);
    }

    public String toString()
    {
        return com.google.android.gms.games.multiplayer.realtime.RoomEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int l)
    {
        ((RoomEntity)k()).writeToParcel(parcel, l);
    }
}
