package com.tdk.cby.taraftarduvarkad;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by yunus on 8.12.2017.
 */

public class ImageAdapter_SSL extends BaseAdapter {
    private Context mContext;

    public ImageAdapter_SSL(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(150, 150));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // references to our images
    private Integer[] mThumbIds = {
            R.drawable.akhisar, R.drawable.alanya,
            R.drawable.antalya, R.drawable.basaksehir,
            R.drawable.bjk, R.drawable.bursa,
            R.drawable.fener, R.drawable.genclerbirligi,
            R.drawable.goztepe, R.drawable.gs,
            R.drawable.karabuk, R.drawable.kasimpasa,
            R.drawable.kayseri, R.drawable.konya,
            R.drawable.malatya, R.drawable.osmanli,
            R.drawable.sivas, R.drawable.trabzon
    };
}
