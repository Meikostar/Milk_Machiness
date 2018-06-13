// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.canplay.milk.mvp.activity.home;

import com.canplay.milk.mvp.present.BasesPresenter;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class RemindMilkActivity_MembersInjector
    implements MembersInjector<RemindMilkActivity> {
  private final Provider<BasesPresenter> presenterProvider;

  public RemindMilkActivity_MembersInjector(Provider<BasesPresenter> presenterProvider) {
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<RemindMilkActivity> create(
      Provider<BasesPresenter> presenterProvider) {
    return new RemindMilkActivity_MembersInjector(presenterProvider);
  }

  @Override
  public void injectMembers(RemindMilkActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.presenter = presenterProvider.get();
  }

  public static void injectPresenter(
      RemindMilkActivity instance, Provider<BasesPresenter> presenterProvider) {
    instance.presenter = presenterProvider.get();
  }
}
