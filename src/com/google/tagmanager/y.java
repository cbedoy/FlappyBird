// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager;

import com.google.analytics.b.a.a.c;
import com.google.analytics.b.a.a.e;
import com.google.analytics.b.a.a.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.tagmanager:
//            x, i

class y
{

    private static final Object a = null;
    private static Long b = new Long(0L);
    private static Double c = new Double(0.0D);
    private static x d = x.a(0L);
    private static String e;
    private static Boolean f = new Boolean(false);
    private static List g = new ArrayList(0);
    private static Map h = new HashMap();
    private static c i;

    public static c a()
    {
        return i;
    }

    public static c a(Object obj)
    {
        boolean flag;
        e e1;
        flag = false;
        e1 = com.google.analytics.b.a.a.c.F();
        if (obj instanceof c)
        {
            return (c)obj;
        }
        if (!(obj instanceof String)) goto _L2; else goto _L1
_L1:
        e1.a(h.a).a((String)obj);
_L4:
        if (flag)
        {
            e1.b(true);
        }
        return e1.c();
_L2:
        if (obj instanceof List)
        {
            e1.a(h.b);
            Iterator iterator1 = ((List)obj).iterator();
            boolean flag3 = false;
            while (iterator1.hasNext()) 
            {
                c c3 = a(iterator1.next());
                if (c3 == i)
                {
                    return i;
                }
                if (flag3 || c3.E())
                {
                    flag3 = true;
                } else
                {
                    flag3 = false;
                }
                e1.b(c3);
            }
            flag = flag3;
            continue; /* Loop/switch isn't completed */
        }
        if (obj instanceof Map)
        {
            e1.a(h.c);
            Iterator iterator = ((Map)obj).entrySet().iterator();
            boolean flag1 = false;
            while (iterator.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                c c1 = a(entry.getKey());
                c c2 = a(entry.getValue());
                if (c1 == i || c2 == i)
                {
                    return i;
                }
                boolean flag2;
                if (flag1 || c1.E() || c2.E())
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                e1.c(c1);
                e1.d(c2);
                flag1 = flag2;
            }
            flag = flag1;
            continue; /* Loop/switch isn't completed */
        }
        if (b(obj))
        {
            e1.a(h.a).a(obj.toString());
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        if (c(obj))
        {
            e1.a(h.f).a(d(obj));
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        if (!(obj instanceof Boolean))
        {
            break; /* Loop/switch isn't completed */
        }
        e1.a(h.h).a(((Boolean)obj).booleanValue());
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        StringBuilder stringbuilder = (new StringBuilder()).append("Converting to Value from unknown object type: ");
        String s;
        if (obj == null)
        {
            s = "null";
        } else
        {
            s = obj.getClass().toString();
        }
        com.google.tagmanager.i.a(stringbuilder.append(s).toString());
        return i;
    }

    private static boolean b(Object obj)
    {
        return (obj instanceof Double) || (obj instanceof Float) || (obj instanceof x) && ((x)obj).a();
    }

    private static boolean c(Object obj)
    {
        return (obj instanceof Byte) || (obj instanceof Short) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof x) && ((x)obj).b();
    }

    private static long d(Object obj)
    {
        if (obj instanceof Number)
        {
            return ((Number)obj).longValue();
        } else
        {
            com.google.tagmanager.i.a("getInt64 received non-Number");
            return 0L;
        }
    }

    static 
    {
        e = new String("");
        i = a(e);
    }
}
