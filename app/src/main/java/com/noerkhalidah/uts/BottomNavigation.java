package com.noerkhalidah.uts;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.noerkhalidah.uts.Fragment.DailyActivityFragment;
import com.noerkhalidah.uts.Fragment.GalleryFragment;
import com.noerkhalidah.uts.Fragment.HomeFragment;
import com.noerkhalidah.uts.Fragment.MusicVideoFragment;
import com.noerkhalidah.uts.Fragment.ProfileFragment;

public class BottomNavigation extends AppCompatActivity implements
        BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);

        // kita set default nya Home Fragment
        loadFragment(new HomeFragment());

        // inisialisasi BottomNavigaionView
        BottomNavigationView bottomNavigationView = findViewById(R.id.bn_main);

        // beri listener pada saat item/menu bottomnavigation terpilih
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    private boolean loadFragment(Fragment fragment){
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fl_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;
        switch (menuItem.getItemId()){
            case R.id.home:
                fragment = new HomeFragment();
                break;
            case R.id.daily:
                fragment = new DailyActivityFragment();
                break;
            case R.id.gallery:
                fragment = new GalleryFragment();
                break;
            case R.id.musicvideo:
                fragment = new MusicVideoFragment();
                break;
            case R.id.profile:
                fragment = new ProfileFragment();
                break;
        }
        return loadFragment(fragment);
    }
}
