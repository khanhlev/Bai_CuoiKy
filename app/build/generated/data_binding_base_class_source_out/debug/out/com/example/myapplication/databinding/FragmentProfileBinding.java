// Generated by view binder compiler. Do not edit!
package com.example.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentProfileBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageView imageviewBack;

  @NonNull
  public final ImageView imageviewLogout;

  @NonNull
  public final RelativeLayout imgUser;

  @NonNull
  public final LinearLayout linlay1;

  @NonNull
  public final RelativeLayout rellay1;

  @NonNull
  public final TextView tvAddress;

  @NonNull
  public final TextView tvName;

  private FragmentProfileBinding(@NonNull RelativeLayout rootView, @NonNull ImageView imageviewBack,
      @NonNull ImageView imageviewLogout, @NonNull RelativeLayout imgUser,
      @NonNull LinearLayout linlay1, @NonNull RelativeLayout rellay1, @NonNull TextView tvAddress,
      @NonNull TextView tvName) {
    this.rootView = rootView;
    this.imageviewBack = imageviewBack;
    this.imageviewLogout = imageviewLogout;
    this.imgUser = imgUser;
    this.linlay1 = linlay1;
    this.rellay1 = rellay1;
    this.tvAddress = tvAddress;
    this.tvName = tvName;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentProfileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_profile, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentProfileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.imageviewBack;
      ImageView imageviewBack = ViewBindings.findChildViewById(rootView, id);
      if (imageviewBack == null) {
        break missingId;
      }

      id = R.id.imageviewLogout;
      ImageView imageviewLogout = ViewBindings.findChildViewById(rootView, id);
      if (imageviewLogout == null) {
        break missingId;
      }

      id = R.id.imgUser;
      RelativeLayout imgUser = ViewBindings.findChildViewById(rootView, id);
      if (imgUser == null) {
        break missingId;
      }

      id = R.id.linlay1;
      LinearLayout linlay1 = ViewBindings.findChildViewById(rootView, id);
      if (linlay1 == null) {
        break missingId;
      }

      id = R.id.rellay1;
      RelativeLayout rellay1 = ViewBindings.findChildViewById(rootView, id);
      if (rellay1 == null) {
        break missingId;
      }

      id = R.id.tv_address;
      TextView tvAddress = ViewBindings.findChildViewById(rootView, id);
      if (tvAddress == null) {
        break missingId;
      }

      id = R.id.tv_name;
      TextView tvName = ViewBindings.findChildViewById(rootView, id);
      if (tvName == null) {
        break missingId;
      }

      return new FragmentProfileBinding((RelativeLayout) rootView, imageviewBack, imageviewLogout,
          imgUser, linlay1, rellay1, tvAddress, tvName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
