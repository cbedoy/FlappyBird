// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.a;

import org.andengine.d.d.a;

public class b
{

    private static final int a;
    private static String b = "";

    public static void a()
    {
        a("");
    }

    public static void a(String s)
    {
        if (s.endsWith("/") || s.length() == 0)
        {
            b = s;
            return;
        } else
        {
            throw new IllegalStateException("pAssetBasePath must end with '/' or be lenght zero.");
        }
    }

    static 
    {
        a = a.C;
    }
}
