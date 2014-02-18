// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.d.a;


// Referenced classes of package org.andengine.opengl.d.a:
//            a

public class c
{

    private final int a;
    private final a b[];

    public transient c(int i, a aa[])
    {
        b = aa;
        a = i;
    }

    public void a()
    {
        a aa[] = b;
        int i = a;
        int j = aa.length;
        int k = 0;
        do
        {
            if (k >= j)
            {
                return;
            }
            aa[k].a(i);
            k++;
        } while (true);
    }
}
