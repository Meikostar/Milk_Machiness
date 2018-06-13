// Generated code from Butter Knife. Do not modify!
package com.canplay.milk.mvp.activity.home;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.canplay.medical.R;
import com.canplay.milk.view.BaseSelector;
import com.canplay.milk.view.NavigationBar;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AddMilkActivity_ViewBinding implements Unbinder {
  private AddMilkActivity target;

  @UiThread
  public AddMilkActivity_ViewBinding(AddMilkActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AddMilkActivity_ViewBinding(AddMilkActivity target, View source) {
    this.target = target;

    target.navigationBar = Utils.findRequiredViewAsType(source, R.id.navigationBar, "field 'navigationBar'", NavigationBar.class);
    target.tvEquptname = Utils.findRequiredViewAsType(source, R.id.tv_equptname, "field 'tvEquptname'", TextView.class);
    target.tvMilk = Utils.findRequiredViewAsType(source, R.id.tv_milk, "field 'tvMilk'", TextView.class);
    target.bsMl = Utils.findRequiredViewAsType(source, R.id.bs_ml, "field 'bsMl'", BaseSelector.class);
    target.bsWd = Utils.findRequiredViewAsType(source, R.id.bs_wd, "field 'bsWd'", BaseSelector.class);
    target.bsNd = Utils.findRequiredViewAsType(source, R.id.bs_nd, "field 'bsNd'", BaseSelector.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AddMilkActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.navigationBar = null;
    target.tvEquptname = null;
    target.tvMilk = null;
    target.bsMl = null;
    target.bsWd = null;
    target.bsNd = null;
  }
}
