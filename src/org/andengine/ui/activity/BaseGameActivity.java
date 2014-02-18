// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.ui.activity;

import android.os.Bundle;
import android.os.PowerManager;
import org.andengine.a.c.c;
import org.andengine.b.c.b;
import org.andengine.b.c.e;
import org.andengine.opengl.view.RenderSurfaceView;
import org.andengine.opengl.view.h;
import org.andengine.ui.a;

// Referenced classes of package org.andengine.ui.activity:
//            BaseActivity, d, c, b, 
//            a

public abstract class BaseGameActivity extends BaseActivity
    implements h, a
{

    private static int f[];
    private android.os.PowerManager.WakeLock a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    protected org.andengine.b.a k;
    protected RenderSurfaceView l;

    public BaseGameActivity()
    {
    }

    protected static android.widget.FrameLayout.LayoutParams B()
    {
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutparams.gravity = 17;
        return layoutparams;
    }

    static int[] C()
    {
        int ai[] = f;
        if (ai != null)
        {
            return ai;
        }
        int ai1[] = new int[org.andengine.b.c.e.values().length];
        try
        {
            ai1[e.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        try
        {
            ai1[e.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai1[e.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai1[e.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        f = ai1;
        return ai1;
    }

    private void a(org.andengine.b.c.h h1)
    {
        if (h1 == org.andengine.b.c.h.d)
        {
            org.andengine.d.a.b(this);
            return;
        }
        a = ((PowerManager)getSystemService("power")).newWakeLock(0x20000000 | h1.a(), "AndEngine");
        try
        {
            a.acquire();
            return;
        }
        catch (SecurityException securityexception)
        {
            org.andengine.d.e.a.b("You have to add\n\t<uses-permission android:name=\"android.permission.WAKE_LOCK\"/>\nto your AndroidManifest.xml !", securityexception);
        }
    }

    static void a(BaseGameActivity basegameactivity)
    {
        basegameactivity.c();
    }

    private void c()
    {
        runOnUiThread(new d(this));
    }

    private void d()
    {
        a(k.d().m());
    }

    private void e()
    {
        if (a != null && a.isHeld())
        {
            a.release();
        }
    }

    private void f()
    {
        b b1 = k.d();
        if (b1.f())
        {
            org.andengine.d.a.a(this);
        }
        if (b1.d().c() || b1.d().b())
        {
            setVolumeControlStream(3);
        }
        switch (C()[b1.g().ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            setRequestedOrientation(0);
            return;

        case 2: // '\002'
            if (org.andengine.d.i.a.c)
            {
                setRequestedOrientation(6);
                return;
            } else
            {
                org.andengine.d.e.a.c((new StringBuilder(String.valueOf(org/andengine/b/c/e.getSimpleName()))).append(".").append(e.b).append(" is not supported on this device. Falling back to ").append(org/andengine/b/c/e.getSimpleName()).append(".").append(e.a).toString());
                setRequestedOrientation(0);
                return;
            }

        case 3: // '\003'
            setRequestedOrientation(1);
            return;

        case 4: // '\004'
            break;
        }
        if (org.andengine.d.i.a.c)
        {
            setRequestedOrientation(7);
            return;
        } else
        {
            org.andengine.d.e.a.c((new StringBuilder(String.valueOf(org/andengine/b/c/e.getSimpleName()))).append(".").append(e.d).append(" is not supported on this device. Falling back to ").append(org/andengine/b/c/e.getSimpleName()).append(".").append(e.c).toString());
            setRequestedOrientation(1);
            return;
        }
    }

    public org.andengine.a.b.b A()
    {
        return k.j();
    }

    public org.andengine.b.a a(b b1)
    {
        return new org.andengine.b.a(b1);
    }

    public void a(org.andengine.opengl.util.e e1)
    {
        this;
        JVM INSTR monitorenter ;
        org.andengine.d.e.a.b((new StringBuilder(String.valueOf(getClass().getSimpleName()))).append(".onSurfaceCreated").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
        if (!c) goto _L2; else goto _L1
_L1:
        t();
        if (b && c)
        {
            s();
        }
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!d)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        e = true;
          goto _L3
        Exception exception;
        exception;
        throw exception;
        d = true;
        q();
          goto _L3
    }

    public void a(org.andengine.opengl.util.e e1, int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        org.andengine.d.e.a.b((new StringBuilder(String.valueOf(getClass().getSimpleName()))).append(".onSurfaceChanged(Width=").append(i).append(",  Height=").append(j).append(")").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void b()
    {
        l = new RenderSurfaceView(this);
        l.a(k, this);
        setContentView(l, B());
    }

    protected void onCreate(Bundle bundle)
    {
        org.andengine.d.e.a.b((new StringBuilder(String.valueOf(getClass().getSimpleName()))).append(".onCreate").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
        super.onCreate(bundle);
        b = true;
        k = a(a());
        k.a();
        f();
        b();
    }

    protected void onDestroy()
    {
        org.andengine.d.e.a.b((new StringBuilder(String.valueOf(getClass().getSimpleName()))).append(".onDestroy").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
        super.onDestroy();
        k.k();
        try
        {
            v();
        }
        catch (Throwable throwable)
        {
            org.andengine.d.e.a.b((new StringBuilder(String.valueOf(getClass().getSimpleName()))).append(".onDestroyResources failed.").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString(), throwable);
        }
        w();
        k = null;
    }

    protected void onPause()
    {
        org.andengine.d.e.a.b((new StringBuilder(String.valueOf(getClass().getSimpleName()))).append(".onPause").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
        super.onPause();
        l.onPause();
        e();
        if (!b)
        {
            u();
        }
    }

    protected void onResume()
    {
        this;
        JVM INSTR monitorenter ;
        org.andengine.d.e.a.b((new StringBuilder(String.valueOf(getClass().getSimpleName()))).append(".onResume").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
        super.onResume();
        d();
        l.onResume();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void onWindowFocusChanged(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        super.onWindowFocusChanged(flag);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        if (b && c)
        {
            s();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void q()
    {
        this;
        JVM INSTR monitorenter ;
        org.andengine.ui.activity.c c1;
        org.andengine.d.e.a.b((new StringBuilder(String.valueOf(getClass().getSimpleName()))).append(".onCreateGame").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
        c1 = new org.andengine.ui.activity.c(this, new org.andengine.ui.activity.b(this, new org.andengine.ui.activity.a(this)));
        org.andengine.d.e.a.b((new StringBuilder(String.valueOf(getClass().getSimpleName()))).append(".onCreateResources").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
        a(c1);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Throwable throwable;
        throwable;
        org.andengine.d.e.a.b((new StringBuilder(String.valueOf(getClass().getSimpleName()))).append(".onCreateGame failed.").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString(), throwable);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        throw exception;
    }

    public void r()
    {
        this;
        JVM INSTR monitorenter ;
        c = true;
        if (!e)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        e = false;
        t();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Throwable throwable;
        throwable;
        org.andengine.d.e.a.b((new StringBuilder(String.valueOf(getClass().getSimpleName()))).append(".onReloadResources failed.").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString(), throwable);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        throw exception;
    }

    public void s()
    {
        this;
        JVM INSTR monitorenter ;
        org.andengine.d.e.a.b((new StringBuilder(String.valueOf(getClass().getSimpleName()))).append(".onResumeGame").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
        k.b();
        b = false;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void t()
    {
        org.andengine.d.e.a.b((new StringBuilder(String.valueOf(getClass().getSimpleName()))).append(".onReloadResources").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
        k.l();
    }

    public void u()
    {
        this;
        JVM INSTR monitorenter ;
        org.andengine.d.e.a.b((new StringBuilder(String.valueOf(getClass().getSimpleName()))).append(".onPauseGame").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
        b = true;
        k.c();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void v()
    {
        org.andengine.d.e.a.b((new StringBuilder(String.valueOf(getClass().getSimpleName()))).append(".onDestroyResources").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
        if (k.d().d().c())
        {
            A().b();
        }
        if (k.d().d().b())
        {
            z().b();
        }
    }

    public void w()
    {
        this;
        JVM INSTR monitorenter ;
        org.andengine.d.e.a.b((new StringBuilder(String.valueOf(getClass().getSimpleName()))).append(".onGameDestroyed").append(" @(Thread: '").append(Thread.currentThread().getName()).append("')").toString());
        c = false;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public org.andengine.b.a x()
    {
        return k;
    }

    public org.andengine.opengl.c.e y()
    {
        return k.h();
    }

    public c z()
    {
        return k.i();
    }
}
