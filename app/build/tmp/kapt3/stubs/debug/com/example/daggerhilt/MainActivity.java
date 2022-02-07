package com.example.daggerhilt;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u000f\u001a\u00020\u00108\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0019"}, d2 = {"Lcom/example/daggerhilt/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "car", "Lcom/example/daggerhilt/demo/Car;", "getCar", "()Lcom/example/daggerhilt/demo/Car;", "setCar", "(Lcom/example/daggerhilt/demo/Car;)V", "main", "Lcom/example/daggerhilt/demo/Main;", "getMain", "()Lcom/example/daggerhilt/demo/Main;", "setMain", "(Lcom/example/daggerhilt/demo/Main;)V", "main2", "Lcom/example/daggerhilt/demo/Main2;", "getMain2", "()Lcom/example/daggerhilt/demo/Main2;", "setMain2", "(Lcom/example/daggerhilt/demo/Main2;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @javax.inject.Inject()
    public com.example.daggerhilt.demo.Car car;
    @javax.inject.Inject()
    public com.example.daggerhilt.demo.Main main;
    @javax.inject.Inject()
    public com.example.daggerhilt.demo.Main2 main2;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.daggerhilt.demo.Car getCar() {
        return null;
    }
    
    public final void setCar(@org.jetbrains.annotations.NotNull()
    com.example.daggerhilt.demo.Car p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.daggerhilt.demo.Main getMain() {
        return null;
    }
    
    public final void setMain(@org.jetbrains.annotations.NotNull()
    com.example.daggerhilt.demo.Main p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.daggerhilt.demo.Main2 getMain2() {
        return null;
    }
    
    public final void setMain2(@org.jetbrains.annotations.NotNull()
    com.example.daggerhilt.demo.Main2 p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
}