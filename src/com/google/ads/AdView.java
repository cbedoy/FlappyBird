// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.ads.a.ac;
import com.google.ads.a.ag;
import com.google.ads.a.e;
import com.google.ads.a.h;
import com.google.ads.a.m;
import com.google.ads.a.w;
import com.google.ads.util.AdUtil;
import com.google.ads.util.ad;
import com.google.ads.util.ae;
import com.google.ads.util.g;
import com.google.ads.util.o;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.ads:
//            a, d, g, bt, 
//            AdActivity, c, h, j

public class AdView extends RelativeLayout
    implements a
{

    private static final h b;
    protected w a;

    public AdView(Activity activity, com.google.ads.g g1, String s)
    {
        super(activity.getApplicationContext());
        try
        {
            a(activity, g1, ((AttributeSet) (null)));
            b(activity, g1, null);
            a(activity, g1, s);
            return;
        }
        catch (m m1)
        {
            a(activity, m1.c("Could not initialize AdView"), g1, ((AttributeSet) (null)));
            m1.a("Could not initialize AdView");
            return;
        }
    }

    public AdView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context, attributeset);
    }

    public AdView(Context context, AttributeSet attributeset, int i)
    {
        this(context, attributeset);
    }

    private void a(Activity activity, com.google.ads.g g1, String s)
    {
        FrameLayout framelayout;
        framelayout = new FrameLayout(activity);
        framelayout.setFocusable(false);
        a = new w(this, activity, g1, s, framelayout, false);
        setGravity(17);
        ViewGroup viewgroup = ag.a(activity, a);
        if (viewgroup != null)
        {
            try
            {
                viewgroup.addView(framelayout, -2, -2);
                addView(viewgroup, -2, -2);
                return;
            }
            catch (VerifyError verifyerror)
            {
                g.a("Gestures disabled: Not supported on this version of Android.", verifyerror);
            }
            break MISSING_BLOCK_LABEL_97;
        }
        addView(framelayout, -2, -2);
        return;
        addView(framelayout, -2, -2);
        return;
    }

    private void a(Context context, AttributeSet attributeset)
    {
        if (attributeset != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s1;
        com.google.ads.g ag2[];
        s1 = b("adSize", context, attributeset, true);
        ag2 = a(s1);
        if (ag2 == null) goto _L4; else goto _L3
_L3:
        if (ag2.length != 0) goto _L5; else goto _L4
_L4:
        m m2;
        com.google.ads.g ag1[];
        m m3;
        throw new m((new StringBuilder()).append("Attribute \"adSize\" invalid: ").append(s1).toString(), true);
_L8:
        String s = m2.c("Could not initialize AdView");
        com.google.ads.g g1;
        String s2;
        boolean flag;
        Activity activity;
        Set set;
        if (ag1 != null && ag1.length > 0)
        {
            g1 = ag1[0];
        } else
        {
            g1 = g.b;
        }
        a(context, s, g1, attributeset);
        m2.a("Could not initialize AdView");
        if (isInEditMode()) goto _L1; else goto _L6
_L6:
        m2.b("Could not initialize AdView");
        return;
_L5:
        if (!a("adUnitId", attributeset))
        {
            throw new m("Required XML attribute \"adUnitId\" missing", true);
        }
        if (isInEditMode())
        {
            a(context, "Ads by Google", -1, ag2[0], attributeset);
            return;
        }
        s2 = b("adUnitId", context, attributeset, true);
        flag = a("loadAdOnCreate", context, attributeset, false);
        if (!(context instanceof Activity))
        {
            break MISSING_BLOCK_LABEL_356;
        }
        activity = (Activity)context;
        a(((Context) (activity)), ag2[0], attributeset);
        b(activity, ag2[0], attributeset);
        if (ag2.length != 1)
        {
            break MISSING_BLOCK_LABEL_330;
        }
        a(activity, ag2[0], s2);
_L9:
        if (!flag) goto _L1; else goto _L7
_L7:
        try
        {
            set = c("testDevices", context, attributeset, false);
            if (set.contains("TEST_EMULATOR"))
            {
                set.remove("TEST_EMULATOR");
                set.add(d.a);
            }
            a((new d()).b(set).a(c("keywords", context, attributeset, false)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (m m3)
        {
            m2 = m3;
            ag1 = ag2;
        }
          goto _L8
        a(activity, new com.google.ads.g(0, 0), s2);
        a(ag2);
          goto _L9
        throw new m("AdView was initialized with a Context that wasn't an Activity.", true);
        m m1;
        m1;
        m2 = m1;
        ag1 = null;
          goto _L8
    }

    private void a(Context context, String s, com.google.ads.g g1, AttributeSet attributeset)
    {
        g.b(s);
        a(context, s, 0xffff0000, g1, attributeset);
    }

    private transient void a(com.google.ads.g ag1[])
    {
        com.google.ads.g ag2[] = new com.google.ads.g[ag1.length];
        for (int i = 0; i < ag1.length; i++)
        {
            ag2[i] = g.a(ag1[i], getContext());
        }

        a.h().n.a(ag2);
    }

    private boolean a(Context context, com.google.ads.g g1, AttributeSet attributeset)
    {
        if (!AdUtil.c(context))
        {
            a(context, "You must have AdActivity declared in AndroidManifest.xml with configChanges.", g1, attributeset);
            return false;
        } else
        {
            return true;
        }
    }

    private boolean a(String s, Context context, AttributeSet attributeset, boolean flag)
    {
        String s1 = attributeset.getAttributeValue("http://schemas.android.com/apk/lib/com.google.ads", s);
        boolean flag1 = attributeset.getAttributeBooleanValue("http://schemas.android.com/apk/lib/com.google.ads", s, flag);
        if (s1 != null)
        {
            String s2 = context.getPackageName();
            if (s1.matches("^@([^:]+)\\:(.*)$"))
            {
                s2 = s1.replaceFirst("^@([^:]+)\\:(.*)$", "$1");
                s1 = s1.replaceFirst("^@([^:]+)\\:(.*)$", "@$2");
            }
            if (s1.startsWith("@bool/"))
            {
                String s3 = s1.substring("@bool/".length());
                TypedValue typedvalue = new TypedValue();
                try
                {
                    getResources().getValue((new StringBuilder()).append(s2).append(":bool/").append(s3).toString(), typedvalue, true);
                }
                catch (android.content.res.Resources.NotFoundException notfoundexception)
                {
                    throw new m((new StringBuilder()).append("Could not find resource for ").append(s).append(": ").append(s1).toString(), true, notfoundexception);
                }
                if (typedvalue.type == 18)
                {
                    return typedvalue.data != 0;
                } else
                {
                    throw new m((new StringBuilder()).append("Resource ").append(s).append(" was not a boolean: ").append(typedvalue).toString(), true);
                }
            }
        }
        return flag1;
    }

    private boolean a(String s, AttributeSet attributeset)
    {
        return attributeset.getAttributeValue("http://schemas.android.com/apk/lib/com.google.ads", s) != null;
    }

    private String b(String s, Context context, AttributeSet attributeset, boolean flag)
    {
label0:
        {
            String s1 = attributeset.getAttributeValue("http://schemas.android.com/apk/lib/com.google.ads", s);
            TypedValue typedvalue;
            if (s1 != null)
            {
                String s2 = context.getPackageName();
                if (s1.matches("^@([^:]+)\\:(.*)$"))
                {
                    s2 = s1.replaceFirst("^@([^:]+)\\:(.*)$", "$1");
                    s1 = s1.replaceFirst("^@([^:]+)\\:(.*)$", "@$2");
                }
                if (s1.startsWith("@string/"))
                {
                    String s3 = s1.substring("@string/".length());
                    typedvalue = new TypedValue();
                    try
                    {
                        getResources().getValue((new StringBuilder()).append(s2).append(":string/").append(s3).toString(), typedvalue, true);
                    }
                    catch (android.content.res.Resources.NotFoundException notfoundexception)
                    {
                        throw new m((new StringBuilder()).append("Could not find resource for ").append(s).append(": ").append(s1).toString(), true, notfoundexception);
                    }
                    if (typedvalue.string == null)
                    {
                        break label0;
                    }
                    s1 = typedvalue.string.toString();
                }
            }
            if (flag && s1 == null)
            {
                throw new m((new StringBuilder()).append("Required XML attribute \"").append(s).append("\" missing").toString(), true);
            } else
            {
                return s1;
            }
        }
        throw new m((new StringBuilder()).append("Resource ").append(s).append(" was not a string: ").append(typedvalue).toString(), true);
    }

    private boolean b(Context context, com.google.ads.g g1, AttributeSet attributeset)
    {
        if (!AdUtil.b(context))
        {
            a(context, "You must have INTERNET and ACCESS_NETWORK_STATE permissions in AndroidManifest.xml.", g1, attributeset);
            return false;
        } else
        {
            return true;
        }
    }

    private Set c(String s, Context context, AttributeSet attributeset, boolean flag)
    {
        String s1 = b(s, context, attributeset, flag);
        HashSet hashset = new HashSet();
        if (s1 != null)
        {
            String as[] = s1.split(",");
            int i = as.length;
            for (int j = 0; j < i; j++)
            {
                String s2 = as[j].trim();
                if (s2.length() != 0)
                {
                    hashset.add(s2);
                }
            }

        }
        return hashset;
    }

    void a(Context context, String s, int i, com.google.ads.g g1, AttributeSet attributeset)
    {
        if (g1 == null)
        {
            g1 = g.b;
        }
        com.google.ads.g g2 = g.a(g1, context.getApplicationContext());
        if (getChildCount() == 0)
        {
            TextView textview;
            LinearLayout linearlayout;
            LinearLayout linearlayout1;
            int j;
            int k;
            if (attributeset == null)
            {
                textview = new TextView(context);
            } else
            {
                textview = new TextView(context, attributeset);
            }
            textview.setGravity(17);
            textview.setText(s);
            textview.setTextColor(i);
            textview.setBackgroundColor(0xff000000);
            if (attributeset == null)
            {
                linearlayout = new LinearLayout(context);
            } else
            {
                linearlayout = new LinearLayout(context, attributeset);
            }
            linearlayout.setGravity(17);
            if (attributeset == null)
            {
                linearlayout1 = new LinearLayout(context);
            } else
            {
                linearlayout1 = new LinearLayout(context, attributeset);
            }
            linearlayout1.setGravity(17);
            linearlayout1.setBackgroundColor(i);
            j = AdUtil.a(context, g2.a());
            k = AdUtil.a(context, g2.b());
            linearlayout.addView(textview, j - 2, k - 2);
            linearlayout1.addView(linearlayout);
            addView(linearlayout1, j, k);
        }
    }

    public void a(d d1)
    {
        if (a != null)
        {
            if (a())
            {
                a.e();
            }
            a.a(d1);
        }
    }

    public boolean a()
    {
        if (a == null)
        {
            return false;
        } else
        {
            return a.r();
        }
    }

    com.google.ads.g[] a(String s)
    {
        String as[];
        com.google.ads.g ag1[];
        int i;
        as = s.split(",");
        ag1 = new com.google.ads.g[as.length];
        i = 0;
_L9:
        String s1;
        String as1[];
        if (i >= as.length)
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = as[i].trim();
        if (!s1.matches("^(\\d+|FULL_WIDTH)\\s*[xX]\\s*(\\d+|AUTO_HEIGHT)$"))
        {
            break MISSING_BLOCK_LABEL_161;
        }
        as1 = s1.split("[xX]");
        as1[0] = as1[0].trim();
        as1[1] = as1[1].trim();
        if (!"FULL_WIDTH".equals(as1[0])) goto _L2; else goto _L1
_L1:
        int j = -1;
_L5:
        com.google.ads.g g1;
        boolean flag;
        int k;
        int l;
        try
        {
            flag = "AUTO_HEIGHT".equals(as1[1]);
        }
        catch (NumberFormatException numberformatexception)
        {
            return null;
        }
        if (!flag) goto _L4; else goto _L3
_L3:
        l = -2;
_L6:
        g1 = new com.google.ads.g(j, l);
_L7:
        if (g1 == null)
        {
            return null;
        }
        break MISSING_BLOCK_LABEL_281;
_L2:
        j = Integer.parseInt(as1[0]);
          goto _L5
_L4:
        k = Integer.parseInt(as1[1]);
        l = k;
          goto _L6
        if ("BANNER".equals(s1))
        {
            g1 = g.b;
        } else
        if ("SMART_BANNER".equals(s1))
        {
            g1 = g.a;
        } else
        if ("IAB_MRECT".equals(s1))
        {
            g1 = g.c;
        } else
        if ("IAB_BANNER".equals(s1))
        {
            g1 = g.d;
        } else
        if ("IAB_LEADERBOARD".equals(s1))
        {
            g1 = com.google.ads.g.e;
        } else
        if ("IAB_WIDE_SKYSCRAPER".equals(s1))
        {
            g1 = g.f;
        } else
        {
            g1 = null;
        }
          goto _L7
        ag1[i] = g1;
        i++;
        if (true) goto _L9; else goto _L8
_L8:
        return ag1;
    }

    protected void onMeasure(int i, int j)
    {
        if (!isInEditMode())
        {
            e e1 = a.k();
            if (e1 != null)
            {
                e1.setVisibility(0);
            }
        }
        super.onMeasure(i, j);
    }

    protected void onWindowVisibilityChanged(int i)
    {
        super.onWindowVisibilityChanged(i);
        while (isInEditMode() || !((ac)a.h().g.a()).b() || i == 0 || a.h().l.a() == null || a.h().e.a() == null) 
        {
            return;
        }
        if (AdActivity.b() && !AdActivity.c())
        {
            b.a((WebView)a.h().e.a(), "onopeninapp", null);
            return;
        } else
        {
            b.a((WebView)a.h().e.a(), "onleaveapp", null);
            return;
        }
    }

    public void setAdListener(c c1)
    {
        a.h().o.a(c1);
    }

    protected void setAppEventListener(com.google.ads.h h1)
    {
        a.h().p.a(h1);
    }

    protected transient void setSupportedAdSizes(com.google.ads.g ag1[])
    {
        if (a.h().n.a() == null)
        {
            g.e("Warning: Tried to set supported ad sizes on a single-size AdView. AdSizes ignored. To create a multi-sized AdView, use an AdView constructor that takes in an AdSize[] array.");
            return;
        } else
        {
            a(ag1);
            return;
        }
    }

    protected void setSwipeableEventListener(j j)
    {
        a.h().q.a(j);
    }

    static 
    {
        b = (h)h.a.b();
    }
}
