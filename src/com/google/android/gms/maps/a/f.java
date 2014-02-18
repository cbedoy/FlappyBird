// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.a;

import android.location.Location;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.b.e;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.a.a;
import com.google.android.gms.maps.model.a.b;
import com.google.android.gms.maps.model.a.g;
import com.google.android.gms.maps.model.a.h;
import com.google.android.gms.maps.model.a.j;
import com.google.android.gms.maps.model.a.k;
import com.google.android.gms.maps.model.a.m;
import com.google.android.gms.maps.model.a.n;
import com.google.android.gms.maps.model.a.p;
import com.google.android.gms.maps.model.a.q;
import com.google.android.gms.maps.model.a.s;
import com.google.android.gms.maps.model.a.t;
import com.google.android.gms.maps.model.c;

// Referenced classes of package com.google.android.gms.maps.a:
//            d, w, ac, af, 
//            ai, ao, ar, au, 
//            ax, ba, bd, bg, 
//            g, t, q, s, 
//            p

class f
    implements d
{

    private IBinder a;

    f(IBinder ibinder)
    {
        a = ibinder;
    }

    public CameraPosition a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        CameraPosition cameraposition1 = CameraPosition.CREATOR.a(parcel1);
        CameraPosition cameraposition = cameraposition1;
_L4:
        parcel1.recycle();
        parcel.recycle();
        return cameraposition;
_L2:
        cameraposition = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public a a(PolylineOptions polylineoptions)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (polylineoptions == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        parcel.writeInt(1);
        polylineoptions.writeToParcel(parcel, 0);
_L1:
        a a1;
        a.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        a1 = com.google.android.gms.maps.model.a.b.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return a1;
        parcel.writeInt(0);
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public g a(CircleOptions circleoptions)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (circleoptions == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        parcel.writeInt(1);
        circleoptions.writeToParcel(parcel, 0);
_L1:
        g g1;
        a.transact(35, parcel, parcel1, 0);
        parcel1.readException();
        g1 = com.google.android.gms.maps.model.a.h.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return g1;
        parcel.writeInt(0);
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public j a(GroundOverlayOptions groundoverlayoptions)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (groundoverlayoptions == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        parcel.writeInt(1);
        groundoverlayoptions.writeToParcel(parcel, 0);
_L1:
        j j1;
        a.transact(12, parcel, parcel1, 0);
        parcel1.readException();
        j1 = com.google.android.gms.maps.model.a.k.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return j1;
        parcel.writeInt(0);
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public m a(MarkerOptions markeroptions)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (markeroptions == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        parcel.writeInt(1);
        markeroptions.writeToParcel(parcel, 0);
_L1:
        m m1;
        a.transact(11, parcel, parcel1, 0);
        parcel1.readException();
        m1 = n.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return m1;
        parcel.writeInt(0);
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public p a(PolygonOptions polygonoptions)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (polygonoptions == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        parcel.writeInt(1);
        polygonoptions.writeToParcel(parcel, 0);
_L1:
        p p;
        a.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        p = q.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return p;
        parcel.writeInt(0);
          goto _L1
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public s a(TileOverlayOptions tileoverlayoptions)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (tileoverlayoptions == null)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        parcel.writeInt(1);
        tileoverlayoptions.writeToParcel(parcel, 0);
_L1:
        s s;
        a.transact(13, parcel, parcel1, 0);
        parcel1.readException();
        s = t.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return s;
        parcel.writeInt(0);
          goto _L1
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
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        parcel.writeInt(i1);
        a.transact(16, parcel, parcel1, 0);
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

    public void a(int i1, int j1, int k1, int l1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        parcel.writeInt(i1);
        parcel.writeInt(j1);
        parcel.writeInt(k1);
        parcel.writeInt(l1);
        a.transact(39, parcel, parcel1, 0);
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

    public void a(e e1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        IBinder ibinder = e1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        a.transact(4, parcel, parcel1, 0);
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

    public void a(e e1, int i1, w w1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_97;
        }
        IBinder ibinder = e1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        parcel.writeInt(i1);
        IBinder ibinder1;
        ibinder1 = null;
        if (w1 == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        ibinder1 = w1.asBinder();
        parcel.writeStrongBinder(ibinder1);
        a.transact(7, parcel, parcel1, 0);
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

    public void a(e e1, w w1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        IBinder ibinder = e1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        IBinder ibinder1;
        ibinder1 = null;
        if (w1 == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        ibinder1 = w1.asBinder();
        parcel.writeStrongBinder(ibinder1);
        a.transact(6, parcel, parcel1, 0);
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

    public void a(ac ac1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (ac1 == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        IBinder ibinder = ac1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        a.transact(33, parcel, parcel1, 0);
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

    public void a(af af1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (af1 == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        IBinder ibinder = af1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        a.transact(27, parcel, parcel1, 0);
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

    public void a(ai ai1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (ai1 == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        IBinder ibinder = ai1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        a.transact(32, parcel, parcel1, 0);
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

    public void a(ao ao1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (ao1 == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        IBinder ibinder = ao1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        a.transact(28, parcel, parcel1, 0);
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

    public void a(ar ar1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (ar1 == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        IBinder ibinder = ar1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        a.transact(29, parcel, parcel1, 0);
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

    public void a(au au1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (au1 == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        IBinder ibinder = au1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        a.transact(30, parcel, parcel1, 0);
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

    public void a(ax ax1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (ax1 == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        IBinder ibinder = ax1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        a.transact(31, parcel, parcel1, 0);
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

    public void a(ba ba1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (ba1 == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        IBinder ibinder = ba1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        a.transact(37, parcel, parcel1, 0);
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

    public void a(bd bd1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (bd1 == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        IBinder ibinder = bd1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        a.transact(36, parcel, parcel1, 0);
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

    public void a(bg bg1, e e1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (bg1 == null)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        IBinder ibinder = bg1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        IBinder ibinder1;
        ibinder1 = null;
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        ibinder1 = e1.asBinder();
        parcel.writeStrongBinder(ibinder1);
        a.transact(38, parcel, parcel1, 0);
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

    public void a(com.google.android.gms.maps.a.g g1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (g1 == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        IBinder ibinder = g1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        a.transact(24, parcel, parcel1, 0);
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

    public void a(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        int i1;
        i1 = 0;
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        a.transact(18, parcel, parcel1, 0);
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

    public float b()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        float f1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        f1 = parcel1.readFloat();
        parcel1.recycle();
        parcel.recycle();
        return f1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void b(e e1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        if (e1 == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        IBinder ibinder = e1.asBinder();
_L1:
        parcel.writeStrongBinder(ibinder);
        a.transact(5, parcel, parcel1, 0);
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

    public boolean b(boolean flag)
    {
        boolean flag1;
        Parcel parcel;
        Parcel parcel1;
        flag1 = true;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        int i1;
        int j1;
        if (flag)
        {
            i1 = ((flag1) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        a.transact(20, parcel, parcel1, 0);
        parcel1.readException();
        j1 = parcel1.readInt();
        if (j1 == 0)
        {
            flag1 = false;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public float c()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        float f1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        f1 = parcel1.readFloat();
        parcel1.recycle();
        parcel.recycle();
        return f1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void c(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        int i1;
        i1 = 0;
        if (flag)
        {
            i1 = 1;
        }
        parcel.writeInt(i1);
        a.transact(22, parcel, parcel1, 0);
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

    public void d()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(8, parcel, parcel1, 0);
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

    public void e()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(14, parcel, parcel1, 0);
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

    public int f()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(15, parcel, parcel1, 0);
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

    public boolean g()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(17, parcel, parcel1, 0);
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

    public boolean h()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(19, parcel, parcel1, 0);
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

    public boolean i()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int i1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(21, parcel, parcel1, 0);
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

    public Location j()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(23, parcel, parcel1, 0);
        parcel1.readException();
        if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
        Location location = (Location)Location.CREATOR.createFromParcel(parcel1);
_L4:
        parcel1.recycle();
        parcel.recycle();
        return location;
_L2:
        location = null;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public com.google.android.gms.maps.a.s k()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        com.google.android.gms.maps.a.s s;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(25, parcel, parcel1, 0);
        parcel1.readException();
        s = com.google.android.gms.maps.a.t.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return s;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public com.google.android.gms.maps.a.p l()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        com.google.android.gms.maps.a.p p;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(26, parcel, parcel1, 0);
        parcel1.readException();
        p = com.google.android.gms.maps.a.q.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return p;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public e m()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        e e1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        a.transact(34, parcel, parcel1, 0);
        parcel1.readException();
        e1 = com.google.android.gms.b.f.a(parcel1.readStrongBinder());
        parcel1.recycle();
        parcel.recycle();
        return e1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }
}
