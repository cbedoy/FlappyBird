// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

// Referenced classes of package com.google.tagmanager:
//            i, n

class m
{

    private static m a;
    private volatile n b;
    private volatile String c;
    private volatile String d;
    private volatile String e;

    m()
    {
        e();
    }

    static m a()
    {
        com/google/tagmanager/m;
        JVM INSTR monitorenter ;
        m m1;
        if (a == null)
        {
            a = new m();
        }
        m1 = a;
        com/google/tagmanager/m;
        JVM INSTR monitorexit ;
        return m1;
        Exception exception;
        exception;
        com/google/tagmanager/m;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private String a(String s)
    {
        return s.split("&")[0].split("=")[1];
    }

    private String b(Uri uri)
    {
        return uri.getQuery().replace("&gtm_debug=x", "");
    }

    boolean a(Uri uri)
    {
        boolean flag = true;
        this;
        JVM INSTR monitorenter ;
        String s = URLDecoder.decode(uri.toString(), "UTF-8");
        if (!s.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_auth=\\S+&gtm_preview=\\d+(&gtm_debug=x)?$")) goto _L2; else goto _L1
_L1:
        i.d((new StringBuilder()).append("Container preview url: ").append(s).toString());
        if (!s.matches(".*?&gtm_debug=x$")) goto _L4; else goto _L3
_L3:
        b = n.c;
_L6:
        e = b(uri);
        if (b == n.b || b == n.c)
        {
            d = (new StringBuilder()).append("/r?").append(e).toString();
        }
        c = a(e);
_L5:
        this;
        JVM INSTR monitorexit ;
        return flag;
        UnsupportedEncodingException unsupportedencodingexception;
        unsupportedencodingexception;
        flag = false;
          goto _L5
_L4:
        b = n.b;
          goto _L6
        Exception exception;
        exception;
        throw exception;
_L2:
label0:
        {
            if (!s.matches("^tagmanager.c.\\S+:\\/\\/preview\\/p\\?id=\\S+&gtm_preview=$"))
            {
                break label0;
            }
            if (!a(uri.getQuery()).equals(c))
            {
                break MISSING_BLOCK_LABEL_254;
            }
            i.d((new StringBuilder()).append("Exit preview mode for container: ").append(c).toString());
            b = n.a;
            d = null;
        }
          goto _L5
        i.b((new StringBuilder()).append("Invalid preview uri: ").append(s).toString());
        flag = false;
          goto _L5
        flag = false;
          goto _L5
    }

    n b()
    {
        return b;
    }

    String c()
    {
        return d;
    }

    String d()
    {
        return c;
    }

    void e()
    {
        b = n.a;
        d = null;
        c = null;
        e = null;
    }
}
