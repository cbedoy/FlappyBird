// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.d;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.andengine.d.i.a;
import org.andengine.opengl.d.a.c;
import org.andengine.opengl.util.BufferUtils;

// Referenced classes of package org.andengine.opengl.d:
//            d, e, a

public class b extends d
{

    protected final float a[];
    protected final FloatBuffer b;

    public b(e e, int i, org.andengine.opengl.d.a a1, boolean flag, c c)
    {
        super(e, i, a1, flag, c);
        a = new float[i];
        if (a.d)
        {
            b = f.asFloatBuffer();
            return;
        } else
        {
            b = null;
            return;
        }
    }

    protected void a()
    {
        if (a.d)
        {
            b.position(0);
            b.put(a);
            GLES20.glBufferData(34962, f.capacity(), f, e);
            return;
        } else
        {
            BufferUtils.a(f, a, a.length, 0);
            GLES20.glBufferData(34962, f.limit(), f, e);
            return;
        }
    }
}
