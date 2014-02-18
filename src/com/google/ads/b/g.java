// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.b;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.ads.b:
//            i, h

public abstract class g
{

    public g()
    {
    }

    protected void a()
    {
    }

    public void a(Map map)
    {
        HashMap hashmap = new HashMap();
        Field afield[] = getClass().getFields();
        int j = afield.length;
        for (int k = 0; k < j; k++)
        {
            Field field2 = afield[k];
            i l = (i)field2.getAnnotation(com/google/ads/b/i);
            if (l != null)
            {
                hashmap.put(l.a(), field2);
            }
        }

        if (hashmap.isEmpty())
        {
            com.google.ads.util.g.e("No server options fields detected.  To suppress this message either add a field with the @Parameter annotation, or override the load() method");
        }
        for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            Field field1 = (Field)hashmap.remove(entry.getKey());
            if (field1 != null)
            {
                try
                {
                    field1.set(this, entry.getValue());
                }
                catch (IllegalAccessException illegalaccessexception)
                {
                    com.google.ads.util.g.b((new StringBuilder()).append("Server Option '").append((String)entry.getKey()).append("' could not be set: Illegal Access").toString());
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    com.google.ads.util.g.b((new StringBuilder()).append("Server Option '").append((String)entry.getKey()).append("' could not be set: Bad Type").toString());
                }
            } else
            {
                com.google.ads.util.g.e((new StringBuilder()).append("Unexpected Server Option: ").append((String)entry.getKey()).append(" = '").append((String)entry.getValue()).append("'").toString());
            }
        }

        String s = null;
        Iterator iterator1 = hashmap.values().iterator();
        while (iterator1.hasNext()) 
        {
            Field field = (Field)iterator1.next();
            String s1;
            if (((i)field.getAnnotation(com/google/ads/b/i)).b())
            {
                com.google.ads.util.g.b((new StringBuilder()).append("Required Server Option missing: ").append(((i)field.getAnnotation(com/google/ads/b/i)).a()).toString());
                StringBuilder stringbuilder = new StringBuilder();
                String s2;
                if (s == null)
                {
                    s2 = "";
                } else
                {
                    s2 = (new StringBuilder()).append(s).append(", ").toString();
                }
                s1 = stringbuilder.append(s2).append(((i)field.getAnnotation(com/google/ads/b/i)).a()).toString();
            } else
            {
                s1 = s;
            }
            s = s1;
        }
        if (s != null)
        {
            throw new h((new StringBuilder()).append("Required Server Option(s) missing: ").append(s).toString());
        } else
        {
            a();
            return;
        }
    }
}
