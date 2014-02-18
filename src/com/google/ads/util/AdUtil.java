// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.location.Location;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.ads.AdActivity;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.nio.CharBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.ads.util:
//            n, g, m, a

public final class AdUtil
{

    public static final int a;
    private static Boolean b = null;
    private static String c = null;
    private static String d;
    private static String e = null;
    private static AudioManager f;
    private static boolean g = true;
    private static boolean h = false;
    private static String i = null;

    public static int a()
    {
        return a < 9 ? 0 : 6;
    }

    public static int a(Context context, int j)
    {
        return (int)TypedValue.applyDimension(1, j, context.getResources().getDisplayMetrics());
    }

    public static int a(Context context, DisplayMetrics displaymetrics)
    {
        if (a >= 4)
        {
            return n.a(context, displaymetrics);
        } else
        {
            return displaymetrics.heightPixels;
        }
    }

    public static int a(String s)
    {
        int j;
        try
        {
            j = Integer.parseInt(s);
        }
        catch (NumberFormatException numberformatexception)
        {
            com.google.ads.util.g.e((new StringBuilder()).append("The Android SDK version couldn't be parsed to an int: ").append(android.os.Build.VERSION.SDK).toString());
            com.google.ads.util.g.e("Defaulting to Android SDK version 3.");
            return 3;
        }
        return j;
    }

    public static DisplayMetrics a(Activity activity)
    {
        if (activity.getWindowManager() == null)
        {
            return null;
        } else
        {
            DisplayMetrics displaymetrics = new DisplayMetrics();
            activity.getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
            return displaymetrics;
        }
    }

    public static String a(Context context)
    {
        if (c == null)
        {
            String s = android.provider.Settings.Secure.getString(context.getContentResolver(), "android_id");
            String s1;
            if (s == null || c())
            {
                s1 = b("emulator");
            } else
            {
                s1 = b(s);
            }
            if (s1 == null)
            {
                return null;
            }
            c = s1.toUpperCase(Locale.US);
        }
        return c;
    }

    public static String a(Readable readable)
    {
        StringBuilder stringbuilder = new StringBuilder();
        CharBuffer charbuffer = CharBuffer.allocate(2048);
        do
        {
            int j = readable.read(charbuffer);
            if (j != -1)
            {
                charbuffer.flip();
                stringbuilder.append(charbuffer, 0, j);
            } else
            {
                return stringbuilder.toString();
            }
        } while (true);
    }

    public static String a(Map map)
    {
        String s;
        try
        {
            s = b(map).toString();
        }
        catch (JSONException jsonexception)
        {
            com.google.ads.util.g.d("JsonException in serialization: ", jsonexception);
            return null;
        }
        return s;
    }

    public static HashMap a(Location location)
    {
        if (location == null)
        {
            return null;
        } else
        {
            HashMap hashmap = new HashMap();
            hashmap.put("time", Long.valueOf(1000L * location.getTime()));
            hashmap.put("lat", Long.valueOf((long)(10000000D * location.getLatitude())));
            hashmap.put("long", Long.valueOf((long)(10000000D * location.getLongitude())));
            hashmap.put("radius", Long.valueOf((long)(1000F * location.getAccuracy())));
            return hashmap;
        }
    }

    public static JSONArray a(Set set)
    {
        JSONArray jsonarray = new JSONArray();
        if (set == null || set.isEmpty())
        {
            return jsonarray;
        }
        for (Iterator iterator = set.iterator(); iterator.hasNext();)
        {
            Object obj = iterator.next();
            if ((obj instanceof String) || (obj instanceof Integer) || (obj instanceof Double) || (obj instanceof Long) || (obj instanceof Float))
            {
                jsonarray.put(obj);
            } else
            if (obj instanceof Map)
            {
                try
                {
                    jsonarray.put(b((Map)obj));
                }
                catch (ClassCastException classcastexception1)
                {
                    com.google.ads.util.g.d("Unknown map type in json serialization: ", classcastexception1);
                }
            } else
            if (obj instanceof Set)
            {
                try
                {
                    jsonarray.put(a((Set)obj));
                }
                catch (ClassCastException classcastexception)
                {
                    com.google.ads.util.g.d("Unknown map type in json serialization: ", classcastexception);
                }
            } else
            {
                com.google.ads.util.g.e((new StringBuilder()).append("Unknown value in json serialization: ").append(obj).toString());
            }
        }

        return jsonarray;
    }

    public static void a(WebView webview)
    {
        String s = i(webview.getContext().getApplicationContext());
        webview.getSettings().setUserAgentString(s);
    }

    public static void a(HttpURLConnection httpurlconnection, Context context)
    {
        httpurlconnection.setRequestProperty("User-Agent", i(context));
    }

    public static void a(boolean flag)
    {
        g = flag;
    }

    public static boolean a(int j, int k, String s)
    {
        if ((j & k) == 0)
        {
            com.google.ads.util.g.b((new StringBuilder()).append("The android:configChanges value of the com.google.ads.AdActivity must include ").append(s).append(".").toString());
            return false;
        } else
        {
            return true;
        }
    }

    public static boolean a(Context context, String s)
    {
        try
        {
            context.getPackageManager().getPackageInfo(s, 0);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return false;
        }
        return true;
    }

    public static boolean a(Intent intent, Context context)
    {
        return context.getPackageManager().resolveActivity(intent, 0x10000) != null;
    }

    public static boolean a(Uri uri)
    {
        String s;
        if (uri != null)
        {
            if ("http".equalsIgnoreCase(s = uri.getScheme()) || "https".equalsIgnoreCase(s))
            {
                return true;
            }
        }
        return false;
    }

    static boolean a(m m1)
    {
        if (m1 == null)
        {
            m1 = m.d;
        }
        return m1.equals(m.e) || m1.equals(m.f);
    }

    public static int b()
    {
        return a < 9 ? 1 : 7;
    }

    public static int b(Context context, DisplayMetrics displaymetrics)
    {
        if (a >= 4)
        {
            return n.b(context, displaymetrics);
        } else
        {
            return displaymetrics.widthPixels;
        }
    }

    public static String b(String s)
    {
        String s1 = null;
        if (s != null)
        {
            int j = s.length();
            s1 = null;
            if (j > 0)
            {
                String s2;
                try
                {
                    MessageDigest messagedigest = MessageDigest.getInstance("MD5");
                    messagedigest.update(s.getBytes(), 0, s.length());
                    Locale locale = Locale.US;
                    Object aobj[] = new Object[1];
                    aobj[0] = new BigInteger(1, messagedigest.digest());
                    s2 = String.format(locale, "%032X", aobj);
                }
                catch (NoSuchAlgorithmException nosuchalgorithmexception)
                {
                    return s.substring(0, 32);
                }
                s1 = s2;
            }
        }
        return s1;
    }

    public static HashMap b(Uri uri)
    {
        if (uri == null)
        {
            return null;
        }
        HashMap hashmap = new HashMap();
        String s = uri.getEncodedQuery();
        if (s != null)
        {
            String as[] = s.split("&");
            int j = as.length;
            int k = 0;
            while (k < j) 
            {
                String s1 = as[k];
                int l = s1.indexOf("=");
                if (l < 0)
                {
                    hashmap.put(Uri.decode(s1), null);
                } else
                {
                    hashmap.put(Uri.decode(s1.substring(0, l)), Uri.decode(s1.substring(l + 1, s1.length())));
                }
                k++;
            }
        }
        return hashmap;
    }

    public static JSONObject b(Map map)
    {
        JSONObject jsonobject = new JSONObject();
        if (map == null || map.isEmpty())
        {
            return jsonobject;
        }
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            Object obj = map.get(s);
            if ((obj instanceof String) || (obj instanceof Integer) || (obj instanceof Double) || (obj instanceof Long) || (obj instanceof Float))
            {
                jsonobject.put(s, obj);
            } else
            if (obj instanceof Map)
            {
                try
                {
                    jsonobject.put(s, b((Map)obj));
                }
                catch (ClassCastException classcastexception1)
                {
                    com.google.ads.util.g.d("Unknown map type in json serialization: ", classcastexception1);
                }
            } else
            if (obj instanceof Set)
            {
                try
                {
                    jsonobject.put(s, a((Set)obj));
                }
                catch (ClassCastException classcastexception)
                {
                    com.google.ads.util.g.d("Unknown map type in json serialization: ", classcastexception);
                }
            } else
            {
                com.google.ads.util.g.e((new StringBuilder()).append("Unknown value in json serialization: ").append(obj).toString());
            }
        }

        return jsonobject;
    }

    public static boolean b(Context context)
    {
        PackageManager packagemanager = context.getPackageManager();
        String s = context.getPackageName();
        if (packagemanager.checkPermission("android.permission.INTERNET", s) == -1)
        {
            com.google.ads.util.g.b("INTERNET permissions must be enabled in AndroidManifest.xml.");
            return false;
        }
        if (packagemanager.checkPermission("android.permission.ACCESS_NETWORK_STATE", s) == -1)
        {
            com.google.ads.util.g.b("ACCESS_NETWORK_STATE permissions must be enabled in AndroidManifest.xml.");
            return false;
        } else
        {
            return true;
        }
    }

    public static boolean c()
    {
        return a(((m) (null)));
    }

    public static boolean c(Context context)
    {
        ResolveInfo resolveinfo;
        if (b != null)
        {
            return b.booleanValue();
        }
        resolveinfo = context.getPackageManager().resolveActivity(new Intent(context, com/google/ads/AdActivity), 0x10000);
        b = Boolean.valueOf(true);
        if (resolveinfo != null && resolveinfo.activityInfo != null) goto _L2; else goto _L1
_L1:
        com.google.ads.util.g.b("Could not find com.google.ads.AdActivity, please make sure it is registered in AndroidManifest.xml.");
        b = Boolean.valueOf(false);
_L4:
        return b.booleanValue();
_L2:
        if (!a(resolveinfo.activityInfo.configChanges, 16, "keyboard"))
        {
            b = Boolean.valueOf(false);
        }
        if (!a(resolveinfo.activityInfo.configChanges, 32, "keyboardHidden"))
        {
            b = Boolean.valueOf(false);
        }
        if (!a(resolveinfo.activityInfo.configChanges, 128, "orientation"))
        {
            b = Boolean.valueOf(false);
        }
        if (!a(resolveinfo.activityInfo.configChanges, 256, "screenLayout"))
        {
            b = Boolean.valueOf(false);
        }
        if (!a(resolveinfo.activityInfo.configChanges, 512, "uiMode"))
        {
            b = Boolean.valueOf(false);
        }
        if (!a(resolveinfo.activityInfo.configChanges, 1024, "screenSize"))
        {
            b = Boolean.valueOf(false);
        }
        if (!a(resolveinfo.activityInfo.configChanges, 2048, "smallestScreenSize"))
        {
            b = Boolean.valueOf(false);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String d(Context context)
    {
        NetworkInfo networkinfo = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (networkinfo == null)
        {
            return null;
        }
        switch (networkinfo.getType())
        {
        default:
            return "unknown";

        case 0: // '\0'
            return "ed";

        case 1: // '\001'
            return "wi";
        }
    }

    public static boolean d()
    {
        return g;
    }

    public static String e(Context context)
    {
        if (d == null)
        {
            StringBuilder stringbuilder = new StringBuilder();
            PackageManager packagemanager = context.getPackageManager();
            List list = packagemanager.queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("geo:0,0?q=donuts")), 0x10000);
            if (list == null || list.isEmpty())
            {
                stringbuilder.append("m");
            }
            List list1 = packagemanager.queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse("market://search?q=pname:com.google")), 0x10000);
            if (list1 == null || list1.isEmpty())
            {
                if (stringbuilder.length() > 0)
                {
                    stringbuilder.append(",");
                }
                stringbuilder.append("a");
            }
            d = stringbuilder.toString();
        }
        return d;
    }

    public static String f(Context context)
    {
        if (e == null) goto _L2; else goto _L1
_L1:
        String s = e;
_L4:
        return s;
_L2:
        PackageManager packagemanager;
        ResolveInfo resolveinfo;
        ActivityInfo activityinfo;
        PackageInfo packageinfo;
        String s1;
        try
        {
            packagemanager = context.getPackageManager();
            resolveinfo = packagemanager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.ads")), 0x10000);
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            return null;
        }
        s = null;
        if (resolveinfo == null) goto _L4; else goto _L3
_L3:
        activityinfo = resolveinfo.activityInfo;
        s = null;
        if (activityinfo == null) goto _L4; else goto _L5
_L5:
        packageinfo = packagemanager.getPackageInfo(activityinfo.packageName, 0);
        s = null;
        if (packageinfo == null) goto _L4; else goto _L6
_L6:
        e = (new StringBuilder()).append(packageinfo.versionCode).append(".").append(activityinfo.packageName).toString();
        s1 = e;
        return s1;
    }

    public static a g(Context context)
    {
        if (f == null)
        {
            f = (AudioManager)context.getSystemService("audio");
        }
        a _tmp = a.f;
        int j = f.getMode();
        if (c())
        {
            return a.e;
        }
        if (f.isMusicActive() || f.isSpeakerphoneOn() || j == 2 || j == 1)
        {
            return a.d;
        }
        int k = f.getRingerMode();
        if (k == 0 || k == 1)
        {
            return a.d;
        } else
        {
            return a.b;
        }
    }

    public static void h(Context context)
    {
        if (h)
        {
            return;
        } else
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("android.intent.action.USER_PRESENT");
            intentfilter.addAction("android.intent.action.SCREEN_OFF");
            context.registerReceiver(new UserActivityReceiver(), intentfilter);
            h = true;
            return;
        }
    }

    public static String i(Context context)
    {
        if (i == null)
        {
            String s = (new WebView(context)).getSettings().getUserAgentString();
            if (s == null || s.length() == 0 || s.equals("Java0"))
            {
                String s1 = System.getProperty("os.name", "Linux");
                String s2 = (new StringBuilder()).append("Android ").append(android.os.Build.VERSION.RELEASE).toString();
                Locale locale = Locale.getDefault();
                String s3 = locale.getLanguage().toLowerCase(Locale.US);
                if (s3.length() == 0)
                {
                    s3 = "en";
                }
                String s4 = locale.getCountry().toLowerCase(Locale.US);
                if (s4.length() > 0)
                {
                    s3 = (new StringBuilder()).append(s3).append("-").append(s4).toString();
                }
                String s5 = (new StringBuilder()).append(Build.MODEL).append(" Build/").append(Build.ID).toString();
                s = (new StringBuilder()).append("Mozilla/5.0 (").append(s1).append("; U; ").append(s2).append("; ").append(s3).append("; ").append(s5).append(") AppleWebKit/0.0 (KHTML, like ").append("Gecko) Version/0.0 Mobile Safari/0.0").toString();
            }
            i = (new StringBuilder()).append(s).append(" (Mobile; ").append("afma-sdk-a-v").append("6.4.1").append(")").toString();
        }
        return i;
    }

    static 
    {
        a = a(android.os.Build.VERSION.SDK);
    }

    private class UserActivityReceiver extends BroadcastReceiver
    {

        public void onReceive(Context context, Intent intent)
        {
            if (intent.getAction().equals("android.intent.action.USER_PRESENT"))
            {
                AdUtil.a(true);
            } else
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF"))
            {
                AdUtil.a(false);
                return;
            }
        }

        public UserActivityReceiver()
        {
        }
    }

}
