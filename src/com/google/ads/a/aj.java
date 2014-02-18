// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.a;

import android.app.Activity;
import android.content.DialogInterface;

// Referenced classes of package com.google.ads.a:
//            ae, ah, w

class aj
    implements android.content.DialogInterface.OnClickListener
{

    final ah a;

    aj(ah ah1)
    {
        a = ah1;
        super();
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        (new Thread(new ae(ah.a(a).c(), ah.b(a).getApplicationContext()))).start();
    }
}
