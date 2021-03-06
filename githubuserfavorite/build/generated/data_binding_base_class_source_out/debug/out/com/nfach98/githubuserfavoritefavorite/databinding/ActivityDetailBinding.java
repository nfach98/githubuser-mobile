// Generated by view binder compiler. Do not edit!
package com.nfach98.githubuserfavoritefavorite.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.nfach98.githubuserfavoritefavorite.R;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDetailBinding implements ViewBinding {
  @NonNull
  private final MotionLayout rootView;

  @NonNull
  public final ImageView home;

  @NonNull
  public final CircleImageView ivAvatar;

  @NonNull
  public final ProgressBar loading;

  @NonNull
  public final NestedScrollView scrollView;

  @NonNull
  public final TabLayout tabs;

  @NonNull
  public final ImageFilterView toolbarImage;

  @NonNull
  public final TextView tvBio;

  @NonNull
  public final TextView tvLocation;

  @NonNull
  public final TextView tvName;

  @NonNull
  public final TextView tvUsername;

  @NonNull
  public final ViewPager2 viewPager;

  private ActivityDetailBinding(@NonNull MotionLayout rootView, @NonNull ImageView home,
      @NonNull CircleImageView ivAvatar, @NonNull ProgressBar loading,
      @NonNull NestedScrollView scrollView, @NonNull TabLayout tabs,
      @NonNull ImageFilterView toolbarImage, @NonNull TextView tvBio, @NonNull TextView tvLocation,
      @NonNull TextView tvName, @NonNull TextView tvUsername, @NonNull ViewPager2 viewPager) {
    this.rootView = rootView;
    this.home = home;
    this.ivAvatar = ivAvatar;
    this.loading = loading;
    this.scrollView = scrollView;
    this.tabs = tabs;
    this.toolbarImage = toolbarImage;
    this.tvBio = tvBio;
    this.tvLocation = tvLocation;
    this.tvName = tvName;
    this.tvUsername = tvUsername;
    this.viewPager = viewPager;
  }

  @Override
  @NonNull
  public MotionLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.home;
      ImageView home = rootView.findViewById(id);
      if (home == null) {
        break missingId;
      }

      id = R.id.iv_avatar;
      CircleImageView ivAvatar = rootView.findViewById(id);
      if (ivAvatar == null) {
        break missingId;
      }

      id = R.id.loading;
      ProgressBar loading = rootView.findViewById(id);
      if (loading == null) {
        break missingId;
      }

      id = R.id.scroll_view;
      NestedScrollView scrollView = rootView.findViewById(id);
      if (scrollView == null) {
        break missingId;
      }

      id = R.id.tabs;
      TabLayout tabs = rootView.findViewById(id);
      if (tabs == null) {
        break missingId;
      }

      id = R.id.toolbar_image;
      ImageFilterView toolbarImage = rootView.findViewById(id);
      if (toolbarImage == null) {
        break missingId;
      }

      id = R.id.tv_bio;
      TextView tvBio = rootView.findViewById(id);
      if (tvBio == null) {
        break missingId;
      }

      id = R.id.tv_location;
      TextView tvLocation = rootView.findViewById(id);
      if (tvLocation == null) {
        break missingId;
      }

      id = R.id.tv_name;
      TextView tvName = rootView.findViewById(id);
      if (tvName == null) {
        break missingId;
      }

      id = R.id.tv_username;
      TextView tvUsername = rootView.findViewById(id);
      if (tvUsername == null) {
        break missingId;
      }

      id = R.id.view_pager;
      ViewPager2 viewPager = rootView.findViewById(id);
      if (viewPager == null) {
        break missingId;
      }

      return new ActivityDetailBinding((MotionLayout) rootView, home, ivAvatar, loading, scrollView,
          tabs, toolbarImage, tvBio, tvLocation, tvName, tvUsername, viewPager);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
