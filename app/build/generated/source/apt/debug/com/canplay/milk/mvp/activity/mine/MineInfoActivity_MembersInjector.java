// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.canplay.milk.mvp.activity.mine;

import com.canplay.milk.mvp.present.LoginPresenter;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class MineInfoActivity_MembersInjector implements MembersInjector<MineInfoActivity> {
  private final Provider<LoginPresenter> presenterProvider;

  public MineInfoActivity_MembersInjector(Provider<LoginPresenter> presenterProvider) {
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<MineInfoActivity> create(
      Provider<LoginPresenter> presenterProvider) {
    return new MineInfoActivity_MembersInjector(presenterProvider);
  }

  @Override
  public void injectMembers(MineInfoActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.presenter = presenterProvider.get();
  }

  public static void injectPresenter(
      MineInfoActivity instance, Provider<LoginPresenter> presenterProvider) {
    instance.presenter = presenterProvider.get();
  }
}
