// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            n, do, l, o

public abstract class ae
{

    public ae()
    {
    }

    private void a(StringBuilder stringbuilder, a a1, Object obj)
    {
        if (a1.b() == 11)
        {
            stringbuilder.append(((ae)a1.h().cast(obj)).toString());
            return;
        }
        if (a1.b() == 7)
        {
            stringbuilder.append("\"");
            stringbuilder.append(n.a((String)obj));
            stringbuilder.append("\"");
            return;
        } else
        {
            stringbuilder.append(obj);
            return;
        }
    }

    private void a(StringBuilder stringbuilder, a a1, ArrayList arraylist)
    {
        stringbuilder.append("[");
        int i = 0;
        for (int j = arraylist.size(); i < j; i++)
        {
            if (i > 0)
            {
                stringbuilder.append(",");
            }
            Object obj = arraylist.get(i);
            if (obj != null)
            {
                a(stringbuilder, a1, obj);
            }
        }

        stringbuilder.append("]");
    }

    protected Object a(a a1, Object obj)
    {
        if (a.a(a1) != null)
        {
            obj = a1.a(obj);
        }
        return obj;
    }

    protected abstract Object a(String s);

    protected boolean a(a a1)
    {
        if (a1.d() == 11)
        {
            if (a1.e())
            {
                return d(a1.f());
            } else
            {
                return c(a1.f());
            }
        } else
        {
            return b(a1.f());
        }
    }

    protected Object b(a a1)
    {
        boolean flag = true;
        String s = a1.f();
        if (a1.h() != null)
        {
            HashMap hashmap;
            if (a(a1.f()) != null)
            {
                flag = false;
            }
            com.google.android.gms.internal.do.a(flag, (new StringBuilder()).append("Concrete field shouldn't be value object: ").append(a1.f()).toString());
            if (a1.e())
            {
                hashmap = d();
            } else
            {
                hashmap = c();
            }
            if (hashmap != null)
            {
                return hashmap.get(s);
            }
            Object obj;
            try
            {
                String s1 = (new StringBuilder()).append("get").append(Character.toUpperCase(s.charAt(0))).append(s.substring(1)).toString();
                obj = getClass().getMethod(s1, new Class[0]).invoke(this, new Object[0]);
            }
            catch (Exception exception)
            {
                throw new RuntimeException(exception);
            }
            return obj;
        } else
        {
            return a(a1.f());
        }
    }

    public abstract HashMap b();

    protected abstract boolean b(String s);

    public HashMap c()
    {
        return null;
    }

    protected boolean c(String s)
    {
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    public HashMap d()
    {
        return null;
    }

    protected boolean d(String s)
    {
        throw new UnsupportedOperationException("Concrete type arrays not supported");
    }

    public String toString()
    {
        HashMap hashmap = b();
        StringBuilder stringbuilder = new StringBuilder(100);
        Iterator iterator = hashmap.keySet().iterator();
label0:
        do
        {
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s = (String)iterator.next();
                a a1 = (a)hashmap.get(s);
                if (a(a1))
                {
                    Object obj = a(a1, b(a1));
                    if (stringbuilder.length() == 0)
                    {
                        stringbuilder.append("{");
                    } else
                    {
                        stringbuilder.append(",");
                    }
                    stringbuilder.append("\"").append(s).append("\":");
                    if (obj == null)
                    {
                        stringbuilder.append("null");
                    } else
                    {
                        switch (a1.d())
                        {
                        default:
                            if (a1.c())
                            {
                                a(stringbuilder, a1, (ArrayList)obj);
                            } else
                            {
                                a(stringbuilder, a1, obj);
                            }
                            break;

                        case 8: // '\b'
                            stringbuilder.append("\"").append(l.a((byte[])(byte[])obj)).append("\"");
                            break;

                        case 9: // '\t'
                            stringbuilder.append("\"").append(l.b((byte[])(byte[])obj)).append("\"");
                            break;

                        case 10: // '\n'
                            o.a(stringbuilder, (HashMap)obj);
                            break;
                        }
                        continue label0;
                    }
                }
            } while (true);
            if (stringbuilder.length() > 0)
            {
                stringbuilder.append("}");
            } else
            {
                stringbuilder.append("{}");
            }
            return stringbuilder.toString();
        } while (true);
    }

    private class a
        implements SafeParcelable
    {

        public static final e CREATOR = new e();
        protected final int a;
        protected final boolean b;
        protected final int c;
        protected final boolean d;
        protected final String e;
        protected final int f;
        protected final Class g;
        protected final String h;
        private final int i;
        private ah j;
        private d k;

        public static a a(String s, int i1)
        {
            return new a(0, false, 0, false, s, i1, null, null);
        }

        public static a a(String s, int i1, d d1, boolean flag)
        {
            return new a(d1.c(), flag, d1.d(), false, s, i1, null, d1);
        }

        public static a a(String s, int i1, Class class1)
        {
            return new a(11, false, 11, false, s, i1, class1, null);
        }

        static d a(a a1)
        {
            return a1.k;
        }

        public static a b(String s, int i1)
        {
            return new a(4, false, 4, false, s, i1, null, null);
        }

        public static a b(String s, int i1, Class class1)
        {
            return new a(11, true, 11, true, s, i1, class1, null);
        }

        public static a c(String s, int i1)
        {
            return new a(6, false, 6, false, s, i1, null, null);
        }

        public static a d(String s, int i1)
        {
            return new a(7, false, 7, false, s, i1, null, null);
        }

        public static a e(String s, int i1)
        {
            return new a(7, true, 7, true, s, i1, null, null);
        }

        public int a()
        {
            return i;
        }

        public Object a(Object obj)
        {
            return k.a(obj);
        }

        public void a(ah ah1)
        {
            j = ah1;
        }

        public int b()
        {
            return a;
        }

        public boolean c()
        {
            return b;
        }

        public int d()
        {
            return c;
        }

        public int describeContents()
        {
            e _tmp = CREATOR;
            return 0;
        }

        public boolean e()
        {
            return d;
        }

        public String f()
        {
            return e;
        }

        public int g()
        {
            return f;
        }

        public Class h()
        {
            return g;
        }

        String i()
        {
            if (h == null)
            {
                return null;
            } else
            {
                return h;
            }
        }

        public boolean j()
        {
            return k != null;
        }

        z k()
        {
            if (k == null)
            {
                return null;
            } else
            {
                return z.a(k);
            }
        }

        public HashMap l()
        {
            com.google.android.gms.internal.do.a(h);
            com.google.android.gms.internal.do.a(j);
            return j.a(h);
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("Field\n");
            stringbuilder.append("            versionCode=").append(i).append('\n');
            stringbuilder.append("                 typeIn=").append(a).append('\n');
            stringbuilder.append("            typeInArray=").append(b).append('\n');
            stringbuilder.append("                typeOut=").append(c).append('\n');
            stringbuilder.append("           typeOutArray=").append(d).append('\n');
            stringbuilder.append("        outputFieldName=").append(e).append('\n');
            stringbuilder.append("      safeParcelFieldId=").append(f).append('\n');
            stringbuilder.append("       concreteTypeName=").append(i()).append('\n');
            if (h() != null)
            {
                stringbuilder.append("     concreteType.class=").append(h().getCanonicalName()).append('\n');
            }
            StringBuilder stringbuilder1 = stringbuilder.append("          converterName=");
            String s;
            if (k == null)
            {
                s = "null";
            } else
            {
                s = k.getClass().getCanonicalName();
            }
            stringbuilder1.append(s).append('\n');
            return stringbuilder.toString();
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            e _tmp = CREATOR;
            com.google.android.gms.internal.e.a(this, parcel, i1);
        }


        a(int i1, int j1, boolean flag, int k1, boolean flag1, String s, int l1, 
                String s1, z z1)
        {
            i = i1;
            a = j1;
            b = flag;
            c = k1;
            d = flag1;
            e = s;
            f = l1;
            if (s1 == null)
            {
                g = null;
                h = null;
            } else
            {
                g = com/google/android/gms/internal/ak;
                h = s1;
            }
            if (z1 == null)
            {
                k = null;
                return;
            } else
            {
                k = z1.c();
                return;
            }
        }

        protected a(int i1, boolean flag, int j1, boolean flag1, String s, int k1, Class class1, 
                d d1)
        {
            i = 1;
            a = i1;
            b = flag;
            c = j1;
            d = flag1;
            e = s;
            f = k1;
            g = class1;
            if (class1 == null)
            {
                h = null;
            } else
            {
                h = class1.getCanonicalName();
            }
            k = d1;
        }
    }

}
