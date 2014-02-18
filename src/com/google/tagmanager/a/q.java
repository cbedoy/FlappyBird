// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.tagmanager.a:
//            ax, bm, r, k, 
//            br, h, ad, am, 
//            ag, s, ap, an

final class q
{

    private static final q d = new q(true);
    private final ax a;
    private boolean b;
    private boolean c;

    private q()
    {
        c = false;
        a = ax.a(16);
    }

    private q(boolean flag)
    {
        c = false;
        a = ax.a(0);
        c();
    }

    static int a(bm bm1, boolean flag)
    {
        if (flag)
        {
            return 2;
        } else
        {
            return bm1.b();
        }
    }

    public static q a()
    {
        return new q();
    }

    public static Object a(k k1, bm bm1, boolean flag)
    {
        switch (r.b[bm1.ordinal()])
        {
        default:
            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");

        case 1: // '\001'
            return Double.valueOf(k1.b());

        case 2: // '\002'
            return Float.valueOf(k1.c());

        case 3: // '\003'
            return Long.valueOf(k1.e());

        case 4: // '\004'
            return Long.valueOf(k1.d());

        case 5: // '\005'
            return Integer.valueOf(k1.f());

        case 6: // '\006'
            return Long.valueOf(k1.g());

        case 7: // '\007'
            return Integer.valueOf(k1.h());

        case 8: // '\b'
            return Boolean.valueOf(k1.i());

        case 9: // '\t'
            if (flag)
            {
                return k1.k();
            } else
            {
                return k1.j();
            }

        case 10: // '\n'
            return k1.l();

        case 11: // '\013'
            return Integer.valueOf(k1.m());

        case 12: // '\f'
            return Integer.valueOf(k1.o());

        case 13: // '\r'
            return Long.valueOf(k1.p());

        case 14: // '\016'
            return Integer.valueOf(k1.q());

        case 15: // '\017'
            return Long.valueOf(k1.r());

        case 16: // '\020'
            throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");

        case 17: // '\021'
            throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");

        case 18: // '\022'
            throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
        }
    }

    private static void a(bm bm1, Object obj)
    {
        int i;
        boolean flag;
        if (obj == null)
        {
            throw new NullPointerException();
        }
        i = r.a[bm1.a().ordinal()];
        flag = false;
        i;
        JVM INSTR tableswitch 1 9: default 76
    //                   1 90
    //                   2 98
    //                   3 106
    //                   4 114
    //                   5 122
    //                   6 130
    //                   7 138
    //                   8 163
    //                   9 188;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (!flag)
        {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        } else
        {
            return;
        }
_L2:
        flag = obj instanceof Integer;
          goto _L1
_L3:
        flag = obj instanceof Long;
          goto _L1
_L4:
        flag = obj instanceof Float;
          goto _L1
_L5:
        flag = obj instanceof Double;
          goto _L1
_L6:
        flag = obj instanceof Boolean;
          goto _L1
_L7:
        flag = obj instanceof String;
          goto _L1
_L8:
        if (obj instanceof h) goto _L12; else goto _L11
_L11:
        flag3 = obj instanceof byte[];
        flag = false;
        if (!flag3) goto _L1; else goto _L12
_L12:
        flag = true;
          goto _L1
_L9:
        if (obj instanceof Integer) goto _L14; else goto _L13
_L13:
        flag2 = obj instanceof ad;
        flag = false;
        if (!flag2) goto _L1; else goto _L14
_L14:
        flag = true;
          goto _L1
_L10:
        if (obj instanceof am) goto _L16; else goto _L15
_L15:
        flag1 = obj instanceof ag;
        flag = false;
        if (!flag1) goto _L1; else goto _L16
_L16:
        flag = true;
          goto _L1
    }

    private boolean a(java.util.Map.Entry entry)
    {
label0:
        {
            s s1 = (s)entry.getKey();
            if (s1.b() != br.i)
            {
                break label0;
            }
            if (s1.c())
            {
                Iterator iterator = ((List)entry.getValue()).iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                } while (((am)iterator.next()).j());
                return false;
            }
            Object obj = entry.getValue();
            if (obj instanceof am)
            {
                if (!((am)obj).j())
                {
                    return false;
                }
            } else
            if (obj instanceof ag)
            {
                return true;
            } else
            {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
        }
        return true;
    }

    public static q b()
    {
        return d;
    }

    private void b(java.util.Map.Entry entry)
    {
        s s1 = (s)entry.getKey();
        Object obj = entry.getValue();
        if (obj instanceof ag)
        {
            obj = ((ag)obj).a();
        }
        if (s1.c())
        {
            Object obj3 = a(s1);
            if (obj3 == null)
            {
                a.a(s1, new ArrayList((List)obj));
                return;
            } else
            {
                ((List)obj3).addAll((List)obj);
                return;
            }
        }
        if (s1.b() == br.i)
        {
            Object obj1 = a(s1);
            if (obj1 == null)
            {
                a.a(s1, obj);
                return;
            }
            Object obj2;
            if (obj1 instanceof ap)
            {
                obj2 = s1.a((ap)obj1, (ap)obj);
            } else
            {
                obj2 = s1.a(((am)obj1).n(), (am)obj).h();
            }
            a.a(s1, obj2);
            return;
        } else
        {
            a.a(s1, obj);
            return;
        }
    }

    public Object a(s s1)
    {
        Object obj = a.get(s1);
        if (obj instanceof ag)
        {
            obj = ((ag)obj).a();
        }
        return obj;
    }

    public void a(q q1)
    {
        for (int i = 0; i < q1.a.c(); i++)
        {
            b(q1.a.b(i));
        }

        for (Iterator iterator = q1.a.d().iterator(); iterator.hasNext(); b((java.util.Map.Entry)iterator.next())) { }
    }

    public void a(s s1, Object obj)
    {
        if (s1.c())
        {
            if (!(obj instanceof List))
            {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arraylist = new ArrayList();
            arraylist.addAll((List)obj);
            Object obj1;
            for (Iterator iterator = arraylist.iterator(); iterator.hasNext(); a(s1.a(), obj1))
            {
                obj1 = iterator.next();
            }

            obj = arraylist;
        } else
        {
            a(s1.a(), obj);
        }
        if (obj instanceof ag)
        {
            c = true;
        }
        a.a(s1, obj);
    }

    public void b(s s1, Object obj)
    {
        if (!s1.c())
        {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        a(s1.a(), obj);
        Object obj1 = a(s1);
        Object obj2;
        if (obj1 == null)
        {
            obj2 = new ArrayList();
            a.a(s1, obj2);
        } else
        {
            obj2 = (List)obj1;
        }
        ((List) (obj2)).add(obj);
    }

    public void c()
    {
        if (b)
        {
            return;
        } else
        {
            a.a();
            b = true;
            return;
        }
    }

    public Object clone()
    {
        return d();
    }

    public q d()
    {
        q q1 = a();
        for (int i = 0; i < a.c(); i++)
        {
            java.util.Map.Entry entry1 = a.b(i);
            q1.a((s)entry1.getKey(), entry1.getValue());
        }

        java.util.Map.Entry entry;
        for (Iterator iterator = a.d().iterator(); iterator.hasNext(); q1.a((s)entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        q1.c = c;
        return q1;
    }

    public boolean e()
    {
        for (int i = 0; i < a.c(); i++)
        {
            if (!a(a.b(i)))
            {
                return false;
            }
        }

        for (Iterator iterator = a.d().iterator(); iterator.hasNext();)
        {
            if (!a((java.util.Map.Entry)iterator.next()))
            {
                return false;
            }
        }

        return true;
    }

}
