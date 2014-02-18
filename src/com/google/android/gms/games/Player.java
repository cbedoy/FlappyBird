// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.a;

public interface Player
    extends Parcelable, a
{

    public abstract String b();

    public abstract String c();

    public abstract Uri d();

    public abstract Uri e();

    public abstract long f();
}
