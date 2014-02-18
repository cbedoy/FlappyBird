// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dotgears.flappy;

import com.dotgears.f;
import com.dotgears.g;
import com.dotgears.h;
import com.dotgears.i;
import com.dotgears.j;
import com.dotgears.l;
import com.dotgears.m;
import com.dotgears.n;
import com.dotgears.p;
import com.dotgears.r;
import java.io.InputStream;

// Referenced classes of package com.dotgears.flappy:
//            a, f, e, b

public class c extends g
{

    boolean H;
    boolean I;
    a J;
    f K;
    f L;
    f M;
    f N;
    f O;
    f P;
    f Q;
    f R;
    l S;
    i T;
    i U;
    i V;
    i W;
    i X;
    i Y;
    i Z;
    i aa;
    i ab;
    int ac;
    int ad;
    int ae;
    int af;
    int ag;
    int ah;
    int ai;
    int aj;
    int ak;
    com.dotgears.flappy.f al;
    e am;
    h an;
    int ao;
    private boolean ap;

    public c(int k, int i1, InputStream inputstream)
    {
        super(k, i1, inputstream);
        ap = true;
    }

    public static boolean a(int k, int i1, int j1, int k1, int l1, int i2, int j2, int k2)
    {
        return k + j1 >= l1 && k <= l1 + j2 && i1 + k1 >= i2 && i1 <= i2 + k2;
    }

    public void a(int k, int i1)
    {
        if (!H && (k < -20 + M.b || k > 20 + (M.b + M.d) || i1 < -20 + M.c || i1 > 20 + (M.c + M.e))) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (J.w)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (ao <= 0) goto _L1; else goto _L3
_L3:
        J.b();
        return;
        if (!al.F || al.d != 1) goto _L1; else goto _L4
_L4:
        al.d = 2;
        al.a.a(1.0F, 0.0F, 0, 0.5F);
        J.w = false;
        J.b();
        return;
    }

    public void a(int k, int i1, int j1, int k1)
    {
        if (H && k1 >= 482 - ab.c && k1 <= 482)
        {
            a(7, null, 5);
        }
    }

    public void a(int k, m m)
    {
        switch (k)
        {
        default:
            return;

        case 6: // '\006'
            e();
            a(false, 0, 0.5F);
            c(6, 0);
            return;

        case 5: // '\005'
            e();
            K.F = false;
            P.F = false;
            R.F = false;
            H = false;
            a(false, 0, 0.5F);
            ac = 0;
            J.a();
            ao = 2;
            ak = 1;
            y = 0;
            al.a();
            A = 1 + A;
            c(7, 0);
            return;

        case 2: // '\002'
            I = true;
            c(0, y);
            am.a();
            c(8, 0);
            return;

        case 3: // '\003'
            c(11, 0);
            return;

        case 4: // '\004'
            c(13, 0);
            return;

        case 7: // '\007'
            c(3, 0);
            break;
        }
    }

    public void b(float f1)
    {
        a(T, 0, 0, 1.0F);
        ac = ac - ao;
        if (ac <= -24)
        {
            ac = 0;
        }
        if (!J.w)
        {
            ag = ag - ao;
            ah = ah - ao;
            ai = ai - ao;
            if (ao > 0 && ak <= 0 && (ag == J.b || ag == -1 + J.b))
            {
                y = 1 + y;
                c(9, 0);
            }
            if (ag < -Y.b)
            {
                ag = ah;
                ad = ae;
                ah = ai;
                ae = af;
                ai = ah + aj + Y.b;
                af = j.a(180, 360);
                if (ak > 0)
                {
                    ak = -1 + ak;
                    if (ak == 0)
                    {
                        ah = -Y.b;
                        ag = -Y.b;
                    }
                }
            }
        }
        J.a(f1);
        if (!H)
        {
            if (J.c >= 400 - J.f && ao > 0)
            {
                c(1.0F);
                a(4, 0.5F);
                ao = 0;
                c(12, 0);
                a(2, C, 1000);
            }
            if (!J.v && ak <= 0 && ao > 0)
            {
                int k = -96 + (ad - Z.c);
                int i1;
                if (a(J.b, J.c, J.e, J.f, ag, k, Z.b, Z.c))
                {
                    c(1.0F);
                    a(4, 0.5F);
                    ao = 0;
                    c(12, 0);
                    a(3, null, 500);
                    a(2, C, 1000);
                } else
                if (a(J.b, J.c, J.e, J.f, ag, ad, Y.b, Y.c))
                {
                    c(1.0F);
                    a(4, 0.5F);
                    J.v = true;
                    ao = 0;
                    c(12, 0);
                    a(3, null, 500);
                    a(2, C, 1000);
                }
                i1 = -96 + (ae - Z.c);
                if (a(J.b, J.c, J.e, J.f, ah, i1, Z.b, Z.c))
                {
                    c(1.0F);
                    a(4, 0.5F);
                    J.v = true;
                    ao = 0;
                    c(12, 0);
                    a(3, null, 500);
                    a(2, C, 1000);
                } else
                if (a(J.b, J.c, J.e, J.f, ah, ae, Y.b, Y.c))
                {
                    c(1.0F);
                    a(4, 0.5F);
                    J.v = true;
                    ao = 0;
                    c(12, 0);
                    a(3, null, 500);
                    a(2, C, 1000);
                }
            }
            if (ak <= 0)
            {
                a(Y, ag, ad, 1.0F);
                a(Z, ag, -96 + (ad - Z.c), 1.0F);
                a(Y, ah, ae, 1.0F);
                a(Z, ah, -96 + (ae - Z.c), 1.0F);
                if (ai < 288)
                {
                    a(Y, ai, af, 1.0F);
                    a(Z, ai, -96 + (af - Z.c), 1.0F);
                }
            }
            if (C.F && C.k == 2 && !K.F)
            {
                K.a(288 - (16 + (K.d + P.d)) >> 1, 340);
                P.a(16 + (K.b + K.d), 340);
            }
            if (am.F)
            {
                am.a(f1);
                am.a(this);
            } else
            {
                an.a(144, 100, 6, 1.0F);
                an.a(y, 20);
                an.a(this);
            }
            J.a(this);
            a(X, ac, 512 - X.c, 1.0F);
        } else
        {
            a(aa, 288 - aa.b >> 1, 150, 1.0F);
            J.b = 288 - J.e >> 1;
            J.c = 20 + (150 + aa.c);
            J.a(this);
            a(X, ac, 512 - X.c, 1.0F);
        }
        if (al.F)
        {
            al.a(f1);
            al.a(this);
        }
        if (H)
        {
            a(ab, 288 - ab.b >> 1, 432 - ab.c, 1.0F);
        }
        if (K.F)
        {
            K.a(f1);
            K.a(this);
            P.a(f1);
            P.a(this);
            if (K.h)
            {
                a(true, 5, 0.5F);
                c(10, 0);
            }
            if (P.h)
            {
                c(1, 0);
                c(10, 0);
            }
            if (R.F)
            {
                R.a(f1);
                R.a(this);
                if (R.h)
                {
                    c(2, 0);
                }
            }
        }
    }

    public void c()
    {
        an = new b();
        K = new f();
        K.a("button_play");
        P = new f();
        P.a("button_score");
        L = new f();
        L.a("button_ok");
        O = new f();
        O.a("button_menu");
        M = new f();
        M.a("button_pause");
        N = new f();
        N.a("button_resume");
        Q = new f();
        Q.a("button_share");
        R = new f();
        R.a("button_rate");
        S = new l("number_score");
        U = b("bg_day");
        V = b("bg_night");
        W = b("bg_forest");
        X = b("land");
        Y = b("pipe_up");
        Z = b("pipe_down");
        aa = b("title");
        ab = b("brand_copyright");
        aj = (288 - (3 * Y.b) / 2) / 2;
        ag = aj - (Y.b >> 1);
        ad = 274;
        ah = ag + aj + Y.b;
        ae = 274;
        ai = ah + aj + Y.b;
        af = 274;
        J = new a();
        J.a();
        al = new com.dotgears.flappy.f();
        am = new e();
        H = true;
        a(6, this, 1);
    }

    public void e()
    {
        if (j.a() % 10 > 3)
        {
            T = U;
        } else
        {
            T = V;
        }
        n.b();
        K.a(288 - (16 + (K.d + P.d)) >> 1, 340);
        P.a(16 + (K.b + K.d), 340);
        R.a(288 - R.d >> 1, 270);
        al.F = false;
        am.F = false;
        C.F = false;
        C.G = false;
        L.F = false;
        L.G = false;
        O.F = false;
        O.G = false;
        M.F = false;
        M.G = false;
        N.F = false;
        N.G = false;
        Q.F = false;
        Q.G = false;
        H = true;
        ac = 0;
        J.a();
        ao = 2;
        ak = 1;
        y = 0;
    }
}
