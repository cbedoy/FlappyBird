// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

// Referenced classes of package com.google.ads:
//            ag, aw, q, aq, 
//            ar

public abstract class ah
    implements ag
{

    protected MotionEvent a;
    protected DisplayMetrics b;
    private aw c;
    private ByteArrayOutputStream d;

    protected ah(Context context)
    {
        c = null;
        d = null;
        a = null;
        b = null;
        try
        {
            b = context.getResources().getDisplayMetrics();
            return;
        }
        catch (UnsupportedOperationException unsupportedoperationexception)
        {
            b = new DisplayMetrics();
        }
        b.density = 1.0F;
    }

    private String a(Context context, String s, boolean flag)
    {
        byte abyte0[];
        String s1;
        try
        {
            a();
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            return Integer.toString(7);
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            return Integer.toString(7);
        }
        catch (IOException ioexception)
        {
            return Integer.toString(3);
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        c(context);
_L4:
        abyte0 = b();
        if (abyte0.length == 0)
        {
            return Integer.toString(5);
        }
        break; /* Loop/switch isn't completed */
_L2:
        b(context);
        if (true) goto _L4; else goto _L3
_L3:
        s1 = a(abyte0, s);
        return s1;
    }

    private void a()
    {
        d = new ByteArrayOutputStream();
        c = aw.a(d);
    }

    private byte[] b()
    {
        c.a();
        return d.toByteArray();
    }

    public String a(Context context)
    {
        return a(context, ((String) (null)), false);
    }

    public String a(Context context, String s)
    {
        return a(context, s, true);
    }

    String a(byte abyte0[], String s)
    {
        if (abyte0.length > 239)
        {
            a();
            a(20, 1L);
            abyte0 = b();
        }
        byte abyte1[];
        MessageDigest messagedigest;
        byte abyte2[];
        byte abyte3[];
        byte abyte4[];
        if (abyte0.length < 239)
        {
            byte abyte5[] = new byte[239 - abyte0.length];
            (new SecureRandom()).nextBytes(abyte5);
            abyte1 = ByteBuffer.allocate(240).put((byte)abyte0.length).put(abyte0).put(abyte5).array();
        } else
        {
            abyte1 = ByteBuffer.allocate(240).put((byte)abyte0.length).put(abyte0).array();
        }
        messagedigest = MessageDigest.getInstance("MD5");
        messagedigest.update(abyte1);
        abyte2 = messagedigest.digest();
        abyte3 = ByteBuffer.allocate(256).put(abyte2).put(abyte1).array();
        abyte4 = new byte[256];
        (new q()).a(abyte3, abyte4);
        if (s != null && s.length() > 0)
        {
            a(s, abyte4);
        }
        return aq.a(abyte4, false);
    }

    public void a(int i, int j, int k)
    {
        if (a != null)
        {
            a.recycle();
        }
        a = MotionEvent.obtain(0L, k, 1, (float)i * b.density, (float)j * b.density, 0.0F, 0.0F, 0, 0.0F, 0.0F, 0, 0);
    }

    protected void a(int i, long l)
    {
        c.a(i, l);
    }

    protected void a(int i, String s)
    {
        c.a(i, s);
    }

    public void a(MotionEvent motionevent)
    {
        if (motionevent.getAction() == 1)
        {
            if (a != null)
            {
                a.recycle();
            }
            a = MotionEvent.obtain(motionevent);
        }
    }

    void a(String s, byte abyte0[])
    {
        if (s.length() > 32)
        {
            s = s.substring(0, 32);
        }
        (new ar(s.getBytes("UTF-8"))).a(abyte0);
    }

    protected abstract void b(Context context);

    protected abstract void c(Context context);
}
