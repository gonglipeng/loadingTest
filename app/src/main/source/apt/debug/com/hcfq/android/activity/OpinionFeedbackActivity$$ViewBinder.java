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

public class OpinionFeedbackActivity$$ViewBinder<T extends OpinionFeedbackActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131624021, "field 'content'");
    target.content = finder.castView(view, 2131624021, "field 'content'");
    view = finder.findRequiredView(source, 2131624153, "field 'contacts'");
    target.contacts = finder.castView(view, 2131624153, "field 'contacts'");
    view = finder.findRequiredView(source, 2131624154, "method 'onClick'");
    unbinder.view2131624154 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends OpinionFeedbackActivity> implements Unbinder {
    private T target;

    View view2131624154;

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
      target.content = null;
      target.contacts = null;
      view2131624154.setOnClickListener(null);
    }
  }
}
