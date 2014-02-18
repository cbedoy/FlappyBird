// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.example.games.basegameutils;


// Referenced classes of package com.google.example.games.basegameutils:
//            a

public class c
{

    int a;
    int b;

    public c(int i)
    {
        this(i, -100);
    }

    public c(int i, int j)
    {
        a = 0;
        b = -100;
        a = i;
        b = j;
    }

    public int a()
    {
        return a;
    }

    public int b()
    {
        return b;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("SignInFailureReason(serviceErrorCode:")).append(com.google.example.games.basegameutils.a.c(a));
        String s;
        if (b == -100)
        {
            s = ")";
        } else
        {
            s = (new StringBuilder(",activityResultCode:")).append(com.google.example.games.basegameutils.a.b(b)).append(")").toString();
        }
        return stringbuilder.append(s).toString();
    }
}
