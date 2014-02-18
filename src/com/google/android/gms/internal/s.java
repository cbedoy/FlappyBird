// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.data.d;
import com.google.android.gms.games.a.a;
import com.google.android.gms.games.a.b;

// Referenced classes of package com.google.android.gms.internal:
//            q, do, t, r

final class s extends q
{

    final r a;
    private final a b;

    public s(r r1, a a1)
    {
        a = r1;
        super();
        b = (a)com.google.android.gms.internal.do.a(a1, "Listener must not be null");
    }

    public void c(d d)
    {
        b b1 = new b(d);
        a.a(new t(a, b, b1));
    }
}
