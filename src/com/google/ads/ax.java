// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import java.io.IOException;

public class ax extends IOException
{

    ax()
    {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }
}
