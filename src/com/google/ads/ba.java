// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import com.google.ads.a.ac;
import com.google.ads.util.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.google.ads:
//            bb, k, g

public class ba
{

    private static final Map a = Collections.unmodifiableMap(new bb());
    private final String b;
    private final String c;
    private final List d;
    private final Integer e;
    private final Integer f;
    private final List g;
    private final List h;
    private final List i;

    private ba(String s, String s1, List list, Integer integer, Integer integer1, List list1, List list2, 
            List list3)
    {
        com.google.ads.util.e.a(s);
        b = s;
        c = s1;
        d = list;
        e = integer;
        f = integer1;
        g = list1;
        h = list2;
        i = list3;
    }

    public static ba a(String s)
    {
        JSONObject jsonobject = new JSONObject(s);
        String s1 = jsonobject.getString("qdata");
        String s2;
        JSONArray jsonarray;
        ArrayList arraylist;
        if (jsonobject.has("ad_type"))
        {
            s2 = jsonobject.getString("ad_type");
        } else
        {
            s2 = null;
        }
        jsonarray = jsonobject.getJSONArray("ad_networks");
        arraylist = new ArrayList(jsonarray.length());
        for (int l = 0; l < jsonarray.length(); l++)
        {
            arraylist.add(a(jsonarray.getJSONObject(l)));
        }

        JSONObject jsonobject1 = jsonobject.optJSONObject("settings");
        Integer integer;
        Integer integer1;
        List list;
        List list1;
        List list2;
        if (jsonobject1 != null)
        {
            boolean flag;
            Integer integer2;
            if (jsonobject1.has("refresh"))
            {
                integer = Integer.valueOf(jsonobject1.getInt("refresh"));
            } else
            {
                integer = null;
            }
            flag = jsonobject1.has("ad_network_timeout_millis");
            integer2 = null;
            if (flag)
            {
                integer2 = Integer.valueOf(jsonobject1.getInt("ad_network_timeout_millis"));
            }
            list = a(jsonobject1, "imp_urls");
            list1 = a(jsonobject1, "click_urls");
            list2 = a(jsonobject1, "nofill_urls");
            integer1 = integer2;
        } else
        {
            integer = null;
            integer1 = null;
            list = null;
            list1 = null;
            list2 = null;
        }
        return new ba(s1, s2, arraylist, integer, integer1, list, list1, list2);
    }

    private static k a(JSONObject jsonobject)
    {
        String s = jsonobject.getString("id");
        String s1 = jsonobject.optString("allocation_id", null);
        JSONArray jsonarray = jsonobject.getJSONArray("adapters");
        ArrayList arraylist = new ArrayList(jsonarray.length());
        for (int l = 0; l < jsonarray.length(); l++)
        {
            arraylist.add(jsonarray.getString(l));
        }

        List list = a(jsonobject, "imp_urls");
        JSONObject jsonobject1 = jsonobject.optJSONObject("data");
        HashMap hashmap = new HashMap(0);
        HashMap hashmap1;
        if (jsonobject1 != null)
        {
            hashmap1 = new HashMap(jsonobject1.length());
            String s2;
            for (Iterator iterator = jsonobject1.keys(); iterator.hasNext(); hashmap1.put(s2, jsonobject1.getString(s2)))
            {
                s2 = (String)iterator.next();
            }

        } else
        {
            hashmap1 = hashmap;
        }
        return new k(s1, s, arraylist, list, hashmap1);
    }

    private static List a(JSONObject jsonobject, String s)
    {
        JSONArray jsonarray = jsonobject.optJSONArray(s);
        if (jsonarray != null)
        {
            ArrayList arraylist = new ArrayList(jsonarray.length());
            for (int l = 0; l < jsonarray.length(); l++)
            {
                arraylist.add(jsonarray.getString(l));
            }

            return arraylist;
        } else
        {
            return null;
        }
    }

    public boolean a()
    {
        return f != null;
    }

    public int b()
    {
        return f.intValue();
    }

    public String c()
    {
        return b;
    }

    public boolean d()
    {
        return e != null;
    }

    public int e()
    {
        return e.intValue();
    }

    public List f()
    {
        return d;
    }

    public List g()
    {
        return g;
    }

    public List h()
    {
        return h;
    }

    public List i()
    {
        return i;
    }

    public ac j()
    {
        if (c == null)
        {
            return null;
        }
        if ("interstitial".equals(c))
        {
            return ac.a;
        }
        g g1 = (g)a.get(c);
        if (g1 != null)
        {
            return ac.a(g1);
        } else
        {
            return null;
        }
    }

}
