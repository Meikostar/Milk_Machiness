// Generated code from Butter Knife. Do not modify!
package com.canplay.milk.mvp.activity.home;

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
import com.canplay.milk.view.SideLetterBars;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MilkListActivity_ViewBinding implements Unbinder {
  private MilkListActivity target;

  @UiThread
  public MilkListActivity_ViewBinding(MilkListActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MilkListActivity_ViewBinding(MilkListActivity target, View source) {
    this.target = target;

    target.navigationBar = Utils.findRequiredViewAsType(source, R.id.navigationBar, "field 'navigationBar'", NavigationBar.class);
    target.mListView = Utils.findRequiredViewAsType(source, R.id.listview_all_city, "field 'mListView'", ListView.class);
    target.overlay = Utils.findRequiredViewAsType(source, R.id.tv_letter_overlay, "field 'overlay'", TextView.class);
    target.mLetterBar = Utils.findRequiredViewAsType(source, R.id.side_letter_bars, "field 'mLetterBar'", SideLetterBars.class);
    target.tvAdd = Utils.findRequiredViewAsType(source, R.id.tv_add, "field 'tvAdd'", TextView.class);
    target.llAdd = Utils.findRequiredViewAsType(source, R.id.ll_add, "field 'llAdd'", LinearLayout.class);
    target.tvSearch = Utils.findRequiredViewAsType(source, R.id.tv_search, "field 'tvSearch'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MilkListActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.navigationBar = null;
    target.mListView = null;
    target.overlay = null;
    target.mLetterBar = null;
    target.tvAdd = null;
    target.llAdd = null;
    target.tvSearch = null;
  }
}
