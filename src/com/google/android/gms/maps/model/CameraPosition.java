// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.e;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dn;
import com.google.android.gms.internal.do;
import com.google.android.gms.maps.a.bk;

// Referenced classes of package com.google.android.gms.maps.model:
//            c, LatLng, b, q

public final class CameraPosition
    implements SafeParcelable
{

    public static final c CREATOR = new c();
    public final LatLng a;
    public final float b;
    public final float c;
    public final float d;
    private final int e;

    CameraPosition(int i, LatLng latlng, float f, float f1, float f2)
    {
        com.google.android.gms.internal.do.a(latlng, "null camera target");
        boolean flag;
        if (0.0F <= f1 && f1 <= 90F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.gms.internal.do.b(flag, "Tilt needs to be between 0 and 90 inclusive");
        e = i;
        a = latlng;
        b = f;
        c = f1 + 0.0F;
        if ((double)f2 <= 0.0D)
        {
            f2 = 360F + f2 % 360F;
        }
        d = f2 % 360F;
    }

    public CameraPosition(LatLng latlng, float f, float f1, float f2)
    {
        this(1, latlng, f, f1, f2);
    }

    public static CameraPosition a(Context context, AttributeSet attributeset)
    {
        if (attributeset == null)
        {
            return null;
        }
        TypedArray typedarray = context.getResources().obtainAttributes(attributeset, e.MapAttrs);
        float f;
        float f1;
        LatLng latlng;
        b b1;
        if (typedarray.hasValue(2))
        {
            f = typedarray.getFloat(2, 0.0F);
        } else
        {
            f = 0.0F;
        }
        if (typedarray.hasValue(3))
        {
            f1 = typedarray.getFloat(3, 0.0F);
        } else
        {
            f1 = 0.0F;
        }
        latlng = new LatLng(f, f1);
        b1 = b();
        b1.a(latlng);
        if (typedarray.hasValue(5))
        {
            b1.a(typedarray.getFloat(5, 0.0F));
        }
        if (typedarray.hasValue(1))
        {
            b1.c(typedarray.getFloat(1, 0.0F));
        }
        if (typedarray.hasValue(4))
        {
            b1.b(typedarray.getFloat(4, 0.0F));
        }
        return b1.a();
    }

    public static b b()
    {
        return new b();
    }

    int a()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof CameraPosition))
            {
                return false;
            }
            CameraPosition cameraposition = (CameraPosition)obj;
            if (!a.equals(cameraposition.a) || Float.floatToIntBits(b) != Float.floatToIntBits(cameraposition.b) || Float.floatToIntBits(c) != Float.floatToIntBits(cameraposition.c) || Float.floatToIntBits(d) != Float.floatToIntBits(cameraposition.d))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        Object aobj[] = new Object[4];
        aobj[0] = a;
        aobj[1] = Float.valueOf(b);
        aobj[2] = Float.valueOf(c);
        aobj[3] = Float.valueOf(d);
        return dl.a(aobj);
    }

    public String toString()
    {
        return dl.a(this).a("target", a).a("zoom", Float.valueOf(b)).a("tilt", Float.valueOf(c)).a("bearing", Float.valueOf(d)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (bk.a())
        {
            q.a(this, parcel, i);
            return;
        } else
        {
            com.google.android.gms.maps.model.c.a(this, parcel, i);
            return;
        }
    }

}
