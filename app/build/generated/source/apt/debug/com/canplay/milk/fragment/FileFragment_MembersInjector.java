// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.canplay.milk.fragment;

import com.canplay.milk.mvp.present.BasesPresenter;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class FileFragment_MembersInjector implements MembersInjector<FileFragment> {
  private final Provider<BasesPresenter> presenterProvider;

  public FileFragment_MembersInjector(Provider<BasesPresenter> presenterProvider) {
    assert presenterProvider != null;
    this.presenterProvider = presenterProvider;
  }

  public static MembersInjector<FileFragment> create(Provider<BasesPresenter> presenterProvider) {
    return new FileFragment_MembersInjector(presenterProvider);
  }

  @Override
  public void injectMembers(FileFragment instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.presenter = presenterProvider.get();
  }

  public static void injectPresenter(
      FileFragment instance, Provider<BasesPresenter> presenterProvider) {
    instance.presenter = presenterProvider.get();
  }
}