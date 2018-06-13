// Generated code from Butter Knife. Do not modify!
package com.canplay.milk.mvp.activity.home;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.canplay.medical.R;
import com.canplay.milk.view.NavigationBar;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PushMilkActivity_ViewBinding implements Unbinder {
  private PushMilkActivity target;

  @UiThread
  public PushMilkActivity_ViewBinding(PushMilkActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PushMilkActivity_ViewBinding(PushMilkActivity target, View source) {
    this.target = target;

    target.navigationBar = Utils.findRequiredViewAsType(source, R.id.navigationBar, "field 'navigationBar'", NavigationBar.class);
    target.ivImg = Utils.findRequiredViewAsType(source, R.id.iv_img, "field 'ivImg'", ImageView.class);
    target.tvMl = Utils.findRequiredViewAsType(source, R.id.tv_ml, "field 'tvMl'", TextView.class);
    target.tvName = Utils.findRequiredViewAsType(source, R.id.tv_name, "field 'tvName'", TextView.class);
    target.tvMls = Utils.findRequiredViewAsType(source, R.id.tv_mls, "field 'tvMls'", TextView.class);
    target.tvState = Utils.findRequiredViewAsType(source, R.id.tv_state, "field 'tvState'", TextView.class);
    target.tvBegin = Utils.findRequiredViewAsType(source, R.id.tv_begin, "field 'tvBegin'", TextView.class);
    target.tvWd = Utils.findRequiredViewAsType(source, R.id.tv_wd, "field 'tvWd'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PushMilkActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.navigationBar = null;
    target.ivImg = null;
    target.tvMl = null;
    target.tvName = null;
    target.tvMls = null;
    target.tvState = null;
    target.tvBegin = null;
    target.tvWd = null;
  }
}
