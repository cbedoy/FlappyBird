// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.common.data:
//            d

public class f
    implements android.os.Parcelable.Creator
{

    public f()
    {
    }

    static void a(d d1, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, d1.c(), false);
        c.a(parcel, 1000, d1.b());
        c.a(parcel, 2, d1.d(), i, false);
        c.a(parcel, 3, d1.e());
        c.a(parcel, 4, d1.f(), false);
        c.a(parcel, j);
    }

    public d a(Parcel parcel)
    {
        int i = 0;
        android.os.Bundle bundle = null;
        int j = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        CursorWindow acursorwindow[] = null;
        String as[] = null;
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
                    as = com.google.android.gms.common.internal.safeparcel.a.w(parcel, l);
                    break;

                case 1000: 
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 2: // '\002'
                    acursorwindow = (CursorWindow[])com.google.android.gms.common.internal.safeparcel.a.b(parcel, l, CursorWindow.CREATOR);
                    break;

                case 3: // '\003'
                    i = com.google.android.gms.common.internal.safeparcel.a.f(parcel, l);
                    break;

                case 4: // '\004'
                    bundle = com.google.android.gms.common.internal.safeparcel.a.n(parcel, l);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
            } else
            {
                d d1 = new d(k, as, acursorwindow, i, bundle);
                d1.a();
                return d1;
            }
        } while (true);
    }

    public d[] a(int i)
    {
        return new d[i];
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
