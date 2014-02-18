// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            d, b

public final class ab
    implements SafeParcelable, d
{

    public static final b CREATOR = new b();
    private final int a;
    private final HashMap b;
    private final HashMap c;
    private final ArrayList d;

    public ab()
    {
        a = 1;
        b = new HashMap();
        c = new HashMap();
        d = null;
    }

    ab(int i, ArrayList arraylist)
    {
        a = i;
        b = new HashMap();
        c = new HashMap();
        d = null;
        a(arraylist);
    }

    private void a(ArrayList arraylist)
    {
        a a1;
        for (Iterator iterator = arraylist.iterator(); iterator.hasNext(); a(a1.b, a1.c))
        {
            a1 = (a)iterator.next();
        }

    }

    int a()
    {
        return a;
    }

    public ab a(String s, int i)
    {
        b.put(s, Integer.valueOf(i));
        c.put(Integer.valueOf(i), s);
        return this;
    }

    public Object a(Object obj)
    {
        return a((Integer)obj);
    }

    public String a(Integer integer)
    {
        String s = (String)c.get(integer);
        if (s == null && b.containsKey("gms_unknown"))
        {
            s = "gms_unknown";
        }
        return s;
    }

    ArrayList b()
    {
        ArrayList arraylist = new ArrayList();
        String s;
        for (Iterator iterator = b.keySet().iterator(); iterator.hasNext(); arraylist.add(new a(s, ((Integer)b.get(s)).intValue())))
        {
            s = (String)iterator.next();
        }

        return arraylist;
    }

    public int c()
    {
        return 7;
    }

    public int d()
    {
        return 0;
    }

    public int describeContents()
    {
        b _tmp = CREATOR;
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        b _tmp = CREATOR;
        com.google.android.gms.internal.b.a(this, parcel, i);
    }


    private class a
        implements SafeParcelable
    {

        public static final c CREATOR = new c();
        final int a;
        final String b;
        final int c;

        public int describeContents()
        {
            c _tmp = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            c _tmp = CREATOR;
            com.google.android.gms.internal.c.a(this, parcel, i);
        }


        a(int i, String s, int j)
        {
            a = i;
            b = s;
            c = j;
        }

        a(String s, int i)
        {
            a = 1;
            b = s;
            c = i;
        }
    }

}
