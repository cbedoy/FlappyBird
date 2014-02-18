// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.tagmanager.a:
//            ax, s

final class ay extends ax
{

    ay(int i)
    {
        super(i, null);
    }

    public void a()
    {
        if (!b())
        {
            for (int i = 0; i < c(); i++)
            {
                java.util.Map.Entry entry1 = b(i);
                if (((s)entry1.getKey()).c())
                {
                    entry1.setValue(Collections.unmodifiableList((List)entry1.getValue()));
                }
            }

            Iterator iterator = d().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                if (((s)entry.getKey()).c())
                {
                    entry.setValue(Collections.unmodifiableList((List)entry.getValue()));
                }
            } while (true);
        }
        super.a();
    }

    public Object put(Object obj, Object obj1)
    {
        return super.a((s)obj, obj1);
    }
}
