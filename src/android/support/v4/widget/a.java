// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;


// Referenced classes of package android.support.v4.widget:
//            ContentLoadingProgressBar

class a
    implements Runnable
{

    final ContentLoadingProgressBar a;

    a(ContentLoadingProgressBar contentloadingprogressbar)
    {
        a = contentloadingprogressbar;
        super();
    }

    public void run()
    {
        ContentLoadingProgressBar.a(a, false);
        ContentLoadingProgressBar.a(a, -1L);
        a.setVisibility(8);
    }
}
