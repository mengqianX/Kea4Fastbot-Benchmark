// Generated by view binder compiler. Do not edit!
package de.danoeh.antennapod.ui.discovery.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import de.danoeh.antennapod.ui.common.SquareImageView;
import de.danoeh.antennapod.ui.discovery.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class QuickFeedDiscoveryItemBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final SquareImageView discoveryCover;

  private QuickFeedDiscoveryItemBinding(@NonNull LinearLayout rootView,
      @NonNull SquareImageView discoveryCover) {
    this.rootView = rootView;
    this.discoveryCover = discoveryCover;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static QuickFeedDiscoveryItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static QuickFeedDiscoveryItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.quick_feed_discovery_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static QuickFeedDiscoveryItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.discovery_cover;
      SquareImageView discoveryCover = ViewBindings.findChildViewById(rootView, id);
      if (discoveryCover == null) {
        break missingId;
      }

      return new QuickFeedDiscoveryItemBinding((LinearLayout) rootView, discoveryCover);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
