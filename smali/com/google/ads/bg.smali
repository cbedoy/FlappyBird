.class Lcom/google/ads/bg;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/google/ads/bk;

.field final synthetic b:Landroid/view/View;

.field final synthetic c:Lcom/google/ads/bh;

.field final synthetic d:Lcom/google/ads/bd;


# direct methods
.method constructor <init>(Lcom/google/ads/bd;Lcom/google/ads/bk;Landroid/view/View;Lcom/google/ads/bh;)V
    .locals 0

    iput-object p1, p0, Lcom/google/ads/bg;->d:Lcom/google/ads/bd;

    iput-object p2, p0, Lcom/google/ads/bg;->a:Lcom/google/ads/bk;

    iput-object p3, p0, Lcom/google/ads/bg;->b:Landroid/view/View;

    iput-object p4, p0, Lcom/google/ads/bg;->c:Lcom/google/ads/bh;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    iget-object v0, p0, Lcom/google/ads/bg;->d:Lcom/google/ads/bd;

    iget-object v1, p0, Lcom/google/ads/bg;->a:Lcom/google/ads/bk;

    invoke-static {v0, v1}, Lcom/google/ads/bd;->a(Lcom/google/ads/bd;Lcom/google/ads/bk;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Trying to switch GWAdNetworkAmbassadors, but GWController().destroy() has been called. Destroying the new ambassador and terminating mediation."

    invoke-static {v0}, Lcom/google/ads/util/g;->a(Ljava/lang/String;)V

    :goto_0
    return-void

    :cond_0
    iget-object v0, p0, Lcom/google/ads/bg;->d:Lcom/google/ads/bd;

    invoke-static {v0}, Lcom/google/ads/bd;->b(Lcom/google/ads/bd;)Lcom/google/ads/a/w;

    move-result-object v0

    iget-object v1, p0, Lcom/google/ads/bg;->b:Landroid/view/View;

    iget-object v2, p0, Lcom/google/ads/bg;->a:Lcom/google/ads/bk;

    iget-object v3, p0, Lcom/google/ads/bg;->c:Lcom/google/ads/bh;

    const/4 v4, 0x0

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/ads/a/w;->a(Landroid/view/View;Lcom/google/ads/bk;Lcom/google/ads/bh;Z)V

    goto :goto_0
.end method
