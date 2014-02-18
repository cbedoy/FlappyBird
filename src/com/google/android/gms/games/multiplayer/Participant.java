// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.a;
import com.google.android.gms.games.Player;

public interface Participant
    extends Parcelable, a
{

    public abstract int b();

    public abstract String c();

    public abstract int d();

    public abstract boolean e();

    public abstract String f();

    public abstract Uri g();

    public abstract Uri h();

    public abstract String i();

    public abstract Player j();
}
