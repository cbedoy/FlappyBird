// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.example.games.basegameutils;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import com.google.android.gms.games.f;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.plus.b;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Vector;

// Referenced classes of package com.google.example.games.basegameutils:
//            c, b, e

public class a
    implements c, d
{

    public static final String a[] = {
        "UNCONFIGURED", "DISCONNECTED", "CONNECTING", "CONNECTED"
    };
    int b;
    boolean c;
    Activity d;
    String e[];
    com.google.android.gms.games.c f;
    b g;
    com.google.android.gms.a.a h;
    int i;
    int j;
    int k;
    boolean l;
    boolean m;
    com.google.android.gms.common.a n;
    com.google.example.games.basegameutils.c o;
    boolean p;
    String q;
    String r;
    com.google.example.games.basegameutils.b s;

    public a(Activity activity)
    {
        b = 0;
        c = false;
        d = null;
        f = null;
        g = null;
        h = null;
        i = 0;
        j = 0;
        k = 0;
        l = true;
        m = false;
        n = null;
        o = null;
        p = false;
        q = "GameHelper";
        s = null;
        d = activity;
    }

    static String b(int i1)
    {
        switch (i1)
        {
        default:
            return String.valueOf(i1);

        case -1: 
            return "RESULT_OK";

        case 0: // '\0'
            return "RESULT_CANCELED";

        case 10004: 
            return "RESULT_APP_MISCONFIGURED";

        case 10005: 
            return "RESULT_LEFT_ROOM";

        case 10003: 
            return "RESULT_LICENSE_FAILED";

        case 10001: 
            return "RESULT_RECONNECT_REQUIRED";

        case 10002: 
            return "SIGN_IN_FAILED";
        }
    }

    static String c(int i1)
    {
        switch (i1)
        {
        default:
            return (new StringBuilder("Unknown error code ")).append(i1).toString();

        case 10: // '\n'
            return (new StringBuilder("DEVELOPER_ERROR(")).append(i1).append(")").toString();

        case 8: // '\b'
            return (new StringBuilder("INTERNAL_ERROR(")).append(i1).append(")").toString();

        case 5: // '\005'
            return (new StringBuilder("INVALID_ACCOUNT(")).append(i1).append(")").toString();

        case 11: // '\013'
            return (new StringBuilder("LICENSE_CHECK_FAILED(")).append(i1).append(")").toString();

        case 7: // '\007'
            return (new StringBuilder("NETWORK_ERROR(")).append(i1).append(")").toString();

        case 6: // '\006'
            return (new StringBuilder("RESOLUTION_REQUIRED(")).append(i1).append(")").toString();

        case 3: // '\003'
            return (new StringBuilder("SERVICE_DISABLED(")).append(i1).append(")").toString();

        case 9: // '\t'
            return (new StringBuilder("SERVICE_INVALID(")).append(i1).append(")").toString();

        case 1: // '\001'
            return (new StringBuilder("SERVICE_MISSING(")).append(i1).append(")").toString();

        case 2: // '\002'
            return (new StringBuilder("SERVICE_VERSION_UPDATE_REQUIRED(")).append(i1).append(")").toString();

        case 4: // '\004'
            return (new StringBuilder("SIGN_IN_REQUIRED(")).append(i1).append(")").toString();

        case 0: // '\0'
            return (new StringBuilder("SUCCESS(")).append(i1).append(")").toString();
        }
    }

    public void a()
    {
        c("onDisconnected.");
        if (b == 1)
        {
            c("onDisconnected is expected, so no action taken.");
            return;
        } else
        {
            d("Unexpectedly disconnected. Severing remaining connections.");
            e();
            o = null;
            c("Making extraordinary call to onSignInFailed callback");
            a(false);
            return;
        }
    }

    void a(int i1)
    {
        String s1 = a[b];
        String s2 = a[i1];
        b = i1;
        c((new StringBuilder("State change ")).append(s1).append(" -> ").append(s2).toString());
    }

    public void a(int i1, int j1, Intent intent)
    {
        StringBuilder stringbuilder = new StringBuilder("onActivityResult: req=");
        String s1;
        if (i1 == 9001)
        {
            s1 = "RC_RESOLVE";
        } else
        {
            s1 = String.valueOf(i1);
        }
        c(stringbuilder.append(s1).append(", resp=").append(b(j1)).toString());
        if (i1 != 9001)
        {
            c("onActivityResult: request code not meant for us. Ignoring.");
            return;
        }
        c = false;
        if (b != 2)
        {
            c((new StringBuilder("onActivityResult: ignoring because state isn't STATE_CONNECTING (it's ")).append(a[b]).append(")").toString());
            return;
        }
        if (j1 == -1)
        {
            c("onAR: Resolution was RESULT_OK, so connecting current client again.");
            j();
            return;
        }
        if (j1 == 10001)
        {
            c("onAR: Resolution was RECONNECT_REQUIRED, so reconnecting.");
            j();
            return;
        }
        if (j1 == 0)
        {
            c("onAR: Got a cancellation result, so disconnecting.");
            l = false;
            m = false;
            o = null;
            e();
            a(false);
            return;
        } else
        {
            c((new StringBuilder("onAR: responseCode=")).append(b(j1)).append(", so giving up.").toString());
            a(new com.google.example.games.basegameutils.c(n.b(), j1));
            return;
        }
    }

    public void a(Activity activity)
    {
        d = activity;
        c((new StringBuilder("onStart, state = ")).append(a[b]).toString());
        a("onStart");
        switch (b)
        {
        default:
            String s1 = (new StringBuilder("onStart: BUG: unexpected state ")).append(a[b]).toString();
            e(s1);
            throw new IllegalStateException(s1);

        case 1: // '\001'
            if (l)
            {
                c("onStart: Now connecting clients.");
                h();
                return;
            } else
            {
                c("onStart: Not connecting (user specifically signed out).");
                return;
            }

        case 2: // '\002'
            c("onStart: connection process in progress, no action taken.");
            return;

        case 3: // '\003'
            c("onStart: already connected (unusual, but ok).");
            return;
        }
    }

    public void a(Bundle bundle)
    {
        c((new StringBuilder("onConnected: connected! client=")).append(k).toString());
        j = j | k;
        c((new StringBuilder("Connected clients updated to: ")).append(j).toString());
        if (k == 1 && bundle != null)
        {
            c("onConnected: connection hint provided. Checking for invite.");
            Invitation invitation = (Invitation)bundle.getParcelable("invitation");
            if (invitation != null && invitation.c() != null)
            {
                c("onConnected: connection hint has a room invite!");
                r = invitation.c();
                c((new StringBuilder("Invitation ID: ")).append(r).toString());
            }
            c("onConnected: connection hint provided. Checking for TBMP game.");
        }
        i();
    }

    public void a(com.google.android.gms.common.a a1)
    {
        c("onConnectionFailed");
        n = a1;
        c("Connection failure:");
        c((new StringBuilder("   - code: ")).append(c(n.b())).toString());
        c((new StringBuilder("   - resolvable: ")).append(n.a()).toString());
        c((new StringBuilder("   - details: ")).append(n.toString()).toString());
        if (!m)
        {
            c("onConnectionFailed: since user didn't initiate sign-in, failing now.");
            n = a1;
            a(1);
            a(false);
            return;
        } else
        {
            c("onConnectionFailed: since user initiated sign-in, resolving problem.");
            l();
            return;
        }
    }

    public transient void a(com.google.example.games.basegameutils.b b1, int i1, String as[])
    {
        int j1;
        Vector vector;
        j1 = 0;
        if (b != 0)
        {
            e("GameHelper: you called GameHelper.setup() twice. You can only call it once.");
            throw new IllegalStateException("GameHelper: you called GameHelper.setup() twice. You can only call it once.");
        }
        s = b1;
        i = i1;
        c((new StringBuilder("Setup: requested clients: ")).append(i).toString());
        vector = new Vector();
        if ((i1 & 1) != 0)
        {
            vector.add("https://www.googleapis.com/auth/games");
        }
        if ((i1 & 2) != 0)
        {
            vector.add("https://www.googleapis.com/auth/plus.login");
        }
        if ((i1 & 4) != 0)
        {
            vector.add("https://www.googleapis.com/auth/appstate");
        }
        if (as == null) goto _L2; else goto _L1
_L1:
        int l1;
        int i2;
        l1 = as.length;
        i2 = 0;
_L4:
        if (i2 < l1) goto _L3; else goto _L2
_L2:
        String as1[];
        int k1;
        e = new String[vector.size()];
        vector.copyInto(e);
        c("setup: scopes:");
        as1 = e;
        k1 = as1.length;
_L5:
        if (j1 >= k1)
        {
            if ((i1 & 1) != 0)
            {
                c("setup: creating GamesClient");
                f = (new f(g(), this, this)).a(49).a(e).a();
            }
            if ((i1 & 2) != 0)
            {
                c("setup: creating GamesPlusClient");
                g = (new com.google.android.gms.plus.c(g(), this, this)).a(e).a();
            }
            if ((i1 & 4) != 0)
            {
                c("setup: creating AppStateClient");
                h = (new com.google.android.gms.a.c(g(), this, this)).a(e).a();
            }
            a(1);
            return;
        }
        break MISSING_BLOCK_LABEL_327;
_L3:
        vector.add(as[i2]);
        i2++;
          goto _L4
        String s1 = as1[j1];
        c((new StringBuilder("  - ")).append(s1).toString());
        j1++;
          goto _L5
    }

    void a(com.google.example.games.basegameutils.c c1)
    {
        a(1002, "giveUp", "giveUp should only be called when connecting. Proceeding anyway.", new int[] {
            2
        });
        l = false;
        e();
        o = c1;
        m();
        a(false);
    }

    void a(String s1)
    {
        if (b == 0)
        {
            String s2 = (new StringBuilder("GameHelper error: Operation attempted without setup: ")).append(s1).append(". The setup() method must be called before attempting any other operation.").toString();
            e(s2);
            throw new IllegalStateException(s2);
        } else
        {
            return;
        }
    }

    void a(StringBuilder stringbuilder, byte byte0)
    {
        if (byte0 < 0)
        {
            byte0 += 256;
        }
        int i1 = byte0 / 16;
        int j1 = byte0 % 16;
        stringbuilder.append("0123456789ABCDEF".substring(i1, i1 + 1));
        stringbuilder.append("0123456789ABCDEF".substring(j1, j1 + 1));
    }

    void a(boolean flag)
    {
label0:
        {
            StringBuilder stringbuilder = new StringBuilder("Notifying LISTENER of sign-in ");
            String s1;
            if (flag)
            {
                s1 = "SUCCESS";
            } else
            if (o != null)
            {
                s1 = "FAILURE (error)";
            } else
            {
                s1 = "FAILURE (no error)";
            }
            c(stringbuilder.append(s1).toString());
            if (s != null)
            {
                if (!flag)
                {
                    break label0;
                }
                s.k();
            }
            return;
        }
        s.j();
    }

    public void a(boolean flag, String s1)
    {
        p = flag;
        q = s1;
        if (flag)
        {
            c((new StringBuilder("Debug log enabled, tag: ")).append(s1).toString());
        }
    }

    transient boolean a(int i1, String s1, String s2, int ai[])
    {
        boolean flag;
        int j1;
        int k1;
        flag = true;
        j1 = ai.length;
        k1 = 0;
_L7:
        if (k1 < j1) goto _L2; else goto _L1
_L1:
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        int k2;
        if (i1 == 1001)
        {
            stringbuilder.append("GameHelper: you attempted an operation at an invalid. ");
        } else
        {
            stringbuilder.append("GameHelper: bug detected. Please report it at our bug tracker ");
            stringbuilder.append("https://github.com/playgameservices/android-samples/issues. ");
            stringbuilder.append("Please include the last couple hundred lines of logcat output ");
            stringbuilder.append("and describe the operation that caused this. ");
        }
        stringbuilder.append("Explanation: ").append(s2);
        stringbuilder.append("Operation: ").append(s1).append(". ");
        stringbuilder.append("State: ").append(a[b]).append(". ");
        if (ai.length != flag) goto _L4; else goto _L3
_L3:
        stringbuilder.append("Expected state: ").append(a[ai[0]]).append(".");
_L8:
        d(stringbuilder.toString());
        flag = false;
_L6:
        return flag;
_L2:
        k2 = ai[k1];
        if (b == k2) goto _L6; else goto _L5
_L5:
        k1++;
          goto _L7
_L4:
        int l1;
        int i2;
        stringbuilder.append("Expected states:");
        l1 = ai.length;
        i2 = 0;
_L9:
label0:
        {
            if (i2 < l1)
            {
                break label0;
            }
            stringbuilder.append(".");
        }
          goto _L8
        int j2 = ai[i2];
        stringbuilder.append(" ").append(a[j2]);
        i2++;
          goto _L9
    }

    Dialog b(String s1)
    {
        return (new android.app.AlertDialog.Builder(g())).setMessage(s1).setNeutralButton(0x104000a, null).create();
    }

    public com.google.android.gms.games.c b()
    {
        if (f == null)
        {
            throw new IllegalStateException("No GamesClient. Did you request it at setup?");
        } else
        {
            return f;
        }
    }

    void c(String s1)
    {
        if (p)
        {
            Log.d(q, (new StringBuilder("GameHelper: ")).append(s1).toString());
        }
    }

    public boolean c()
    {
        return b == 3;
    }

    public void d()
    {
        c((new StringBuilder("onStop, state = ")).append(a[b]).toString());
        a("onStop");
        b;
        JVM INSTR tableswitch 1 3: default 64
    //                   1 120
    //                   2 103
    //                   3 103;
           goto _L1 _L2 _L3 _L3
_L1:
        String s1 = (new StringBuilder("onStop: BUG: unexpected state ")).append(a[b]).toString();
        e(s1);
        throw new IllegalStateException(s1);
_L3:
        c("onStop: Killing connections");
        e();
_L5:
        d = null;
        return;
_L2:
        c("onStop: not connected, so no action taken.");
        if (true) goto _L5; else goto _L4
_L4:
    }

    void d(String s1)
    {
        Log.w(q, (new StringBuilder("!!! GameHelper WARNING: ")).append(s1).toString());
    }

    void e()
    {
        if (!a(1002, "killConnections", "killConnections() should only get called while connected or connecting.", new int[] {
    3, 2
}))
        {
            return;
        }
        c("killConnections: killing connections.");
        n = null;
        o = null;
        if (f != null && f.b())
        {
            c("Disconnecting GamesClient.");
            f.c();
        }
        if (g != null && g.b())
        {
            c("Disconnecting PlusClient.");
            g.c();
        }
        if (h != null && h.b())
        {
            c("Disconnecting AppStateClient.");
            h.c();
        }
        j = 0;
        c("killConnections: all clients disconnected.");
        a(1);
    }

    void e(String s1)
    {
        Log.e(q, (new StringBuilder("*** GameHelper ERROR: ")).append(s1).toString());
    }

    public void f()
    {
        if (b == 3)
        {
            d("beginUserInitiatedSignIn() called when already connected. Calling listener directly to notify of success.");
            a(true);
            return;
        }
        if (b == 2)
        {
            d("beginUserInitiatedSignIn() called when already connecting. Be patient! You can only call this method after you get an onSignInSucceeded() or onSignInFailed() callback. Suggestion: disable the sign-in button on startup and also when it's clicked, and re-enable when you get the callback.");
            return;
        }
        c("Starting USER-INITIATED sign-in flow.");
        l = true;
        int i1 = com.google.android.gms.common.f.a(g());
        c((new StringBuilder("isGooglePlayServicesAvailable returned ")).append(i1).toString());
        if (i1 != 0)
        {
            c("Google Play services not available. Show error dialog.");
            o = new com.google.example.games.basegameutils.c(i1, 0);
            m();
            a(false);
            return;
        }
        m = true;
        if (n != null)
        {
            c("beginUserInitiatedSignIn: continuing pending sign-in flow.");
            a(2);
            l();
            return;
        } else
        {
            c("beginUserInitiatedSignIn: starting new sign-in flow.");
            h();
            return;
        }
    }

    Context g()
    {
        return d;
    }

    void h()
    {
        if (!a(1002, "startConnections", "startConnections should only get called when disconnected.", new int[] {
    1
}))
        {
            return;
        } else
        {
            c("Starting connections.");
            a(2);
            r = null;
            i();
            return;
        }
    }

    void i()
    {
        c((new StringBuilder("connectNextClient: requested clients: ")).append(i).append(", connected clients: ").append(j).toString());
        if (f != null && f.b() && (1 & j) == 0)
        {
            d("GamesClient was already connected. Fixing.");
            j = 1 | j;
        }
        if (g != null && g.b() && (2 & j) == 0)
        {
            d("PlusClient was already connected. Fixing.");
            j = 2 | j;
        }
        if (h != null && h.b() && (4 & j) == 0)
        {
            d("AppStateClient was already connected. Fixing");
            j = 4 | j;
        }
        int i1 = i & (-1 ^ j);
        c((new StringBuilder("Pending clients: ")).append(i1).toString());
        if (i1 == 0)
        {
            c("All clients now connected. Sign-in successful!");
            k();
            return;
        }
        if (f != null && (i1 & 1) != 0)
        {
            c("Connecting GamesClient.");
            k = 1;
        } else
        if (g != null && (i1 & 2) != 0)
        {
            c("Connecting PlusClient.");
            k = 2;
        } else
        if (h != null && (i1 & 4) != 0)
        {
            c("Connecting AppStateClient.");
            k = 4;
        } else
        {
            throw new AssertionError((new StringBuilder("Not all clients connected, yet no one is next. R=")).append(i).append(", C=").append(j).toString());
        }
        j();
    }

    void j()
    {
        if (b == 1)
        {
            d("GameHelper got disconnected during connection process. Aborting.");
        } else
        if (a(1002, "connectCurrentClient", "connectCurrentClient should only get called when connecting.", new int[] {
    2
}))
        {
            switch (k)
            {
            case 3: // '\003'
            default:
                return;

            case 1: // '\001'
                f.a();
                return;

            case 4: // '\004'
                h.a();
                return;

            case 2: // '\002'
                g.a();
                return;
            }
        }
    }

    void k()
    {
        a(1002, "succeedSignIn", "succeedSignIn should only get called in the connecting or connected state. Proceeding anyway.", new int[] {
            2, 3
        });
        c("All requested clients connected. Sign-in succeeded!");
        a(3);
        o = null;
        l = true;
        m = false;
        a(true);
    }

    void l()
    {
        a(1002, "resolveConnectionResult", "resolveConnectionResult should only be called when connecting. Proceeding anyway.", new int[] {
            2
        });
        if (c)
        {
            c("We're already expecting the result of a previous resolution.");
            return;
        }
        c((new StringBuilder("resolveConnectionResult: trying to resolve result: ")).append(n).toString());
        if (n.a())
        {
            c("Result has resolution. Starting it.");
            try
            {
                c = true;
                n.a(d, 9001);
                return;
            }
            catch (android.content.IntentSender.SendIntentException sendintentexception)
            {
                c("SendIntentException, so connecting again.");
            }
            j();
            return;
        } else
        {
            c("resolveConnectionResult: result has no resolution. Giving up.");
            a(new com.google.example.games.basegameutils.c(n.b()));
            return;
        }
    }

    void m()
    {
        Context context;
        int i1;
        context = g();
        if (context == null)
        {
            c("*** No context. Can't show failure dialog.");
            return;
        }
        c((new StringBuilder("Making error dialog for failure: ")).append(o).toString());
        i1 = o.a();
        o.b();
        JVM INSTR tableswitch 10002 10004: default 84
    //                   10002 177
    //                   10003 192
    //                   10004 158;
           goto _L1 _L2 _L3 _L4
_L1:
        Dialog dialog;
        dialog = com.google.android.gms.common.f.a(i1, d, 9002, null);
        if (dialog == null)
        {
            c("No standard error dialog available. Making fallback dialog.");
            dialog = b((new StringBuilder(String.valueOf(context.getString(e.gamehelper_unknown_error)))).append(" ").append(c(i1)).toString());
        }
_L6:
        c("Showing error dialog.");
        dialog.show();
        return;
_L4:
        dialog = b(context.getString(e.gamehelper_app_misconfigured));
        n();
        continue; /* Loop/switch isn't completed */
_L2:
        dialog = b(context.getString(e.gamehelper_sign_in_failed));
        continue; /* Loop/switch isn't completed */
_L3:
        dialog = b(context.getString(e.gamehelper_license_failed));
        if (true) goto _L6; else goto _L5
_L5:
    }

    void n()
    {
        c("****");
        c("****");
        c("**** APP NOT CORRECTLY CONFIGURED TO USE GOOGLE PLAY GAME SERVICES");
        c("**** This is usually caused by one of these reasons:");
        c("**** (1) Your package name and certificate fingerprint do not match");
        c("****     the client ID you registered in Developer Console.");
        c("**** (2) Your App ID was incorrectly entered.");
        c("**** (3) Your game settings have not been published and you are ");
        c("****     trying to log in with an account that is not listed as");
        c("****     a test account.");
        c("****");
        if (g() == null)
        {
            c("*** (no Context, so can't print more debug info)");
            return;
        } else
        {
            c("**** To help you debug, here is the information about this app");
            c((new StringBuilder("**** Package name         : ")).append(g().getPackageName()).toString());
            c((new StringBuilder("**** Cert SHA1 fingerprint: ")).append(p()).toString());
            c((new StringBuilder("**** App ID from          : ")).append(o()).toString());
            c("****");
            c("**** Check that the above information matches your setup in ");
            c("**** Developer Console. Also, check that you're logging in with the");
            c("**** right account (it should be listed in the Testers section if");
            c("**** your project is not yet published).");
            c("****");
            c("**** For more information, refer to the troubleshooting guide:");
            c("****   http://developers.google.com/games/services/android/troubleshooting");
            return;
        }
    }

    String o()
    {
        String s1;
        try
        {
            Resources resources = g().getResources();
            s1 = resources.getString(resources.getIdentifier("app_id", "string", g().getPackageName()));
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return "??? (failed to retrieve APP ID)";
        }
        return s1;
    }

    String p()
    {
        int i1 = 0;
        Signature asignature[];
        int j1;
        int k1;
        byte abyte0[];
        StringBuilder stringbuilder;
        try
        {
            asignature = g().getPackageManager().getPackageInfo(g().getPackageName(), 64).signatures;
            j1 = asignature.length;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            namenotfoundexception.printStackTrace();
            return "(ERROR: package not found)";
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            nosuchalgorithmexception.printStackTrace();
            return "(ERROR: SHA1 algorithm not found)";
        }
        if (j1 == 0)
        {
            return "ERROR: NO SIGNATURE.";
        }
        k1 = asignature.length;
        if (k1 > 1)
        {
            return "ERROR: MULTIPLE SIGNATURES";
        }
        abyte0 = MessageDigest.getInstance("SHA1").digest(asignature[0].toByteArray());
        stringbuilder = new StringBuilder();
_L1:
        if (i1 >= abyte0.length)
        {
            return stringbuilder.toString();
        }
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        stringbuilder.append(":");
        a(stringbuilder, abyte0[i1]);
        i1++;
          goto _L1
    }

}
