// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.data.a;
import com.google.android.gms.games.multiplayer.e;

public interface Room
    extends Parcelable, a, e
{

    public abstract String b();

    public abstract String c();

    public abstract long d();

    public abstract int e();

    public abstract String f();

    public abstract int g();

    public abstract Bundle h();

    public abstract int j();
}
