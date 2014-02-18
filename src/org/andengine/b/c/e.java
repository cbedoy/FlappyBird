// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.b.c;


public final class e extends Enum
{

    public static final e a;
    public static final e b;
    public static final e c;
    public static final e d;
    private static final e e[];

    private e(String s, int i)
    {
        super(s, i);
    }

    public static e valueOf(String s)
    {
        return (e)Enum.valueOf(org/andengine/b/c/e, s);
    }

    public static e[] values()
    {
        e ae[] = e;
        int i = ae.length;
        e ae1[] = new e[i];
        System.arraycopy(ae, 0, ae1, 0, i);
        return ae1;
    }

    static 
    {
        a = new e("LANDSCAPE_FIXED", 0);
        b = new e("LANDSCAPE_SENSOR", 1);
        c = new e("PORTRAIT_FIXED", 2);
        d = new e("PORTRAIT_SENSOR", 3);
        e ae[] = new e[4];
        ae[0] = a;
        ae[1] = b;
        ae[2] = c;
        ae[3] = d;
        e = ae;
    }
}
