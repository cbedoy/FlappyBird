// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;


final class bj
{

    private static int a(int i)
    {
        if (i > -12)
        {
            i = -1;
        }
        return i;
    }

    private static int a(int i, int j)
    {
        if (i > -12 || j > -65)
        {
            return -1;
        } else
        {
            return i ^ j << 8;
        }
    }

    private static int a(int i, int j, int k)
    {
        if (i > -12 || j > -65 || k > -65)
        {
            return -1;
        } else
        {
            return i ^ j << 8 ^ k << 16;
        }
    }

    public static int a(int i, byte abyte0[], int j, int k)
    {
        if (i == 0) goto _L2; else goto _L1
_L1:
        byte byte0;
        if (j >= k)
        {
            return i;
        }
        byte0 = (byte)i;
        if (byte0 >= -32) goto _L4; else goto _L3
_L3:
        if (byte0 < -62) goto _L6; else goto _L5
_L5:
        int k1 = j + 1;
        if (abyte0[j] <= -65) goto _L7; else goto _L6
_L6:
        return -1;
_L4:
        if (byte0 >= -16) goto _L9; else goto _L8
_L8:
        byte byte5;
        int j1;
        byte5 = (byte)(-1 ^ i >> 8);
        if (byte5 == 0)
        {
            j1 = j + 1;
            byte5 = abyte0[j];
            if (j1 >= k)
            {
                return a(byte0, byte5);
            }
        } else
        {
            j1 = j;
        }
        if (byte5 > -65 || byte0 == -32 && byte5 < -96 || byte0 == -19 && byte5 >= -96) goto _L11; else goto _L10
_L10:
        j = j1 + 1;
        if (abyte0[j1] <= -65) goto _L2; else goto _L11
_L11:
        return -1;
_L9:
        byte byte1 = (byte)(-1 ^ i >> 8);
        if (byte1 != 0) goto _L13; else goto _L12
_L12:
        int l = j + 1;
        byte byte4 = abyte0[j];
        byte byte2;
        byte byte3;
        int i1;
        if (l >= k)
        {
            return a(byte0, byte4);
        }
        byte3 = byte4;
        byte2 = 0;
          goto _L14
_L13:
        byte2 = (byte)(i >> 16);
        byte3 = byte1;
        l = j;
_L18:
        if (byte2 == 0)
        {
            i1 = l + 1;
            byte2 = abyte0[l];
            if (i1 >= k)
            {
                return a(byte0, byte3, byte2);
            }
        } else
        {
            i1 = l;
        }
        if (byte3 > -65 || (byte0 << 28) + (byte3 + 112) >> 30 != 0 || byte2 > -65) goto _L16; else goto _L15
_L15:
        j = i1 + 1;
        if (abyte0[i1] <= -65) goto _L2; else goto _L16
_L16:
        return -1;
_L7:
        j = k1;
_L2:
        return b(abyte0, j, k);
_L14:
        if (true) goto _L18; else goto _L17
_L17:
    }

    public static boolean a(byte abyte0[])
    {
        return a(abyte0, 0, abyte0.length);
    }

    public static boolean a(byte abyte0[], int i, int j)
    {
        return b(abyte0, i, j) == 0;
    }

    public static int b(byte abyte0[], int i, int j)
    {
        for (; i < j && abyte0[i] >= 0; i++) { }
        if (i >= j)
        {
            return 0;
        } else
        {
            return c(abyte0, i, j);
        }
    }

    private static int c(byte abyte0[], int i, int j)
    {
_L6:
        if (i < j) goto _L2; else goto _L1
_L1:
        int l = 0;
_L4:
        return l;
_L2:
        int k;
        int k1;
        k = i + 1;
        l = abyte0[i];
        if (l >= 0)
        {
            break MISSING_BLOCK_LABEL_228;
        }
        if (l >= -32)
        {
            break; /* Loop/switch isn't completed */
        }
        if (k < j)
        {
            if (l >= -62)
            {
                k1 = k + 1;
                if (abyte0[k] <= -65)
                {
                    break MISSING_BLOCK_LABEL_222;
                }
            }
            return -1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (l < -16)
        {
            if (k >= j - 1)
            {
                return d(abyte0, k, j);
            }
            int l1 = k + 1;
            byte byte1 = abyte0[k];
            if (byte1 <= -65 && (l != -32 || byte1 >= -96) && (l != -19 || byte1 < -96))
            {
                k1 = l1 + 1;
                if (abyte0[l1] <= -65)
                {
                    break MISSING_BLOCK_LABEL_222;
                }
            }
            return -1;
        }
        if (k >= j - 2)
        {
            return d(abyte0, k, j);
        }
        int i1 = k + 1;
        byte byte0 = abyte0[k];
        if (byte0 <= -65 && (l << 28) + (byte0 + 112) >> 30 == 0)
        {
            int j1 = i1 + 1;
            if (abyte0[i1] <= -65)
            {
                k1 = j1 + 1;
                if (abyte0[j1] <= -65)
                {
                    break MISSING_BLOCK_LABEL_222;
                }
            }
        }
        return -1;
        i = k1;
        continue; /* Loop/switch isn't completed */
        i = k;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static int d(byte abyte0[], int i, int j)
    {
        byte byte0 = abyte0[i - 1];
        switch (j - i)
        {
        default:
            throw new AssertionError();

        case 0: // '\0'
            return a(byte0);

        case 1: // '\001'
            return a(byte0, abyte0[i]);

        case 2: // '\002'
            return a(byte0, abyte0[i], abyte0[i + 1]);
        }
    }
}
