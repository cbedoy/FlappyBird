// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.av;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dn;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Participant, c, g

public final class ParticipantEntity extends av
    implements Participant
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    private final int a;
    private final String b;
    private final String c;
    private final Uri d;
    private final Uri e;
    private final int f;
    private final String g;
    private final boolean h;
    private final PlayerEntity i;
    private final int j;

    ParticipantEntity(int i1, String s, String s1, Uri uri, Uri uri1, int j1, String s2, 
            boolean flag, PlayerEntity playerentity, int k1)
    {
        a = i1;
        b = s;
        c = s1;
        d = uri;
        e = uri1;
        f = j1;
        g = s2;
        h = flag;
        i = playerentity;
        j = k1;
    }

    public ParticipantEntity(Participant participant)
    {
        a = 1;
        b = participant.i();
        c = participant.f();
        d = participant.g();
        e = participant.h();
        f = participant.b();
        g = participant.c();
        h = participant.e();
        Player player = participant.j();
        PlayerEntity playerentity;
        if (player == null)
        {
            playerentity = null;
        } else
        {
            playerentity = new PlayerEntity(player);
        }
        i = playerentity;
        j = participant.d();
    }

    static int a(Participant participant)
    {
        Object aobj[] = new Object[8];
        aobj[0] = participant.j();
        aobj[1] = Integer.valueOf(participant.b());
        aobj[2] = participant.c();
        aobj[3] = Boolean.valueOf(participant.e());
        aobj[4] = participant.f();
        aobj[5] = participant.g();
        aobj[6] = participant.h();
        aobj[7] = Integer.valueOf(participant.d());
        return dl.a(aobj);
    }

    static boolean a(Participant participant, Object obj)
    {
        boolean flag = true;
        if (!(obj instanceof Participant))
        {
            flag = false;
        } else
        if (participant != obj)
        {
            Participant participant1 = (Participant)obj;
            if (!dl.a(participant1.j(), participant.j()) || !dl.a(Integer.valueOf(participant1.b()), Integer.valueOf(participant.b())) || !dl.a(participant1.c(), participant.c()) || !dl.a(Boolean.valueOf(participant1.e()), Boolean.valueOf(participant.e())) || !dl.a(participant1.f(), participant.f()) || !dl.a(participant1.g(), participant.g()) || !dl.a(participant1.h(), participant.h()) || !dl.a(Integer.valueOf(participant1.d()), Integer.valueOf(participant.d())))
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

    static String b(Participant participant)
    {
        return dl.a(participant).a("Player", participant.j()).a("Status", Integer.valueOf(participant.b())).a("ClientAddress", participant.c()).a("ConnectedToRoom", Boolean.valueOf(participant.e())).a("DisplayName", participant.f()).a("IconImage", participant.g()).a("HiResImage", participant.h()).a("Capabilities", Integer.valueOf(participant.d())).toString();
    }

    static Integer m()
    {
        return u();
    }

    public Object a()
    {
        return l();
    }

    public int b()
    {
        return f;
    }

    public String c()
    {
        return g;
    }

    public int d()
    {
        return j;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean e()
    {
        return h;
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public String f()
    {
        if (i == null)
        {
            return c;
        } else
        {
            return i.c();
        }
    }

    public Uri g()
    {
        if (i == null)
        {
            return d;
        } else
        {
            return i.d();
        }
    }

    public Uri h()
    {
        if (i == null)
        {
            return e;
        } else
        {
            return i.e();
        }
    }

    public int hashCode()
    {
        return a(this);
    }

    public String i()
    {
        return b;
    }

    public Player j()
    {
        return i;
    }

    public int k()
    {
        return a;
    }

    public Participant l()
    {
        return this;
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        if (!v())
        {
            com.google.android.gms.games.multiplayer.g.a(this, parcel, i1);
        } else
        {
            parcel.writeString(b);
            parcel.writeString(c);
            String s;
            Uri uri;
            String s1;
            int j1;
            PlayerEntity playerentity;
            int k1;
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
            parcel.writeInt(f);
            parcel.writeString(g);
            if (h)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            parcel.writeInt(j1);
            playerentity = i;
            k1 = 0;
            if (playerentity != null)
            {
                k1 = 1;
            }
            parcel.writeInt(k1);
            if (i != null)
            {
                i.writeToParcel(parcel, i1);
                return;
            }
        }
    }

}
