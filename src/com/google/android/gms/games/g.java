// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;

// Referenced classes of package com.google.android.gms.games:
//            i, PlayerEntity

final class g extends i
{

    g()
    {
    }

    public PlayerEntity a(Parcel parcel)
    {
        if (PlayerEntity.a(PlayerEntity.i()) || PlayerEntity.a(com/google/android/gms/games/PlayerEntity.getCanonicalName()))
        {
            return super.a(parcel);
        }
        String s = parcel.readString();
        String s1 = parcel.readString();
        String s2 = parcel.readString();
        String s3 = parcel.readString();
        Uri uri;
        Uri uri1;
        if (s2 == null)
        {
            uri = null;
        } else
        {
            uri = Uri.parse(s2);
        }
        uri1 = null;
        if (s3 != null)
        {
            uri1 = Uri.parse(s3);
        }
        return new PlayerEntity(1, s, s1, uri, uri1, parcel.readLong());
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }
}
