package com.noerkhalidah.uts;

import com.noerkhalidah.uts.Entity.gallery;

import java.util.ArrayList;

public class Gallery {
    private static int[] galleryItems ={

            R.drawable.g1,
            R.drawable.g2,
            R.drawable.g3,
            R.drawable.g4,
            R.drawable.g5
    };

    public static ArrayList<gallery> getListData(){
        ArrayList<gallery> list = new ArrayList<>();
        for (int position = 0; position < galleryItems.length; position++){
            gallery day = new gallery();
            day.setGalleryItems(galleryItems[position]);
            list.add(day);
        }
        return list;
    }
}

