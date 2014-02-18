// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            ap

public class bi
    implements SafeParcelable
{

    public static final ap CREATOR = new ap();
    private final int a;
    private final String b;
    private final long c;
    private final short d;
    private final double e;
    private final double f;
    private final float g;
    private final int h;

    public bi(int i, String s, int j, short word0, double d1, double d2, float f1, long l)
    {
        a(s);
        a(f1);
        a(d1, d2);
        int k = a(j);
        a = i;
        d = word0;
        b = s;
        e = d1;
        f = d2;
        g = f1;
        c = l;
        h = k;
    }

    private static int a(int i)
    {
        int j = i & 3;
        if (j == 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("No supported transition specified: ").append(i).toString());
        } else
        {
            return j;
        }
    }

    private static void a(double d1, double d2)
    {
        if (d1 > 90D || d1 < -90D)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid latitude: ").append(d1).toString());
        }
        if (d2 > 180D || d2 < -180D)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid longitude: ").append(d2).toString());
        } else
        {
            return;
        }
    }

    private static void a(float f1)
    {
        if (f1 <= 0.0F)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid radius: ").append(f1).toString());
        } else
        {
            return;
        }
    }

    private static void a(String s)
    {
        if (s == null || s.length() > 100)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("requestId is null or too long: ").append(s).toString());
        } else
        {
            return;
        }
    }

    private static String b(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
            return "CIRCLE";
        }
    }

    public int a()
    {
        return a;
    }

    public short b()
    {
        return d;
    }

    public double c()
    {
        return e;
    }

    public double d()
    {
        return f;
    }

    public int describeContents()
    {
        ap _tmp = CREATOR;
        return 0;
    }

    public float e()
    {
        return g;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (!(obj instanceof bi))
            {
                return false;
            }
            bi bi1 = (bi)obj;
            if (g != bi1.g)
            {
                return false;
            }
            if (e != bi1.e)
            {
                return false;
            }
            if (f != bi1.f)
            {
                return false;
            }
            if (d != bi1.d)
            {
                return false;
            }
        }
        return true;
    }

    public String f()
    {
        return b;
    }

    public long g()
    {
        return c;
    }

    public int h()
    {
        return h;
    }

    public int hashCode()
    {
        long l = Double.doubleToLongBits(e);
        int i = 31 + (int)(l ^ l >>> 32);
        long l1 = Double.doubleToLongBits(f);
        return 31 * (31 * (31 * (i * 31 + (int)(l1 ^ l1 >>> 32)) + Float.floatToIntBits(g)) + d) + h;
    }

    public String toString()
    {
        Object aobj[] = new Object[7];
        aobj[0] = b(d);
        aobj[1] = b;
        aobj[2] = Integer.valueOf(h);
        aobj[3] = Double.valueOf(e);
        aobj[4] = Double.valueOf(f);
        aobj[5] = Float.valueOf(g);
        aobj[6] = Long.valueOf(c);
        return String.format("Geofence[%s id:%s transitions:%d %.6f, %.6f %.0fm, @%d]", aobj);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ap _tmp = CREATOR;
        ap.a(this, parcel, i);
    }

}
