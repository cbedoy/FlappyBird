// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dotgears;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.ads.AdView;
import com.google.example.games.basegameutils.b;
import java.io.IOException;
import org.andengine.b.a.a;
import org.andengine.b.c.d;
import org.andengine.b.c.g;
import org.andengine.b.c.h;
import org.andengine.b.e;
import org.andengine.opengl.c.c.c;
import org.andengine.opengl.c.f;
import org.andengine.opengl.view.RenderSurfaceView;
import org.andengine.ui.activity.BaseGameActivity;
import org.andengine.ui.activity.SimpleBaseGameActivity;

// Referenced classes of package com.dotgears:
//            a, b, c

public class GameActivity extends SimpleBaseGameActivity
    implements b
{

    public AdView a;
    public org.andengine.a.c.a b;
    public org.andengine.a.c.a c;
    public org.andengine.a.c.a d;
    public org.andengine.a.c.a e;
    public org.andengine.a.c.a f;
    protected com.google.example.games.basegameutils.a g;
    protected int h;
    protected String i;
    protected boolean j;
    private a m;
    private c n;
    private String o[];

    public GameActivity()
    {
        h = 1;
        i = "BaseGameActivity";
        j = false;
    }

    public org.andengine.b.a a(org.andengine.b.c.b b1)
    {
        return new e(b1, 60);
    }

    public org.andengine.b.c.b a()
    {
        m = new a(0.0F, 0.0F, 288F, 512F);
        org.andengine.b.c.b b1 = new org.andengine.b.c.b(true, org.andengine.b.c.e.c, new org.andengine.b.c.a.b(288F, 512F), m);
        b1.d().b(true).a(true);
        b1.e().a(true);
        b1.c().a(true);
        b1.a(h.d);
        return b1;
    }

    protected void b()
    {
        RelativeLayout relativelayout = new RelativeLayout(this);
        android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        l = new RenderSurfaceView(this);
        l.a(k, this);
        android.widget.RelativeLayout.LayoutParams layoutparams1 = new android.widget.RelativeLayout.LayoutParams(BaseGameActivity.B());
        layoutparams1.addRule(13);
        relativelayout.addView(l, layoutparams1);
        FrameLayout framelayout = new FrameLayout(this);
        a = new AdView(this, com.google.ads.g.a, "a152df006159b75");
        a.refreshDrawableState();
        android.widget.FrameLayout.LayoutParams layoutparams2 = new android.widget.FrameLayout.LayoutParams(-2, -2, 49);
        framelayout.addView(a, layoutparams2);
        relativelayout.addView(framelayout);
        com.google.ads.d d1 = new com.google.ads.d();
        a.a(d1);
        setContentView(relativelayout, layoutparams);
    }

    public void c()
    {
        runOnUiThread(new com.dotgears.a(this));
    }

    public void d()
    {
        runOnUiThread(new com.dotgears.b(this));
    }

    public void e()
    {
        b.d();
    }

    public void f()
    {
        c.d();
    }

    public void g()
    {
        d.d();
    }

    public void h()
    {
        e.d();
    }

    public void i()
    {
        f.d();
    }

    public void j()
    {
    }

    public void k()
    {
    }

    protected void l()
    {
        org.andengine.opengl.c.a.a.b.a("gfx/");
        org.andengine.opengl.c.a.a.a a1 = new org.andengine.opengl.c.a.a.a(y(), 1024, 1024, f.i);
        n = org.andengine.opengl.c.a.a.b.a(a1, this, "atlas.png", 0, 0);
        a1.i();
        org.andengine.a.c.b.a("sounds/");
        try
        {
            b = org.andengine.a.c.b.a(k.i(), this, "sfx_point.ogg");
            c = org.andengine.a.c.b.a(k.i(), this, "sfx_die.ogg");
            d = org.andengine.a.c.b.a(k.i(), this, "sfx_hit.ogg");
            e = org.andengine.a.c.b.a(k.i(), this, "sfx_swooshing.ogg");
            f = org.andengine.a.c.b.a(k.i(), this, "sfx_wing.ogg");
            return;
        }
        catch (IOException ioexception)
        {
            return;
        }
    }

    protected org.andengine.c.b.e m()
    {
        return new com.dotgears.c(this, n);
    }

    protected com.google.android.gms.games.c n()
    {
        return g.b();
    }

    public boolean o()
    {
        return g.c();
    }

    protected void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        g.a(i1, j1, intent);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        g = new com.google.example.games.basegameutils.a(this);
        if (j)
        {
            g.a(j, i);
        }
        g.a(this, h, o);
    }

    protected void onDestroy()
    {
        super.onDestroy();
        System.exit(0);
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        if (i1 == 4)
        {
            Log.i("FlappyBird", "Back key pressed.");
        }
        return false;
    }

    protected void onStart()
    {
        super.onStart();
        g.a(this);
    }

    protected void onStop()
    {
        super.onStop();
        g.d();
    }

    public void p()
    {
        g.f();
    }
}
