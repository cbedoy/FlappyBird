// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.a;

import android.content.Context;
import com.google.ads.br;
import com.google.ads.bs;
import com.google.ads.util.AdUtil;
import com.google.ads.util.ad;
import com.google.ads.util.g;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

// Referenced classes of package com.google.ads.a:
//            af

public class ae
    implements Runnable
{

    private String a;
    private Context b;

    public ae(String s, Context context)
    {
        a = s;
        b = context;
    }

    protected BufferedOutputStream a(HttpURLConnection httpurlconnection)
    {
        return new BufferedOutputStream(httpurlconnection.getOutputStream());
    }

    protected HttpURLConnection a(URL url)
    {
        HttpURLConnection httpurlconnection = (HttpURLConnection)url.openConnection();
        httpurlconnection.setDoOutput(true);
        httpurlconnection.setInstanceFollowRedirects(true);
        AdUtil.a(httpurlconnection, b);
        httpurlconnection.setRequestProperty("Accept", "application/json");
        httpurlconnection.setRequestProperty("Content-Type", "application/json");
        return httpurlconnection;
    }

    public void run()
    {
        String s = (String)((bs)br.a().b.a()).h.a();
        HttpURLConnection httpurlconnection;
        byte abyte0[];
        httpurlconnection = a(new URL(s));
        abyte0 = (new af(a)).a().toString().getBytes();
        httpurlconnection.setFixedLengthStreamingMode(abyte0.length);
        BufferedOutputStream bufferedoutputstream = a(httpurlconnection);
        bufferedoutputstream.write(abyte0);
        bufferedoutputstream.close();
        if (httpurlconnection.getResponseCode() != 200)
        {
            g.b((new StringBuilder()).append("Got error response from BadAd backend: ").append(httpurlconnection.getResponseMessage()).toString());
        }
        Exception exception;
        try
        {
            httpurlconnection.disconnect();
            return;
        }
        catch (IOException ioexception)
        {
            g.b("Error reporting bad ad.", ioexception);
        }
        break MISSING_BLOCK_LABEL_139;
        exception;
        httpurlconnection.disconnect();
        throw exception;
    }
}
