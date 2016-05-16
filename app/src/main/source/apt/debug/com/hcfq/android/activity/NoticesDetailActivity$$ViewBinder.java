// Generated code from Butter Knife. Do not modify!
package com.hcfq.android.activity;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class NoticesDetailActivity$$ViewBinder<T extends NoticesDetailActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131624315, "field 'webView'");
    target.webView = finder.castView(view, 2131624315, "field 'webView'");
    view = finder.findRequiredView(source, 2131623945, "field 'titleView'");
    target.titleView = finder.castView(view, 2131623945, "field 'titleView'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends NoticesDetailActivity> implements Unbinder {
    private T target;

    protected InnerUnbinder(T target) {
      this.target = target;
    }

    @Override
    public final void unbind() {
      if (target == null) throw new IllegalStateException("Bindings already cleared.");
      unbind(target);
      target = null;
    }

    protected void unbind(T target) {
      target.webView = null;
      target.titleView = null;
    }
  }
}
