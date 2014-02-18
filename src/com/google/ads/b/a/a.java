// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.b.a;

import com.google.ads.b.j;
import java.util.HashMap;
import java.util.Map;

public class a
    implements j
{

    private boolean a;
    private Map b;

    public a()
    {
        a = false;
        c();
    }

    public a c()
    {
        b = new HashMap();
        return this;
    }

    public Map d()
    {
        return b;
    }
}
