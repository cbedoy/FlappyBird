// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import java.util.Comparator;

// Referenced classes of package android.support.v4.view:
//            bz

final class bv
    implements Comparator
{

    bv()
    {
    }

    public int a(bz bz1, bz bz2)
    {
        return bz1.b - bz2.b;
    }

    public int compare(Object obj, Object obj1)
    {
        return a((bz)obj, (bz)obj1);
    }
}
