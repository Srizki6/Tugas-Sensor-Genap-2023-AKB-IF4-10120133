package com.example.appsensorlocation;

//Nim   : 10120133
//Nama  : Muhammad Saeful Rizki
//Kelas : IF - 4

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity implements NavigationBarView.OnItemSelectedListener {

    private BottomNavigationView bottomNavigationView;
    private ProfileFragment profileFragment = new ProfileFragment();
    private FavoriteFragment favoritFragment = new FavoriteFragment();
    private LocationFragment locationFragment = new LocationFragment();
    private AboutFragment aboutFragment = new AboutFragment();
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottomView);
        bottomNavigationView.setOnItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.profile);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.profile:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, profileFragment).commit();
                return true;
            case R.id.favorit:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, favoritFragment).commit();
                return true;
            case R.id.location:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, locationFragment).commit();
                return true;
            case R.id.about:
                getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, aboutFragment).commit();
                return true;

        }
        return false;
    }
}