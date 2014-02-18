// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.ads;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

public class az
{

    private static az c = null;
    private final BigInteger a = d();
    private BigInteger b;

    private az()
    {
        b = BigInteger.ONE;
    }

    public static az a()
    {
        com/google/ads/az;
        JVM INSTR monitorenter ;
        az az1;
        if (c == null)
        {
            c = new az();
        }
        az1 = c;
        com/google/ads/az;
        JVM INSTR monitorexit ;
        return az1;
        Exception exception;
        exception;
        throw exception;
    }

    private static byte[] a(long l)
    {
        return BigInteger.valueOf(l).toByteArray();
    }

    private static BigInteger d()
    {
        BigInteger biginteger;
        try
        {
            MessageDigest messagedigest = MessageDigest.getInstance("MD5");
            UUID uuid = UUID.randomUUID();
            messagedigest.update(a(uuid.getLeastSignificantBits()));
            messagedigest.update(a(uuid.getMostSignificantBits()));
            byte abyte0[] = new byte[9];
            abyte0[0] = 0;
            System.arraycopy(messagedigest.digest(), 0, abyte0, 1, 8);
            biginteger = new BigInteger(abyte0);
        }
        catch (NoSuchAlgorithmException nosuchalgorithmexception)
        {
            throw new RuntimeException("Cannot find MD5 message digest algorithm.");
        }
        return biginteger;
    }

    public BigInteger b()
    {
        this;
        JVM INSTR monitorenter ;
        BigInteger biginteger = a;
        this;
        JVM INSTR monitorexit ;
        return biginteger;
        Exception exception;
        exception;
        throw exception;
    }

    public BigInteger c()
    {
        this;
        JVM INSTR monitorenter ;
        BigInteger biginteger;
        biginteger = b;
        b = b.add(BigInteger.ONE);
        this;
        JVM INSTR monitorexit ;
        return biginteger;
        Exception exception;
        exception;
        throw exception;
    }

}
