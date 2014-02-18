// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.a;

import android.os.Handler;
import com.google.ads.br;
import com.google.ads.util.ad;
import com.google.ads.util.g;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.ads.a:
//            c

class d
    implements Runnable
{

    private final WeakReference a;

    public d(c c1)
    {
        a = new WeakReference(c1);
    }

    public void a()
    {
        ((Handler)br.a().c.a()).postDelayed(this, 250L);
    }

    public void run()
    {
        c c1 = (c)a.get();
        if (c1 == null)
        {
            g.d("The video must be gone, so cancelling the timeupdate task.");
            return;
        } else
        {
            c1.f();
            ((Handler)br.a().c.a()).postDelayed(this, 250L);
            return;
        }
    }
}
