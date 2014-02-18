// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.internal.dl;

public final class f
{

    public final Uri a;

    public f(Uri uri)
    {
        a = uri;
    }

    public boolean equals(Object obj)
    {
        boolean flag = true;
        if (!(obj instanceof f))
        {
            flag = false;
        } else
        if (this != obj && ((f)obj).hashCode() != hashCode())
        {
            return false;
        }
        return flag;
    }

    public int hashCode()
    {
        Object aobj[] = new Object[1];
        aobj[0] = a;
        return dl.a(aobj);
    }
}
