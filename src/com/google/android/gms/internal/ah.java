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
//            g, do

public class ah
    implements SafeParcelable
{

    public static final g CREATOR = new g();
    private final int a;
    private final HashMap b;
    private final ArrayList c = null;
    private final String d;

    ah(int i, ArrayList arraylist, String s)
    {
        a = i;
        b = a(arraylist);
        d = (String)com.google.android.gms.internal.do.a(s);
        a();
    }

    private static HashMap a(ArrayList arraylist)
    {
        HashMap hashmap = new HashMap();
        int i = arraylist.size();
        for (int j = 0; j < i; j++)
        {
            a a1 = (a)arraylist.get(j);
            hashmap.put(a1.b, a1.a());
        }

        return hashmap;
    }

    public HashMap a(String s)
    {
        return (HashMap)b.get(s);
    }

    public void a()
    {
        for (Iterator iterator = b.keySet().iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            HashMap hashmap = (HashMap)b.get(s);
            Iterator iterator1 = hashmap.keySet().iterator();
            while (iterator1.hasNext()) 
            {
                ((ae.a)hashmap.get((String)iterator1.next())).a(this);
            }
        }

    }

    int b()
    {
        return a;
    }

    ArrayList c()
    {
        ArrayList arraylist = new ArrayList();
        String s;
        for (Iterator iterator = b.keySet().iterator(); iterator.hasNext(); arraylist.add(new a(s, (HashMap)b.get(s))))
        {
            s = (String)iterator.next();
        }

        return arraylist;
    }

    public String d()
    {
        return d;
    }

    public int describeContents()
    {
        g _tmp = CREATOR;
        return 0;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (Iterator iterator = b.keySet().iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            stringbuilder.append(s).append(":\n");
            HashMap hashmap = (HashMap)b.get(s);
            Iterator iterator1 = hashmap.keySet().iterator();
            while (iterator1.hasNext()) 
            {
                String s1 = (String)iterator1.next();
                stringbuilder.append("  ").append(s1).append(": ");
                stringbuilder.append(hashmap.get(s1));
            }
        }

        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        g _tmp = CREATOR;
        g.a(this, parcel, i);
    }


    private class a
        implements SafeParcelable
    {

        public static final h CREATOR = new h();
        final int a;
        final String b;
        final ArrayList c;

        private static ArrayList a(HashMap hashmap)
        {
            if (hashmap == null)
            {
                return null;
            }
            ArrayList arraylist = new ArrayList();
            String s;
            for (Iterator iterator = hashmap.keySet().iterator(); iterator.hasNext(); arraylist.add(new b(s, (ae.a)hashmap.get(s))))
            {
                s = (String)iterator.next();
            }

            return arraylist;
        }

        HashMap a()
        {
            HashMap hashmap = new HashMap();
            int i = c.size();
            for (int j = 0; j < i; j++)
            {
                b b1 = (b)c.get(j);
                hashmap.put(b1.b, b1.c);
            }

            return hashmap;
        }

        public int describeContents()
        {
            h _tmp = CREATOR;
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            h _tmp = CREATOR;
            h.a(this, parcel, i);
        }


        a(int i, String s, ArrayList arraylist)
        {
            a = i;
            b = s;
            c = arraylist;
        }

        a(String s, HashMap hashmap)
        {
            a = 1;
            b = s;
            c = a(hashmap);
        }

        private class b
            implements SafeParcelable
        {

            public static final f CREATOR = new f();
            final int a;
            final String b;
            final ae.a c;

            public int describeContents()
            {
                f _tmp = CREATOR;
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i)
            {
                f _tmp = CREATOR;
                f.a(this, parcel, i);
            }


            b(int i, String s, ae.a a1)
            {
                a = i;
                b = s;
                c = a1;
            }

            b(String s, ae.a a1)
            {
                a = 1;
                b = s;
                c = a1;
            }
        }

    }

}
