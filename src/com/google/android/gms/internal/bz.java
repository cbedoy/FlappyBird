// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.plus.a.a.b;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            ae, bk, bx

public final class bz extends ae
    implements SafeParcelable, b
{

    public static final bk CREATOR = new bk();
    private static final HashMap a;
    private final Set b;
    private final int c;
    private String d;
    private bx e;
    private String f;
    private bx g;
    private String h;

    public bz()
    {
        c = 1;
        b = new HashSet();
    }

    bz(Set set, int i1, String s, bx bx1, String s1, bx bx2, String s2)
    {
        b = set;
        c = i1;
        d = s;
        e = bx1;
        f = s1;
        g = bx2;
        h = s2;
    }

    public Object a()
    {
        return l();
    }

    protected Object a(String s)
    {
        return null;
    }

    protected boolean a(ae.a a1)
    {
        return b.contains(Integer.valueOf(a1.g()));
    }

    protected Object b(ae.a a1)
    {
        switch (a1.g())
        {
        case 3: // '\003'
        default:
            throw new IllegalStateException((new StringBuilder()).append("Unknown safe parcelable id=").append(a1.g()).toString());

        case 2: // '\002'
            return d;

        case 4: // '\004'
            return e;

        case 5: // '\005'
            return f;

        case 6: // '\006'
            return g;

        case 7: // '\007'
            return h;
        }
    }

    public HashMap b()
    {
        return a;
    }

    protected boolean b(String s)
    {
        return false;
    }

    public int describeContents()
    {
        bk _tmp = CREATOR;
        return 0;
    }

    Set e()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
label0:
        {
            if (!(obj instanceof bz))
            {
                return false;
            }
            if (this == obj)
            {
                return true;
            }
            bz bz1 = (bz)obj;
            ae.a a1;
label1:
            do
            {
                for (Iterator iterator = a.values().iterator(); iterator.hasNext();)
                {
                    a1 = (ae.a)iterator.next();
                    if (!a(a1))
                    {
                        continue label1;
                    }
                    if (bz1.a(a1))
                    {
                        if (!b(a1).equals(bz1.b(a1)))
                        {
                            return false;
                        }
                    } else
                    {
                        return false;
                    }
                }

                break label0;
            } while (!bz1.a(a1));
            return false;
        }
        return true;
    }

    int f()
    {
        return c;
    }

    public String g()
    {
        return d;
    }

    bx h()
    {
        return e;
    }

    public int hashCode()
    {
        Iterator iterator = a.values().iterator();
        int i1 = 0;
        while (iterator.hasNext()) 
        {
            ae.a a1 = (ae.a)iterator.next();
            int j1;
            if (a(a1))
            {
                j1 = i1 + a1.g() + b(a1).hashCode();
            } else
            {
                j1 = i1;
            }
            i1 = j1;
        }
        return i1;
    }

    public String i()
    {
        return f;
    }

    bx j()
    {
        return g;
    }

    public String k()
    {
        return h;
    }

    public bz l()
    {
        return this;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        bk _tmp = CREATOR;
        bk.a(this, parcel, i1);
    }

    static 
    {
        a = new HashMap();
        a.put("id", ae.a.d("id", 2));
        a.put("result", ae.a.a("result", 4, com/google/android/gms/internal/bx));
        a.put("startDate", ae.a.d("startDate", 5));
        a.put("target", ae.a.a("target", 6, com/google/android/gms/internal/bx));
        a.put("type", ae.a.d("type", 7));
    }
}
