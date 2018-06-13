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
import com.canplay.milk.view.ClearEditText;
import com.canplay.milk.view.NavigationBar;
import com.canplay.milk.view.SideLetterBars;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SearchMilkActivity_ViewBinding implements Unbinder {
  private SearchMilkActivity target;

  @UiThread
  public SearchMilkActivity_ViewBinding(SearchMilkActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SearchMilkActivity_ViewBinding(SearchMilkActivity target, View source) {
    this.target = target;

    target.navigationBar = Utils.findRequiredViewAsType(source, R.id.navigationBar, "field 'navigationBar'", NavigationBar.class);
    target.etSearch = Utils.findRequiredViewAsType(source, R.id.et_search, "field 'etSearch'", ClearEditText.class);
    target.llBg = Utils.findRequiredViewAsType(source, R.id.ll_bg, "field 'llBg'", LinearLayout.class);
    target.mListView = Utils.findRequiredViewAsType(source, R.id.listview_all_city, "field 'mListView'", ListView.class);
    target.mLetterBar = Utils.findRequiredViewAsType(source, R.id.side_letter_bars, "field 'mLetterBar'", SideLetterBars.class);
    target.overlay = Utils.findRequiredViewAsType(source, R.id.tv_letter_overlay, "field 'overlay'", TextView.class);
    target.tvAdd = Utils.findRequiredViewAsType(source, R.id.tv_add, "field 'tvAdd'", TextView.class);
    target.llAdd = Utils.findRequiredViewAsType(source, R.id.ll_add, "field 'llAdd'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SearchMilkActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.navigationBar = null;
    target.etSearch = null;
    target.llBg = null;
    target.mListView = null;
    target.mLetterBar = null;
    target.overlay = null;
    target.tvAdd = null;
    target.llAdd = null;
  }
}
