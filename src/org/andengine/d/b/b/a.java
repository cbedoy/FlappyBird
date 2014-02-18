// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.d.b.b;

import java.util.Comparator;
import java.util.List;

// Referenced classes of package org.andengine.d.b.b:
//            b

public class a extends b
{

    public a()
    {
    }

    public void a(List list, int i, int j, Comparator comparator)
    {
        int k = i + 1;
_L3:
        Object obj;
        Object obj1;
        if (k >= j)
        {
            return;
        }
        obj = list.get(k);
        obj1 = list.get(k - 1);
        if (comparator.compare(obj, obj1) >= 0) goto _L2; else goto _L1
_L1:
        Object obj2;
        int l;
        obj2 = obj1;
        l = k;
_L4:
        int i1;
        Object obj3;
        i1 = l - 1;
        list.set(l, obj2);
        if (i1 > i)
        {
            obj3 = list.get(i1 - 1);
            if (comparator.compare(obj, obj3) < 0)
            {
                break MISSING_BLOCK_LABEL_122;
            }
        }
        list.set(i1, obj);
_L2:
        k++;
          goto _L3
        obj2 = obj3;
        l = i1;
          goto _L4
    }
}
