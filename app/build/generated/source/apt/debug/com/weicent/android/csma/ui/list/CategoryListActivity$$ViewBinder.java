// Generated code from Butter Knife. Do not modify!
package com.weicent.android.csma.ui.list;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class CategoryListActivity$$ViewBinder<T extends com.weicent.android.csma.ui.list.CategoryListActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427493, "field 'layoutLoading'");
    target.layoutLoading = finder.castView(view, 2131427493, "field 'layoutLoading'");
    view = finder.findRequiredView(source, 2131427494, "field 'layoutMsg'");
    target.layoutMsg = finder.castView(view, 2131427494, "field 'layoutMsg'");
    view = finder.findRequiredView(source, 2131427495, "field 'layoutMsgText'");
    target.layoutMsgText = finder.castView(view, 2131427495, "field 'layoutMsgText'");
    view = finder.findRequiredView(source, 2131427416, "field 'mLayoutContext'");
    target.mLayoutContext = finder.castView(view, 2131427416, "field 'mLayoutContext'");
    view = finder.findRequiredView(source, 2131427418, "field 'listView'");
    target.listView = finder.castView(view, 2131427418, "field 'listView'");
    view = finder.findRequiredView(source, 2131427417, "field 'abPullToRefreshView'");
    target.abPullToRefreshView = finder.castView(view, 2131427417, "field 'abPullToRefreshView'");
  }

  @Override public void unbind(T target) {
    target.layoutLoading = null;
    target.layoutMsg = null;
    target.layoutMsgText = null;
    target.mLayoutContext = null;
    target.listView = null;
    target.abPullToRefreshView = null;
  }
}
