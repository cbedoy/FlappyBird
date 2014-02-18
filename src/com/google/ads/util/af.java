// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.util;

import java.lang.ref.WeakReference;

// Referenced classes of package com.google.ads.util:
//            ac, aa

public final class af extends ac
{

    final aa d;

    public af(aa aa1, String s, Object obj)
    {
        d = aa1;
        super(aa1, s, new WeakReference(obj), null);
    }

    public Object a()
    {
        return ((WeakReference)a).get();
    }

    public String toString()
    {
        return (new StringBuilder()).append(d.toString()).append(".").append(b).append(" = ").append(a()).append(" (?)").toString();
    }
}
