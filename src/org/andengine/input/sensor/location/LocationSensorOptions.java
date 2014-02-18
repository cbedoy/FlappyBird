// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.input.sensor.location;

import android.location.Criteria;

public class LocationSensorOptions extends Criteria
{

    private boolean a;
    private long b;
    private long c;

    public LocationSensorOptions()
    {
        a = true;
        b = 1000L;
        c = 10L;
    }
}
