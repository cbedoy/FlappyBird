// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.util;


// Referenced classes of package com.google.ads.util:
//            aa, ab

public abstract class ac
{

    protected Object a;
    protected final String b;
    final aa c;

    private ac(aa aa1, String s)
    {
        this(aa1, s, null);
    }

    ac(aa aa1, String s, ab ab)
    {
        this(aa1, s);
    }

    private ac(aa aa1, String s, Object obj)
    {
        c = aa1;
        super();
        b = s;
        aa.a(aa1, this);
        a = obj;
    }

    ac(aa aa1, String s, Object obj, ab ab)
    {
        this(aa1, s, obj);
    }

    public String toString()
    {
        return (new StringBuilder()).append(c.toString()).append(".").append(b).append(" = ").append(a).toString();
    }
}
