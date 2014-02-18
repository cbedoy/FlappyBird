// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.input.sensor;

import java.util.Arrays;

public class a
{

    protected final float a[];
    protected int b;
    protected int c;

    public void a(int i)
    {
        b = i;
    }

    public void a(float af[])
    {
        System.arraycopy(af, 0, a, 0, af.length);
    }

    public String toString()
    {
        return (new StringBuilder("Values: ")).append(Arrays.toString(a)).toString();
    }
}
