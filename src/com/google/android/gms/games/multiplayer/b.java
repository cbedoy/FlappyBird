// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.games.Game;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Invitation, InvitationEntity, d, Participant

public final class b extends com.google.android.gms.common.data.b
    implements Invitation
{

    private final Game c;
    private final d d;
    private final ArrayList e;

    public Object a()
    {
        return h();
    }

    public Game b()
    {
        return c;
    }

    public String c()
    {
        return d("external_invitation_id");
    }

    public Participant d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public long e()
    {
        return a("creation_timestamp");
    }

    public boolean equals(Object obj)
    {
        return InvitationEntity.a(this, obj);
    }

    public int f()
    {
        return b("type");
    }

    public int g()
    {
        return b("variant");
    }

    public Invitation h()
    {
        return new InvitationEntity(this);
    }

    public int hashCode()
    {
        return InvitationEntity.a(this);
    }

    public ArrayList i()
    {
        return e;
    }

    public String toString()
    {
        return InvitationEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        ((InvitationEntity)h()).writeToParcel(parcel, j);
    }
}
