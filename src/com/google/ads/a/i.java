// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.a;

import com.google.ads.bv;
import com.google.ads.bw;
import com.google.ads.bx;
import com.google.ads.by;
import com.google.ads.bz;
import com.google.ads.ca;
import com.google.ads.ce;
import com.google.ads.cf;
import com.google.ads.m;
import com.google.ads.n;
import java.util.HashMap;

final class i extends HashMap
{

    i()
    {
        put("/open", new cf());
        put("/canOpenURLs", new bw());
        put("/close", new by());
        put("/customClose", new bz());
        put("/appEvent", new bv());
        put("/log", new ce());
        put("/click", new bx());
        put("/httpTrack", new ca());
        put("/touch", new m());
        put("/video", new n());
    }
}
