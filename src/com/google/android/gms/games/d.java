// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.b;

// Referenced classes of package com.google.android.gms.games:
//            Player, PlayerEntity

public final class d extends b
    implements Player
{

    public d(com.google.android.gms.common.data.d d1, int i)
    {
        super(d1, i);
    }

    public Object a()
    {
        return g();
    }

    public String b()
    {
        return d("external_player_id");
    }

    public String c()
    {
        return d("profile_name");
    }

    public Uri d()
    {
        return e("profile_icon_image_uri");
    }

    public int describeContents()
    {
        return 0;
    }

    public Uri e()
    {
        return e("profile_hi_res_image_uri");
    }

    public boolean equals(Object obj)
    {
        return PlayerEntity.a(this, obj);
    }

    public long f()
    {
        return a("last_updated");
    }

    public Player g()
    {
        return new PlayerEntity(this);
    }

    public int hashCode()
    {
        return PlayerEntity.a(this);
    }

    public String toString()
    {
        return com.google.android.gms.games.PlayerEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((PlayerEntity)g()).writeToParcel(parcel, i);
    }
}
