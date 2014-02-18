// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.d.d;


public class b
{

    private static final float a[] = new float[3];

    public static final float a(int i)
    {
        return Float.intBitsToFloat(i & -1);
    }

    public static final int a(float f, float f1, float f2, float f3)
    {
        return (int)(255F * f3) << 24 | (int)(255F * f) << 16 | (int)(255F * f1) << 8 | (int)(255F * f2) << 0;
    }

    public static final int b(float f, float f1, float f2, float f3)
    {
        return (int)(255F * f3) << 24 | (int)(255F * f2) << 16 | (int)(255F * f1) << 8 | (int)(255F * f) << 0;
    }

}
