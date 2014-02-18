// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.graphics.Canvas;

// Referenced classes of package android.support.v4.widget:
//            j, i, k

public class h
{

    private static final k b;
    private Object a;

    public h(Context context)
    {
        a = b.a(context);
    }

    public void a(int l, int i1)
    {
        b.a(a, l, i1);
    }

    public boolean a()
    {
        return b.a(a);
    }

    public boolean a(float f)
    {
        return b.a(a, f);
    }

    public boolean a(Canvas canvas)
    {
        return b.a(a, canvas);
    }

    public void b()
    {
        b.b(a);
    }

    public boolean c()
    {
        return b.c(a);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            b = new j();
        } else
        {
            b = new i();
        }
    }
}
