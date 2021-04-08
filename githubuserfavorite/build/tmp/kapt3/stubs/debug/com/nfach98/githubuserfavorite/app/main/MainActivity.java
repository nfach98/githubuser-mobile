package com.nfach98.githubuserfavorite.app.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\u0012\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0011H\u0014J\b\u0010\u0018\u001a\u00020\u000eH\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\u001a"}, d2 = {"Lcom/nfach98/githubuserfavorite/app/main/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/nfach98/githubuserfavorite/app/main/MainAdapter;", "binding", "Lcom/nfach98/githubuserfavoritefavorite/databinding/ActivityFavoriteBinding;", "viewModel", "Lcom/nfach98/githubuserfavorite/app/main/MainViewModel;", "getViewModel", "()Lcom/nfach98/githubuserfavorite/app/main/MainViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "loadNotesAsync", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onSaveInstanceState", "outState", "onStart", "Companion", "githubuserfavorite_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.nfach98.githubuserfavorite.app.main.MainAdapter adapter;
    private com.nfach98.githubuserfavoritefavorite.databinding.ActivityFavoriteBinding binding;
    private final kotlin.Lazy viewModel$delegate = null;
    private static final java.lang.String EXTRA_STATE = "EXTRA_STATE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_USER = "extra_user";
    @org.jetbrains.annotations.NotNull()
    public static final com.nfach98.githubuserfavorite.app.main.MainActivity.Companion Companion = null;
    
    private final com.nfach98.githubuserfavorite.app.main.MainViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    private final void loadNotesAsync() {
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/nfach98/githubuserfavorite/app/main/MainActivity$Companion;", "", "()V", "EXTRA_STATE", "", "EXTRA_USER", "githubuserfavorite_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}