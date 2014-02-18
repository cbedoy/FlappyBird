// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.maps.a.bk;
import com.google.android.gms.maps.model.a.v;
import com.google.android.gms.maps.model.a.w;

// Referenced classes of package com.google.android.gms.maps.model:
//            n, m, z, o

public final class TileOverlayOptions
    implements SafeParcelable
{

    public static final n CREATOR = new n();
    private final int a;
    private v b;
    private o c;
    private boolean d;
    private float e;

    public TileOverlayOptions()
    {
        d = true;
        a = 1;
    }

    TileOverlayOptions(int i, IBinder ibinder, boolean flag, float f)
    {
        d = true;
        a = i;
        b = w.a(ibinder);
        Object obj;
        if (b == null)
        {
            obj = null;
        } else
        {
            obj = new m(this);
        }
        c = ((o) (obj));
        d = flag;
        e = f;
    }

    static v a(TileOverlayOptions tileoverlayoptions)
    {
        return tileoverlayoptions.b;
    }

    int a()
    {
        return a;
    }

    IBinder b()
    {
        return b.asBinder();
    }

    public float c()
    {
        return e;
    }

    public boolean d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        if (bk.a())
        {
            z.a(this, parcel, i);
            return;
        } else
        {
            n.a(this, parcel, i);
            return;
        }
    }

}
