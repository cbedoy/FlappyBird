// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.b.a.a;

import com.google.tagmanager.a.ad;
import com.google.tagmanager.a.ae;

// Referenced classes of package com.google.analytics.b.a.a:
//            i

public final class h extends Enum
    implements ad
{

    public static final h a;
    public static final h b;
    public static final h c;
    public static final h d;
    public static final h e;
    public static final h f;
    public static final h g;
    public static final h h;
    private static ae i = new i();
    private static final h k[];
    private final int j;

    private h(String s, int l, int i1, int j1)
    {
        super(s, l);
        j = j1;
    }

    public static h a(int l)
    {
        switch (l)
        {
        default:
            return null;

        case 1: // '\001'
            return a;

        case 2: // '\002'
            return b;

        case 3: // '\003'
            return c;

        case 4: // '\004'
            return d;

        case 5: // '\005'
            return e;

        case 6: // '\006'
            return f;

        case 7: // '\007'
            return g;

        case 8: // '\b'
            return h;
        }
    }

    public static h valueOf(String s)
    {
        return (h)Enum.valueOf(com/google/analytics/b/a/a/h, s);
    }

    public static h[] values()
    {
        return (h[])k.clone();
    }

    public final int a()
    {
        return j;
    }

    static 
    {
        a = new h("STRING", 0, 0, 1);
        b = new h("LIST", 1, 1, 2);
        c = new h("MAP", 2, 2, 3);
        d = new h("MACRO_REFERENCE", 3, 3, 4);
        e = new h("FUNCTION_ID", 4, 4, 5);
        f = new h("INTEGER", 5, 5, 6);
        g = new h("TEMPLATE", 6, 6, 7);
        h = new h("BOOLEAN", 7, 7, 8);
        h ah[] = new h[8];
        ah[0] = a;
        ah[1] = b;
        ah[2] = c;
        ah[3] = d;
        ah[4] = e;
        ah[5] = f;
        ah[6] = g;
        ah[7] = h;
        k = ah;
    }
}
