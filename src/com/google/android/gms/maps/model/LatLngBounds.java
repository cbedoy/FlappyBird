// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dn;
import com.google.android.gms.internal.do;
import com.google.android.gms.maps.a.bk;

// Referenced classes of package com.google.android.gms.maps.model:
//            f, LatLng, t

public final class LatLngBounds
    implements SafeParcelable
{

    public static final f CREATOR = new f();
    public final LatLng a;
    public final LatLng b;
    private final int c;

    LatLngBounds(int i, LatLng latlng, LatLng latlng1)
    {
        com.google.android.gms.internal.do.a(latlng, "null southwest");
        com.google.android.gms.internal.do.a(latlng1, "null northeast");
        boolean flag;
        Object aobj[];
        if (latlng1.a >= latlng.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        aobj = new Object[2];
        aobj[0] = Double.valueOf(latlng.a);
        aobj[1] = Double.valueOf(latlng1.a);
        com.google.android.gms.internal.do.a(flag, "southern latitude exceeds northern latitude (%s > %s)", aobj);
        c = i;
        a = latlng;
        b = latlng1;
    }

    int a()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof LatLngBounds))
            {
                return false;
            }
            LatLngBounds latlngbounds = (LatLngBounds)obj;
            if (!a.equals(latlngbounds.a) || !b.equals(latlngbounds.b))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        Object aobj[] = new Object[2];
        aobj[0] = a;
        aobj[1] = b;
        return dl.a(aobj);
    }

    public String toString()
    {
        return dl.a(this).a("southwest", a).a("northeast", b).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (bk.a())
        {
            t.a(this, parcel, i);
            return;
        } else
        {
            f.a(this, parcel, i);
            return;
        }
    }

}
