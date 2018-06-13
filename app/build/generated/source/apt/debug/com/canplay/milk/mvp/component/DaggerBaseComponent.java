// Generated by dagger.internal.codegen.ComponentProcessor (https://google.github.io/dagger).
package com.canplay.milk.mvp.component;

import com.canplay.milk.base.AppComponent;
import com.canplay.milk.base.manager.ApiManager;
import com.canplay.milk.fragment.DataFragment;
import com.canplay.milk.fragment.FileFragment;
import com.canplay.milk.fragment.FileFragment_MembersInjector;
import com.canplay.milk.fragment.SetFragment;
import com.canplay.milk.fragment.SetFragment_MembersInjector;
import com.canplay.milk.mvp.activity.MainActivity;
import com.canplay.milk.mvp.activity.MainActivity_MembersInjector;
import com.canplay.milk.mvp.activity.account.ForgetPswActivity;
import com.canplay.milk.mvp.activity.account.ForgetPswActivity_MembersInjector;
import com.canplay.milk.mvp.activity.account.LoginActivity;
import com.canplay.milk.mvp.activity.account.LoginActivity_MembersInjector;
import com.canplay.milk.mvp.activity.account.RegisteredActivity;
import com.canplay.milk.mvp.activity.account.RegisteredActivity_MembersInjector;
import com.canplay.milk.mvp.activity.account.RegisteredSecondActivity;
import com.canplay.milk.mvp.activity.account.RegisteredSecondActivity_MembersInjector;
import com.canplay.milk.mvp.activity.home.AddBrandsActivity;
import com.canplay.milk.mvp.activity.home.AddBrandsActivity_MembersInjector;
import com.canplay.milk.mvp.activity.home.AddMilkActivity;
import com.canplay.milk.mvp.activity.home.AddMilkActivity_MembersInjector;
import com.canplay.milk.mvp.activity.home.MilkDetailActivity;
import com.canplay.milk.mvp.activity.home.MilkDetailActivity_MembersInjector;
import com.canplay.milk.mvp.activity.home.MilkListActivity;
import com.canplay.milk.mvp.activity.home.MilkListActivity_MembersInjector;
import com.canplay.milk.mvp.activity.home.PushMilkActivity;
import com.canplay.milk.mvp.activity.home.PushMilkActivity_MembersInjector;
import com.canplay.milk.mvp.activity.home.RemindMilkActivity;
import com.canplay.milk.mvp.activity.home.RemindMilkActivity_MembersInjector;
import com.canplay.milk.mvp.activity.home.RemindSettingActivity;
import com.canplay.milk.mvp.activity.home.RemindSettingActivity_MembersInjector;
import com.canplay.milk.mvp.activity.home.SearchMilkActivity;
import com.canplay.milk.mvp.activity.home.SearchMilkActivity_MembersInjector;
import com.canplay.milk.mvp.activity.mine.EditorInfoActivity;
import com.canplay.milk.mvp.activity.mine.EditorInfoActivity_MembersInjector;
import com.canplay.milk.mvp.activity.mine.MineInfoActivity;
import com.canplay.milk.mvp.activity.mine.MineInfoActivity_MembersInjector;
import com.canplay.milk.mvp.activity.mine.UpdateActivity;
import com.canplay.milk.mvp.activity.mine.UpdateActivity_MembersInjector;
import com.canplay.milk.mvp.activity.mine.UserAvarActivity;
import com.canplay.milk.mvp.activity.mine.UserAvarActivity_MembersInjector;
import com.canplay.milk.mvp.activity.wiki.GroupRecordActivity;
import com.canplay.milk.mvp.activity.wiki.GroupRecordActivity_MembersInjector;
import com.canplay.milk.mvp.activity.wiki.NurseryActivity;
import com.canplay.milk.mvp.activity.wiki.NurseryActivity_MembersInjector;
import com.canplay.milk.mvp.activity.wiki.PastWipiActivity;
import com.canplay.milk.mvp.activity.wiki.PastWipiActivity_MembersInjector;
import com.canplay.milk.mvp.activity.wiki.PastWipiSearchActivity;
import com.canplay.milk.mvp.activity.wiki.PastWipiSearchActivity_MembersInjector;
import com.canplay.milk.mvp.activity.wiki.PreviewRecordActivity;
import com.canplay.milk.mvp.activity.wiki.PreviewRecordActivity_MembersInjector;
import com.canplay.milk.mvp.activity.wiki.SendRecordActivity;
import com.canplay.milk.mvp.activity.wiki.SendRecordActivity_MembersInjector;
import com.canplay.milk.mvp.present.BasesPresenter;
import com.canplay.milk.mvp.present.BasesPresenter_Factory;
import com.canplay.milk.mvp.present.LoginPresenter;
import com.canplay.milk.mvp.present.LoginPresenter_Factory;
import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class DaggerBaseComponent implements BaseComponent {
  private Provider<ApiManager> apiManagerProvider;

  private Provider<BasesPresenter> basesPresenterProvider;

  private MembersInjector<PastWipiSearchActivity> pastWipiSearchActivityMembersInjector;

  private MembersInjector<SearchMilkActivity> searchMilkActivityMembersInjector;

  private MembersInjector<MilkDetailActivity> milkDetailActivityMembersInjector;

  private MembersInjector<MilkListActivity> milkListActivityMembersInjector;

  private MembersInjector<AddBrandsActivity> addBrandsActivityMembersInjector;

  private MembersInjector<RemindMilkActivity> remindMilkActivityMembersInjector;

  private MembersInjector<RemindSettingActivity> remindSettingActivityMembersInjector;

  private MembersInjector<AddMilkActivity> addMilkActivityMembersInjector;

  private MembersInjector<MainActivity> mainActivityMembersInjector;

  private MembersInjector<FileFragment> fileFragmentMembersInjector;

  private MembersInjector<PushMilkActivity> pushMilkActivityMembersInjector;

  private MembersInjector<NurseryActivity> nurseryActivityMembersInjector;

  private Provider<LoginPresenter> loginPresenterProvider;

  private MembersInjector<EditorInfoActivity> editorInfoActivityMembersInjector;

  private MembersInjector<LoginActivity> loginActivityMembersInjector;

  private MembersInjector<PreviewRecordActivity> previewRecordActivityMembersInjector;

  private MembersInjector<GroupRecordActivity> groupRecordActivityMembersInjector;

  private MembersInjector<PastWipiActivity> pastWipiActivityMembersInjector;

  private MembersInjector<SendRecordActivity> sendRecordActivityMembersInjector;

  private MembersInjector<MineInfoActivity> mineInfoActivityMembersInjector;

  private MembersInjector<UserAvarActivity> userAvarActivityMembersInjector;

  private MembersInjector<UpdateActivity> updateActivityMembersInjector;

  private MembersInjector<SetFragment> setFragmentMembersInjector;

  private MembersInjector<ForgetPswActivity> forgetPswActivityMembersInjector;

  private MembersInjector<RegisteredSecondActivity> registeredSecondActivityMembersInjector;

  private MembersInjector<RegisteredActivity> registeredActivityMembersInjector;

  private DaggerBaseComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.apiManagerProvider =
        new Factory<ApiManager>() {
          private final AppComponent appComponent = builder.appComponent;

          @Override
          public ApiManager get() {
            return Preconditions.checkNotNull(
                appComponent.apiManager(),
                "Cannot return null from a non-@Nullable component method");
          }
        };

    this.basesPresenterProvider = BasesPresenter_Factory.create(apiManagerProvider);

    this.pastWipiSearchActivityMembersInjector =
        PastWipiSearchActivity_MembersInjector.create(basesPresenterProvider);

    this.searchMilkActivityMembersInjector =
        SearchMilkActivity_MembersInjector.create(basesPresenterProvider);

    this.milkDetailActivityMembersInjector =
        MilkDetailActivity_MembersInjector.create(basesPresenterProvider);

    this.milkListActivityMembersInjector =
        MilkListActivity_MembersInjector.create(basesPresenterProvider);

    this.addBrandsActivityMembersInjector =
        AddBrandsActivity_MembersInjector.create(basesPresenterProvider);

    this.remindMilkActivityMembersInjector =
        RemindMilkActivity_MembersInjector.create(basesPresenterProvider);

    this.remindSettingActivityMembersInjector =
        RemindSettingActivity_MembersInjector.create(basesPresenterProvider);

    this.addMilkActivityMembersInjector =
        AddMilkActivity_MembersInjector.create(basesPresenterProvider);

    this.mainActivityMembersInjector = MainActivity_MembersInjector.create(basesPresenterProvider);

    this.fileFragmentMembersInjector = FileFragment_MembersInjector.create(basesPresenterProvider);

    this.pushMilkActivityMembersInjector =
        PushMilkActivity_MembersInjector.create(basesPresenterProvider);

    this.nurseryActivityMembersInjector =
        NurseryActivity_MembersInjector.create(basesPresenterProvider);

    this.loginPresenterProvider = LoginPresenter_Factory.create(apiManagerProvider);

    this.editorInfoActivityMembersInjector =
        EditorInfoActivity_MembersInjector.create(loginPresenterProvider);

    this.loginActivityMembersInjector =
        LoginActivity_MembersInjector.create(loginPresenterProvider);

    this.previewRecordActivityMembersInjector =
        PreviewRecordActivity_MembersInjector.create(basesPresenterProvider);

    this.groupRecordActivityMembersInjector =
        GroupRecordActivity_MembersInjector.create(basesPresenterProvider);

    this.pastWipiActivityMembersInjector =
        PastWipiActivity_MembersInjector.create(basesPresenterProvider);

    this.sendRecordActivityMembersInjector =
        SendRecordActivity_MembersInjector.create(basesPresenterProvider);

    this.mineInfoActivityMembersInjector =
        MineInfoActivity_MembersInjector.create(loginPresenterProvider);

    this.userAvarActivityMembersInjector =
        UserAvarActivity_MembersInjector.create(loginPresenterProvider);

    this.updateActivityMembersInjector =
        UpdateActivity_MembersInjector.create(loginPresenterProvider);

    this.setFragmentMembersInjector = SetFragment_MembersInjector.create(loginPresenterProvider);

    this.forgetPswActivityMembersInjector =
        ForgetPswActivity_MembersInjector.create(loginPresenterProvider);

    this.registeredSecondActivityMembersInjector =
        RegisteredSecondActivity_MembersInjector.create(loginPresenterProvider);

    this.registeredActivityMembersInjector =
        RegisteredActivity_MembersInjector.create(loginPresenterProvider);
  }

  @Override
  public void inject(PastWipiSearchActivity binderActivity) {
    pastWipiSearchActivityMembersInjector.injectMembers(binderActivity);
  }

  @Override
  public void inject(SearchMilkActivity binderActivity) {
    searchMilkActivityMembersInjector.injectMembers(binderActivity);
  }

  @Override
  public void inject(MilkDetailActivity binderActivity) {
    milkDetailActivityMembersInjector.injectMembers(binderActivity);
  }

  @Override
  public void inject(MilkListActivity binderActivity) {
    milkListActivityMembersInjector.injectMembers(binderActivity);
  }

  @Override
  public void inject(AddBrandsActivity binderActivity) {
    addBrandsActivityMembersInjector.injectMembers(binderActivity);
  }

  @Override
  public void inject(RemindMilkActivity binderActivity) {
    remindMilkActivityMembersInjector.injectMembers(binderActivity);
  }

  @Override
  public void inject(RemindSettingActivity binderActivity) {
    remindSettingActivityMembersInjector.injectMembers(binderActivity);
  }

  @Override
  public void inject(AddMilkActivity binderActivity) {
    addMilkActivityMembersInjector.injectMembers(binderActivity);
  }

  @Override
  public void inject(MainActivity binderActivity) {
    mainActivityMembersInjector.injectMembers(binderActivity);
  }

  @Override
  public void inject(FileFragment binderActivity) {
    fileFragmentMembersInjector.injectMembers(binderActivity);
  }

  @Override
  public void inject(PushMilkActivity binderActivity) {
    pushMilkActivityMembersInjector.injectMembers(binderActivity);
  }

  @Override
  public void inject(NurseryActivity binderActivity) {
    nurseryActivityMembersInjector.injectMembers(binderActivity);
  }

  @Override
  public void inject(EditorInfoActivity binderActivity) {
    editorInfoActivityMembersInjector.injectMembers(binderActivity);
  }

  @Override
  public void inject(LoginActivity binderActivity) {
    loginActivityMembersInjector.injectMembers(binderActivity);
  }

  @Override
  public void inject(PreviewRecordActivity binderActivity) {
    previewRecordActivityMembersInjector.injectMembers(binderActivity);
  }

  @Override
  public void inject(GroupRecordActivity binderActivity) {
    groupRecordActivityMembersInjector.injectMembers(binderActivity);
  }

  @Override
  public void inject(PastWipiActivity binderActivity) {
    pastWipiActivityMembersInjector.injectMembers(binderActivity);
  }

  @Override
  public void inject(SendRecordActivity binderActivity) {
    sendRecordActivityMembersInjector.injectMembers(binderActivity);
  }

  @Override
  public void inject(MineInfoActivity binderActivity) {
    mineInfoActivityMembersInjector.injectMembers(binderActivity);
  }

  @Override
  public void inject(UserAvarActivity binderActivity) {
    userAvarActivityMembersInjector.injectMembers(binderActivity);
  }

  @Override
  public void inject(UpdateActivity binderActivity) {
    updateActivityMembersInjector.injectMembers(binderActivity);
  }

  @Override
  public void inject(SetFragment binderActivity) {
    setFragmentMembersInjector.injectMembers(binderActivity);
  }

  @Override
  public void inject(ForgetPswActivity binderActivity) {
    forgetPswActivityMembersInjector.injectMembers(binderActivity);
  }

  @Override
  public void inject(RegisteredSecondActivity binderActivity) {
    registeredSecondActivityMembersInjector.injectMembers(binderActivity);
  }

  @Override
  public void inject(RegisteredActivity binderActivity) {
    registeredActivityMembersInjector.injectMembers(binderActivity);
  }

  @Override
  public void inject(DataFragment binderActivity) {
    MembersInjectors.<DataFragment>noOp().injectMembers(binderActivity);
  }

  public static final class Builder {
    private AppComponent appComponent;

    private Builder() {}

    public BaseComponent build() {
      if (appComponent == null) {
        throw new IllegalStateException(AppComponent.class.getCanonicalName() + " must be set");
      }
      return new DaggerBaseComponent(this);
    }

    public Builder appComponent(AppComponent appComponent) {
      this.appComponent = Preconditions.checkNotNull(appComponent);
      return this;
    }
  }
}