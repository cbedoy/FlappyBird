// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.a.a;

import com.google.tagmanager.a.ad;
import com.google.tagmanager.a.ae;

// Referenced classes of package com.google.analytics.a.a:
//            g

public final class f extends Enum
    implements ad
{

    public static final f a;
    public static final f b;
    public static final f c;
    private static ae d = new g();
    private static final f f[];
    private final int e;

    private f(String s, int i, int j, int k)
    {
        super(s, i);
        e = k;
    }

    public static f a(int i)
    {
        switch (i)
        {
        default:
            return null;

        case 1: // '\001'
            return a;

        case 2: // '\002'
            return b;

        case 3: // '\003'
            return c;
        }
    }

    public static f valueOf(String s)
    {
        return (f)Enum.valueOf(com/google/analytics/a/a/f, s);
    }

    public static f[] values()
    {
        return (f[])f.clone();
    }

    public final int a()
    {
        return e;
    }

    static 
    {
        a = new f("NO_CACHE", 0, 0, 1);
        b = new f("PRIVATE", 1, 1, 2);
        c = new f("PUBLIC", 2, 2, 3);
        f af[] = new f[3];
        af[0] = a;
        af[1] = b;
        af[2] = c;
        f = af;
    }
}
