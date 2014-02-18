// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.d.a;

import org.andengine.opengl.GLES20Fix;

// Referenced classes of package org.andengine.opengl.d.a:
//            a

public class b extends a
{

    public b(int i, String s, int j, int k, boolean flag, int l)
    {
        super(i, s, j, k, flag, l);
    }

    public void a(int i)
    {
        GLES20Fix.glVertexAttribPointer(a, c, d, e, i, f);
    }
}
