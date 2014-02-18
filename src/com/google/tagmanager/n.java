// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager;


final class n extends Enum
{

    public static final n a;
    public static final n b;
    public static final n c;
    private static final n d[];

    private n(String s, int i)
    {
        super(s, i);
    }

    public static n valueOf(String s)
    {
        return (n)Enum.valueOf(com/google/tagmanager/n, s);
    }

    public static n[] values()
    {
        return (n[])d.clone();
    }

    static 
    {
        a = new n("NONE", 0);
        b = new n("CONTAINER", 1);
        c = new n("CONTAINER_DEBUG", 2);
        n an[] = new n[3];
        an[0] = a;
        an[1] = b;
        an[2] = c;
        d = an;
    }
}
