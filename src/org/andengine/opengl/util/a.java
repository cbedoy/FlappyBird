// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.util;

import android.graphics.Bitmap;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.andengine.opengl.c.c;

public class a
{

    private static int a[];

    public static Buffer a(Bitmap bitmap, c c1, ByteOrder byteorder)
    {
        int ai[] = a(bitmap);
        switch (a()[c1.ordinal()])
        {
        case 3: // '\003'
        default:
            throw new IllegalArgumentException((new StringBuilder("Unexpected ")).append(org/andengine/opengl/c/c.getSimpleName()).append(": '").append(c1).append("'.").toString());

        case 5: // '\005'
            return ShortBuffer.wrap(b(ai, byteorder));

        case 4: // '\004'
            ByteOrder byteorder1;
            if (byteorder == ByteOrder.LITTLE_ENDIAN)
            {
                byteorder1 = ByteOrder.BIG_ENDIAN;
            } else
            {
                byteorder1 = ByteOrder.LITTLE_ENDIAN;
            }
            return IntBuffer.wrap(a(ai, byteorder1));

        case 2: // '\002'
            return ShortBuffer.wrap(c(ai, byteorder));

        case 6: // '\006'
            return ByteBuffer.wrap(a(ai));
        }
    }

    public static byte[] a(int ai[])
    {
        byte abyte0[] = new byte[ai.length];
        int i = -1 + ai.length;
        do
        {
            if (i < 0)
            {
                return abyte0;
            }
            abyte0[i] = (byte)(0xff & ai[i] >> 24);
            i--;
        } while (true);
    }

    static int[] a()
    {
        int ai[] = a;
        if (ai != null)
        {
            return ai;
        }
        int ai1[] = new int[org.andengine.opengl.c.c.values().length];
        try
        {
            ai1[c.h.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        try
        {
            ai1[c.f.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai1[c.g.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai1[c.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai1[c.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            ai1[c.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            ai1[c.e.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            ai1[c.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        a = ai1;
        return ai1;
    }

    public static int[] a(Bitmap bitmap)
    {
        int i = bitmap.getWidth();
        int j = bitmap.getHeight();
        int ai[] = new int[i * j];
        bitmap.getPixels(ai, 0, i, 0, 0, i, j);
        return ai;
    }

    public static int[] a(int ai[], ByteOrder byteorder)
    {
        int k;
        if (byteorder != ByteOrder.LITTLE_ENDIAN)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        k = -1 + ai.length;
_L3:
        if (k >= 0) goto _L2; else goto _L1
_L1:
        return ai;
_L2:
        int l = ai[k];
        ai[k] = 0xff00ff00 & l | 0xff0000 & l << 16 | 0xff & l >> 16;
        k--;
          goto _L3
        int i = -1 + ai.length;
        while (i >= 0) 
        {
            int j = ai[i];
            ai[i] = 0xffffff00 & j << 8 | 0xff & j >> 24;
            i--;
        }
          goto _L1
    }

    public static short[] b(int ai[], ByteOrder byteorder)
    {
        short aword0[];
        int k;
        aword0 = new short[ai.length];
        if (byteorder != ByteOrder.LITTLE_ENDIAN)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        k = -1 + ai.length;
_L3:
        if (k >= 0) goto _L2; else goto _L1
_L1:
        return aword0;
_L2:
        int l = ai[k];
        aword0[k] = (short)(0xf8 & l >> 16 | 7 & l >> 13 | 0xe000 & l << 3 | 0x1f00 & l << 5);
        k--;
          goto _L3
        int i = -1 + ai.length;
        while (i >= 0) 
        {
            int j = ai[i];
            aword0[i] = (short)(0xf800 & j >> 8 | 0x7e0 & j >> 5 | 0x1f & j >> 3);
            i--;
        }
          goto _L1
    }

    public static short[] c(int ai[], ByteOrder byteorder)
    {
        short aword0[];
        int k;
        aword0 = new short[ai.length];
        if (byteorder != ByteOrder.LITTLE_ENDIAN)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        k = -1 + ai.length;
_L3:
        if (k >= 0) goto _L2; else goto _L1
_L1:
        return aword0;
_L2:
        int l = ai[k];
        aword0[k] = (short)(0xf0 & l >> 16 | 0xf & l >> 12 | 0xf000 & l << 8 | 0xf00 & l >> 20);
        k--;
          goto _L3
        int i = -1 + ai.length;
        while (i >= 0) 
        {
            int j = ai[i];
            aword0[i] = (short)(0xf000 & j >> 8 | 0xf00 & j >> 4 | j & 0xf0 | 0xf & j >> 28);
            i--;
        }
          goto _L1
    }
}
