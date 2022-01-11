// Generated by view binder compiler. Do not edit!
package ipca.example.photomap.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import ipca.example.photomap.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final FloatingActionButton fabAddPhoto;

  @NonNull
  public final ListView listViewPhotos;

  private FragmentHomeBinding(@NonNull ConstraintLayout rootView,
      @NonNull FloatingActionButton fabAddPhoto, @NonNull ListView listViewPhotos) {
    this.rootView = rootView;
    this.fabAddPhoto = fabAddPhoto;
    this.listViewPhotos = listViewPhotos;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fabAddPhoto;
      FloatingActionButton fabAddPhoto = ViewBindings.findChildViewById(rootView, id);
      if (fabAddPhoto == null) {
        break missingId;
      }

      id = R.id.listViewPhotos;
      ListView listViewPhotos = ViewBindings.findChildViewById(rootView, id);
      if (listViewPhotos == null) {
        break missingId;
      }

      return new FragmentHomeBinding((ConstraintLayout) rootView, fabAddPhoto, listViewPhotos);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
