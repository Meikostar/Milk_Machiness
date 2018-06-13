// Generated code from Butter Knife. Do not modify!
package com.canplay.milk.mvp.activity.home;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.canplay.medical.R;
import com.canplay.milk.view.ClearEditText;
import com.canplay.milk.view.NavigationBar;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AddBrandsActivity_ViewBinding implements Unbinder {
  private AddBrandsActivity target;

  @UiThread
  public AddBrandsActivity_ViewBinding(AddBrandsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AddBrandsActivity_ViewBinding(AddBrandsActivity target, View source) {
    this.target = target;

    target.navigationBar = Utils.findRequiredViewAsType(source, R.id.navigationBar, "field 'navigationBar'", NavigationBar.class);
    target.etBrand = Utils.findRequiredViewAsType(source, R.id.et_brand, "field 'etBrand'", ClearEditText.class);
    target.tvChoose = Utils.findRequiredViewAsType(source, R.id.tv_choose, "field 'tvChoose'", TextView.class);
    target.etMl = Utils.findRequiredViewAsType(source, R.id.et_ml, "field 'etMl'", ClearEditText.class);
    target.etWd = Utils.findRequiredViewAsType(source, R.id.et_wd, "field 'etWd'", ClearEditText.class);
    target.etWeight = Utils.findRequiredViewAsType(source, R.id.et_weight, "field 'etWeight'", ClearEditText.class);
    target.llChoose = Utils.findRequiredViewAsType(source, R.id.ll_choose, "field 'llChoose'", LinearLayout.class);
    target.line = Utils.findRequiredView(source, R.id.line, "field 'line'");
  }

  @Override
  @CallSuper
  public void unbind() {
    AddBrandsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.navigationBar = null;
    target.etBrand = null;
    target.tvChoose = null;
    target.etMl = null;
    target.etWd = null;
    target.etWeight = null;
    target.llChoose = null;
    target.line = null;
  }
}
