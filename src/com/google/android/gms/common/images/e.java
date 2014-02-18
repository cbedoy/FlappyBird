// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.internal.ch;
import com.google.android.gms.internal.cm;
import com.google.android.gms.internal.cn;
import com.google.android.gms.internal.p;
import java.lang.ref.WeakReference;

// Referenced classes of package com.google.android.gms.common.images:
//            a, f

public final class e
{

    final f a;
    int b;
    private int c;
    private int d;
    private WeakReference e;
    private WeakReference f;
    private WeakReference g;
    private int h;
    private boolean i;
    private boolean j;

    private ch a(Drawable drawable, Drawable drawable1)
    {
        if (drawable != null)
        {
            if (drawable instanceof ch)
            {
                drawable = ((ch)drawable).b();
            }
        } else
        {
            drawable = null;
        }
        return new ch(drawable, drawable1);
    }

    private void a(Drawable drawable, boolean flag, boolean flag1, boolean flag2)
    {
        b;
        JVM INSTR tableswitch 1 3: default 32
    //                   1 33
    //                   2 70
    //                   3 99;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L2:
        a a1;
        if (!flag1 && (a1 = (a)e.get()) != null)
        {
            a1.a(a.a, drawable);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        ImageView imageview = (ImageView)f.get();
        if (imageview != null)
        {
            a(imageview, drawable, flag, flag1, flag2);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        TextView textview = (TextView)g.get();
        if (textview != null)
        {
            a(textview, h, drawable, flag, flag1);
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    private void a(ImageView imageview, Drawable drawable, boolean flag, boolean flag1, boolean flag2)
    {
        boolean flag3;
        int l;
        if (!flag1 && !flag2)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (!flag3 || !(imageview instanceof cm)) goto _L2; else goto _L1
_L1:
        l = ((cm)imageview).a();
        if (c == 0 || l != c) goto _L2; else goto _L3
_L3:
        return;
_L2:
        boolean flag4 = a(flag, flag1);
        Object obj;
        if (flag4)
        {
            obj = a(imageview.getDrawable(), drawable);
        } else
        {
            obj = drawable;
        }
        imageview.setImageDrawable(((Drawable) (obj)));
        if (imageview instanceof cm)
        {
            cm cm1 = (cm)imageview;
            android.net.Uri uri;
            int k;
            if (flag2)
            {
                uri = a.a;
            } else
            {
                uri = null;
            }
            cm1.a(uri);
            if (flag3)
            {
                k = c;
            } else
            {
                k = 0;
            }
            cm1.a(k);
        }
        if (flag4)
        {
            ((ch)obj).a(250);
            return;
        }
        if (true) goto _L3; else goto _L4
_L4:
    }

    private void a(TextView textview, int k, Drawable drawable, boolean flag, boolean flag1)
    {
        boolean flag2 = a(flag, flag1);
        Drawable adrawable[];
        Drawable drawable1;
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        if (p.e())
        {
            adrawable = textview.getCompoundDrawablesRelative();
        } else
        {
            adrawable = textview.getCompoundDrawables();
        }
        drawable1 = adrawable[k];
        if (flag2)
        {
            obj = a(drawable1, drawable);
        } else
        {
            obj = drawable;
        }
        if (k == 0)
        {
            obj1 = obj;
        } else
        {
            obj1 = adrawable[0];
        }
        if (k == 1)
        {
            obj2 = obj;
        } else
        {
            obj2 = adrawable[1];
        }
        if (k == 2)
        {
            obj3 = obj;
        } else
        {
            obj3 = adrawable[2];
        }
        if (k == 3)
        {
            obj4 = obj;
        } else
        {
            obj4 = adrawable[3];
        }
        if (p.e())
        {
            textview.setCompoundDrawablesRelativeWithIntrinsicBounds(((Drawable) (obj1)), ((Drawable) (obj2)), ((Drawable) (obj3)), ((Drawable) (obj4)));
        } else
        {
            textview.setCompoundDrawablesWithIntrinsicBounds(((Drawable) (obj1)), ((Drawable) (obj2)), ((Drawable) (obj3)), ((Drawable) (obj4)));
        }
        if (flag2)
        {
            ((ch)obj).a(250);
        }
    }

    private boolean a(boolean flag, boolean flag1)
    {
        return i && !flag1 && (!flag || j);
    }

    void a(Context context, Bitmap bitmap, boolean flag)
    {
        cn.a(bitmap);
        a(((Drawable) (new BitmapDrawable(context.getResources(), bitmap))), flag, false, true);
    }

    void a(Context context, boolean flag)
    {
        int k = c;
        Drawable drawable = null;
        if (k != 0)
        {
            drawable = context.getResources().getDrawable(c);
        }
        a(drawable, flag, false, false);
    }

    public boolean equals(Object obj)
    {
        boolean flag = true;
        if (!(obj instanceof e))
        {
            flag = false;
        } else
        if (this != obj && ((e)obj).hashCode() != hashCode())
        {
            return false;
        }
        return flag;
    }

    public int hashCode()
    {
        return d;
    }
}
