// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;


// Referenced classes of package com.google.ads:
//            ap

public final class aq
{

    private static final char a[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
    private static final char b[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".toCharArray();
    private static final byte c[] = {
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, 
        -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 
        54, 55, 56, 57, 58, 59, 60, 61, -9, -9, 
        -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 
        5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 
        15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 
        25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 
        29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
        39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 
        49, 50, 51, -9, -9, -9, -9, -9
    };
    private static final byte d[] = {
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, 
        -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, 
        -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 
        54, 55, 56, 57, 58, 59, 60, 61, -9, -9, 
        -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 
        5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 
        15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 
        25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 
        29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 
        39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 
        49, 50, 51, -9, -9, -9, -9, -9
    };

    private static int a(char ac[], int i, byte abyte0[], int j, byte abyte1[])
    {
        if (ac[i + 2] == '=')
        {
            abyte0[j] = (byte)(((abyte1[ac[i]] << 24) >>> 6 | (abyte1[ac[i + 1]] << 24) >>> 12) >>> 16);
            return 1;
        }
        if (ac[i + 3] == '=')
        {
            int l = (abyte1[ac[i]] << 24) >>> 6 | (abyte1[ac[i + 1]] << 24) >>> 12 | (abyte1[ac[i + 2]] << 24) >>> 18;
            abyte0[j] = (byte)(l >>> 16);
            abyte0[j + 1] = (byte)(l >>> 8);
            return 2;
        } else
        {
            int k = (abyte1[ac[i]] << 24) >>> 6 | (abyte1[ac[i + 1]] << 24) >>> 12 | (abyte1[ac[i + 2]] << 24) >>> 18 | (abyte1[ac[i + 3]] << 24) >>> 24;
            abyte0[j] = (byte)(k >> 16);
            abyte0[j + 1] = (byte)(k >> 8);
            abyte0[j + 2] = (byte)k;
            return 3;
        }
    }

    public static String a(byte abyte0[], int i, int j, char ac[], boolean flag)
    {
        char ac1[] = a(abyte0, i, j, ac, 0x7fffffff);
        int k = ac1.length;
        do
        {
            if (flag || k <= 0 || ac1[k - 1] != '=')
            {
                return new String(ac1, 0, k);
            }
            k--;
        } while (true);
    }

    public static String a(byte abyte0[], boolean flag)
    {
        return a(abyte0, 0, abyte0.length, b, flag);
    }

    public static byte[] a(String s)
    {
        char ac[] = s.toCharArray();
        return a(ac, 0, ac.length);
    }

    public static byte[] a(char ac[], int i, int j)
    {
        return a(ac, i, j, c);
    }

    public static byte[] a(char ac[], int i, int j, byte abyte0[])
    {
        byte abyte1[] = new byte[2 + (j * 3) / 4];
        int k = 0;
        char ac1[] = new char[4];
        boolean flag = false;
        int l = 0;
        int i1 = 0;
        while (l < j) 
        {
            char c1 = ac[l + i];
            char c2 = (char)(c1 & 0x7f);
            byte byte0 = abyte0[c2];
            if (c2 == c1 && byte0 < -5)
            {
                throw new ap((new StringBuilder()).append("Bad Base64 input character at ").append(l).append(": ").append(ac[l + i]).append("(decimal)").toString());
            }
            int j1;
            if (byte0 >= -1)
            {
                if (c2 == '=')
                {
                    if (flag)
                    {
                        j1 = k;
                    } else
                    {
                        if (l < 2)
                        {
                            throw new ap((new StringBuilder()).append("Invalid padding char found in position ").append(l).toString());
                        }
                        flag = true;
                        char c3 = (char)(0x7f & ac[i + (j - 1)]);
                        if (c3 != '=' && c3 != '\n')
                        {
                            throw new ap("encoded value has invalid trailing char");
                        }
                        j1 = k;
                    }
                } else
                {
                    if (flag)
                    {
                        throw new ap((new StringBuilder()).append("Data found after trailing padding char at index ").append(l).toString());
                    }
                    int k1 = i1 + 1;
                    ac1[i1] = c2;
                    byte abyte2[];
                    if (k1 == 4)
                    {
                        j1 = k + a(ac1, 0, abyte1, k, abyte0);
                        i1 = 0;
                    } else
                    {
                        i1 = k1;
                        j1 = k;
                    }
                }
            } else
            {
                j1 = k;
            }
            l++;
            k = j1;
        }
        if (i1 != 0)
        {
            if (i1 == 1)
            {
                throw new ap((new StringBuilder()).append("single trailing character at offset ").append(j - 1).toString());
            }
            ac1[i1] = '=';
            k += a(ac1, 0, abyte1, k, abyte0);
        }
        abyte2 = new byte[k];
        System.arraycopy(abyte1, 0, abyte2, 0, k);
        return abyte2;
    }

    public static char[] a(byte abyte0[], int i, int j, char ac[], int k)
    {
        int l = 4 * ((j + 2) / 3);
        char ac1[] = new char[l + l / k];
        int i1 = j - 2;
        int j1 = 0;
        int k1 = 0;
        int l1;
        for (l1 = 0; l1 < i1;)
        {
            int i2 = (abyte0[l1 + i] << 24) >>> 8 | (abyte0[i + (l1 + 1)] << 24) >>> 16 | (abyte0[i + (l1 + 2)] << 24) >>> 24;
            ac1[k1] = ac[i2 >>> 18];
            ac1[k1 + 1] = ac[0x3f & i2 >>> 12];
            ac1[k1 + 2] = ac[0x3f & i2 >>> 6];
            ac1[k1 + 3] = ac[i2 & 0x3f];
            int j2 = j1 + 4;
            if (j2 == k)
            {
                ac1[k1 + 4] = '\n';
                k1++;
                j2 = 0;
            }
            l1 += 3;
            k1 += 4;
            j1 = j2;
        }

        if (l1 < j)
        {
            a(abyte0, l1 + i, j - l1, ac1, k1, ac);
            if (j1 + 4 == k)
            {
                ac1[k1 + 4] = '\n';
                k1++;
            }
            int _tmp = k1 + 4;
        }
        return ac1;
    }

    private static char[] a(byte abyte0[], int i, int j, char ac[], int k, char ac1[])
    {
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        if (j > 0)
        {
            l = (abyte0[i] << 24) >>> 8;
        } else
        {
            l = 0;
        }
        if (j > 1)
        {
            i1 = (abyte0[i + 1] << 24) >>> 16;
        } else
        {
            i1 = 0;
        }
        j1 = i1 | l;
        k1 = 0;
        if (j > 2)
        {
            k1 = (abyte0[i + 2] << 24) >>> 24;
        }
        l1 = k1 | j1;
        switch (j)
        {
        default:
            return ac;

        case 3: // '\003'
            ac[k] = ac1[l1 >>> 18];
            ac[k + 1] = ac1[0x3f & l1 >>> 12];
            ac[k + 2] = ac1[0x3f & l1 >>> 6];
            ac[k + 3] = ac1[l1 & 0x3f];
            return ac;

        case 2: // '\002'
            ac[k] = ac1[l1 >>> 18];
            ac[k + 1] = ac1[0x3f & l1 >>> 12];
            ac[k + 2] = ac1[0x3f & l1 >>> 6];
            ac[k + 3] = '=';
            return ac;

        case 1: // '\001'
            ac[k] = ac1[l1 >>> 18];
            ac[k + 1] = ac1[0x3f & l1 >>> 12];
            ac[k + 2] = '=';
            ac[k + 3] = '=';
            return ac;
        }
    }

}
