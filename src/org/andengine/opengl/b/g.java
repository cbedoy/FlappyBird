// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.b;

import android.opengl.GLES20;
import java.util.HashMap;
import org.andengine.opengl.b.a.a;
import org.andengine.opengl.b.a.c;
import org.andengine.opengl.b.b.b;
import org.andengine.opengl.util.e;

public class g
{

    private static final int a[] = new int[1];
    private static final int b[] = new int[1];
    private static final int c[] = new int[1];
    private static final int d[] = new int[1];
    private static final int e[] = new int[1];
    private static final byte l[] = new byte[64];
    protected final org.andengine.opengl.b.b.a f;
    protected final org.andengine.opengl.b.b.a g;
    protected int h;
    protected boolean i;
    protected final HashMap j;
    protected final HashMap k;

    public g(String s, String s1)
    {
        this(((org.andengine.opengl.b.b.a) (new b(s))), ((org.andengine.opengl.b.b.a) (new b(s1))));
    }

    public g(org.andengine.opengl.b.b.a a1, org.andengine.opengl.b.b.a a2)
    {
        h = -1;
        j = new HashMap();
        k = new HashMap();
        f = a1;
        g = a2;
    }

    private static int a(String s, int i1)
    {
        int j1 = GLES20.glCreateShader(i1);
        if (j1 == 0)
        {
            throw new org.andengine.opengl.b.a.b((new StringBuilder("Could not create Shader of type: '")).append(i1).append('"').toString());
        }
        GLES20.glShaderSource(j1, s);
        GLES20.glCompileShader(j1);
        GLES20.glGetShaderiv(j1, 35713, a, 0);
        if (a[0] == 0)
        {
            throw new a(GLES20.glGetShaderInfoLog(j1), s);
        } else
        {
            return j1;
        }
    }

    private void a()
    {
        int i1;
        int j1;
        j.clear();
        b[0] = 0;
        GLES20.glGetProgramiv(h, 35718, b, 0);
        i1 = b[0];
        j1 = 0;
_L6:
        int k1;
        if (j1 >= i1)
        {
            return;
        }
        GLES20.glGetActiveUniform(h, j1, 64, c, 0, d, 0, e, 0, l, 0);
        k1 = c[0];
        if (k1 != 0) goto _L2; else goto _L1
_L1:
        if (k1 < 64 && l[k1] != 0) goto _L3; else goto _L2
_L2:
        String s;
        int l1;
        int i2;
        s = new String(l, 0, k1);
        l1 = GLES20.glGetUniformLocation(h, s);
        if (l1 != -1)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        i2 = 0;
_L4:
        if (i2 >= 64 || l[i2] == 0)
        {
            s = new String(l, 0, i2);
            l1 = GLES20.glGetUniformLocation(h, s);
            if (l1 == -1)
            {
                throw new c((new StringBuilder("Invalid location for uniform: '")).append(s).append("'.").toString());
            }
            break MISSING_BLOCK_LABEL_214;
        }
        break MISSING_BLOCK_LABEL_208;
_L3:
        k1++;
          goto _L1
        i2++;
          goto _L4
        j.put(s, Integer.valueOf(l1));
        j1++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void c()
    {
        int i1;
        int j1;
        k.clear();
        b[0] = 0;
        GLES20.glGetProgramiv(h, 35721, b, 0);
        i1 = b[0];
        j1 = 0;
_L6:
        int k1;
        if (j1 >= i1)
        {
            return;
        }
        GLES20.glGetActiveAttrib(h, j1, 64, c, 0, d, 0, e, 0, l, 0);
        k1 = c[0];
        if (k1 != 0) goto _L2; else goto _L1
_L1:
        if (k1 < 64 && l[k1] != 0) goto _L3; else goto _L2
_L2:
        String s;
        int l1;
        int i2;
        s = new String(l, 0, k1);
        l1 = GLES20.glGetAttribLocation(h, s);
        if (l1 != -1)
        {
            break MISSING_BLOCK_LABEL_214;
        }
        i2 = 0;
_L4:
        if (i2 >= 64 || l[i2] == 0)
        {
            s = new String(l, 0, i2);
            l1 = GLES20.glGetAttribLocation(h, s);
            if (l1 == -1)
            {
                throw new c((new StringBuilder("Invalid location for attribute: '")).append(s).append("'.").toString());
            }
            break MISSING_BLOCK_LABEL_214;
        }
        break MISSING_BLOCK_LABEL_208;
_L3:
        k1++;
          goto _L1
        i2++;
          goto _L4
        k.put(s, Integer.valueOf(l1));
        j1++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public int a(String s)
    {
        Integer integer = (Integer)j.get(s);
        if (integer != null)
        {
            return integer.intValue();
        } else
        {
            throw new org.andengine.opengl.b.a.b((new StringBuilder("Unexpected uniform: '")).append(s).append("'. Existing uniforms: ").append(j.toString()).toString());
        }
    }

    protected void a(e e1)
    {
        GLES20.glLinkProgram(h);
        GLES20.glGetProgramiv(h, 35714, a, 0);
        if (a[0] == 0)
        {
            throw new c(GLES20.glGetProgramInfoLog(h));
        } else
        {
            c();
            a();
            i = true;
            return;
        }
    }

    public void a(e e1, org.andengine.opengl.d.a.c c1)
    {
        if (!i)
        {
            c(e1);
        }
        e1.c(h);
        c1.a();
    }

    public void a(boolean flag)
    {
        i = flag;
    }

    public void b(e e1)
    {
    }

    public boolean b()
    {
        return i;
    }

    protected void c(e e1)
    {
        String s = f.a(e1);
        int i1 = a(s, 35633);
        String s1 = g.a(e1);
        int j1 = a(s1, 35632);
        h = GLES20.glCreateProgram();
        GLES20.glAttachShader(h, i1);
        GLES20.glAttachShader(h, j1);
        try
        {
            a(e1);
        }
        catch (c c1)
        {
            throw new c((new StringBuilder("VertexShaderSource:\n##########################\n")).append(s).append("\n##########################").append("\n\nFragmentShaderSource:\n##########################\n").append(s1).append("\n##########################").toString(), c1);
        }
        GLES20.glDeleteShader(i1);
        GLES20.glDeleteShader(j1);
    }

}
