// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view.a;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v4.view.a:
//            w, k, a, o

class p
    implements w
{

    final k a;
    final o b;

    p(o o, k k1)
    {
        b = o;
        a = k1;
        super();
    }

    public Object a(int i)
    {
        a a1 = a.a(i);
        if (a1 == null)
        {
            return null;
        } else
        {
            return a1.a();
        }
    }

    public List a(String s, int i)
    {
        List list = a.a(s, i);
        ArrayList arraylist = new ArrayList();
        int j = list.size();
        for (int l = 0; l < j; l++)
        {
            arraylist.add(((a)list.get(l)).a());
        }

        return arraylist;
    }

    public boolean a(int i, int j, Bundle bundle)
    {
        return a.a(i, j, bundle);
    }

    public Object b(int i)
    {
        a a1 = a.b(i);
        if (a1 == null)
        {
            return null;
        } else
        {
            return a1.a();
        }
    }
}
