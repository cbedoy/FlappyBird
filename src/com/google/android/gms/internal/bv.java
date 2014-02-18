// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.internal:
//            bg

public class bv
    implements SafeParcelable
{

    public static final bg CREATOR = new bg();
    private final int a;
    private final String b;
    private final ArrayList c;
    private final ArrayList d;
    private final boolean e;

    public bv(int i, String s, ArrayList arraylist, ArrayList arraylist1, boolean flag)
    {
        a = i;
        b = s;
        c = arraylist;
        d = arraylist1;
        e = flag;
    }

    public int a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public ArrayList c()
    {
        return c;
    }

    public ArrayList d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean e()
    {
        return e;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        bg.a(this, parcel, i);
    }

}
