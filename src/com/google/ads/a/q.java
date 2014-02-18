// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.a;


// Referenced classes of package com.google.ads.a:
//            u

class q
{

    static final int a[];

    static 
    {
        a = new int[u.values().length];
        try
        {
            a[u.b.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        try
        {
            a[u.a.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[u.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[u.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror3)
        {
            return;
        }
    }
}
