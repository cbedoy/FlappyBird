// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            j, m

public abstract class av extends j
{

    public av()
    {
    }

    protected static boolean b(Integer integer)
    {
        if (integer == null)
        {
            return false;
        } else
        {
            return m.a(integer.intValue());
        }
    }
}
