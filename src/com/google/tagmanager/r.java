// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager;

import android.content.Context;
import android.net.Uri;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.tagmanager:
//            w, s, e, a, 
//            t, m, u, n, 
//            c, v

public class r
{

    private static r f;
    private final v a;
    private final Context b;
    private final e c;
    private volatile w d;
    private final ConcurrentMap e;

    r(Context context, v v, e e1)
    {
        if (context == null)
        {
            throw new NullPointerException("context cannot be null");
        } else
        {
            b = context.getApplicationContext();
            a = v;
            d = w.a;
            e = new ConcurrentHashMap();
            c = e1;
            c.a(new s(this));
            c.a(new a(b));
            return;
        }
    }

    public static r a(Context context)
    {
        com/google/tagmanager/r;
        JVM INSTR monitorenter ;
        r r1;
        if (f == null)
        {
            f = new r(context, new t(), new e());
        }
        r1 = f;
        com/google/tagmanager/r;
        JVM INSTR monitorexit ;
        return r1;
        Exception exception;
        exception;
        com/google/tagmanager/r;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public w a()
    {
        return d;
    }

    boolean a(Uri uri)
    {
        this;
        JVM INSTR monitorenter ;
        m m1 = m.a();
        if (!m1.a(uri)) goto _L2; else goto _L1
_L1:
        String s1;
        int i;
        s1 = m1.d();
        i = u.a[m1.b().ordinal()];
        i;
        JVM INSTR tableswitch 1 3: default 60
    //                   1 68
    //                   2 108
    //                   3 108;
           goto _L3 _L4 _L5 _L5
_L3:
        boolean flag = true;
_L10:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L4:
        c c2 = (c)e.get(s1);
        if (c2 == null) goto _L3; else goto _L6
_L6:
        c2.a(null);
        c2.a();
          goto _L3
        Exception exception;
        exception;
        throw exception;
_L5:
        Iterator iterator = e.entrySet().iterator();
_L8:
        c c1;
        while (iterator.hasNext()) 
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            c1 = (c)entry.getValue();
            if (!((String)entry.getKey()).equals(s1))
            {
                continue; /* Loop/switch isn't completed */
            }
            c1.a(m1.c());
            c1.a();
        }
          goto _L3
        if (c1.b() == null) goto _L8; else goto _L7
_L7:
        c1.a(null);
        c1.a();
        if (true) goto _L8; else goto _L9
_L9:
          goto _L3
_L2:
        flag = false;
          goto _L10
    }
}
