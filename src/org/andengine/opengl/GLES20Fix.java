// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl;

import org.andengine.d.i.a;

public class GLES20Fix
{

    private static boolean a;
    private static final boolean b;

    public static native void glVertexAttribPointer(int i, int j, int k, boolean flag, int l, int i1);

    static 
    {
        System.loadLibrary("andengine");
        boolean flag = true;
_L1:
        a = flag;
        UnsatisfiedLinkError unsatisfiedlinkerror;
        if (org.andengine.d.i.a.a(8))
        {
            if (flag)
            {
                b = true;
            } else
            {
                throw new org.andengine.d.f.a("Inherently incompatible device detected.");
            }
        } else
        {
            b = false;
        }
        break MISSING_BLOCK_LABEL_48;
        unsatisfiedlinkerror;
        flag = false;
          goto _L1
    }
}
