// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;

// Referenced classes of package com.google.android.gms.games:
//            GameEntity

public class h
    implements android.os.Parcelable.Creator
{

    public h()
    {
    }

    static void a(GameEntity gameentity, Parcel parcel, int i)
    {
        int j = c.a(parcel);
        c.a(parcel, 1, gameentity.b(), false);
        c.a(parcel, 2, gameentity.c(), false);
        c.a(parcel, 3, gameentity.d(), false);
        c.a(parcel, 4, gameentity.e(), false);
        c.a(parcel, 5, gameentity.f(), false);
        c.a(parcel, 6, gameentity.g(), false);
        c.a(parcel, 7, gameentity.h(), i, false);
        c.a(parcel, 8, gameentity.i(), i, false);
        c.a(parcel, 9, gameentity.j(), i, false);
        c.a(parcel, 10, gameentity.k());
        c.a(parcel, 11, gameentity.l());
        c.a(parcel, 12, gameentity.m(), false);
        c.a(parcel, 13, gameentity.n());
        c.a(parcel, 14, gameentity.o());
        c.a(parcel, 15, gameentity.p());
        c.a(parcel, 1000, gameentity.q());
        c.a(parcel, j);
    }

    public GameEntity a(Parcel parcel)
    {
        int i = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        int j = 0;
        String s = null;
        String s1 = null;
        String s2 = null;
        String s3 = null;
        String s4 = null;
        String s5 = null;
        Uri uri = null;
        Uri uri1 = null;
        Uri uri2 = null;
        boolean flag = false;
        boolean flag1 = false;
        String s6 = null;
        int k = 0;
        int l = 0;
        int i1 = 0;
        do
        {
            if (parcel.dataPosition() < i)
            {
                int j1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
                switch (com.google.android.gms.common.internal.safeparcel.a.a(j1))
                {
                default:
                    com.google.android.gms.common.internal.safeparcel.a.b(parcel, j1);
                    break;

                case 1: // '\001'
                    s = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 2: // '\002'
                    s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 3: // '\003'
                    s2 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 4: // '\004'
                    s3 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 5: // '\005'
                    s4 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 6: // '\006'
                    s5 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 7: // '\007'
                    uri = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, Uri.CREATOR);
                    break;

                case 8: // '\b'
                    uri1 = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, Uri.CREATOR);
                    break;

                case 9: // '\t'
                    uri2 = (Uri)com.google.android.gms.common.internal.safeparcel.a.a(parcel, j1, Uri.CREATOR);
                    break;

                case 10: // '\n'
                    flag = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 11: // '\013'
                    flag1 = com.google.android.gms.common.internal.safeparcel.a.c(parcel, j1);
                    break;

                case 12: // '\f'
                    s6 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j1);
                    break;

                case 13: // '\r'
                    k = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 14: // '\016'
                    l = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 15: // '\017'
                    i1 = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;

                case 1000: 
                    j = com.google.android.gms.common.internal.safeparcel.a.f(parcel, j1);
                    break;
                }
            } else
            if (parcel.dataPosition() != i)
            {
                throw new b((new StringBuilder()).append("Overread allowed size end=").append(i).toString(), parcel);
            } else
            {
                return new GameEntity(j, s, s1, s2, s3, s4, s5, uri, uri1, uri2, flag, flag1, s6, k, l, i1);
            }
        } while (true);
    }

    public GameEntity[] a(int i)
    {
        return new GameEntity[i];
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
