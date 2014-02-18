// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;


// Referenced classes of package com.google.tagmanager.a:
//            h

public final class br extends Enum
{

    public static final br a;
    public static final br b;
    public static final br c;
    public static final br d;
    public static final br e;
    public static final br f;
    public static final br g;
    public static final br h;
    public static final br i;
    private static final br k[];
    private final Object j;

    private br(String s, int l, Object obj)
    {
        super(s, l);
        j = obj;
    }

    public static br valueOf(String s)
    {
        return (br)Enum.valueOf(com/google/tagmanager/a/br, s);
    }

    public static br[] values()
    {
        return (br[])k.clone();
    }

    static 
    {
        a = new br("INT", 0, Integer.valueOf(0));
        b = new br("LONG", 1, Long.valueOf(0L));
        c = new br("FLOAT", 2, Float.valueOf(0.0F));
        d = new br("DOUBLE", 3, Double.valueOf(0.0D));
        e = new br("BOOLEAN", 4, Boolean.valueOf(false));
        f = new br("STRING", 5, "");
        g = new br("BYTE_STRING", 6, h.a);
        h = new br("ENUM", 7, null);
        i = new br("MESSAGE", 8, null);
        br abr[] = new br[9];
        abr[0] = a;
        abr[1] = b;
        abr[2] = c;
        abr[3] = d;
        abr[4] = e;
        abr[5] = f;
        abr[6] = g;
        abr[7] = h;
        abr[8] = i;
        k = abr;
    }
}
