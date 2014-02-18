// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.util;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.nio.ByteOrder;
import java.util.Arrays;
import javax.microedition.khronos.egl.EGLConfig;
import org.andengine.b.c.d;
import org.andengine.d.e.a;
import org.andengine.opengl.c.c;

// Referenced classes of package org.andengine.opengl.util:
//            b, a

public class e
{

    private final float A[] = new float[16];
    private final float B[] = new float[16];
    private final int a[] = new int[1];
    private String b;
    private String c;
    private String d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private final int m[] = new int[31];
    private int n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private float w;
    private final b x = new b();
    private final b y = new b();
    private final float z[] = new float[16];

    public e()
    {
        j = -1;
        k = -1;
        l = -1;
        n = -1;
        o = 0;
        p = -1;
        q = -1;
        r = true;
        s = true;
        t = false;
        u = false;
        v = false;
        w = 1.0F;
    }

    public void a(float f1, float f2)
    {
        x.a(f1, f2);
    }

    public void a(float f1, float f2, float f3)
    {
        x.a(f1, f2, f3);
    }

    public void a(float f1, float f2, float f3, float f4)
    {
        x.a(f1, f2, f3, f4);
    }

    public void a(float f1, float f2, float f3, float f4, float f5, float f6)
    {
        y.a(f1, f2, f3, f4, f5, f6);
    }

    public void a(float f1, float f2, int i1)
    {
        x.b(f1, f2, i1);
    }

    public void a(int i1)
    {
        if (j != i1)
        {
            j = i1;
            GLES20.glBindBuffer(34962, i1);
        }
    }

    public void a(int i1, int j1)
    {
        if (p != i1 || q != j1)
        {
            p = i1;
            q = j1;
            GLES20.glBlendFunc(i1, j1);
        }
    }

    public void a(int i1, int j1, int k1, int l1, Bitmap bitmap, c c1)
    {
        java.nio.Buffer buffer = org.andengine.opengl.util.a.a(bitmap, c1, ByteOrder.BIG_ENDIAN);
        GLES20.glTexSubImage2D(i1, j1, k1, l1, bitmap.getWidth(), bitmap.getHeight(), c1.b(), c1.c(), buffer);
    }

    public void a(d d1, org.andengine.opengl.view.a a1, EGLConfig eglconfig)
    {
        b = GLES20.glGetString(7938);
        c = GLES20.glGetString(7937);
        d = GLES20.glGetString(7939);
        e = f(34921);
        f = f(36347);
        g = f(36349);
        i = f(34930);
        h = f(3379);
        org.andengine.d.e.a.b((new StringBuilder("VERSION: ")).append(b).toString());
        org.andengine.d.e.a.b((new StringBuilder("RENDERER: ")).append(c).toString());
        org.andengine.d.e.a.b((new StringBuilder("EGLCONFIG: ")).append(javax/microedition/khronos/egl/EGLConfig.getSimpleName()).append("(Red=").append(a1.b()).append(", Green=").append(a1.c()).append(", Blue=").append(a1.d()).append(", Alpha=").append(a1.e()).append(", Depth=").append(a1.f()).append(", Stencil=").append(a1.g()).append(")").toString());
        org.andengine.d.e.a.b((new StringBuilder("EXTENSIONS: ")).append(d).toString());
        org.andengine.d.e.a.b((new StringBuilder("MAX_VERTEX_ATTRIBS: ")).append(e).toString());
        org.andengine.d.e.a.b((new StringBuilder("MAX_VERTEX_UNIFORM_VECTORS: ")).append(f).toString());
        org.andengine.d.e.a.b((new StringBuilder("MAX_FRAGMENT_UNIFORM_VECTORS: ")).append(g).toString());
        org.andengine.d.e.a.b((new StringBuilder("MAX_TEXTURE_IMAGE_UNITS: ")).append(i).toString());
        org.andengine.d.e.a.b((new StringBuilder("MAX_TEXTURE_SIZE: ")).append(h).toString());
        x.d();
        y.d();
        j = -1;
        k = -1;
        l = -1;
        Arrays.fill(m, -1);
        n = -1;
        o = 0;
        p = -1;
        q = -1;
        d();
        f();
        b();
        c();
        GLES20.glEnableVertexAttribArray(0);
        GLES20.glEnableVertexAttribArray(1);
        GLES20.glEnableVertexAttribArray(3);
        w = 1.0F;
    }

    public boolean a()
    {
        if (u)
        {
            return true;
        } else
        {
            u = true;
            GLES20.glEnable(3042);
            return false;
        }
    }

    public boolean a(boolean flag)
    {
        if (flag)
        {
            return d();
        } else
        {
            return e();
        }
    }

    public void b(float f1, float f2, float f3)
    {
        y.a(f1, f2, f3);
    }

    public void b(float f1, float f2, float f3, float f4)
    {
        y.a(f1, f2, f3, f4);
    }

    public void b(int i1)
    {
        if (j == i1)
        {
            j = -1;
        }
        a[0] = i1;
        GLES20.glDeleteBuffers(1, a, 0);
    }

    public boolean b()
    {
        if (!u)
        {
            return false;
        } else
        {
            u = false;
            GLES20.glDisable(3042);
            return true;
        }
    }

    public void c(int i1)
    {
        if (l != i1)
        {
            l = i1;
            GLES20.glUseProgram(i1);
        }
    }

    public boolean c()
    {
        if (!v)
        {
            return false;
        } else
        {
            v = false;
            GLES20.glDisable(2884);
            return true;
        }
    }

    public void d(int i1)
    {
        if (m[o] != i1)
        {
            m[o] = i1;
            GLES20.glBindTexture(3553, i1);
        }
    }

    public boolean d()
    {
        if (r)
        {
            return true;
        } else
        {
            r = true;
            GLES20.glEnable(3024);
            return false;
        }
    }

    public void e(int i1)
    {
        if (m[o] == i1)
        {
            m[o] = -1;
        }
        a[0] = i1;
        GLES20.glDeleteTextures(1, a, 0);
    }

    public boolean e()
    {
        if (!r)
        {
            return false;
        } else
        {
            r = false;
            GLES20.glDisable(3024);
            return true;
        }
    }

    public int f(int i1)
    {
        GLES20.glGetIntegerv(i1, a, 0);
        return a[0];
    }

    public boolean f()
    {
        if (s)
        {
            return true;
        } else
        {
            s = true;
            GLES20.glEnable(2929);
            return false;
        }
    }

    public boolean g()
    {
        if (!s)
        {
            return false;
        } else
        {
            s = false;
            GLES20.glDisable(2929);
            return true;
        }
    }

    public int h()
    {
        GLES20.glGenBuffers(1, a, 0);
        return a[0];
    }

    public int i()
    {
        GLES20.glGenTextures(1, a, 0);
        return a[0];
    }

    public void j()
    {
        x.b();
    }

    public void k()
    {
        x.c();
    }

    public void l()
    {
        x.a();
    }

    public void m()
    {
        y.b();
    }

    public void n()
    {
        y.c();
    }

    public void o()
    {
        y.a();
    }

    public float[] p()
    {
        Matrix.multiplyMM(B, 0, y.a, y.b, x.a, x.b);
        return B;
    }
}
