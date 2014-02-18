// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.view.ViewGroup;
import com.google.android.gms.b.a;
import com.google.android.gms.internal.do;
import com.google.android.gms.maps.a.m;

class c
    implements a
{

    private final ViewGroup a;
    private final m b;

    public c(ViewGroup viewgroup, m m1)
    {
        b = (m)com.google.android.gms.internal.do.a(m1);
        a = (ViewGroup)com.google.android.gms.internal.do.a(viewgroup);
    }

    public m a()
    {
        return b;
    }
}
