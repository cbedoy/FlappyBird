// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.gms.common.b;
import com.google.android.gms.common.d;
import com.google.android.gms.internal.r;

// Referenced classes of package com.google.android.gms.games:
//            e

public final class c
    implements b
{

    private final r a;

    private c(Context context, String s, String s1, com.google.android.gms.common.c c1, d d, String as[], int i, 
            View view)
    {
        a = new r(context, s, s1, c1, d, as, i, view, false);
    }

    c(Context context, String s, String s1, com.google.android.gms.common.c c1, d d, String as[], int i, 
            View view, e e)
    {
        this(context, s, s1, c1, d, as, i, view);
    }

    public Intent a(String s)
    {
        return a.a(s);
    }

    public void a()
    {
        a.a();
    }

    public void a(String s, long l)
    {
        a.a(null, s, l);
    }

    public boolean b()
    {
        return a.h();
    }

    public void c()
    {
        a.b();
    }
}
