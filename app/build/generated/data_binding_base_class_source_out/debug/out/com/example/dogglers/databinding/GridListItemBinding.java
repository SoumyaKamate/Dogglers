// Generated by view binder compiler. Do not edit!
package com.example.dogglers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.dogglers.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class GridListItemBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final ImageView imgBella;

  @NonNull
  public final TextView tvAge;

  @NonNull
  public final TextView tvBella;

  @NonNull
  public final TextView tvHobbies;

  private GridListItemBinding(@NonNull MaterialCardView rootView, @NonNull ImageView imgBella,
      @NonNull TextView tvAge, @NonNull TextView tvBella, @NonNull TextView tvHobbies) {
    this.rootView = rootView;
    this.imgBella = imgBella;
    this.tvAge = tvAge;
    this.tvBella = tvBella;
    this.tvHobbies = tvHobbies;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static GridListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static GridListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.grid_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static GridListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.img_bella;
      ImageView imgBella = ViewBindings.findChildViewById(rootView, id);
      if (imgBella == null) {
        break missingId;
      }

      id = R.id.tv_age;
      TextView tvAge = ViewBindings.findChildViewById(rootView, id);
      if (tvAge == null) {
        break missingId;
      }

      id = R.id.tv_bella;
      TextView tvBella = ViewBindings.findChildViewById(rootView, id);
      if (tvBella == null) {
        break missingId;
      }

      id = R.id.tv_hobbies;
      TextView tvHobbies = ViewBindings.findChildViewById(rootView, id);
      if (tvHobbies == null) {
        break missingId;
      }

      return new GridListItemBinding((MaterialCardView) rootView, imgBella, tvAge, tvBella,
          tvHobbies);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
