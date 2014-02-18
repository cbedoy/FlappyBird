// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            cc

public class bl
    implements android.os.Parcelable.Creator
{

    public bl()
    {
    }

    static void a(cc cc1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        Set set = cc1.e();
        if (set.contains(Integer.valueOf(1)))
        {
            c.a(parcel, 1, cc1.f());
        }
        if (set.contains(Integer.valueOf(2)))
        {
            c.a(parcel, 2, cc1.g(), true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            c.a(parcel, 3, cc1.h(), i, true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            c.a(parcel, 4, cc1.i(), true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            c.a(parcel, 5, cc1.j(), true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            c.a(parcel, 6, cc1.k());
        }
        if (set.contains(Integer.valueOf(7)))
        {
            c.a(parcel, 7, cc1.l(), i, true);
        }
        if (set.contains(Integer.valueOf(8)))
        {
            c.a(parcel, 8, cc1.m(), true);
        }
        if (set.contains(Integer.valueOf(9)))
        {
            c.a(parcel, 9, cc1.n(), true);
        }
        if (set.contains(Integer.valueOf(12)))
        {
            c.a(parcel, 12, cc1.o());
        }
        if (set.contains(Integer.valueOf(14)))
        {
            c.a(parcel, 14, cc1.p(), true);
        }
        if (set.contains(Integer.valueOf(15)))
        {
            c.a(parcel, 15, cc1.q(), i, true);
        }
        if (set.contains(Integer.valueOf(16)))
        {
            c.a(parcel, 16, cc1.r());
        }
        if (set.contains(Integer.valueOf(19)))
        {
            c.a(parcel, 19, cc1.t(), i, true);
        }
        if (set.contains(Integer.valueOf(18)))
        {
            c.a(parcel, 18, cc1.s(), true);
        }
        if (set.contains(Integer.valueOf(21)))
        {
            c.a(parcel, 21, cc1.v());
        }
        if (set.contains(Integer.valueOf(20)))
        {
            c.a(parcel, 20, cc1.u(), true);
        }
        if (set.contains(Integer.valueOf(23)))
        {
            c.b(parcel, 23, cc1.x(), true);
        }
        if (set.contains(Integer.valueOf(22)))
        {
            c.b(parcel, 22, cc1.w(), true);
        }
        if (set.contains(Integer.valueOf(25)))
        {
            c.a(parcel, 25, cc1.z());
        }
        if (set.contains(Integer.valueOf(24)))
        {
            c.a(parcel, 24, cc1.y());
        }
        if (set.contains(Integer.valueOf(27)))
        {
            c.a(parcel, 27, cc1.B(), true);
        }
        if (set.contains(Integer.valueOf(26)))
        {
            c.a(parcel, 26, cc1.A(), true);
        }
        if (set.contains(Integer.valueOf(29)))
        {
            c.a(parcel, 29, cc1.D());
        }
        if (set.contains(Integer.valueOf(28)))
        {
            c.b(parcel, 28, cc1.C(), true);
        }
        c.a(parcel, j);
    }

    public cc a(Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        HashSet hashset = new HashSet();
        int j = 0;
        String s = null;
        cc.a a1 = null;
        String s1 = null;
        String s2 = null;
        int k = 0;
        cc.b b1 = null;
        String s3 = null;
        String s4 = null;
        int l = 0;
        String s5 = null;
        cc.c c1 = null;
        boolean flag = false;
        String s6 = null;
        cc.d d = null;
        String s7 = null;
        int i1 = 0;
        java.util.ArrayList arraylist = null;
        java.util.ArrayList arraylist1 = null;
        int j1 = 0;
        int k1 = 0;
        String s8 = null;
        String s9 = null;
        java.util.ArrayList arraylist2 = null;
        boolean flag1 = false;
        do
        {
            if (parcel.dataPosition() < i)
            {
                int l1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(l1))
                {
                case 10: // '\n'
                case 11: // '\013'
                case 13: // '\r'
                case 17: // '\021'
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l1);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l1);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l1);
                    hashset.add(Integer.valueOf(2));
                    break;

                case 3: // '\003'
                    cc.a a2 = (cc.a)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l1, cc.a.CREATOR);
                    hashset.add(Integer.valueOf(3));
                    a1 = a2;
                    break;

                case 4: // '\004'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l1);
                    hashset.add(Integer.valueOf(4));
                    break;

                case 5: // '\005'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l1);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l1);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    cc.b b2 = (cc.b)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l1, cc.b.CREATOR);
                    hashset.add(Integer.valueOf(7));
                    b1 = b2;
                    break;

                case 8: // '\b'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l1);
                    hashset.add(Integer.valueOf(8));
                    break;

                case 9: // '\t'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l1);
                    hashset.add(Integer.valueOf(9));
                    break;

                case 12: // '\f'
                    l = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l1);
                    hashset.add(Integer.valueOf(12));
                    break;

                case 14: // '\016'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l1);
                    hashset.add(Integer.valueOf(14));
                    break;

                case 15: // '\017'
                    cc.c c2 = (cc.c)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l1, cc.c.CREATOR);
                    hashset.add(Integer.valueOf(15));
                    c1 = c2;
                    break;

                case 16: // '\020'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l1);
                    hashset.add(Integer.valueOf(16));
                    break;

                case 19: // '\023'
                    cc.d d1 = (cc.d)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l1, cc.d.CREATOR);
                    hashset.add(Integer.valueOf(19));
                    d = d1;
                    break;

                case 18: // '\022'
                    s6 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l1);
                    hashset.add(Integer.valueOf(18));
                    break;

                case 21: // '\025'
                    i1 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l1);
                    hashset.add(Integer.valueOf(21));
                    break;

                case 20: // '\024'
                    s7 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l1);
                    hashset.add(Integer.valueOf(20));
                    break;

                case 23: // '\027'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l1, cc.g.CREATOR);
                    hashset.add(Integer.valueOf(23));
                    break;

                case 22: // '\026'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l1, cc.f.CREATOR);
                    hashset.add(Integer.valueOf(22));
                    break;

                case 25: // '\031'
                    k1 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l1);
                    hashset.add(Integer.valueOf(25));
                    break;

                case 24: // '\030'
                    j1 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l1);
                    hashset.add(Integer.valueOf(24));
                    break;

                case 27: // '\033'
                    s9 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l1);
                    hashset.add(Integer.valueOf(27));
                    break;

                case 26: // '\032'
                    s8 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l1);
                    hashset.add(Integer.valueOf(26));
                    break;

                case 29: // '\035'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l1);
                    hashset.add(Integer.valueOf(29));
                    break;

                case 28: // '\034'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l1, cc.h.CREATOR);
                    hashset.add(Integer.valueOf(28));
                    break;
                }
            } else
            if (parcel.dataPosition() != i)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
            } else
            {
                return new cc(hashset, j, s, a1, s1, s2, k, b1, s3, s4, l, s5, c1, flag, s6, d, s7, i1, arraylist, arraylist1, j1, k1, s8, s9, arraylist2, flag1);
            }
        } while (true);
    }

    public cc[] a(int i)
    {
        return new cc[i];
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return a(i);
    }
}
