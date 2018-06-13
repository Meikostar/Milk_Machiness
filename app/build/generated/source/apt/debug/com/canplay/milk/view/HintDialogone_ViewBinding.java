// Generated code from Butter Knife. Do not modify!
package com.canplay.milk.view;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.canplay.medical.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class HintDialogone_ViewBinding implements Unbinder {
  private HintDialogone target;

  @UiThread
  public HintDialogone_ViewBinding(HintDialogone target, View source) {
    this.target = target;

    target.tvTitle = Utils.findRequiredViewAsType(source, R.id.tv_title, "field 'tvTitle'", TextView.class);
    target.llMessage = Utils.findRequiredViewAsType(source, R.id.ll_message, "field 'llMessage'", LinearLayout.class);
    target.tvContent = Utils.findRequiredViewAsType(source, R.id.tv_content, "field 'tvContent'", TextView.class);
    target.btLeft = Utils.findRequiredViewAsType(source, R.id.bt_left, "field 'btLeft'", Button.class);
    target.btRight = Utils.findRequiredViewAsType(source, R.id.bt_right, "field 'btRight'", Button.class);
    target.llContent = Utils.findRequiredViewAsType(source, R.id.ll_content, "field 'llContent'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    HintDialogone target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvTitle = null;
    target.llMessage = null;
    target.tvContent = null;
    target.btLeft = null;
    target.btRight = null;
    target.llContent = null;
  }
}
