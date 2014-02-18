// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            by, dl

public class cq
    implements SafeParcelable
{

    public static final by CREATOR = new by();
    private final int a;
    private final ArrayList b;
    private final ArrayList c;
    private final Bundle d;
    private final boolean e;
    private final int f;

    public cq(int i, ArrayList arraylist, ArrayList arraylist1, Bundle bundle, boolean flag, int j)
    {
        a = i;
        b = arraylist;
        c = arraylist1;
        d = bundle;
        e = flag;
        f = j;
    }

    public ArrayList a()
    {
        return b;
    }

    public ArrayList b()
    {
        return c;
    }

    public Bundle c()
    {
        return d;
    }

    public boolean d()
    {
        return e;
    }

    public int describeContents()
    {
        return 0;
    }

    public int e()
    {
        return f;
    }

    public boolean equals(Object obj)
    {
        cq cq1;
        if (obj instanceof cq)
        {
            if (a == (cq1 = (cq)obj).a && dl.a(b, cq1.b) && dl.a(c, cq1.c) && dl.a(d, cq1.d) && dl.a(Integer.valueOf(f), Integer.valueOf(cq1.f)))
            {
                return true;
            }
        }
        return false;
    }

    public int f()
    {
        return a;
    }

    public int hashCode()
    {
        Object aobj[] = new Object[5];
        aobj[0] = Integer.valueOf(a);
        aobj[1] = b;
        aobj[2] = c;
        aobj[3] = d;
        aobj[4] = Integer.valueOf(f);
        return dl.a(aobj);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        by.a(this, parcel, i);
    }

}
