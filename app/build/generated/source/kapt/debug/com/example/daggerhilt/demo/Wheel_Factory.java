// Generated by Dagger (https://dagger.dev).
package com.example.daggerhilt.demo;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class Wheel_Factory implements Factory<Wheel> {
  @Override
  public Wheel get() {
    return newInstance();
  }

  public static Wheel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Wheel newInstance() {
    return new Wheel();
  }

  private static final class InstanceHolder {
    private static final Wheel_Factory INSTANCE = new Wheel_Factory();
  }
}