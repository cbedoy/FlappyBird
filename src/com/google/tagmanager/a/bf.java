// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;

import java.util.List;

// Referenced classes of package com.google.tagmanager.a:
//            af, am

public class bf extends RuntimeException
{

    private final List a = null;

    public bf(am am)
    {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public af a()
    {
        return new af(getMessage());
    }
}
