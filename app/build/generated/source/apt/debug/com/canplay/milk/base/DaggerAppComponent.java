// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.canplay.milk.base;

import com.canplay.milk.base.manager.ApiManager;
import dagger.internal.DoubleCheck;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DaggerAppComponent implements AppComponent {
  private Provider<ApiManager> provideApiManagerProvider;

  private DaggerAppComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideApiManagerProvider =
        DoubleCheck.provider(AppModule_ProvideApiManagerFactory.create(builder.appModule));
  }

  @Override
  public ApiManager apiManager() {
    return provideApiManagerProvider.get();
  }

  @Override
  public void inject(BaseApplication application) {
    MembersInjectors.<BaseApplication>noOp().injectMembers(application);
  }

  @Override
  public void inject(BaseAllActivity baseActivity) {
    MembersInjectors.<BaseAllActivity>noOp().injectMembers(baseActivity);
  }

  public static final class Builder {
    private AppModule appModule;

    private Builder() {}

    public AppComponent build() {
      if (appModule == null) {
        throw new IllegalStateException(AppModule.class.getCanonicalName() + " must be set");
      }
      return new DaggerAppComponent(this);
    }

    public Builder appModule(AppModule appModule) {
      this.appModule = Preconditions.checkNotNull(appModule);
      return this;
    }
  }
}
