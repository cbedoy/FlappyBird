// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.games:
//            Game, GameEntity

public final class b extends com.google.android.gms.common.data.b
    implements Game
{

    public Object a()
    {
        return q();
    }

    public String b()
    {
        return d("external_game_id");
    }

    public String c()
    {
        return d("display_name");
    }

    public String d()
    {
        return d("primary_category");
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return d("secondary_category");
    }

    public boolean equals(Object obj)
    {
        return GameEntity.a(this, obj);
    }

    public String f()
    {
        return d("game_description");
    }

    public String g()
    {
        return d("developer_name");
    }

    public Uri h()
    {
        return e("game_icon_image_uri");
    }

    public int hashCode()
    {
        return GameEntity.a(this);
    }

    public Uri i()
    {
        return e("game_hi_res_image_uri");
    }

    public Uri j()
    {
        return e("featured_image_uri");
    }

    public boolean k()
    {
        return c("play_enabled_game");
    }

    public boolean l()
    {
        return b("installed") > 0;
    }

    public String m()
    {
        return d("package_name");
    }

    public int n()
    {
        return b("gameplay_acl_status");
    }

    public int o()
    {
        return b("achievement_total_count");
    }

    public int p()
    {
        return b("leaderboard_count");
    }

    public Game q()
    {
        return new GameEntity(this);
    }

    public String toString()
    {
        return GameEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        ((GameEntity)q()).writeToParcel(parcel, i1);
    }
}
