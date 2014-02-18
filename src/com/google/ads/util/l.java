// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads.util;


// Referenced classes of package com.google.ads.util:
//            k

public class l extends k
{

    private static final int c[] = {
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 
        54, 55, 56, 57, 58, 59, 60, 61, -1, -1, 
        -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 
        5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 
        15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 
        25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 
        29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
        39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 
        49, 50, 51, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1
    };
    private static final int d[] = {
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 
        54, 55, 56, 57, 58, 59, 60, 61, -1, -1, 
        -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 
        5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 
        15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 
        25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 
        29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
        39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 
        49, 50, 51, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 
        -1, -1, -1, -1, -1, -1
    };
    private int e;
    private int f;
    private final int g[];

    public l(int i, byte abyte0[])
    {
        a = abyte0;
        int ai[];
        if ((i & 8) == 0)
        {
            ai = c;
        } else
        {
            ai = d;
        }
        g = ai;
        e = 0;
        f = 0;
    }

    public boolean a(byte abyte0[], int i, int j, boolean flag)
    {
        int i1;
        int j1;
        int k1;
        int l1;
        byte abyte1[];
        int ai[];
        int i2;
        if (e == 6)
        {
            return false;
        }
        i1 = j + i;
        j1 = e;
        k1 = f;
        l1 = 0;
        abyte1 = a;
        ai = g;
        i2 = i;
_L14:
        if (i2 >= i1) goto _L2; else goto _L1
_L1:
        if (j1 != 0) goto _L4; else goto _L3
_L3:
        do
        {
            if (i2 + 4 > i1)
            {
                break;
            }
            k1 = ai[0xff & abyte0[i2]] << 18 | ai[0xff & abyte0[i2 + 1]] << 12 | ai[0xff & abyte0[i2 + 2]] << 6 | ai[0xff & abyte0[i2 + 3]];
            if (k1 < 0)
            {
                break;
            }
            abyte1[l1 + 2] = (byte)k1;
            abyte1[l1 + 1] = (byte)(k1 >> 8);
            abyte1[l1] = (byte)(k1 >> 16);
            l1 += 3;
            i2 += 4;
        } while (true);
        if (i2 < i1) goto _L4; else goto _L5
_L5:
        int j2 = k1;
_L27:
        if (!flag)
        {
            e = j1;
            f = j2;
            b = l1;
            return true;
        }
          goto _L6
_L4:
        int i3;
        int j3;
        i3 = i2 + 1;
        j3 = ai[0xff & abyte0[i2]];
        j1;
        JVM INSTR tableswitch 0 5: default 276
    //                   0 291
    //                   1 323
    //                   2 361
    //                   3 432
    //                   4 543
    //                   5 573;
           goto _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L7:
        int k3 = j1;
_L15:
        j1 = k3;
        i2 = i3;
          goto _L14
_L8:
        if (j3 < 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        k3 = j1 + 1;
        k1 = j3;
          goto _L15
        if (j3 == -1) goto _L7; else goto _L16
_L16:
        e = 6;
        return false;
_L9:
        if (j3 < 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        k1 = j3 | k1 << 6;
        k3 = j1 + 1;
          goto _L15
        if (j3 == -1) goto _L7; else goto _L17
_L17:
        e = 6;
        return false;
_L10:
        if (j3 >= 0)
        {
            k1 = j3 | k1 << 6;
            k3 = j1 + 1;
        } else
        {
            if (j3 != -2)
            {
                continue; /* Loop/switch isn't completed */
            }
            int l3 = l1 + 1;
            abyte1[l1] = (byte)(k1 >> 4);
            k3 = 4;
            l1 = l3;
        }
          goto _L15
        if (j3 == -1) goto _L7; else goto _L18
_L18:
        e = 6;
        return false;
_L11:
        if (j3 >= 0)
        {
            k1 = j3 | k1 << 6;
            abyte1[l1 + 2] = (byte)k1;
            abyte1[l1 + 1] = (byte)(k1 >> 8);
            abyte1[l1] = (byte)(k1 >> 16);
            l1 += 3;
            k3 = 0;
        } else
        {
            if (j3 != -2)
            {
                continue; /* Loop/switch isn't completed */
            }
            abyte1[l1 + 1] = (byte)(k1 >> 2);
            abyte1[l1] = (byte)(k1 >> 10);
            l1 += 2;
            k3 = 5;
        }
          goto _L15
        if (j3 == -1) goto _L7; else goto _L19
_L19:
        e = 6;
        return false;
_L12:
        if (j3 != -2)
        {
            continue; /* Loop/switch isn't completed */
        }
        k3 = j1 + 1;
          goto _L15
        if (j3 == -1) goto _L7; else goto _L20
_L20:
        e = 6;
        return false;
_L13:
        if (j3 == -1) goto _L7; else goto _L21
_L21:
        e = 6;
        return false;
_L6:
        j1;
        JVM INSTR tableswitch 0 4: default 624
    //                   0 624
    //                   1 638
    //                   2 646
    //                   3 669
    //                   4 705;
           goto _L22 _L22 _L23 _L24 _L25 _L26
_L22:
        e = j1;
        b = l1;
        return true;
_L23:
        e = 6;
        return false;
_L24:
        int l2 = l1 + 1;
        abyte1[l1] = (byte)(j2 >> 4);
        l1 = l2;
        continue; /* Loop/switch isn't completed */
_L25:
        int k2 = l1 + 1;
        abyte1[l1] = (byte)(j2 >> 10);
        l1 = k2 + 1;
        abyte1[k2] = (byte)(j2 >> 2);
        if (true) goto _L22; else goto _L26
_L26:
        e = 6;
        return false;
_L2:
        j2 = k1;
          goto _L27
    }

}
