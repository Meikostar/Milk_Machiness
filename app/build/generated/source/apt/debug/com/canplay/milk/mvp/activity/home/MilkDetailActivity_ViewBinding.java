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

public class MilkDetailActivity_ViewBinding implements Unbinder {
  private MilkDetailActivity target;

  @UiThread
  public MilkDetailActivity_ViewBinding(MilkDetailActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MilkDetailActivity_ViewBinding(MilkDetailActivity target, View source) {
    this.target = target;

    target.navigationBar = Utils.findRequiredViewAsType(source, R.id.navigationBar, "field 'navigationBar'", NavigationBar.class);
    target.ivImg = Utils.findRequiredViewAsType(source, R.id.iv_img, "field 'ivImg'", ImageView.class);
    target.tvWeigh = Utils.findRequiredViewAsType(source, R.id.tv_weigh, "field 'tvWeigh'", TextView.class);
    target.tvMl = Utils.findRequiredViewAsType(source, R.id.tv_ml, "field 'tvMl'", TextView.class);
    target.tvWd = Utils.findRequiredViewAsType(source, R.id.tv_wd, "field 'tvWd'", TextView.class);
    target.tvContent = Utils.findRequiredViewAsType(source, R.id.tv_content, "field 'tvContent'", TextView.class);
    target.tvName = Utils.findRequiredViewAsType(source, R.id.tv_name, "field 'tvName'", TextView.class);
    target.tvDetail = Utils.findRequiredViewAsType(source, R.id.tv_detail, "field 'tvDetail'", TextView.class);
    target.tvSure = Utils.findRequiredViewAsType(source, R.id.tv_sure, "field 'tvSure'", TextView.class);
    target.tvChange = Utils.findRequiredViewAsType(source, R.id.tv_change, "field 'tvChange'", TextView.class);
    target.tvName1 = Utils.findRequiredViewAsType(source, R.id.tv_name1, "field 'tvName1'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MilkDetailActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.navigationBar = null;
    target.ivImg = null;
    target.tvWeigh = null;
    target.tvMl = null;
    target.tvWd = null;
    target.tvContent = null;
    target.tvName = null;
    target.tvDetail = null;
    target.tvSure = null;
    target.tvChange = null;
    target.tvName1 = null;
  }
}
