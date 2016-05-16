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

public class CarParametersFragment$$ViewBinder<T extends CarParametersFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131624352, "field 'carouselAdView'");
    target.carouselAdView = finder.castView(view, 2131624352, "field 'carouselAdView'");
    view = finder.findRequiredView(source, 2131624356, "field 'colorGroup'");
    target.colorGroup = finder.castView(view, 2131624356, "field 'colorGroup'");
    view = finder.findRequiredView(source, 2131624357, "field 'typeGroup'");
    target.typeGroup = finder.castView(view, 2131624357, "field 'typeGroup'");
    view = finder.findRequiredView(source, 2131624358, "field 'priceNameGroup'");
    target.priceNameGroup = finder.castView(view, 2131624358, "field 'priceNameGroup'");
    view = finder.findRequiredView(source, 2131624362, "field 'priceGroup'");
    target.priceGroup = finder.castView(view, 2131624362, "field 'priceGroup'");
    view = finder.findRequiredView(source, 2131624353, "field 'carName'");
    target.carName = finder.castView(view, 2131624353, "field 'carName'");
    view = finder.findRequiredView(source, 2131624354, "field 'carGonggao' and method 'onClick'");
    target.carGonggao = finder.castView(view, 2131624354, "field 'carGonggao'");
    unbinder.view2131624354 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = finder.findRequiredView(source, 2131624355, "field 'carPrice'");
    target.carPrice = finder.castView(view, 2131624355, "field 'carPrice'");
    view = finder.findRequiredView(source, 2131624363, "field 'carNum'");
    target.carNum = finder.castView(view, 2131624363, "field 'carNum'");
    view = finder.findRequiredView(source, 2131624359, "field 'paydown0'");
    target.paydown0 = finder.castView(view, 2131624359, "field 'paydown0'");
    view = finder.findRequiredView(source, 2131624360, "field 'paydown10'");
    target.paydown10 = finder.castView(view, 2131624360, "field 'paydown10'");
    view = finder.findRequiredView(source, 2131624361, "field 'paydown20'");
    target.paydown20 = finder.castView(view, 2131624361, "field 'paydown20'");
    view = finder.findRequiredView(source, 2131624365, "field 'carPhotoView' and method 'onClick'");
    target.carPhotoView = finder.castView(view, 2131624365, "field 'carPhotoView'");
    unbinder.view2131624365 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onClick(p0);
      }
    });
    view = finder.findRequiredView(source, 2131624364, "method 'onClick'");
    unbinder.view2131624364 = view;
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

  protected static class InnerUnbinder<T extends CarParametersFragment> implements Unbinder {
    private T target;

    View view2131624354;

    View view2131624365;

    View view2131624364;

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
      target.carouselAdView = null;
      target.colorGroup = null;
      target.typeGroup = null;
      target.priceNameGroup = null;
      target.priceGroup = null;
      target.carName = null;
      view2131624354.setOnClickListener(null);
      target.carGonggao = null;
      target.carPrice = null;
      target.carNum = null;
      target.paydown0 = null;
      target.paydown10 = null;
      target.paydown20 = null;
      view2131624365.setOnClickListener(null);
      target.carPhotoView = null;
      view2131624364.setOnClickListener(null);
    }
  }
}
