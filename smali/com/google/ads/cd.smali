.class public Lcom/google/ads/cd;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/ads/bu;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(Ljava/util/HashMap;Ljava/lang/String;Lcom/google/ads/util/ae;)V
    .locals 2

    :try_start_0
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/google/ads/util/ae;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Could not parse \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\" constant."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/ads/util/g;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private b(Ljava/util/HashMap;Ljava/lang/String;Lcom/google/ads/util/ae;)V
    .locals 2

    :try_start_0
    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p3, v0}, Lcom/google/ads/util/ae;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_0
    :goto_0
    return-void

    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Could not parse \""

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "\" constant."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/ads/util/g;->a(Ljava/lang/String;)V

    goto :goto_0
.end method

.method private c(Ljava/util/HashMap;Ljava/lang/String;Lcom/google/ads/util/ae;)V
    .locals 2

    invoke-virtual {p1, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {p3, v0}, Lcom/google/ads/util/ae;->a(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public a(Lcom/google/ads/a/w;Ljava/util/HashMap;Landroid/webkit/WebView;)V
    .locals 8

    const/4 v4, 0x0

    const/4 v3, 0x1

    invoke-virtual {p1}, Lcom/google/ads/a/w;->h()Lcom/google/ads/bt;

    move-result-object v5

    iget-object v0, v5, Lcom/google/ads/bt;->d:Lcom/google/ads/util/ad;

    invoke-virtual {v0}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/ads/br;

    iget-object v0, v0, Lcom/google/ads/br;->b:Lcom/google/ads/util/ad;

    invoke-virtual {v0}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/ads/bs;

    const-string v1, "as_domains"

    iget-object v2, v0, Lcom/google/ads/bs;->a:Lcom/google/ads/util/ae;

    invoke-direct {p0, p2, v1, v2}, Lcom/google/ads/cd;->c(Ljava/util/HashMap;Ljava/lang/String;Lcom/google/ads/util/ae;)V

    const-string v1, "bad_ad_report_path"

    iget-object v2, v0, Lcom/google/ads/bs;->h:Lcom/google/ads/util/ae;

    invoke-direct {p0, p2, v1, v2}, Lcom/google/ads/cd;->c(Ljava/util/HashMap;Ljava/lang/String;Lcom/google/ads/util/ae;)V

    const-string v1, "min_hwa_banner"

    iget-object v2, v0, Lcom/google/ads/bs;->b:Lcom/google/ads/util/ae;

    invoke-direct {p0, p2, v1, v2}, Lcom/google/ads/cd;->a(Ljava/util/HashMap;Ljava/lang/String;Lcom/google/ads/util/ae;)V

    const-string v1, "min_hwa_activation_overlay"

    iget-object v2, v0, Lcom/google/ads/bs;->c:Lcom/google/ads/util/ae;

    invoke-direct {p0, p2, v1, v2}, Lcom/google/ads/cd;->a(Ljava/util/HashMap;Ljava/lang/String;Lcom/google/ads/util/ae;)V

    const-string v1, "min_hwa_overlay"

    iget-object v2, v0, Lcom/google/ads/bs;->d:Lcom/google/ads/util/ae;

    invoke-direct {p0, p2, v1, v2}, Lcom/google/ads/cd;->a(Ljava/util/HashMap;Ljava/lang/String;Lcom/google/ads/util/ae;)V

    const-string v1, "mraid_banner_path"

    iget-object v2, v0, Lcom/google/ads/bs;->e:Lcom/google/ads/util/ae;

    invoke-direct {p0, p2, v1, v2}, Lcom/google/ads/cd;->c(Ljava/util/HashMap;Ljava/lang/String;Lcom/google/ads/util/ae;)V

    const-string v1, "mraid_expanded_banner_path"

    iget-object v2, v0, Lcom/google/ads/bs;->f:Lcom/google/ads/util/ae;

    invoke-direct {p0, p2, v1, v2}, Lcom/google/ads/cd;->c(Ljava/util/HashMap;Ljava/lang/String;Lcom/google/ads/util/ae;)V

    const-string v1, "mraid_interstitial_path"

    iget-object v2, v0, Lcom/google/ads/bs;->g:Lcom/google/ads/util/ae;

    invoke-direct {p0, p2, v1, v2}, Lcom/google/ads/cd;->c(Ljava/util/HashMap;Ljava/lang/String;Lcom/google/ads/util/ae;)V

    const-string v1, "ac_max_size"

    iget-object v2, v0, Lcom/google/ads/bs;->i:Lcom/google/ads/util/ae;

    invoke-direct {p0, p2, v1, v2}, Lcom/google/ads/cd;->b(Ljava/util/HashMap;Ljava/lang/String;Lcom/google/ads/util/ae;)V

    const-string v1, "ac_padding"

    iget-object v2, v0, Lcom/google/ads/bs;->j:Lcom/google/ads/util/ae;

    invoke-direct {p0, p2, v1, v2}, Lcom/google/ads/cd;->b(Ljava/util/HashMap;Ljava/lang/String;Lcom/google/ads/util/ae;)V

    const-string v1, "ac_total_quota"

    iget-object v2, v0, Lcom/google/ads/bs;->k:Lcom/google/ads/util/ae;

    invoke-direct {p0, p2, v1, v2}, Lcom/google/ads/cd;->b(Ljava/util/HashMap;Ljava/lang/String;Lcom/google/ads/util/ae;)V

    const-string v1, "db_total_quota"

    iget-object v2, v0, Lcom/google/ads/bs;->l:Lcom/google/ads/util/ae;

    invoke-direct {p0, p2, v1, v2}, Lcom/google/ads/cd;->b(Ljava/util/HashMap;Ljava/lang/String;Lcom/google/ads/util/ae;)V

    const-string v1, "db_quota_per_origin"

    iget-object v2, v0, Lcom/google/ads/bs;->m:Lcom/google/ads/util/ae;

    invoke-direct {p0, p2, v1, v2}, Lcom/google/ads/cd;->b(Ljava/util/HashMap;Ljava/lang/String;Lcom/google/ads/util/ae;)V

    const-string v1, "db_quota_step_size"

    iget-object v2, v0, Lcom/google/ads/bs;->n:Lcom/google/ads/util/ae;

    invoke-direct {p0, p2, v1, v2}, Lcom/google/ads/cd;->b(Ljava/util/HashMap;Ljava/lang/String;Lcom/google/ads/util/ae;)V

    invoke-virtual {p1}, Lcom/google/ads/a/w;->k()Lcom/google/ads/a/e;

    move-result-object v2

    sget v1, Lcom/google/ads/util/AdUtil;->a:I

    const/16 v6, 0xb

    if-lt v1, v6, :cond_0

    invoke-virtual {v2}, Lcom/google/ads/a/e;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    invoke-static {v1, v5}, Lcom/google/ads/util/p;->a(Landroid/webkit/WebSettings;Lcom/google/ads/bt;)V

    invoke-virtual {p3}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;

    move-result-object v1

    invoke-static {v1, v5}, Lcom/google/ads/util/p;->a(Landroid/webkit/WebSettings;Lcom/google/ads/bt;)V

    :cond_0
    iget-object v1, v5, Lcom/google/ads/bt;->g:Lcom/google/ads/util/ad;

    invoke-virtual {v1}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/ads/a/ac;

    invoke-virtual {v1}, Lcom/google/ads/a/ac;->a()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v2}, Lcom/google/ads/a/e;->k()Z

    move-result v6

    sget v7, Lcom/google/ads/util/AdUtil;->a:I

    iget-object v1, v0, Lcom/google/ads/bs;->b:Lcom/google/ads/util/ae;

    invoke-virtual {v1}, Lcom/google/ads/util/ae;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ge v7, v1, :cond_4

    move v1, v3

    :goto_0
    if-nez v1, :cond_5

    if-eqz v6, :cond_5

    const-string v1, "Re-enabling hardware acceleration for a banner after reading constants."

    invoke-static {v1}, Lcom/google/ads/util/g;->a(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/google/ads/a/e;->h()V

    :cond_1
    :goto_1
    iget-object v1, v5, Lcom/google/ads/bt;->e:Lcom/google/ads/util/ad;

    invoke-virtual {v1}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/ads/a/a;

    iget-object v2, v5, Lcom/google/ads/bt;->g:Lcom/google/ads/util/ad;

    invoke-virtual {v2}, Lcom/google/ads/util/ad;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/ads/a/ac;

    invoke-virtual {v2}, Lcom/google/ads/a/ac;->b()Z

    move-result v2

    if-nez v2, :cond_2

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lcom/google/ads/a/a;->k()Z

    move-result v6

    sget v7, Lcom/google/ads/util/AdUtil;->a:I

    iget-object v2, v0, Lcom/google/ads/bs;->c:Lcom/google/ads/util/ae;

    invoke-virtual {v2}, Lcom/google/ads/util/ae;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-ge v7, v2, :cond_6

    move v2, v3

    :goto_2
    if-nez v2, :cond_7

    if-eqz v6, :cond_7

    const-string v2, "Re-enabling hardware acceleration for an activation overlay after reading constants."

    invoke-static {v2}, Lcom/google/ads/util/g;->a(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/google/ads/a/a;->h()V

    :cond_2
    :goto_3
    iget-object v1, v0, Lcom/google/ads/bs;->a:Lcom/google/ads/util/ae;

    invoke-virtual {v1}, Lcom/google/ads/util/ae;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, v5, Lcom/google/ads/bt;->s:Lcom/google/ads/util/ae;

    invoke-virtual {v2}, Lcom/google/ads/util/ae;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/ads/ak;

    if-eqz v2, :cond_3

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_3

    invoke-virtual {v2, v1}, Lcom/google/ads/ak;->a(Ljava/lang/String;)V

    :cond_3
    iget-object v0, v0, Lcom/google/ads/bs;->o:Lcom/google/ads/util/ae;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/ads/util/ae;->a(Ljava/lang/Object;)V

    return-void

    :cond_4
    move v1, v4

    goto :goto_0

    :cond_5
    if-eqz v1, :cond_1

    if-nez v6, :cond_1

    const-string v1, "Disabling hardware acceleration for a banner after reading constants."

    invoke-static {v1}, Lcom/google/ads/util/g;->a(Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/google/ads/a/e;->g()V

    goto :goto_1

    :cond_6
    move v2, v4

    goto :goto_2

    :cond_7
    if-eqz v2, :cond_2

    if-nez v6, :cond_2

    const-string v2, "Disabling hardware acceleration for an activation overlay after reading constants."

    invoke-static {v2}, Lcom/google/ads/util/g;->a(Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/google/ads/a/a;->g()V

    goto :goto_3
.end method
