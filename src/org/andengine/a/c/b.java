// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.a.c;

import android.content.Context;
import android.content.res.AssetManager;
import android.media.SoundPool;

// Referenced classes of package org.andengine.a.c:
//            a, c

public class b
{

    private static String a = "";

    public static a a(c c1, Context context, String s)
    {
        c1;
        JVM INSTR monitorenter ;
        a a1;
        a1 = new a(c1, c1.c().load(context.getAssets().openFd((new StringBuilder(String.valueOf(a))).append(s).toString()), 1));
        c1.a(a1);
        c1;
        JVM INSTR monitorexit ;
        return a1;
        Exception exception;
        exception;
        c1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void a()
    {
        a("");
    }

    public static void a(String s)
    {
        if (s.endsWith("/") || s.length() == 0)
        {
            a = s;
            return;
        } else
        {
            throw new IllegalStateException("pAssetBasePath must end with '/' or be lenght zero.");
        }
    }

}
