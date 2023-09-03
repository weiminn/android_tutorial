package com.weiminn.fragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class MyPagerAdapter extends PagerAdapter {

    private Context mContext;

    public MyPagerAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        ModelCourse modelCourse = ModelCourse.values()[position];
        LayoutInflater inflater = LayoutInflater.from(mContext);

        ViewGroup layout = (ViewGroup) inflater.inflate(
                modelCourse.getmLayoutID(),
                container,
                false);

        container.addView(layout);
        return layout;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        super.destroyItem(container, position, object);
    }

    /**
     * Return the number of views available.
     */
    @Override
    public int getCount() {
        return ModelCourse.values().length;
    }

    /**
     * Determines whether a page View is associated with a specific key object
     * as returned by {@link #instantiateItem(ViewGroup, int)}. This method is
     * required for a PagerAdapter to function properly.
     *
     * @param view   Page View to check for association with <code>object</code>
     * @param object Object to check for association with <code>view</code>
     * @return true if <code>view</code> is associated with the key object <code>object</code>
     */
    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return false;
    }
}
