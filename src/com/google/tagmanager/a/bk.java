// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;


public final class bk
{

    static final int a = a(1, 3);
    static final int b = a(1, 4);
    static final int c = a(2, 0);
    static final int d = a(3, 2);

    static int a(int i)
    {
        return i & 7;
    }

    static int a(int i, int j)
    {
        return j | i << 3;
    }

    public static int b(int i)
    {
        return i >>> 3;
    }

}
