package com.nfach98.githubuserfavorite.app.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u0015\u0016B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u00a2\u0006\u0002\u0010\u0007J\b\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00020\r2\n\u0010\u000e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000bH\u0016J\u001c\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000bH\u0016J\u000e\u0010\u0014\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tR\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/nfach98/githubuserfavorite/app/main/MainAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/nfach98/githubuserfavorite/app/main/MainAdapter$UserViewHolder;", "users", "Ljava/util/ArrayList;", "Lcom/nfach98/githubuserfavoritefavorite/model/Item;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "onItemActionCallback", "Lcom/nfach98/githubuserfavorite/app/main/MainAdapter$OnItemActionCallback;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setOnItemClickCallback", "OnItemActionCallback", "UserViewHolder", "githubuserfavorite_debug"})
public final class MainAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.nfach98.githubuserfavorite.app.main.MainAdapter.UserViewHolder> {
    private com.nfach98.githubuserfavorite.app.main.MainAdapter.OnItemActionCallback onItemActionCallback;
    private final java.util.ArrayList<com.nfach98.githubuserfavoritefavorite.model.Item> users = null;
    
    public final void setOnItemClickCallback(@org.jetbrains.annotations.NotNull()
    com.nfach98.githubuserfavorite.app.main.MainAdapter.OnItemActionCallback onItemActionCallback) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.nfach98.githubuserfavorite.app.main.MainAdapter.UserViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.nfach98.githubuserfavorite.app.main.MainAdapter.UserViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public MainAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.nfach98.githubuserfavoritefavorite.model.Item> users) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/nfach98/githubuserfavorite/app/main/MainAdapter$UserViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/nfach98/githubuserfavoritefavorite/databinding/ItemUserBinding;", "(Lcom/nfach98/githubuserfavorite/app/main/MainAdapter;Lcom/nfach98/githubuserfavoritefavorite/databinding/ItemUserBinding;)V", "bind", "", "user", "Lcom/nfach98/githubuserfavoritefavorite/model/Item;", "githubuserfavorite_debug"})
    public final class UserViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.nfach98.githubuserfavoritefavorite.databinding.ItemUserBinding binding = null;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.nfach98.githubuserfavoritefavorite.model.Item user) {
        }
        
        public UserViewHolder(@org.jetbrains.annotations.NotNull()
        com.nfach98.githubuserfavoritefavorite.databinding.ItemUserBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/nfach98/githubuserfavorite/app/main/MainAdapter$OnItemActionCallback;", "", "onItemClicked", "", "data", "Lcom/nfach98/githubuserfavoritefavorite/model/Item;", "githubuserfavorite_debug"})
    public static abstract interface OnItemActionCallback {
        
        public abstract void onItemClicked(@org.jetbrains.annotations.NotNull()
        com.nfach98.githubuserfavoritefavorite.model.Item data);
    }
}