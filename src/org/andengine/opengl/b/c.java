// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.b;

import android.opengl.GLES20;
import org.andengine.opengl.util.e;

// Referenced classes of package org.andengine.opengl.b:
//            g

public class c extends g
{

    public static int a = -1;
    public static int b = -1;
    public static int c = -1;
    public static int d = -1;
    public static int e = -1;
    private static c l;

    private c()
    {
        super("uniform mat4 u_modelViewProjectionMatrix;\nuniform float u_position_interpolation_mix_0;\nattribute vec4 a_position_0;\nattribute vec4 a_position_1;\nattribute vec2 a_textureCoordinates;\nvarying vec2 v_textureCoordinates;\nvoid main() {\n\tvec4 position = vec4(0, 0, 0, 1);\n\tposition.xy = mix(a_position_0.xy,a_position_1.xy,u_position_interpolation_mix_0);\n\tv_textureCoordinates = a_textureCoordinates;\n\tgl_Position = u_modelViewProjectionMatrix * position;\n}", "precision lowp float;\nuniform sampler2D u_texture_0;\nuniform sampler2D u_texture_1;\nuniform bool u_textureselect_texture_0;\nvarying mediump vec2 v_textureCoordinates;\nvoid main() {\n\tif(u_textureselect_texture_0) {\n\t\tgl_FragColor = texture2D(u_texture_0, v_textureCoordinates);\n\t} else {\n\t\tgl_FragColor = texture2D(u_texture_1, v_textureCoordinates);\n\t}\n}");
    }

    public static c a()
    {
        if (l == null)
        {
            l = new c();
        }
        return l;
    }

    protected void a(e e1)
    {
        GLES20.glBindAttribLocation(h, 4, "a_position_0");
        GLES20.glBindAttribLocation(h, 5, "a_position_1");
        GLES20.glBindAttribLocation(h, 3, "a_textureCoordinates");
        super.a(e1);
        a = a("u_modelViewProjectionMatrix");
        b = a("u_texture_0");
        c = a("u_texture_1");
        d = a("u_textureselect_texture_0");
        e = a("u_position_interpolation_mix_0");
    }

    public void a(e e1, org.andengine.opengl.d.a.c c1)
    {
        GLES20.glDisableVertexAttribArray(1);
        GLES20.glDisableVertexAttribArray(0);
        GLES20.glEnableVertexAttribArray(4);
        GLES20.glEnableVertexAttribArray(5);
        super.a(e1, c1);
        GLES20.glUniformMatrix4fv(a, 1, false, e1.p(), 0);
        GLES20.glUniform1i(b, 0);
        GLES20.glUniform1i(c, 1);
    }

    public void b(e e1)
    {
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glDisableVertexAttribArray(4);
        GLES20.glDisableVertexAttribArray(5);
        super.b(e1);
    }

}
