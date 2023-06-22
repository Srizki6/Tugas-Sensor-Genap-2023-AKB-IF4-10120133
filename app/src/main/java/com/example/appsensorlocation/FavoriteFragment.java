package com.example.appsensorlocation;

//Nim   : 10120133
//Nama  : Muhammad Saeful Rizki
//Kelas : IF - 4

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class FavoriteFragment extends Fragment {

    private OnMapReadyCallback callback = new OnMapReadyCallback() {

        /**
         * Manipulates the map once available.
         * This callback is triggered when the map is ready to be used.
         * This is where we can add markers or lines, add listeners or move the camera.
         * In this case, we just add a marker near Sydney, Australia.
         * If Google Play services is not installed on the device, the user will be prompted to
         * install it inside the SupportMapFragment. This method will only be triggered once the
         * user has installed Google Play services and returned to the app.
         */
        @Override
        public void onMapReady(GoogleMap googleMap) {
            // Tambahkan marker untuk lokasi pertama
            LatLng lokasi1 = new LatLng(-6.811961139552679, 107.62408429295654);
            googleMap.addMarker(new MarkerOptions()
                    .position(lokasi1)
                    .title("Sebalak Warma")
                    .snippet("Seblak Warma"));

            // Tambahkan marker untuk lokasi kedua
            LatLng lokasi2 = new LatLng(-6.814307581269577, 107.6226962496602);
            googleMap.addMarker(new MarkerOptions()
                    .position(lokasi2)
                    .title("Nasi Padang Rai Raka")
                    .snippet("Nasi Padang Rai Raka"));

            // Tambahkan marker untuk lokasi ketiga
            LatLng lokasi3 = new LatLng(-6.817686274544201, 107.62256760679941);
            googleMap.addMarker(new MarkerOptions()
                    .position(lokasi3)
                    .title("Warung Nasi Dan Baso Melati 1")
                    .snippet("Warung Nasi Dan Baso Melati 1"));

            // Tambahkan marker untuk lokasi keempat
            LatLng lokasi4 = new LatLng(-6.817658294749608, 107.62225693277315);
            googleMap.addMarker(new MarkerOptions()
                    .position(lokasi4)
                    .title("Baso Rudal Simpang 5")
                    .snippet("Baso Rudal Simoang 5"));

            // Tambahkan marker untuk lokasi kelima
            LatLng lokasi5 = new LatLng(-6.81423906032146, 107.62312301890005);
            googleMap.addMarker(new MarkerOptions()
                    .position(lokasi5)
                    .title("Kedai Bubut Ayam Tibelat")
                    .snippet("Kedai Bubur Ayam Tibelat"));

            // Zoom ke lokasi pertama
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lokasi1, 30));
        }
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_favorite, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment =
                (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(callback);
        }
    }
}