// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;


public final class bi
{

    public static Object a(String s, Class class1)
    {
        return class1.cast(Class.forName(s).newInstance());
    }

    public static String a(String s, String s1, Boolean boolean1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, String s9)
    {
        String s10 = s.replaceAll("@gw_adlocid@", s1).replaceAll("@gw_qdata@", s5).replaceAll("@gw_sdkver@", "afma-sdk-a-v6.4.1").replaceAll("@gw_sessid@", s6).replaceAll("@gw_seqnum@", s7).replaceAll("@gw_devid@", s2);
        if (s4 != null)
        {
            s10 = s10.replaceAll("@gw_adnetid@", s4);
        }
        if (s3 != null)
        {
            s10 = s10.replaceAll("@gw_allocid@", s3);
        }
        if (s8 != null)
        {
            s10 = s10.replaceAll("@gw_adt@", s8);
        }
        if (s9 != null)
        {
            s10 = s10.replaceAll("@gw_aec@", s9);
        }
        if (boolean1 != null)
        {
            String s11;
            if (boolean1.booleanValue())
            {
                s11 = "1";
            } else
            {
                s11 = "0";
            }
            return s10.replaceAll("@gw_adnetrefresh@", s11);
        } else
        {
            return s10;
        }
    }
}
