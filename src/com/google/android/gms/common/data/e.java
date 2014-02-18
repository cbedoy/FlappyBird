// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import com.google.android.gms.internal.do;
import java.util.ArrayList;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.common.data:
//            c

public class e
{

    private final String a[];
    private final ArrayList b;
    private final String c;
    private final HashMap d;
    private boolean e;
    private String f;

    private e(String as[], String s)
    {
        a = (String[])com.google.android.gms.internal.do.a(as);
        b = new ArrayList();
        c = s;
        d = new HashMap();
        e = false;
        f = null;
    }

    e(String as[], String s, c c1)
    {
        this(as, s);
    }
}
