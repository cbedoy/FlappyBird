// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.d.i;


public class a
{

    public static final boolean a;
    public static final boolean b;
    public static final boolean c;
    public static final boolean d;
    public static final boolean e;

    public static boolean a(int i)
    {
        return android.os.Build.VERSION.SDK_INT <= i;
    }

    public static boolean a(int i, int j)
    {
        return android.os.Build.VERSION.SDK_INT >= i && android.os.Build.VERSION.SDK_INT <= j;
    }

    static 
    {
        boolean flag = true;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        if (android.os.Build.VERSION.SDK_INT >= 5)
        {
            flag1 = flag;
        } else
        {
            flag1 = false;
        }
        a = flag1;
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            flag2 = flag;
        } else
        {
            flag2 = false;
        }
        b = flag2;
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            flag3 = flag;
        } else
        {
            flag3 = false;
        }
        c = flag3;
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            flag4 = flag;
        } else
        {
            flag4 = false;
        }
        d = flag4;
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            flag = false;
        }
        e = flag;
    }
}
