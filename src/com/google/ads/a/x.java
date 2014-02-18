// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.a;

import android.os.Bundle;
import java.io.Serializable;
import java.util.HashMap;

public class x
{

    private final String a;
    private HashMap b;

    public x(Bundle bundle)
    {
        a = bundle.getString("action");
        b = a(bundle.getSerializable("params"));
    }

    public x(String s)
    {
        a = s;
    }

    public x(String s, HashMap hashmap)
    {
        this(s);
        b = hashmap;
    }

    private HashMap a(Serializable serializable)
    {
        if (serializable instanceof HashMap)
        {
            return (HashMap)serializable;
        } else
        {
            return null;
        }
    }

    public Bundle a()
    {
        Bundle bundle = new Bundle();
        bundle.putString("action", a);
        bundle.putSerializable("params", b);
        return bundle;
    }

    public String b()
    {
        return a;
    }

    public HashMap c()
    {
        return b;
    }
}
