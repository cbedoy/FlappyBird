// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.d.e;


public final class b extends Enum
{

    public static final b a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    public static final b f;
    public static b g;
    private static final b h[];

    private b(String s, int i)
    {
        super(s, i);
    }

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(org/andengine/d/e/b, s);
    }

    public static b[] values()
    {
        b ab[] = h;
        int i = ab.length;
        b ab1[] = new b[i];
        System.arraycopy(ab, 0, ab1, 0, i);
        return ab1;
    }

    public boolean a(b b1)
    {
        return compareTo(b1) >= 0;
    }

    static 
    {
        a = new b("NONE", 0);
        b = new b("ERROR", 1);
        c = new b("WARNING", 2);
        d = new b("INFO", 3);
        e = new b("DEBUG", 4);
        f = new b("VERBOSE", 5);
        b ab[] = new b[6];
        ab[0] = a;
        ab[1] = b;
        ab[2] = c;
        ab[3] = d;
        ab[4] = e;
        ab[5] = f;
        h = ab;
        g = f;
    }
}
