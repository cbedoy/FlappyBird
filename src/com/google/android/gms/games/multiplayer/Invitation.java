// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.os.Parcelable;
import com.google.android.gms.common.data.a;
import com.google.android.gms.games.Game;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            e, Participant

public interface Invitation
    extends Parcelable, a, e
{

    public abstract Game b();

    public abstract String c();

    public abstract Participant d();

    public abstract long e();

    public abstract int f();

    public abstract int g();
}
