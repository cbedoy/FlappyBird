// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.a;

import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dn;

public final class c
{

    public final long a;
    public final String b;
    public final boolean c;

    public c(long l, String s, boolean flag)
    {
        a = l;
        b = s;
        c = flag;
    }

    public String toString()
    {
        return dl.a(this).a("RawScore", Long.valueOf(a)).a("FormattedScore", b).a("NewBest", Boolean.valueOf(c)).toString();
    }
}
