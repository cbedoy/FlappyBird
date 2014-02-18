// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            a, ab, d

public class z
    implements SafeParcelable
{

    public static final a CREATOR = new a();
    private final int a;
    private final ab b;

    z(int i, ab ab1)
    {
        a = i;
        b = ab1;
    }

    private z(ab ab1)
    {
        a = 1;
        b = ab1;
    }

    public static z a(d d)
    {
        if (d instanceof ab)
        {
            return new z((ab)d);
        } else
        {
            throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
        }
    }

    int a()
    {
        return a;
    }

    ab b()
    {
        return b;
    }

    public d c()
    {
        if (b != null)
        {
            return b;
        } else
        {
            throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
        }
    }

    public int describeContents()
    {
        a _tmp = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        a _tmp = CREATOR;
        com.google.android.gms.internal.a.a(this, parcel, i);
    }

}
