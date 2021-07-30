package io.ionic.demo.ecommerce.ui.product;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.getcapacitor.WebViewListener;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;

import io.ionic.demo.ecommerce.R;
import io.ionic.demo.ecommerce.plugins.ShopAPIPlugin;
import io.ionic.demo.ecommerce.portals.FadeBridgeFragment;
import io.ionic.portalslibrary.Portal;
import io.ionic.portalslibrary.PortalFragment;
import io.ionic.portalslibrary.PortalManager;
import io.ionic.portalslibrary.PortalView;

/**
 * Displays an Ionic Portal containing a help app.
 */
public class HelpFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_help, container, false);

    }
}
