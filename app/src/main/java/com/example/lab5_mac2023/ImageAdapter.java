package com.example.lab5_mac2023;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends ArrayAdapter<Integer> {

    private Context mContext;
    private Integer[] mImageIds;

    public ImageAdapter(Context context, Integer[] imageIds) {
        super(context, 0, imageIds);
        mContext = context;
        mImageIds = imageIds;
    }

    // Override the getView() method to display the images in the GridView
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(200, 200));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            imageView = (ImageView) convertView;
        }

        // Load the image from its resource ID and display it in the ImageView
        imageView.setImageResource(mImageIds[position]);
        return imageView;
    }
}

