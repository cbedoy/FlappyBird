// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.method.SingleLineTransformationMethod;
import android.view.View;
import java.util.Locale;

class an extends SingleLineTransformationMethod
{

    private Locale a;

    public an(Context context)
    {
        a = context.getResources().getConfiguration().locale;
    }

    public CharSequence getTransformation(CharSequence charsequence, View view)
    {
        CharSequence charsequence1 = super.getTransformation(charsequence, view);
        if (charsequence1 != null)
        {
            return charsequence1.toString().toUpperCase(a);
        } else
        {
            return null;
        }
    }
}
