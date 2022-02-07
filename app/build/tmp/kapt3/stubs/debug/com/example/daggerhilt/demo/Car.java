package com.example.daggerhilt.demo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/daggerhilt/demo/Car;", "", "engine", "Lcom/example/daggerhilt/demo/Engine;", "wheel", "Lcom/example/daggerhilt/demo/Wheel;", "(Lcom/example/daggerhilt/demo/Engine;Lcom/example/daggerhilt/demo/Wheel;)V", "getCar", "", "app_debug"})
public final class Car {
    private com.example.daggerhilt.demo.Engine engine;
    private com.example.daggerhilt.demo.Wheel wheel;
    
    @javax.inject.Inject()
    public Car(@org.jetbrains.annotations.NotNull()
    com.example.daggerhilt.demo.Engine engine, @org.jetbrains.annotations.NotNull()
    com.example.daggerhilt.demo.Wheel wheel) {
        super();
    }
    
    public final void getCar() {
    }
}