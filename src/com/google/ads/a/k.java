// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.a;

import com.google.ads.cb;
import com.google.ads.cc;
import com.google.ads.cd;
import com.google.ads.ce;
import java.util.HashMap;

final class k extends HashMap
{

    k()
    {
        put("/invalidRequest", new cb());
        put("/loadAdURL", new cc());
        put("/loadSdkConstants", new cd());
        put("/log", new ce());
    }
}
