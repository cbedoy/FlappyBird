// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.view.ViewGroup;
import com.google.android.gms.b.b;
import com.google.android.gms.b.h;
import com.google.android.gms.b.i;
import com.google.android.gms.common.e;
import com.google.android.gms.maps.a.bj;
import com.google.android.gms.maps.a.z;
import com.google.android.gms.maps.model.k;

// Referenced classes of package com.google.android.gms.maps:
//            c, GoogleMapOptions

class d extends b
{

    protected i a;
    private final ViewGroup b;
    private final Context c;
    private final GoogleMapOptions d;

    d(ViewGroup viewgroup, Context context, GoogleMapOptions googlemapoptions)
    {
        b = viewgroup;
        c = context;
        d = googlemapoptions;
    }

    public void b()
    {
        if (a == null || a() != null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        com.google.android.gms.maps.a.m m = bj.a(c).a(h.a(c), d);
        a.a(new c(b, m));
        return;
        RemoteException remoteexception;
        remoteexception;
        throw new k(remoteexception);
        e e1;
        e1;
    }
}
