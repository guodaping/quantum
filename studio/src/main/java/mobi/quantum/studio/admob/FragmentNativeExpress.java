package mobi.quantum.studio.admob;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.NativeExpressAdView;

import mobi.quantum.studio.R;
import mobi.quantum.util.ContextHolder;

public class FragmentNativeExpress extends Fragment{

    private AdView mAdView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.admob_fragment_native_express, container, false);

        NativeExpressAdView adView = (NativeExpressAdView)rootView.findViewById(R.id.adView);
        adView.loadAd(new AdRequest.Builder().build());
        return rootView;
    }



    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }
}
