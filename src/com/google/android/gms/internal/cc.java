// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.a.b.a;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            ae, bl, ab

public final class cc extends ae
    implements SafeParcelable, a
{

    public static final bl CREATOR = new bl();
    private static final HashMap a;
    private boolean A;
    private final Set b;
    private final int c;
    private String d;
    private a e;
    private String f;
    private String g;
    private int h;
    private b i;
    private String j;
    private String k;
    private int l;
    private String m;
    private c n;
    private boolean o;
    private String p;
    private d q;
    private String r;
    private int s;
    private List t;
    private List u;
    private int v;
    private int w;
    private String x;
    private String y;
    private List z;

    public cc()
    {
        c = 2;
        b = new HashSet();
    }

    cc(Set set, int i1, String s1, a a1, String s2, String s3, int j1, 
            b b1, String s4, String s5, int k1, String s6, c c1, boolean flag, 
            String s7, d d1, String s8, int l1, List list, List list1, int i2, 
            int j2, String s9, String s10, List list2, boolean flag1)
    {
        b = set;
        c = i1;
        d = s1;
        e = a1;
        f = s2;
        g = s3;
        h = j1;
        i = b1;
        j = s4;
        k = s5;
        l = k1;
        m = s6;
        n = c1;
        o = flag;
        p = s7;
        q = d1;
        r = s8;
        s = l1;
        t = list;
        u = list1;
        v = i2;
        w = j2;
        x = s9;
        y = s10;
        z = list2;
        A = flag1;
    }

    public static cc a(byte abyte0[])
    {
        Parcel parcel = Parcel.obtain();
        parcel.unmarshall(abyte0, 0, abyte0.length);
        parcel.setDataPosition(0);
        cc cc1 = CREATOR.a(parcel);
        parcel.recycle();
        return cc1;
    }

    public String A()
    {
        return x;
    }

    public String B()
    {
        return y;
    }

    List C()
    {
        return z;
    }

    public boolean D()
    {
        return A;
    }

    public cc E()
    {
        return this;
    }

    public Object a()
    {
        return E();
    }

    protected Object a(String s1)
    {
        return null;
    }

    protected boolean a(ae.a a1)
    {
        return b.contains(Integer.valueOf(a1.g()));
    }

    protected Object b(ae.a a1)
    {
        switch (a1.g())
        {
        case 10: // '\n'
        case 11: // '\013'
        case 13: // '\r'
        case 17: // '\021'
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.g()).toString());

        case 2: // '\002'
            return d;

        case 3: // '\003'
            return e;

        case 4: // '\004'
            return f;

        case 5: // '\005'
            return g;

        case 6: // '\006'
            return Integer.valueOf(h);

        case 7: // '\007'
            return i;

        case 8: // '\b'
            return j;

        case 9: // '\t'
            return k;

        case 12: // '\f'
            return Integer.valueOf(l);

        case 14: // '\016'
            return m;

        case 15: // '\017'
            return n;

        case 16: // '\020'
            return Boolean.valueOf(o);

        case 18: // '\022'
            return p;

        case 19: // '\023'
            return q;

        case 20: // '\024'
            return r;

        case 21: // '\025'
            return Integer.valueOf(s);

        case 22: // '\026'
            return t;

        case 23: // '\027'
            return u;

        case 24: // '\030'
            return Integer.valueOf(v);

        case 25: // '\031'
            return Integer.valueOf(w);

        case 26: // '\032'
            return x;

        case 27: // '\033'
            return y;

        case 28: // '\034'
            return z;

        case 29: // '\035'
            return Boolean.valueOf(A);
        }
    }

    public HashMap b()
    {
        return a;
    }

    protected boolean b(String s1)
    {
        return false;
    }

    public int describeContents()
    {
        bl _tmp = CREATOR;
        return 0;
    }

    Set e()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
label0:
        {
            if (!(obj instanceof cc))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            cc cc1 = (cc)obj;
            ae.a a1;
label1:
            do
            {
                for (Iterator iterator = a.values().iterator(); iterator.hasNext();)
                {
                    a1 = (ae.a)iterator.next();
                    if (!a(a1))
                    {
                        continue label1;
                    }
                    if (cc1.a(a1))
                    {
                        if (!b(a1).equals(cc1.b(a1)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!cc1.a(a1));
            return false;
        }
        return true;
    }

    int f()
    {
        return c;
    }

    public String g()
    {
        return d;
    }

    a h()
    {
        return e;
    }

    public int hashCode()
    {
        Iterator iterator = a.values().iterator();
        int i1 = 0;
        while (iterator.hasNext()) 
        {
            ae.a a1 = (ae.a)iterator.next();
            int j1;
            if (a(a1))
            {
                j1 = i1 + a1.g() + b(a1).hashCode();
            } else
            {
                j1 = i1;
            }
            i1 = j1;
        }
        return i1;
    }

    public String i()
    {
        return f;
    }

    public String j()
    {
        return g;
    }

    public int k()
    {
        return h;
    }

    b l()
    {
        return i;
    }

    public String m()
    {
        return j;
    }

    public String n()
    {
        return k;
    }

    public int o()
    {
        return l;
    }

    public String p()
    {
        return m;
    }

    c q()
    {
        return n;
    }

    public boolean r()
    {
        return o;
    }

    public String s()
    {
        return p;
    }

    d t()
    {
        return q;
    }

    public String u()
    {
        return r;
    }

    public int v()
    {
        return s;
    }

    List w()
    {
        return t;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        bl _tmp = CREATOR;
        com.google.android.gms.internal.bl.a(this, parcel, i1);
    }

    List x()
    {
        return u;
    }

    public int y()
    {
        return v;
    }

    public int z()
    {
        return w;
    }

    static 
    {
        a = new HashMap();
        a.put("aboutMe", ae.a.d("aboutMe", 2));
        a.put("ageRange", com.google.android.gms.internal.ae.a.a("ageRange", 3, com/google/android/gms/internal/cc$a));
        a.put("birthday", ae.a.d("birthday", 4));
        a.put("braggingRights", ae.a.d("braggingRights", 5));
        a.put("circledByCount", com.google.android.gms.internal.ae.a.a("circledByCount", 6));
        a.put("cover", com.google.android.gms.internal.ae.a.a("cover", 7, com/google/android/gms/internal/cc$b));
        a.put("currentLocation", ae.a.d("currentLocation", 8));
        a.put("displayName", ae.a.d("displayName", 9));
        a.put("gender", com.google.android.gms.internal.ae.a.a("gender", 12, (new ab()).a("male", 0).a("female", 1).a("other", 2), false));
        a.put("id", ae.a.d("id", 14));
        a.put("image", com.google.android.gms.internal.ae.a.a("image", 15, com/google/android/gms/internal/cc$c));
        a.put("isPlusUser", ae.a.c("isPlusUser", 16));
        a.put("language", ae.a.d("language", 18));
        a.put("name", com.google.android.gms.internal.ae.a.a("name", 19, com/google/android/gms/internal/cc$d));
        a.put("nickname", ae.a.d("nickname", 20));
        a.put("objectType", com.google.android.gms.internal.ae.a.a("objectType", 21, (new ab()).a("person", 0).a("page", 1), false));
        a.put("organizations", ae.a.b("organizations", 22, com/google/android/gms/internal/cc$f));
        a.put("placesLived", ae.a.b("placesLived", 23, com/google/android/gms/internal/cc$g));
        a.put("plusOneCount", com.google.android.gms.internal.ae.a.a("plusOneCount", 24));
        a.put("relationshipStatus", com.google.android.gms.internal.ae.a.a("relationshipStatus", 25, (new ab()).a("single", 0).a("in_a_relationship", 1).a("engaged", 2).a("married", 3).a("its_complicated", 4).a("open_relationship", 5).a("widowed", 6).a("in_domestic_partnership", 7).a("in_civil_union", 8), false));
        a.put("tagline", ae.a.d("tagline", 26));
        a.put("url", ae.a.d("url", 27));
        a.put("urls", ae.a.b("urls", 28, com/google/android/gms/internal/cc$h));
        a.put("verified", ae.a.c("verified", 29));
    }
}
