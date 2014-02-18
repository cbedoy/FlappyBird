// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.view;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import org.andengine.b.a;
import org.andengine.b.c.a.c;
import org.andengine.b.c.b;
import org.andengine.b.c.d;

// Referenced classes of package org.andengine.opengl.view:
//            a, g, h

public class RenderSurfaceView extends GLSurfaceView
{

    private g a;
    private org.andengine.opengl.view.a b;

    public RenderSurfaceView(Context context)
    {
        super(context);
        setEGLContextClientVersion(2);
    }

    public RenderSurfaceView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setEGLContextClientVersion(2);
    }

    public void a(int i, int j)
    {
        setMeasuredDimension(i, j);
    }

    public void a(a a1, h h)
    {
        if (b == null)
        {
            b = new org.andengine.opengl.view.a(a1.d().e().a());
        }
        setEGLConfigChooser(b);
        setOnTouchListener(a1);
        a = new g(a1, b, h);
        setRenderer(a);
    }

    public org.andengine.opengl.view.a getConfigChooser()
    {
        if (b == null)
        {
            throw new IllegalStateException((new StringBuilder(String.valueOf(org/andengine/opengl/view/a.getSimpleName()))).append(" not yet set.").toString());
        } else
        {
            return b;
        }
    }

    protected void onMeasure(int i, int j)
    {
        if (isInEditMode())
        {
            super.onMeasure(i, j);
            return;
        } else
        {
            a.a.d().h().a(this, i, j);
            return;
        }
    }
}
