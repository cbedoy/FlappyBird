// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.tagmanager.a:
//            ad, bj

public class ac
{

    public static final byte a[];
    public static final ByteBuffer b;

    public static int a(long l)
    {
        return (int)(l ^ l >>> 32);
    }

    public static int a(ad ad1)
    {
        return ad1.a();
    }

    public static int a(List list)
    {
        Iterator iterator = list.iterator();
        int i;
        ad ad1;
        for (i = 1; iterator.hasNext(); i = i * 31 + a(ad1))
        {
            ad1 = (ad)iterator.next();
        }

        return i;
    }

    public static int a(boolean flag)
    {
        return !flag ? 1237 : 1231;
    }

    public static boolean a(byte abyte0[])
    {
        return bj.a(abyte0);
    }

    public static String b(byte abyte0[])
    {
        String s;
        try
        {
            s = new String(abyte0, "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            throw new RuntimeException("UTF-8 not supported?", unsupportedencodingexception);
        }
        return s;
    }

    static 
    {
        a = new byte[0];
        b = ByteBuffer.wrap(a);
    }
}
