package com.nfach98.githubuserfavoritefavorite.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J(\u0010\u0007\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J(\u0010\u000b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'J\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u000e"}, d2 = {"Lcom/nfach98/githubuserfavoritefavorite/api/ApiServices;", "", "getUser", "Lretrofit2/Call;", "Lcom/nfach98/githubuserfavorite/model/UserDetail;", "username", "", "getUserFollower", "Ljava/util/ArrayList;", "Lcom/nfach98/githubuserfavoritefavorite/model/Item;", "Lkotlin/collections/ArrayList;", "getUserFollowing", "search", "Lcom/nfach98/githubuserfavorite/model/UserSearchResponse;", "githubuserfavorite_debug"})
public abstract interface ApiServices {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "search/users")
    public abstract retrofit2.Call<com.nfach98.githubuserfavorite.model.UserSearchResponse> search(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String username);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "users/{username}")
    public abstract retrofit2.Call<com.nfach98.githubuserfavorite.model.UserDetail> getUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "username")
    java.lang.String username);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "users/{username}/followers")
    public abstract retrofit2.Call<java.util.ArrayList<com.nfach98.githubuserfavoritefavorite.model.Item>> getUserFollower(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "username")
    java.lang.String username);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "users/{username}/following")
    public abstract retrofit2.Call<java.util.ArrayList<com.nfach98.githubuserfavoritefavorite.model.Item>> getUserFollowing(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "username")
    java.lang.String username);
}