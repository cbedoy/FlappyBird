// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.google.ads.b.a.a;
import com.google.ads.b.j;
import com.google.ads.util.AdUtil;
import com.google.ads.util.g;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.ads:
//            f

public class d
{

    public static final String a;
    private static final SimpleDateFormat b;
    private static Method c;
    private static Method d;
    private f e;
    private Date f;
    private Set g;
    private Map h;
    private final Map i = new HashMap();
    private Location j;
    private boolean k;
    private boolean l;
    private Set m;

    public d()
    {
        e = null;
        f = null;
        g = null;
        h = null;
        j = null;
        k = false;
        l = false;
        m = null;
    }

    public d a(j j1)
    {
        if (j1 != null)
        {
            i.put(j1.getClass(), j1);
        }
        return this;
    }

    public d a(Set set)
    {
        g = set;
        return this;
    }

    public Object a(Class class1)
    {
        return i.get(class1);
    }

    public Map a(Context context)
    {
        HashMap hashmap;
        hashmap = new HashMap();
        if (g != null)
        {
            hashmap.put("kw", g);
        }
        if (e != null)
        {
            hashmap.put("cust_gender", Integer.valueOf(e.ordinal()));
        }
        if (f != null)
        {
            hashmap.put("cust_age", b.format(f));
        }
        if (j != null)
        {
            hashmap.put("uule", AdUtil.a(j));
        }
        if (k)
        {
            hashmap.put("testing", Integer.valueOf(1));
        }
        if (!b(context)) goto _L2; else goto _L1
_L1:
        hashmap.put("adtest", "on");
_L8:
        a a1;
        com.google.ads.doubleclick.a a2;
        a1 = (a)a(com/google/ads/b/a/a);
        a2 = (com.google.ads.doubleclick.a)a(com/google/ads/doubleclick/a);
        if (a2 == null || a2.d() == null || a2.d().isEmpty()) goto _L4; else goto _L3
_L3:
        hashmap.put("extras", a2.d());
_L6:
        if (a2 != null)
        {
            String s1 = a2.a();
            if (!TextUtils.isEmpty(s1))
            {
                hashmap.put("ppid", s1);
            }
        }
        if (h != null)
        {
            hashmap.put("mediation_extras", h);
        }
        Map map;
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_317;
        }
        Object obj = c.invoke(null, new Object[0]);
        map = (Map)d.invoke(obj, new Object[0]);
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_317;
        }
        if (map.size() > 0)
        {
            hashmap.put("analytics_join_id", map);
        }
        return hashmap;
_L2:
        if (!l)
        {
            String s;
            if (AdUtil.c())
            {
                s = "AdRequest.TEST_EMULATOR";
            } else
            {
                s = (new StringBuilder()).append("\"").append(AdUtil.a(context)).append("\"").toString();
            }
            com.google.ads.util.g.c((new StringBuilder()).append("To get test ads on this device, call adRequest.addTestDevice(").append(s).append(");").toString());
            l = true;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (a1 != null && a1.d() != null && !a1.d().isEmpty())
        {
            hashmap.put("extras", a1.d());
        }
        if (true) goto _L6; else goto _L5
_L5:
        Throwable throwable;
        throwable;
        com.google.ads.util.g.c("Internal Analytics Error:", throwable);
        return hashmap;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public d b(Set set)
    {
        m = set;
        return this;
    }

    public boolean b(Context context)
    {
        String s;
        if (m != null)
        {
            s = AdUtil.a(context);
            break MISSING_BLOCK_LABEL_12;
        }
        do
        {
            return false;
        } while (s == null || !m.contains(s));
        return true;
    }

    static 
    {
        b = new SimpleDateFormat("yyyyMMdd");
        c = null;
        d = null;
        Method amethod[];
        int i1;
        amethod = Class.forName("com.google.analytics.tracking.android.AdMobInfo").getMethods();
        i1 = amethod.length;
        int j1 = 0;
_L8:
        if (j1 >= i1) goto _L2; else goto _L1
_L1:
        Method method = amethod[j1];
        if (!method.getName().equals("getInstance") || method.getParameterTypes().length != 0) goto _L4; else goto _L3
_L3:
        c = method;
          goto _L5
_L4:
        if (method.getName().equals("getJoinIds") && method.getParameterTypes().length == 0)
        {
            d = method;
        }
          goto _L5
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
        com.google.ads.util.g.a("No Google Analytics: Library Not Found.");
_L6:
        a = AdUtil.b("emulator");
        return;
_L2:
        if (c == null || d == null)
        {
            c = null;
            d = null;
            com.google.ads.util.g.e("No Google Analytics: Library Incompatible.");
        }
        continue; /* Loop/switch isn't completed */
        Throwable throwable;
        throwable;
        com.google.ads.util.g.a("No Google Analytics: Error Loading Library");
        if (true) goto _L6; else goto _L5
_L5:
        j1++;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
