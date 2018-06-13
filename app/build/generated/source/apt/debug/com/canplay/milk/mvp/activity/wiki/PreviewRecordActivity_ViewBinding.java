// Generated code from Butter Knife. Do not modify!
package com.canplay.milk.mvp.activity.wiki;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.canplay.medical.R;
import com.canplay.milk.view.NavigationBar;
import java.lang.IllegalStateException;
import java.lang.Override;

public class PreviewRecordActivity_ViewBinding implements Unbinder {
  private PreviewRecordActivity target;

  @UiThread
  public PreviewRecordActivity_ViewBinding(PreviewRecordActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public PreviewRecordActivity_ViewBinding(PreviewRecordActivity target, View source) {
    this.target = target;

    target.navigationBar = Utils.findRequiredViewAsType(source, R.id.navigationBar, "field 'navigationBar'", NavigationBar.class);
    target.tvTime = Utils.findRequiredViewAsType(source, R.id.tv_time, "field 'tvTime'", TextView.class);
    target.tvContent = Utils.findRequiredViewAsType(source, R.id.tv_content, "field 'tvContent'", TextView.class);
    target.listView = Utils.findRequiredViewAsType(source, R.id.listview_all_city, "field 'listView'", ListView.class);
    target.tvEditor = Utils.findRequiredViewAsType(source, R.id.tv_editor, "field 'tvEditor'", TextView.class);
    target.llAdd = Utils.findRequiredViewAsType(source, R.id.ll_add, "field 'llAdd'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    PreviewRecordActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.navigationBar = null;
    target.tvTime = null;
    target.tvContent = null;
    target.listView = null;
    target.tvEditor = null;
    target.llAdd = null;
  }
}
