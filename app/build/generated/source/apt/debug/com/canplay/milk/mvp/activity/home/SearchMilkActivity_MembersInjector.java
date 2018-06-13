// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.canplay.milk.mvp.activity.home;

import com.canplay.milk.mvp.present.BasesPresenter;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class SearchMilkActivity_MembersInjector
    implements MembersInjector<SearchMilkActivity> {
  private final Provider<BasesPresenter> presenterProvider;

  public SearchMilkActivity_MembersInjector(Provider<BasesPresenter> presenterProvider) {
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<SearchMilkActivity> create(
      Provider<BasesPresenter> presenterProvider) {
    return new SearchMilkActivity_MembersInjector(presenterProvider);
  }

  @Override
  public void injectMembers(SearchMilkActivity instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.presenter = presenterProvider.get();
  }

  public static void injectPresenter(
      SearchMilkActivity instance, Provider<BasesPresenter> presenterProvider) {
    instance.presenter = presenterProvider.get();
  }
}