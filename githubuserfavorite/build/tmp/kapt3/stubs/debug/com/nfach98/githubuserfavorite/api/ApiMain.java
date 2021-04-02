package com.nfach98.githubuserfavorite.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005\u00a2\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\r"}, d2 = {"Lcom/nfach98/githubuserfavorite/api/ApiMain;", "Landroid/app/Application;", "()V", "client", "Lokhttp3/OkHttpClient;", "kotlin.jvm.PlatformType", "retrofit", "Lretrofit2/Retrofit;", "services", "Lcom/nfach98/githubuserfavoritefavorite/api/ApiServices;", "getServices", "()Lcom/nfach98/githubuserfavoritefavorite/api/ApiServices;", "Companion", "githubuserfavorite_debug"})
public final class ApiMain extends android.app.Application {
    private final okhttp3.OkHttpClient client = null;
    private final retrofit2.Retrofit retrofit = null;
    @org.jetbrains.annotations.NotNull()
    private final com.nfach98.githubuserfavoritefavorite.api.ApiServices services = null;
    private static final java.lang.String BASE_API_URL = "https://api.github.com/";
    @org.jetbrains.annotations.NotNull()
    public static final com.nfach98.githubuserfavorite.api.ApiMain.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.nfach98.githubuserfavoritefavorite.api.ApiServices getServices() {
        return null;
    }
    
    public ApiMain() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/nfach98/githubuserfavorite/api/ApiMain$Companion;", "", "()V", "BASE_API_URL", "", "githubuserfavorite_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}