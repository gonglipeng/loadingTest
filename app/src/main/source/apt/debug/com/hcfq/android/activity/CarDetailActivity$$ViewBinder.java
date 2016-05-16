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

public class CarDetailActivity$$ViewBinder<T extends CarDetailActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131624097, "field 'draglayout'");
    target.draglayout = finder.castView(view, 2131624097, "field 'draglayout'");
    view = finder.findRequiredView(source, 2131624096, "field 'multiStateView'");
    target.multiStateView = finder.castView(view, 2131624096, "field 'multiStateView'");
    view = finder.findRequiredView(source, 2131623945, "field 'titleView'");
    target.titleView = finder.castView(view, 2131623945, "field 'titleView'");
    view = finder.findRequiredView(source, 2131624100, "method 'OnClick'");
    unbinder.view2131624100 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnClick(p0);
      }
    });
    view = finder.findRequiredView(source, 2131624094, "method 'OnClick'");
    unbinder.view2131624094 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnClick(p0);
      }
    });
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends CarDetailActivity> implements Unbinder {
    private T target;

    View view2131624100;

    View view2131624094;

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
      target.draglayout = null;
      target.multiStateView = null;
      target.titleView = null;
      view2131624100.setOnClickListener(null);
      view2131624094.setOnClickListener(null);
    }
  }
}
