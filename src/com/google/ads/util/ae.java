// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.util;


// Referenced classes of package com.google.ads.util:
//            ac, aa, g

public final class ae extends ac
{

    final aa d;
    private boolean e;

    public ae(aa aa1, String s)
    {
        d = aa1;
        super(aa1, s, null);
        e = false;
        e = false;
    }

    public ae(aa aa1, String s, Object obj)
    {
        d = aa1;
        super(aa1, s, obj, null);
        e = false;
        e = false;
    }

    public Object a()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = a;
        this;
        JVM INSTR monitorexit ;
        return obj;
        Exception exception;
        exception;
        throw exception;
    }

    public void a(Object obj)
    {
        this;
        JVM INSTR monitorenter ;
        g.d((new StringBuilder()).append("State changed - ").append(d.toString()).append(".").append(b).append(": '").append(obj).append("' <-- '").append(a).append("'.").toString());
        a = obj;
        e = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append(super.toString());
        String s;
        if (e)
        {
            s = " (*)";
        } else
        {
            s = "";
        }
        return stringbuilder.append(s).toString();
    }
}
