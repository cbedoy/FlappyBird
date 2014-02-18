// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.d;


public final class a extends Enum
{

    public static final a a;
    public static final a b;
    public static final a c;
    private static final a e[];
    private final int d;

    private a(String s, int i, int j)
    {
        super(s, i);
        d = j;
    }

    public static a valueOf(String s)
    {
        return (a)Enum.valueOf(org/andengine/opengl/d/a, s);
    }

    public static a[] values()
    {
        a aa[] = e;
        int i = aa.length;
        a aa1[] = new a[i];
        System.arraycopy(aa, 0, aa1, 0, i);
        return aa1;
    }

    public int a()
    {
        return d;
    }

    static 
    {
        a = new a("STATIC", 0, 35044);
        b = new a("DYNAMIC", 1, 35048);
        c = new a("STREAM", 2, 35040);
        a aa[] = new a[3];
        aa[0] = a;
        aa[1] = b;
        aa[2] = c;
        e = aa;
    }
}
