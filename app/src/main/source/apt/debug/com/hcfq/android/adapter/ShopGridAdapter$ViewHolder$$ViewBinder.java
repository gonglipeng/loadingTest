// Generated code from Butter Knife. Do not modify!
package com.hcfq.android.adapter;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class ShopGridAdapter$ViewHolder$$ViewBinder<T extends ShopGridAdapter.ViewHolder> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131624423, "field 'car_image'");
    target.car_image = finder.castView(view, 2131624423, "field 'car_image'");
    view = finder.findRequiredView(source, 2131624424, "field 'car_logo'");
    target.car_logo = finder.castView(view, 2131624424, "field 'car_logo'");
    view = finder.findRequiredView(source, 2131624353, "field 'car_name'");
    target.car_name = finder.castView(view, 2131624353, "field 'car_name'");
    view = finder.findRequiredView(source, 2131624355, "field 'car_price'");
    target.car_price = finder.castView(view, 2131624355, "field 'car_price'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends ShopGridAdapter.ViewHolder> implements Unbinder {
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
      target.car_image = null;
      target.car_logo = null;
      target.car_name = null;
      target.car_price = null;
    }
  }
}
