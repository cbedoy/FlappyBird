// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import com.google.ads.a.n;
import com.google.ads.util.aa;
import com.google.ads.util.ad;
import com.google.ads.util.ae;

// Referenced classes of package com.google.ads:
//            bt

public final class bq extends aa
{

    public final ad a;
    public final ae b = new ae(this, "adLoader", new n(this));
    public final ae c = new ae(this, "disableNativeScroll", Boolean.valueOf(false));

    public bq(bt bt)
    {
        a = new ad(this, "slotState", bt);
    }
}
