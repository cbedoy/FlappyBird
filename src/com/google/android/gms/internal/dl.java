// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            dn

public final class dl
{

    public static transient int a(Object aobj[])
    {
        return Arrays.hashCode(aobj);
    }

    public static dn a(Object obj)
    {
        return new dn(obj, null);
    }

    public static boolean a(Object obj, Object obj1)
    {
        return obj == obj1 || obj != null && obj.equals(obj1);
    }
}
