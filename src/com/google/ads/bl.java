// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import com.google.ads.b.b;
import com.google.ads.util.e;
import com.google.ads.util.g;

// Referenced classes of package com.google.ads:
//            bk

class bl
    implements Runnable
{

    final bk a;

    bl(bk bk1)
    {
        a = bk1;
        super();
    }

    public void run()
    {
        if (a.h())
        {
            e.a(bk.a(a));
            try
            {
                bk.a(a).a();
            }
            catch (Throwable throwable)
            {
                g.b((new StringBuilder()).append("Error while destroying adapter (").append(a.f()).append("):").toString(), throwable);
                return;
            }
            g.a((new StringBuilder()).append("Called destroy() for adapter with class: ").append(bk.a(a).getClass().getName()).toString());
        }
    }
}
