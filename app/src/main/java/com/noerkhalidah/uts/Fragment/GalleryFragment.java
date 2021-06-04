package com.noerkhalidah.uts.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.noerkhalidah.uts.Adapter.AdapterGallery;
import com.noerkhalidah.uts.Entity.gallery;
import com.noerkhalidah.uts.Gallery;
import com.noerkhalidah.uts.R;

import java.util.ArrayList;

public class GalleryFragment extends Fragment{
    private RecyclerView rv;
    private ArrayList<gallery> list = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_gallery,container,false);
        rv = view.findViewById(R.id.rv_gallery);
        rv.setHasFixedSize(true);
        list.addAll(Gallery.getListData());
        ShowListGallery();
        return view;
    }

    void ShowListGallery(){
        rv.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        AdapterGallery galleryAdapter = new AdapterGallery(list);
        rv.setAdapter(galleryAdapter);
    }
}

