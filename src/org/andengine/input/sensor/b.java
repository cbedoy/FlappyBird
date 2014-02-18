// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.input.sensor;


public final class b extends Enum
{

    public static final b a;
    public static final b b;
    public static final b c;
    public static final b d;
    private static final b f[];
    private final int e;

    private b(String s, int i, int j)
    {
        super(s, i);
        e = j;
    }

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(org/andengine/input/sensor/b, s);
    }

    public static b[] values()
    {
        b ab[] = f;
        int i = ab.length;
        b ab1[] = new b[i];
        System.arraycopy(ab, 0, ab1, 0, i);
        return ab1;
    }

    static 
    {
        a = new b("NORMAL", 0, 3);
        b = new b("UI", 1, 2);
        c = new b("GAME", 2, 1);
        d = new b("FASTEST", 3, 0);
        b ab[] = new b[4];
        ab[0] = a;
        ab[1] = b;
        ab[2] = c;
        ab[3] = d;
        f = ab;
    }
}
