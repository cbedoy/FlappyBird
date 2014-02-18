// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            bw, dl

public class co
    implements SafeParcelable
{

    public static final bw CREATOR = new bw();
    private final int a;
    private final String b;
    private final List c;
    private final List d;
    private final Uri e;
    private final String f;
    private final String g;
    private final String h;
    private final Bundle i;
    private final Bundle j;
    private final int k;

    public co(int l, String s, List list, List list1, Uri uri, String s1, String s2, 
            String s3, Bundle bundle, Bundle bundle1, int i1)
    {
        a = l;
        b = s;
        c = list;
        d = list1;
        e = uri;
        f = s1;
        g = s2;
        h = s3;
        i = bundle;
        j = bundle1;
        k = i1;
    }

    public List a()
    {
        return c;
    }

    public List b()
    {
        return d;
    }

    public Uri c()
    {
        return e;
    }

    public String d()
    {
        return f;
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return g;
    }

    public boolean equals(Object obj)
    {
        co co1;
        if (obj instanceof co)
        {
            if (a == (co1 = (co)obj).a && dl.a(c, co1.c) && dl.a(d, co1.d) && dl.a(e, co1.e) && dl.a(f, co1.f) && dl.a(g, co1.g) && dl.a(h, co1.h))
            {
                return true;
            }
        }
        return false;
    }

    public String f()
    {
        return h;
    }

    public String g()
    {
        return b;
    }

    public Bundle h()
    {
        return i;
    }

    public int hashCode()
    {
        Object aobj[] = new Object[7];
        aobj[0] = Integer.valueOf(a);
        aobj[1] = c;
        aobj[2] = d;
        aobj[3] = e;
        aobj[4] = f;
        aobj[5] = g;
        aobj[6] = h;
        return dl.a(aobj);
    }

    public Bundle i()
    {
        return j;
    }

    public int j()
    {
        return k;
    }

    public int k()
    {
        return a;
    }

    public void writeToParcel(Parcel parcel, int l)
    {
        bw.a(this, parcel, l);
    }

}
