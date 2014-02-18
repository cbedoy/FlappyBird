// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.d;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            ak, co, cq, bv

public interface aq
    extends IInterface
{

    public abstract void a(int i, Bundle bundle);

    public abstract void a(int i, Bundle bundle, int j);

    public abstract void a(int i, Bundle bundle, Bundle bundle1);

    public abstract void a(int i, Bundle bundle, ParcelFileDescriptor parcelfiledescriptor);

    public abstract void a(int i, Bundle bundle, ak ak);

    public abstract void a(int i, Bundle bundle, co co);

    public abstract void a(int i, Bundle bundle, cq cq);

    public abstract void a(int i, Bundle bundle, String s);

    public abstract void a(int i, Bundle bundle, String s, bv bv);

    public abstract void a(int i, Bundle bundle, String s, List list, List list1, List list2);

    public abstract void a(int i, Bundle bundle, List list);

    public abstract void a(d d, String s);

    public abstract void a(d d, String s, String s1);

    public abstract void a(String s);

    public abstract void b(int i, Bundle bundle);

    public abstract void b(int i, Bundle bundle, Bundle bundle1);

    public abstract void b(d d, String s);
}
