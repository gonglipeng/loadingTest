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

public class OrderActivity$$ViewBinder<T extends OrderActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131624155, "field 'addressTextView' and method 'OnClick'");
    target.addressTextView = finder.castView(view, 2131624155, "field 'addressTextView'");
    unbinder.view2131624155 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnClick(p0);
      }
    });
    view = finder.findRequiredView(source, 2131624156, "field 'name'");
    target.name = finder.castView(view, 2131624156, "field 'name'");
    view = finder.findRequiredView(source, 2131624157, "field 'user_phone'");
    target.user_phone = finder.castView(view, 2131624157, "field 'user_phone'");
    view = finder.findRequiredView(source, 2131624158, "field 'code'");
    target.code = finder.castView(view, 2131624158, "field 'code'");
    view = finder.findRequiredView(source, 2131624160, "field 'sendCode'");
    target.sendCode = finder.castView(view, 2131624160, "field 'sendCode'");
    view = finder.findRequiredView(source, 2131624095, "field 'phone'");
    target.phone = finder.castView(view, 2131624095, "field 'phone'");
    view = finder.findRequiredView(source, 2131624159, "field 'verify_img' and method 'OnClick'");
    target.verify_img = finder.castView(view, 2131624159, "field 'verify_img'");
    unbinder.view2131624159 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.OnClick(p0);
      }
    });
    view = finder.findRequiredView(source, 2131624096, "field 'multiStateView'");
    target.multiStateView = finder.castView(view, 2131624096, "field 'multiStateView'");
    view = finder.findRequiredView(source, 2131624161, "method 'OnClick'");
    unbinder.view2131624161 = view;
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

  protected static class InnerUnbinder<T extends OrderActivity> implements Unbinder {
    private T target;

    View view2131624155;

    View view2131624159;

    View view2131624161;

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
      view2131624155.setOnClickListener(null);
      target.addressTextView = null;
      target.name = null;
      target.user_phone = null;
      target.code = null;
      target.sendCode = null;
      target.phone = null;
      view2131624159.setOnClickListener(null);
      target.verify_img = null;
      target.multiStateView = null;
      view2131624161.setOnClickListener(null);
    }
  }
}
