// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.content.Context;
import android.view.View;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;

// Referenced classes of package com.google.android.gms.games:
//            c

public final class f
{

    private final Context a;
    private String b;
    private String c;
    private final c d;
    private final d e;
    private String f[] = {
        "https://www.googleapis.com/auth/games"
    };
    private int g;
    private View h;

    public f(Context context, c c1, d d1)
    {
        c = "<<default account>>";
        g = 49;
        a = context;
        b = context.getPackageName();
        d = c1;
        e = d1;
    }

    public com.google.android.gms.games.c a()
    {
        return new com.google.android.gms.games.c(a, b, c, d, e, f, g, h, null);
    }

    public f a(int i)
    {
        g = i;
        return this;
    }

    public transient f a(String as[])
    {
        f = as;
        return this;
    }
}
