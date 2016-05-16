// Generated code from Butter Knife. Do not modify!
package com.hcfq.android.activity;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class PhotoActivity$$ViewBinder<T extends PhotoActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131624132, "field 'viewpager'");
    target.viewpager = finder.castView(view, 2131624132, "field 'viewpager'");
    view = finder.findRequiredView(source, 2131624202, "field 'photoNum'");
    target.photoNum = finder.castView(view, 2131624202, "field 'photoNum'");
    view = finder.findRequiredView(source, 2131624203, "field 'photoCount'");
    target.photoCount = finder.castView(view, 2131624203, "field 'photoCount'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends PhotoActivity> implements Unbinder {
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
      target.viewpager = null;
      target.photoNum = null;
      target.photoCount = null;
    }
  }
}
