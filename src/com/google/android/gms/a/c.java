// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.a;

import android.content.Context;
import com.google.android.gms.common.d;

// Referenced classes of package com.google.android.gms.a:
//            a

public final class c
{

    private static final String a[] = {
        "https://www.googleapis.com/auth/appstate"
    };
    private Context b;
    private com.google.android.gms.common.c c;
    private d d;
    private String e[];
    private String f;

    public c(Context context, com.google.android.gms.common.c c1, d d1)
    {
        b = context;
        c = c1;
        d = d1;
        e = a;
        f = "<<default account>>";
    }

    public a a()
    {
        return new a(b, c, d, f, e, null);
    }

    public transient c a(String as[])
    {
        e = as;
        return this;
    }

}
