// Generated code from Butter Knife. Do not modify!
package com.canplay.milk.mvp.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.canplay.medical.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AlarmActivity_ViewBinding implements Unbinder {
  private AlarmActivity target;

  @UiThread
  public AlarmActivity_ViewBinding(AlarmActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AlarmActivity_ViewBinding(AlarmActivity target, View source) {
    this.target = target;

    target.ivClose = Utils.findRequiredViewAsType(source, R.id.iv_close, "field 'ivClose'", ImageView.class);
    target.img = Utils.findRequiredViewAsType(source, R.id.img, "field 'img'", ImageView.class);
    target.tvName = Utils.findRequiredViewAsType(source, R.id.tv_name, "field 'tvName'", TextView.class);
    target.tvAdd = Utils.findRequiredViewAsType(source, R.id.tv_add, "field 'tvAdd'", TextView.class);
    target.tvContent = Utils.findRequiredViewAsType(source, R.id.tv_content, "field 'tvContent'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AlarmActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ivClose = null;
    target.img = null;
    target.tvName = null;
    target.tvAdd = null;
    target.tvContent = null;
  }
}
