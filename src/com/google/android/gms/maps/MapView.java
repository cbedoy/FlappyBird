// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.maps.a.m;
import com.google.android.gms.maps.model.k;

// Referenced classes of package com.google.android.gms.maps:
//            d, GoogleMapOptions, a, c

public class MapView extends FrameLayout
{

    private final d a;
    private a b;

    public MapView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new d(this, context, GoogleMapOptions.a(context, attributeset));
    }

    public MapView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new d(this, context, GoogleMapOptions.a(context, attributeset));
    }

    public final a getMap()
    {
        if (b != null)
        {
            return b;
        }
        a.b();
        if (a.a() == null)
        {
            return null;
        }
        try
        {
            b = new a(((c)a.a()).a().a());
        }
        catch (RemoteException remoteexception)
        {
            throw new k(remoteexception);
        }
        return b;
    }
}
