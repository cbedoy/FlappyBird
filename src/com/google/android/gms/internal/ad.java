// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.d;

// Referenced classes of package com.google.android.gms.internal:
//            y

public interface ad
    extends IInterface
{

    public abstract int a(y y, byte abyte0[], String s, String s1);

    public abstract int a(byte abyte0[], String s, String as[]);

    public abstract ParcelFileDescriptor a(Uri uri);

    public abstract String a();

    public abstract String a(String s);

    public abstract void a(int i1);

    public abstract void a(long l1);

    public abstract void a(IBinder ibinder, Bundle bundle);

    public abstract void a(y y);

    public abstract void a(y y, int i1, int j1, boolean flag, boolean flag1);

    public abstract void a(y y, int i1, boolean flag, boolean flag1);

    public abstract void a(y y, long l1);

    public abstract void a(y y, Bundle bundle, int i1, int j1);

    public abstract void a(y y, IBinder ibinder, int i1, String as[], Bundle bundle, boolean flag, long l1);

    public abstract void a(y y, IBinder ibinder, String s, boolean flag, long l1);

    public abstract void a(y y, String s);

    public abstract void a(y y, String s, int i1, int j1, int k1, boolean flag);

    public abstract void a(y y, String s, int i1, IBinder ibinder, Bundle bundle);

    public abstract void a(y y, String s, int i1, boolean flag, boolean flag1);

    public abstract void a(y y, String s, int i1, boolean flag, boolean flag1, boolean flag2, boolean flag3);

    public abstract void a(y y, String s, long l1);

    public abstract void a(y y, String s, IBinder ibinder, Bundle bundle);

    public abstract void a(y y, String s, String s1);

    public abstract void a(y y, String s, String s1, int i1, int j1, int k1, boolean flag);

    public abstract void a(y y, String s, String s1, boolean flag);

    public abstract void a(y y, String s, boolean flag);

    public abstract void a(y y, String s, boolean flag, long al[]);

    public abstract void a(y y, boolean flag);

    public abstract void a(String s, int i1);

    public abstract void a(String s, String s1);

    public abstract void a(String s, String s1, int i1);

    public abstract void a(boolean flag);

    public abstract Bundle b();

    public abstract String b(String s);

    public abstract void b(long l1);

    public abstract void b(y y);

    public abstract void b(y y, int i1, boolean flag, boolean flag1);

    public abstract void b(y y, String s);

    public abstract void b(y y, String s, int i1, int j1, int k1, boolean flag);

    public abstract void b(y y, String s, int i1, boolean flag, boolean flag1);

    public abstract void b(y y, String s, IBinder ibinder, Bundle bundle);

    public abstract void b(y y, String s, String s1);

    public abstract void b(y y, String s, String s1, int i1, int j1, int k1, boolean flag);

    public abstract void b(y y, String s, String s1, boolean flag);

    public abstract void b(y y, String s, boolean flag);

    public abstract void b(y y, boolean flag);

    public abstract void b(String s, int i1);

    public abstract void c();

    public abstract void c(y y);

    public abstract void c(y y, int i1, boolean flag, boolean flag1);

    public abstract void c(y y, String s);

    public abstract void c(y y, String s, String s1);

    public abstract void c(y y, String s, boolean flag);

    public abstract void c(y y, boolean flag);

    public abstract void c(String s);

    public abstract void c(String s, int i1);

    public abstract int d(String s);

    public abstract String d();

    public abstract void d(y y);

    public abstract void d(y y, int i1, boolean flag, boolean flag1);

    public abstract void d(y y, String s);

    public abstract void d(y y, String s, boolean flag);

    public abstract Uri e(String s);

    public abstract String e();

    public abstract void e(y y);

    public abstract void e(y y, int i1, boolean flag, boolean flag1);

    public abstract void e(y y, String s);

    public abstract d f();

    public abstract void f(y y);

    public abstract void f(y y, String s);

    public abstract void g(y y);

    public abstract void g(y y, String s);

    public abstract boolean g();

    public abstract d h();

    public abstract void h(y y);

    public abstract void h(y y, String s);

    public abstract void i(y y);

    public abstract void i(y y, String s);

    public abstract int j(y y, String s);

    public abstract void k(y y, String s);

    public abstract void l(y y, String s);
}
