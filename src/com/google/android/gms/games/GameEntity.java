// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.internal.av;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dn;

// Referenced classes of package com.google.android.gms.games:
//            Game, a, h

public final class GameEntity extends av
    implements Game
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private final int a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final Uri h;
    private final Uri i;
    private final Uri j;
    private final boolean k;
    private final boolean l;
    private final String m;
    private final int n;
    private final int o;
    private final int p;

    GameEntity(int i1, String s1, String s2, String s3, String s4, String s5, String s6, 
            Uri uri, Uri uri1, Uri uri2, boolean flag, boolean flag1, String s7, int j1, 
            int k1, int l1)
    {
        a = i1;
        b = s1;
        c = s2;
        d = s3;
        e = s4;
        f = s5;
        g = s6;
        h = uri;
        i = uri1;
        j = uri2;
        k = flag;
        l = flag1;
        m = s7;
        n = j1;
        o = k1;
        p = l1;
    }

    public GameEntity(Game game)
    {
        a = 1;
        b = game.b();
        d = game.d();
        e = game.e();
        f = game.f();
        g = game.g();
        c = game.c();
        h = game.h();
        i = game.i();
        j = game.j();
        k = game.k();
        l = game.l();
        m = game.m();
        n = game.n();
        o = game.o();
        p = game.p();
    }

    static int a(Game game)
    {
        Object aobj[] = new Object[15];
        aobj[0] = game.b();
        aobj[1] = game.c();
        aobj[2] = game.d();
        aobj[3] = game.e();
        aobj[4] = game.f();
        aobj[5] = game.g();
        aobj[6] = game.h();
        aobj[7] = game.i();
        aobj[8] = game.j();
        aobj[9] = Boolean.valueOf(game.k());
        aobj[10] = Boolean.valueOf(game.l());
        aobj[11] = game.m();
        aobj[12] = Integer.valueOf(game.n());
        aobj[13] = Integer.valueOf(game.o());
        aobj[14] = Integer.valueOf(game.p());
        return dl.a(aobj);
    }

    static boolean a(Game game, Object obj)
    {
        boolean flag = true;
        if (!(obj instanceof Game))
        {
            flag = false;
        } else
        if (game != obj)
        {
            Game game1 = (Game)obj;
            if (!dl.a(game1.b(), game.b()) || !dl.a(game1.c(), game.c()) || !dl.a(game1.d(), game.d()) || !dl.a(game1.e(), game.e()) || !dl.a(game1.f(), game.f()) || !dl.a(game1.g(), game.g()) || !dl.a(game1.h(), game.h()) || !dl.a(game1.i(), game.i()) || !dl.a(game1.j(), game.j()) || !dl.a(Boolean.valueOf(game1.k()), Boolean.valueOf(game.k())) || !dl.a(Boolean.valueOf(game1.l()), Boolean.valueOf(game.l())) || !dl.a(game1.m(), game.m()) || !dl.a(Integer.valueOf(game1.n()), Integer.valueOf(game.n())) || !dl.a(Integer.valueOf(game1.o()), Integer.valueOf(game.o())) || !dl.a(Integer.valueOf(game1.p()), Integer.valueOf(game.p())))
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

    static boolean a(String s1)
    {
        return b(s1);
    }

    static String b(Game game)
    {
        return dl.a(game).a("ApplicationId", game.b()).a("DisplayName", game.c()).a("PrimaryCategory", game.d()).a("SecondaryCategory", game.e()).a("Description", game.f()).a("DeveloperName", game.g()).a("IconImageUri", game.h()).a("HiResImageUri", game.i()).a("FeaturedImageUri", game.j()).a("PlayEnabledGame", Boolean.valueOf(game.k())).a("InstanceInstalled", Boolean.valueOf(game.l())).a("InstancePackageName", game.m()).a("GameplayAclStatus", Integer.valueOf(game.n())).a("AchievementTotalCount", Integer.valueOf(game.o())).a("LeaderboardCount", Integer.valueOf(game.p())).toString();
    }

    static Integer s()
    {
        return u();
    }

    public Object a()
    {
        return r();
    }

    public String b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public String d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        return e;
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public String f()
    {
        return f;
    }

    public String g()
    {
        return g;
    }

    public Uri h()
    {
        return h;
    }

    public int hashCode()
    {
        return a(this);
    }

    public Uri i()
    {
        return i;
    }

    public Uri j()
    {
        return j;
    }

    public boolean k()
    {
        return k;
    }

    public boolean l()
    {
        return l;
    }

    public String m()
    {
        return m;
    }

    public int n()
    {
        return n;
    }

    public int o()
    {
        return o;
    }

    public int p()
    {
        return p;
    }

    public int q()
    {
        return a;
    }

    public Game r()
    {
        return this;
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        int j1 = 1;
        if (!v())
        {
            com.google.android.gms.games.h.a(this, parcel, i1);
            return;
        }
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeString(e);
        parcel.writeString(f);
        parcel.writeString(g);
        String s1;
        String s2;
        Uri uri;
        String s3;
        int k1;
        if (h == null)
        {
            s1 = null;
        } else
        {
            s1 = h.toString();
        }
        parcel.writeString(s1);
        if (i == null)
        {
            s2 = null;
        } else
        {
            s2 = i.toString();
        }
        parcel.writeString(s2);
        uri = j;
        s3 = null;
        if (uri != null)
        {
            s3 = j.toString();
        }
        parcel.writeString(s3);
        if (k)
        {
            k1 = j1;
        } else
        {
            k1 = 0;
        }
        parcel.writeInt(k1);
        if (!l)
        {
            j1 = 0;
        }
        parcel.writeInt(j1);
        parcel.writeString(m);
        parcel.writeInt(n);
        parcel.writeInt(o);
        parcel.writeInt(p);
    }

}
