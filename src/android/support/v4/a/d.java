// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.a;

import android.os.Parcel;

// Referenced classes of package android.support.v4.a:
//            c

class d
    implements android.os.Parcelable.ClassLoaderCreator
{

    private final c a;

    public d(c c1)
    {
        a = c1;
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a.a(parcel, null);
    }

    public Object createFromParcel(Parcel parcel, ClassLoader classloader)
    {
        return a.a(parcel, classloader);
    }

    public Object[] newArray(int i)
    {
        return a.a(i);
    }
}
