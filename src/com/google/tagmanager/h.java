// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.tagmanager:
//            p

class h
{

    static Map a = new HashMap();
    private static String b;

    h()
    {
    }

    static String a(String s, String s1)
    {
        if (s1 == null)
        {
            if (s.length() > 0)
            {
                return s;
            } else
            {
                return null;
            }
        } else
        {
            return Uri.parse((new StringBuilder()).append("http://hostname/?").append(s).toString()).getQueryParameter(s1);
        }
    }

    static void a(Context context, String s)
    {
        p.a(context, "gtm_install_referrer", "referrer", s);
        b(context, s);
    }

    static void a(String s)
    {
        com/google/tagmanager/h;
        JVM INSTR monitorenter ;
        b = s;
        com/google/tagmanager/h;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        com/google/tagmanager/h;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static void b(Context context, String s)
    {
        String s1 = a(s, "conv");
        if (s1 != null && s1.length() > 0)
        {
            a.put(s1, s);
            p.a(context, "gtm_click_referrers", s1, s);
        }
    }

}
