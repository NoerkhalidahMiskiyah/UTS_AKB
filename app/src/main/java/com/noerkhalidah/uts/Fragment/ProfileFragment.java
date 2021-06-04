package com.noerkhalidah.uts.Fragment;


import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.noerkhalidah.uts.R;

import org.jetbrains.annotations.NotNull;


public class ProfileFragment extends Fragment {

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater,
                             @Nullable @org.jetbrains.annotations.Nullable ViewGroup container,
                             @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    public void shareToInstagram(View view) {
        Intent instagram = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/mskyh_/"));
        startActivity(instagram);
    }


}