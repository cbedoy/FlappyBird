// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.b;

import android.opengl.GLES20;
import org.andengine.opengl.d.a.c;

// Referenced classes of package org.andengine.opengl.b:
//            g

public class e extends g
{

    public static int a = -1;
    public static int b = -1;
    public static int c = -1;
    public static int d = -1;
    private static e e;

    private e()
    {
        super("uniform mat4 u_modelViewProjectionMatrix;\nattribute vec4 a_position;\nattribute vec2 a_textureCoordinates;\nvarying vec2 v_textureCoordinates;\nvoid main() {\n\tv_textureCoordinates = a_textureCoordinates;\n\tgl_Position = u_modelViewProjectionMatrix * a_position;\n}", "precision lowp float;\nuniform sampler2D u_texture_0;\nuniform sampler2D u_texture_1;\nuniform bool u_textureselect_texture_0;\nvarying mediump vec2 v_textureCoordinates;\nvoid main() {\n\tif(u_textureselect_texture_0) {\n\t\tgl_FragColor = texture2D(u_texture_0, v_textureCoordinates);\n\t} else {\n\t\tgl_FragColor = texture2D(u_texture_1, v_textureCoordinates);\n\t}\n}");
    }

    public static e a()
    {
        if (e == null)
        {
            e = new e();
        }
        return e;
    }

    protected void a(org.andengine.opengl.util.e e1)
    {
        GLES20.glBindAttribLocation(h, 0, "a_position");
        GLES20.glBindAttribLocation(h, 3, "a_textureCoordinates");
        super.a(e1);
        a = a("u_modelViewProjectionMatrix");
        b = a("u_texture_0");
        c = a("u_texture_1");
        d = a("u_textureselect_texture_0");
    }

    public void a(org.andengine.opengl.util.e e1, c c1)
    {
        GLES20.glDisableVertexAttribArray(1);
        super.a(e1, c1);
        GLES20.glUniformMatrix4fv(a, 1, false, e1.p(), 0);
        GLES20.glUniform1i(b, 0);
        GLES20.glUniform1i(c, 1);
    }

    public void b(org.andengine.opengl.util.e e1)
    {
        GLES20.glEnableVertexAttribArray(1);
        super.b(e1);
    }

}
