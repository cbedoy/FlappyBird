// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.plus;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

// Referenced classes of package com.google.android.gms.plus:
//            e, PlusOneButton

public class d
    implements android.view.View.OnClickListener, e
{

    final PlusOneButton a;
    private final e b;

    public d(PlusOneButton plusonebutton, e e1)
    {
        a = plusonebutton;
        super();
        b = e1;
    }

    public void a(Intent intent)
    {
        android.content.Context context = a.getContext();
        if ((context instanceof Activity) && intent != null)
        {
            ((Activity)context).startActivityForResult(intent, PlusOneButton.b(a));
        }
    }

    public void onClick(View view)
    {
        Intent intent = (Intent)PlusOneButton.a(a).getTag();
        if (b != null)
        {
            b.a(intent);
            return;
        } else
        {
            a(intent);
            return;
        }
    }
}
