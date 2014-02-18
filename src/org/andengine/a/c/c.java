// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.a.c;

import android.media.SoundPool;
import android.util.SparseArray;
import org.andengine.a.b;
import org.andengine.a.c.a.a;

// Referenced classes of package org.andengine.a.c:
//            a

public class c extends b
    implements android.media.SoundPool.OnLoadCompleteListener
{

    private final SoundPool c;
    private final SparseArray d;

    public c()
    {
        this(5);
    }

    public c(int i)
    {
        d = new SparseArray();
        c = new SoundPool(i, 3, 0);
        c.setOnLoadCompleteListener(this);
    }

    public void a(org.andengine.a.c.a a1)
    {
        super.a(a1);
        d.put(a1.h(), a1);
    }

    public volatile void a(org.andengine.a.c c1)
    {
        a((org.andengine.a.c.a)c1);
    }

    public void b()
    {
        super.b();
        c.release();
    }

    public boolean b(org.andengine.a.c.a a1)
    {
        boolean flag = super.b(a1);
        if (flag)
        {
            d.remove(a1.h());
        }
        return flag;
    }

    public volatile boolean b(org.andengine.a.c c1)
    {
        return b((org.andengine.a.c.a)c1);
    }

    SoundPool c()
    {
        return c;
    }

    public void onLoadComplete(SoundPool soundpool, int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        org.andengine.a.c.a a1 = (org.andengine.a.c.a)d.get(i);
        if (a1 != null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        throw new a((new StringBuilder("Unexpected soundID: '")).append(i).append("'.").toString());
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        a1.(true);
        this;
        JVM INSTR monitorexit ;
    }
}
