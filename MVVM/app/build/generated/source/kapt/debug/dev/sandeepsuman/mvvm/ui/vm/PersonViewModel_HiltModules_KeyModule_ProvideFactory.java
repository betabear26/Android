// Generated by Dagger (https://dagger.dev).
package dev.sandeepsuman.mvvm.ui.vm;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PersonViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static PersonViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(PersonViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final PersonViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new PersonViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}
