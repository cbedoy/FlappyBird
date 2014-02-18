// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentName;
import android.os.IBinder;
import java.util.HashSet;

// Referenced classes of package com.google.android.gms.internal:
//            cz, cx, cv

final class cy
{

    final cx a;
    private final String b;
    private final cz c = new cz(this);
    private final HashSet d = new HashSet();
    private int e;
    private boolean f;
    private IBinder g;
    private ComponentName h;

    public cy(cx cx, String s)
    {
        a = cx;
        super();
        b = s;
        e = 0;
    }

    static int a(cy cy1, int i)
    {
        cy1.e = i;
        return i;
    }

    static ComponentName a(cy cy1, ComponentName componentname)
    {
        cy1.h = componentname;
        return componentname;
    }

    static IBinder a(cy cy1, IBinder ibinder)
    {
        cy1.g = ibinder;
        return ibinder;
    }

    static HashSet a(cy cy1)
    {
        return cy1.d;
    }

    public cz a()
    {
        return c;
    }

    public void a(cv cv)
    {
        d.add(cv);
    }

    public void a(boolean flag)
    {
        f = flag;
    }

    public String b()
    {
        return b;
    }

    public void b(cv cv)
    {
        d.remove(cv);
    }

    public boolean c()
    {
        return f;
    }

    public boolean c(cv cv)
    {
        return d.contains(cv);
    }

    public int d()
    {
        return e;
    }

    public boolean e()
    {
        return d.isEmpty();
    }

    public IBinder f()
    {
        return g;
    }

    public ComponentName g()
    {
        return h;
    }
}
