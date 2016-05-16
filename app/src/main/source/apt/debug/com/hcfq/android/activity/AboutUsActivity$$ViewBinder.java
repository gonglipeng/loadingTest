// Generated code from Butter Knife. Do not modify!
package com.hcfq.android.activity;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class AboutUsActivity$$ViewBinder<T extends AboutUsActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131624089, "field 'version'");
    target.version = finder.castView(view, 2131624089, "field 'version'");
    view = finder.findRequiredView(source, 2131624091, "field 'weibo'");
    target.weibo = finder.castView(view, 2131624091, "field 'weibo'");
    view = finder.findRequiredView(source, 2131624093, "field 'weixing'");
    target.weixing = finder.castView(view, 2131624093, "field 'weixing'");
    view = finder.findRequiredView(source, 2131624095, "field 'phone'");
    target.phone = finder.castView(view, 2131624095, "field 'phone'");
    view = finder.findRequiredView(source, 2131624088, "method 'gotoCompany'");
    unbinder.view2131624088 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.gotoCompany(p0);
      }
    });
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends AboutUsActivity> implements Unbinder {
    private T target;

    View view2131624088;

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
      target.version = null;
      target.weibo = null;
      target.weixing = null;
      target.phone = null;
      view2131624088.setOnClickListener(null);
    }
  }
}
