// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.tagmanager:
//            f

public class e
{

    public static final Object a = new Object();
    private final ConcurrentHashMap b = new ConcurrentHashMap();
    private final Map c = new HashMap();
    private final ReentrantLock d = new ReentrantLock();
    private final LinkedList e = new LinkedList();

    e()
    {
    }

    void a(f f)
    {
        b.put(f, Integer.valueOf(0));
    }

}
