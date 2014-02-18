// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.d.a;

import android.opengl.GLES20;

public class a
{

    final int a;
    final String b;
    final int c;
    final int d;
    final boolean e;
    final int f;

    public a(int i, String s, int j, int k, boolean flag, int l)
    {
        a = i;
        b = s;
        c = j;
        d = k;
        e = flag;
        f = l;
    }

    public void a(int i)
    {
        GLES20.glVertexAttribPointer(a, c, d, e, i, f);
    }
}
