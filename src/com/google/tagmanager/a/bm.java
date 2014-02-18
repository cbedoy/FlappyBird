// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;


// Referenced classes of package com.google.tagmanager.a:
//            br, bn, bo, bp, 
//            bq, bl

public class bm extends Enum
{

    public static final bm a;
    public static final bm b;
    public static final bm c;
    public static final bm d;
    public static final bm e;
    public static final bm f;
    public static final bm g;
    public static final bm h;
    public static final bm i;
    public static final bm j;
    public static final bm k;
    public static final bm l;
    public static final bm m;
    public static final bm n;
    public static final bm o;
    public static final bm p;
    public static final bm q;
    public static final bm r;
    private static final bm u[];
    private final br s;
    private final int t;

    private bm(String s1, int i1, br br1, int j1)
    {
        super(s1, i1);
        s = br1;
        t = j1;
    }

    bm(String s1, int i1, br br1, int j1, bl bl)
    {
        this(s1, i1, br1, j1);
    }

    public static bm valueOf(String s1)
    {
        return (bm)Enum.valueOf(com/google/tagmanager/a/bm, s1);
    }

    public static bm[] values()
    {
        return (bm[])u.clone();
    }

    public br a()
    {
        return s;
    }

    public int b()
    {
        return t;
    }

    public boolean c()
    {
        return true;
    }

    static 
    {
        a = new bm("DOUBLE", 0, br.d, 1);
        b = new bm("FLOAT", 1, br.c, 5);
        c = new bm("INT64", 2, br.b, 0);
        d = new bm("UINT64", 3, br.b, 0);
        e = new bm("INT32", 4, br.a, 0);
        f = new bm("FIXED64", 5, br.b, 1);
        g = new bm("FIXED32", 6, br.a, 5);
        h = new bm("BOOL", 7, br.e, 0);
        i = new bn("STRING", 8, br.f, 2);
        j = new bo("GROUP", 9, br.i, 3);
        k = new bp("MESSAGE", 10, br.i, 2);
        l = new bq("BYTES", 11, br.g, 2);
        m = new bm("UINT32", 12, br.a, 0);
        n = new bm("ENUM", 13, br.h, 0);
        o = new bm("SFIXED32", 14, br.a, 5);
        p = new bm("SFIXED64", 15, br.b, 1);
        q = new bm("SINT32", 16, br.a, 0);
        r = new bm("SINT64", 17, br.b, 0);
        bm abm[] = new bm[18];
        abm[0] = a;
        abm[1] = b;
        abm[2] = c;
        abm[3] = d;
        abm[4] = e;
        abm[5] = f;
        abm[6] = g;
        abm[7] = h;
        abm[8] = i;
        abm[9] = j;
        abm[10] = k;
        abm[11] = l;
        abm[12] = m;
        abm[13] = n;
        abm[14] = o;
        abm[15] = p;
        abm[16] = q;
        abm[17] = r;
        u = abm;
    }
}
