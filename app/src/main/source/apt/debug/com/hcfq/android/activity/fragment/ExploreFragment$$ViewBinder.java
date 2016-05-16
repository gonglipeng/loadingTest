// Generated code from Butter Knife. Do not modify!
package com.hcfq.android.activity.fragment;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class ExploreFragment$$ViewBinder<T extends ExploreFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131624366, "field 'serviceLayout' and method 'onClick'");
    target.serviceLayout = finder.castView(view, 2131624366, "field 'serviceLayout'");
    unbinder.view2131624366 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = finder.findRequiredView(source, 2131624367, "field 'aboutUsLayout' and method 'onClick'");
    target.aboutUsLayout = finder.castView(view, 2131624367, "field 'aboutUsLayout'");
    unbinder.view2131624367 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = finder.findRequiredView(source, 2131624368, "field 'ideaPostLayout' and method 'onClick'");
    target.ideaPostLayout = finder.castView(view, 2131624368, "field 'ideaPostLayout'");
    unbinder.view2131624368 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = finder.findRequiredView(source, 2131624205, "field 'banner'");
    target.banner = finder.castView(view, 2131624205, "field 'banner'");
    view = finder.findRequiredView(source, 2131624371, "method 'onClick'");
    unbinder.view2131624371 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = finder.findRequiredView(source, 2131624370, "method 'onClick'");
    unbinder.view2131624370 = view;
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

  protected static class InnerUnbinder<T extends ExploreFragment> implements Unbinder {
    private T target;

    View view2131624366;

    View view2131624367;

    View view2131624368;

    View view2131624371;

    View view2131624370;

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
      view2131624366.setOnClickListener(null);
      target.serviceLayout = null;
      view2131624367.setOnClickListener(null);
      target.aboutUsLayout = null;
      view2131624368.setOnClickListener(null);
      target.ideaPostLayout = null;
      target.banner = null;
      view2131624371.setOnClickListener(null);
      view2131624370.setOnClickListener(null);
    }
  }
}
