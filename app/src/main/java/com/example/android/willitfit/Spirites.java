package com.example.android.willitfit;

import android.media.Image;

/**
 * Created by Ja on 2016-03-13
 */
public class Spirites {
    Image image;
    int x;
    int y;

    public Spirites(int a,int b,String img){
        init_Spirites(a,b,img);
    }

    private void init_Spirites(int a,int b,String img){
        x=a;
        y=b;
    }
}
