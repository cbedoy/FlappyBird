// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.b;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import org.andengine.b.b.d;
import org.andengine.b.c.g;
import org.andengine.input.a.a.e;
import org.andengine.input.a.a.f;
import org.andengine.input.sensor.b;
import org.andengine.opengl.a.c;
import org.andengine.opengl.b.h;

// Referenced classes of package org.andengine.b:
//            d, c, b

public class a
    implements SensorEventListener, LocationListener, android.view.View.OnTouchListener, e
{

    private static final b e;
    private final d A = new d(8);
    private final org.andengine.b.b.a B = new org.andengine.b.b.a(4);
    protected final org.andengine.b.a.a a;
    protected org.andengine.c.b.e b;
    protected int c;
    protected int d;
    private boolean f;
    private boolean g;
    private long h;
    private float i;
    private final org.andengine.b.c j;
    private final org.andengine.b.d k;
    private final org.andengine.b.b.a.a l = new org.andengine.b.b.a.a();
    private final org.andengine.b.c.b m;
    private org.andengine.input.a.a.d n;
    private final org.andengine.opengl.d.e o = new org.andengine.opengl.d.e();
    private final org.andengine.opengl.c.e p = new org.andengine.opengl.c.e();
    private final c q = new c();
    private final h r = new h();
    private final org.andengine.a.c.c s;
    private final org.andengine.a.b.b t;
    private org.andengine.input.sensor.location.a u;
    private Location v;
    private org.andengine.input.sensor.a.g w;
    private org.andengine.input.sensor.a.a x;
    private org.andengine.input.sensor.b.a y;
    private org.andengine.input.sensor.b.b z;

    public a(org.andengine.b.c.b b1)
    {
        c = 1;
        d = 1;
        org.andengine.opengl.c.a.a.b.a();
        org.andengine.a.c.b.a();
        org.andengine.a.b.a.a();
        org.andengine.opengl.a.b.a();
        o.a();
        p.a();
        q.a();
        r.a();
        m = b1;
        if (m.a())
        {
            j = b1.b();
        } else
        {
            j = new org.andengine.b.c(false);
        }
        a = b1.i();
        if (m.c().a())
        {
            a(new f());
        } else
        {
            a(new org.andengine.input.a.a.g());
        }
        if (m.d().b())
        {
            s = new org.andengine.a.c.c(m.d().a().b());
        } else
        {
            s = null;
        }
        if (m.d().c())
        {
            t = new org.andengine.a.b.b();
        } else
        {
            t = null;
        }
        if (m.j())
        {
            k = m.k();
        } else
        {
            k = new org.andengine.b.d();
        }
        k.a(this);
    }

    private void n()
    {
        if (g)
        {
            throw new org.andengine.b.b(this);
        } else
        {
            return;
        }
    }

    private long o()
    {
        return System.nanoTime() - h;
    }

    public void a()
    {
        k.start();
    }

    protected void a(float f1)
    {
        if (b != null)
        {
            b.a_(f1);
        }
    }

    public void a(int i1, int j1)
    {
        c = i1;
        d = j1;
        f();
    }

    public void a(long l1)
    {
        float f1 = 1E-09F * (float)l1;
        i = f1 + i;
        h = l1 + h;
        n.a_(f1);
        b(f1);
        a(f1);
    }

    public void a(org.andengine.c.b.e e1)
    {
        b = e1;
    }

    public void a(org.andengine.input.a.a.d d1)
    {
        n = d1;
        n.a(this);
    }

    public void a(org.andengine.opengl.util.e e1)
    {
        org.andengine.b.c c1;
        c1 = j;
        c1.lock();
        c1.c();
        o.a(e1);
        p.a(e1);
        q.a(e1);
        a(e1, a);
        b(e1, a);
        c1.b();
        c1.unlock();
        return;
        Exception exception;
        exception;
        c1.unlock();
        throw exception;
    }

    protected void a(org.andengine.opengl.util.e e1, org.andengine.b.a.a a1)
    {
        B.a(e1, a1);
    }

    protected boolean a(org.andengine.b.a.a a1, org.andengine.input.a.a a2)
    {
        if (a1.j())
        {
            return a1.i().a(a2);
        } else
        {
            return false;
        }
    }

    protected boolean a(org.andengine.c.b.e e1, org.andengine.input.a.a a1)
    {
        if (e1 != null)
        {
            return e1.a(a1);
        } else
        {
            return false;
        }
    }

    public boolean a(org.andengine.input.a.a a1)
    {
        org.andengine.c.b.e e1 = c(a1);
        org.andengine.b.a.a a2 = b(a1);
        b(a2, a1);
        if (a(a2, a1))
        {
            return true;
        } else
        {
            return a(e1, a1);
        }
    }

    protected org.andengine.b.a.a b(org.andengine.input.a.a a1)
    {
        return e();
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (!f)
        {
            h = System.nanoTime();
            f = true;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    protected void b(float f1)
    {
        l.a_(f1);
        A.a_(f1);
        e().a_(f1);
    }

    protected void b(org.andengine.b.a.a a1, org.andengine.input.a.a a2)
    {
        a1.a(a2, c, d);
    }

    protected void b(org.andengine.opengl.util.e e1, org.andengine.b.a.a a1)
    {
        if (b != null)
        {
            b.a(e1, a1);
        }
        a1.a(e1);
    }

    protected org.andengine.c.b.e c(org.andengine.input.a.a a1)
    {
        return b;
    }

    public void c()
    {
        this;
        JVM INSTR monitorenter ;
        if (f)
        {
            f = false;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public org.andengine.b.c.b d()
    {
        return m;
    }

    public org.andengine.b.a.a e()
    {
        return a;
    }

    protected void f()
    {
        a.a(0, 0, c, d);
    }

    public org.andengine.opengl.d.e g()
    {
        return o;
    }

    public org.andengine.opengl.c.e h()
    {
        return p;
    }

    public org.andengine.a.c.c i()
    {
        if (s != null)
        {
            return s;
        } else
        {
            throw new IllegalStateException("To enable the SoundManager, check the EngineOptions!");
        }
    }

    public org.andengine.a.b.b j()
    {
        if (t != null)
        {
            return t;
        } else
        {
            throw new IllegalStateException("To enable the MusicManager, check the EngineOptions!");
        }
    }

    public void k()
    {
        j.lock();
        g = true;
        j.b();
        j.unlock();
        Exception exception;
        try
        {
            k.join();
        }
        catch (InterruptedException interruptedexception)
        {
            org.andengine.d.e.a.b("Could not join UpdateThread.", interruptedexception);
            org.andengine.d.e.a.c("Trying to manually interrupt UpdateThread.");
            k.interrupt();
        }
        o.b();
        p.c();
        q.b();
        r.b();
        return;
        exception;
        j.unlock();
        throw exception;
    }

    public void l()
    {
        o.c();
        p.b();
        q.c();
        r.c();
    }

    void m()
    {
        long l1;
        if (!f)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        l1 = o();
        j.lock();
        n();
        a(l1);
        n();
        j.a();
        j.d();
        j.unlock();
        return;
        Exception exception1;
        exception1;
        j.unlock();
        throw exception1;
        j.lock();
        n();
        j.a();
        j.d();
        j.unlock();
        Thread.sleep(16L);
        return;
        Exception exception;
        exception;
        j.unlock();
        throw exception;
    }

    public void onAccuracyChanged(Sensor sensor, int i1)
    {
        if (!f) goto _L2; else goto _L1
_L1:
        sensor.getType();
        JVM INSTR tableswitch 1 2: default 32
    //                   1 33
    //                   2 91;
           goto _L2 _L3 _L4
_L2:
        return;
_L3:
        if (x != null)
        {
            x.a(i1);
            w.a(x);
            return;
        }
        if (z != null)
        {
            z.b(i1);
            y.a(z);
            return;
        }
        if (true) goto _L2; else goto _L4
_L4:
        z.c(i1);
        y.a(z);
        return;
    }

    public void onLocationChanged(Location location)
    {
        if (v == null)
        {
            v = location;
            return;
        }
        if (location == null)
        {
            u.b();
            return;
        } else
        {
            v = location;
            u.a(location);
            return;
        }
    }

    public void onProviderDisabled(String s1)
    {
        u.c();
    }

    public void onProviderEnabled(String s1)
    {
        u.a();
    }

    public void onSensorChanged(SensorEvent sensorevent)
    {
        if (!f) goto _L2; else goto _L1
_L1:
        sensorevent.sensor.getType();
        JVM INSTR tableswitch 1 2: default 36
    //                   1 37
    //                   2 101;
           goto _L2 _L3 _L4
_L2:
        return;
_L3:
        if (x != null)
        {
            x.a(sensorevent.values);
            w.b(x);
            return;
        }
        if (z != null)
        {
            z.b(sensorevent.values);
            y.b(z);
            return;
        }
        if (true) goto _L2; else goto _L4
_L4:
        z.c(sensorevent.values);
        y.b(z);
        return;
    }

    public void onStatusChanged(String s1, int i1, Bundle bundle)
    {
        switch (i1)
        {
        default:
            return;

        case 2: // '\002'
            u.a(org.andengine.input.sensor.location.b.a, bundle);
            return;

        case 0: // '\0'
            u.a(org.andengine.input.sensor.location.b.b, bundle);
            return;

        case 1: // '\001'
            u.a(org.andengine.input.sensor.location.b.c, bundle);
            return;
        }
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (f)
        {
            n.a(motionevent);
            try
            {
                Thread.sleep(m.c().b());
            }
            catch (InterruptedException interruptedexception)
            {
                org.andengine.d.e.a.a(interruptedexception);
            }
            return true;
        } else
        {
            return false;
        }
    }

    static 
    {
        e = b.c;
    }
}
