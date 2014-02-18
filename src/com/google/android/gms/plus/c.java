// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.content.Context;
import com.google.android.gms.common.d;
import com.google.android.gms.internal.bd;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.plus:
//            a, b

public class c
{

    private Context a;
    private String b;
    private com.google.android.gms.common.c c;
    private d d;
    private ArrayList e;
    private String f[];
    private String g[];
    private String h;
    private String i;
    private String j;

    public c(Context context, com.google.android.gms.common.c c1, d d1)
    {
        a = context;
        c = c1;
        d = d1;
        e = new ArrayList();
        i = a.getPackageName();
        h = a.getPackageName();
        e.add("https://www.googleapis.com/auth/plus.login");
    }

    public b a()
    {
        if (b == null)
        {
            b = "<<default account>>";
        }
        String as[] = (String[])e.toArray(new String[e.size()]);
        a a1 = new a(b, as, f, g, h, i, j);
        return new b(new bd(a, a1, c, d));
    }

    public transient c a(String as[])
    {
        e.clear();
        e.addAll(Arrays.asList(as));
        return this;
    }
}
