// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.b;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            ae, i, do, ah, 
//            n, l, o, k

public class ak extends ae
    implements SafeParcelable
{

    public static final i CREATOR = new i();
    private final int a;
    private final Parcel b;
    private final int c = 2;
    private final ah d;
    private final String e;
    private int f;
    private int g;

    ak(int j, Parcel parcel, ah ah1)
    {
        a = j;
        b = (Parcel)com.google.android.gms.internal.do.a(parcel);
        d = ah1;
        if (d == null)
        {
            e = null;
        } else
        {
            e = d.d();
        }
        f = 2;
    }

    public static HashMap a(Bundle bundle)
    {
        HashMap hashmap = new HashMap();
        String s;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); hashmap.put(s, bundle.getString(s)))
        {
            s = (String)iterator.next();
        }

        return hashmap;
    }

    private static HashMap a(HashMap hashmap)
    {
        HashMap hashmap1 = new HashMap();
        java.util.Map.Entry entry;
        for (Iterator iterator = hashmap.entrySet().iterator(); iterator.hasNext(); hashmap1.put(Integer.valueOf(((ae.a)entry.getValue()).g()), entry))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return hashmap1;
    }

    private void a(StringBuilder stringbuilder, int j, Object obj)
    {
        switch (j)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown type = ").append(j).toString());

        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            stringbuilder.append(obj);
            return;

        case 7: // '\007'
            stringbuilder.append("\"").append(com.google.android.gms.internal.n.a(obj.toString())).append("\"");
            return;

        case 8: // '\b'
            stringbuilder.append("\"").append(com.google.android.gms.internal.l.a((byte[])(byte[])obj)).append("\"");
            return;

        case 9: // '\t'
            stringbuilder.append("\"").append(com.google.android.gms.internal.l.b((byte[])(byte[])obj));
            stringbuilder.append("\"");
            return;

        case 10: // '\n'
            com.google.android.gms.internal.o.a(stringbuilder, (HashMap)obj);
            return;

        case 11: // '\013'
            throw new IllegalArgumentException("Method does not accept concrete type.");
        }
    }

    private void a(StringBuilder stringbuilder, ae.a a1, Parcel parcel, int j)
    {
        switch (a1.d())
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("Unknown field out type = ").append(a1.d()).toString());

        case 0: // '\0'
            a(stringbuilder, a1, a(a1, Integer.valueOf(com.google.android.gms.common.internal.safeparcel.a.f(parcel, j))));
            return;

        case 1: // '\001'
            a(stringbuilder, a1, a(a1, com.google.android.gms.common.internal.safeparcel.a.h(parcel, j)));
            return;

        case 2: // '\002'
            a(stringbuilder, a1, a(a1, Long.valueOf(com.google.android.gms.common.internal.safeparcel.a.g(parcel, j))));
            return;

        case 3: // '\003'
            a(stringbuilder, a1, a(a1, Float.valueOf(com.google.android.gms.common.internal.safeparcel.a.i(parcel, j))));
            return;

        case 4: // '\004'
            a(stringbuilder, a1, a(a1, Double.valueOf(com.google.android.gms.common.internal.safeparcel.a.j(parcel, j))));
            return;

        case 5: // '\005'
            a(stringbuilder, a1, a(a1, com.google.android.gms.common.internal.safeparcel.a.k(parcel, j)));
            return;

        case 6: // '\006'
            a(stringbuilder, a1, a(a1, Boolean.valueOf(com.google.android.gms.common.internal.safeparcel.a.c(parcel, j))));
            return;

        case 7: // '\007'
            a(stringbuilder, a1, a(a1, com.google.android.gms.common.internal.safeparcel.a.l(parcel, j)));
            return;

        case 8: // '\b'
        case 9: // '\t'
            a(stringbuilder, a1, a(a1, com.google.android.gms.common.internal.safeparcel.a.o(parcel, j)));
            return;

        case 10: // '\n'
            a(stringbuilder, a1, a(a1, a(com.google.android.gms.common.internal.safeparcel.a.n(parcel, j))));
            return;

        case 11: // '\013'
            throw new IllegalArgumentException("Method does not accept concrete type.");
        }
    }

    private void a(StringBuilder stringbuilder, ae.a a1, Object obj)
    {
        if (a1.c())
        {
            a(stringbuilder, a1, (ArrayList)obj);
            return;
        } else
        {
            a(stringbuilder, a1.b(), obj);
            return;
        }
    }

    private void a(StringBuilder stringbuilder, ae.a a1, ArrayList arraylist)
    {
        stringbuilder.append("[");
        int j = arraylist.size();
        for (int i1 = 0; i1 < j; i1++)
        {
            if (i1 != 0)
            {
                stringbuilder.append(",");
            }
            a(stringbuilder, a1.b(), arraylist.get(i1));
        }

        stringbuilder.append("]");
    }

    private void a(StringBuilder stringbuilder, String s, ae.a a1, Parcel parcel, int j)
    {
        stringbuilder.append("\"").append(s).append("\":");
        if (a1.j())
        {
            a(stringbuilder, a1, parcel, j);
            return;
        } else
        {
            b(stringbuilder, a1, parcel, j);
            return;
        }
    }

    private void a(StringBuilder stringbuilder, HashMap hashmap, Parcel parcel)
    {
        HashMap hashmap1 = a(hashmap);
        stringbuilder.append('{');
        int j = com.google.android.gms.common.internal.safeparcel.a.b(parcel);
        boolean flag = false;
        do
        {
            if (parcel.dataPosition() >= j)
            {
                break;
            }
            int i1 = com.google.android.gms.common.internal.safeparcel.a.a(parcel);
            java.util.Map.Entry entry = (java.util.Map.Entry)hashmap1.get(Integer.valueOf(com.google.android.gms.common.internal.safeparcel.a.a(i1)));
            if (entry != null)
            {
                if (flag)
                {
                    stringbuilder.append(",");
                }
                a(stringbuilder, (String)entry.getKey(), (ae.a)entry.getValue(), parcel, i1);
                flag = true;
            }
        } while (true);
        if (parcel.dataPosition() != j)
        {
            throw new b((new StringBuilder()).append("Overread allowed size end=").append(j).toString(), parcel);
        } else
        {
            stringbuilder.append('}');
            return;
        }
    }

    private void b(StringBuilder stringbuilder, ae.a a1, Parcel parcel, int j)
    {
        if (!a1.e()) goto _L2; else goto _L1
_L1:
        stringbuilder.append("[");
        a1.d();
        JVM INSTR tableswitch 0 11: default 80
    //                   0 91
    //                   1 109
    //                   2 122
    //                   3 135
    //                   4 148
    //                   5 161
    //                   6 174
    //                   7 187
    //                   8 200
    //                   9 200
    //                   10 200
    //                   11 211;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L12 _L12 _L13
_L3:
        throw new IllegalStateException("Unknown field type out.");
_L4:
        com.google.android.gms.internal.k.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.q(parcel, j));
_L14:
        stringbuilder.append("]");
        return;
_L5:
        com.google.android.gms.internal.k.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.s(parcel, j));
        continue; /* Loop/switch isn't completed */
_L6:
        com.google.android.gms.internal.k.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.r(parcel, j));
        continue; /* Loop/switch isn't completed */
_L7:
        com.google.android.gms.internal.k.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.t(parcel, j));
        continue; /* Loop/switch isn't completed */
_L8:
        com.google.android.gms.internal.k.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.u(parcel, j));
        continue; /* Loop/switch isn't completed */
_L9:
        com.google.android.gms.internal.k.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.v(parcel, j));
        continue; /* Loop/switch isn't completed */
_L10:
        com.google.android.gms.internal.k.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.p(parcel, j));
        continue; /* Loop/switch isn't completed */
_L11:
        com.google.android.gms.internal.k.a(stringbuilder, com.google.android.gms.common.internal.safeparcel.a.w(parcel, j));
        if (true) goto _L14; else goto _L12
_L12:
        throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
_L13:
        Parcel aparcel[] = com.google.android.gms.common.internal.safeparcel.a.z(parcel, j);
        int i1 = aparcel.length;
        int j1 = 0;
        while (j1 < i1) 
        {
            if (j1 > 0)
            {
                stringbuilder.append(",");
            }
            aparcel[j1].setDataPosition(0);
            a(stringbuilder, a1.l(), aparcel[j1]);
            j1++;
        }
        if (true) goto _L14; else goto _L2
_L2:
        switch (a1.d())
        {
        default:
            throw new IllegalStateException("Unknown field type out");

        case 0: // '\0'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.f(parcel, j));
            return;

        case 1: // '\001'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.h(parcel, j));
            return;

        case 2: // '\002'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.g(parcel, j));
            return;

        case 3: // '\003'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.i(parcel, j));
            return;

        case 4: // '\004'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.j(parcel, j));
            return;

        case 5: // '\005'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.k(parcel, j));
            return;

        case 6: // '\006'
            stringbuilder.append(com.google.android.gms.common.internal.safeparcel.a.c(parcel, j));
            return;

        case 7: // '\007'
            String s1 = com.google.android.gms.common.internal.safeparcel.a.l(parcel, j);
            stringbuilder.append("\"").append(com.google.android.gms.internal.n.a(s1)).append("\"");
            return;

        case 8: // '\b'
            byte abyte1[] = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j);
            stringbuilder.append("\"").append(com.google.android.gms.internal.l.a(abyte1)).append("\"");
            return;

        case 9: // '\t'
            byte abyte0[] = com.google.android.gms.common.internal.safeparcel.a.o(parcel, j);
            stringbuilder.append("\"").append(com.google.android.gms.internal.l.b(abyte0));
            stringbuilder.append("\"");
            return;

        case 10: // '\n'
            Bundle bundle = com.google.android.gms.common.internal.safeparcel.a.n(parcel, j);
            Set set = bundle.keySet();
            set.size();
            stringbuilder.append("{");
            Iterator iterator = set.iterator();
            for (boolean flag = true; iterator.hasNext(); flag = false)
            {
                String s = (String)iterator.next();
                if (!flag)
                {
                    stringbuilder.append(",");
                }
                stringbuilder.append("\"").append(s).append("\"");
                stringbuilder.append(":");
                stringbuilder.append("\"").append(com.google.android.gms.internal.n.a(bundle.getString(s))).append("\"");
            }

            stringbuilder.append("}");
            return;

        case 11: // '\013'
            Parcel parcel1 = com.google.android.gms.common.internal.safeparcel.a.y(parcel, j);
            parcel1.setDataPosition(0);
            a(stringbuilder, a1.l(), parcel1);
            return;
        }
    }

    public int a()
    {
        return a;
    }

    protected Object a(String s)
    {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public HashMap b()
    {
        if (d == null)
        {
            return null;
        } else
        {
            return d.a(e);
        }
    }

    protected boolean b(String s)
    {
        throw new UnsupportedOperationException("Converting to JSON does not require this method.");
    }

    public int describeContents()
    {
        i _tmp = CREATOR;
        return 0;
    }

    public Parcel e()
    {
        f;
        JVM INSTR tableswitch 0 1: default 28
    //                   0 33
    //                   1 63;
           goto _L1 _L2 _L3
_L1:
        return b;
_L2:
        g = com.google.android.gms.common.internal.safeparcel.c.a(b);
        com.google.android.gms.common.internal.safeparcel.c.a(b, g);
        f = 2;
        continue; /* Loop/switch isn't completed */
_L3:
        com.google.android.gms.common.internal.safeparcel.c.a(b, g);
        f = 2;
        if (true) goto _L1; else goto _L4
_L4:
    }

    ah f()
    {
        switch (c)
        {
        default:
            throw new IllegalStateException((new StringBuilder()).append("Invalid creation type: ").append(c).toString());

        case 0: // '\0'
            return null;

        case 1: // '\001'
            return d;

        case 2: // '\002'
            return d;
        }
    }

    public String toString()
    {
        com.google.android.gms.internal.do.a(d, "Cannot convert to JSON on client side.");
        Parcel parcel = e();
        parcel.setDataPosition(0);
        StringBuilder stringbuilder = new StringBuilder(100);
        a(stringbuilder, d.a(e), parcel);
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        i _tmp = CREATOR;
        com.google.android.gms.internal.i.a(this, parcel, j);
    }

}
