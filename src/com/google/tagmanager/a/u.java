// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;


// Referenced classes of package com.google.tagmanager.a:
//            br

class u
{

    static final int a[];

    static 
    {
        a = new int[br.values().length];
        try
        {
            a[br.i.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        try
        {
            a[br.h.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1)
        {
            return;
        }
    }
}
