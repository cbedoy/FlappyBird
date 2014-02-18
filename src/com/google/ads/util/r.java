// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.util;

import android.app.AlertDialog;
import android.content.Context;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.ads.a.e;
import com.google.ads.br;
import com.google.ads.bs;
import com.google.ads.bt;

// Referenced classes of package com.google.ads.util:
//            x, w, v, u, 
//            t, s, q, g, 
//            ad, ae

public class r extends WebChromeClient
{

    private final bt a;

    public r(bt bt1)
    {
        a = bt1;
    }

    private static void a(android.app.AlertDialog.Builder builder, Context context, String s1, String s2, JsPromptResult jspromptresult)
    {
        LinearLayout linearlayout = new LinearLayout(context);
        linearlayout.setOrientation(1);
        TextView textview = new TextView(context);
        textview.setText(s1);
        EditText edittext = new EditText(context);
        edittext.setText(s2);
        linearlayout.addView(textview);
        linearlayout.addView(edittext);
        builder.setView(linearlayout).setPositiveButton(0x104000a, new x(jspromptresult, edittext)).setNegativeButton(0x1040000, new w(jspromptresult)).setOnCancelListener(new v(jspromptresult)).create().show();
    }

    private static void a(android.app.AlertDialog.Builder builder, String s1, JsResult jsresult)
    {
        builder.setMessage(s1).setPositiveButton(0x104000a, new u(jsresult)).setNegativeButton(0x1040000, new t(jsresult)).setOnCancelListener(new s(jsresult)).create().show();
    }

    private static boolean a(WebView webview, String s1, String s2, String s3, JsResult jsresult, JsPromptResult jspromptresult, boolean flag)
    {
        if (webview instanceof e)
        {
            com.google.ads.AdActivity adactivity = ((e)webview).i();
            if (adactivity != null)
            {
                android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(adactivity);
                builder.setTitle(s1);
                if (flag)
                {
                    a(builder, ((Context) (adactivity)), s2, s3, jspromptresult);
                } else
                {
                    a(builder, s2, jsresult);
                }
                return true;
            }
        }
        return false;
    }

    public void onCloseWindow(WebView webview)
    {
        if (webview instanceof e)
        {
            ((e)webview).f();
        }
    }

    public boolean onConsoleMessage(ConsoleMessage consolemessage)
    {
        String s1 = (new StringBuilder()).append("JS: ").append(consolemessage.message()).append(" (").append(consolemessage.sourceId()).append(":").append(consolemessage.lineNumber()).append(")").toString();
        q.a[consolemessage.messageLevel().ordinal()];
        JVM INSTR tableswitch 1 5: default 96
    //                   1 102
    //                   2 109
    //                   3 116
    //                   4 116
    //                   5 123;
           goto _L1 _L2 _L3 _L4 _L4 _L5
_L1:
        return super.onConsoleMessage(consolemessage);
_L2:
        g.b(s1);
        continue; /* Loop/switch isn't completed */
_L3:
        com.google.ads.util.g.e(s1);
        continue; /* Loop/switch isn't completed */
_L4:
        g.c(s1);
        continue; /* Loop/switch isn't completed */
_L5:
        g.a(s1);
        if (true) goto _L1; else goto _L6
_L6:
    }

    public void onExceededDatabaseQuota(String s1, String s2, long l, long l1, long l2, android.webkit.WebStorage.QuotaUpdater quotaupdater)
    {
        bs bs1 = (bs)((br)a.d.a()).b.a();
        long l3 = ((Long)bs1.l.a()).longValue() - l2;
        if (l3 <= 0L)
        {
            quotaupdater.updateQuota(l);
            return;
        }
        if (l == 0L)
        {
            if (l1 > l3 || l1 > ((Long)bs1.m.a()).longValue())
            {
                l1 = 0L;
            }
        } else
        if (l1 == 0L)
        {
            l1 = Math.min(l + Math.min(((Long)bs1.n.a()).longValue(), l3), ((Long)bs1.m.a()).longValue());
        } else
        {
            if (l1 <= Math.min(((Long)bs1.m.a()).longValue() - l, l3))
            {
                l += l1;
            }
            l1 = l;
        }
        quotaupdater.updateQuota(l1);
    }

    public boolean onJsAlert(WebView webview, String s1, String s2, JsResult jsresult)
    {
        return a(webview, s1, s2, null, jsresult, null, false);
    }

    public boolean onJsBeforeUnload(WebView webview, String s1, String s2, JsResult jsresult)
    {
        return a(webview, s1, s2, null, jsresult, null, false);
    }

    public boolean onJsConfirm(WebView webview, String s1, String s2, JsResult jsresult)
    {
        return a(webview, s1, s2, null, jsresult, null, false);
    }

    public boolean onJsPrompt(WebView webview, String s1, String s2, String s3, JsPromptResult jspromptresult)
    {
        return a(webview, s1, s2, s3, null, jspromptresult, true);
    }

    public void onReachedMaxAppCacheSize(long l, long l1, android.webkit.WebStorage.QuotaUpdater quotaupdater)
    {
        bs bs1 = (bs)((br)a.d.a()).b.a();
        long l2 = ((Long)bs1.k.a()).longValue() - l1;
        long l3 = l + ((Long)bs1.j.a()).longValue();
        if (l2 < l3)
        {
            quotaupdater.updateQuota(0L);
            return;
        } else
        {
            quotaupdater.updateQuota(l3);
            return;
        }
    }

    public void onShowCustomView(View view, android.webkit.WebChromeClient.CustomViewCallback customviewcallback)
    {
        customviewcallback.onCustomViewHidden();
    }
}
