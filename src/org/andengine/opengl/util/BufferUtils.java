// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.util;

import java.nio.ByteBuffer;
import org.andengine.d.i.a;

public class BufferUtils
{

    private static final boolean a;
    private static final boolean b;
    private static final boolean c;

    public static ByteBuffer a(int i)
    {
        if (c)
        {
            return jniAllocateDirect(i);
        } else
        {
            return ByteBuffer.allocateDirect(i);
        }
    }

    public static void a(ByteBuffer bytebuffer)
    {
        if (c)
        {
            jniFreeDirect(bytebuffer);
        }
    }

    public static void a(ByteBuffer bytebuffer, float af[], int i, int j)
    {
        if (b)
        {
            jniPut(bytebuffer, af, i, j);
        } else
        {
            int k = j;
            while (k < j + i) 
            {
                bytebuffer.putFloat(af[k]);
                k++;
            }
        }
        bytebuffer.position(0);
        bytebuffer.limit(i << 2);
    }

    private static native ByteBuffer jniAllocateDirect(int i);

    private static native void jniFreeDirect(ByteBuffer bytebuffer);

    private static native void jniPut(ByteBuffer bytebuffer, float af[], int i, int j);

    static 
    {
        System.loadLibrary("andengine");
        boolean flag = true;
_L2:
        a = flag;
        if (!a)
        {
            break; /* Loop/switch isn't completed */
        }
        UnsatisfiedLinkError unsatisfiedlinkerror;
        if (org.andengine.d.i.a.a(11, 13))
        {
            c = true;
        } else
        {
            c = false;
        }
        if (org.andengine.d.i.a.a(8))
        {
            b = true;
        } else
        {
            b = false;
        }
        break MISSING_BLOCK_LABEL_108;
        unsatisfiedlinkerror;
        flag = false;
        if (true) goto _L2; else goto _L1
_L1:
        c = false;
        if (org.andengine.d.i.a.a(11, 13))
        {
            org.andengine.d.e.a.c((new StringBuilder("Creating a ")).append(java/nio/ByteBuffer.getSimpleName()).append(" will actually allocate 4x the memory than requested!").toString());
        }
        b = false;
    }
}
