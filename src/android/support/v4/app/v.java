// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;

// Referenced classes of package android.support.v4.app:
//            Fragment

final class v
{

    private final String a;
    private final Class b;
    private final Bundle c;
    private Fragment d;

    static Fragment a(v v1)
    {
        return v1.d;
    }

    static Fragment a(v v1, Fragment fragment)
    {
        v1.d = fragment;
        return fragment;
    }

    static String b(v v1)
    {
        return v1.a;
    }

    static Class c(v v1)
    {
        return v1.b;
    }

    static Bundle d(v v1)
    {
        return v1.c;
    }
}
