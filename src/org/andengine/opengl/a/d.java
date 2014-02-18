// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.andengine.opengl.a;

import android.util.SparseIntArray;

public class d
{

    public final char a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    private final boolean m;
    private SparseIntArray n;

    public boolean a()
    {
        return m;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            d d1 = (d)obj;
            if (a != d1.a)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return 31 + a;
    }

    public String toString()
    {
        return (new StringBuilder(String.valueOf(getClass().getSimpleName()))).append("[Character=").append(a).append(", Whitespace=").append(m).append(", TextureX=").append(b).append(", TextureY=").append(c).append(", Width=").append(d).append(", Height=").append(e).append(", OffsetX=").append(f).append(", OffsetY=").append(g).append(", Advance=").append(h).append(", U=").append(i).append(", V=").append(j).append(", U2=").append(k).append(", V2=").append(l).append(", Kernings=").append(n).append("]").toString();
    }
}
