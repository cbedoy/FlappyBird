// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.tagmanager;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;

// Referenced classes of package com.google.tagmanager:
//            i, r

public class PreviewActivity extends Activity
{

    public PreviewActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        i.c("Preview activity");
        android.net.Uri uri = getIntent().getData();
        if (!r.a(this).a(uri))
        {
            i.b((new StringBuilder()).append("Cannot preview the app with the uri: ").append(uri).toString());
            return;
        }
        Intent intent = getPackageManager().getLaunchIntentForPackage(getPackageName());
        if (intent != null)
        {
            try
            {
                i.c((new StringBuilder()).append("Invoke the launch activity for package name: ").append(getPackageName()).toString());
                startActivity(intent);
                return;
            }
            catch (Exception exception)
            {
                i.a((new StringBuilder()).append("Calling preview threw an exception: ").append(exception.getMessage()).toString());
            }
            return;
        }
        i.c((new StringBuilder()).append("No launch activity found for package name: ").append(getPackageName()).toString());
        return;
    }
}
