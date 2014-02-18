// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

// Referenced classes of package com.google.ads:
//            aq, an

public class am
{

    static void a(byte abyte0[])
    {
        for (int i = 0; i < abyte0.length; i++)
        {
            abyte0[i] = (byte)(0x44 ^ abyte0[i]);
        }

    }

    public static byte[] a(String s)
    {
        byte abyte0[] = aq.a(s);
        if (abyte0.length != 32)
        {
            throw new an();
        } else
        {
            ByteBuffer bytebuffer = ByteBuffer.wrap(abyte0, 4, 16);
            byte abyte1[] = new byte[16];
            bytebuffer.get(abyte1);
            a(abyte1);
            return abyte1;
        }
    }

    public static byte[] a(byte abyte0[], String s)
    {
        if (abyte0.length != 16)
        {
            throw new an();
        }
        byte abyte1[];
        ByteBuffer bytebuffer;
        byte abyte2[];
        byte abyte3[];
        SecretKeySpec secretkeyspec;
        Cipher cipher;
        byte abyte4[];
        try
        {
            abyte1 = aq.a(s);
            if (abyte1.length <= 16)
            {
                throw new an();
            }
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            throw new an(nosuchalgorithmexception);
        }
        catch (InvalidKeyException invalidkeyexception)
        {
            throw new an(invalidkeyexception);
        }
        catch (IllegalBlockSizeException illegalblocksizeexception)
        {
            throw new an(illegalblocksizeexception);
        }
        catch (NoSuchPaddingException nosuchpaddingexception)
        {
            throw new an(nosuchpaddingexception);
        }
        catch (BadPaddingException badpaddingexception)
        {
            throw new an(badpaddingexception);
        }
        catch (InvalidAlgorithmParameterException invalidalgorithmparameterexception)
        {
            throw new an(invalidalgorithmparameterexception);
        }
        bytebuffer = ByteBuffer.allocate(abyte1.length);
        bytebuffer.put(abyte1);
        bytebuffer.flip();
        abyte2 = new byte[16];
        abyte3 = new byte[-16 + abyte1.length];
        bytebuffer.get(abyte2);
        bytebuffer.get(abyte3);
        secretkeyspec = new SecretKeySpec(abyte0, "AES");
        cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(2, secretkeyspec, new IvParameterSpec(abyte2));
        abyte4 = cipher.doFinal(abyte3);
        return abyte4;
    }
}
