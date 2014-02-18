// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.a;

import com.google.ads.util.g;
import org.json.JSONException;
import org.json.JSONObject;

public class af
{

    private final String a;

    public af(String s)
    {
        a = s;
    }

    public JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("debugHeader", a);
        }
        catch (JSONException jsonexception)
        {
            g.b("Could not build ReportAdJson from inputs.", jsonexception);
            return jsonobject;
        }
        return jsonobject;
    }
}
