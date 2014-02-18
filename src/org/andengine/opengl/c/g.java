// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.c;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import org.andengine.opengl.d.a;
import org.andengine.opengl.d.a.c;
import org.andengine.opengl.d.d;
import org.andengine.opengl.util.e;

// Referenced classes of package org.andengine.opengl.c:
//            a

public class g extends d
{

    public static final c a = (new org.andengine.opengl.d.a.d(2)).a(0, "a_position", 2, 5126, false).a(3, "a_textureCoordinates", 2, 5126, false).a();
    protected final FloatBuffer b;

    public g()
    {
        super(null, 12, a.a, true, a);
        b = f.asFloatBuffer();
        b.put(0, 0.0F);
        b.put(1, 0.0F);
        b.put(2, 0.0F);
        b.put(3, 0.0F);
        b.put(4, 1.0F);
        b.put(5, 0.0F);
        b.put(6, 1.0F);
        b.put(7, 0.0F);
        b.put(8, 0.0F);
        b.put(9, 1.0F);
        b.put(10, 0.0F);
        b.put(11, 1.0F);
    }

    protected void a()
    {
        GLES20.glBufferData(34962, f.limit(), f, e);
    }

    public void a(e e1, org.andengine.opengl.c.a a1)
    {
        a1.d(e1);
        a(e1, ((org.andengine.opengl.b.g) (org.andengine.opengl.b.d.a())));
        e1.j();
        e1.l();
        e1.a(1000000F, 1000000F, 0.0F);
        e1.a(1E-04F, 1E-04F, 0);
        a(4, 3);
        e1.k();
        b(e1, org.andengine.opengl.b.d.a());
    }

}
