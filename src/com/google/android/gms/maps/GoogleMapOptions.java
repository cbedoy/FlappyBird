// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.e;
import com.google.android.gms.maps.a.bk;
import com.google.android.gms.maps.a.v;
import com.google.android.gms.maps.model.CameraPosition;

// Referenced classes of package com.google.android.gms.maps:
//            b, e

public final class GoogleMapOptions
    implements SafeParcelable
{

    public static final b CREATOR = new b();
    private final int a;
    private Boolean b;
    private Boolean c;
    private int d;
    private CameraPosition e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    private Boolean k;

    public GoogleMapOptions()
    {
        d = -1;
        a = 1;
    }

    GoogleMapOptions(int l, byte byte0, byte byte1, int i1, CameraPosition cameraposition, byte byte2, byte byte3, 
            byte byte4, byte byte5, byte byte6, byte byte7)
    {
        d = -1;
        a = l;
        b = v.a(byte0);
        c = v.a(byte1);
        d = i1;
        e = cameraposition;
        f = v.a(byte2);
        g = v.a(byte3);
        h = v.a(byte4);
        i = v.a(byte5);
        j = v.a(byte6);
        k = v.a(byte7);
    }

    public static GoogleMapOptions a(Context context, AttributeSet attributeset)
    {
        if (attributeset == null)
        {
            return null;
        }
        TypedArray typedarray = context.getResources().obtainAttributes(attributeset, e.MapAttrs);
        GoogleMapOptions googlemapoptions = new GoogleMapOptions();
        if (typedarray.hasValue(0))
        {
            googlemapoptions.a(typedarray.getInt(0, -1));
        }
        if (typedarray.hasValue(13))
        {
            googlemapoptions.a(typedarray.getBoolean(13, false));
        }
        if (typedarray.hasValue(12))
        {
            googlemapoptions.b(typedarray.getBoolean(12, false));
        }
        if (typedarray.hasValue(6))
        {
            googlemapoptions.d(typedarray.getBoolean(6, true));
        }
        if (typedarray.hasValue(7))
        {
            googlemapoptions.h(typedarray.getBoolean(7, true));
        }
        if (typedarray.hasValue(8))
        {
            googlemapoptions.e(typedarray.getBoolean(8, true));
        }
        if (typedarray.hasValue(9))
        {
            googlemapoptions.g(typedarray.getBoolean(9, true));
        }
        if (typedarray.hasValue(11))
        {
            googlemapoptions.f(typedarray.getBoolean(11, true));
        }
        if (typedarray.hasValue(10))
        {
            googlemapoptions.c(typedarray.getBoolean(10, true));
        }
        googlemapoptions.a(CameraPosition.a(context, attributeset));
        typedarray.recycle();
        return googlemapoptions;
    }

    int a()
    {
        return a;
    }

    public GoogleMapOptions a(int l)
    {
        d = l;
        return this;
    }

    public GoogleMapOptions a(CameraPosition cameraposition)
    {
        e = cameraposition;
        return this;
    }

    public GoogleMapOptions a(boolean flag)
    {
        b = Boolean.valueOf(flag);
        return this;
    }

    byte b()
    {
        return v.a(b);
    }

    public GoogleMapOptions b(boolean flag)
    {
        c = Boolean.valueOf(flag);
        return this;
    }

    byte c()
    {
        return v.a(c);
    }

    public GoogleMapOptions c(boolean flag)
    {
        f = Boolean.valueOf(flag);
        return this;
    }

    byte d()
    {
        return v.a(f);
    }

    public GoogleMapOptions d(boolean flag)
    {
        g = Boolean.valueOf(flag);
        return this;
    }

    public int describeContents()
    {
        return 0;
    }

    byte e()
    {
        return v.a(g);
    }

    public GoogleMapOptions e(boolean flag)
    {
        h = Boolean.valueOf(flag);
        return this;
    }

    byte f()
    {
        return v.a(h);
    }

    public GoogleMapOptions f(boolean flag)
    {
        i = Boolean.valueOf(flag);
        return this;
    }

    byte g()
    {
        return v.a(i);
    }

    public GoogleMapOptions g(boolean flag)
    {
        j = Boolean.valueOf(flag);
        return this;
    }

    byte h()
    {
        return v.a(j);
    }

    public GoogleMapOptions h(boolean flag)
    {
        k = Boolean.valueOf(flag);
        return this;
    }

    byte i()
    {
        return v.a(k);
    }

    public int j()
    {
        return d;
    }

    public CameraPosition k()
    {
        return e;
    }

    public void writeToParcel(Parcel parcel, int l)
    {
        if (bk.a())
        {
            com.google.android.gms.maps.e.a(this, parcel, l);
            return;
        } else
        {
            com.google.android.gms.maps.b.a(this, parcel, l);
            return;
        }
    }

}
