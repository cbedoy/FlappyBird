// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dn;

public final class a
{

    public static final a a = new a(0, null);
    private final PendingIntent b;
    private final int c;

    public a(int i, PendingIntent pendingintent)
    {
        c = i;
        b = pendingintent;
    }

    private String c()
    {
        switch (c)
        {
        default:
            return (new StringBuilder()).append("unknown status code ").append(c).toString();

        case 0: // '\0'
            return "SUCCESS";

        case 1: // '\001'
            return "SERVICE_MISSING";

        case 2: // '\002'
            return "SERVICE_VERSION_UPDATE_REQUIRED";

        case 3: // '\003'
            return "SERVICE_DISABLED";

        case 4: // '\004'
            return "SIGN_IN_REQUIRED";

        case 5: // '\005'
            return "INVALID_ACCOUNT";

        case 6: // '\006'
            return "RESOLUTION_REQUIRED";

        case 7: // '\007'
            return "NETWORK_ERROR";

        case 8: // '\b'
            return "INTERNAL_ERROR";

        case 9: // '\t'
            return "SERVICE_INVALID";

        case 10: // '\n'
            return "DEVELOPER_ERROR";

        case 11: // '\013'
            return "LICENSE_CHECK_FAILED";
        }
    }

    public void a(Activity activity, int i)
    {
        if (!a())
        {
            return;
        } else
        {
            activity.startIntentSenderForResult(b.getIntentSender(), i, null, 0, 0, 0);
            return;
        }
    }

    public boolean a()
    {
        return c != 0 && b != null;
    }

    public int b()
    {
        return c;
    }

    public String toString()
    {
        return dl.a(this).a("statusCode", c()).a("resolution", b).toString();
    }

}
