package com.nfach98.githubuserfavorite.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\u0019\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\tH\u00c6\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0018\b\u0002\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\tH\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR&\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001a"}, d2 = {"Lcom/nfach98/githubuserfavorite/model/UserSearchResponse;", "", "incompleteResults", "", "items", "Ljava/util/ArrayList;", "Lcom/nfach98/githubuserfavoritefavorite/model/Item;", "Lkotlin/collections/ArrayList;", "totalCount", "", "(ZLjava/util/ArrayList;I)V", "getIncompleteResults", "()Z", "getItems", "()Ljava/util/ArrayList;", "getTotalCount", "()I", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "githubuserfavorite_debug"})
public final class UserSearchResponse {
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "incomplete_results")
    private final boolean incompleteResults = false;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "items")
    private final java.util.ArrayList<com.nfach98.githubuserfavoritefavorite.model.Item> items = null;
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "total_count")
    private final int totalCount = 0;
    
    public final boolean getIncompleteResults() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.nfach98.githubuserfavoritefavorite.model.Item> getItems() {
        return null;
    }
    
    public final int getTotalCount() {
        return 0;
    }
    
    public UserSearchResponse(boolean incompleteResults, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.nfach98.githubuserfavoritefavorite.model.Item> items, int totalCount) {
        super();
    }
    
    public final boolean component1() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.nfach98.githubuserfavoritefavorite.model.Item> component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.nfach98.githubuserfavorite.model.UserSearchResponse copy(boolean incompleteResults, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.nfach98.githubuserfavoritefavorite.model.Item> items, int totalCount) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}