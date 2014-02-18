// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.b;
import com.google.android.gms.games.Player;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Participant, ParticipantEntity

public final class d extends b
    implements Participant
{

    private final com.google.android.gms.games.d c;

    public d(com.google.android.gms.common.data.d d1, int l)
    {
        super(d1, l);
        c = new com.google.android.gms.games.d(d1, l);
    }

    public Object a()
    {
        return k();
    }

    public int b()
    {
        return b("player_status");
    }

    public String c()
    {
        return d("client_address");
    }

    public int d()
    {
        return b("capabilities");
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean e()
    {
        return b("connected") > 0;
    }

    public boolean equals(Object obj)
    {
        return ParticipantEntity.a(this, obj);
    }

    public String f()
    {
        if (f("external_player_id"))
        {
            return d("default_display_name");
        } else
        {
            return c.c();
        }
    }

    public Uri g()
    {
        if (f("external_player_id"))
        {
            return e("default_display_image_uri");
        } else
        {
            return c.d();
        }
    }

    public Uri h()
    {
        if (f("external_player_id"))
        {
            return null;
        } else
        {
            return c.e();
        }
    }

    public int hashCode()
    {
        return ParticipantEntity.a(this);
    }

    public String i()
    {
        return d("external_participant_id");
    }

    public Player j()
    {
        if (f("external_player_id"))
        {
            return null;
        } else
        {
            return c;
        }
    }

    public Participant k()
    {
        return new ParticipantEntity(this);
    }

    public String toString()
    {
        return com.google.android.gms.games.multiplayer.ParticipantEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int l)
    {
        ((ParticipantEntity)k()).writeToParcel(parcel, l);
    }
}
