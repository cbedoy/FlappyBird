// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.maps:
//            GoogleMapOptions

public class e
{

    static void a(GoogleMapOptions googlemapoptions, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, googlemapoptions.a());
        c.a(parcel, 2, googlemapoptions.b());
        c.a(parcel, 3, googlemapoptions.c());
        c.a(parcel, 4, googlemapoptions.j());
        c.a(parcel, 5, googlemapoptions.k(), i, false);
        c.a(parcel, 6, googlemapoptions.d());
        c.a(parcel, 7, googlemapoptions.e());
        c.a(parcel, 8, googlemapoptions.f());
        c.a(parcel, 9, googlemapoptions.g());
        c.a(parcel, 10, googlemapoptions.h());
        c.a(parcel, 11, googlemapoptions.i());
        c.a(parcel, j);
    }
}
