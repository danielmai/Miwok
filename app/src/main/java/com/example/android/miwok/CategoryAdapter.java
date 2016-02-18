package com.example.android.miwok;


import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * {@link CategoryAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list of {@link Word} objects.
 */
public class CategoryAdapter extends FragmentPagerAdapter {
    /**
     * List of the category fragments that will be displayed in the view pager
     */
    private final List<Fragment> mFragments = new ArrayList<Fragment>();

    /**
     * List of the category names for each fragment. The names will show up in the
     * {@link TabLayout}
     */
    private final List<String> mFragmentTitles = new ArrayList<String>();

    /**
     * Create a new {@link CategoryAdapter} object.
     *
     * @param fm is the fragment manager that will keep each fragment's state in the adapter
     *           across swipes.
     */
    public CategoryAdapter(FragmentManager fm) {
        super(fm);
    }

    /**
     * Add a fragment to the adapter with a title
     *
     * @param fragment is the fragment category to add
     * @param title is the title of the fragment to display in a {@link TabLayout}
     */
    public void addFragment(Fragment fragment, String title) {
        mFragments.add(fragment);
        mFragmentTitles.add(title);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitles.get(position);
    }
}