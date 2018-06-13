// Generated code from Butter Knife. Do not modify!
package com.canplay.milk.mvp.activity.home;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.canplay.medical.R;
import com.canplay.milk.view.MCheckBox;
import com.canplay.milk.view.NavigationBar;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RemindMilkActivity_ViewBinding implements Unbinder {
  private RemindMilkActivity target;

  @UiThread
  public RemindMilkActivity_ViewBinding(RemindMilkActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RemindMilkActivity_ViewBinding(RemindMilkActivity target, View source) {
    this.target = target;

    target.line = Utils.findRequiredView(source, R.id.line, "field 'line'");
    target.navigationBar = Utils.findRequiredViewAsType(source, R.id.navigationBar, "field 'navigationBar'", NavigationBar.class);
    target.tvRemind = Utils.findRequiredViewAsType(source, R.id.tv_remind, "field 'tvRemind'", TextView.class);
    target.tvAdd = Utils.findRequiredViewAsType(source, R.id.tv_add, "field 'tvAdd'", TextView.class);
    target.ivChoose = Utils.findRequiredViewAsType(source, R.id.iv_choose, "field 'ivChoose'", MCheckBox.class);
    target.rlMenu = Utils.findRequiredViewAsType(source, R.id.rl_menu, "field 'rlMenu'", ListView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RemindMilkActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.line = null;
    target.navigationBar = null;
    target.tvRemind = null;
    target.tvAdd = null;
    target.ivChoose = null;
    target.rlMenu = null;
  }
}
