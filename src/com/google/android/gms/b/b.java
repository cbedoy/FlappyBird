// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import android.os.Bundle;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.b:
//            c, a, i

public abstract class b
{

    private a a;
    private Bundle b;
    private LinkedList c;
    private final i d = new c(this);

    public b()
    {
    }

    static Bundle a(b b1, Bundle bundle)
    {
        b1.b = bundle;
        return bundle;
    }

    static a a(b b1, a a1)
    {
        b1.a = a1;
        return a1;
    }

    static LinkedList a(b b1)
    {
        return b1.c;
    }

    static a b(b b1)
    {
        return b1.a;
    }

    public a a()
    {
        return a;
    }
}
