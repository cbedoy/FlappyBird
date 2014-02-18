// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;

// Referenced classes of package com.google.ads:
//            ah, aj, an, ap, 
//            am, aq, ao

public class ai extends ah
{

    static boolean c = false;
    private static Method d = null;
    private static Method e = null;
    private static Method f = null;
    private static Method g = null;
    private static Method h = null;
    private static String i = null;
    private static long j = 0L;

    protected ai(Context context)
    {
        super(context);
    }

    public static ai a(String s, Context context)
    {
        b(s, context);
        return new ai(context);
    }

    static String a()
    {
        if (i == null)
        {
            throw new aj();
        } else
        {
            return i;
        }
    }

    static ArrayList a(MotionEvent motionevent, DisplayMetrics displaymetrics)
    {
        if (g == null || motionevent == null)
        {
            throw new aj();
        }
        ArrayList arraylist;
        try
        {
            arraylist = (ArrayList)g.invoke(null, new Object[] {
                motionevent, displaymetrics
            });
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new aj(illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new aj(invocationtargetexception);
        }
        return arraylist;
    }

    static Long b()
    {
        if (d == null)
        {
            throw new aj();
        }
        Long long1;
        try
        {
            long1 = (Long)d.invoke(null, new Object[0]);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new aj(illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new aj(invocationtargetexception);
        }
        return long1;
    }

    private static String b(byte abyte0[], String s)
    {
        String s1;
        try
        {
            s1 = new String(am.a(abyte0, s), "UTF-8");
        }
        catch (an an1)
        {
            throw new aj(an1);
        }
        catch (ap ap1)
        {
            throw new aj(ap1);
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            throw new aj(unsupportedencodingexception);
        }
        return s1;
    }

    protected static void b(String s, Context context)
    {
        com/google/ads/ai;
        JVM INSTR monitorenter ;
        boolean flag = c;
        Exception exception;
        if (!flag)
        {
            try
            {
                i = s;
                f(context);
                j = b().longValue();
                c = true;
            }
            catch (aj aj1) { }
            catch (UnsupportedOperationException unsupportedoperationexception) { }
            finally
            {
                com/google/ads/ai;
            }
        }
        com/google/ads/ai;
        JVM INSTR monitorexit ;
        return;
        throw exception;
    }

    static String c()
    {
        if (e == null)
        {
            throw new aj();
        }
        String s;
        try
        {
            s = (String)e.invoke(null, new Object[0]);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new aj(illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new aj(invocationtargetexception);
        }
        return s;
    }

    static String d(Context context)
    {
        String s;
        if (h == null)
        {
            throw new aj();
        }
        try
        {
            s = (String)h.invoke(null, new Object[] {
                context
            });
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new aj(illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new aj(invocationtargetexception);
        }
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        throw new aj();
        return s;
    }

    static String e(Context context)
    {
        if (f == null)
        {
            throw new aj();
        }
        ByteBuffer bytebuffer;
        String s;
        try
        {
            bytebuffer = (ByteBuffer)f.invoke(null, new Object[] {
                context
            });
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw new aj(illegalaccessexception);
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            throw new aj(invocationtargetexception);
        }
        if (bytebuffer != null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        throw new aj();
        s = aq.a(bytebuffer.array(), false);
        return s;
    }

    private static void f(Context context)
    {
        byte abyte0[];
        byte abyte1[];
        File file;
        File file1;
        FileOutputStream fileoutputstream;
        DexClassLoader dexclassloader;
        Class class1;
        Class class2;
        Class class3;
        Class class4;
        Class class5;
        String s;
        try
        {
            abyte0 = am.a(ao.a());
            abyte1 = am.a(abyte0, ao.b());
            file = context.getCacheDir();
        }
        catch (ap ap1)
        {
            throw new aj(ap1);
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            throw new aj(filenotfoundexception);
        }
        catch (IOException ioexception)
        {
            throw new aj(ioexception);
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            throw new aj(classnotfoundexception);
        }
        catch (an an1)
        {
            throw new aj(an1);
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            throw new aj(nosuchmethodexception);
        }
        catch (NullPointerException nullpointerexception)
        {
            throw new aj(nullpointerexception);
        }
        if (file != null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        file = context.getDir("dex", 0);
        if (file != null)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        throw new aj();
        file1 = File.createTempFile("ads", ".jar", file);
        fileoutputstream = new FileOutputStream(file1);
        fileoutputstream.write(abyte1, 0, abyte1.length);
        fileoutputstream.close();
        dexclassloader = new DexClassLoader(file1.getAbsolutePath(), file.getAbsolutePath(), null, context.getClassLoader());
        class1 = dexclassloader.loadClass(b(abyte0, ao.c()));
        class2 = dexclassloader.loadClass(b(abyte0, ao.i()));
        class3 = dexclassloader.loadClass(b(abyte0, ao.g()));
        class4 = dexclassloader.loadClass(b(abyte0, ao.k()));
        class5 = dexclassloader.loadClass(b(abyte0, ao.e()));
        d = class1.getMethod(b(abyte0, ao.d()), new Class[0]);
        e = class2.getMethod(b(abyte0, ao.j()), new Class[0]);
        f = class3.getMethod(b(abyte0, ao.h()), new Class[] {
            android/content/Context
        });
        g = class4.getMethod(b(abyte0, ao.l()), new Class[] {
            android/view/MotionEvent, android/util/DisplayMetrics
        });
        h = class5.getMethod(b(abyte0, ao.f()), new Class[] {
            android/content/Context
        });
        s = file1.getName();
        file1.delete();
        (new File(file, s.replace(".jar", ".dex"))).delete();
        return;
    }

    protected void b(Context context)
    {
        IOException ioexception;
        try
        {
            a(1, c());
        }
        catch (aj aj1) { }
        try
        {
            a(2, a());
        }
        catch (aj aj2) { }
        try
        {
            a(25, b().longValue());
        }
        catch (aj aj3) { }
        try
        {
            a(24, d(context));
            return;
        }
        catch (aj aj4)
        {
            return;
        }
        ioexception;
    }

    protected void c(Context context)
    {
        IOException ioexception;
        try
        {
            a(2, a());
        }
        catch (aj aj1) { }
        try
        {
            a(1, c());
        }
        catch (aj aj2) { }
        try
        {
            long l = b().longValue();
            a(25, l);
            if (j != 0L)
            {
                a(17, l - j);
                a(23, j);
            }
        }
        catch (aj aj3) { }
        try
        {
            ArrayList arraylist = a(a, b);
            a(14, ((Long)arraylist.get(0)).longValue());
            a(15, ((Long)arraylist.get(1)).longValue());
            if (arraylist.size() >= 3)
            {
                a(16, ((Long)arraylist.get(2)).longValue());
            }
        }
        catch (aj aj4) { }
        try
        {
            a(27, e(context));
            return;
        }
        catch (aj aj5)
        {
            return;
        }
        ioexception;
    }

}
