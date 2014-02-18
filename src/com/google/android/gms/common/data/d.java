// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.do;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.common.data:
//            f, c, e

public final class d
    implements SafeParcelable
{

    public static final f CREATOR = new f();
    private static final HashMap e = (HashMap)null;
    private static final Object f = new Object();
    private static final e l = new c(new String[0], null);
    Bundle a;
    int b[];
    int c;
    boolean d;
    private final int g;
    private final String h[];
    private final CursorWindow i[];
    private final int j;
    private final Bundle k;

    d(int i1, String as[], CursorWindow acursorwindow[], int j1, Bundle bundle)
    {
        d = false;
        g = i1;
        h = as;
        i = acursorwindow;
        j = j1;
        k = bundle;
    }

    private void a(String s, int i1)
    {
        if (a == null || !a.containsKey(s))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("No such column: ").append(s).toString());
        }
        if (h())
        {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i1 < 0 || i1 >= c)
        {
            throw new CursorIndexOutOfBoundsException(i1, c);
        } else
        {
            return;
        }
    }

    public int a(int i1)
    {
        int j1 = 0;
        boolean flag;
        if (i1 >= 0 && i1 < c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.google.android.gms.internal.do.a(flag);
        do
        {
label0:
            {
                if (j1 < b.length)
                {
                    if (i1 >= b[j1])
                    {
                        break label0;
                    }
                    j1--;
                }
                if (j1 == b.length)
                {
                    j1--;
                }
                return j1;
            }
            j1++;
        } while (true);
    }

    public long a(String s, int i1, int j1)
    {
        a(s, i1);
        return i[j1].getLong(i1 - b[j1], a.getInt(s));
    }

    public void a()
    {
        int i1 = 0;
        a = new Bundle();
        for (int j1 = 0; j1 < h.length; j1++)
        {
            a.putInt(h[j1], j1);
        }

        b = new int[i.length];
        int k1 = 0;
        for (; i1 < i.length; i1++)
        {
            b[i1] = k1;
            k1 += i[i1].getNumRows();
        }

        c = k1;
    }

    int b()
    {
        return g;
    }

    public int b(String s, int i1, int j1)
    {
        a(s, i1);
        return i[j1].getInt(i1 - b[j1], a.getInt(s));
    }

    public String c(String s, int i1, int j1)
    {
        a(s, i1);
        return i[j1].getString(i1 - b[j1], a.getInt(s));
    }

    String[] c()
    {
        return h;
    }

    public boolean d(String s, int i1, int j1)
    {
        a(s, i1);
        return Long.valueOf(i[j1].getLong(i1 - b[j1], a.getInt(s))).longValue() == 1L;
    }

    CursorWindow[] d()
    {
        return i;
    }

    public int describeContents()
    {
        return 0;
    }

    public int e()
    {
        return j;
    }

    public Uri e(String s, int i1, int j1)
    {
        String s1 = c(s, i1, j1);
        if (s1 == null)
        {
            return null;
        } else
        {
            return Uri.parse(s1);
        }
    }

    public Bundle f()
    {
        return k;
    }

    public boolean f(String s, int i1, int j1)
    {
        a(s, i1);
        return i[j1].isNull(i1 - b[j1], a.getInt(s));
    }

    public int g()
    {
        return c;
    }

    public boolean h()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = d;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        com.google.android.gms.common.data.f.a(this, parcel, i1);
    }

}
