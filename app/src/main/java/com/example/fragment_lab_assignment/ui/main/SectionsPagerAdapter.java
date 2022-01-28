package com.example.fragment_lab_assignment.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.fragment_lab_assignment.ClaudeFrag;
import com.example.fragment_lab_assignment.CynthiaFrag;
import com.example.fragment_lab_assignment.GloriaFrag;
import com.example.fragment_lab_assignment.R;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_1, R.string.tab_text_2,R.string.tab_text_3};
    private final Context mContext;

    public SectionsPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
      Fragment fragment= null;
      switch(position){
          case 0:
              fragment= new ClaudeFrag();
              break;
              case 1:
          fragment = new CynthiaFrag();
          break;
          case 2:
              fragment =new GloriaFrag();
              break;

      }
      return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 3;
    }
}