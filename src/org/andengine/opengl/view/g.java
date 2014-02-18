// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.view;

import android.opengl.GLES20;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import org.andengine.b.a;
import org.andengine.b.c.b;
import org.andengine.b.c.d;
import org.andengine.opengl.util.e;

// Referenced classes of package org.andengine.opengl.view:
//            a, h

public class g
    implements android.opengl.GLSurfaceView.Renderer
{

    final a a;
    final org.andengine.opengl.view.a b;
    final boolean c;
    final h d;
    final e e = new e();

    public g(a a1, org.andengine.opengl.view.a a2, h h1)
    {
        a = a1;
        b = a2;
        d = h1;
        c = a.d().e().a();
    }

    public void onDrawFrame(GL10 gl10)
    {
        org/andengine/opengl/util/e;
        JVM INSTR monitorenter ;
        if (c && b.a())
        {
            GLES20.glClear(32768);
        }
        a.a(e);
_L1:
        org/andengine/opengl/util/e;
        JVM INSTR monitorexit ;
        return;
        InterruptedException interruptedexception;
        interruptedexception;
        org.andengine.d.e.a.b("GLThread interrupted!", interruptedexception);
          goto _L1
        Exception exception;
        exception;
        org/andengine/opengl/util/e;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onSurfaceChanged(GL10 gl10, int i, int j)
    {
        a.a(i, j);
        GLES20.glViewport(0, 0, i, j);
        e.o();
        if (d != null)
        {
            d.a(e, i, j);
        }
    }

    public void onSurfaceCreated(GL10 gl10, EGLConfig eglconfig)
    {
        org/andengine/opengl/util/e;
        JVM INSTR monitorenter ;
        d d1 = a.d().e();
        e.a(d1, b, eglconfig);
        e.g();
        e.a();
        e.a(d1.b());
        if (d != null)
        {
            d.a(e);
        }
        org/andengine/opengl/util/e;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        org/andengine/opengl/util/e;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
