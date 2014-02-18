// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.internal.av;
import com.google.android.gms.internal.cn;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dn;

// Referenced classes of package com.google.android.gms.games:
//            Player, g, i

public final class PlayerEntity extends av
    implements Player
{

    public static final android.os.Parcelable.Creator CREATOR = new g();
    private final int a;
    private final String b;
    private final String c;
    private final Uri d;
    private final Uri e;
    private final long f;

    PlayerEntity(int j, String s, String s1, Uri uri, Uri uri1, long l)
    {
        a = j;
        b = s;
        c = s1;
        d = uri;
        e = uri1;
        f = l;
    }

    public PlayerEntity(Player player)
    {
        boolean flag = true;
        super();
        a = ((flag) ? 1 : 0);
        b = player.b();
        c = player.c();
        d = player.d();
        e = player.e();
        f = player.f();
        cn.a(b);
        cn.a(c);
        if (f <= 0L)
        {
            flag = false;
        }
        cn.a(flag);
    }

    static int a(Player player)
    {
        Object aobj[] = new Object[5];
        aobj[0] = player.b();
        aobj[1] = player.c();
        aobj[2] = player.d();
        aobj[3] = player.e();
        aobj[4] = Long.valueOf(player.f());
        return dl.a(aobj);
    }

    static boolean a(Player player, Object obj)
    {
        boolean flag = true;
        if (!(obj instanceof Player))
        {
            flag = false;
        } else
        if (player != obj)
        {
            Player player1 = (Player)obj;
            if (!dl.a(player1.b(), player.b()) || !dl.a(player1.c(), player.c()) || !dl.a(player1.d(), player.d()) || !dl.a(player1.e(), player.e()) || !dl.a(Long.valueOf(player1.f()), Long.valueOf(player.f())))
            {
                return false;
            }
        }
        return flag;
    }

    static boolean a(Integer integer)
    {
        return b(integer);
    }

    static boolean a(String s)
    {
        return b(s);
    }

    static String b(Player player)
    {
        return dl.a(player).a("PlayerId", player.b()).a("DisplayName", player.c()).a("IconImageUri", player.d()).a("HiResImageUri", player.e()).a("RetrievedTimestamp", Long.valueOf(player.f())).toString();
    }

    static Integer i()
    {
        return u();
    }

    public Object a()
    {
        return h();
    }

    public String b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public Uri d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public Uri e()
    {
        return e;
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public long f()
    {
        return f;
    }

    public int g()
    {
        return a;
    }

    public Player h()
    {
        return this;
    }

    public int hashCode()
    {
        return a(this);
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        if (!v())
        {
            com.google.android.gms.games.i.a(this, parcel, j);
            return;
        }
        parcel.writeString(b);
        parcel.writeString(c);
        String s;
        Uri uri;
        String s1;
        if (d == null)
        {
            s = null;
        } else
        {
            s = d.toString();
        }
        parcel.writeString(s);
        uri = e;
        s1 = null;
        if (uri != null)
        {
            s1 = e.toString();
        }
        parcel.writeString(s1);
        parcel.writeLong(f);
    }

}
