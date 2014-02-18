// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import com.google.android.gms.plus.a;

// Referenced classes of package com.google.android.gms.internal:
//            cr, bb, cc, df, 
//            ba, cu

public class bd extends cr
{

    private com.google.android.gms.plus.a.b.a f;
    private a g;

    public bd(Context context, a a1, c c1, d d1)
    {
        super(context, c1, d1, a1.c());
        g = a1;
    }

    protected ba a(IBinder ibinder)
    {
        return com.google.android.gms.internal.bb.a(ibinder);
    }

    protected void a(int i, IBinder ibinder, Bundle bundle)
    {
        if (i == 0 && bundle != null && bundle.containsKey("loaded_person"))
        {
            f = com.google.android.gms.internal.cc.a(bundle.getByteArray("loaded_person"));
        }
        super.a(i, ibinder, bundle);
    }

    protected void a(df df1, cu cu)
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("skip_oob", false);
        bundle.putStringArray("request_visible_actions", g.d());
        if (g.e() != null)
        {
            bundle.putStringArray("required_features", g.e());
        }
        if (g.h() != null)
        {
            bundle.putString("application_name", g.h());
        }
        df1.a(cu, 0x31d24c, g.g(), g.f(), k(), g.b(), bundle);
    }

    protected IInterface b(IBinder ibinder)
    {
        return a(ibinder);
    }

    protected String c()
    {
        return "com.google.android.gms.plus.service.START";
    }

    protected String d()
    {
        return "com.google.android.gms.plus.internal.IPlusService";
    }
}
