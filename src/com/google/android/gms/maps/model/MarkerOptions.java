// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.e;
import com.google.android.gms.b.f;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.bk;

// Referenced classes of package com.google.android.gms.maps.model:
//            h, a, v, LatLng

public final class MarkerOptions
    implements SafeParcelable
{

    public static final h CREATOR = new h();
    private final int a;
    private LatLng b;
    private String c;
    private String d;
    private a e;
    private float f;
    private float g;
    private boolean h;
    private boolean i;
    private boolean j;
    private float k;
    private float l;
    private float m;

    public MarkerOptions()
    {
        f = 0.5F;
        g = 1.0F;
        i = true;
        j = false;
        k = 0.0F;
        l = 0.5F;
        m = 0.0F;
        a = 1;
    }

    MarkerOptions(int i1, LatLng latlng, String s, String s1, IBinder ibinder, float f1, float f2, 
            boolean flag, boolean flag1, boolean flag2, float f3, float f4, float f5)
    {
        f = 0.5F;
        g = 1.0F;
        i = true;
        j = false;
        k = 0.0F;
        l = 0.5F;
        m = 0.0F;
        a = i1;
        b = latlng;
        c = s;
        d = s1;
        a a1;
        if (ibinder == null)
        {
            a1 = null;
        } else
        {
            a1 = new a(com.google.android.gms.b.f.a(ibinder));
        }
        e = a1;
        f = f1;
        g = f2;
        h = flag;
        i = flag1;
        j = flag2;
        k = f3;
        l = f4;
        m = f5;
    }

    int a()
    {
        return a;
    }

    IBinder b()
    {
        if (e == null)
        {
            return null;
        } else
        {
            return e.a().asBinder();
        }
    }

    public LatLng c()
    {
        return b;
    }

    public String d()
    {
        return c;
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return d;
    }

    public float f()
    {
        return f;
    }

    public float g()
    {
        return g;
    }

    public boolean h()
    {
        return h;
    }

    public boolean i()
    {
        return i;
    }

    public boolean j()
    {
        return j;
    }

    public float k()
    {
        return k;
    }

    public float l()
    {
        return l;
    }

    public float m()
    {
        return m;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        if (bk.a())
        {
            v.a(this, parcel, i1);
            return;
        } else
        {
            com.google.android.gms.maps.model.h.a(this, parcel, i1);
            return;
        }
    }

}
