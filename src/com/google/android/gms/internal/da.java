// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Intent;
import android.net.Uri;

public class da
{

    private static final Uri a;
    private static final Uri b;

    public static Intent a(String s)
    {
        Uri uri = Uri.fromParts("package", s, null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(uri);
        return intent;
    }

    public static Intent b(String s)
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(d(s));
        intent.setPackage("com.android.vending");
        intent.addFlags(0x80000);
        return intent;
    }

    public static Intent c(String s)
    {
        Uri uri = Uri.parse((new StringBuilder()).append("bazaar://search?q=pname:").append(s).toString());
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.setFlags(0x80000);
        return intent;
    }

    private static Uri d(String s)
    {
        return Uri.parse("market://details").buildUpon().appendQueryParameter("id", s).build();
    }

    static 
    {
        a = Uri.parse("http://plus.google.com/");
        b = a.buildUpon().appendPath("circles").appendPath("find").build();
    }
}
