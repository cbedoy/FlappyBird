// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.tagmanager.a:
//            p, aa, am

public class o
{

    private static volatile boolean a = false;
    private static final o c = new o(true);
    private final Map b;

    o()
    {
        b = new HashMap();
    }

    private o(boolean flag)
    {
        b = Collections.emptyMap();
    }

    public static o a()
    {
        return c;
    }

    public aa a(am am, int i)
    {
        return (aa)b.get(new p(am, i));
    }

}
