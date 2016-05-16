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

public class QuestionsActivity$$ViewBinder<T extends QuestionsActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131624132, "field 'viewPager'");
    target.viewPager = finder.castView(view, 2131624132, "field 'viewPager'");
    view = finder.findRequiredView(source, 2131624133, "field 'tabLayout'");
    target.tabLayout = finder.castView(view, 2131624133, "field 'tabLayout'");
    view = finder.findRequiredView(source, 2131624205, "field 'banner'");
    target.banner = finder.castView(view, 2131624205, "field 'banner'");
    view = finder.findRequiredView(source, 2131624206, "field 'fab' and method 'call'");
    target.fab = finder.castView(view, 2131624206, "field 'fab'");
    unbinder.view2131624206 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.call(p0);
      }
    });
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends QuestionsActivity> implements Unbinder {
    private T target;

    View view2131624206;

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
      target.viewPager = null;
      target.tabLayout = null;
      target.banner = null;
      view2131624206.setOnClickListener(null);
      target.fab = null;
    }
  }
}
