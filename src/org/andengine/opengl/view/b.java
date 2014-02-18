// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.view;


// Referenced classes of package org.andengine.opengl.view:
//            c, d, e, f

public abstract class b extends Enum
{

    public static final b a;
    public static final b b;
    public static final b c;
    public static final b d;
    private static final b e[];

    private b(String s, int i)
    {
        super(s, i);
    }

    b(String s, int i, b b1)
    {
        this(s, i);
    }

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(org/andengine/opengl/view/b, s);
    }

    public static b[] values()
    {
        b ab[] = e;
        int i = ab.length;
        b ab1[] = new b[i];
        System.arraycopy(ab, 0, ab1, 0, i);
        return ab1;
    }

    public abstract boolean a(int i, int j, int k, int l, int i1, int j1);

    static 
    {
        a = new c("STRICT", 0);
        b = new d("LOOSE_STENCIL", 1);
        c = new e("LOOSE_DEPTH_AND_STENCIL", 2);
        d = new f("ANY", 3);
        b ab[] = new b[4];
        ab[0] = a;
        ab[1] = b;
        ab[2] = c;
        ab[3] = d;
        e = ab;
    }
}
