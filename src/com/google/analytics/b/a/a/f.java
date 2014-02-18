// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.b.a.a;

import com.google.tagmanager.a.ad;
import com.google.tagmanager.a.ae;

// Referenced classes of package com.google.analytics.b.a.a:
//            g

public final class f extends Enum
    implements ad
{

    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    public static final f e;
    public static final f f;
    public static final f g;
    public static final f h;
    public static final f i;
    public static final f j;
    public static final f k;
    public static final f l;
    public static final f m;
    public static final f n;
    public static final f o;
    public static final f p;
    public static final f q;
    private static ae r = new g();
    private static final f t[];
    private final int s;

    private f(String s1, int i1, int j1, int k1)
    {
        super(s1, i1);
        s = k1;
    }

    public static f a(int i1)
    {
        switch (i1)
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

        case 9: // '\t'
            return i;

        case 10: // '\n'
            return j;

        case 11: // '\013'
            return k;

        case 12: // '\f'
            return l;

        case 13: // '\r'
            return m;

        case 14: // '\016'
            return n;

        case 15: // '\017'
            return o;

        case 17: // '\021'
            return p;

        case 16: // '\020'
            return q;
        }
    }

    public static f valueOf(String s1)
    {
        return (f)Enum.valueOf(com/google/analytics/b/a/a/f, s1);
    }

    public static f[] values()
    {
        return (f[])t.clone();
    }

    public final int a()
    {
        return s;
    }

    static 
    {
        a = new f("ESCAPE_HTML", 0, 0, 1);
        b = new f("ESCAPE_HTML_RCDATA", 1, 1, 2);
        c = new f("ESCAPE_HTML_ATTRIBUTE", 2, 2, 3);
        d = new f("ESCAPE_HTML_ATTRIBUTE_NOSPACE", 3, 3, 4);
        e = new f("FILTER_HTML_ELEMENT_NAME", 4, 4, 5);
        f = new f("FILTER_HTML_ATTRIBUTES", 5, 5, 6);
        g = new f("ESCAPE_JS_STRING", 6, 6, 7);
        h = new f("ESCAPE_JS_VALUE", 7, 7, 8);
        i = new f("ESCAPE_JS_REGEX", 8, 8, 9);
        j = new f("ESCAPE_CSS_STRING", 9, 9, 10);
        k = new f("FILTER_CSS_VALUE", 10, 10, 11);
        l = new f("ESCAPE_URI", 11, 11, 12);
        m = new f("NORMALIZE_URI", 12, 12, 13);
        n = new f("FILTER_NORMALIZE_URI", 13, 13, 14);
        o = new f("NO_AUTOESCAPE", 14, 14, 15);
        p = new f("TEXT", 15, 15, 17);
        q = new f("CONVERT_JS_VALUE_TO_EXPRESSION", 16, 16, 16);
        f af[] = new f[17];
        af[0] = a;
        af[1] = b;
        af[2] = c;
        af[3] = d;
        af[4] = e;
        af[5] = f;
        af[6] = g;
        af[7] = h;
        af[8] = i;
        af[9] = j;
        af[10] = k;
        af[11] = l;
        af[12] = m;
        af[13] = n;
        af[14] = o;
        af[15] = p;
        af[16] = q;
        t = af;
    }
}
