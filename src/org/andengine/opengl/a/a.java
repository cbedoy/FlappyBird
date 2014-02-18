// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.util.SparseArray;
import java.util.ArrayList;
import org.andengine.opengl.c.c;
import org.andengine.opengl.c.f;
import org.andengine.opengl.util.e;

// Referenced classes of package org.andengine.opengl.a:
//            d

public class a
{

    protected final Paint a;
    protected final android.graphics.Paint.FontMetrics b;
    protected final Canvas c;
    private final org.andengine.opengl.c.a d;
    private final SparseArray e;
    private final ArrayList f;
    private final Paint g;

    public float a()
    {
        return b.ascent;
    }

    protected Bitmap a(d d1)
    {
        String s = String.valueOf(d1.a);
        Bitmap bitmap = Bitmap.createBitmap(2 + d1.d, 2 + d1.e, android.graphics.Bitmap.Config.ARGB_8888);
        c.setBitmap(bitmap);
        c.drawRect(0.0F, 0.0F, bitmap.getWidth(), bitmap.getHeight(), g);
        a(s, -d1.f, -(d1.g + a()));
        return bitmap;
    }

    protected void a(String s, float f1, float f2)
    {
        c.drawText(s, f1 + 1.0F, 1.0F + f2, a);
    }

    public void a(e e1)
    {
        this;
        JVM INSTR monitorenter ;
        if (!d.c()) goto _L2; else goto _L1
_L1:
        ArrayList arraylist = f;
        if (arraylist.size() <= 0) goto _L2; else goto _L3
_L3:
        c c1;
        boolean flag;
        int i;
        d.d(e1);
        c1 = d.f();
        flag = d.g().n;
        i = -1 + arraylist.size();
_L12:
        if (i >= 0) goto _L5; else goto _L4
_L4:
        arraylist.clear();
        System.gc();
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L5:
        d d1 = (d)arraylist.get(i);
        if (d1.a()) goto _L7; else goto _L6
_L6:
        Bitmap bitmap = a(d1);
        Exception exception;
        boolean flag1;
        if (org.andengine.d.g.a.a(bitmap.getWidth()) && org.andengine.d.g.a.a(bitmap.getHeight()) && c1 == c.d)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_156;
        }
        GLES20.glPixelStorei(3317, 1);
        if (!flag) goto _L9; else goto _L8
_L8:
        GLUtils.texSubImage2D(3553, 0, d1.b, d1.c, bitmap);
_L10:
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        GLES20.glPixelStorei(3317, 4);
        bitmap.recycle();
        break; /* Loop/switch isn't completed */
_L9:
        e1.a(3553, 0, d1.b, d1.c, bitmap, c1);
        if (true) goto _L10; else goto _L7
        exception;
        throw exception;
_L7:
        i--;
        if (true) goto _L12; else goto _L11
_L11:
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        SparseArray sparsearray;
        int i;
        arraylist = f;
        sparsearray = e;
        i = sparsearray.size();
        int j = i - 1;
_L2:
        if (j < 0)
        {
            return;
        }
        arraylist.add((d)sparsearray.valueAt(j));
        j--;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        throw exception;
    }
}
