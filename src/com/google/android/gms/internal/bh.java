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
//            bx

public class bh
    implements android.os.Parcelable.Creator
{

    public bh()
    {
    }

    static void a(bx bx1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        Set set = bx1.e();
        if (set.contains(Integer.valueOf(1)))
        {
            c.a(parcel, 1, bx1.f());
        }
        if (set.contains(Integer.valueOf(2)))
        {
            c.a(parcel, 2, bx1.g(), i, true);
        }
        if (set.contains(Integer.valueOf(3)))
        {
            c.a(parcel, 3, bx1.h(), true);
        }
        if (set.contains(Integer.valueOf(4)))
        {
            c.a(parcel, 4, bx1.i(), i, true);
        }
        if (set.contains(Integer.valueOf(5)))
        {
            c.a(parcel, 5, bx1.j(), true);
        }
        if (set.contains(Integer.valueOf(6)))
        {
            c.a(parcel, 6, bx1.k(), true);
        }
        if (set.contains(Integer.valueOf(7)))
        {
            c.a(parcel, 7, bx1.l(), true);
        }
        if (set.contains(Integer.valueOf(8)))
        {
            c.b(parcel, 8, bx1.m(), true);
        }
        if (set.contains(Integer.valueOf(9)))
        {
            c.a(parcel, 9, bx1.n());
        }
        if (set.contains(Integer.valueOf(10)))
        {
            c.b(parcel, 10, bx1.o(), true);
        }
        if (set.contains(Integer.valueOf(11)))
        {
            c.a(parcel, 11, bx1.p(), i, true);
        }
        if (set.contains(Integer.valueOf(12)))
        {
            c.b(parcel, 12, bx1.q(), true);
        }
        if (set.contains(Integer.valueOf(13)))
        {
            c.a(parcel, 13, bx1.r(), true);
        }
        if (set.contains(Integer.valueOf(14)))
        {
            c.a(parcel, 14, bx1.s(), true);
        }
        if (set.contains(Integer.valueOf(15)))
        {
            c.a(parcel, 15, bx1.t(), i, true);
        }
        if (set.contains(Integer.valueOf(17)))
        {
            c.a(parcel, 17, bx1.v(), true);
        }
        if (set.contains(Integer.valueOf(16)))
        {
            c.a(parcel, 16, bx1.u(), true);
        }
        if (set.contains(Integer.valueOf(19)))
        {
            c.b(parcel, 19, bx1.x(), true);
        }
        if (set.contains(Integer.valueOf(18)))
        {
            c.a(parcel, 18, bx1.w(), true);
        }
        if (set.contains(Integer.valueOf(21)))
        {
            c.a(parcel, 21, bx1.z(), true);
        }
        if (set.contains(Integer.valueOf(20)))
        {
            c.a(parcel, 20, bx1.y(), true);
        }
        if (set.contains(Integer.valueOf(23)))
        {
            c.a(parcel, 23, bx1.B(), true);
        }
        if (set.contains(Integer.valueOf(22)))
        {
            c.a(parcel, 22, bx1.A(), true);
        }
        if (set.contains(Integer.valueOf(25)))
        {
            c.a(parcel, 25, bx1.D(), true);
        }
        if (set.contains(Integer.valueOf(24)))
        {
            c.a(parcel, 24, bx1.C(), true);
        }
        if (set.contains(Integer.valueOf(27)))
        {
            c.a(parcel, 27, bx1.F(), true);
        }
        if (set.contains(Integer.valueOf(26)))
        {
            c.a(parcel, 26, bx1.E(), true);
        }
        if (set.contains(Integer.valueOf(29)))
        {
            c.a(parcel, 29, bx1.H(), i, true);
        }
        if (set.contains(Integer.valueOf(28)))
        {
            c.a(parcel, 28, bx1.G(), true);
        }
        if (set.contains(Integer.valueOf(31)))
        {
            c.a(parcel, 31, bx1.J(), true);
        }
        if (set.contains(Integer.valueOf(30)))
        {
            c.a(parcel, 30, bx1.I(), true);
        }
        if (set.contains(Integer.valueOf(34)))
        {
            c.a(parcel, 34, bx1.M(), i, true);
        }
        if (set.contains(Integer.valueOf(32)))
        {
            c.a(parcel, 32, bx1.K(), true);
        }
        if (set.contains(Integer.valueOf(33)))
        {
            c.a(parcel, 33, bx1.L(), true);
        }
        if (set.contains(Integer.valueOf(38)))
        {
            c.a(parcel, 38, bx1.P());
        }
        if (set.contains(Integer.valueOf(39)))
        {
            c.a(parcel, 39, bx1.Q(), true);
        }
        if (set.contains(Integer.valueOf(36)))
        {
            c.a(parcel, 36, bx1.N());
        }
        if (set.contains(Integer.valueOf(37)))
        {
            c.a(parcel, 37, bx1.O(), i, true);
        }
        if (set.contains(Integer.valueOf(42)))
        {
            c.a(parcel, 42, bx1.T(), true);
        }
        if (set.contains(Integer.valueOf(43)))
        {
            c.a(parcel, 43, bx1.U(), true);
        }
        if (set.contains(Integer.valueOf(40)))
        {
            c.a(parcel, 40, bx1.R(), i, true);
        }
        if (set.contains(Integer.valueOf(41)))
        {
            c.b(parcel, 41, bx1.S(), true);
        }
        if (set.contains(Integer.valueOf(46)))
        {
            c.a(parcel, 46, bx1.X(), i, true);
        }
        if (set.contains(Integer.valueOf(47)))
        {
            c.a(parcel, 47, bx1.Y(), true);
        }
        if (set.contains(Integer.valueOf(44)))
        {
            c.a(parcel, 44, bx1.V(), true);
        }
        if (set.contains(Integer.valueOf(45)))
        {
            c.a(parcel, 45, bx1.W(), true);
        }
        if (set.contains(Integer.valueOf(51)))
        {
            c.a(parcel, 51, bx1.ac(), true);
        }
        if (set.contains(Integer.valueOf(50)))
        {
            c.a(parcel, 50, bx1.ab(), i, true);
        }
        if (set.contains(Integer.valueOf(49)))
        {
            c.a(parcel, 49, bx1.aa(), true);
        }
        if (set.contains(Integer.valueOf(48)))
        {
            c.a(parcel, 48, bx1.Z(), true);
        }
        if (set.contains(Integer.valueOf(55)))
        {
            c.a(parcel, 55, bx1.ag(), true);
        }
        if (set.contains(Integer.valueOf(54)))
        {
            c.a(parcel, 54, bx1.af(), true);
        }
        if (set.contains(Integer.valueOf(53)))
        {
            c.a(parcel, 53, bx1.ae(), true);
        }
        if (set.contains(Integer.valueOf(52)))
        {
            c.a(parcel, 52, bx1.ad(), true);
        }
        if (set.contains(Integer.valueOf(56)))
        {
            c.a(parcel, 56, bx1.ah(), true);
        }
        c.a(parcel, j);
    }

    public bx a(Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        HashSet hashset = new HashSet();
        int j = 0;
        bx bx1 = null;
        java.util.ArrayList arraylist = null;
        bx bx2 = null;
        String s = null;
        String s1 = null;
        String s2 = null;
        java.util.ArrayList arraylist1 = null;
        int k = 0;
        java.util.ArrayList arraylist2 = null;
        bx bx3 = null;
        java.util.ArrayList arraylist3 = null;
        String s3 = null;
        String s4 = null;
        bx bx4 = null;
        String s5 = null;
        String s6 = null;
        String s7 = null;
        java.util.ArrayList arraylist4 = null;
        String s8 = null;
        String s9 = null;
        String s10 = null;
        String s11 = null;
        String s12 = null;
        String s13 = null;
        String s14 = null;
        String s15 = null;
        String s16 = null;
        bx bx5 = null;
        String s17 = null;
        String s18 = null;
        String s19 = null;
        String s20 = null;
        bx bx6 = null;
        double d = 0.0D;
        bx bx7 = null;
        double d1 = 0.0D;
        String s21 = null;
        bx bx8 = null;
        java.util.ArrayList arraylist5 = null;
        String s22 = null;
        String s23 = null;
        String s24 = null;
        String s25 = null;
        bx bx9 = null;
        String s26 = null;
        String s27 = null;
        String s28 = null;
        bx bx10 = null;
        String s29 = null;
        String s30 = null;
        String s31 = null;
        String s32 = null;
        String s33 = null;
        String s34 = null;
        do
        {
            if (parcel.dataPosition() < i)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(l))
                {
                case 35: // '#'
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    hashset.add(Integer.valueOf(1));
                    break;

                case 2: // '\002'
                    bx bx20 = (bx)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, bx.CREATOR);
                    hashset.add(Integer.valueOf(2));
                    bx1 = bx20;
                    break;

                case 3: // '\003'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.x(parcel, l);
                    hashset.add(Integer.valueOf(3));
                    break;

                case 4: // '\004'
                    bx bx19 = (bx)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, bx.CREATOR);
                    hashset.add(Integer.valueOf(4));
                    bx2 = bx19;
                    break;

                case 5: // '\005'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    hashset.add(Integer.valueOf(5));
                    break;

                case 6: // '\006'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    hashset.add(Integer.valueOf(6));
                    break;

                case 7: // '\007'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    hashset.add(Integer.valueOf(7));
                    break;

                case 8: // '\b'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, bx.CREATOR);
                    hashset.add(Integer.valueOf(8));
                    break;

                case 9: // '\t'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    hashset.add(Integer.valueOf(9));
                    break;

                case 10: // '\n'
                    arraylist2 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, bx.CREATOR);
                    hashset.add(Integer.valueOf(10));
                    break;

                case 11: // '\013'
                    bx bx18 = (bx)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, bx.CREATOR);
                    hashset.add(Integer.valueOf(11));
                    bx3 = bx18;
                    break;

                case 12: // '\f'
                    arraylist3 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, bx.CREATOR);
                    hashset.add(Integer.valueOf(12));
                    break;

                case 13: // '\r'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    hashset.add(Integer.valueOf(13));
                    break;

                case 14: // '\016'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    hashset.add(Integer.valueOf(14));
                    break;

                case 15: // '\017'
                    bx bx17 = (bx)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, bx.CREATOR);
                    hashset.add(Integer.valueOf(15));
                    bx4 = bx17;
                    break;

                case 17: // '\021'
                    s6 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    hashset.add(Integer.valueOf(17));
                    break;

                case 16: // '\020'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    hashset.add(Integer.valueOf(16));
                    break;

                case 19: // '\023'
                    arraylist4 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, bx.CREATOR);
                    hashset.add(Integer.valueOf(19));
                    break;

                case 18: // '\022'
                    s7 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    hashset.add(Integer.valueOf(18));
                    break;

                case 21: // '\025'
                    s9 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    hashset.add(Integer.valueOf(21));
                    break;

                case 20: // '\024'
                    s8 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    hashset.add(Integer.valueOf(20));
                    break;

                case 23: // '\027'
                    s11 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    hashset.add(Integer.valueOf(23));
                    break;

                case 22: // '\026'
                    s10 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    hashset.add(Integer.valueOf(22));
                    break;

                case 25: // '\031'
                    s13 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    hashset.add(Integer.valueOf(25));
                    break;

                case 24: // '\030'
                    s12 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    hashset.add(Integer.valueOf(24));
                    break;

                case 27: // '\033'
                    s15 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    hashset.add(Integer.valueOf(27));
                    break;

                case 26: // '\032'
                    s14 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    hashset.add(Integer.valueOf(26));
                    break;

                case 29: // '\035'
                    bx bx16 = (bx)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, bx.CREATOR);
                    hashset.add(Integer.valueOf(29));
                    bx5 = bx16;
                    break;

                case 28: // '\034'
                    s16 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    hashset.add(Integer.valueOf(28));
                    break;

                case 31: // '\037'
                    s18 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    hashset.add(Integer.valueOf(31));
                    break;

                case 30: // '\036'
                    s17 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    hashset.add(Integer.valueOf(30));
                    break;

                case 34: // '"'
                    bx bx15 = (bx)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, bx.CREATOR);
                    hashset.add(Integer.valueOf(34));
                    bx6 = bx15;
                    break;

                case 32: // ' '
                    s19 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    hashset.add(Integer.valueOf(32));
                    break;

                case 33: // '!'
                    s20 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    hashset.add(Integer.valueOf(33));
                    break;

                case 38: // '&'
                    d1 = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(38));
                    break;

                case 39: // '\''
                    s21 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    hashset.add(Integer.valueOf(39));
                    break;

                case 36: // '$'
                    d = com.google.android.gms.common.internal.safeparcel.a.j(parcel, l);
                    hashset.add(Integer.valueOf(36));
                    break;

                case 37: // '%'
                    bx bx14 = (bx)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, bx.CREATOR);
                    hashset.add(Integer.valueOf(37));
                    bx7 = bx14;
                    break;

                case 42: // '*'
                    s22 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    hashset.add(Integer.valueOf(42));
                    break;

                case 43: // '+'
                    s23 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    hashset.add(Integer.valueOf(43));
                    break;

                case 40: // '('
                    bx bx13 = (bx)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, bx.CREATOR);
                    hashset.add(Integer.valueOf(40));
                    bx8 = bx13;
                    break;

                case 41: // ')'
                    arraylist5 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, bx.CREATOR);
                    hashset.add(Integer.valueOf(41));
                    break;

                case 46: // '.'
                    bx bx12 = (bx)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, bx.CREATOR);
                    hashset.add(Integer.valueOf(46));
                    bx9 = bx12;
                    break;

                case 47: // '/'
                    s26 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    hashset.add(Integer.valueOf(47));
                    break;

                case 44: // ','
                    s24 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    hashset.add(Integer.valueOf(44));
                    break;

                case 45: // '-'
                    s25 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    hashset.add(Integer.valueOf(45));
                    break;

                case 51: // '3'
                    s29 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    hashset.add(Integer.valueOf(51));
                    break;

                case 50: // '2'
                    bx bx11 = (bx)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, bx.CREATOR);
                    hashset.add(Integer.valueOf(50));
                    bx10 = bx11;
                    break;

                case 49: // '1'
                    s28 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    hashset.add(Integer.valueOf(49));
                    break;

                case 48: // '0'
                    s27 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    hashset.add(Integer.valueOf(48));
                    break;

                case 55: // '7'
                    s33 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    hashset.add(Integer.valueOf(55));
                    break;

                case 54: // '6'
                    s32 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    hashset.add(Integer.valueOf(54));
                    break;

                case 53: // '5'
                    s31 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    hashset.add(Integer.valueOf(53));
                    break;

                case 52: // '4'
                    s30 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    hashset.add(Integer.valueOf(52));
                    break;

                case 56: // '8'
                    s34 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    hashset.add(Integer.valueOf(56));
                    break;
                }
            } else
            {
                if (parcel.dataPosition() != i)
                {
                    throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
                }
                return new bx(hashset, j, bx1, arraylist, bx2, s, s1, s2, arraylist1, k, arraylist2, bx3, arraylist3, s3, s4, bx4, s5, s6, s7, arraylist4, s8, s9, s10, s11, s12, s13, s14, s15, s16, bx5, s17, s18, s19, s20, bx6, d, bx7, d1, s21, bx8, arraylist5, s22, s23, s24, s25, bx9, s26, s27, s28, bx10, s29, s30, s31, s32, s33, s34);
            }
        } while (true);
    }

    public bx[] a(int i)
    {
        return new bx[i];
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
