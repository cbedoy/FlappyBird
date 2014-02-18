// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.internal:
//            aj

public final class al
{

    public IBinder a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    private al(int i, IBinder ibinder)
    {
        c = -1;
        d = 0;
        e = 0;
        f = 0;
        g = 0;
        b = i;
        a = ibinder;
    }

    al(int i, IBinder ibinder, aj aj)
    {
        this(i, ibinder);
    }

    public Bundle a()
    {
        Bundle bundle = new Bundle();
        bundle.putInt("popupLocationInfo.gravity", b);
        bundle.putInt("popupLocationInfo.displayId", c);
        bundle.putInt("popupLocationInfo.left", d);
        bundle.putInt("popupLocationInfo.top", e);
        bundle.putInt("popupLocationInfo.right", f);
        bundle.putInt("popupLocationInfo.bottom", g);
        return bundle;
    }
}
