// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.a;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import com.google.android.gms.games.PlayerEntity;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            cr, do, ai, an, 
//            w, v, af, ad, 
//            s, df, cu

public final class r extends cr
{

    private final String f;
    private final String g;
    private final Map h = new HashMap();
    private PlayerEntity i;
    private final ai j;
    private boolean k;
    private final Binder l = new Binder();
    private final long m = (long)hashCode();
    private final boolean n;

    public r(Context context, String s1, String s2, c c1, d d1, String as[], int i1, 
            View view, boolean flag)
    {
        super(context, c1, d1, as);
        k = false;
        f = s1;
        g = (String)com.google.android.gms.internal.do.a(s2);
        j = com.google.android.gms.internal.ai.a(this, i1);
        a(view);
        n = flag;
    }

    private void o()
    {
        i = null;
    }

    private void p()
    {
        for (Iterator iterator = h.values().iterator(); iterator.hasNext();)
        {
            an an1 = (an)iterator.next();
            try
            {
                an1.a();
            }
            catch (IOException ioexception)
            {
                com.google.android.gms.internal.w.a("GamesClient", "IOException:", ioexception);
            }
        }

        h.clear();
    }

    public Intent a(String s1)
    {
        m();
        Intent intent = new Intent("com.google.android.gms.games.VIEW_LEADERBOARD_SCORES");
        intent.putExtra("com.google.android.gms.games.LEADERBOARD_ID", s1);
        intent.addFlags(0x4000000);
        return com.google.android.gms.internal.v.a(intent);
    }

    protected ad a(IBinder ibinder)
    {
        return com.google.android.gms.internal.af.a(ibinder);
    }

    public void a()
    {
        o();
        super.a();
    }

    protected void a(int i1, IBinder ibinder, Bundle bundle)
    {
        if (i1 == 0 && bundle != null)
        {
            k = bundle.getBoolean("show_welcome_popup");
        }
        super.a(i1, ibinder, bundle);
    }

    public void a(IBinder ibinder, Bundle bundle)
    {
        if (!h())
        {
            break MISSING_BLOCK_LABEL_21;
        }
        ((ad)n()).a(ibinder, bundle);
        return;
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.internal.w.a("GamesClient", "service died");
        return;
    }

    public void a(View view)
    {
        j.a(view);
    }

    protected void a(a a1)
    {
        super.a(a1);
        k = false;
    }

    public void a(com.google.android.gms.games.a.a a1, String s1, long l1)
    {
        if (a1 != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L3:
        s s2;
        try
        {
            ((ad)n()).a(((y) (obj)), s1, l1);
            return;
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.internal.w.a("GamesClient", "service died");
        }
        break MISSING_BLOCK_LABEL_51;
_L2:
        s2 = new s(this, a1);
        obj = s2;
          goto _L3
    }

    protected void a(df df1, cu cu)
    {
        String s1 = j().getResources().getConfiguration().locale.toString();
        Bundle bundle = new Bundle();
        bundle.putBoolean("com.google.android.gms.games.key.isHeadless", n);
        df1.a(cu, 0x31d24c, j().getPackageName(), g, k(), f, j.b(), s1, bundle);
    }

    protected transient void a(String as[])
    {
        int i1 = 0;
        boolean flag = false;
        boolean flag1 = false;
        while (i1 < as.length) 
        {
            String s1 = as[i1];
            if (s1.equals("https://www.googleapis.com/auth/games"))
            {
                flag1 = true;
            } else
            if (s1.equals("https://www.googleapis.com/auth/games.firstparty"))
            {
                flag = true;
            }
            i1++;
        }
        if (flag)
        {
            boolean flag2;
            if (!flag1)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            com.google.android.gms.internal.do.a(flag2, String.format("Cannot have both %s and %s!", new Object[] {
                "https://www.googleapis.com/auth/games", "https://www.googleapis.com/auth/games.firstparty"
            }));
            return;
        } else
        {
            com.google.android.gms.internal.do.a(flag1, String.format("GamesClient requires %s to function.", new Object[] {
                "https://www.googleapis.com/auth/games"
            }));
            return;
        }
    }

    protected IInterface b(IBinder ibinder)
    {
        return a(ibinder);
    }

    public void b()
    {
        k = false;
        if (h())
        {
            try
            {
                ad ad1 = (ad)n();
                ad1.c();
                ad1.b(m);
                ad1.a(m);
            }
            catch (RemoteException remoteexception)
            {
                com.google.android.gms.internal.w.a("GamesClient", "Failed to notify client disconnect.");
            }
        }
        p();
        super.b();
    }

    protected String c()
    {
        return "com.google.android.gms.games.service.START";
    }

    protected String d()
    {
        return "com.google.android.gms.games.internal.IGamesService";
    }

    protected Bundle e()
    {
        Bundle bundle;
        try
        {
            bundle = ((ad)n()).b();
        }
        catch (RemoteException remoteexception)
        {
            com.google.android.gms.internal.w.a("GamesClient", "service died");
            return null;
        }
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        bundle.setClassLoader(com/google/android/gms/internal/r.getClassLoader());
        return bundle;
    }

    protected void f()
    {
        super.f();
        if (k)
        {
            j.a();
            k = false;
        }
    }

    public void g()
    {
        if (!h())
        {
            break MISSING_BLOCK_LABEL_19;
        }
        ((ad)n()).c();
        return;
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.internal.w.a("GamesClient", "service died");
        return;
    }
}
