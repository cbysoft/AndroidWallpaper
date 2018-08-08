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

public class ImageAdapter extends BaseAdapter {
    private Context mContext;

    public ImageAdapter(Context c) {
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

            R.drawable.adanademirspor, R.drawable.adanaspor,
            R.drawable.altinordu, R.drawable.ankaragucu,
            R.drawable.balikesirspor, R.drawable.bberzurumspor,
            R.drawable.boluspor, R.drawable.caykurrizespor,
            R.drawable.denizlispor, R.drawable.elazigspor,
            R.drawable.eskisehirspor, R.drawable.gaziantepbb,
            R.drawable.gaziantepspor, R.drawable.giresunspor,
            R.drawable.istanbulspor, R.drawable.manisaspor,
            R.drawable.samsunspor, R.drawable.umraniyespor
    };
}
