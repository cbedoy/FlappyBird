// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dn;

// Referenced classes of package com.google.android.gms.plus:
//            l

public class a
    implements SafeParcelable
{

    public static final l CREATOR = new l();
    private final int a;
    private final String b;
    private final String c[];
    private final String d[];
    private final String e[];
    private final String f;
    private final String g;
    private final String h;

    public a(int i, String s, String as[], String as1[], String as2[], String s1, String s2, 
            String s3)
    {
        a = i;
        b = s;
        c = as;
        d = as1;
        e = as2;
        f = s1;
        g = s2;
        h = s3;
    }

    public a(String s, String as[], String as1[], String as2[], String s1, String s2, String s3)
    {
        a = 1;
        b = s;
        c = as;
        d = as1;
        e = as2;
        f = s1;
        g = s2;
        h = s3;
    }

    public int a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public String[] c()
    {
        return c;
    }

    public String[] d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public String[] e()
    {
        return e;
    }

    public boolean equals(Object obj)
    {
        a a1;
        if (obj instanceof a)
        {
            if (a == (a1 = (a)obj).a && dl.a(b, a1.b) && dl.a(c, a1.c) && dl.a(d, a1.d) && dl.a(e, a1.e) && dl.a(f, a1.f) && dl.a(g, a1.g) && dl.a(h, a1.h))
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

    public String h()
    {
        return h;
    }

    public int hashCode()
    {
        Object aobj[] = new Object[8];
        aobj[0] = Integer.valueOf(a);
        aobj[1] = b;
        aobj[2] = c;
        aobj[3] = d;
        aobj[4] = e;
        aobj[5] = f;
        aobj[6] = g;
        aobj[7] = h;
        return dl.a(aobj);
    }

    public String toString()
    {
        return dl.a(this).a("versionCode", Integer.valueOf(a)).a("accountName", b).a("requestedScopes", c).a("visibleActivities", d).a("requiredFeatures", e).a("packageNameForAuth", f).a("callingPackageName", g).a("applicationName", h).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        l.a(this, parcel, i);
    }

}
