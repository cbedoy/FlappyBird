// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.IInterface;
import com.google.android.gms.b.e;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

public interface p
    extends IInterface
{

    public abstract e a(LatLng latlng);

    public abstract LatLng a(e e);

    public abstract VisibleRegion a();
}
