// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            ds, dl

public final class x
    implements SafeParcelable
{

    public static final ds CREATOR = new ds();
    private final int a;
    private final int b;
    private final int c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;

    public x(int j, int k, int l, String s, String s1, String s2, String s3)
    {
        a = j;
        b = k;
        c = l;
        d = s;
        e = s1;
        f = s2;
        g = s3;
    }

    public int a()
    {
        return a;
    }

    public int b()
    {
        return b;
    }

    public int c()
    {
        return c;
    }

    public String d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return e;
    }

    public boolean equals(Object obj)
    {
        x x1;
        if (obj instanceof x)
        {
            if (a == (x1 = (x)obj).a && b == x1.b && c == x1.c && dl.a(d, x1.d) && dl.a(e, x1.e))
            {
                return true;
            }
        }
        return false;
    }

    public String f()
    {
        return f;
    }

    public String g()
    {
        return g;
    }

    public boolean h()
    {
        return b == 1 && c == -1;
    }

    public int hashCode()
    {
        Object aobj[] = new Object[5];
        aobj[0] = Integer.valueOf(a);
        aobj[1] = Integer.valueOf(b);
        aobj[2] = Integer.valueOf(c);
        aobj[3] = d;
        aobj[4] = e;
        return dl.a(aobj);
    }

    public boolean i()
    {
        return b == 2;
    }

    public String toString()
    {
        if (i())
        {
            Object aobj2[] = new Object[2];
            aobj2[0] = e();
            aobj2[1] = f();
            return String.format("Person [%s] %s", aobj2);
        }
        if (h())
        {
            Object aobj1[] = new Object[2];
            aobj1[0] = d();
            aobj1[1] = f();
            return String.format("Circle [%s] %s", aobj1);
        } else
        {
            Object aobj[] = new Object[2];
            aobj[0] = d();
            aobj[1] = f();
            return String.format("Group [%s] %s", aobj);
        }
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        ds.a(this, parcel, j);
    }

}
