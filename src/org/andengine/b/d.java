// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.b;

import android.os.Process;
import org.andengine.b.b.a.a;
import org.andengine.b.c.b;

// Referenced classes of package org.andengine.b:
//            a

public class d extends Thread
{

    private org.andengine.b.a a;
    private final a b = new a();

    public d()
    {
        super(org/andengine/b/d.getSimpleName());
    }

    public void a(org.andengine.b.a a1)
    {
        a = a1;
    }

    public void run()
    {
        Process.setThreadPriority(a.d().l());
        try
        {
            do
            {
                b.a_(0.0F);
                a.m();
            } while (true);
        }
        catch (InterruptedException interruptedexception)
        {
            org.andengine.d.e.a.a((new StringBuilder(String.valueOf(getClass().getSimpleName()))).append(" interrupted. Don't worry - this ").append(interruptedexception.getClass().getSimpleName()).append(" is most likely expected!").toString(), interruptedexception);
        }
        interrupt();
    }
}
