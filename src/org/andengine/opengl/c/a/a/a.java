// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.c.a.a;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import java.util.ArrayList;
import org.andengine.d.f.b;
import org.andengine.opengl.c.a.c;
import org.andengine.opengl.c.f;
import org.andengine.opengl.util.e;

public class a extends c
{

    private final org.andengine.opengl.c.b.a j;

    public a(org.andengine.opengl.c.e e1, int i, int k, org.andengine.opengl.c.b.a a1, f f1, org.andengine.opengl.c.a.b b1)
    {
        super(e1, i, k, a1.b(), f1, b1);
        j = a1;
    }

    public a(org.andengine.opengl.c.e e1, int i, int k, f f1)
    {
        this(e1, i, k, org.andengine.opengl.c.b.a.a, f1, null);
    }

    protected void e(e e1)
    {
        org.andengine.opengl.c.c c1;
        int k;
        int l;
        boolean flag;
        android.graphics.Bitmap.Config config;
        ArrayList arraylist;
        org.andengine.opengl.c.a.b b1;
        int j1;
        c1 = j.b();
        int i = c1.a();
        k = c1.b();
        l = c1.c();
        GLES20.glTexImage2D(3553, 0, i, g, h, 0, k, l, null);
        flag = c.n;
        int i1;
        if (flag)
        {
            config = j.a();
        } else
        {
            config = android.graphics.Bitmap.Config.ARGB_8888;
        }
        arraylist = this.i;
        i1 = arraylist.size();
        b1 = k();
        j1 = 0;
_L2:
        org.andengine.opengl.c.a.a.a.b b2;
        if (j1 >= i1)
        {
            return;
        }
        b2 = (org.andengine.opengl.c.a.a.a.b)arraylist.get(j1);
        Bitmap bitmap = b2.a(config);
        if (bitmap != null)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            throw new b((new StringBuilder("Caused by: ")).append(b2.getClass().toString()).append(" --> ").append(b2.toString()).append(" returned a null Bitmap.").toString());
        }
        catch (b b3)
        {
            if (b1 != null)
            {
                b1.a(this, b2, b3);
            } else
            {
                throw b3;
            }
        }
        j1++;
        if (true) goto _L2; else goto _L1
_L1:
        boolean flag1;
        if (org.andengine.d.g.a.a(bitmap.getWidth()) && org.andengine.d.g.a.a(bitmap.getHeight()) && c1 == org.andengine.opengl.c.c.d)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_254;
        }
        GLES20.glPixelStorei(3317, 1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_321;
        }
        GLUtils.texSubImage2D(3553, 0, b2.a(), b2.b(), bitmap, k, l);
_L3:
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_298;
        }
        GLES20.glPixelStorei(3317, 4);
        bitmap.recycle();
        if (b1 == null)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        b1.a(this, b2);
        break MISSING_BLOCK_LABEL_204;
        e1.a(3553, 0, b2.a(), b2.b(), bitmap, b);
          goto _L3
    }
}
