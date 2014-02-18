// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.a.a.a;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            ae, bh

public final class bx extends ae
    implements SafeParcelable, a
{

    public static final bh CREATOR = new bh();
    private static final HashMap a;
    private String A;
    private String B;
    private String C;
    private String D;
    private bx E;
    private String F;
    private String G;
    private String H;
    private String I;
    private bx J;
    private double K;
    private bx L;
    private double M;
    private String N;
    private bx O;
    private List P;
    private String Q;
    private String R;
    private String S;
    private String T;
    private bx U;
    private String V;
    private String W;
    private String X;
    private bx Y;
    private String Z;
    private String aa;
    private String ab;
    private String ac;
    private String ad;
    private String ae;
    private final Set b;
    private final int c;
    private bx d;
    private List e;
    private bx f;
    private String g;
    private String h;
    private String i;
    private List j;
    private int k;
    private List l;
    private bx m;
    private List n;
    private String o;
    private String p;
    private bx q;
    private String r;
    private String s;
    private String t;
    private List u;
    private String v;
    private String w;
    private String x;
    private String y;
    private String z;

    public bx()
    {
        c = 1;
        b = new HashSet();
    }

    bx(Set set, int i1, bx bx1, List list, bx bx2, String s1, String s2, 
            String s3, List list1, int j1, List list2, bx bx3, List list3, String s4, 
            String s5, bx bx4, String s6, String s7, String s8, List list4, String s9, 
            String s10, String s11, String s12, String s13, String s14, String s15, String s16, 
            String s17, bx bx5, String s18, String s19, String s20, String s21, bx bx6, 
            double d1, bx bx7, double d2, String s22, bx bx8, 
            List list5, String s23, String s24, String s25, String s26, bx bx9, String s27, 
            String s28, String s29, bx bx10, String s30, String s31, String s32, String s33, 
            String s34, String s35)
    {
        b = set;
        c = i1;
        d = bx1;
        e = list;
        f = bx2;
        g = s1;
        h = s2;
        i = s3;
        j = list1;
        k = j1;
        l = list2;
        m = bx3;
        n = list3;
        o = s4;
        p = s5;
        q = bx4;
        r = s6;
        s = s7;
        t = s8;
        u = list4;
        v = s9;
        w = s10;
        x = s11;
        y = s12;
        z = s13;
        A = s14;
        B = s15;
        C = s16;
        D = s17;
        E = bx5;
        F = s18;
        G = s19;
        H = s20;
        I = s21;
        J = bx6;
        K = d1;
        L = bx7;
        M = d2;
        N = s22;
        O = bx8;
        P = list5;
        Q = s23;
        R = s24;
        S = s25;
        T = s26;
        U = bx9;
        V = s27;
        W = s28;
        X = s29;
        Y = bx10;
        Z = s30;
        aa = s31;
        ab = s32;
        ac = s33;
        ad = s34;
        ae = s35;
    }

    public String A()
    {
        return x;
    }

    public String B()
    {
        return y;
    }

    public String C()
    {
        return z;
    }

    public String D()
    {
        return A;
    }

    public String E()
    {
        return B;
    }

    public String F()
    {
        return C;
    }

    public String G()
    {
        return D;
    }

    bx H()
    {
        return E;
    }

    public String I()
    {
        return F;
    }

    public String J()
    {
        return G;
    }

    public String K()
    {
        return H;
    }

    public String L()
    {
        return I;
    }

    bx M()
    {
        return J;
    }

    public double N()
    {
        return K;
    }

    bx O()
    {
        return L;
    }

    public double P()
    {
        return M;
    }

    public String Q()
    {
        return N;
    }

    bx R()
    {
        return O;
    }

    List S()
    {
        return P;
    }

    public String T()
    {
        return Q;
    }

    public String U()
    {
        return R;
    }

    public String V()
    {
        return S;
    }

    public String W()
    {
        return T;
    }

    bx X()
    {
        return U;
    }

    public String Y()
    {
        return V;
    }

    public String Z()
    {
        return W;
    }

    public Object a()
    {
        return ai();
    }

    protected Object a(String s1)
    {
        return null;
    }

    protected boolean a(ae.a a1)
    {
        return b.contains(Integer.valueOf(a1.g()));
    }

    public String aa()
    {
        return X;
    }

    bx ab()
    {
        return Y;
    }

    public String ac()
    {
        return Z;
    }

    public String ad()
    {
        return aa;
    }

    public String ae()
    {
        return ab;
    }

    public String af()
    {
        return ac;
    }

    public String ag()
    {
        return ad;
    }

    public String ah()
    {
        return ae;
    }

    public bx ai()
    {
        return this;
    }

    protected Object b(ae.a a1)
    {
        switch (a1.g())
        {
        case 35: // '#'
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
            return h;

        case 7: // '\007'
            return i;

        case 8: // '\b'
            return j;

        case 9: // '\t'
            return Integer.valueOf(k);

        case 10: // '\n'
            return l;

        case 11: // '\013'
            return m;

        case 12: // '\f'
            return n;

        case 13: // '\r'
            return o;

        case 14: // '\016'
            return p;

        case 15: // '\017'
            return q;

        case 16: // '\020'
            return r;

        case 17: // '\021'
            return s;

        case 18: // '\022'
            return t;

        case 19: // '\023'
            return u;

        case 20: // '\024'
            return v;

        case 21: // '\025'
            return w;

        case 22: // '\026'
            return x;

        case 23: // '\027'
            return y;

        case 24: // '\030'
            return z;

        case 25: // '\031'
            return A;

        case 26: // '\032'
            return B;

        case 27: // '\033'
            return C;

        case 28: // '\034'
            return D;

        case 29: // '\035'
            return E;

        case 30: // '\036'
            return F;

        case 31: // '\037'
            return G;

        case 32: // ' '
            return H;

        case 33: // '!'
            return I;

        case 34: // '"'
            return J;

        case 36: // '$'
            return Double.valueOf(K);

        case 37: // '%'
            return L;

        case 38: // '&'
            return Double.valueOf(M);

        case 39: // '\''
            return N;

        case 40: // '('
            return O;

        case 41: // ')'
            return P;

        case 42: // '*'
            return Q;

        case 43: // '+'
            return R;

        case 44: // ','
            return S;

        case 45: // '-'
            return T;

        case 46: // '.'
            return U;

        case 47: // '/'
            return V;

        case 48: // '0'
            return W;

        case 49: // '1'
            return X;

        case 50: // '2'
            return Y;

        case 51: // '3'
            return Z;

        case 52: // '4'
            return aa;

        case 53: // '5'
            return ab;

        case 54: // '6'
            return ac;

        case 55: // '7'
            return ad;

        case 56: // '8'
            return ae;
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
        bh _tmp = CREATOR;
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
            if (!(obj instanceof bx))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            bx bx1 = (bx)obj;
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
                    if (bx1.a(a1))
                    {
                        if (!b(a1).equals(bx1.b(a1)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!bx1.a(a1));
            return false;
        }
        return true;
    }

    int f()
    {
        return c;
    }

    bx g()
    {
        return d;
    }

    public List h()
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

    bx i()
    {
        return f;
    }

    public String j()
    {
        return g;
    }

    public String k()
    {
        return h;
    }

    public String l()
    {
        return i;
    }

    List m()
    {
        return j;
    }

    public int n()
    {
        return k;
    }

    List o()
    {
        return l;
    }

    bx p()
    {
        return m;
    }

    List q()
    {
        return n;
    }

    public String r()
    {
        return o;
    }

    public String s()
    {
        return p;
    }

    bx t()
    {
        return q;
    }

    public String u()
    {
        return r;
    }

    public String v()
    {
        return s;
    }

    public String w()
    {
        return t;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        bh _tmp = CREATOR;
        com.google.android.gms.internal.bh.a(this, parcel, i1);
    }

    List x()
    {
        return u;
    }

    public String y()
    {
        return v;
    }

    public String z()
    {
        return w;
    }

    static 
    {
        a = new HashMap();
        a.put("about", com.google.android.gms.internal.ae.a.a("about", 2, com/google/android/gms/internal/bx));
        a.put("additionalName", com.google.android.gms.internal.ae.a.e("additionalName", 3));
        a.put("address", com.google.android.gms.internal.ae.a.a("address", 4, com/google/android/gms/internal/bx));
        a.put("addressCountry", com.google.android.gms.internal.ae.a.d("addressCountry", 5));
        a.put("addressLocality", com.google.android.gms.internal.ae.a.d("addressLocality", 6));
        a.put("addressRegion", com.google.android.gms.internal.ae.a.d("addressRegion", 7));
        a.put("associated_media", com.google.android.gms.internal.ae.a.b("associated_media", 8, com/google/android/gms/internal/bx));
        a.put("attendeeCount", com.google.android.gms.internal.ae.a.a("attendeeCount", 9));
        a.put("attendees", com.google.android.gms.internal.ae.a.b("attendees", 10, com/google/android/gms/internal/bx));
        a.put("audio", com.google.android.gms.internal.ae.a.a("audio", 11, com/google/android/gms/internal/bx));
        a.put("author", com.google.android.gms.internal.ae.a.b("author", 12, com/google/android/gms/internal/bx));
        a.put("bestRating", com.google.android.gms.internal.ae.a.d("bestRating", 13));
        a.put("birthDate", com.google.android.gms.internal.ae.a.d("birthDate", 14));
        a.put("byArtist", com.google.android.gms.internal.ae.a.a("byArtist", 15, com/google/android/gms/internal/bx));
        a.put("caption", com.google.android.gms.internal.ae.a.d("caption", 16));
        a.put("contentSize", com.google.android.gms.internal.ae.a.d("contentSize", 17));
        a.put("contentUrl", com.google.android.gms.internal.ae.a.d("contentUrl", 18));
        a.put("contributor", com.google.android.gms.internal.ae.a.b("contributor", 19, com/google/android/gms/internal/bx));
        a.put("dateCreated", com.google.android.gms.internal.ae.a.d("dateCreated", 20));
        a.put("dateModified", com.google.android.gms.internal.ae.a.d("dateModified", 21));
        a.put("datePublished", com.google.android.gms.internal.ae.a.d("datePublished", 22));
        a.put("description", com.google.android.gms.internal.ae.a.d("description", 23));
        a.put("duration", com.google.android.gms.internal.ae.a.d("duration", 24));
        a.put("embedUrl", com.google.android.gms.internal.ae.a.d("embedUrl", 25));
        a.put("endDate", com.google.android.gms.internal.ae.a.d("endDate", 26));
        a.put("familyName", com.google.android.gms.internal.ae.a.d("familyName", 27));
        a.put("gender", com.google.android.gms.internal.ae.a.d("gender", 28));
        a.put("geo", com.google.android.gms.internal.ae.a.a("geo", 29, com/google/android/gms/internal/bx));
        a.put("givenName", com.google.android.gms.internal.ae.a.d("givenName", 30));
        a.put("height", com.google.android.gms.internal.ae.a.d("height", 31));
        a.put("id", com.google.android.gms.internal.ae.a.d("id", 32));
        a.put("image", com.google.android.gms.internal.ae.a.d("image", 33));
        a.put("inAlbum", com.google.android.gms.internal.ae.a.a("inAlbum", 34, com/google/android/gms/internal/bx));
        a.put("latitude", com.google.android.gms.internal.ae.a.b("latitude", 36));
        a.put("location", com.google.android.gms.internal.ae.a.a("location", 37, com/google/android/gms/internal/bx));
        a.put("longitude", com.google.android.gms.internal.ae.a.b("longitude", 38));
        a.put("name", com.google.android.gms.internal.ae.a.d("name", 39));
        a.put("partOfTVSeries", com.google.android.gms.internal.ae.a.a("partOfTVSeries", 40, com/google/android/gms/internal/bx));
        a.put("performers", com.google.android.gms.internal.ae.a.b("performers", 41, com/google/android/gms/internal/bx));
        a.put("playerType", com.google.android.gms.internal.ae.a.d("playerType", 42));
        a.put("postOfficeBoxNumber", com.google.android.gms.internal.ae.a.d("postOfficeBoxNumber", 43));
        a.put("postalCode", com.google.android.gms.internal.ae.a.d("postalCode", 44));
        a.put("ratingValue", com.google.android.gms.internal.ae.a.d("ratingValue", 45));
        a.put("reviewRating", com.google.android.gms.internal.ae.a.a("reviewRating", 46, com/google/android/gms/internal/bx));
        a.put("startDate", com.google.android.gms.internal.ae.a.d("startDate", 47));
        a.put("streetAddress", com.google.android.gms.internal.ae.a.d("streetAddress", 48));
        a.put("text", com.google.android.gms.internal.ae.a.d("text", 49));
        a.put("thumbnail", com.google.android.gms.internal.ae.a.a("thumbnail", 50, com/google/android/gms/internal/bx));
        a.put("thumbnailUrl", com.google.android.gms.internal.ae.a.d("thumbnailUrl", 51));
        a.put("tickerSymbol", com.google.android.gms.internal.ae.a.d("tickerSymbol", 52));
        a.put("type", com.google.android.gms.internal.ae.a.d("type", 53));
        a.put("url", com.google.android.gms.internal.ae.a.d("url", 54));
        a.put("width", com.google.android.gms.internal.ae.a.d("width", 55));
        a.put("worstRating", com.google.android.gms.internal.ae.a.d("worstRating", 56));
    }
}
