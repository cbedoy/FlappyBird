// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import android.net.Uri;

public final class v
{

    public static final Intent a(Intent intent)
    {
        intent.setData(Uri.fromParts("version", Integer.toString(0x31d24c), null));
        return intent;
    }
}
