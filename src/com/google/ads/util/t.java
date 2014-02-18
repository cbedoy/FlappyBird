// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.util;

import android.content.DialogInterface;
import android.webkit.JsResult;

final class t
    implements android.content.DialogInterface.OnClickListener
{

    final JsResult a;

    t(JsResult jsresult)
    {
        a = jsresult;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        a.cancel();
    }
}
