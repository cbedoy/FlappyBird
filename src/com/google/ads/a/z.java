// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.a;

import java.net.HttpURLConnection;
import java.net.URL;

// Referenced classes of package com.google.ads.a:
//            aa

class z
    implements aa
{

    z()
    {
    }

    public HttpURLConnection a(URL url)
    {
        return (HttpURLConnection)url.openConnection();
    }
}
