// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.b;

import android.opengl.GLES20;
import org.andengine.opengl.d.a.c;
import org.andengine.opengl.util.e;

// Referenced classes of package org.andengine.opengl.b:
//            g

public class a extends g
{

    public static int a = -1;
    private static a b;

    private a()
    {
        super("uniform mat4 u_modelViewProjectionMatrix;\nattribute vec4 a_position;\nattribute vec4 a_color;\nvarying vec4 v_color;\nvoid main() {\n\tgl_Position = u_modelViewProjectionMatrix * a_position;\n\tv_color = a_color;\n}", "precision lowp float;\nvarying vec4 v_color;\nvoid main() {\n\tgl_FragColor = v_color;\n}");
    }

    public static a a()
    {
        if (b == null)
        {
            b = new a();
        }
        return b;
    }

    protected void a(e e1)
    {
        GLES20.glBindAttribLocation(h, 0, "a_position");
        GLES20.glBindAttribLocation(h, 1, "a_color");
        super.a(e1);
        a = a("u_modelViewProjectionMatrix");
    }

    public void a(e e1, c c)
    {
        GLES20.glDisableVertexAttribArray(3);
        super.a(e1, c);
        GLES20.glUniformMatrix4fv(a, 1, false, e1.p(), 0);
    }

    public void b(e e1)
    {
        GLES20.glEnableVertexAttribArray(3);
        super.b(e1);
    }

}
