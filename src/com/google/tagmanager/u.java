// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager;


// Referenced classes of package com.google.tagmanager:
//            n

class u
{

    static final int a[];

    static 
    {
        a = new int[n.values().length];
        try
        {
            a[n.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        try
        {
            a[n.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[n.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2)
        {
            return;
        }
    }
}
