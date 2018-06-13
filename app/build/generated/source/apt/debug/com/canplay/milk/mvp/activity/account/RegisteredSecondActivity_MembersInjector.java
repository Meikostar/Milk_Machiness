// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.canplay.milk.mvp.activity.account;

import com.canplay.milk.mvp.present.LoginPresenter;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class RegisteredSecondActivity_MembersInjector
    implements MembersInjector<RegisteredSecondActivity> {
  private final Provider<LoginPresenter> presenterProvider;

  public RegisteredSecondActivity_MembersInjector(Provider<LoginPresenter> presenterProvider) {
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<RegisteredSecondActivity> create(
      Provider<LoginPresenter> presenterProvider) {
    return new RegisteredSecondActivity_MembersInjector(presenterProvider);
  }

  @Override
  public void injectMembers(RegisteredSecondActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.presenter = presenterProvider.get();
  }

  public static void injectPresenter(
      RegisteredSecondActivity instance, Provider<LoginPresenter> presenterProvider) {
    instance.presenter = presenterProvider.get();
  }
}