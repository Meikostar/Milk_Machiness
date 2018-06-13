// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.canplay.milk.mvp.activity.home;

import com.canplay.milk.mvp.present.BasesPresenter;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class PushMilkActivity_MembersInjector implements MembersInjector<PushMilkActivity> {
  private final Provider<BasesPresenter> presenterProvider;

  public PushMilkActivity_MembersInjector(Provider<BasesPresenter> presenterProvider) {
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<PushMilkActivity> create(
      Provider<BasesPresenter> presenterProvider) {
    return new PushMilkActivity_MembersInjector(presenterProvider);
  }

  @Override
  public void injectMembers(PushMilkActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.presenter = presenterProvider.get();
  }

  public static void injectPresenter(
      PushMilkActivity instance, Provider<BasesPresenter> presenterProvider) {
    instance.presenter = presenterProvider.get();
  }
}