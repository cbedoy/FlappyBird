// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.a;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;

// Referenced classes of package com.google.ads.a:
//            ah

class ak
    implements android.content.DialogInterface.OnClickListener
{

    final String a;
    final ah b;

    ak(ah ah1, String s)
    {
        b = ah1;
        a = s;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        ah.b(b).startActivity(Intent.createChooser((new Intent("android.intent.action.SEND")).setType("text/plain").putExtra("android.intent.extra.TEXT", a), "Share via"));
    }
}
