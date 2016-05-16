// Generated code from Butter Knife. Do not modify!
package com.hcfq.android.activity;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class QuestionDetailActivity$$ViewBinder<T extends QuestionDetailActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131624050, "field 'title'");
    target.title = finder.castView(view, 2131624050, "field 'title'");
    view = finder.findRequiredView(source, 2131624021, "field 'content'");
    target.content = finder.castView(view, 2131624021, "field 'content'");
    view = finder.findRequiredView(source, 2131624204, "field 'tag'");
    target.tag = finder.castView(view, 2131624204, "field 'tag'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends QuestionDetailActivity> implements Unbinder {
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
      target.title = null;
      target.content = null;
      target.tag = null;
    }
  }
}
