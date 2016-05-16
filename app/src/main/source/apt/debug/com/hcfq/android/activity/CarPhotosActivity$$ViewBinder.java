// Generated code from Butter Knife. Do not modify!
package com.hcfq.android.activity;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class CarPhotosActivity$$ViewBinder<T extends CarPhotosActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131624102, "field 'recyclerView'");
    target.recyclerView = finder.castView(view, 2131624102, "field 'recyclerView'");
    view = finder.findRequiredView(source, 2131624101, "field 'segmentControl'");
    target.segmentControl = finder.castView(view, 2131624101, "field 'segmentControl'");
    view = finder.findRequiredView(source, 2131624096, "field 'multiStateView'");
    target.multiStateView = finder.castView(view, 2131624096, "field 'multiStateView'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends CarPhotosActivity> implements Unbinder {
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
      target.recyclerView = null;
      target.segmentControl = null;
      target.multiStateView = null;
    }
  }
}
