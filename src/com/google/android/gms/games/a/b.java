// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.a;

import com.google.android.gms.common.data.d;
import com.google.android.gms.internal.ao;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dn;
import com.google.android.gms.internal.do;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.games.a:
//            c

public final class b
{

    private static final String a[] = {
        "leaderboardId", "playerId", "timeSpan", "hasResult", "rawScore", "formattedScore", "newBest"
    };
    private String b;
    private String c;
    private int d;
    private HashMap e;

    public b(d d1)
    {
        int i = 0;
        super();
        d = d1.e();
        e = new HashMap();
        int j = d1.g();
        boolean flag;
        if (j == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.gms.internal.do.b(flag);
        for (; i < j; i++)
        {
            int k = d1.a(i);
            if (i == 0)
            {
                b = d1.c("leaderboardId", i, k);
                c = d1.c("playerId", i, k);
            }
            if (d1.d("hasResult", i, k))
            {
                a(new c(d1.a("rawScore", i, k), d1.c("formattedScore", i, k), d1.d("newBest", i, k)), d1.b("timeSpan", i, k));
            }
        }

    }

    private void a(c c1, int i)
    {
        e.put(Integer.valueOf(i), c1);
    }

    public int a()
    {
        return d;
    }

    public String toString()
    {
        dn dn1 = dl.a(this).a("PlayerId", c).a("StatusCode", Integer.valueOf(d));
        int i = 0;
        while (i < 3) 
        {
            c c1 = (c)e.get(Integer.valueOf(i));
            dn1.a("TimesSpan", ao.a(i));
            String s;
            if (c1 == null)
            {
                s = "null";
            } else
            {
                s = c1.toString();
            }
            dn1.a("Result", s);
            i++;
        }
        return dn1.toString();
    }

}
