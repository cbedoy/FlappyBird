// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.os.IInterface;
import com.google.android.gms.b.e;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

public interface a
    extends IInterface
{

    public abstract e a();

    public abstract e a(float f);

    public abstract e a(float f, float f1);

    public abstract e a(float f, int i, int j);

    public abstract e a(CameraPosition cameraposition);

    public abstract e a(LatLng latlng);

    public abstract e a(LatLng latlng, float f);

    public abstract e a(LatLngBounds latlngbounds, int i);

    public abstract e a(LatLngBounds latlngbounds, int i, int j, int k);

    public abstract e b();

    public abstract e b(float f);
}
