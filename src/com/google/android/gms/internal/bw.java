// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.internal:
//            co, x

public class bw
    implements android.os.Parcelable.Creator
{

    public bw()
    {
    }

    static void a(co co1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, co1.g(), false);
        c.a(parcel, 1000, co1.k());
        c.b(parcel, 2, co1.a(), false);
        c.b(parcel, 3, co1.b(), false);
        c.a(parcel, 4, co1.c(), i, false);
        c.a(parcel, 5, co1.d(), false);
        c.a(parcel, 6, co1.e(), false);
        c.a(parcel, 7, co1.f(), false);
        c.a(parcel, 8, co1.h(), false);
        c.a(parcel, 9, co1.i(), false);
        c.a(parcel, 10, co1.j());
        c.a(parcel, j);
    }

    public co a(Parcel parcel)
    {
        int i = 0;
        android.os.Bundle bundle = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        android.os.Bundle bundle1 = null;
        String s = null;
        String s1 = null;
        String s2 = null;
        Uri uri = null;
        java.util.ArrayList arraylist = null;
        java.util.ArrayList arraylist1 = null;
        String s3 = null;
        int k = 0;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int l = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(l))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, l);
                    break;

                case 1: // '\001'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    arraylist1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, x.CREATOR);
                    break;

                case 3: // '\003'
                    arraylist = com.google.android.gms.common.internal.safeparcel.a.c(parcel, l, Uri.CREATOR);
                    break;

                case 4: // '\004'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, l, Uri.CREATOR);
                    break;

                case 5: // '\005'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 6: // '\006'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 7: // '\007'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, l);
                    break;

                case 8: // '\b'
                    bundle1 = com.google.android.gms.common.internal.safeparcel.a.n(parcel, l);
                    break;

                case 9: // '\t'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.n(parcel, l);
                    break;

                case 10: // '\n'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                return new co(k, s3, arraylist1, arraylist, uri, s2, s1, s, bundle1, bundle, i);
            }
        } while (true);
    }

    public co[] a(int i)
    {
        return new co[i];
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
