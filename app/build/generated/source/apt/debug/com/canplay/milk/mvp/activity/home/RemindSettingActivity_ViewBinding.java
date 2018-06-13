// Generated code from Butter Knife. Do not modify!
package com.canplay.milk.mvp.activity.home;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.canplay.medical.R;
import com.canplay.milk.view.HourSelector;
import com.canplay.milk.view.NavigationBar;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RemindSettingActivity_ViewBinding implements Unbinder {
  private RemindSettingActivity target;

  @UiThread
  public RemindSettingActivity_ViewBinding(RemindSettingActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RemindSettingActivity_ViewBinding(RemindSettingActivity target, View source) {
    this.target = target;

    target.navigationBar = Utils.findRequiredViewAsType(source, R.id.navigationBar, "field 'navigationBar'", NavigationBar.class);
    target.togBtnMonday = Utils.findRequiredViewAsType(source, R.id.tog_btn_monday, "field 'togBtnMonday'", ToggleButton.class);
    target.togBtnTuesday = Utils.findRequiredViewAsType(source, R.id.tog_btn_tuesday, "field 'togBtnTuesday'", ToggleButton.class);
    target.togBtnWednesday = Utils.findRequiredViewAsType(source, R.id.tog_btn_wednesday, "field 'togBtnWednesday'", ToggleButton.class);
    target.togBtnThursday = Utils.findRequiredViewAsType(source, R.id.tog_btn_thursday, "field 'togBtnThursday'", ToggleButton.class);
    target.togBtnFriday = Utils.findRequiredViewAsType(source, R.id.tog_btn_friday, "field 'togBtnFriday'", ToggleButton.class);
    target.togBtnSaturday = Utils.findRequiredViewAsType(source, R.id.tog_btn_saturday, "field 'togBtnSaturday'", ToggleButton.class);
    target.togBtnSunday = Utils.findRequiredViewAsType(source, R.id.tog_btn_sunday, "field 'togBtnSunday'", ToggleButton.class);
    target.tvTag = Utils.findRequiredViewAsType(source, R.id.tv_tag, "field 'tvTag'", TextView.class);
    target.llTag = Utils.findRequiredViewAsType(source, R.id.ll_tag, "field 'llTag'", LinearLayout.class);
    target.hourSelect = Utils.findRequiredViewAsType(source, R.id.hour_select, "field 'hourSelect'", HourSelector.class);
    target.textView2 = Utils.findRequiredViewAsType(source, R.id.textView2, "field 'textView2'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RemindSettingActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.navigationBar = null;
    target.togBtnMonday = null;
    target.togBtnTuesday = null;
    target.togBtnWednesday = null;
    target.togBtnThursday = null;
    target.togBtnFriday = null;
    target.togBtnSaturday = null;
    target.togBtnSunday = null;
    target.tvTag = null;
    target.llTag = null;
    target.hourSelect = null;
    target.textView2 = null;
  }
}
