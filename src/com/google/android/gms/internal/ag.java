// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.d;
import com.google.android.gms.common.data.f;

// Referenced classes of package com.google.android.gms.internal:
//            ad, y

class ag
    implements ad
{

    private IBinder a;

    ag(IBinder ibinder)
    {
        a = ibinder;
    }

    public int a(y y1, byte abyte0[], String s, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        int i1;
        parcel.writeStrongBinder(ibinder);
        parcel.writeByteArray(abyte0);
        parcel.writeString(s);
        parcel.writeString(s1);
        a.transact(5033, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i1;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public int a(byte abyte0[], String s, String as[])
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i1;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeByteArray(abyte0);
        parcel.writeString(s);
        parcel.writeStringArray(as);
        a.transact(5034, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public ParcelFileDescriptor a(Uri uri)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (uri == null) goto _L2; else goto _L1
_L1:
        parcel.writeInt(1);
        uri.writeToParcel(parcel, 0);
_L3:
        ParcelFileDescriptor parcelfiledescriptor;
        a.transact(6507, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        parcelfiledescriptor = (ParcelFileDescriptor)ParcelFileDescriptor.CREATOR.createFromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return parcelfiledescriptor;
_L2:
        parcel.writeInt(0);
          goto _L3
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
        parcelfiledescriptor = null;
          goto _L4
    }

    public String a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        String s;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        a.transact(5003, parcel, parcel1, 0);
        parcel1.readException();
        s = parcel1.readString();
        parcel1.recycle();
        parcel.recycle();
        return s;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public String a(String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        String s1;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        a.transact(5064, parcel, parcel1, 0);
        parcel1.readException();
        s1 = parcel1.readString();
        parcel1.recycle();
        parcel.recycle();
        return s1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void a(int i1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeInt(i1);
        a.transact(5036, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void a(long l1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeLong(l1);
        a.transact(5001, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void a(IBinder ibinder, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeStrongBinder(ibinder);
        if (bundle == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L1:
        a.transact(5005, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        parcel.writeInt(0);
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void a(y y1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        a.transact(5002, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void a(y y1, int i1, int j1, boolean flag, boolean flag1)
    {
        int k1;
        Parcel parcel;
        Parcel parcel1;
        k1 = 1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeInt(i1);
        parcel.writeInt(j1);
        int l1;
        if (flag)
        {
            l1 = k1;
        } else
        {
            l1 = 0;
        }
        parcel.writeInt(l1);
        if (!flag1)
        {
            k1 = 0;
        }
        parcel.writeInt(k1);
        a.transact(5044, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void a(y y1, int i1, boolean flag, boolean flag1)
    {
        int j1;
        Parcel parcel;
        Parcel parcel1;
        j1 = 1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeInt(i1);
        int k1;
        if (flag)
        {
            k1 = j1;
        } else
        {
            k1 = 0;
        }
        parcel.writeInt(k1);
        if (!flag1)
        {
            j1 = 0;
        }
        parcel.writeInt(j1);
        a.transact(5015, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void a(y y1, long l1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeLong(l1);
        a.transact(5058, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void a(y y1, Bundle bundle, int i1, int j1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null) goto _L2; else goto _L1
_L1:
        IBinder ibinder = y1.asBinder();
_L5:
        parcel.writeStrongBinder(ibinder);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        parcel.writeInt(i1);
        parcel.writeInt(j1);
        a.transact(5021, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ibinder = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
          goto _L5
    }

    public void a(y y1, IBinder ibinder, int i1, String as[], Bundle bundle, boolean flag, long l1)
    {
        int j1;
        Parcel parcel;
        Parcel parcel1;
        j1 = 1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null) goto _L2; else goto _L1
_L1:
        IBinder ibinder1 = y1.asBinder();
_L5:
        parcel.writeStrongBinder(ibinder1);
        parcel.writeStrongBinder(ibinder);
        parcel.writeInt(i1);
        parcel.writeStringArray(as);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
        break MISSING_BLOCK_LABEL_158;
_L6:
        parcel.writeInt(j1);
        parcel.writeLong(l1);
        a.transact(5030, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ibinder1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
        break MISSING_BLOCK_LABEL_158;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
        while (!flag) 
        {
            j1 = 0;
            break;
        }
          goto _L6
    }

    public void a(y y1, IBinder ibinder, String s, boolean flag, long l1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        IBinder ibinder1 = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder1);
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s);
        int i1;
        i1 = 0;
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        parcel.writeLong(l1);
        a.transact(5031, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder1 = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void a(y y1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s);
        a.transact(5008, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void a(y y1, String s, int i1, int j1, int k1, boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s);
        parcel.writeInt(i1);
        parcel.writeInt(j1);
        parcel.writeInt(k1);
        int l1;
        l1 = 0;
        if (flag)
        {
            l1 = 1;
        }
        parcel.writeInt(l1);
        a.transact(5019, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void a(y y1, String s, int i1, IBinder ibinder, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null) goto _L2; else goto _L1
_L1:
        IBinder ibinder1 = y1.asBinder();
_L5:
        parcel.writeStrongBinder(ibinder1);
        parcel.writeString(s);
        parcel.writeInt(i1);
        parcel.writeStrongBinder(ibinder);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(5025, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ibinder1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
          goto _L5
    }

    public void a(y y1, String s, int i1, boolean flag, boolean flag1)
    {
        int j1;
        Parcel parcel;
        Parcel parcel1;
        j1 = 1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s);
        parcel.writeInt(i1);
        int k1;
        if (flag)
        {
            k1 = j1;
        } else
        {
            k1 = 0;
        }
        parcel.writeInt(k1);
        if (!flag1)
        {
            j1 = 0;
        }
        parcel.writeInt(j1);
        a.transact(5045, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void a(y y1, String s, int i1, boolean flag, boolean flag1, boolean flag2, boolean flag3)
    {
        int j1;
        Parcel parcel;
        Parcel parcel1;
        j1 = 1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_145;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s);
        parcel.writeInt(i1);
        int k1;
        int l1;
        int i2;
        if (flag)
        {
            k1 = j1;
        } else
        {
            k1 = 0;
        }
        parcel.writeInt(k1);
        if (flag1)
        {
            l1 = j1;
        } else
        {
            l1 = 0;
        }
        parcel.writeInt(l1);
        if (flag2)
        {
            i2 = j1;
        } else
        {
            i2 = 0;
        }
        parcel.writeInt(i2);
        if (!flag3)
        {
            j1 = 0;
        }
        parcel.writeInt(j1);
        a.transact(6501, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void a(y y1, String s, long l1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s);
        parcel.writeLong(l1);
        a.transact(5016, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void a(y y1, String s, IBinder ibinder, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null) goto _L2; else goto _L1
_L1:
        IBinder ibinder1 = y1.asBinder();
_L5:
        parcel.writeStrongBinder(ibinder1);
        parcel.writeString(s);
        parcel.writeStrongBinder(ibinder);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(5023, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ibinder1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
          goto _L5
    }

    public void a(y y1, String s, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s);
        parcel.writeString(s1);
        a.transact(5009, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void a(y y1, String s, String s1, int i1, int j1, int k1, boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeInt(i1);
        parcel.writeInt(j1);
        parcel.writeInt(k1);
        int l1;
        l1 = 0;
        if (flag)
        {
            l1 = 1;
        }
        parcel.writeInt(l1);
        a.transact(5039, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void a(y y1, String s, String s1, boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s);
        parcel.writeString(s1);
        int i1;
        i1 = 0;
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        a.transact(6002, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void a(y y1, String s, boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s);
        int i1;
        i1 = 0;
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        a.transact(5054, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void a(y y1, String s, boolean flag, long al[])
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s);
        int i1;
        i1 = 0;
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        parcel.writeLongArray(al);
        a.transact(5011, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void a(y y1, boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        int i1;
        i1 = 0;
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        a.transact(5063, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void a(String s, int i1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        parcel.writeInt(i1);
        a.transact(5028, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void a(String s, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        parcel.writeString(s1);
        a.transact(5065, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void a(String s, String s1, int i1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeInt(i1);
        a.transact(5051, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void a(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        int i1;
        i1 = 0;
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        a.transact(5068, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public IBinder asBinder()
    {
        return a;
    }

    public Bundle b()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        a.transact(5004, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Bundle bundle = (Bundle)Bundle.CREATOR.createFromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return bundle;
_L2:
        bundle = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public String b(String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        String s1;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        a.transact(5035, parcel, parcel1, 0);
        parcel1.readException();
        s1 = parcel1.readString();
        parcel1.recycle();
        parcel.recycle();
        return s1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void b(long l1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeLong(l1);
        a.transact(5059, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void b(y y1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        a.transact(5017, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void b(y y1, int i1, boolean flag, boolean flag1)
    {
        int j1;
        Parcel parcel;
        Parcel parcel1;
        j1 = 1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeInt(i1);
        int k1;
        if (flag)
        {
            k1 = j1;
        } else
        {
            k1 = 0;
        }
        parcel.writeInt(k1);
        if (!flag1)
        {
            j1 = 0;
        }
        parcel.writeInt(j1);
        a.transact(5046, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void b(y y1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s);
        a.transact(5010, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void b(y y1, String s, int i1, int j1, int k1, boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_114;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s);
        parcel.writeInt(i1);
        parcel.writeInt(j1);
        parcel.writeInt(k1);
        int l1;
        l1 = 0;
        if (flag)
        {
            l1 = 1;
        }
        parcel.writeInt(l1);
        a.transact(5020, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void b(y y1, String s, int i1, boolean flag, boolean flag1)
    {
        int j1;
        Parcel parcel;
        Parcel parcel1;
        j1 = 1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s);
        parcel.writeInt(i1);
        int k1;
        if (flag)
        {
            k1 = j1;
        } else
        {
            k1 = 0;
        }
        parcel.writeInt(k1);
        if (!flag1)
        {
            j1 = 0;
        }
        parcel.writeInt(j1);
        a.transact(5501, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void b(y y1, String s, IBinder ibinder, Bundle bundle)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null) goto _L2; else goto _L1
_L1:
        IBinder ibinder1 = y1.asBinder();
_L5:
        parcel.writeStrongBinder(ibinder1);
        parcel.writeString(s);
        parcel.writeStrongBinder(ibinder);
        if (bundle == null) goto _L4; else goto _L3
_L3:
        parcel.writeInt(1);
        bundle.writeToParcel(parcel, 0);
_L6:
        a.transact(5024, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
_L2:
        ibinder1 = null;
          goto _L5
_L4:
        parcel.writeInt(0);
          goto _L6
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
          goto _L5
    }

    public void b(y y1, String s, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s);
        parcel.writeString(s1);
        a.transact(5038, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void b(y y1, String s, String s1, int i1, int j1, int k1, boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_121;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s);
        parcel.writeString(s1);
        parcel.writeInt(i1);
        parcel.writeInt(j1);
        parcel.writeInt(k1);
        int l1;
        l1 = 0;
        if (flag)
        {
            l1 = 1;
        }
        parcel.writeInt(l1);
        a.transact(5040, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void b(y y1, String s, String s1, boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s);
        parcel.writeString(s1);
        int i1;
        i1 = 0;
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        a.transact(6506, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void b(y y1, String s, boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s);
        int i1;
        i1 = 0;
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        a.transact(6502, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void b(y y1, boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        int i1;
        i1 = 0;
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        a.transact(6001, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void b(String s, int i1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        parcel.writeInt(i1);
        a.transact(5029, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void c()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        a.transact(5006, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void c(y y1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        a.transact(5022, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void c(y y1, int i1, boolean flag, boolean flag1)
    {
        int j1;
        Parcel parcel;
        Parcel parcel1;
        j1 = 1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeInt(i1);
        int k1;
        if (flag)
        {
            k1 = j1;
        } else
        {
            k1 = 0;
        }
        parcel.writeInt(k1);
        if (!flag1)
        {
            j1 = 0;
        }
        parcel.writeInt(j1);
        a.transact(5048, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void c(y y1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s);
        a.transact(5014, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void c(y y1, String s, String s1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_82;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s);
        parcel.writeString(s1);
        a.transact(5041, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void c(y y1, String s, boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s);
        int i1;
        i1 = 0;
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        a.transact(6504, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void c(y y1, boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        int i1;
        i1 = 0;
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        a.transact(6503, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void c(String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        a.transact(5050, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void c(String s, int i1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        parcel.writeInt(i1);
        a.transact(5055, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public int d(String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i1;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        a.transact(5060, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public String d()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        String s;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        a.transact(5007, parcel, parcel1, 0);
        parcel1.readException();
        s = parcel1.readString();
        parcel1.recycle();
        parcel.recycle();
        return s;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void d(y y1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        a.transact(5026, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void d(y y1, int i1, boolean flag, boolean flag1)
    {
        int j1;
        Parcel parcel;
        Parcel parcel1;
        j1 = 1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeInt(i1);
        int k1;
        if (flag)
        {
            k1 = j1;
        } else
        {
            k1 = 0;
        }
        parcel.writeInt(k1);
        if (!flag1)
        {
            j1 = 0;
        }
        parcel.writeInt(j1);
        a.transact(6003, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void d(y y1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s);
        a.transact(5018, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void d(y y1, String s, boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s);
        int i1;
        i1 = 0;
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        a.transact(6505, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public Uri e(String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        parcel.writeString(s);
        a.transact(5066, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Uri uri = (Uri)Uri.CREATOR.createFromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return uri;
_L2:
        uri = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public String e()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        String s;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        a.transact(5012, parcel, parcel1, 0);
        parcel1.readException();
        s = parcel1.readString();
        parcel1.recycle();
        parcel.recycle();
        return s;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void e(y y1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        a.transact(5027, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void e(y y1, int i1, boolean flag, boolean flag1)
    {
        int j1;
        Parcel parcel;
        Parcel parcel1;
        j1 = 1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_106;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeInt(i1);
        int k1;
        if (flag)
        {
            k1 = j1;
        } else
        {
            k1 = 0;
        }
        parcel.writeInt(k1);
        if (!flag1)
        {
            j1 = 0;
        }
        parcel.writeInt(j1);
        a.transact(6004, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void e(y y1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s);
        a.transact(5032, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public d f()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        a.transact(5013, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        d d2 = d.CREATOR.a(parcel1);
        d d1 = d2;
_L4:
        parcel1.recycle();
        parcel.recycle();
        return d1;
_L2:
        d1 = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void f(y y1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        a.transact(5047, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void f(y y1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s);
        a.transact(5037, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void g(y y1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        a.transact(5049, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void g(y y1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s);
        a.transact(5042, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public boolean g()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i1;
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        a.transact(5067, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        boolean flag = false;
        if (i1 != 0)
        {
            flag = true;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public d h()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        a.transact(5502, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        d d2 = d.CREATOR.a(parcel1);
        d d1 = d2;
_L4:
        parcel1.recycle();
        parcel.recycle();
        return d1;
_L2:
        d1 = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void h(y y1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        a.transact(5056, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void h(y y1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s);
        a.transact(5043, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void i(y y1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        a.transact(5062, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void i(y y1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s);
        a.transact(5052, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public int j(y y1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        int i1;
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s);
        a.transact(5053, parcel, parcel1, 0);
        parcel1.readException();
        i1 = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return i1;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void k(y y1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s);
        a.transact(5061, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void l(y y1, String s)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.games.internal.IGamesService");
        if (y1 == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        IBinder ibinder = y1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeString(s);
        a.transact(5057, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        ibinder = null;
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }
}
