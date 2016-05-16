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

public class MainFragment$$ViewBinder<T extends MainFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131624096, "field 'multiStateView'");
    target.multiStateView = finder.castView(view, 2131624096, "field 'multiStateView'");
    view = finder.findRequiredView(source, 2131624353, "field 'carName'");
    target.carName = finder.castView(view, 2131624353, "field 'carName'");
    view = finder.findRequiredView(source, 2131624355, "field 'carPrice'");
    target.carPrice = finder.castView(view, 2131624355, "field 'carPrice'");
    view = finder.findRequiredView(source, 2131624389, "field 'carPic'");
    target.carPic = finder.castView(view, 2131624389, "field 'carPic'");
    view = finder.findRequiredView(source, 2131624392, "field 'carName1'");
    target.carName1 = finder.castView(view, 2131624392, "field 'carName1'");
    view = finder.findRequiredView(source, 2131624393, "field 'carPrice1'");
    target.carPrice1 = finder.castView(view, 2131624393, "field 'carPrice1'");
    view = finder.findRequiredView(source, 2131624396, "field 'carPic1'");
    target.carPic1 = finder.castView(view, 2131624396, "field 'carPic1'");
    view = finder.findRequiredView(source, 2131624398, "field 'carName2'");
    target.carName2 = finder.castView(view, 2131624398, "field 'carName2'");
    view = finder.findRequiredView(source, 2131624399, "field 'carPrice2'");
    target.carPrice2 = finder.castView(view, 2131624399, "field 'carPrice2'");
    view = finder.findRequiredView(source, 2131624402, "field 'carPic2'");
    target.carPic2 = finder.castView(view, 2131624402, "field 'carPic2'");
    view = finder.findRequiredView(source, 2131624352, "field 'carouselAdView'");
    target.carouselAdView = finder.castView(view, 2131624352, "field 'carouselAdView'");
    view = finder.findRequiredView(source, 2131624387, "method 'onClick'");
    unbinder.view2131624387 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = finder.findRequiredView(source, 2131624390, "method 'onClick'");
    unbinder.view2131624390 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = finder.findRequiredView(source, 2131624397, "method 'onClick'");
    unbinder.view2131624397 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = finder.findRequiredView(source, 2131624386, "method 'onClick'");
    unbinder.view2131624386 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = finder.findRequiredView(source, 2131624404, "method 'onClick'");
    unbinder.view2131624404 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = finder.findRequiredView(source, 2131624403, "method 'onClick'");
    unbinder.view2131624403 = view;
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

  protected static class InnerUnbinder<T extends MainFragment> implements Unbinder {
    private T target;

    View view2131624387;

    View view2131624390;

    View view2131624397;

    View view2131624386;

    View view2131624404;

    View view2131624403;

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
      target.multiStateView = null;
      target.carName = null;
      target.carPrice = null;
      target.carPic = null;
      target.carName1 = null;
      target.carPrice1 = null;
      target.carPic1 = null;
      target.carName2 = null;
      target.carPrice2 = null;
      target.carPic2 = null;
      target.carouselAdView = null;
      view2131624387.setOnClickListener(null);
      view2131624390.setOnClickListener(null);
      view2131624397.setOnClickListener(null);
      view2131624386.setOnClickListener(null);
      view2131624404.setOnClickListener(null);
      view2131624403.setOnClickListener(null);
    }
  }
}
