// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.c;

import android.opengl.GLES20;

public class f
{

    public static final f a;
    public static final f b = new f(9729, 9729, 33071, 33071, false);
    public static final f c = new f(9728, 9728, 10497, 10497, false);
    public static final f d = new f(9729, 9729, 10497, 10497, false);
    public static final f e = new f(9728, 9728, 33071, 33071, true);
    public static final f f = new f(9729, 9729, 33071, 33071, true);
    public static final f g = new f(9728, 9728, 10497, 10497, true);
    public static final f h = new f(9729, 9729, 10497, 10497, true);
    public static final f i;
    public final int j;
    public final int k;
    public final float l;
    public final float m;
    public final boolean n;

    public f(int i1, int j1, int k1, int l1, boolean flag)
    {
        k = i1;
        j = j1;
        l = k1;
        m = l1;
        n = flag;
    }

    public void a()
    {
        GLES20.glTexParameterf(3553, 10241, k);
        GLES20.glTexParameterf(3553, 10240, j);
        GLES20.glTexParameterf(3553, 10242, m);
        GLES20.glTexParameterf(3553, 10243, l);
    }

    static 
    {
        a = new f(9728, 9728, 33071, 33071, false);
        i = a;
    }
}
