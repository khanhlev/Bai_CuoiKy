// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager.widget.ViewPager;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import me.relex.circleindicator.CircleIndicator;

public final class FragmentTrangChuBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final CircleIndicator circleCenter;

  @NonNull
  public final RecyclerView rvFood;

  @NonNull
  public final ViewPager viewPager;

  private FragmentTrangChuBinding(@NonNull LinearLayout rootView,
      @NonNull CircleIndicator circleCenter, @NonNull RecyclerView rvFood,
      @NonNull ViewPager viewPager) {
    this.rootView = rootView;
    this.circleCenter = circleCenter;
    this.rvFood = rvFood;
    this.viewPager = viewPager;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentTrangChuBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentTrangChuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_trang_chu, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentTrangChuBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.circle_center;
      CircleIndicator circleCenter = ViewBindings.findChildViewById(rootView, id);
      if (circleCenter == null) {
        break missingId;
      }

      id = R.id.rv_food;
      RecyclerView rvFood = ViewBindings.findChildViewById(rootView, id);
      if (rvFood == null) {
        break missingId;
      }

      id = R.id.view_pager;
      ViewPager viewPager = ViewBindings.findChildViewById(rootView, id);
      if (viewPager == null) {
        break missingId;
      }

      return new FragmentTrangChuBinding((LinearLayout) rootView, circleCenter, rvFood, viewPager);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
