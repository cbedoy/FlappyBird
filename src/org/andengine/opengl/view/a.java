// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.view;

import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

// Referenced classes of package org.andengine.opengl.view:
//            b

public class a
    implements android.opengl.GLSurfaceView.EGLConfigChooser
{

    private static final int a[] = new int[1];
    private static final int b[];
    private static final int c[];
    private static final int d[];
    private final boolean e;
    private boolean f;
    private boolean g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;

    public a(boolean flag)
    {
        h = -1;
        i = -1;
        j = -1;
        k = -1;
        l = -1;
        m = -1;
        e = flag;
    }

    private static int a(EGL10 egl10, EGLDisplay egldisplay, EGLConfig eglconfig, int i1, int j1)
    {
        if (egl10.eglGetConfigAttrib(egldisplay, eglconfig, i1, a))
        {
            j1 = a[0];
        }
        return j1;
    }

    private static int a(EGL10 egl10, EGLDisplay egldisplay, int ai[])
    {
        if (!egl10.eglChooseConfig(egldisplay, ai, null, 0, a))
        {
            throw new IllegalArgumentException("EGLCONFIG_FALLBACK failed!");
        } else
        {
            return a[0];
        }
    }

    private EGLConfig a(EGL10 egl10, EGLDisplay egldisplay, b b1)
    {
        a[0] = 0;
        if (e)
        {
            int j1 = a(egl10, egldisplay, b);
            if (j1 > 0)
            {
                f = true;
                return a(egl10, egldisplay, b, j1, b1);
            }
            int k1 = a(egl10, egldisplay, c);
            if (k1 > 0)
            {
                g = true;
                return a(egl10, egldisplay, c, k1, b1);
            }
        }
        int i1 = a(egl10, egldisplay, d);
        if (i1 > 0)
        {
            return a(egl10, egldisplay, d, i1, b1);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("No ")).append(javax/microedition/khronos/egl/EGLConfig.getSimpleName()).append(" found!").toString());
        }
    }

    private EGLConfig a(EGL10 egl10, EGLDisplay egldisplay, int ai[], int i1, b b1)
    {
        EGLConfig aeglconfig[] = new EGLConfig[i1];
        if (!egl10.eglChooseConfig(egldisplay, ai, aeglconfig, i1, a))
        {
            throw new IllegalArgumentException("findEGLConfig failed!");
        } else
        {
            return a(egl10, egldisplay, aeglconfig, b1);
        }
    }

    private EGLConfig a(EGL10 egl10, EGLDisplay egldisplay, EGLConfig aeglconfig[], b b1)
    {
        int i1 = 0;
        do
        {
            if (i1 >= aeglconfig.length)
            {
                throw new IllegalArgumentException("No EGLConfig found!");
            }
            EGLConfig eglconfig = aeglconfig[i1];
            if (eglconfig != null)
            {
                int j1 = a(egl10, egldisplay, eglconfig, 12324, 0);
                int k1 = a(egl10, egldisplay, eglconfig, 12323, 0);
                int l1 = a(egl10, egldisplay, eglconfig, 12322, 0);
                int i2 = a(egl10, egldisplay, eglconfig, 12321, 0);
                int j2 = a(egl10, egldisplay, eglconfig, 12325, 0);
                int k2 = a(egl10, egldisplay, eglconfig, 12326, 0);
                if (b1.a(j1, k1, l1, i2, j2, k2))
                {
                    h = j1;
                    i = k1;
                    j = l1;
                    k = i2;
                    l = j2;
                    m = k2;
                    return eglconfig;
                }
            }
            i1++;
        } while (true);
    }

    public boolean a()
    {
        return g;
    }

    public int b()
    {
        return h;
    }

    public int c()
    {
        return i;
    }

    public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay egldisplay)
    {
        EGLConfig eglconfig2;
        try
        {
            eglconfig2 = a(egl10, egldisplay, b.a);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            EGLConfig eglconfig1;
            try
            {
                eglconfig1 = a(egl10, egldisplay, b.b);
            }
            catch (IllegalArgumentException illegalargumentexception1)
            {
                EGLConfig eglconfig;
                try
                {
                    eglconfig = a(egl10, egldisplay, b.c);
                }
                catch (IllegalArgumentException illegalargumentexception2)
                {
                    return a(egl10, egldisplay, b.d);
                }
                return eglconfig;
            }
            return eglconfig1;
        }
        return eglconfig2;
    }

    public int d()
    {
        return j;
    }

    public int e()
    {
        return k;
    }

    public int f()
    {
        return l;
    }

    public int g()
    {
        return m;
    }

    static 
    {
        int ai[] = new int[19];
        ai[0] = 12324;
        ai[1] = 5;
        ai[2] = 12323;
        ai[3] = 6;
        ai[4] = 12322;
        ai[5] = 5;
        ai[6] = 12321;
        ai[8] = 12325;
        ai[10] = 12326;
        ai[12] = 12352;
        ai[13] = 4;
        ai[14] = 12338;
        ai[15] = 1;
        ai[16] = 12337;
        ai[17] = 2;
        ai[18] = 12344;
        b = ai;
        int ai1[] = new int[19];
        ai1[0] = 12324;
        ai1[1] = 5;
        ai1[2] = 12323;
        ai1[3] = 6;
        ai1[4] = 12322;
        ai1[5] = 5;
        ai1[6] = 12321;
        ai1[8] = 12325;
        ai1[10] = 12326;
        ai1[12] = 12352;
        ai1[13] = 4;
        ai1[14] = 12512;
        ai1[15] = 1;
        ai1[16] = 12513;
        ai1[17] = 2;
        ai1[18] = 12344;
        c = ai1;
        int ai2[] = new int[15];
        ai2[0] = 12324;
        ai2[1] = 5;
        ai2[2] = 12323;
        ai2[3] = 6;
        ai2[4] = 12322;
        ai2[5] = 5;
        ai2[6] = 12321;
        ai2[8] = 12325;
        ai2[10] = 12326;
        ai2[12] = 12352;
        ai2[13] = 4;
        ai2[14] = 12344;
        d = ai2;
    }
}
