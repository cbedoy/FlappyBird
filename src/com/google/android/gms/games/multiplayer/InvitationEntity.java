// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.internal.av;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dn;
import com.google.android.gms.internal.do;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Invitation, a, Participant, ParticipantEntity, 
//            f

public final class InvitationEntity extends av
    implements Invitation
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private final int a;
    private final GameEntity b;
    private final String c;
    private final long d;
    private final int e;
    private final ParticipantEntity f;
    private final ArrayList g;
    private final int h;

    InvitationEntity(int l, GameEntity gameentity, String s, long l1, int i1, ParticipantEntity participantentity, 
            ArrayList arraylist, int j1)
    {
        a = l;
        b = gameentity;
        c = s;
        d = l1;
        e = i1;
        f = participantentity;
        g = arraylist;
        h = j1;
    }

    InvitationEntity(Invitation invitation)
    {
        a = 1;
        b = new GameEntity(invitation.b());
        c = invitation.c();
        d = invitation.e();
        e = invitation.f();
        h = invitation.g();
        String s = invitation.d().i();
        Participant participant = null;
        ArrayList arraylist = invitation.i();
        int l = arraylist.size();
        g = new ArrayList(l);
        for (int i1 = 0; i1 < l; i1++)
        {
            Participant participant1 = (Participant)arraylist.get(i1);
            if (participant1.i().equals(s))
            {
                participant = participant1;
            }
            g.add((ParticipantEntity)participant1.a());
        }

        com.google.android.gms.internal.do.a(participant, "Must have a valid inviter!");
        f = (ParticipantEntity)participant.a();
    }

    static int a(Invitation invitation)
    {
        Object aobj[] = new Object[7];
        aobj[0] = invitation.b();
        aobj[1] = invitation.c();
        aobj[2] = Long.valueOf(invitation.e());
        aobj[3] = Integer.valueOf(invitation.f());
        aobj[4] = invitation.d();
        aobj[5] = invitation.i();
        aobj[6] = Integer.valueOf(invitation.g());
        return dl.a(aobj);
    }

    static boolean a(Invitation invitation, Object obj)
    {
        boolean flag = true;
        if (!(obj instanceof Invitation))
        {
            flag = false;
        } else
        if (invitation != obj)
        {
            Invitation invitation1 = (Invitation)obj;
            if (!dl.a(invitation1.b(), invitation.b()) || !dl.a(invitation1.c(), invitation.c()) || !dl.a(Long.valueOf(invitation1.e()), Long.valueOf(invitation.e())) || !dl.a(Integer.valueOf(invitation1.f()), Integer.valueOf(invitation.f())) || !dl.a(invitation1.d(), invitation.d()) || !dl.a(invitation1.i(), invitation.i()) || !dl.a(Integer.valueOf(invitation1.g()), Integer.valueOf(invitation.g())))
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

    static String b(Invitation invitation)
    {
        return dl.a(invitation).a("Game", invitation.b()).a("InvitationId", invitation.c()).a("CreationTimestamp", Long.valueOf(invitation.e())).a("InvitationType", Integer.valueOf(invitation.f())).a("Inviter", invitation.d()).a("Participants", invitation.i()).a("Variant", Integer.valueOf(invitation.g())).toString();
    }

    static Integer k()
    {
        return u();
    }

    public Object a()
    {
        return j();
    }

    public Game b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public Participant d()
    {
        return f;
    }

    public int describeContents()
    {
        return 0;
    }

    public long e()
    {
        return d;
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public int f()
    {
        return e;
    }

    public int g()
    {
        return h;
    }

    public int h()
    {
        return a;
    }

    public int hashCode()
    {
        return a(this);
    }

    public ArrayList i()
    {
        return new ArrayList(g);
    }

    public Invitation j()
    {
        return this;
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int l)
    {
        if (!v())
        {
            com.google.android.gms.games.multiplayer.f.a(this, parcel, l);
        } else
        {
            b.writeToParcel(parcel, l);
            parcel.writeString(c);
            parcel.writeLong(d);
            parcel.writeInt(e);
            f.writeToParcel(parcel, l);
            int i1 = g.size();
            parcel.writeInt(i1);
            int j1 = 0;
            while (j1 < i1) 
            {
                ((ParticipantEntity)g.get(j1)).writeToParcel(parcel, l);
                j1++;
            }
        }
    }

}
