// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.internal.safeparcel:
//            b

public class a
{

    public static int a(int i1)
    {
        return 0xffff & i1;
    }

    public static int a(Parcel parcel)
    {
        return parcel.readInt();
    }

    public static int a(Parcel parcel, int i1)
    {
        if ((i1 & 0xffff0000) != 0xffff0000)
        {
            return 0xffff & i1 >> 16;
        } else
        {
            return parcel.readInt();
        }
    }

    public static Parcelable a(Parcel parcel, int i1, android.os.Parcelable.Creator creator)
    {
        int j1 = a(parcel, i1);
        int k1 = parcel.dataPosition();
        if (j1 == 0)
        {
            return null;
        } else
        {
            Parcelable parcelable = (Parcelable)creator.createFromParcel(parcel);
            parcel.setDataPosition(j1 + k1);
            return parcelable;
        }
    }

    private static void a(Parcel parcel, int i1, int j1)
    {
        int k1 = a(parcel, i1);
        if (k1 != j1)
        {
            throw new b((new StringBuilder()).append("Expected size ").append(j1).append(" got ").append(k1).append(" (0x").append(Integer.toHexString(k1)).append(")").toString(), parcel);
        } else
        {
            return;
        }
    }

    public static void a(Parcel parcel, int i1, List list, ClassLoader classloader)
    {
        int j1 = a(parcel, i1);
        int k1 = parcel.dataPosition();
        if (j1 == 0)
        {
            return;
        } else
        {
            parcel.readList(list, classloader);
            parcel.setDataPosition(j1 + k1);
            return;
        }
    }

    public static int b(Parcel parcel)
    {
        int i1 = a(parcel);
        int j1 = a(parcel, i1);
        int k1 = parcel.dataPosition();
        if (a(i1) != 20293)
        {
            throw new b((new StringBuilder()).append("Expected object header. Got 0x").append(Integer.toHexString(i1)).toString(), parcel);
        }
        int l1 = k1 + j1;
        if (l1 < k1 || l1 > parcel.dataSize())
        {
            throw new b((new StringBuilder()).append("Size read is invalid start=").append(k1).append(" end=").append(l1).toString(), parcel);
        } else
        {
            return l1;
        }
    }

    public static void b(Parcel parcel, int i1)
    {
        parcel.setDataPosition(a(parcel, i1) + parcel.dataPosition());
    }

    public static Object[] b(Parcel parcel, int i1, android.os.Parcelable.Creator creator)
    {
        int j1 = a(parcel, i1);
        int k1 = parcel.dataPosition();
        if (j1 == 0)
        {
            return null;
        } else
        {
            Object aobj[] = parcel.createTypedArray(creator);
            parcel.setDataPosition(j1 + k1);
            return aobj;
        }
    }

    public static ArrayList c(Parcel parcel, int i1, android.os.Parcelable.Creator creator)
    {
        int j1 = a(parcel, i1);
        int k1 = parcel.dataPosition();
        if (j1 == 0)
        {
            return null;
        } else
        {
            ArrayList arraylist = parcel.createTypedArrayList(creator);
            parcel.setDataPosition(j1 + k1);
            return arraylist;
        }
    }

    public static boolean c(Parcel parcel, int i1)
    {
        a(parcel, i1, 4);
        return parcel.readInt() != 0;
    }

    public static byte d(Parcel parcel, int i1)
    {
        a(parcel, i1, 4);
        return (byte)parcel.readInt();
    }

    public static short e(Parcel parcel, int i1)
    {
        a(parcel, i1, 4);
        return (short)parcel.readInt();
    }

    public static int f(Parcel parcel, int i1)
    {
        a(parcel, i1, 4);
        return parcel.readInt();
    }

    public static long g(Parcel parcel, int i1)
    {
        a(parcel, i1, 8);
        return parcel.readLong();
    }

    public static BigInteger h(Parcel parcel, int i1)
    {
        int j1 = a(parcel, i1);
        int k1 = parcel.dataPosition();
        if (j1 == 0)
        {
            return null;
        } else
        {
            byte abyte0[] = parcel.createByteArray();
            parcel.setDataPosition(j1 + k1);
            return new BigInteger(abyte0);
        }
    }

    public static float i(Parcel parcel, int i1)
    {
        a(parcel, i1, 4);
        return parcel.readFloat();
    }

    public static double j(Parcel parcel, int i1)
    {
        a(parcel, i1, 8);
        return parcel.readDouble();
    }

    public static BigDecimal k(Parcel parcel, int i1)
    {
        int j1 = a(parcel, i1);
        int k1 = parcel.dataPosition();
        if (j1 == 0)
        {
            return null;
        } else
        {
            byte abyte0[] = parcel.createByteArray();
            int l1 = parcel.readInt();
            parcel.setDataPosition(j1 + k1);
            return new BigDecimal(new BigInteger(abyte0), l1);
        }
    }

    public static String l(Parcel parcel, int i1)
    {
        int j1 = a(parcel, i1);
        int k1 = parcel.dataPosition();
        if (j1 == 0)
        {
            return null;
        } else
        {
            String s1 = parcel.readString();
            parcel.setDataPosition(j1 + k1);
            return s1;
        }
    }

    public static IBinder m(Parcel parcel, int i1)
    {
        int j1 = a(parcel, i1);
        int k1 = parcel.dataPosition();
        if (j1 == 0)
        {
            return null;
        } else
        {
            IBinder ibinder = parcel.readStrongBinder();
            parcel.setDataPosition(j1 + k1);
            return ibinder;
        }
    }

    public static Bundle n(Parcel parcel, int i1)
    {
        int j1 = a(parcel, i1);
        int k1 = parcel.dataPosition();
        if (j1 == 0)
        {
            return null;
        } else
        {
            Bundle bundle = parcel.readBundle();
            parcel.setDataPosition(j1 + k1);
            return bundle;
        }
    }

    public static byte[] o(Parcel parcel, int i1)
    {
        int j1 = a(parcel, i1);
        int k1 = parcel.dataPosition();
        if (j1 == 0)
        {
            return null;
        } else
        {
            byte abyte0[] = parcel.createByteArray();
            parcel.setDataPosition(j1 + k1);
            return abyte0;
        }
    }

    public static boolean[] p(Parcel parcel, int i1)
    {
        int j1 = a(parcel, i1);
        int k1 = parcel.dataPosition();
        if (j1 == 0)
        {
            return null;
        } else
        {
            boolean aflag[] = parcel.createBooleanArray();
            parcel.setDataPosition(j1 + k1);
            return aflag;
        }
    }

    public static int[] q(Parcel parcel, int i1)
    {
        int j1 = a(parcel, i1);
        int k1 = parcel.dataPosition();
        if (j1 == 0)
        {
            return null;
        } else
        {
            int ai[] = parcel.createIntArray();
            parcel.setDataPosition(j1 + k1);
            return ai;
        }
    }

    public static long[] r(Parcel parcel, int i1)
    {
        int j1 = a(parcel, i1);
        int k1 = parcel.dataPosition();
        if (j1 == 0)
        {
            return null;
        } else
        {
            long al[] = parcel.createLongArray();
            parcel.setDataPosition(j1 + k1);
            return al;
        }
    }

    public static BigInteger[] s(Parcel parcel, int i1)
    {
        int j1 = a(parcel, i1);
        int k1 = parcel.dataPosition();
        if (j1 == 0)
        {
            return null;
        }
        int l1 = parcel.readInt();
        BigInteger abiginteger[] = new BigInteger[l1];
        for (int i2 = 0; i2 < l1; i2++)
        {
            abiginteger[i2] = new BigInteger(parcel.createByteArray());
        }

        parcel.setDataPosition(k1 + j1);
        return abiginteger;
    }

    public static float[] t(Parcel parcel, int i1)
    {
        int j1 = a(parcel, i1);
        int k1 = parcel.dataPosition();
        if (j1 == 0)
        {
            return null;
        } else
        {
            float af[] = parcel.createFloatArray();
            parcel.setDataPosition(j1 + k1);
            return af;
        }
    }

    public static double[] u(Parcel parcel, int i1)
    {
        int j1 = a(parcel, i1);
        int k1 = parcel.dataPosition();
        if (j1 == 0)
        {
            return null;
        } else
        {
            double ad[] = parcel.createDoubleArray();
            parcel.setDataPosition(j1 + k1);
            return ad;
        }
    }

    public static BigDecimal[] v(Parcel parcel, int i1)
    {
        int j1 = a(parcel, i1);
        int k1 = parcel.dataPosition();
        if (j1 == 0)
        {
            return null;
        }
        int l1 = parcel.readInt();
        BigDecimal abigdecimal[] = new BigDecimal[l1];
        for (int i2 = 0; i2 < l1; i2++)
        {
            byte abyte0[] = parcel.createByteArray();
            int j2 = parcel.readInt();
            abigdecimal[i2] = new BigDecimal(new BigInteger(abyte0), j2);
        }

        parcel.setDataPosition(k1 + j1);
        return abigdecimal;
    }

    public static String[] w(Parcel parcel, int i1)
    {
        int j1 = a(parcel, i1);
        int k1 = parcel.dataPosition();
        if (j1 == 0)
        {
            return null;
        } else
        {
            String as[] = parcel.createStringArray();
            parcel.setDataPosition(j1 + k1);
            return as;
        }
    }

    public static ArrayList x(Parcel parcel, int i1)
    {
        int j1 = a(parcel, i1);
        int k1 = parcel.dataPosition();
        if (j1 == 0)
        {
            return null;
        } else
        {
            ArrayList arraylist = parcel.createStringArrayList();
            parcel.setDataPosition(j1 + k1);
            return arraylist;
        }
    }

    public static Parcel y(Parcel parcel, int i1)
    {
        int j1 = a(parcel, i1);
        int k1 = parcel.dataPosition();
        if (j1 == 0)
        {
            return null;
        } else
        {
            Parcel parcel1 = Parcel.obtain();
            parcel1.appendFrom(parcel, k1, j1);
            parcel.setDataPosition(j1 + k1);
            return parcel1;
        }
    }

    public static Parcel[] z(Parcel parcel, int i1)
    {
        int j1 = a(parcel, i1);
        int k1 = parcel.dataPosition();
        if (j1 == 0)
        {
            return null;
        }
        int l1 = parcel.readInt();
        Parcel aparcel[] = new Parcel[l1];
        int i2 = 0;
        while (i2 < l1) 
        {
            int j2 = parcel.readInt();
            if (j2 != 0)
            {
                int k2 = parcel.dataPosition();
                Parcel parcel1 = Parcel.obtain();
                parcel1.appendFrom(parcel, k2, j2);
                aparcel[i2] = parcel1;
                parcel.setDataPosition(j2 + k2);
            } else
            {
                aparcel[i2] = null;
            }
            i2++;
        }
        parcel.setDataPosition(k1 + j1);
        return aparcel;
    }
}
