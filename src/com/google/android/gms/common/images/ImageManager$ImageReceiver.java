// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageManager, c

final class  extends ResultReceiver
{

    boolean a;
    final ImageManager b;
    private final Uri c;
    private final ArrayList d;

    static ArrayList a( )
    {
        return .d;
    }

    public void onReceiveResult(int i, Bundle bundle)
    {
        ParcelFileDescriptor parcelfiledescriptor = (ParcelFileDescriptor)bundle.getParcelable("com.google.android.gms.extra.fileDescriptor");
        ImageManager.d(b).execute(new c(b, c, parcelfiledescriptor));
    }
}
