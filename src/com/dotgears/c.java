// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dotgears;

import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.Uri;
import org.andengine.c.b.e;
import org.andengine.c.d.a;

// Referenced classes of package com.dotgears:
//            GameActivity, g, j

public class c extends e
    implements org.andengine.c.b.c
{

    public static a a[];
    static int c;
    public final int b = 50;
    public GameActivity d;
    public int e;
    float f[];
    float g[];
    boolean h;
    int i;
    int j;

    public c(GameActivity gameactivity, org.andengine.opengl.c.c.c c1)
    {
        f = new float[10];
        g = new float[10];
        h = false;
        i = 0;
        j = 0;
        d = gameactivity;
        e = gameactivity.getSharedPreferences("FlappyBird", 0).getInt("score", 0);
        g.D = new com.dotgears.flappy.c(e, 0, gameactivity.getApplication().getResources().openRawResource(0x7f040000));
        g.D.a();
        com.dotgears.j.a((int)System.currentTimeMillis());
        a = new a[50];
        int k = 0;
        do
        {
            if (k >= 50)
            {
                a(this);
                return;
            }
            org.andengine.opengl.c.c.c c2 = c1.i();
            a[k] = new a(0.0F, 0.0F, c2, gameactivity.x().g());
            a[k].a(false);
            b(a[k]);
            k++;
        } while (true);
    }

    public static void a(int k, int l, int i1, int j1, float f1, float f2, float f3, float f4, 
            float f5)
    {
        a a1 = a[c];
        a1.b(k, l, i1, j1, f1, f2, f3, f4);
        a1.b(f5);
        a1.a(true);
        c = 1 + c;
    }

    public static void a(int k, int l, int i1, int j1, float f1, float f2, float f3, float f4, 
            float f5, float f6)
    {
        a a1 = a[c];
        com.dotgears.j.a(k, l, 0.5F * (float)(k + i1), 0.5F * (float)(l + j1), f6);
        float f7 = j.A - (float)k;
        float f8 = j.B - (float)l;
        com.dotgears.j.a(k, j1, 0.5F * (float)(k + i1), 0.5F * (float)(l + j1), f6);
        float f9 = j.A - (float)k;
        float f10 = j.B - (float)l;
        com.dotgears.j.a(i1, l, 0.5F * (float)(k + i1), 0.5F * (float)(l + j1), f6);
        float f11 = j.A - (float)k;
        float f12 = j.B - (float)l;
        com.dotgears.j.a(i1, j1, 0.5F * (float)(k + i1), 0.5F * (float)(l + j1), f6);
        float f13 = j.A - (float)k;
        float f14 = j.B - (float)l;
        a1.a(k, l, i1, j1, f1, f2, f3, f4, f7, f8, f9, f10, f11, f12, f13, f14);
        a1.b(f5);
        a1.a(true);
        c = 1 + c;
    }

    public void a()
    {
        int k = 0;
        do
        {
            if (k >= 50)
            {
                c = 0;
                return;
            }
            a[k].a(false);
            k++;
        } while (true);
    }

    protected void a(float f1)
    {
        int k;
        super.a(f1);
        a();
        g.D.a(f, g);
        if (h)
        {
            g.D.a(i, j);
            g.D.a(i, j, i, j);
            h = false;
        }
        g.D.b();
        k = 0;
_L14:
        if (k >= g.D.v)
        {
            return;
        }
        g.D.w[k];
        JVM INSTR tableswitch 0 13: default 168
    //                   0 204
    //                   1 313
    //                   2 406
    //                   3 168
    //                   4 168
    //                   5 168
    //                   6 174
    //                   7 184
    //                   8 194
    //                   9 356
    //                   10 366
    //                   11 376
    //                   12 396
    //                   13 386;
           goto _L1 _L2 _L3 _L4 _L1 _L1 _L1 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L4:
        break MISSING_BLOCK_LABEL_406;
_L1:
        break; /* Loop/switch isn't completed */
_L5:
        break; /* Loop/switch isn't completed */
_L15:
        k++;
        if (true) goto _L14; else goto _L13
_L13:
        d.d();
          goto _L15
_L6:
        d.c();
          goto _L15
_L7:
        d.d();
          goto _L15
_L2:
        int l = (int)g.D.x[k];
        if (d.o())
        {
            d.g.b().a("CgkI5J2sk6QXEAIQAA", l);
        }
        if (l > e)
        {
            android.content.SharedPreferences.Editor editor = d.getSharedPreferences("FlappyBird", 0).edit();
            editor.clear();
            editor.putInt("score", (int)g.D.x[k]);
            editor.commit();
            e = l;
        }
          goto _L15
_L3:
        if (d.o())
        {
            d.startActivityForResult(d.n().a("CgkI5J2sk6QXEAIQAA"), 1);
        } else
        {
            d.p();
        }
          goto _L15
_L8:
        d.e();
          goto _L15
_L9:
        d.h();
          goto _L15
_L10:
        d.f();
          goto _L15
_L12:
        d.i();
          goto _L15
_L11:
        d.g();
          goto _L15
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("http://www.amazon.com/gp/mas/dl/android?p=com.dotgears.flappybird"));
        d.startActivity(intent);
          goto _L15
    }

    public boolean a(e e1, org.andengine.input.a.a a1)
    {
        if (a1.f())
        {
            if (g.D != null)
            {
                h = true;
                i = (int)a1.b();
                j = (int)a1.c();
            }
            f[a1.d() % 10] = a1.b();
            g[a1.d() % 10] = a1.c();
        } else
        if (a1.g() || a1.j() || a1.i())
        {
            g _tmp = g.D;
            f[a1.d() % 10] = -100F;
            g[a1.d() % 10] = -100F;
            return true;
        }
        return true;
    }
}
