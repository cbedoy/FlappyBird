// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager;


public final class w extends Enum
{

    public static final w a;
    public static final w b;
    private static final w c[];

    private w(String s, int i)
    {
        super(s, i);
    }

    public static w valueOf(String s)
    {
        return (w)Enum.valueOf(com/google/tagmanager/w, s);
    }

    public static w[] values()
    {
        return (w[])c.clone();
    }

    static 
    {
        a = new w("STANDARD", 0);
        b = new w("DEFAULT_CONTAINER", 1);
        w aw[] = new w[2];
        aw[0] = a;
        aw[1] = b;
        c = aw;
    }
}
